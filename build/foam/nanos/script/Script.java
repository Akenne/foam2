// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.nanos.script;

import bsh.EvalError;
import bsh.Interpreter;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class Script extends foam.core.AbstractFObject implements foam.nanos.auth.EnabledAware {
  public static foam.core.PropertyInfo SCHEDULED = new foam.core.AbstractBooleanPropertyInfo() {
      public String getName() {
        return "scheduled";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public boolean get_(Object o) {
        return ((Script)o).getScheduled();
      }
      public void set(Object o, Object value) {
        ((Script)o).setScheduled(cast(value));
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
  public static foam.core.PropertyInfo NOTES = new foam.core.AbstractStringPropertyInfo() {
      public String getName() {
        return "notes";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public String get_(Object o) {
        return ((Script)o).getNotes();
      }
      public void set(Object o, Object value) {
        ((Script)o).setNotes(cast(value));
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
  public static foam.core.PropertyInfo ID = new foam.core.AbstractStringPropertyInfo() {
      public String getName() {
        return "id";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public String get_(Object o) {
        return ((Script)o).getId();
      }
      public void set(Object o, Object value) {
        ((Script)o).setId(cast(value));
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
  private java.util.Date lastRun_;
  private boolean lastRunIsSet_ =     false;
;
  public static foam.core.PropertyInfo LAST_RUN = new foam.core.AbstractObjectPropertyInfo() {
      public String getName() {
        return "lastRun";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public java.util.Date get_(Object o) {
        return ((Script)o).getLastRun();
      }
      public void set(Object o, Object value) {
        ((Script)o).setLastRun(cast(value));
      }
      public java.util.Date cast(Object o) {
        return (java.util.Date)o;
      }
      public int compare(Object o1, Object o2) {
        return compareValues(get_(o1),get_(o2));
      }
      public foam.lib.parse.Parser jsonParser() {
        return new foam.lib.json.DateParser();
      }
      public boolean getTransient() {
        return false;
      }
      public boolean getRequired() {
        return false;
      }
    };
  private boolean scheduled_;
  private boolean scheduledIsSet_ =     false;
;
  private String id_;
  private String code_;
  private boolean codeIsSet_ =     false;
;
  public static foam.core.PropertyInfo CODE = new foam.core.AbstractStringPropertyInfo() {
      public String getName() {
        return "code";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public String get_(Object o) {
        return ((Script)o).getCode();
      }
      public void set(Object o, Object value) {
        ((Script)o).setCode(cast(value));
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
  private String output_;
  private boolean outputIsSet_ =     false;
;
  public static foam.core.PropertyInfo OUTPUT = new foam.core.AbstractStringPropertyInfo() {
      public String getName() {
        return "output";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public String get_(Object o) {
        return ((Script)o).getOutput();
      }
      public void set(Object o, Object value) {
        ((Script)o).setOutput(cast(value));
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
  private String notes_;
  private boolean notesIsSet_ =     false;
;
  private static final foam.core.ClassInfo classInfo_ = new foam.core.ClassInfoImpl()
    .setId("foam.nanos.script.Script").setObjClass(foam.nanos.script.Script.class)
    .addProperty(Script.ID)
    .addProperty(Script.LAST_RUN)
    .addProperty(Script.SCHEDULED)
    .addProperty(Script.CODE)
    .addProperty(Script.OUTPUT)
    .addProperty(Script.NOTES);
  public foam.core.ClassInfo getClassInfo() {
    return classInfo_;
  }
  public static foam.core.ClassInfo getOwnClassInfo() {
    return classInfo_;
  }
  protected Object getScriptDAO() {
    return getX().get("scriptDAO");
  }
  public String getId() {
    if ( ! idIsSet_ ) {
     return "";
    }
    return id_;
  }
  public Script setId(String val) {
    id_ = val;
    idIsSet_ = true;
    return this;
  }
  public java.util.Date getLastRun() {
    if ( ! lastRunIsSet_ ) {
     return null;
    }
    return lastRun_;
  }
  public Script setLastRun(java.util.Date val) {
    lastRun_ = val;
    lastRunIsSet_ = true;
    return this;
  }
  public boolean getScheduled() {
    if ( ! scheduledIsSet_ ) {
     return false;
    }
    return scheduled_;
  }
  public Script setScheduled(boolean val) {
    scheduled_ = val;
    scheduledIsSet_ = true;
    return this;
  }
  public String getCode() {
    if ( ! codeIsSet_ ) {
     return "";
    }
    return code_;
  }
  public Script setCode(String val) {
    code_ = val;
    codeIsSet_ = true;
    return this;
  }
  public String getOutput() {
    if ( ! outputIsSet_ ) {
     return "";
    }
    return output_;
  }
  public Script setOutput(String val) {
    output_ = val;
    outputIsSet_ = true;
    return this;
  }
  public String getNotes() {
    if ( ! notesIsSet_ ) {
     return "";
    }
    return notes_;
  }
  public Script setNotes(String val) {
    notes_ = val;
    notesIsSet_ = true;
    return this;
  }
  public void runScript() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);
    Interpreter shell = new Interpreter();
    try {
      shell.set("currentScript", this);
      setOutput("");
      shell.setOut(ps);
      shell.eval(getCode());
    } catch (EvalError e) {
      e.printStackTrace();
    }
    
    setLastRun(new Date());
    ps.flush();
    setOutput(baos.toString());
    
  }
}