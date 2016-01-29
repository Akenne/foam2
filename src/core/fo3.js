/**
 * @license
 * Copyright 2016 Google Inc. All Rights Reserved.
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

var GLOBAL = global || this;
var X = GLOBAL.X;

// Bootstrap Support, discarded after use
GLOBAL.Bootstrap = {

  // Temporary collection of classes to be updated later.
  classes: [],

  start: function() {
    GLOBAL.CLASS = GLOBAL.Bootstrap.CLASS.bind(GLOBAL.Bootstrap);
  },

  getClass: (function() {
    /*
      Create or Update a Prototype from a psedo-Model definition.
      'this' is a Model.
    */

    var AbstractClass = {
      proto: {},
      create: function(args) {
        var obj = Object.create(this.proto);
        obj.instance_ = {};

        // TODO: lookup if valid method names
        for ( var key in args ) obj[key] = args[key];

        return obj;
      },
      installAxiom: function(a) {
        a.installInClass && a.installInClass(this);
        a.installInProto && a.installInProto(this.proto);
      }
    };

    return function() {
      var cls = X[this.name];

      if ( ! cls ) {
        var parent = this.extends ? X[this.extends] : AbstractClass ;
        cls = Object.create(parent);
        cls.proto = Object.create(parent.proto);
        cls.proto.cls_ = cls;
        cls.name   = this.name;
        cls.model_ = this;
        X[cls.name] = cls;
      }

      var proto = cls.proto;

      if ( this.axioms )
        for ( var i = 0 ; i < this.axioms.length ; i++ )
          cls.installAxiom(this.axioms[i]);

      // TODO: combine with axioms
      if ( this.methods ) {
        for ( var i = 0 ; i < this.methods.length ; i++ ) {
          var meth = this.methods[i];
          proto[meth.name] = meth.code;
        }
      }

      // TODO: combine with axioms
      if ( X.Property && this.properties ) {
        for ( var i = 0 ; i < this.properties.length ; i++ ) {
          var p    = this.properties[i];
          var type = X[(p.type || '') + 'Property'] || X.Property;
          var axiom = type.create(p);
          cls.installAxiom(axiom);
        }
      }

      return cls;
    };
  })(),

  // Bootstrap Model definition which records incomplete models
  // so they can be patched at the end of the bootstrap process.
  CLASS: function(m) {
    this.classes.push(this.getClass.call(m));
  },

  end: function() {
    GLOBAL.CLASS = function(m) { return X.Model.create(m).getClass(); };

    for ( var i = 0 ; i < this.classes.length ; i++ )
      GLOBAL.CLASS(this.classes[i].model_);

    GLOBAL.Bootstrap = null;
    delete GLOBAL.Bootstrap;
  }
};


GLOBAL.Bootstrap.start();

CLASS({
  name: 'FObject',

  documentation: 'Base model for model hierarchy.',

  axioms: [
    {
      name: 'hasOwnProperty',
      installInProto: function(proto) {
        proto[this.name] = function(name) { return this.instance_.hasOwnProperty(name); }
      }
    }
  ]
});




CLASS({
  name: 'Model',
  extends: 'FObject', // Isn't the default yet.

  documentation: 'Class/Prototype description.',

  properties: [
    {
      name: 'name'
    },
    {
      name: 'extends',
      defaultValue: 'FObject'
    },
    {
      // type: 'Array',
      name: 'axioms',
      factory: function() { return []; }
    },
    {
      type: 'Array',
      subType: 'Property',
      name: 'properties',
      adaptArrayElement: function(o) {
        var cls = this.type ? X[this.type + 'Property'] : X.Property;
        return cls.create(o);
      }
    },
    {
      type: 'Array',
      subType: 'Method',
      name: 'methods',
      // TODO: this shouldn't be needed
      adapt: function(_, a, prop) {
        if ( ! a ) return [];
        return a.map(prop.adaptArrayElement.bind(prop));
      },
      adaptArrayElement: function(e) {
        if ( typeof e === 'function' ) {
          console.assert(e.name, 'Method must be named');
          return X.Method.create({name: e.name, code: e});
        }
        return e;
      }
    }
  ],

  methods: [
    {
      name: 'getClass',
      code: GLOBAL.Bootstrap.getClass
    }
  ]
});


