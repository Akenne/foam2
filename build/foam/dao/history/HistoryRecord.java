// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.dao.history;


public class HistoryRecord extends foam.core.AbstractFObject {
  public static foam.core.PropertyInfo OBJECT_ID = new foam.core.AbstractObjectPropertyInfo() {
      public String getName() {
        return "objectId";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public Object get_(Object o) {
        return ((HistoryRecord)o).getObjectId();
      }
      public void set(Object o, Object value) {
        ((HistoryRecord)o).setObjectId(cast(value));
      }
      public Object cast(Object o) {
        return (Object)o;
      }
      public int compare(Object o1, Object o2) {
        return compareValues(get_(o1),get_(o2));
      }
      public foam.lib.parse.Parser jsonParser() {
        return new foam.lib.json.AnyParser();
      }
      public boolean getTransient() {
        return false;
      }
      public boolean getRequired() {
        return false;
      }
    };
  public static foam.core.PropertyInfo UPDATES = new foam.core.AbstractPropertyInfo() {
      public String getName() {
        return "updates";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public foam.dao.history.PropertyUpdate[] get_(Object o) {
        return ((HistoryRecord)o).getUpdates();
      }
      public void set(Object o, Object value) {
        ((HistoryRecord)o).setUpdates(cast(value));
      }
      public foam.dao.history.PropertyUpdate[] cast(Object o) {
        Object[] value = (Object[])o;
        foam.dao.history.PropertyUpdate[] ret = new foam.dao.history.PropertyUpdate[value.length];
        System.arraycopy(value, 0, ret, 0, value.length);
        return ret;
      }
      public int compare(Object o1, Object o2) {
        
          foam.dao.history.PropertyUpdate[] values1 = get_(o1);
          foam.dao.history.PropertyUpdate[] values2 = get_(o2);
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
  public static foam.core.PropertyInfo ID = new foam.core.AbstractObjectPropertyInfo() {
      public String getName() {
        return "id";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public foam.core.CompoundKey get_(Object o) {
        return ((HistoryRecord)o).getId();
      }
      public void set(Object o, Object value) {
        ((HistoryRecord)o).setId(cast(value));
      }
      public foam.core.CompoundKey cast(Object o) {
        return (foam.core.CompoundKey)o;
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
  private long seqNo_;
  private boolean seqNoIsSet_ =     false;
;
  public static foam.core.PropertyInfo SEQ_NO = new foam.core.AbstractLongPropertyInfo() {
      public String getName() {
        return "seqNo";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public long get_(Object o) {
        return ((HistoryRecord)o).getSeqNo();
      }
      public void set(Object o, Object value) {
        ((HistoryRecord)o).setSeqNo(cast(value));
      }
      public long cast(Object o) {
        return ( o instanceof Number ) ?((Number)o).longValue() :(long)o;
      }
      public int compare(Object o1, Object o2) {
        return compareValues(get_(o1),get_(o2));
      }
      public foam.lib.parse.Parser jsonParser() {
        return new foam.lib.json.LongParser();
      }
      public boolean getTransient() {
        return false;
      }
      public boolean getRequired() {
        return false;
      }
    };
  private Object objectId_;
  private boolean objectIdIsSet_ =     false;
;
  private foam.core.CompoundKey id_;
  private String user_;
  private boolean userIsSet_ =     false;
;
  public static foam.core.PropertyInfo USER = new foam.core.AbstractStringPropertyInfo() {
      public String getName() {
        return "user";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public String get_(Object o) {
        return ((HistoryRecord)o).getUser();
      }
      public void set(Object o, Object value) {
        ((HistoryRecord)o).setUser(cast(value));
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
  private java.util.Date timestamp_;
  private boolean timestampIsSet_ =     false;
;
  public static foam.core.PropertyInfo TIMESTAMP = new foam.core.AbstractObjectPropertyInfo() {
      public String getName() {
        return "timestamp";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public java.util.Date get_(Object o) {
        return ((HistoryRecord)o).getTimestamp();
      }
      public void set(Object o, Object value) {
        ((HistoryRecord)o).setTimestamp(cast(value));
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
  private foam.dao.history.PropertyUpdate[] updates_;
  private boolean updatesIsSet_ =     false;
;
  private static final foam.core.ClassInfo classInfo_ = new foam.core.ClassInfoImpl()
    .setId("foam.dao.history.HistoryRecord").setObjClass(foam.dao.history.HistoryRecord.class)
    .addProperty(HistoryRecord.ID)
    .addProperty(HistoryRecord.SEQ_NO)
    .addProperty(HistoryRecord.OBJECT_ID)
    .addProperty(HistoryRecord.USER)
    .addProperty(HistoryRecord.TIMESTAMP)
    .addProperty(HistoryRecord.UPDATES);
  public foam.core.ClassInfo getClassInfo() {
    return classInfo_;
  }
  public static foam.core.ClassInfo getOwnClassInfo() {
    return classInfo_;
  }
  public foam.core.CompoundKey getId() {
    return new foam.core.CompoundKey(new Object[] {
      getObjectId(),
      getSeqNo()
    }, new foam.core.PropertyInfo[] {
      HistoryRecord.OBJECT_ID,
HistoryRecord.SEQ_NO
    });
  }
  public HistoryRecord setId(foam.core.CompoundKey val) {
    Object[] values = val.getValues();
    setObjectId((Object)values[0]);
    setSeqNo((long)values[1]);
    return this;
  }
  public long getSeqNo() {
    if ( ! seqNoIsSet_ ) {
     return 0;
    }
    return seqNo_;
  }
  public HistoryRecord setSeqNo(long val) {
    seqNo_ = val;
    seqNoIsSet_ = true;
    return this;
  }
  public Object getObjectId() {
    if ( ! objectIdIsSet_ ) {
     return null;
    }
    return objectId_;
  }
  public HistoryRecord setObjectId(Object val) {
    objectId_ = val;
    objectIdIsSet_ = true;
    return this;
  }
  public String getUser() {
    if ( ! userIsSet_ ) {
     return "";
    }
    return user_;
  }
  public HistoryRecord setUser(String val) {
    user_ = val;
    userIsSet_ = true;
    return this;
  }
  public java.util.Date getTimestamp() {
    if ( ! timestampIsSet_ ) {
     return null;
    }
    return timestamp_;
  }
  public HistoryRecord setTimestamp(java.util.Date val) {
    timestamp_ = val;
    timestampIsSet_ = true;
    return this;
  }
  public foam.dao.history.PropertyUpdate[] getUpdates() {
    if ( ! updatesIsSet_ ) {
     return null;
    }
    return updates_;
  }
  public HistoryRecord setUpdates(foam.dao.history.PropertyUpdate[] val) {
    updates_ = val;
    updatesIsSet_ = true;
    return this;
  }
}