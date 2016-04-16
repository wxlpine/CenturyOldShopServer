/***********************************************************************
 * Module:  ShopAreaDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class ShopArea
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.ShopArea;
import com.centuryOldShop.server.persistence.ShopAreaPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class ShopArea
 */
public interface ShopAreaDao extends Dao {

    /**
     * Save <Code>ShopArea</Code> instance
     *
     * @param shopAreaObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(ShopArea shopAreaObject) throws DaoException;

    /**
     * Load <Code>ShopArea</Code> instance by primary key
     *
     * @param pk
     * @return <Code>ShopArea</Code> instance
     * @throws DaoException
     */
    public ShopArea load(ShopAreaPK pk) throws DaoException;

    /**
     * Delete <Code>ShopArea</Code> instance from persistence store
     *
     * @param shopAreaObject
     * @throws DaoException
     */
    public void delete(ShopArea shopAreaObject) throws DaoException;

    /**
     * Update <Code>ShopArea</Code> instance to persistence store
     *
     * @param shopAreaObject
     * @throws DaoException
     */
    public void update(ShopArea shopAreaObject) throws DaoException;

    /**
     * Save or update <Code>ShopArea</Code> instance to persistence store
     *
     * @param shopAreaObject
     * @throws DaoException
     */
    public void saveOrUpdate(ShopArea shopAreaObject) throws DaoException;

    /**
     * Get all <Code>ShopArea</Code> instances from persistence store
     *
     * @return <Code>ShopArea</Code> instance list
     * @throws DaoException
     */
    public List getShopAreaList() throws DaoException;

    /**
     * Get all <Code>ShopArea</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>ShopArea</Code> instance list
     * @throws DaoException
     */
    public List getShopAreaList(int firstResult, int maxResult);

    /**
     * Query <Code>ShopArea</Code> instances by example instance
     *
     * @param shopAreaObject example instance
     * @return <Code>ShopArea</Code> instance list
     * @throws DaoException
     */
    public List queryByExample(ShopArea shopAreaObject) throws DaoException;

    /**
     * Find <Code>ShopArea</Code> instances from persistence store by shopAreaName
     *
     * @param shopAreaName
     * @return <Code>ShopArea</Code> instance list
     * @throws DaoException
     */
    public List findByShopAreaName(java.lang.String shopAreaName) throws DaoException;

    /**
     * Find <Code>ShopArea</Code> instances in range firstResult, maxResult
     * from persistence store by field shopAreaName
     *
     * @param shopAreaName
     * @param firstResult  first result to return
     * @param maxResult    max result to return
     * @return <Code>ShopArea</Code> instance list
     * @throws DaoException
     */
    public List findByShopAreaName(java.lang.String shopAreaName, int firstResult, int maxResult) throws DaoException;
}