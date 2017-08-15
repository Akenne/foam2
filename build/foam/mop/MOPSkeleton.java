// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.mop;


public class MOPSkeleton extends foam.core.ContextAwareSupport implements foam.box.Box {
  private foam.mop.MOP delegate_;
  private boolean delegateIsSet_ =     false;
;
  public static foam.core.PropertyInfo DELEGATE = new foam.core.AbstractObjectPropertyInfo() {
      public String getName() {
        return "delegate";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public foam.mop.MOP get_(Object o) {
        return ((MOPSkeleton)o).getDelegate();
      }
      public void set(Object o, Object value) {
        ((MOPSkeleton)o).setDelegate(cast(value));
      }
      public foam.mop.MOP cast(Object o) {
        return (foam.mop.MOP)o;
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
  public foam.mop.MOP getDelegate() {
    if ( ! delegateIsSet_ ) {
     return null;
    }
    return delegate_;
  }
  public MOPSkeleton setDelegate(foam.mop.MOP val) {
    delegate_ = val;
    delegateIsSet_ = true;
    return this;
  }
  public void send(foam.box.Message message) {
    if ( ! ( message.getObject() instanceof foam.box.RPCMessage) ) {
          // TODO error to errorBox
          return;
        }
    
        foam.box.RPCMessage rpc = (foam.box.RPCMessage)message.getObject();
        foam.box.Box replyBox = (foam.box.Box)message.getAttributes().get("replyBox");
        Object result = null;
    
        switch ( rpc.getName() ) {
          case "get":
            result = getDelegate().get(
              (foam.core.X)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null));
            break;
        
          case "setProperty":
            result = getDelegate().setProperty(
              (foam.core.X)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null),
              (String)(rpc.getArgs() != null && rpc.getArgs().length > 1 ? rpc.getArgs()[1] : null),
              (Object)(rpc.getArgs() != null && rpc.getArgs().length > 2 ? rpc.getArgs()[2] : null));
            break;
        
          case "setProperties":
            result = getDelegate().setProperties(
              (foam.core.X)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null),
              (java.util.Map)(rpc.getArgs() != null && rpc.getArgs().length > 1 ? rpc.getArgs()[1] : null));
            break;
        
          default: throw new RuntimeException("No such method found \"" + rpc.getName() + "\"");
        }
    
        if ( replyBox != null ) {
          foam.box.RPCReturnMessage reply = (foam.box.RPCReturnMessage)getX().create(foam.box.RPCReturnMessage.class);
          reply.setData(result);
    
          replyBox.send(getX().create(foam.box.Message.class).setObject(reply));
        }
  }
}