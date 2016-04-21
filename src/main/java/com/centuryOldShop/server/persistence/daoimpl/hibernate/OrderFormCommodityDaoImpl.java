/***********************************************************************
 * Module:  OrderFormCommodityDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class OrderFormCommodity
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.OrderFormCommodity;
import com.centuryOldShop.server.persistence.OrderFormCommodityPK;
import com.centuryOldShop.server.persistence.dao.OrderFormCommodityDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of OrderFormCommodityDao interface
 */

public class OrderFormCommodityDaoImpl extends HibernateDaoImpl implements OrderFormCommodityDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormCommodityDao#save(com.centuryOldShop.server.persistence.OrderFormCommodity)
     */
    @Override
    public Serializable save(OrderFormCommodity orderFormCommodityObject) throws DaoException {
        return super.save(orderFormCommodityObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormCommodityDao#load(com.centuryOldShop.server.persistence.OrderFormCommodityPK)
     */
    @Override
    public OrderFormCommodity load(OrderFormCommodityPK pk) throws DaoException {
        List<Criterion> cs = new ArrayList<>();

        cs.add(Restrictions.idEq(pk));

        List list = super.findByCriterions(OrderFormCommodity.class, cs, null, null, null);
        return (((list != null) && (list.size() > 0)) ? (OrderFormCommodity) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormCommodityDao#delete(com.centuryOldShop.server.persistence.OrderFormCommodity)
     */
    @Override
    public void delete(OrderFormCommodity orderFormCommodityObject) throws DaoException {
        super.delete(orderFormCommodityObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormCommodityDao#update(com.centuryOldShop.server.persistence.OrderFormCommodity)
     */
    @Override
    public void update(OrderFormCommodity orderFormCommodityObject) throws DaoException {
        super.update(orderFormCommodityObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormCommodityDao#saveOrUpdate(com.centuryOldShop.server.persistence.OrderFormCommodity)
     */
    @Override
    public void saveOrUpdate(OrderFormCommodity orderFormCommodityObject) throws DaoException {
        super.saveOrUpdate(orderFormCommodityObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormCommodityDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.OrderFormCommodity)
     */
    @Override
    public List<OrderFormCommodity> queryByExample(OrderFormCommodity orderFormCommodityObject) throws DaoException {
        return super.queryByExample(OrderFormCommodity.class, orderFormCommodityObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormCommodityDao#getOrderFormCommodityList()
     */
    @Override
    public List<OrderFormCommodity> getOrderFormCommodityList() throws DaoException {
        return super.loadAll(OrderFormCommodity.class, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormCommodityDao#getOrderFormCommodityList(int, int)
     */
    @Override
    public List<OrderFormCommodity> getOrderFormCommodityList(int firstResult, int maxResult) {
        return super.loadAll(OrderFormCommodity.class, firstResult, maxResult, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormCommodityDao#findByBuyPrice(double)
     */
    @Override
    public List<OrderFormCommodity> findByBuyPrice(double buyPrice) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("buyPrice", new Double(buyPrice)));
        return super.findByCriterions(OrderFormCommodity.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormCommodityDao#findByBuyPrice(double, int, int)
     */
    @Override
    public List<OrderFormCommodity> findByBuyPrice(double buyPrice, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("buyPrice", new Double(buyPrice)));
        return super.findByCriterions(OrderFormCommodity.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormCommodityDao#findByBuyAmount(int)
     */
    @Override
    public List<OrderFormCommodity> findByBuyAmount(int buyAmount) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("buyAmount", new Integer(buyAmount)));
        return super.findByCriterions(OrderFormCommodity.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormCommodityDao#findByBuyAmount(int, int, int)
     */
    @Override
    public List<OrderFormCommodity> findByBuyAmount(int buyAmount, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("buyAmount", new Integer(buyAmount)));
        return super.findByCriterions(OrderFormCommodity.class, cs, null, firstResult, maxResult);
    }
}