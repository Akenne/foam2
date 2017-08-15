// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.mlang.sink;


public class Max extends foam.mlang.sink.AbstractUnarySink {
  private double value_;
  private boolean valueIsSet_ =     false;
;
  public static foam.core.PropertyInfo VALUE = new foam.core.AbstractDoublePropertyInfo() {
      public String getName() {
        return "value";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public double get_(Object o) {
        return ((Max)o).getValue();
      }
      public void set(Object o, Object value) {
        ((Max)o).setValue(cast(value));
      }
      public double cast(Object o) {
        return ( o instanceof Number ) ?((Number)o).doubleValue() :(double)o;
      }
      public int compare(Object o1, Object o2) {
        return compareValues(get_(o1),get_(o2));
      }
      public foam.lib.parse.Parser jsonParser() {
        return new foam.lib.json.FloatParser();
      }
      public boolean getTransient() {
        return false;
      }
      public boolean getRequired() {
        return false;
      }
    };
  private static final foam.core.ClassInfo classInfo_ = new foam.core.ClassInfoImpl()
    .setId("foam.mlang.sink.Max").setObjClass(foam.mlang.sink.Max.class)
    .addProperty(Max.VALUE);
  public foam.core.ClassInfo getClassInfo() {
    return classInfo_;
  }
  public static foam.core.ClassInfo getOwnClassInfo() {
    return classInfo_;
  }
  public double getValue() {
    if ( ! valueIsSet_ ) {
     return 0;
    }
    return value_;
  }
  public Max setValue(double val) {
    value_ = val;
    valueIsSet_ = true;
    return this;
  }
  public void put(foam.core.FObject obj, foam.core.Detachable sub) {
    setValue(Math.max(((Number) getArg1().f(obj)).doubleValue(), getValue()));
  }
}