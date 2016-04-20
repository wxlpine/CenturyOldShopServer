/***********************************************************************
 * Module:  ShopStoryTypeDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class ShopStoryType
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.ShopStoryType;
import com.centuryOldShop.server.persistence.ShopStoryTypePK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class ShopStoryType
 */
public interface ShopStoryTypeDao extends Dao {

    /**
     * Save <Code>ShopStoryType</Code> instance
     *
     * @param shopStoryTypeObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(ShopStoryType shopStoryTypeObject) throws DaoException;

    /**
     * Load <Code>ShopStoryType</Code> instance by primary key
     *
     * @param pk
     * @return <Code>ShopStoryType</Code> instance
     * @throws DaoException
     */
    public ShopStoryType load(ShopStoryTypePK pk) throws DaoException;

    /**
     * Delete <Code>ShopStoryType</Code> instance from persistence store
     *
     * @param shopStoryTypeObject
     * @throws DaoException
     */
    public void delete(ShopStoryType shopStoryTypeObject) throws DaoException;

    /**
     * Update <Code>ShopStoryType</Code> instance to persistence store
     *
     * @param shopStoryTypeObject
     * @throws DaoException
     */
    public void update(ShopStoryType shopStoryTypeObject) throws DaoException;

    /**
     * Save or update <Code>ShopStoryType</Code> instance to persistence store
     *
     * @param shopStoryTypeObject
     * @throws DaoException
     */
    public void saveOrUpdate(ShopStoryType shopStoryTypeObject) throws DaoException;

    /**
     * Get all <Code>ShopStoryType</Code> instances from persistence store
     *
     * @return <Code>ShopStoryType</Code> instance list
     * @throws DaoException
     */
    List<ShopStoryType> getShopStoryTypeList() throws DaoException;

    /**
     * Get all <Code>ShopStoryType</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>ShopStoryType</Code> instance list
     * @throws DaoException
     */
    List<ShopStoryType> getShopStoryTypeList(int firstResult, int maxResult);

    /**
     * Query <Code>ShopStoryType</Code> instances by example instance
     *
     * @param shopStoryTypeObject example instance
     * @return <Code>ShopStoryType</Code> instance list
     * @throws DaoException
     */
    List<ShopStoryType> queryByExample(ShopStoryType shopStoryTypeObject) throws DaoException;

}