// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.nanos.auth;


public class Permission extends foam.core.AbstractFObject {
  private String id_;
  private boolean idIsSet_ =     false;
;
  public static foam.core.PropertyInfo ID = new foam.core.AbstractStringPropertyInfo() {
      public String getName() {
        return "id";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public String get_(Object o) {
        return ((Permission)o).getId();
      }
      public void set(Object o, Object value) {
        ((Permission)o).setId(cast(value));
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
  private String description_;
  private boolean descriptionIsSet_ =     false;
;
  public static foam.core.PropertyInfo DESCRIPTION = new foam.core.AbstractStringPropertyInfo() {
      public String getName() {
        return "description";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public String get_(Object o) {
        return ((Permission)o).getDescription();
      }
      public void set(Object o, Object value) {
        ((Permission)o).setDescription(cast(value));
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
  private static final foam.core.ClassInfo classInfo_ = new foam.core.ClassInfoImpl()
    .setId("foam.nanos.auth.Permission").setObjClass(foam.nanos.auth.Permission.class)
    .addProperty(Permission.ID)
    .addProperty(Permission.DESCRIPTION);
  public foam.core.ClassInfo getClassInfo() {
    return classInfo_;
  }
  public static foam.core.ClassInfo getOwnClassInfo() {
    return classInfo_;
  }
  public String getId() {
    if ( ! idIsSet_ ) {
     return "";
    }
    return id_;
  }
  public Permission setId(String val) {
    id_ = val;
    idIsSet_ = true;
    return this;
  }
  public String getDescription() {
    if ( ! descriptionIsSet_ ) {
     return "";
    }
    return description_;
  }
  public Permission setDescription(String val) {
    description_ = val;
    descriptionIsSet_ = true;
    return this;
  }
}