// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.mlang.sink;


public class Min extends foam.mlang.sink.AbstractUnarySink {
  private Object value_;
  private boolean valueIsSet_ =     false;
;
  public static foam.core.PropertyInfo VALUE = new foam.core.AbstractObjectPropertyInfo() {
      public String getName() {
        return "value";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public Object get_(Object o) {
        return ((Min)o).getValue();
      }
      public void set(Object o, Object value) {
        ((Min)o).setValue(cast(value));
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
    .setId("foam.mlang.sink.Min").setObjClass(foam.mlang.sink.Min.class)
    .addProperty(Min.VALUE);
  public foam.core.ClassInfo getClassInfo() {
    return classInfo_;
  }
  public static foam.core.ClassInfo getOwnClassInfo() {
    return classInfo_;
  }
  public Object getValue() {
    if ( ! valueIsSet_ ) {
     return null;
    }
    return value_;
  }
  public Min setValue(Object val) {
    value_ = val;
    valueIsSet_ = true;
    return this;
  }
  public void put(foam.core.FObject obj, foam.core.Detachable sub) {
    if (obj.compareTo(this.getValue()) > 0) {
      this.setValue(obj);
    }
  }
}