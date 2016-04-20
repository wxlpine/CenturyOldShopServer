/***********************************************************************
 * Module:  OrderFormDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class OrderForm
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.OrderForm;
import com.centuryOldShop.server.persistence.OrderFormPK;
import com.centuryOldShop.server.persistence.dao.OrderFormDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of OrderFormDao interface
 */

public class OrderFormDaoImpl extends HibernateDaoImpl implements OrderFormDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#save(com.centuryOldShop.server.persistence.OrderForm)
     */
    @Override
    public Serializable save(OrderForm orderFormObject) throws DaoException {
        return super.save(orderFormObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#load(com.centuryOldShop.server.persistence.OrderFormPK)
     */
    @Override
    public OrderForm load(OrderFormPK pk) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        String[] paramNames = new String[]{"orderFormId"};
        Object[] values = new Object[]{new Long(pk.getOrderFormId())};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(OrderForm.class, cs);
        return (((list != null) && (list.size() > 0)) ? (OrderForm) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#delete(com.centuryOldShop.server.persistence.OrderForm)
     */
    @Override
    public void delete(OrderForm orderFormObject) throws DaoException {
        super.delete(orderFormObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#update(com.centuryOldShop.server.persistence.OrderForm)
     */
    @Override
    public void update(OrderForm orderFormObject) throws DaoException {
        super.update(orderFormObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#saveOrUpdate(com.centuryOldShop.server.persistence.OrderForm)
     */
    @Override
    public void saveOrUpdate(OrderForm orderFormObject) throws DaoException {
        super.saveOrUpdate(orderFormObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.OrderForm)
     */
    @Override
    public List<OrderForm> queryByExample(OrderForm orderFormObject) throws DaoException {
        return super.queryByExample(OrderForm.class, orderFormObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#getOrderFormList()
     */
    @Override
    public List<OrderForm> getOrderFormList() throws DaoException {
        return super.loadAll(OrderForm.class);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#getOrderFormList(int, int)
     */
    @Override
    public List<OrderForm> getOrderFormList(int firstResult, int maxResult) {
        return super.loadAll(OrderForm.class, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#findByOrderedTime(java.util.Date)
     */
    @Override
    public List<OrderForm> findByOrderedTime(java.util.Date orderedTime) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("orderedTime", orderedTime));
        return super.findByCriterions(OrderForm.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#findByOrderedTime(java.util.Date, int, int)
     */
    @Override
    public List<OrderForm> findByOrderedTime(java.util.Date orderedTime, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("orderedTime", orderedTime));
        return super.findByCriterions(OrderForm.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#findByPayedTime(java.util.Date)
     */
    @Override
    public List<OrderForm> findByPayedTime(java.util.Date payedTime) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("payedTime", payedTime));
        return super.findByCriterions(OrderForm.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#findByPayedTime(java.util.Date, int, int)
     */
    @Override
    public List<OrderForm> findByPayedTime(java.util.Date payedTime, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("payedTime", payedTime));
        return super.findByCriterions(OrderForm.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#findBySendTime(java.util.Date)
     */
    @Override
    public List<OrderForm> findBySendTime(java.util.Date sendTime) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("sendTime", sendTime));
        return super.findByCriterions(OrderForm.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#findBySendTime(java.util.Date, int, int)
     */
    @Override
    public List<OrderForm> findBySendTime(java.util.Date sendTime, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("sendTime", sendTime));
        return super.findByCriterions(OrderForm.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#findByReceiptedTime(java.util.Date)
     */
    @Override
    public List<OrderForm> findByReceiptedTime(java.util.Date receiptedTime) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("receiptedTime", receiptedTime));
        return super.findByCriterions(OrderForm.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#findByReceiptedTime(java.util.Date, int, int)
     */
    @Override
    public List<OrderForm> findByReceiptedTime(java.util.Date receiptedTime, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("receiptedTime", receiptedTime));
        return super.findByCriterions(OrderForm.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#findByExpressNumber(java.lang.String)
     */
    @Override
    public List<OrderForm> findByExpressNumber(java.lang.String expressNumber) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("expressNumber", expressNumber));
        return super.findByCriterions(OrderForm.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#findByExpressNumber(java.lang.String, int, int)
     */
    @Override
    public List<OrderForm> findByExpressNumber(java.lang.String expressNumber, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("expressNumber", expressNumber));
        return super.findByCriterions(OrderForm.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#findByAppUser(com.centuryOldShop.server.persistence.AppUser)
     */
    @Override
    public List<OrderForm> findByAppUser(com.centuryOldShop.server.persistence.AppUser appUser) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("appUser", appUser));
        return super.findByCriterions(OrderForm.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#findByAppUser(com.centuryOldShop.server.persistence.AppUser, int, int)
     */
    @Override
    public List<OrderForm> findByAppUser(com.centuryOldShop.server.persistence.AppUser appUser, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("appUser", appUser));
        return super.findByCriterions(OrderForm.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#findByShop(com.centuryOldShop.server.persistence.Shop)
     */
    @Override
    public List<OrderForm> findByShop(com.centuryOldShop.server.persistence.Shop shop) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shop", shop));
        return super.findByCriterions(OrderForm.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#findByShop(com.centuryOldShop.server.persistence.Shop, int, int)
     */
    @Override
    public List<OrderForm> findByShop(com.centuryOldShop.server.persistence.Shop shop, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shop", shop));
        return super.findByCriterions(OrderForm.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#findByDiscountInfo(com.centuryOldShop.server.persistence.DiscountInfo)
     */
    @Override
    public List<OrderForm> findByDiscountInfo(com.centuryOldShop.server.persistence.DiscountInfo discountInfo) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("discountInfo", discountInfo));
        return super.findByCriterions(OrderForm.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#findByDiscountInfo(com.centuryOldShop.server.persistence.DiscountInfo, int, int)
     */
    @Override
    public List<OrderForm> findByDiscountInfo(com.centuryOldShop.server.persistence.DiscountInfo discountInfo, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("discountInfo", discountInfo));
        return super.findByCriterions(OrderForm.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#findByOrderStatusType(com.centuryOldShop.server.persistence.OrderStatusType)
     */
    @Override
    public List<OrderForm> findByOrderStatusType(com.centuryOldShop.server.persistence.OrderStatusType orderStatusType) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("orderStatusType", orderStatusType));
        return super.findByCriterions(OrderForm.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#findByOrderStatusType(com.centuryOldShop.server.persistence.OrderStatusType, int, int)
     */
    @Override
    public List<OrderForm> findByOrderStatusType(com.centuryOldShop.server.persistence.OrderStatusType orderStatusType, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("orderStatusType", orderStatusType));
        return super.findByCriterions(OrderForm.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#findByDisputeStatusType(com.centuryOldShop.server.persistence.DisputeStatusType)
     */
    @Override
    public List<OrderForm> findByDisputeStatusType(com.centuryOldShop.server.persistence.DisputeStatusType disputeStatusType) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("disputeStatusType", disputeStatusType));
        return super.findByCriterions(OrderForm.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.OrderFormDao#findByDisputeStatusType(com.centuryOldShop.server.persistence.DisputeStatusType, int, int)
     */
    @Override
    public List<OrderForm> findByDisputeStatusType(com.centuryOldShop.server.persistence.DisputeStatusType disputeStatusType, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("disputeStatusType", disputeStatusType));
        return super.findByCriterions(OrderForm.class, cs, firstResult, maxResult);
    }
}