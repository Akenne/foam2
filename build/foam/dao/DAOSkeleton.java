// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.dao;


public class DAOSkeleton extends foam.core.ContextAwareSupport implements foam.box.Box {
  private foam.dao.DAO delegate_;
  private boolean delegateIsSet_ =     false;
;
  public static foam.core.PropertyInfo DELEGATE = new foam.core.AbstractObjectPropertyInfo() {
      public String getName() {
        return "delegate";
      }
      public Object get(Object o) {
        return get_(o);
      }
      public foam.dao.DAO get_(Object o) {
        return ((DAOSkeleton)o).getDelegate();
      }
      public void set(Object o, Object value) {
        ((DAOSkeleton)o).setDelegate(cast(value));
      }
      public foam.dao.DAO cast(Object o) {
        return (foam.dao.DAO)o;
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
  public foam.dao.DAO getDelegate() {
    if ( ! delegateIsSet_ ) {
     return null;
    }
    return delegate_;
  }
  public DAOSkeleton setDelegate(foam.dao.DAO val) {
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
          case "put":
            result = getDelegate().put(
              (foam.core.FObject)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null));
            break;
        
          case "put_":
            result = getDelegate().put_(
              (foam.core.X)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null),
              (foam.core.FObject)(rpc.getArgs() != null && rpc.getArgs().length > 1 ? rpc.getArgs()[1] : null));
            break;
        
          case "remove":
            result = getDelegate().remove(
              (foam.core.FObject)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null));
            break;
        
          case "remove_":
            result = getDelegate().remove_(
              (foam.core.X)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null),
              (foam.core.FObject)(rpc.getArgs() != null && rpc.getArgs().length > 1 ? rpc.getArgs()[1] : null));
            break;
        
          case "find":
            result = getDelegate().find(
              (Object)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null));
            break;
        
          case "find_":
            result = getDelegate().find_(
              (foam.core.X)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null),
              (Object)(rpc.getArgs() != null && rpc.getArgs().length > 1 ? rpc.getArgs()[1] : null));
            break;
        
          case "select":
            result = getDelegate().select(
              (foam.dao.Sink)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null));
            break;
        
          case "select_":
            result = getDelegate().select_(
              (foam.core.X)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null),
              (foam.dao.Sink)(rpc.getArgs() != null && rpc.getArgs().length > 1 ? rpc.getArgs()[1] : null),
              (long)(rpc.getArgs() != null && rpc.getArgs().length > 2 ? rpc.getArgs()[2] : null),
              (long)(rpc.getArgs() != null && rpc.getArgs().length > 3 ? rpc.getArgs()[3] : null),
              (foam.mlang.order.Comparator)(rpc.getArgs() != null && rpc.getArgs().length > 4 ? rpc.getArgs()[4] : null),
              (foam.mlang.predicate.Predicate)(rpc.getArgs() != null && rpc.getArgs().length > 5 ? rpc.getArgs()[5] : null));
            break;
        
          case "removeAll":
            getDelegate().removeAll(
              );
            break;
        
          case "removeAll_":
            getDelegate().removeAll_(
              (foam.core.X)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null),
              (long)(rpc.getArgs() != null && rpc.getArgs().length > 1 ? rpc.getArgs()[1] : null),
              (long)(rpc.getArgs() != null && rpc.getArgs().length > 2 ? rpc.getArgs()[2] : null),
              (foam.mlang.order.Comparator)(rpc.getArgs() != null && rpc.getArgs().length > 3 ? rpc.getArgs()[3] : null),
              (foam.mlang.predicate.Predicate)(rpc.getArgs() != null && rpc.getArgs().length > 4 ? rpc.getArgs()[4] : null));
            break;
        
          case "listen":
            getDelegate().listen(
              );
            break;
        
          case "listen_":
            getDelegate().listen_(
              (foam.core.X)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null));
            break;
        
          case "pipe":
            getDelegate().pipe(
              (foam.dao.Sink)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null));
            break;
        
          case "pipe_":
            getDelegate().pipe_(
              (foam.core.X)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null),
              (foam.dao.Sink)(rpc.getArgs() != null && rpc.getArgs().length > 1 ? rpc.getArgs()[1] : null));
            break;
        
          case "where":
            result = getDelegate().where(
              (foam.mlang.predicate.Predicate)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null));
            break;
        
          case "orderBy":
            result = getDelegate().orderBy(
              (foam.mlang.order.Comparator)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null));
            break;
        
          case "skip":
            result = getDelegate().skip(
              (long)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null));
            break;
        
          case "limit":
            result = getDelegate().limit(
              (long)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null));
            break;
        
          case "inX":
            result = getDelegate().inX(
              (foam.core.X)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null));
            break;
        
          case "cmd":
            result = getDelegate().cmd(
              (Object)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null));
            break;
        
          case "cmd_":
            result = getDelegate().cmd_(
              (foam.core.X)(rpc.getArgs() != null && rpc.getArgs().length > 0 ? rpc.getArgs()[0] : null),
              (Object)(rpc.getArgs() != null && rpc.getArgs().length > 1 ? rpc.getArgs()[1] : null));
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