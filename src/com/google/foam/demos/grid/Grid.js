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

// http://www.discoversdk.com/blog/grid-control-with-different-javascript-frameworks

foam.CLASS({
  package: 'com.google.foam.demos.grid',
  name: 'Resource',

  tableProperties: [ 'description', 'url' ],

  properties: [
    { name: 'id', hidden: true },
    { name: 'description' },
    { name: 'url', label: 'URL' }
  ]
});


foam.CLASS({
  package: 'com.google.foam.demos.grid',
  name: 'ResourceView',
  extends: 'foam.u2.Element',

  imports: [ 'dao' ],

  properties: [ 'data' ],

  methods: [
    function initE() {
      this.
        start('tr').
          start('td').
            start('div').add(this.data.description).end().
          end().
          start('td').
            start('div').add(this.data.url).end().
          end().
          start('td').
            start(this.REMOVE_RESOURCE, { data: this }).end().
          end().
        end();
    }
  ],

  actions: [
    {
      name: 'removeResource',
      label: 'Remove',
      code: function() { this.dao.remove(this.data); }
    }
  ]
});


foam.CLASS({
  package: 'com.google.foam.demos.grid',
  name: 'Controller',
  extends: 'foam.u2.Controller',

  requires: [
    'foam.u2.DetailView',
    'foam.u2.TableView',
    'com.google.foam.demos.grid.Resource'
  ],

  exports: [ 'dao' ],

  axioms: [
    foam.u2.CSS.create({
      code: function() {/*
        .foam-u2.DetailView tr {
          background: pink;
        }
      */}
    })
  ],

  properties: [
    {
      name: 'dao',
       view: { class: 'foam.u2.TableView', of: com.google.foam.demos.grid.Resource }
//       view: { class: 'foam.u2.DAOList', of: com.google.foam.demos.grid.Resource, rowView: 'com.google.foam.demos.grid.ResourceView' }
    },
    {
      name: 'person',
      view: 'foam.u2.DetailView',
      factory: function() { return this.Resource.create(); }
    }
  ],

  methods: [
    function initE() {
      this.
        cssClass(this.myCls()). // TODO: needed?
        start('h3').add('Add Resources').end().

        // Use this block to have input in a single row
        add('Description: ').
        start(this.person.DESCRIPTION, {data$: this.person.description$}).end().
        add(' URL: ').
        start(this.person.URL,         {data$: this.person.url$}).end().

        // Or this line to appear in a property-sheet
        // add(this.PERSON).

        add(this.ADD_RESOURCE).
        start('h3').add('List of Resources').end().

      /*
        start('table').
          start('tr').
            start('th').add('Description').end().
            start('th').add('Resource').end().
          end().
          */
          add(this.DAO).
       // end().

        start('table').
          start('tr').
            start('th').add('Description').end().
            start('th').add('Resource').end().
          end().
          repeat(this.dao, function(r) {
            var e = this.
              start('tr').
                start('td').
                  start('div').add(r.description).end().
                end().
                start('td').
                  start('div').add(r.url).end().
                end().
                start('td').
                  start('button').on('click', function() { self.dao.remove(r); }).add('Remove').end().
                end().
              end();
          }).
       end().

        add(this.SHOW);
    }
  ],

  actions: [
    {
      name: 'addResource',
      label: 'Add',
      code: function() {
        var p = this.person;
        // TODO: remove clone()
        this.dao.put(p.clone());
        p.id = p.description = p.url = undefined;
      }
    },
    {
      name: 'show',
      code: function() {
        console.log('show');
        this.dao.select().then(function(s) {
          window.alert(foam.json.Outputer.create({
            pretty: false,
            outputClassNames: false
          }).stringify(s.a));
        });
      }
    },
    {
      name: 'deleteItem',
      label: 'Delete',
      code: function() {
      }
    }
  ]
});

// Didn't specify view for dao
// Didn't specify 'of' for TableView
// Invalid names in tableProperties:
// added invalid action name, no error
// clone on DAO.put