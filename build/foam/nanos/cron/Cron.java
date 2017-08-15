// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.nanos.cron;

import java.util.Date;
import java.util.Calendar;

public class Cron extends foam.nanos.script.Script {
  public static foam.core.PropertyInfo DAY_OF_MONTH = new foam.core.AbstractIntPropertyInfo() {
      public String getName() {
        return "dayOfMonth";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public int get_(Object o) {
        return ((Cron)o).getDayOfMonth();
      }
      public void set(Object o, Object value) {
        ((Cron)o).setDayOfMonth(cast(value));
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
  public static foam.core.PropertyInfo SCHEDULED_TIME = new foam.core.AbstractObjectPropertyInfo() {
      public String getName() {
        return "scheduledTime";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public java.util.Date get_(Object o) {
        return ((Cron)o).getScheduledTime();
      }
      public void set(Object o, Object value) {
        ((Cron)o).setScheduledTime(cast(value));
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
  private boolean minuteIsSet_ =     false;
;
  public static foam.core.PropertyInfo MINUTE = new foam.core.AbstractIntPropertyInfo() {
      public String getName() {
        return "minute";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public int get_(Object o) {
        return ((Cron)o).getMinute();
      }
      public void set(Object o, Object value) {
        ((Cron)o).setMinute(cast(value));
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
  private int hour_;
  private boolean hourIsSet_ =     false;
;
  public static foam.core.PropertyInfo HOUR = new foam.core.AbstractIntPropertyInfo() {
      public String getName() {
        return "hour";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public int get_(Object o) {
        return ((Cron)o).getHour();
      }
      public void set(Object o, Object value) {
        ((Cron)o).setHour(cast(value));
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
  private int dayOfMonth_;
  private boolean dayOfMonthIsSet_ =     false;
;
  private int minute_;
  private int month_;
  private boolean monthIsSet_ =     false;
;
  public static foam.core.PropertyInfo MONTH = new foam.core.AbstractIntPropertyInfo() {
      public String getName() {
        return "month";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public int get_(Object o) {
        return ((Cron)o).getMonth();
      }
      public void set(Object o, Object value) {
        ((Cron)o).setMonth(cast(value));
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
  private int dayOfWeek_;
  private boolean dayOfWeekIsSet_ =     false;
;
  public static foam.core.PropertyInfo DAY_OF_WEEK = new foam.core.AbstractIntPropertyInfo() {
      public String getName() {
        return "dayOfWeek";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public int get_(Object o) {
        return ((Cron)o).getDayOfWeek();
      }
      public void set(Object o, Object value) {
        ((Cron)o).setDayOfWeek(cast(value));
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
  private java.util.Date scheduledTime_;
  private boolean scheduledTimeIsSet_ =     false;
;
  private static final foam.core.ClassInfo classInfo_ = new foam.core.ClassInfoImpl()
    .setId("foam.nanos.cron.Cron").setObjClass(foam.nanos.cron.Cron.class)
    .addProperty(Cron.MINUTE)
    .addProperty(Cron.HOUR)
    .addProperty(Cron.DAY_OF_MONTH)
    .addProperty(Cron.MONTH)
    .addProperty(Cron.DAY_OF_WEEK)
    .addProperty(Cron.SCHEDULED_TIME);
  public foam.core.ClassInfo getClassInfo() {
    return classInfo_;
  }
  public static foam.core.ClassInfo getOwnClassInfo() {
    return classInfo_;
  }
  public int getMinute() {
    if ( ! minuteIsSet_ ) {
     return -1;
    }
    return minute_;
  }
  public Cron setMinute(int val) {
    minute_ = val;
    minuteIsSet_ = true;
    return this;
  }
  public int getHour() {
    if ( ! hourIsSet_ ) {
     return -1;
    }
    return hour_;
  }
  public Cron setHour(int val) {
    hour_ = val;
    hourIsSet_ = true;
    return this;
  }
  public int getDayOfMonth() {
    if ( ! dayOfMonthIsSet_ ) {
     return -1;
    }
    return dayOfMonth_;
  }
  public Cron setDayOfMonth(int val) {
    dayOfMonth_ = val;
    dayOfMonthIsSet_ = true;
    return this;
  }
  public int getMonth() {
    if ( ! monthIsSet_ ) {
     return -1;
    }
    return month_;
  }
  public Cron setMonth(int val) {
    month_ = val;
    monthIsSet_ = true;
    return this;
  }
  public int getDayOfWeek() {
    if ( ! dayOfWeekIsSet_ ) {
     return -1;
    }
    return dayOfWeek_;
  }
  public Cron setDayOfWeek(int val) {
    dayOfWeek_ = val;
    dayOfWeekIsSet_ = true;
    return this;
  }
  public java.util.Date getScheduledTime() {
    if ( ! scheduledTimeIsSet_ ) {
      setScheduledTime(ScheduledTimeFactory_());
    }
    return scheduledTime_;
  }
  public Cron setScheduledTime(java.util.Date val) {
    scheduledTime_ = val;
    scheduledTimeIsSet_ = true;
    return this;
  }
  protected java.util.Date ScheduledTimeFactory_() {
    return getNextScheduledTime();
  }
  public void runScript() {
    super.runScript();
    setScheduledTime(getNextScheduledTime());
  }
  public Date getNextScheduledTime() {
    Calendar next = Calendar.getInstance();
    next.add(Calendar.MINUTE, 1);
    next.set(Calendar.MILLISECOND, 0);
    next.set(Calendar.SECOND, 0);
    
    boolean dateFound = false;
    while ( next.get(Calendar.YEAR) < 3000 ) {
      if ( getMonth() >= 0 && next.get(Calendar.MONTH) != getMonth() - 1 ) {
        next.add(Calendar.MONTH, 1);
        next.set(Calendar.DAY_OF_MONTH, 1);
        next.set(Calendar.HOUR_OF_DAY, 0);
        next.set(Calendar.MINUTE, 0);
        continue;
      }
      if ( ( getDayOfMonth() >= 0 && next.get(Calendar.DAY_OF_MONTH) != getDayOfMonth() ) ||
          ( getDayOfWeek() >= 0 && next.get(Calendar.DAY_OF_WEEK) != getDayOfWeek() + 1) ) {
        next.add(Calendar.DAY_OF_MONTH, 1);
        next.set(Calendar.HOUR_OF_DAY, 0);
        next.set(Calendar.MINUTE, 0);
        continue;
      }
      if ( getHour() >= 0 && next.get(Calendar.HOUR_OF_DAY) != getHour() ) {
        next.add(Calendar.HOUR_OF_DAY, 1);
        next.set(Calendar.MINUTE, 0);
        continue;
      }
      if ( getMinute() >= 0 && next.get(Calendar.MINUTE) != getMinute() ) {
        next.add(Calendar.MINUTE, 1);
        continue;
      }
      dateFound = true;
      break;
    }
    if ( !dateFound ) {
      throw new IllegalArgumentException("Unable to get next scheduled time");
    }
    return next.getTime();
  }
}