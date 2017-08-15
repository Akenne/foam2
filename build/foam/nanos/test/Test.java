// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.nanos.test;

import bsh.EvalError;
import bsh.Interpreter;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class Test extends foam.nanos.script.Script {
  private int passed_;
  private boolean passedIsSet_ =     false;
;
  public static foam.core.PropertyInfo PASSED = new foam.core.AbstractIntPropertyInfo() {
      public String getName() {
        return "passed";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public int get_(Object o) {
        return ((Test)o).getPassed();
      }
      public void set(Object o, Object value) {
        ((Test)o).setPassed(cast(value));
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
  private int failed_;
  private boolean failedIsSet_ =     false;
;
  public static foam.core.PropertyInfo FAILED = new foam.core.AbstractIntPropertyInfo() {
      public String getName() {
        return "failed";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public int get_(Object o) {
        return ((Test)o).getFailed();
      }
      public void set(Object o, Object value) {
        ((Test)o).setFailed(cast(value));
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
  private static final foam.core.ClassInfo classInfo_ = new foam.core.ClassInfoImpl()
    .setId("foam.nanos.test.Test").setObjClass(foam.nanos.test.Test.class)
    .addProperty(Test.PASSED)
    .addProperty(Test.FAILED);
  public foam.core.ClassInfo getClassInfo() {
    return classInfo_;
  }
  public static foam.core.ClassInfo getOwnClassInfo() {
    return classInfo_;
  }
  public int getPassed() {
    if ( ! passedIsSet_ ) {
     return 0;
    }
    return passed_;
  }
  public Test setPassed(int val) {
    passed_ = val;
    passedIsSet_ = true;
    return this;
  }
  public int getFailed() {
    if ( ! failedIsSet_ ) {
     return 0;
    }
    return failed_;
  }
  public Test setFailed(int val) {
    failed_ = val;
    failedIsSet_ = true;
    return this;
  }
  public void runScript() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);
    Interpreter shell = new Interpreter();
    
    try {
      shell.set("currentTest", this);
      setPassed(0);
      setFailed(0);
      setOutput("");
      shell.setOut(ps);
    
      // creates the testing method
      shell.eval("test(boolean exp, String message) { if ( exp ) { currentTest.setPassed(currentTest.getPassed()+1); } else currentTest.setFailed(currentTest.getFailed()+1); print((exp ? \"SUCCESS: \" : \"FAILURE: \")+message);}");
      shell.eval(getCode());
    } catch (EvalError e) {
      e.printStackTrace();
    }
    setLastRun(new Date());
    ps.flush();
    setOutput(baos.toString());
    setScheduled(false);
  }
}