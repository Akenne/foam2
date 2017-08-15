// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.mop;


public class ProxyMOP extends foam.core.AbstractFObject implements foam.mop.MOP {
  private foam.mop.MOP delegate_;
  private boolean delegateIsSet_ =     false;
;
  public static foam.core.PropertyInfo DELEGATE = new foam.core.AbstractFObjectPropertyInfo() {
      public String getName() {
        return "delegate";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public foam.mop.MOP get_(Object o) {
        return ((ProxyMOP)o).getDelegate();
      }
      public void set(Object o, Object value) {
        ((ProxyMOP)o).setDelegate(cast(value));
      }
      public foam.mop.MOP cast(Object o) {
        return (foam.mop.MOP)o;
      }
      public int compare(Object o1, Object o2) {
        return compareValues(get_(o1),get_(o2));
      }
      public foam.lib.parse.Parser jsonParser() {
        return new foam.lib.json.FObjectParser();
      }
      public boolean getTransient() {
        return false;
      }
      public boolean getRequired() {
        return false;
      }
    };
  private static final foam.core.ClassInfo classInfo_ = new foam.core.ClassInfoImpl()
    .setId("foam.mop.ProxyMOP").setObjClass(foam.mop.ProxyMOP.class)
    .addProperty(ProxyMOP.DELEGATE);
  public foam.core.ClassInfo getClassInfo() {
    return classInfo_;
  }
  public static foam.core.ClassInfo getOwnClassInfo() {
    return classInfo_;
  }
  public foam.mop.MOP getDelegate() {
    if ( ! delegateIsSet_ ) {
     return null;
    }
    return delegate_;
  }
  public ProxyMOP setDelegate(foam.mop.MOP val) {
    delegate_ = val;
    delegateIsSet_ = true;
    return this;
  }
  public foam.core.FObject get(foam.core.X x) {
    return getDelegate().get(x);
  }
  public foam.core.FObject setProperty(foam.core.X x, String name, Object value) {
    return getDelegate().setProperty(x, name, value);
  }
  public foam.core.FObject setProperties(foam.core.X x, java.util.Map values) {
    return getDelegate().setProperties(x, values);
  }
}