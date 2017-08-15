// WARNING: GENERATED CODE, DO NOT MODIFY BY HAND!
package foam.dao;


public interface DAO {
    public foam.core.FObject put(foam.core.FObject obj);

    public foam.core.FObject put_(foam.core.X x, foam.core.FObject obj);

    public foam.core.FObject remove(foam.core.FObject obj);

    public foam.core.FObject remove_(foam.core.X x, foam.core.FObject obj);

    public foam.core.FObject find(Object id);

    public foam.core.FObject find_(foam.core.X x, Object id);

    public foam.dao.Sink select(foam.dao.Sink sink);

    public foam.dao.Sink select_(foam.core.X x, foam.dao.Sink sink, long skip, long limit, foam.mlang.order.Comparator order, foam.mlang.predicate.Predicate predicate);

    public void removeAll();

    public void removeAll_(foam.core.X x, long skip, long limit, foam.mlang.order.Comparator order, foam.mlang.predicate.Predicate predicate);

    public void listen();

    public void listen_(foam.core.X x);

    public void pipe(foam.dao.Sink sink);

    public void pipe_(foam.core.X x, foam.dao.Sink sink);

    public foam.dao.DAO where(foam.mlang.predicate.Predicate predicate);

    public foam.dao.DAO orderBy(foam.mlang.order.Comparator comparator);

    public foam.dao.DAO skip(long count);

    public foam.dao.DAO limit(long count);

    public foam.dao.DAO inX(foam.core.X x);

    public Object cmd(Object obj);

    public Object cmd_(foam.core.X x, Object obj);

}