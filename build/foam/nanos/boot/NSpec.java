// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.nanos.boot;


public class NSpec extends foam.core.AbstractFObject {
  private boolean lazyIsSet_ =     false;
;
  public static foam.core.PropertyInfo SERVICE_CLASS = new foam.core.AbstractStringPropertyInfo() {
      public String getName() {
        return "serviceClass";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public String get_(Object o) {
        return ((NSpec)o).getServiceClass();
      }
      public void set(Object o, Object value) {
        ((NSpec)o).setServiceClass(cast(value));
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
  private boolean idIsSet_ =     false;
;
  public static foam.core.PropertyInfo ID = new foam.core.AbstractObjectPropertyInfo() {
      public String getName() {
        return "id";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public Object get_(Object o) {
        return ((NSpec)o).getId();
      }
      public void set(Object o, Object value) {
        ((NSpec)o).setId(cast(value));
      }
      public Object cast(Object o) {
        return (Object)o;
      }
      public int compare(Object o1, Object o2) {
        return compareValues(get_(o1),get_(o2));
      }
      public foam.lib.parse.Parser jsonParser() {
        return new foam.lib.parse.Fail();
      }
      public boolean getTransient() {
        return true;
      }
      public boolean getRequired() {
        return false;
      }
    };
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
        return ((NSpec)o).getName();
      }
      public void set(Object o, Object value) {
        ((NSpec)o).setName(cast(value));
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
  private boolean lazy_;
  private Object id_;
  public static foam.core.PropertyInfo LAZY = new foam.core.AbstractBooleanPropertyInfo() {
      public String getName() {
        return "lazy";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public boolean get_(Object o) {
        return ((NSpec)o).getLazy();
      }
      public void set(Object o, Object value) {
        ((NSpec)o).setLazy(cast(value));
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
  private boolean serve_;
  private boolean serveIsSet_ =     false;
;
  public static foam.core.PropertyInfo SERVE = new foam.core.AbstractBooleanPropertyInfo() {
      public String getName() {
        return "serve";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public boolean get_(Object o) {
        return ((NSpec)o).getServe();
      }
      public void set(Object o, Object value) {
        ((NSpec)o).setServe(cast(value));
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
  private String serviceClass_;
  private boolean serviceClassIsSet_ =     false;
;
  private static final foam.core.ClassInfo classInfo_ = new foam.core.ClassInfoImpl()
    .setId("foam.nanos.boot.NSpec").setObjClass(foam.nanos.boot.NSpec.class)
    .addProperty(NSpec.ID)
    .addProperty(NSpec.NAME)
    .addProperty(NSpec.LAZY)
    .addProperty(NSpec.SERVE)
    .addProperty(NSpec.SERVICE_CLASS);
  public foam.core.ClassInfo getClassInfo() {
    return classInfo_;
  }
  public static foam.core.ClassInfo getOwnClassInfo() {
    return classInfo_;
  }
  public Object getId() {
    return getName();
  }
  public NSpec setId(Object val) {
    setName((String)val);
    return this;
  }
  public String getName() {
    if ( ! nameIsSet_ ) {
     return "";
    }
    return name_;
  }
  public NSpec setName(String val) {
    name_ = val;
    nameIsSet_ = true;
    return this;
  }
  public boolean getLazy() {
    if ( ! lazyIsSet_ ) {
     return true;
    }
    return lazy_;
  }
  public NSpec setLazy(boolean val) {
    lazy_ = val;
    lazyIsSet_ = true;
    return this;
  }
  public boolean getServe() {
    if ( ! serveIsSet_ ) {
     return false;
    }
    return serve_;
  }
  public NSpec setServe(boolean val) {
    serve_ = val;
    serveIsSet_ = true;
    return this;
  }
  public String getServiceClass() {
    if ( ! serviceClassIsSet_ ) {
     return "";
    }
    return serviceClass_;
  }
  public NSpec setServiceClass(String val) {
    serviceClass_ = val;
    serviceClassIsSet_ = true;
    return this;
  }
  public java.lang.Object createService() throws java.lang.ClassNotFoundException, java.lang.InstantiationException, java.lang.IllegalAccessException {
    return Class.forName(getServiceClass()).newInstance();
  }
}