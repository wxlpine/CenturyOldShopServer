/***********************************************************************
 * Module:  OrderFormCommodityDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class OrderFormCommodity
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.OrderFormCommodity;
import com.centuryOldShop.server.persistence.OrderFormCommodityPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class OrderFormCommodity
 */
public interface OrderFormCommodityDao extends Dao {

    /**
     * Save <Code>OrderFormCommodity</Code> instance
     *
     * @param orderFormCommodityObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(OrderFormCommodity orderFormCommodityObject) throws DaoException;

    /**
     * Load <Code>OrderFormCommodity</Code> instance by primary key
     *
     * @param pk
     * @return <Code>OrderFormCommodity</Code> instance
     * @throws DaoException
     */
    public OrderFormCommodity load(OrderFormCommodityPK pk) throws DaoException;

    /**
     * Delete <Code>OrderFormCommodity</Code> instance from persistence store
     *
     * @param orderFormCommodityObject
     * @throws DaoException
     */
    public void delete(OrderFormCommodity orderFormCommodityObject) throws DaoException;

    /**
     * Update <Code>OrderFormCommodity</Code> instance to persistence store
     *
     * @param orderFormCommodityObject
     * @throws DaoException
     */
    public void update(OrderFormCommodity orderFormCommodityObject) throws DaoException;

    /**
     * Save or update <Code>OrderFormCommodity</Code> instance to persistence store
     *
     * @param orderFormCommodityObject
     * @throws DaoException
     */
    public void saveOrUpdate(OrderFormCommodity orderFormCommodityObject) throws DaoException;

    /**
     * Get all <Code>OrderFormCommodity</Code> instances from persistence store
     *
     * @return <Code>OrderFormCommodity</Code> instance list
     * @throws DaoException
     */
    public List getOrderFormCommodityList() throws DaoException;

    /**
     * Get all <Code>OrderFormCommodity</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>OrderFormCommodity</Code> instance list
     * @throws DaoException
     */
    public List getOrderFormCommodityList(int firstResult, int maxResult);

    /**
     * Query <Code>OrderFormCommodity</Code> instances by example instance
     *
     * @param orderFormCommodityObject example instance
     * @return <Code>OrderFormCommodity</Code> instance list
     * @throws DaoException
     */
    public List queryByExample(OrderFormCommodity orderFormCommodityObject) throws DaoException;

    /**
     * Find <Code>OrderFormCommodity</Code> instances from persistence store by buyPrice
     *
     * @param buyPrice
     * @return <Code>OrderFormCommodity</Code> instance list
     * @throws DaoException
     */
    public List findByBuyPrice(double buyPrice) throws DaoException;

    /**
     * Find <Code>OrderFormCommodity</Code> instances in range firstResult, maxResult
     * from persistence store by field buyPrice
     *
     * @param buyPrice
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>OrderFormCommodity</Code> instance list
     * @throws DaoException
     */
    public List findByBuyPrice(double buyPrice, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>OrderFormCommodity</Code> instances from persistence store by buyAmount
     *
     * @param buyAmount
     * @return <Code>OrderFormCommodity</Code> instance list
     * @throws DaoException
     */
    public List findByBuyAmount(int buyAmount) throws DaoException;

    /**
     * Find <Code>OrderFormCommodity</Code> instances in range firstResult, maxResult
     * from persistence store by field buyAmount
     *
     * @param buyAmount
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>OrderFormCommodity</Code> instance list
     * @throws DaoException
     */
    public List findByBuyAmount(int buyAmount, int firstResult, int maxResult) throws DaoException;
}