// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.mlang.predicate;


public class Gt extends foam.mlang.predicate.Binary implements foam.core.Serializable {
  private static final foam.core.ClassInfo classInfo_ = new foam.core.ClassInfoImpl()
    .setId("foam.mlang.predicate.Gt").setObjClass(foam.mlang.predicate.Gt.class);
  public foam.core.ClassInfo getClassInfo() {
    return classInfo_;
  }
  public static foam.core.ClassInfo getOwnClassInfo() {
    return classInfo_;
  }
  public boolean f(foam.core.FObject obj) {
    return ((Comparable)getArg1().f(obj)).compareTo((Comparable)getArg2().f(obj)) > 0;
  }
}