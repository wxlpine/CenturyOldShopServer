/***********************************************************************
 * Module:  SpecialCraftDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class SpecialCraft
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.Shop;
import com.centuryOldShop.server.persistence.SpecialCraft;
import com.centuryOldShop.server.persistence.SpecialCraftPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class SpecialCraft
 */
public interface SpecialCraftDao extends Dao {

    /**
     * Save <Code>SpecialCraft</Code> instance
     *
     * @param specialCraftObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(SpecialCraft specialCraftObject) throws DaoException;

    /**
     * Load <Code>SpecialCraft</Code> instance by primary key
     *
     * @param pk
     * @return <Code>SpecialCraft</Code> instance
     * @throws DaoException
     */
    public SpecialCraft load(SpecialCraftPK pk) throws DaoException;

    /**
     * Delete <Code>SpecialCraft</Code> instance from persistence store
     *
     * @param specialCraftObject
     * @throws DaoException
     */
    public void delete(SpecialCraft specialCraftObject) throws DaoException;

    /**
     * Update <Code>SpecialCraft</Code> instance to persistence store
     *
     * @param specialCraftObject
     * @throws DaoException
     */
    public void update(SpecialCraft specialCraftObject) throws DaoException;

    /**
     * Save or update <Code>SpecialCraft</Code> instance to persistence store
     *
     * @param specialCraftObject
     * @throws DaoException
     */
    public void saveOrUpdate(SpecialCraft specialCraftObject) throws DaoException;

    /**
     * Get all <Code>SpecialCraft</Code> instances from persistence store
     *
     * @return <Code>SpecialCraft</Code> instance list
     * @throws DaoException
     */
    List<SpecialCraft> getSpecialCraftList() throws DaoException;

    /**
     * Get all <Code>SpecialCraft</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>SpecialCraft</Code> instance list
     * @throws DaoException
     */
    List<SpecialCraft> getSpecialCraftList(int firstResult, int maxResult);

    /**
     * Query <Code>SpecialCraft</Code> instances by example instance
     *
     * @param specialCraftObject example instance
     * @return <Code>SpecialCraft</Code> instance list
     * @throws DaoException
     */
    List<SpecialCraft> queryByExample(SpecialCraft specialCraftObject) throws DaoException;

    /**
     * Find <Code>SpecialCraft</Code> instances from persistence store by title
     *
     * @param title
     * @return <Code>SpecialCraft</Code> instance list
     * @throws DaoException
     */
    List<SpecialCraft> findByTitle(java.lang.String title) throws DaoException;

    /**
     * Find <Code>SpecialCraft</Code> instances in range firstResult, maxResult
     * from persistence store by field title
     *
     * @param title
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>SpecialCraft</Code> instance list
     * @throws DaoException
     */
    List<SpecialCraft> findByTitle(java.lang.String title, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>SpecialCraft</Code> instances from persistence store by smallPhotoUrl
     *
     * @param smallPhotoUrl
     * @return <Code>SpecialCraft</Code> instance list
     * @throws DaoException
     */
    List<SpecialCraft> findBySmallPhotoUrl(java.lang.String smallPhotoUrl) throws DaoException;

    /**
     * Find <Code>SpecialCraft</Code> instances in range firstResult, maxResult
     * from persistence store by field smallPhotoUrl
     *
     * @param smallPhotoUrl
     * @param firstResult   first result to return
     * @param maxResult     max result to return
     * @return <Code>SpecialCraft</Code> instance list
     * @throws DaoException
     */
    List<SpecialCraft> findBySmallPhotoUrl(java.lang.String smallPhotoUrl, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>SpecialCraft</Code> instances from persistence store by introductionUrl
     *
     * @param introductionUrl
     * @return <Code>SpecialCraft</Code> instance list
     * @throws DaoException
     */
    List<SpecialCraft> findByIntroductionUrl(java.lang.String introductionUrl) throws DaoException;

    /**
     * Find <Code>SpecialCraft</Code> instances in range firstResult, maxResult
     * from persistence store by field introductionUrl
     *
     * @param introductionUrl
     * @param firstResult     first result to return
     * @param maxResult       max result to return
     * @return <Code>SpecialCraft</Code> instance list
     * @throws DaoException
     */
    List<SpecialCraft> findByIntroductionUrl(java.lang.String introductionUrl, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>SpecialCraft</Code> instances from persistence store by addedTime
     *
     * @param addedTime
     * @return <Code>SpecialCraft</Code> instance list
     * @throws DaoException
     */
    List<SpecialCraft> findByAddedTime(java.util.Date addedTime) throws DaoException;

    /**
     * Find <Code>SpecialCraft</Code> instances in range firstResult, maxResult
     * from persistence store by field addedTime
     *
     * @param addedTime
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>SpecialCraft</Code> instance list
     * @throws DaoException
     */
    List<SpecialCraft> findByAddedTime(java.util.Date addedTime, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>SpecialCraft</Code> instances from persistence store by shortIntro
     *
     * @param shortIntro
     * @return <Code>SpecialCraft</Code> instance list
     * @throws DaoException
     */
    List<SpecialCraft> findByShortIntro(java.lang.String shortIntro) throws DaoException;

    /**
     * Find <Code>SpecialCraft</Code> instances in range firstResult, maxResult
     * from persistence store by field shortIntro
     *
     * @param shortIntro
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>SpecialCraft</Code> instance list
     * @throws DaoException
     */
    List<SpecialCraft> findByShortIntro(java.lang.String shortIntro, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>SpecialCraft</Code> instances from persistence store by Shop
     *
     * @param shop
     * @return <Code>SpecialCraft</Code> instance list
     * @throws DaoException
     */
    List<SpecialCraft> findByShop(Shop shop) throws DaoException;

    /**
     * Find <Code>SpecialCraft</Code> instances  instances in range firstResult, maxResult
     * from persistence store by Shop
     *
     * @param shop
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>SpecialCraft</Code> instance list
     * @throws DaoException
     */
    List<SpecialCraft> findByShop(Shop shop, int firstResult, int maxResult) throws DaoException;

    List<SpecialCraft> findByShopOrderByAddedTimeDesc(Shop shop, int firstResult, int maxResult) throws DaoException;
}