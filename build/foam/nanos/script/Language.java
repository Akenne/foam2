// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.nanos.script;


public enum Language {
  JS(0,"Javascript"), BEANSHELL(1,"BeanShell");

  private int ordinal_;
  private boolean ordinalIsSet_ =     false;
;
  public static foam.core.PropertyInfo ORDINAL = new foam.core.AbstractIntPropertyInfo() {
      public String getName() {
        return "ordinal";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public int get_(Object o) {
        return ((Language)o).getOrdinal();
      }
      public void set(Object o, Object value) {
        ((Language)o).setOrdinal(cast(value));
      }
      public int cast(Object o) {
        return ( o instanceof Number ) ?((Number)o).intValue() :(int)o;
      }
      public int compare(Object o1, Object o2) {
        return compareValues(get_(o1),get_(o2));
      }
      public foam.lib.parse.Parser jsonParser() {
        return new foam.lib.json.IntParser();
      }
      public boolean getTransient() {
        return false;
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
        return ((Language)o).getName();
      }
      public void set(Object o, Object value) {
        ((Language)o).setName(cast(value));
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
  private String label_;
  private boolean labelIsSet_ =     false;
;
  public static foam.core.PropertyInfo LABEL = new foam.core.AbstractStringPropertyInfo() {
      public String getName() {
        return "label";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public String get_(Object o) {
        return ((Language)o).getLabel();
      }
      public void set(Object o, Object value) {
        ((Language)o).setLabel(cast(value));
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
  Language(int ordinal, String label) {
    setOrdinal(ordinal);
    setLabel(label);
    setName(name());
  }
  public static Language forOrdinal(int ordinal) {
    switch (ordinal) {
      case 0: return Language.JS;
      case 1: return Language.BEANSHELL;
    }
    return null;
  }
  public static Language forLabel(String label) {
    switch (label) {
      case "Javascript": return Language.JS;
      case "BeanShell": return Language.BEANSHELL;
    }
    return null;
  }
  public static String[] labels() {
    return new String[] { "Javascript", "BeanShell" };
  }
  public int getOrdinal() {
    if ( ! ordinalIsSet_ ) {
     return 0;
    }
    return ordinal_;
  }
  public Language setOrdinal(int val) {
    ordinal_ = val;
    ordinalIsSet_ = true;
    return this;
  }
  public String getName() {
    if ( ! nameIsSet_ ) {
     return "";
    }
    return name_;
  }
  public Language setName(String val) {
    name_ = val;
    nameIsSet_ = true;
    return this;
  }
  public String getLabel() {
    if ( ! labelIsSet_ ) {
     return "";
    }
    return label_;
  }
  public Language setLabel(String val) {
    label_ = val;
    labelIsSet_ = true;
    return this;
  }
}