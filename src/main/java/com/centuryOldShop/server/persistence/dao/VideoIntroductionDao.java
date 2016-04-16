/***********************************************************************
 * Module:  VideoIntroductionDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class VideoIntroduction
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.VideoIntroduction;
import com.centuryOldShop.server.persistence.VideoIntroductionPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class VideoIntroduction
 */
public interface VideoIntroductionDao extends Dao {

    /**
     * Save <Code>VideoIntroduction</Code> instance
     *
     * @param videoIntroductionObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(VideoIntroduction videoIntroductionObject) throws DaoException;

    /**
     * Load <Code>VideoIntroduction</Code> instance by primary key
     *
     * @param pk
     * @return <Code>VideoIntroduction</Code> instance
     * @throws DaoException
     */
    public VideoIntroduction load(VideoIntroductionPK pk) throws DaoException;

    /**
     * Delete <Code>VideoIntroduction</Code> instance from persistence store
     *
     * @param videoIntroductionObject
     * @throws DaoException
     */
    public void delete(VideoIntroduction videoIntroductionObject) throws DaoException;

    /**
     * Update <Code>VideoIntroduction</Code> instance to persistence store
     *
     * @param videoIntroductionObject
     * @throws DaoException
     */
    public void update(VideoIntroduction videoIntroductionObject) throws DaoException;

    /**
     * Save or update <Code>VideoIntroduction</Code> instance to persistence store
     *
     * @param videoIntroductionObject
     * @throws DaoException
     */
    public void saveOrUpdate(VideoIntroduction videoIntroductionObject) throws DaoException;

    /**
     * Get all <Code>VideoIntroduction</Code> instances from persistence store
     *
     * @return <Code>VideoIntroduction</Code> instance list
     * @throws DaoException
     */
    public List getVideoIntroductionList() throws DaoException;

    /**
     * Get all <Code>VideoIntroduction</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>VideoIntroduction</Code> instance list
     * @throws DaoException
     */
    public List getVideoIntroductionList(int firstResult, int maxResult);

    /**
     * Query <Code>VideoIntroduction</Code> instances by example instance
     *
     * @param videoIntroductionObject example instance
     * @return <Code>VideoIntroduction</Code> instance list
     * @throws DaoException
     */
    public List queryByExample(VideoIntroduction videoIntroductionObject) throws DaoException;

    /**
     * Find <Code>VideoIntroduction</Code> instances from persistence store by videoUrl
     *
     * @param videoUrl
     * @return <Code>VideoIntroduction</Code> instance list
     * @throws DaoException
     */
    public List findByVideoUrl(java.lang.String videoUrl) throws DaoException;

    /**
     * Find <Code>VideoIntroduction</Code> instances in range firstResult, maxResult
     * from persistence store by field videoUrl
     *
     * @param videoUrl
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>VideoIntroduction</Code> instance list
     * @throws DaoException
     */
    public List findByVideoUrl(java.lang.String videoUrl, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>VideoIntroduction</Code> instances from persistence store by duration
     *
     * @param duration
     * @return <Code>VideoIntroduction</Code> instance list
     * @throws DaoException
     */
    public List findByDuration(int duration) throws DaoException;

    /**
     * Find <Code>VideoIntroduction</Code> instances in range firstResult, maxResult
     * from persistence store by field duration
     *
     * @param duration
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>VideoIntroduction</Code> instance list
     * @throws DaoException
     */
    public List findByDuration(int duration, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>VideoIntroduction</Code> instances from persistence store by screenshotUrl
     *
     * @param screenshotUrl
     * @return <Code>VideoIntroduction</Code> instance list
     * @throws DaoException
     */
    public List findByScreenshotUrl(java.lang.String screenshotUrl) throws DaoException;

    /**
     * Find <Code>VideoIntroduction</Code> instances in range firstResult, maxResult
     * from persistence store by field screenshotUrl
     *
     * @param screenshotUrl
     * @param firstResult   first result to return
     * @param maxResult     max result to return
     * @return <Code>VideoIntroduction</Code> instance list
     * @throws DaoException
     */
    public List findByScreenshotUrl(java.lang.String screenshotUrl, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>VideoIntroduction</Code> instances from persistence store by playedTimes
     *
     * @param playedTimes
     * @return <Code>VideoIntroduction</Code> instance list
     * @throws DaoException
     */
    public List findByPlayedTimes(int playedTimes) throws DaoException;

    /**
     * Find <Code>VideoIntroduction</Code> instances in range firstResult, maxResult
     * from persistence store by field playedTimes
     *
     * @param playedTimes
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>VideoIntroduction</Code> instance list
     * @throws DaoException
     */
    public List findByPlayedTimes(int playedTimes, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>VideoIntroduction</Code> instances from persistence store by rate
     *
     * @param rate
     * @return <Code>VideoIntroduction</Code> instance list
     * @throws DaoException
     */
    public List findByRate(double rate) throws DaoException;

    /**
     * Find <Code>VideoIntroduction</Code> instances in range firstResult, maxResult
     * from persistence store by field rate
     *
     * @param rate
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>VideoIntroduction</Code> instance list
     * @throws DaoException
     */
    public List findByRate(double rate, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>VideoIntroduction</Code> instances from persistence store by addedTime
     *
     * @param addedTime
     * @return <Code>VideoIntroduction</Code> instance list
     * @throws DaoException
     */
    public List findByAddedTime(java.util.Date addedTime) throws DaoException;

    /**
     * Find <Code>VideoIntroduction</Code> instances in range firstResult, maxResult
     * from persistence store by field addedTime
     *
     * @param addedTime
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>VideoIntroduction</Code> instance list
     * @throws DaoException
     */
    public List findByAddedTime(java.util.Date addedTime, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>VideoIntroduction</Code> instances from persistence store by Shop
     *
     * @param shop
     * @return <Code>VideoIntroduction</Code> instance list
     * @throws DaoException
     */
    public List findByShop(com.centuryOldShop.server.persistence.Shop shop) throws DaoException;

    /**
     * Find <Code>VideoIntroduction</Code> instances  instances in range firstResult, maxResult
     * from persistence store by Shop
     *
     * @param shop
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>VideoIntroduction</Code> instance list
     * @throws DaoException
     */
    public List findByShop(com.centuryOldShop.server.persistence.Shop shop, int firstResult, int maxResult) throws DaoException;
}