/***********************************************************************
 * Module:  CommodityTypeDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class CommodityType
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.CommodityType;
import com.centuryOldShop.server.persistence.CommodityTypePK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class CommodityType
 */
public interface CommodityTypeDao extends Dao {

    /**
     * Save <Code>CommodityType</Code> instance
     *
     * @param commodityTypeObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(CommodityType commodityTypeObject) throws DaoException;

    /**
     * Load <Code>CommodityType</Code> instance by primary key
     *
     * @param pk
     * @return <Code>CommodityType</Code> instance
     * @throws DaoException
     */
    public CommodityType load(CommodityTypePK pk) throws DaoException;

    /**
     * Delete <Code>CommodityType</Code> instance from persistence store
     *
     * @param commodityTypeObject
     * @throws DaoException
     */
    public void delete(CommodityType commodityTypeObject) throws DaoException;

    /**
     * Update <Code>CommodityType</Code> instance to persistence store
     *
     * @param commodityTypeObject
     * @throws DaoException
     */
    public void update(CommodityType commodityTypeObject) throws DaoException;

    /**
     * Save or update <Code>CommodityType</Code> instance to persistence store
     *
     * @param commodityTypeObject
     * @throws DaoException
     */
    public void saveOrUpdate(CommodityType commodityTypeObject) throws DaoException;

    /**
     * Get all <Code>CommodityType</Code> instances from persistence store
     *
     * @return <Code>CommodityType</Code> instance list
     * @throws DaoException
     */
    List<CommodityType> getCommodityTypeList() throws DaoException;

    /**
     * Get all <Code>CommodityType</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>CommodityType</Code> instance list
     * @throws DaoException
     */
    List<CommodityType> getCommodityTypeList(int firstResult, int maxResult);

    /**
     * Query <Code>CommodityType</Code> instances by example instance
     *
     * @param commodityTypeObject example instance
     * @return <Code>CommodityType</Code> instance list
     * @throws DaoException
     */
    List<CommodityType> queryByExample(CommodityType commodityTypeObject) throws DaoException;

}