CLASS({
  name: 'Property',
  extends: 'FObject',

  properties: [
    {
      name: 'name'
    },
    {
      name: 'type'
    },
    {
      name: 'defaultValue'
    },
    {
      name: 'factory'
    },
    {
      name: 'adapt'
    },
    {
      name: 'preSet'
    },
    {
      name: 'postSet'
    },
    {
      name: 'expression'
    }
  ],

  methods: [
    {
      name: 'installInClass',
      code: function(c) { c[X.constantize(this.name)] = this;
      }
    },
    {
      name: 'installInProto',
      code: function(proto) {
        /*
          Install a property onto a prototype from a Property definition.
          (Property is 'this').
        */
        var prop            = this;
        var name            = this.name;
        var adapt           = this.adapt
        var preSet          = this.preSet;
        var postSet         = this.postSet;
        var factory         = this.factory;
        var hasDefaultValue = this.hasOwnProperty('defaultValue');
        var defaultValue    = this.defaultValue;

        /* Future: needs events and slot support first.
           var slotName        = name + '$';
           Object.defineProperty(proto, slotName, {
           get: function propSlotGetter() {
           return this.getSlot(name);
           },
           set: function propSlotSetter(value) {
           value.link.link(this.getSlot(name));
           },
           configurable: true
           });
        */

        // TODO: implement 'expression'

        Object.defineProperty(proto, name, {
          get: prop.getter || function propGetter() {
            if ( ( hasDefaultValue || factory ) &&
                 ! this.instance_.hasOwnProperty(name) )
            {
              if ( hasDefaultValue ) return defaultValue;

              var value = factory.call(this);
              this.instance_[name] = value;
              return value;
            }

            return this.instance_[name];
          },
          set: prop.setter || function propSetter(newValue) {
            // TODO: add logic to not trigger factory
            var oldValue = this[name];

            if ( adapt )  newValue = adapt.call(this, oldValue, newValue, prop);

            if ( preSet ) newValue = preSet.call(this, oldValue, newValue, prop);

            this.instance_[name] = newValue;

            // TODO: fire property change event

            // TODO: call GLOBAL setter

            if ( postSet ) postSet.call(this, oldValue, newValue, prop);
          },
          configurable: true
        });
      }
    }
  ]
});


CLASS({
  name: 'Method',
  extends: 'FObject',

  properties: [
    {
      name: 'name'
    },
    {
      name: 'code'
    }
  ],

  methods: [
    {
      name: 'installInProto',
      code: function(proto) { proto[this.name] = this.code; }
    }
  ]
});


CLASS({
  name: 'StringProperty',
  extends: 'Property',

  properties: [
    {
      name: 'defaultValue',
      defaultValue: ''
    },
    {
      name: 'preSet',
      defaultValue: function(_, a) {
        return a ? a.toString() : '';
      }
    }
  ]
});


CLASS({
  name: 'ArrayProperty',
  extends: 'Property',

  properties: [
    {
      name: 'factory',
      defaultValue: function() { return []; }
    },
    {
      name: 'subType'
    },
    {
      name: 'preSet',
      defaultValue: function(_, a, prop) {
        var cls = X[prop.subType];
        // TODO: loop for performance
        return a.map(function(p) { return cls.create(p); });
      }
    },
    {
      name: 'adapt',
      defaultValue: function(_, a, prop) {
        if ( ! a ) return [];
        return a.map(prop.adaptArrayElement.bind(prop));
      }
    },
    {
      name: 'adaptArrayElement',
      defaultValue: function(o) {
        return X[this.subType].create(o);
      }
    }
  ]
});


GLOBAL.Bootstrap.end();

CLASS({
  name: 'FObject',

  methods: [
    {
      // TODO: not essential to be in bootstrap, move out
      name: 'clearProperty',
      code: function(name) { delete this.instance_[name]; }
    },
    {
      name: 'toString',
      code: function() {
        // Distinguish between prototypes and instances.
        return this.cls_.model_.name + (this.instance_ ? '' : 'Proto')
      }
    }
  ],

  // TODO: insert core/FObject.js functionality

  // TODO: insert EventService and PropertyChangeSupport here
});


CLASS({
  name: 'AxiomArrayProperty',
  extends: 'ArrayProperty',

  properties: [
    {
      name: 'postSet',
      defaultValue: function(_, a) {
        (this.axioms || (this.axioms = [])).push.apply(this.axioms, a); }
    }
  ]
});


CLASS({
  name: 'Constant',

  properties: [
    {
      name: 'name'
    },
    {
      name: 'value'
    }
  ],

  methods: [
    {
      name: 'installInClass',
      code: function(cls) { cls[X.constantize(this.name)] = this.value; }
    },
    {
      name: 'installInProto',
      code: function(proto) { proto[X.constantize(this.name)] = this.value; }
    }
  ]
});


CLASS({
  name: 'Model',

  properties: [
    {
      type: 'AxiomArray',
      subType: 'Constant',
      name: 'constants'
    }
  ]
});


/*
  Notes:

  remove create from regular objects
  acreate or afromJSON

  TODO:
  - property overriding
*/
