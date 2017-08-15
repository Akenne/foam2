// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.nanos.auth;


public class Group extends foam.core.AbstractFObject implements foam.nanos.auth.EnabledAware {
  public static foam.core.PropertyInfo DESCRIPTION = new foam.core.AbstractStringPropertyInfo() {
      public String getName() {
        return "description";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public String get_(Object o) {
        return ((Group)o).getDescription();
      }
      public void set(Object o, Object value) {
        ((Group)o).setDescription(cast(value));
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
  public static foam.core.PropertyInfo PERMISSIONS = new foam.core.AbstractPropertyInfo() {
      public String getName() {
        return "permissions";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public foam.nanos.auth.Permission[] get_(Object o) {
        return ((Group)o).getPermissions();
      }
      public void set(Object o, Object value) {
        ((Group)o).setPermissions(cast(value));
      }
      public foam.nanos.auth.Permission[] cast(Object o) {
        Object[] value = (Object[])o;
        foam.nanos.auth.Permission[] ret = new foam.nanos.auth.Permission[value.length];
        System.arraycopy(value, 0, ret, 0, value.length);
        return ret;
      }
      public int compare(Object o1, Object o2) {
        
          foam.nanos.auth.Permission[] values1 = get_(o1);
          foam.nanos.auth.Permission[] values2 = get_(o2);
          if ( values1.length > values2.length ) return 1;
          if ( values1.length < values2.length ) return -1;
        
          int result;
          for ( int i = 0 ; i < values1.length ; i++ ) {
          result = ((Comparable)values1[i]).compareTo(values2[i]);
          if ( result != 0 ) return result;
          }
          return 0;
          
      }
      public foam.lib.parse.Parser jsonParser() {
        return new foam.lib.json.FObjectArrayParser();
      }
      public boolean getTransient() {
        return false;
      }
      public boolean getRequired() {
        return false;
      }
    };
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
        return ((Group)o).getId();
      }
      public void set(Object o, Object value) {
        ((Group)o).setId(cast(value));
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
  private String id_;
  private String parent_;
  private boolean parentIsSet_ =     false;
;
  public static foam.core.PropertyInfo PARENT = new foam.core.AbstractStringPropertyInfo() {
      public String getName() {
        return "parent";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public String get_(Object o) {
        return ((Group)o).getParent();
      }
      public void set(Object o, Object value) {
        ((Group)o).setParent(cast(value));
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
  private foam.nanos.auth.Permission[] permissions_;
  private boolean permissionsIsSet_ =     false;
;
  private static final foam.core.ClassInfo classInfo_ = new foam.core.ClassInfoImpl()
    .setId("foam.nanos.auth.Group").setObjClass(foam.nanos.auth.Group.class)
    .addProperty(Group.ID)
    .addProperty(Group.DESCRIPTION)
    .addProperty(Group.PARENT)
    .addProperty(Group.PERMISSIONS);
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
  public Group setId(String val) {
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
  public Group setDescription(String val) {
    description_ = val;
    descriptionIsSet_ = true;
    return this;
  }
  public String getParent() {
    if ( ! parentIsSet_ ) {
     return "";
    }
    return parent_;
  }
  public Group setParent(String val) {
    parent_ = val;
    parentIsSet_ = true;
    return this;
  }
  public foam.nanos.auth.Permission[] getPermissions() {
    if ( ! permissionsIsSet_ ) {
     return null;
    }
    return permissions_;
  }
  public Group setPermissions(foam.nanos.auth.Permission[] val) {
    permissions_ = val;
    permissionsIsSet_ = true;
    return this;
  }
  public Boolean implies(java.security.Permission permission) {
    if ( getPermissions() == null ) return false;
            for ( int i = 0 ; i < permissions_.length ; i++ ) {
              if ( new javax.security.auth.AuthPermission(permissions_[i].getId()).implies(permission) ) {
                return true;
              }
            }
            return false;
  }
}