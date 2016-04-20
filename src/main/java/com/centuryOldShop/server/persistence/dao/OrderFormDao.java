/***********************************************************************
 * Module:  OrderFormDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class OrderForm
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.OrderForm;
import com.centuryOldShop.server.persistence.OrderFormPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class OrderForm
 */
public interface OrderFormDao extends Dao {

    /**
     * Save <Code>OrderForm</Code> instance
     *
     * @param orderFormObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(OrderForm orderFormObject) throws DaoException;

    /**
     * Load <Code>OrderForm</Code> instance by primary key
     *
     * @param pk
     * @return <Code>OrderForm</Code> instance
     * @throws DaoException
     */
    public OrderForm load(OrderFormPK pk) throws DaoException;

    /**
     * Delete <Code>OrderForm</Code> instance from persistence store
     *
     * @param orderFormObject
     * @throws DaoException
     */
    public void delete(OrderForm orderFormObject) throws DaoException;

    /**
     * Update <Code>OrderForm</Code> instance to persistence store
     *
     * @param orderFormObject
     * @throws DaoException
     */
    public void update(OrderForm orderFormObject) throws DaoException;

    /**
     * Save or update <Code>OrderForm</Code> instance to persistence store
     *
     * @param orderFormObject
     * @throws DaoException
     */
    public void saveOrUpdate(OrderForm orderFormObject) throws DaoException;

    /**
     * Get all <Code>OrderForm</Code> instances from persistence store
     *
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> getOrderFormList() throws DaoException;

    /**
     * Get all <Code>OrderForm</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> getOrderFormList(int firstResult, int maxResult);

    /**
     * Query <Code>OrderForm</Code> instances by example instance
     *
     * @param orderFormObject example instance
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> queryByExample(OrderForm orderFormObject) throws DaoException;

    /**
     * Find <Code>OrderForm</Code> instances from persistence store by orderedTime
     *
     * @param orderedTime
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> findByOrderedTime(java.util.Date orderedTime) throws DaoException;

    /**
     * Find <Code>OrderForm</Code> instances in range firstResult, maxResult
     * from persistence store by field orderedTime
     *
     * @param orderedTime
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> findByOrderedTime(java.util.Date orderedTime, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>OrderForm</Code> instances from persistence store by payedTime
     *
     * @param payedTime
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> findByPayedTime(java.util.Date payedTime) throws DaoException;

    /**
     * Find <Code>OrderForm</Code> instances in range firstResult, maxResult
     * from persistence store by field payedTime
     *
     * @param payedTime
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> findByPayedTime(java.util.Date payedTime, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>OrderForm</Code> instances from persistence store by sendTime
     *
     * @param sendTime
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> findBySendTime(java.util.Date sendTime) throws DaoException;

    /**
     * Find <Code>OrderForm</Code> instances in range firstResult, maxResult
     * from persistence store by field sendTime
     *
     * @param sendTime
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> findBySendTime(java.util.Date sendTime, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>OrderForm</Code> instances from persistence store by receiptedTime
     *
     * @param receiptedTime
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> findByReceiptedTime(java.util.Date receiptedTime) throws DaoException;

    /**
     * Find <Code>OrderForm</Code> instances in range firstResult, maxResult
     * from persistence store by field receiptedTime
     *
     * @param receiptedTime
     * @param firstResult   first result to return
     * @param maxResult     max result to return
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> findByReceiptedTime(java.util.Date receiptedTime, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>OrderForm</Code> instances from persistence store by expressNumber
     *
     * @param expressNumber
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> findByExpressNumber(java.lang.String expressNumber) throws DaoException;

    /**
     * Find <Code>OrderForm</Code> instances in range firstResult, maxResult
     * from persistence store by field expressNumber
     *
     * @param expressNumber
     * @param firstResult   first result to return
     * @param maxResult     max result to return
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> findByExpressNumber(java.lang.String expressNumber, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>OrderForm</Code> instances from persistence store by AppUser
     *
     * @param appUser
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> findByAppUser(com.centuryOldShop.server.persistence.AppUser appUser) throws DaoException;

    /**
     * Find <Code>OrderForm</Code> instances  instances in range firstResult, maxResult
     * from persistence store by AppUser
     *
     * @param appUser
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> findByAppUser(com.centuryOldShop.server.persistence.AppUser appUser, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>OrderForm</Code> instances from persistence store by Shop
     *
     * @param shop
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> findByShop(com.centuryOldShop.server.persistence.Shop shop) throws DaoException;

    /**
     * Find <Code>OrderForm</Code> instances  instances in range firstResult, maxResult
     * from persistence store by Shop
     *
     * @param shop
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> findByShop(com.centuryOldShop.server.persistence.Shop shop, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>OrderForm</Code> instances from persistence store by DiscountInfo
     *
     * @param discountInfo
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> findByDiscountInfo(com.centuryOldShop.server.persistence.DiscountInfo discountInfo) throws DaoException;

    /**
     * Find <Code>OrderForm</Code> instances  instances in range firstResult, maxResult
     * from persistence store by DiscountInfo
     *
     * @param discountInfo
     * @param firstResult  first result to return
     * @param maxResult    max result to return
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> findByDiscountInfo(com.centuryOldShop.server.persistence.DiscountInfo discountInfo, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>OrderForm</Code> instances from persistence store by OrderStatusType
     *
     * @param orderStatusType
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> findByOrderStatusType(com.centuryOldShop.server.persistence.OrderStatusType orderStatusType) throws DaoException;

    /**
     * Find <Code>OrderForm</Code> instances  instances in range firstResult, maxResult
     * from persistence store by OrderStatusType
     *
     * @param orderStatusType
     * @param firstResult     first result to return
     * @param maxResult       max result to return
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> findByOrderStatusType(com.centuryOldShop.server.persistence.OrderStatusType orderStatusType, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>OrderForm</Code> instances from persistence store by DisputeStatusType
     *
     * @param disputeStatusType
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> findByDisputeStatusType(com.centuryOldShop.server.persistence.DisputeStatusType disputeStatusType) throws DaoException;

    /**
     * Find <Code>OrderForm</Code> instances  instances in range firstResult, maxResult
     * from persistence store by DisputeStatusType
     *
     * @param disputeStatusType
     * @param firstResult       first result to return
     * @param maxResult         max result to return
     * @return <Code>OrderForm</Code> instance list
     * @throws DaoException
     */
    List<OrderForm> findByDisputeStatusType(com.centuryOldShop.server.persistence.DisputeStatusType disputeStatusType, int firstResult, int maxResult) throws DaoException;
}