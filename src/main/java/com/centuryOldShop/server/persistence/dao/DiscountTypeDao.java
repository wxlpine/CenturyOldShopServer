/***********************************************************************
 * Module:  DiscountTypeDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class DiscountType
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.DiscountType;
import com.centuryOldShop.server.persistence.DiscountTypePK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class DiscountType
 */
public interface DiscountTypeDao extends Dao {

    /**
     * Save <Code>DiscountType</Code> instance
     *
     * @param discountTypeObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(DiscountType discountTypeObject) throws DaoException;

    /**
     * Load <Code>DiscountType</Code> instance by primary key
     *
     * @param pk
     * @return <Code>DiscountType</Code> instance
     * @throws DaoException
     */
    public DiscountType load(DiscountTypePK pk) throws DaoException;

    /**
     * Delete <Code>DiscountType</Code> instance from persistence store
     *
     * @param discountTypeObject
     * @throws DaoException
     */
    public void delete(DiscountType discountTypeObject) throws DaoException;

    /**
     * Update <Code>DiscountType</Code> instance to persistence store
     *
     * @param discountTypeObject
     * @throws DaoException
     */
    public void update(DiscountType discountTypeObject) throws DaoException;

    /**
     * Save or update <Code>DiscountType</Code> instance to persistence store
     *
     * @param discountTypeObject
     * @throws DaoException
     */
    public void saveOrUpdate(DiscountType discountTypeObject) throws DaoException;

    /**
     * Get all <Code>DiscountType</Code> instances from persistence store
     *
     * @return <Code>DiscountType</Code> instance list
     * @throws DaoException
     */
    List<DiscountType> getDiscountTypeList() throws DaoException;

    /**
     * Get all <Code>DiscountType</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>DiscountType</Code> instance list
     * @throws DaoException
     */
    List<DiscountType> getDiscountTypeList(int firstResult, int maxResult);

    /**
     * Query <Code>DiscountType</Code> instances by example instance
     *
     * @param discountTypeObject example instance
     * @return <Code>DiscountType</Code> instance list
     * @throws DaoException
     */
    List<DiscountType> queryByExample(DiscountType discountTypeObject) throws DaoException;

    /**
     * Find <Code>DiscountType</Code> instances from persistence store by discountTypeName
     *
     * @param discountTypeName
     * @return <Code>DiscountType</Code> instance list
     * @throws DaoException
     */
    List<DiscountType> findByDiscountTypeName(java.lang.String discountTypeName) throws DaoException;

    /**
     * Find <Code>DiscountType</Code> instances in range firstResult, maxResult
     * from persistence store by field discountTypeName
     *
     * @param discountTypeName
     * @param firstResult      first result to return
     * @param maxResult        max result to return
     * @return <Code>DiscountType</Code> instance list
     * @throws DaoException
     */
    List<DiscountType> findByDiscountTypeName(java.lang.String discountTypeName, int firstResult, int maxResult) throws DaoException;
}