/***********************************************************************
 * Module:  ShopHistoryDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class ShopHistory
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.ShopHistory;
import com.centuryOldShop.server.persistence.ShopHistoryPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class ShopHistory
 */
public interface ShopHistoryDao extends Dao {

    /**
     * Save <Code>ShopHistory</Code> instance
     *
     * @param shopHistoryObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(ShopHistory shopHistoryObject) throws DaoException;

    /**
     * Load <Code>ShopHistory</Code> instance by primary key
     *
     * @param pk
     * @return <Code>ShopHistory</Code> instance
     * @throws DaoException
     */
    public ShopHistory load(ShopHistoryPK pk) throws DaoException;

    /**
     * Delete <Code>ShopHistory</Code> instance from persistence store
     *
     * @param shopHistoryObject
     * @throws DaoException
     */
    public void delete(ShopHistory shopHistoryObject) throws DaoException;

    /**
     * Update <Code>ShopHistory</Code> instance to persistence store
     *
     * @param shopHistoryObject
     * @throws DaoException
     */
    public void update(ShopHistory shopHistoryObject) throws DaoException;

    /**
     * Save or update <Code>ShopHistory</Code> instance to persistence store
     *
     * @param shopHistoryObject
     * @throws DaoException
     */
    public void saveOrUpdate(ShopHistory shopHistoryObject) throws DaoException;

    /**
     * Get all <Code>ShopHistory</Code> instances from persistence store
     *
     * @return <Code>ShopHistory</Code> instance list
     * @throws DaoException
     */
    public List getShopHistoryList() throws DaoException;

    /**
     * Get all <Code>ShopHistory</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>ShopHistory</Code> instance list
     * @throws DaoException
     */
    public List getShopHistoryList(int firstResult, int maxResult);

    /**
     * Query <Code>ShopHistory</Code> instances by example instance
     *
     * @param shopHistoryObject example instance
     * @return <Code>ShopHistory</Code> instance list
     * @throws DaoException
     */
    public List queryByExample(ShopHistory shopHistoryObject) throws DaoException;

    /**
     * Find <Code>ShopHistory</Code> instances from persistence store by title
     *
     * @param title
     * @return <Code>ShopHistory</Code> instance list
     * @throws DaoException
     */
    public List findByTitle(java.lang.String title) throws DaoException;

    /**
     * Find <Code>ShopHistory</Code> instances in range firstResult, maxResult
     * from persistence store by field title
     *
     * @param title
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>ShopHistory</Code> instance list
     * @throws DaoException
     */
    public List findByTitle(java.lang.String title, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>ShopHistory</Code> instances from persistence store by smallPhotoUrl
     *
     * @param smallPhotoUrl
     * @return <Code>ShopHistory</Code> instance list
     * @throws DaoException
     */
    public List findBySmallPhotoUrl(java.lang.String smallPhotoUrl) throws DaoException;

    /**
     * Find <Code>ShopHistory</Code> instances in range firstResult, maxResult
     * from persistence store by field smallPhotoUrl
     *
     * @param smallPhotoUrl
     * @param firstResult   first result to return
     * @param maxResult     max result to return
     * @return <Code>ShopHistory</Code> instance list
     * @throws DaoException
     */
    public List findBySmallPhotoUrl(java.lang.String smallPhotoUrl, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>ShopHistory</Code> instances from persistence store by shortDescription
     *
     * @param shortDescription
     * @return <Code>ShopHistory</Code> instance list
     * @throws DaoException
     */
    public List findByShortDescription(java.lang.String shortDescription) throws DaoException;

    /**
     * Find <Code>ShopHistory</Code> instances in range firstResult, maxResult
     * from persistence store by field shortDescription
     *
     * @param shortDescription
     * @param firstResult      first result to return
     * @param maxResult        max result to return
     * @return <Code>ShopHistory</Code> instance list
     * @throws DaoException
     */
    public List findByShortDescription(java.lang.String shortDescription, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>ShopHistory</Code> instances from persistence store by publishTime
     *
     * @param publishTime
     * @return <Code>ShopHistory</Code> instance list
     * @throws DaoException
     */
    public List findByPublishTime(java.util.Date publishTime) throws DaoException;

    /**
     * Find <Code>ShopHistory</Code> instances in range firstResult, maxResult
     * from persistence store by field publishTime
     *
     * @param publishTime
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>ShopHistory</Code> instance list
     * @throws DaoException
     */
    public List findByPublishTime(java.util.Date publishTime, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>ShopHistory</Code> instances from persistence store by visitCount
     *
     * @param visitCount
     * @return <Code>ShopHistory</Code> instance list
     * @throws DaoException
     */
    public List findByVisitCount(int visitCount) throws DaoException;

    /**
     * Find <Code>ShopHistory</Code> instances in range firstResult, maxResult
     * from persistence store by field visitCount
     *
     * @param visitCount
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>ShopHistory</Code> instance list
     * @throws DaoException
     */
    public List findByVisitCount(int visitCount, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>ShopHistory</Code> instances from persistence store by detailedIntroductionPageUrl
     *
     * @param detailedIntroductionPageUrl
     * @return <Code>ShopHistory</Code> instance list
     * @throws DaoException
     */
    public List findByDetailedIntroductionPageUrl(java.lang.String detailedIntroductionPageUrl) throws DaoException;

    /**
     * Find <Code>ShopHistory</Code> instances in range firstResult, maxResult
     * from persistence store by field detailedIntroductionPageUrl
     *
     * @param detailedIntroductionPageUrl
     * @param firstResult                 first result to return
     * @param maxResult                   max result to return
     * @return <Code>ShopHistory</Code> instance list
     * @throws DaoException
     */
    public List findByDetailedIntroductionPageUrl(java.lang.String detailedIntroductionPageUrl, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>ShopHistory</Code> instances from persistence store by Shop
     *
     * @param shop
     * @return <Code>ShopHistory</Code> instance list
     * @throws DaoException
     */
    public List findByShop(com.centuryOldShop.server.persistence.Shop shop) throws DaoException;

    /**
     * Find <Code>ShopHistory</Code> instances  instances in range firstResult, maxResult
     * from persistence store by Shop
     *
     * @param shop
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>ShopHistory</Code> instance list
     * @throws DaoException
     */
    public List findByShop(com.centuryOldShop.server.persistence.Shop shop, int firstResult, int maxResult) throws DaoException;
}