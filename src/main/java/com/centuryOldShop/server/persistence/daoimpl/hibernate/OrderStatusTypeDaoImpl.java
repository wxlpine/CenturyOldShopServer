/***********************************************************************
 * Module:  OrderStatusTypeDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class OrderStatusType
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.OrderStatusType;
import com.centuryOldShop.server.persistence.OrderStatusTypePK;
import com.centuryOldShop.server.persistence.dao.OrderStatusTypeDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of OrderStatusTypeDao interface
 */

public class OrderStatusTypeDaoImpl extends HibernateDaoImpl implements OrderStatusTypeDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderStatusTypeDao#save(com.centuryOldShop.server.persistence.OrderStatusType)
     */
    @Override
    public Serializable save(OrderStatusType orderStatusTypeObject) throws DaoException {
        return super.save(orderStatusTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderStatusTypeDao#load(com.centuryOldShop.server.persistence.OrderStatusTypePK)
     */
    @Override
    public OrderStatusType load(OrderStatusTypePK pk) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        String[] paramNames = new String[]{"orderStatusType"};
        Object[] values = new Object[]{pk.getOrderStatusType()};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(OrderStatusType.class, cs);
        return (((list != null) && (list.size() > 0)) ? (OrderStatusType) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderStatusTypeDao#delete(com.centuryOldShop.server.persistence.OrderStatusType)
     */
    @Override
    public void delete(OrderStatusType orderStatusTypeObject) throws DaoException {
        super.delete(orderStatusTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderStatusTypeDao#update(com.centuryOldShop.server.persistence.OrderStatusType)
     */
    @Override
    public void update(OrderStatusType orderStatusTypeObject) throws DaoException {
        super.update(orderStatusTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderStatusTypeDao#saveOrUpdate(com.centuryOldShop.server.persistence.OrderStatusType)
     */
    @Override
    public void saveOrUpdate(OrderStatusType orderStatusTypeObject) throws DaoException {
        super.saveOrUpdate(orderStatusTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderStatusTypeDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.OrderStatusType)
     */
    @Override
    public List<OrderStatusType> queryByExample(OrderStatusType orderStatusTypeObject) throws DaoException {
        return super.queryByExample(OrderStatusType.class, orderStatusTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderStatusTypeDao#getOrderStatusTypeList()
     */
    @Override
    public List<OrderStatusType> getOrderStatusTypeList() throws DaoException {
        return super.loadAll(OrderStatusType.class);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderStatusTypeDao#getOrderStatusTypeList(int, int)
     */
    @Override
    public List<OrderStatusType> getOrderStatusTypeList(int firstResult, int maxResult) {
        return super.loadAll(OrderStatusType.class, firstResult, maxResult);
    }

}