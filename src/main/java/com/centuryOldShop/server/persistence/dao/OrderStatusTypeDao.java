/***********************************************************************
 * Module:  OrderStatusTypeDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class OrderStatusType
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.OrderStatusType;
import com.centuryOldShop.server.persistence.OrderStatusTypePK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class OrderStatusType
 */
public interface OrderStatusTypeDao extends Dao {

    /**
     * Save <Code>OrderStatusType</Code> instance
     *
     * @param orderStatusTypeObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(OrderStatusType orderStatusTypeObject) throws DaoException;

    /**
     * Load <Code>OrderStatusType</Code> instance by primary key
     *
     * @param pk
     * @return <Code>OrderStatusType</Code> instance
     * @throws DaoException
     */
    public OrderStatusType load(OrderStatusTypePK pk) throws DaoException;

    /**
     * Delete <Code>OrderStatusType</Code> instance from persistence store
     *
     * @param orderStatusTypeObject
     * @throws DaoException
     */
    public void delete(OrderStatusType orderStatusTypeObject) throws DaoException;

    /**
     * Update <Code>OrderStatusType</Code> instance to persistence store
     *
     * @param orderStatusTypeObject
     * @throws DaoException
     */
    public void update(OrderStatusType orderStatusTypeObject) throws DaoException;

    /**
     * Save or update <Code>OrderStatusType</Code> instance to persistence store
     *
     * @param orderStatusTypeObject
     * @throws DaoException
     */
    public void saveOrUpdate(OrderStatusType orderStatusTypeObject) throws DaoException;

    /**
     * Get all <Code>OrderStatusType</Code> instances from persistence store
     *
     * @return <Code>OrderStatusType</Code> instance list
     * @throws DaoException
     */
    public List<OrderStatusType> getOrderStatusTypeList() throws DaoException;

    /**
     * Get all <Code>OrderStatusType</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>OrderStatusType</Code> instance list
     * @throws DaoException
     */
    public List<OrderStatusType> getOrderStatusTypeList(int firstResult, int maxResult);

    /**
     * Query <Code>OrderStatusType</Code> instances by example instance
     *
     * @param orderStatusTypeObject example instance
     * @return <Code>OrderStatusType</Code> instance list
     * @throws DaoException
     */
    public List<OrderStatusType> queryByExample(OrderStatusType orderStatusTypeObject) throws DaoException;

}