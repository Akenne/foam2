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

// Minimal Stdlib, to be replaced

X.memoize1 = function(f) {
  /** Faster version of memoize() when only dealing with one argument. **/
  var cache = {};
  var g = function(arg) {
    var key = arg ? arg.toString() : '';
    if ( ! cache.hasOwnProperty(key) ) cache[key] = f.call(this, arg);
    return cache[key];
  };
  g.name = f.name;
  return g;
};

X.constantize = X.memoize1(function(str) {
  // switchFromCamelCaseToConstantFormat to SWITCH_FROM_CAMEL_CASE_TO_CONSTANT_FORMAT
  // TODO: add property to specify constantization. For now catch special case to avoid conflict with context this.X and this.Y.
  if ( str === 'x' ) return 'X_';
  if ( str === 'y' ) return 'Y_';
  if ( str === '$' ) return '$_';
  return str.replace(/[a-z][^0-9a-z_]/g, function(a) {
    return a.substring(0,1) + '_' + a.substring(1,2);
  }).toUpperCase();
});

// End of Stdlib
