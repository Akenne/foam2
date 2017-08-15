// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.mlang.predicate;


public class Has extends foam.mlang.predicate.Unary implements foam.core.Serializable {
  private static final foam.core.ClassInfo classInfo_ = new foam.core.ClassInfoImpl()
    .setId("foam.mlang.predicate.Has").setObjClass(foam.mlang.predicate.Has.class);
  public foam.core.ClassInfo getClassInfo() {
    return classInfo_;
  }
  public static foam.core.ClassInfo getOwnClassInfo() {
    return classInfo_;
  }
  public boolean f(foam.core.FObject obj) {
    Object value = getArg1().f(obj);
            return ! (value == null ||
              (value instanceof String && ((String)value).length() == 0) ||
              (value.getClass().isArray() && java.lang.reflect.Array.getLength(value) == 0));
  }
}