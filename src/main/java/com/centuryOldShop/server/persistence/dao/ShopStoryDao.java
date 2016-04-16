/***********************************************************************
 * Module:  ShopStoryDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class ShopStory
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.ShopStory;
import com.centuryOldShop.server.persistence.ShopStoryPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class ShopStory
 */
public interface ShopStoryDao extends Dao {

    /**
     * Save <Code>ShopStory</Code> instance
     *
     * @param shopStoryObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(ShopStory shopStoryObject) throws DaoException;

    /**
     * Load <Code>ShopStory</Code> instance by primary key
     *
     * @param pk
     * @return <Code>ShopStory</Code> instance
     * @throws DaoException
     */
    public ShopStory load(ShopStoryPK pk) throws DaoException;

    /**
     * Delete <Code>ShopStory</Code> instance from persistence store
     *
     * @param shopStoryObject
     * @throws DaoException
     */
    public void delete(ShopStory shopStoryObject) throws DaoException;

    /**
     * Update <Code>ShopStory</Code> instance to persistence store
     *
     * @param shopStoryObject
     * @throws DaoException
     */
    public void update(ShopStory shopStoryObject) throws DaoException;

    /**
     * Save or update <Code>ShopStory</Code> instance to persistence store
     *
     * @param shopStoryObject
     * @throws DaoException
     */
    public void saveOrUpdate(ShopStory shopStoryObject) throws DaoException;

    /**
     * Get all <Code>ShopStory</Code> instances from persistence store
     *
     * @return <Code>ShopStory</Code> instance list
     * @throws DaoException
     */
    public List getShopStoryList() throws DaoException;

    /**
     * Get all <Code>ShopStory</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>ShopStory</Code> instance list
     * @throws DaoException
     */
    public List getShopStoryList(int firstResult, int maxResult);

    /**
     * Query <Code>ShopStory</Code> instances by example instance
     *
     * @param shopStoryObject example instance
     * @return <Code>ShopStory</Code> instance list
     * @throws DaoException
     */
    public List queryByExample(ShopStory shopStoryObject) throws DaoException;

    /**
     * Find <Code>ShopStory</Code> instances from persistence store by storyName
     *
     * @param storyName
     * @return <Code>ShopStory</Code> instance list
     * @throws DaoException
     */
    public List findByStoryName(java.lang.String storyName) throws DaoException;

    /**
     * Find <Code>ShopStory</Code> instances in range firstResult, maxResult
     * from persistence store by field storyName
     *
     * @param storyName
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>ShopStory</Code> instance list
     * @throws DaoException
     */
    public List findByStoryName(java.lang.String storyName, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>ShopStory</Code> instances from persistence store by storyContentUrl
     *
     * @param storyContentUrl
     * @return <Code>ShopStory</Code> instance list
     * @throws DaoException
     */
    public List findByStoryContentUrl(java.lang.String storyContentUrl) throws DaoException;

    /**
     * Find <Code>ShopStory</Code> instances in range firstResult, maxResult
     * from persistence store by field storyContentUrl
     *
     * @param storyContentUrl
     * @param firstResult     first result to return
     * @param maxResult       max result to return
     * @return <Code>ShopStory</Code> instance list
     * @throws DaoException
     */
    public List findByStoryContentUrl(java.lang.String storyContentUrl, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>ShopStory</Code> instances from persistence store by addedTime
     *
     * @param addedTime
     * @return <Code>ShopStory</Code> instance list
     * @throws DaoException
     */
    public List findByAddedTime(java.util.Date addedTime) throws DaoException;

    /**
     * Find <Code>ShopStory</Code> instances in range firstResult, maxResult
     * from persistence store by field addedTime
     *
     * @param addedTime
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>ShopStory</Code> instance list
     * @throws DaoException
     */
    public List findByAddedTime(java.util.Date addedTime, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>ShopStory</Code> instances from persistence store by Shop
     *
     * @param shop
     * @return <Code>ShopStory</Code> instance list
     * @throws DaoException
     */
    public List findByShop(com.centuryOldShop.server.persistence.Shop shop) throws DaoException;

    /**
     * Find <Code>ShopStory</Code> instances  instances in range firstResult, maxResult
     * from persistence store by Shop
     *
     * @param shop
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>ShopStory</Code> instance list
     * @throws DaoException
     */
    public List findByShop(com.centuryOldShop.server.persistence.Shop shop, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>ShopStory</Code> instances from persistence store by ShopStoryType
     *
     * @param shopStoryType
     * @return <Code>ShopStory</Code> instance list
     * @throws DaoException
     */
    public List findByShopStoryType(com.centuryOldShop.server.persistence.ShopStoryType shopStoryType) throws DaoException;

    /**
     * Find <Code>ShopStory</Code> instances  instances in range firstResult, maxResult
     * from persistence store by ShopStoryType
     *
     * @param shopStoryType
     * @param firstResult   first result to return
     * @param maxResult     max result to return
     * @return <Code>ShopStory</Code> instance list
     * @throws DaoException
     */
    public List findByShopStoryType(com.centuryOldShop.server.persistence.ShopStoryType shopStoryType, int firstResult, int maxResult) throws DaoException;
}