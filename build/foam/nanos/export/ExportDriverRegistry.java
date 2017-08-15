// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.nanos.export;


public class ExportDriverRegistry extends foam.core.AbstractFObject {
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
        return ((ExportDriverRegistry)o).getId();
      }
      public void set(Object o, Object value) {
        ((ExportDriverRegistry)o).setId(cast(value));
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
  private String driverName_;
  private boolean driverNameIsSet_ =     false;
;
  public static foam.core.PropertyInfo DRIVER_NAME = new foam.core.AbstractStringPropertyInfo() {
      public String getName() {
        return "driverName";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public String get_(Object o) {
        return ((ExportDriverRegistry)o).getDriverName();
      }
      public void set(Object o, Object value) {
        ((ExportDriverRegistry)o).setDriverName(cast(value));
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
  private String targetModel_;
  private boolean targetModelIsSet_ =     false;
;
  public static foam.core.PropertyInfo TARGET_MODEL = new foam.core.AbstractStringPropertyInfo() {
      public String getName() {
        return "targetModel";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public String get_(Object o) {
        return ((ExportDriverRegistry)o).getTargetModel();
      }
      public void set(Object o, Object value) {
        ((ExportDriverRegistry)o).setTargetModel(cast(value));
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
    .setId("foam.nanos.export.ExportDriverRegistry").setObjClass(foam.nanos.export.ExportDriverRegistry.class)
    .addProperty(ExportDriverRegistry.ID)
    .addProperty(ExportDriverRegistry.DRIVER_NAME)
    .addProperty(ExportDriverRegistry.TARGET_MODEL);
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
  public ExportDriverRegistry setId(String val) {
    id_ = val;
    idIsSet_ = true;
    return this;
  }
  public String getDriverName() {
    if ( ! driverNameIsSet_ ) {
     return "";
    }
    return driverName_;
  }
  public ExportDriverRegistry setDriverName(String val) {
    driverName_ = val;
    driverNameIsSet_ = true;
    return this;
  }
  public String getTargetModel() {
    if ( ! targetModelIsSet_ ) {
     return "";
    }
    return targetModel_;
  }
  public ExportDriverRegistry setTargetModel(String val) {
    targetModel_ = val;
    targetModelIsSet_ = true;
    return this;
  }
}