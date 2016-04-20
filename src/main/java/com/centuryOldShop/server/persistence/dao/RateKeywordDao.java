/***********************************************************************
 * Module:  RateKeywordDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class RateKeyword
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.RateKeyword;
import com.centuryOldShop.server.persistence.RateKeywordPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class RateKeyword
 */
public interface RateKeywordDao extends Dao {

    /**
     * Save <Code>RateKeyword</Code> instance
     *
     * @param rateKeywordObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(RateKeyword rateKeywordObject) throws DaoException;

    /**
     * Load <Code>RateKeyword</Code> instance by primary key
     *
     * @param pk
     * @return <Code>RateKeyword</Code> instance
     * @throws DaoException
     */
    public RateKeyword load(RateKeywordPK pk) throws DaoException;

    /**
     * Delete <Code>RateKeyword</Code> instance from persistence store
     *
     * @param rateKeywordObject
     * @throws DaoException
     */
    public void delete(RateKeyword rateKeywordObject) throws DaoException;

    /**
     * Update <Code>RateKeyword</Code> instance to persistence store
     *
     * @param rateKeywordObject
     * @throws DaoException
     */
    public void update(RateKeyword rateKeywordObject) throws DaoException;

    /**
     * Save or update <Code>RateKeyword</Code> instance to persistence store
     *
     * @param rateKeywordObject
     * @throws DaoException
     */
    public void saveOrUpdate(RateKeyword rateKeywordObject) throws DaoException;

    /**
     * Get all <Code>RateKeyword</Code> instances from persistence store
     *
     * @return <Code>RateKeyword</Code> instance list
     * @throws DaoException
     */
    List<RateKeyword> getRateKeywordList() throws DaoException;

    /**
     * Get all <Code>RateKeyword</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>RateKeyword</Code> instance list
     * @throws DaoException
     */
    List<RateKeyword> getRateKeywordList(int firstResult, int maxResult);

    /**
     * Query <Code>RateKeyword</Code> instances by example instance
     *
     * @param rateKeywordObject example instance
     * @return <Code>RateKeyword</Code> instance list
     * @throws DaoException
     */
    List<RateKeyword> queryByExample(RateKeyword rateKeywordObject) throws DaoException;

}