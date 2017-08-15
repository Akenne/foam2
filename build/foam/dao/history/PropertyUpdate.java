// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.dao.history;


public class PropertyUpdate extends foam.core.AbstractFObject {
  private String name_;
  private boolean nameIsSet_ =     false;
;
  public static foam.core.PropertyInfo NAME = new foam.core.AbstractStringPropertyInfo() {
      public String getName() {
        return "name";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public String get_(Object o) {
        return ((PropertyUpdate)o).getName();
      }
      public void set(Object o, Object value) {
        ((PropertyUpdate)o).setName(cast(value));
      }
      public String cast(Object o) {
        return (String)o;
      }
      public int compare(Object o1, Object o2) {
        return compareValues(get_(o1),get_(o2));
      }
      public foam.lib.parse.Parser jsonParser() {
        return new foam.lib.json.StringParser();
      }
      public boolean getTransient() {
        return false;
      }
      public boolean getRequired() {
        return false;
      }
      public int getWidth() {
        return 30;
      }
    };
  private Object oldValue_;
  private boolean oldValueIsSet_ =     false;
;
  public static foam.core.PropertyInfo OLD_VALUE = new foam.core.AbstractObjectPropertyInfo() {
      public String getName() {
        return "oldValue";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public Object get_(Object o) {
        return ((PropertyUpdate)o).getOldValue();
      }
      public void set(Object o, Object value) {
        ((PropertyUpdate)o).setOldValue(cast(value));
      }
      public Object cast(Object o) {
        return (Object)o;
      }
      public int compare(Object o1, Object o2) {
        return compareValues(get_(o1),get_(o2));
      }
      public foam.lib.parse.Parser jsonParser() {
        return new foam.lib.json.AnyParser();
      }
      public boolean getTransient() {
        return false;
      }
      public boolean getRequired() {
        return false;
      }
    };
  private Object newValue_;
  private boolean newValueIsSet_ =     false;
;
  public static foam.core.PropertyInfo NEW_VALUE = new foam.core.AbstractObjectPropertyInfo() {
      public String getName() {
        return "newValue";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public Object get_(Object o) {
        return ((PropertyUpdate)o).getNewValue();
      }
      public void set(Object o, Object value) {
        ((PropertyUpdate)o).setNewValue(cast(value));
      }
      public Object cast(Object o) {
        return (Object)o;
      }
      public int compare(Object o1, Object o2) {
        return compareValues(get_(o1),get_(o2));
      }
      public foam.lib.parse.Parser jsonParser() {
        return new foam.lib.json.AnyParser();
      }
      public boolean getTransient() {
        return false;
      }
      public boolean getRequired() {
        return false;
      }
    };
  private static final foam.core.ClassInfo classInfo_ = new foam.core.ClassInfoImpl()
    .setId("foam.dao.history.PropertyUpdate").setObjClass(foam.dao.history.PropertyUpdate.class)
    .addProperty(PropertyUpdate.NAME)
    .addProperty(PropertyUpdate.OLD_VALUE)
    .addProperty(PropertyUpdate.NEW_VALUE);
  public foam.core.ClassInfo getClassInfo() {
    return classInfo_;
  }
  public static foam.core.ClassInfo getOwnClassInfo() {
    return classInfo_;
  }
  public String getName() {
    if ( ! nameIsSet_ ) {
     return "";
    }
    return name_;
  }
  public PropertyUpdate setName(String val) {
    name_ = val;
    nameIsSet_ = true;
    return this;
  }
  public Object getOldValue() {
    if ( ! oldValueIsSet_ ) {
     return null;
    }
    return oldValue_;
  }
  public PropertyUpdate setOldValue(Object val) {
    oldValue_ = val;
    oldValueIsSet_ = true;
    return this;
  }
  public Object getNewValue() {
    if ( ! newValueIsSet_ ) {
     return null;
    }
    return newValue_;
  }
  public PropertyUpdate setNewValue(Object val) {
    newValue_ = val;
    newValueIsSet_ = true;
    return this;
  }
}