/**
 * @license
 * Copyright 2012 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* Indexed Memory-based DAO. */

foam.CLASS({
  extends: 'foam.dao.AbstractDAO',
  package: 'foam.dao',
  name: 'MDAO',
  label: 'Indexed DAO',
  requires: [
    'foam.core.Array',
    'foam.dao.ExternalException',
    'foam.dao.InternalException',
    'foam.dao.ObjectNotFoundException',
    'foam.mlang.predicate.Eq',
    'foam.dao.ArraySink',
    'foam.dao.index.TreeIndex',
    'foam.dao.index.AutoIndex',
    'foam.dao.index.ValueIndex',
    'foam.dao.index.AltIndex',
    'foam.dao.index.SetIndex',
    'foam.mlang.sink.Explain',
  ],
  properties: [
    {
      name:  'of',
      required: true
    },
    {
      class: 'Boolean',
      name: 'autoIndex',
      value: false
    },
    {
      name: 'idIndex',
    },
    {
      name: 'index',
    }
  ],

  methods: [

    function init() {
      // adds the primary key(s) as an index, and stores it for fast find().
      this.addIndex();
      this.idIndex = this.index;

      if ( this.autoIndex ) {
        this.addRawIndex(this.AutoIndex.create({ mdao: this }));
      }
    },

    /**
     * Add a non-unique index
     * args: one or more properties
     **/
    function addIndex() {
      var props = foam.Array.argsToArray(arguments);

      if ( ! this.of.ids ) {// throw "Undefined index"; // TODO: err?
        this.of.ids = ['id'];
      }

      // Add on the primary key(s) to make the index unique.
      for ( var i = 0 ; i < this.of.ids.length ; i++ ) {
        props.push(this.of.getAxiomByName(this.of.ids[i]));
        if ( ! props[props.length - 1] ) throw "Undefined index property"; // TODO: err
      }

      return this.addUniqueIndex.apply(this, props);
    },

    /**
     * Add a unique index
     * args: one or more properties
     **/
    function addUniqueIndex() {
      var index = this.ValueIndex.create();
      //var siFactory = proto;

      for ( var i = arguments.length-1 ; i >= 0 ; i-- ) {
        var prop = arguments[i];

        // TODO: the index prototype should be in the property
        var proto = this.Array.isInstance(prop) ?
          this.SetIndex  :
          this.TreeIndex ;
        index = proto.create({ prop: prop, tailFactory: index });
      }

      return this.addRawIndex(index);
    },

    // TODO: name 'addIndex' and renamed addIndex
    function addRawIndex(index) {
      if ( ! this.index ) {
        this.index = index;
        return this;
      }

      // Upgrade single Index to an AltIndex if required.
      if ( ! this.AltIndex.isInstance(this.index) ) {
        this.index = this.AltIndex.create({ delegates: [this.index] });
      }

      this.index.addIndex(index);

      return this;
    },

    /**
     * Bulk load data from another DAO.
     * Any data already loaded into this DAO will be lost.
     * @arg sink (optional) eof is called when loading is complete.
     **/
    function bulkLoad(dao) {
      var self = this;
      var sink = self.ArraySink.create();
      return dao.select(sink).then(function() {
        var a = sink.a;
        self.index.bulkLoad(a);
        for ( var i = 0; i < a.length; ++i ) {
          var obj = a[i];
        }
      });
    },

    function put(obj) {
      var oldValue = this.find(obj.id);
      if ( oldValue ) {
        this.index.remove(oldValue);
        this.index.put(obj);
      } else {
        this.index.put(obj);
      }
      this.pub('on', 'put', obj);
      return Promise.resolve(obj);
    },

    function find(key) {
      if ( key === undefined ) {
        return Promise.reject(this.InternalException.create({ id: key })); // TODO: err
      }
      
      if ( ! Array.isArray(key) ) key = [key];
      var index = this.idIndex;
      for ( var i = 0; i < key.length && index; ++i ) {
        index = index.get(key[i]);
      }
      if ( index && index.get() ) return Promise.resolve(index.get());
      
      return Promise.reject(this.ObjectNotFoundException.create({ id: key }));
      
      //var foundObj = null;
      //return this.findObj_(key);
      // TODO: How to handle multi value primary keys?
      // return new Promise(function(resolve, reject) {
//         self.where(self.Eq.create({ arg1: self.of.getAxiomByName(
//             ( self.of.ids && self.of.ids[0] ) || 'id' ), arg2: key })
//           ).limit(1).select({
//           put: function(obj) {
//             foundObj = obj;
//             resolve(obj);
//           },
//           eof: function() {
//             if ( ! foundObj ) {
//               reject(self.ObjectNotFoundException.create({ id: key })); // TODO: err
//             }
//           },
//           error: function(e) {
//             reject(self.InternalException.create({ id: key })); // TODO: err
//           }
//         });
//       });
    },

    function remove(obj) {
      if ( ! obj || ! obj.id ) {
        return Promise.reject(this.ExternalException.create({ id: 'no_id' })); // TODO: err
      }
      var id = obj.id;
      var self = this;

      return this.find(id).then(
        function(obj) {
          self.index.remove(obj);
          self.pub('on', 'remove', obj);
          return Promise.resolve();
        },
        function(err) {
          if ( self.ObjectNotFoundException.isInstance(err) ) {
            return Promise.resolve(); // not found error is actually ok
          } else {
            return Promise.reject(err);
          }
        }
      );
    },

    function removeAll(skip, limit, order, predicate) {
      if (!predicate) predicate = this.True;
      var self = this;
      return self.where(predicate).select(self.ArraySink.create()).then(
        function(sink) {
          var a = sink.a;
          for ( var i = 0 ; i < a.length ; i++ ) {
            self.index.remove(a[i]);
            self.pub('on', 'remove', a[i]);
          }
          return Promise.resolve();
        }
      );
    },

    function select(sink, skip, limit, order, predicate) {
      sink = sink || this.ArraySink.create();
      var plan;

      if ( this.Explain.isInstance(sink) ) {
        plan = this.index.plan(sink.arg1, skip, limit, order, predicate);
        sink.plan = 'cost: ' + plan.cost + ', ' + plan.toString();
        sink && sink.eof && sink.eof();
        return Promise.resolve(sink);
      }

      plan = this.index.plan(sink, skip, limit, order, predicate);

      var promise = [Promise.resolve()];
      plan.execute(promise, sink, skip, limit, order, predicate);
      return promise[0].then(
        function() {
          sink && sink.eof && sink.eof();
          return Promise.resolve(sink);
        },
        function(err) {
          sink && sink.error && sink.error(err);
          return Promise.reject(err);
        }
      );
    },

    function toString() {
      return 'MDAO(' + this.cls_.name + ',' + this.index + ')';
    }
  ]
});
