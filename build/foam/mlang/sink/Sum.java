// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.mlang.sink;


public class Sum extends foam.mlang.sink.AbstractUnarySink {
  private foam.mlang.Expr arg1_;
  private boolean arg1IsSet_ =     false;
;
  public static foam.core.PropertyInfo ARG1 = new foam.core.AbstractFObjectPropertyInfo() {
      public String getName() {
        return "arg1";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public foam.mlang.Expr get_(Object o) {
        return ((Sum)o).getArg1();
      }
      public void set(Object o, Object value) {
        ((Sum)o).setArg1(cast(value));
      }
      public foam.mlang.Expr cast(Object o) {
        return (foam.mlang.Expr)o;
      }
      public int compare(Object o1, Object o2) {
        return compareValues(get_(o1),get_(o2));
      }
      public foam.lib.parse.Parser jsonParser() {
        return new foam.lib.json.ExprParser();
      }
      public boolean getTransient() {
        return false;
      }
      public boolean getRequired() {
        return false;
      }
    };
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
        return ((Sum)o).getValue();
      }
      public void set(Object o, Object value) {
        ((Sum)o).setValue(cast(value));
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
    .setId("foam.mlang.sink.Sum").setObjClass(foam.mlang.sink.Sum.class)
    .addProperty(Sum.ARG1)
    .addProperty(Sum.VALUE);
  public foam.core.ClassInfo getClassInfo() {
    return classInfo_;
  }
  public static foam.core.ClassInfo getOwnClassInfo() {
    return classInfo_;
  }
  public foam.mlang.Expr getArg1() {
    if ( ! arg1IsSet_ ) {
     return null;
    }
    return arg1_;
  }
  public Sum setArg1(foam.mlang.Expr val) {
    arg1_ = val;
    arg1IsSet_ = true;
    return this;
  }
  public double getValue() {
    if ( ! valueIsSet_ ) {
     return 0;
    }
    return value_;
  }
  public Sum setValue(double val) {
    value_ = val;
    valueIsSet_ = true;
    return this;
  }
  public void put(foam.core.FObject obj, foam.core.Detachable sub) {
    setValue(getValue() + (double) this.arg1_.f(obj));
  }
}