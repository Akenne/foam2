// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.dao;


public class ProxyDAO extends foam.dao.AbstractDAO {
  private foam.dao.DAO delegate_;
  private boolean delegateIsSet_ =     false;
;
  public static foam.core.PropertyInfo DELEGATE = new foam.core.AbstractFObjectPropertyInfo() {
      public String getName() {
        return "delegate";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public foam.dao.DAO get_(Object o) {
        return ((ProxyDAO)o).getDelegate();
      }
      public void set(Object o, Object value) {
        ((ProxyDAO)o).setDelegate(cast(value));
      }
      public foam.dao.DAO cast(Object o) {
        return (foam.dao.DAO)o;
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
    .setId("foam.dao.ProxyDAO").setObjClass(foam.dao.ProxyDAO.class)
    .addProperty(ProxyDAO.DELEGATE);
  public foam.core.ClassInfo getClassInfo() {
    return classInfo_;
  }
  public static foam.core.ClassInfo getOwnClassInfo() {
    return classInfo_;
  }
  public foam.dao.DAO getDelegate() {
    if ( ! delegateIsSet_ ) {
     return null;
    }
    return delegate_;
  }
  public ProxyDAO setDelegate(foam.dao.DAO val) {
    delegate_ = val;
    delegateIsSet_ = true;
    return this;
  }
  public void listen_(foam.core.X x) {
    
  }
  public foam.core.FObject put_(foam.core.X x, foam.core.FObject obj) {
    return getDelegate().put_(x, obj);
  }
  public foam.core.FObject remove_(foam.core.X x, foam.core.FObject obj) {
    return getDelegate().remove_(x, obj);
  }
  public foam.core.FObject find_(foam.core.X x, Object id) {
    return getDelegate().find_(x, id);
  }
  public foam.dao.Sink select_(foam.core.X x, foam.dao.Sink sink, long skip, long limit, foam.mlang.order.Comparator order, foam.mlang.predicate.Predicate predicate) {
    return getDelegate().select_(x, sink, skip, limit, order, predicate);
  }
  public void removeAll_(foam.core.X x, long skip, long limit, foam.mlang.order.Comparator order, foam.mlang.predicate.Predicate predicate) {
    getDelegate().removeAll_(x, skip, limit, order, predicate);
  }
  public Object cmd_(foam.core.X x, Object obj) {
    return getDelegate().cmd_(x, obj);
  }
}