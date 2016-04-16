/***********************************************************************
 * Module:  ShopTypeDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class ShopType
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.ShopType;
import com.centuryOldShop.server.persistence.ShopTypePK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class ShopType
 */
public interface ShopTypeDao extends Dao {

    /**
     * Save <Code>ShopType</Code> instance
     *
     * @param shopTypeObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(ShopType shopTypeObject) throws DaoException;

    /**
     * Load <Code>ShopType</Code> instance by primary key
     *
     * @param pk
     * @return <Code>ShopType</Code> instance
     * @throws DaoException
     */
    public ShopType load(ShopTypePK pk) throws DaoException;

    /**
     * Delete <Code>ShopType</Code> instance from persistence store
     *
     * @param shopTypeObject
     * @throws DaoException
     */
    public void delete(ShopType shopTypeObject) throws DaoException;

    /**
     * Update <Code>ShopType</Code> instance to persistence store
     *
     * @param shopTypeObject
     * @throws DaoException
     */
    public void update(ShopType shopTypeObject) throws DaoException;

    /**
     * Save or update <Code>ShopType</Code> instance to persistence store
     *
     * @param shopTypeObject
     * @throws DaoException
     */
    public void saveOrUpdate(ShopType shopTypeObject) throws DaoException;

    /**
     * Get all <Code>ShopType</Code> instances from persistence store
     *
     * @return <Code>ShopType</Code> instance list
     * @throws DaoException
     */
    public List getShopTypeList() throws DaoException;

    /**
     * Get all <Code>ShopType</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>ShopType</Code> instance list
     * @throws DaoException
     */
    public List getShopTypeList(int firstResult, int maxResult);

    /**
     * Query <Code>ShopType</Code> instances by example instance
     *
     * @param shopTypeObject example instance
     * @return <Code>ShopType</Code> instance list
     * @throws DaoException
     */
    public List queryByExample(ShopType shopTypeObject) throws DaoException;

}