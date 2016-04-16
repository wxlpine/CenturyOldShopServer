/***********************************************************************
 * Module:  ShoppingCartDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class ShoppingCart
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.ShoppingCart;
import com.centuryOldShop.server.persistence.ShoppingCartPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class ShoppingCart
 */
public interface ShoppingCartDao extends Dao {

    /**
     * Save <Code>ShoppingCart</Code> instance
     *
     * @param shoppingCartObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(ShoppingCart shoppingCartObject) throws DaoException;

    /**
     * Load <Code>ShoppingCart</Code> instance by primary key
     *
     * @param pk
     * @return <Code>ShoppingCart</Code> instance
     * @throws DaoException
     */
    public ShoppingCart load(ShoppingCartPK pk) throws DaoException;

    /**
     * Delete <Code>ShoppingCart</Code> instance from persistence store
     *
     * @param shoppingCartObject
     * @throws DaoException
     */
    public void delete(ShoppingCart shoppingCartObject) throws DaoException;

    /**
     * Update <Code>ShoppingCart</Code> instance to persistence store
     *
     * @param shoppingCartObject
     * @throws DaoException
     */
    public void update(ShoppingCart shoppingCartObject) throws DaoException;

    /**
     * Save or update <Code>ShoppingCart</Code> instance to persistence store
     *
     * @param shoppingCartObject
     * @throws DaoException
     */
    public void saveOrUpdate(ShoppingCart shoppingCartObject) throws DaoException;

    /**
     * Get all <Code>ShoppingCart</Code> instances from persistence store
     *
     * @return <Code>ShoppingCart</Code> instance list
     * @throws DaoException
     */
    public List getShoppingCartList() throws DaoException;

    /**
     * Get all <Code>ShoppingCart</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>ShoppingCart</Code> instance list
     * @throws DaoException
     */
    public List getShoppingCartList(int firstResult, int maxResult);

    /**
     * Query <Code>ShoppingCart</Code> instances by example instance
     *
     * @param shoppingCartObject example instance
     * @return <Code>ShoppingCart</Code> instance list
     * @throws DaoException
     */
    public List queryByExample(ShoppingCart shoppingCartObject) throws DaoException;

    /**
     * Find <Code>ShoppingCart</Code> instances from persistence store by amount
     *
     * @param amount
     * @return <Code>ShoppingCart</Code> instance list
     * @throws DaoException
     */
    public List findByAmount(int amount) throws DaoException;

    /**
     * Find <Code>ShoppingCart</Code> instances in range firstResult, maxResult
     * from persistence store by field amount
     *
     * @param amount
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>ShoppingCart</Code> instance list
     * @throws DaoException
     */
    public List findByAmount(int amount, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>ShoppingCart</Code> instances from persistence store by addedTime
     *
     * @param addedTime
     * @return <Code>ShoppingCart</Code> instance list
     * @throws DaoException
     */
    public List findByAddedTime(java.util.Date addedTime) throws DaoException;

    /**
     * Find <Code>ShoppingCart</Code> instances in range firstResult, maxResult
     * from persistence store by field addedTime
     *
     * @param addedTime
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>ShoppingCart</Code> instance list
     * @throws DaoException
     */
    public List findByAddedTime(java.util.Date addedTime, int firstResult, int maxResult) throws DaoException;
}