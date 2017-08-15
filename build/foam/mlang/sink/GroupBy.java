// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.mlang.sink;


public class GroupBy extends foam.dao.AbstractSink implements foam.core.Serializable {
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
        return ((GroupBy)o).getArg1();
      }
      public void set(Object o, Object value) {
        ((GroupBy)o).setArg1(cast(value));
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
  private foam.dao.Sink arg2_;
  private boolean arg2IsSet_ =     false;
;
  public static foam.core.PropertyInfo ARG2 = new foam.core.AbstractFObjectPropertyInfo() {
      public String getName() {
        return "arg2";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public foam.dao.Sink get_(Object o) {
        return ((GroupBy)o).getArg2();
      }
      public void set(Object o, Object value) {
        ((GroupBy)o).setArg2(cast(value));
      }
      public foam.dao.Sink cast(Object o) {
        return (foam.dao.Sink)o;
      }
      public int compare(Object o1, Object o2) {
        return compareValues(get_(o1),get_(o2));
      }
      public foam.lib.parse.Parser jsonParser() {
        return new foam.lib.json.FObjectParser(foam.core.FObject.class);
      }
      public boolean getTransient() {
        return false;
      }
      public boolean getRequired() {
        return false;
      }
    };
  private boolean processArrayValuesIndividually_;
  private boolean processArrayValuesIndividuallyIsSet_ =     false;
;
  public static foam.core.PropertyInfo PROCESS_ARRAY_VALUES_INDIVIDUALLY = new foam.core.AbstractBooleanPropertyInfo() {
      public String getName() {
        return "processArrayValuesIndividually";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public boolean get_(Object o) {
        return ((GroupBy)o).getProcessArrayValuesIndividually();
      }
      public void set(Object o, Object value) {
        ((GroupBy)o).setProcessArrayValuesIndividually(cast(value));
      }
      public boolean cast(Object o) {
        return (boolean)o;
      }
      public int compare(Object o1, Object o2) {
        return compareValues(get_(o1),get_(o2));
      }
      public foam.lib.parse.Parser jsonParser() {
        return new foam.lib.json.BooleanParser();
      }
      public boolean getTransient() {
        return false;
      }
      public boolean getRequired() {
        return false;
      }
    };
  private static final foam.core.ClassInfo classInfo_ = new foam.core.ClassInfoImpl()
    .setId("foam.mlang.sink.GroupBy").setObjClass(foam.mlang.sink.GroupBy.class)
    .addProperty(GroupBy.ARG1)
    .addProperty(GroupBy.ARG2)
    .addProperty(GroupBy.PROCESS_ARRAY_VALUES_INDIVIDUALLY);
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
  public GroupBy setArg1(foam.mlang.Expr val) {
    arg1_ = val;
    arg1IsSet_ = true;
    return this;
  }
  public foam.dao.Sink getArg2() {
    if ( ! arg2IsSet_ ) {
     return null;
    }
    return arg2_;
  }
  public GroupBy setArg2(foam.dao.Sink val) {
    arg2_ = val;
    arg2IsSet_ = true;
    return this;
  }
  public boolean getProcessArrayValuesIndividually() {
    if ( ! processArrayValuesIndividuallyIsSet_ ) {
     return false;
    }
    return processArrayValuesIndividually_;
  }
  public GroupBy setProcessArrayValuesIndividually(boolean val) {
    processArrayValuesIndividually_ = val;
    processArrayValuesIndividuallyIsSet_ = true;
    return this;
  }
  public void put(foam.core.FObject obj, foam.core.Detachable sub) {
    return;
  }
  public void eof() {
    return;
  }
}