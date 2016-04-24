/***********************************************************************
 * Module:  NewsDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class News
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.News;
import com.centuryOldShop.server.persistence.NewsPK;
import com.centuryOldShop.server.persistence.Shop;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class News
 */
public interface NewsDao extends Dao {

    /**
     * Save <Code>News</Code> instance
     *
     * @param newsObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(News newsObject) throws DaoException;

    /**
     * Load <Code>News</Code> instance by primary key
     *
     * @param pk
     * @return <Code>News</Code> instance
     * @throws DaoException
     */
    public News load(NewsPK pk) throws DaoException;

    /**
     * Delete <Code>News</Code> instance from persistence store
     *
     * @param newsObject
     * @throws DaoException
     */
    public void delete(News newsObject) throws DaoException;

    /**
     * Update <Code>News</Code> instance to persistence store
     *
     * @param newsObject
     * @throws DaoException
     */
    public void update(News newsObject) throws DaoException;

    /**
     * Save or update <Code>News</Code> instance to persistence store
     *
     * @param newsObject
     * @throws DaoException
     */
    public void saveOrUpdate(News newsObject) throws DaoException;

    /**
     * Get all <Code>News</Code> instances from persistence store
     *
     * @return <Code>News</Code> instance list
     * @throws DaoException
     */
    List<News> getNewsList() throws DaoException;

    /**
     * Get all <Code>News</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>News</Code> instance list
     * @throws DaoException
     */
    List<News> getNewsList(int firstResult, int maxResult);

    List<News> getNewsListOrderByPublishTimeDesc(int firstResult, int maxResult);

    /**
     * Query <Code>News</Code> instances by example instance
     *
     * @param newsObject example instance
     * @return <Code>News</Code> instance list
     * @throws DaoException
     */
    List<News> queryByExample(News newsObject) throws DaoException;

    /**
     * Find <Code>News</Code> instances from persistence store by title
     *
     * @param title
     * @return <Code>News</Code> instance list
     * @throws DaoException
     */
    List<News> findByTitle(String title) throws DaoException;

    /**
     * Find <Code>News</Code> instances in range firstResult, maxResult
     * from persistence store by field title
     *
     * @param title
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>News</Code> instance list
     * @throws DaoException
     */
    List<News> findByTitle(String title, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>News</Code> instances from persistence store by contentUrl
     *
     * @param contentUrl
     * @return <Code>News</Code> instance list
     * @throws DaoException
     */
    List<News> findByContentUrl(String contentUrl) throws DaoException;

    /**
     * Find <Code>News</Code> instances in range firstResult, maxResult
     * from persistence store by field contentUrl
     *
     * @param contentUrl
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>News</Code> instance list
     * @throws DaoException
     */
    List<News> findByContentUrl(String contentUrl, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>News</Code> instances from persistence store by publishTime
     *
     * @param publishTime
     * @return <Code>News</Code> instance list
     * @throws DaoException
     */
    List<News> findByPublishTime(java.util.Date publishTime) throws DaoException;

    /**
     * Find <Code>News</Code> instances in range firstResult, maxResult
     * from persistence store by field publishTime
     *
     * @param publishTime
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>News</Code> instance list
     * @throws DaoException
     */
    List<News> findByPublishTime(java.util.Date publishTime, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>News</Code> instances from persistence store by readCount
     *
     * @param readCount
     * @return <Code>News</Code> instance list
     * @throws DaoException
     */
    List<News> findByReadCount(int readCount) throws DaoException;

    /**
     * Find <Code>News</Code> instances in range firstResult, maxResult
     * from persistence store by field readCount
     *
     * @param readCount
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>News</Code> instance list
     * @throws DaoException
     */
    List<News> findByReadCount(int readCount, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>News</Code> instances from persistence store by spotScene
     *
     * @param spotScene
     * @return <Code>News</Code> instance list
     * @throws DaoException
     */
    List<News> findBySpotScene(String spotScene) throws DaoException;

    /**
     * Find <Code>News</Code> instances in range firstResult, maxResult
     * from persistence store by field spotScene
     *
     * @param spotScene
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>News</Code> instance list
     * @throws DaoException
     */
    List<News> findBySpotScene(String spotScene, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>News</Code> instances from persistence store by Shop
     *
     * @param shop
     * @return <Code>News</Code> instance list
     * @throws DaoException
     */
    List<News> findByShop(Shop shop) throws DaoException;

    /**
     * Find <Code>News</Code> instances  instances in range firstResult, maxResult
     * from persistence store by Shop
     *
     * @param shop
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>News</Code> instance list
     * @throws DaoException
     */
    List<News> findByShop(Shop shop, int firstResult, int maxResult) throws DaoException;

    List<News> findByShopOrderByPublishTimeDesc(Shop shop, int firstResult, int maxResult) throws DaoException;
}