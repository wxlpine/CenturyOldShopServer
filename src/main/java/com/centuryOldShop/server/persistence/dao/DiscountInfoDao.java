/***********************************************************************
 * Module:  DiscountInfoDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class DiscountInfo
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.DiscountInfo;
import com.centuryOldShop.server.persistence.DiscountInfoPK;
import com.centuryOldShop.server.persistence.DiscountType;
import com.centuryOldShop.server.persistence.Shop;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class DiscountInfo
 */
public interface DiscountInfoDao extends Dao {

    /**
     * Save <Code>DiscountInfo</Code> instance
     *
     * @param discountInfoObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(DiscountInfo discountInfoObject) throws DaoException;

    /**
     * Load <Code>DiscountInfo</Code> instance by primary key
     *
     * @param pk
     * @return <Code>DiscountInfo</Code> instance
     * @throws DaoException
     */
    public DiscountInfo load(DiscountInfoPK pk) throws DaoException;

    /**
     * Delete <Code>DiscountInfo</Code> instance from persistence store
     *
     * @param discountInfoObject
     * @throws DaoException
     */
    public void delete(DiscountInfo discountInfoObject) throws DaoException;

    /**
     * Update <Code>DiscountInfo</Code> instance to persistence store
     *
     * @param discountInfoObject
     * @throws DaoException
     */
    public void update(DiscountInfo discountInfoObject) throws DaoException;

    /**
     * Save or update <Code>DiscountInfo</Code> instance to persistence store
     *
     * @param discountInfoObject
     * @throws DaoException
     */
    public void saveOrUpdate(DiscountInfo discountInfoObject) throws DaoException;

    /**
     * Get all <Code>DiscountInfo</Code> instances from persistence store
     *
     * @return <Code>DiscountInfo</Code> instance list
     * @throws DaoException
     */
    List<DiscountInfo> getDiscountInfoList() throws DaoException;

    /**
     * Get all <Code>DiscountInfo</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>DiscountInfo</Code> instance list
     * @throws DaoException
     */
    List<DiscountInfo> getDiscountInfoList(int firstResult, int maxResult);

    /**
     * Query <Code>DiscountInfo</Code> instances by example instance
     *
     * @param discountInfoObject example instance
     * @return <Code>DiscountInfo</Code> instance list
     * @throws DaoException
     */
    List<DiscountInfo> queryByExample(DiscountInfo discountInfoObject) throws DaoException;

    /**
     * Find <Code>DiscountInfo</Code> instances from persistence store by title
     *
     * @param title
     * @return <Code>DiscountInfo</Code> instance list
     * @throws DaoException
     */
    List<DiscountInfo> findByTitle(java.lang.String title) throws DaoException;

    /**
     * Find <Code>DiscountInfo</Code> instances in range firstResult, maxResult
     * from persistence store by field title
     *
     * @param title
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>DiscountInfo</Code> instance list
     * @throws DaoException
     */
    List<DiscountInfo> findByTitle(java.lang.String title, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>DiscountInfo</Code> instances from persistence store by discountStartTime
     *
     * @param discountStartTime
     * @return <Code>DiscountInfo</Code> instance list
     * @throws DaoException
     */
    List<DiscountInfo> findByDiscountStartTime(java.util.Date discountStartTime) throws DaoException;

    /**
     * Find <Code>DiscountInfo</Code> instances in range firstResult, maxResult
     * from persistence store by field discountStartTime
     *
     * @param discountStartTime
     * @param firstResult       first result to return
     * @param maxResult         max result to return
     * @return <Code>DiscountInfo</Code> instance list
     * @throws DaoException
     */
    List<DiscountInfo> findByDiscountStartTime(java.util.Date discountStartTime, int firstResult, int maxResult)
            throws DaoException;

    /**
     * Find <Code>DiscountInfo</Code> instances from persistence store by discountEndTime
     *
     * @param discountEndTime
     * @return <Code>DiscountInfo</Code> instance list
     * @throws DaoException
     */
    List<DiscountInfo> findByDiscountEndTime(java.util.Date discountEndTime) throws DaoException;

    /**
     * Find <Code>DiscountInfo</Code> instances in range firstResult, maxResult
     * from persistence store by field discountEndTime
     *
     * @param discountEndTime
     * @param firstResult     first result to return
     * @param maxResult       max result to return
     * @return <Code>DiscountInfo</Code> instance list
     * @throws DaoException
     */
    List<DiscountInfo> findByDiscountEndTime(java.util.Date discountEndTime, int firstResult, int maxResult)
            throws DaoException;

    /**
     * Find <Code>DiscountInfo</Code> instances from persistence store by priceReduceMinPrice
     *
     * @param priceReduceMinPrice
     * @return <Code>DiscountInfo</Code> instance list
     * @throws DaoException
     */
    List<DiscountInfo> findByPriceReduceMinPrice(double priceReduceMinPrice) throws DaoException;

    /**
     * Find <Code>DiscountInfo</Code> instances in range firstResult, maxResult
     * from persistence store by field priceReduceMinPrice
     *
     * @param priceReduceMinPrice
     * @param firstResult         first result to return
     * @param maxResult           max result to return
     * @return <Code>DiscountInfo</Code> instance list
     * @throws DaoException
     */
    List<DiscountInfo> findByPriceReduceMinPrice(double priceReduceMinPrice, int firstResult, int maxResult)
            throws DaoException;

    /**
     * Find <Code>DiscountInfo</Code> instances from persistence store by priceReduceAmount
     *
     * @param priceReduceAmount
     * @return <Code>DiscountInfo</Code> instance list
     * @throws DaoException
     */
    List<DiscountInfo> findByPriceReduceAmount(double priceReduceAmount) throws DaoException;

    /**
     * Find <Code>DiscountInfo</Code> instances in range firstResult, maxResult
     * from persistence store by field priceReduceAmount
     *
     * @param priceReduceAmount
     * @param firstResult       first result to return
     * @param maxResult         max result to return
     * @return <Code>DiscountInfo</Code> instance list
     * @throws DaoException
     */
    List<DiscountInfo> findByPriceReduceAmount(double priceReduceAmount, int firstResult, int maxResult)
            throws DaoException;

    /**
     * Find <Code>DiscountInfo</Code> instances from persistence store by discountMinPrice
     *
     * @param discountMinPrice
     * @return <Code>DiscountInfo</Code> instance list
     * @throws DaoException
     */
    List<DiscountInfo> findByDiscountMinPrice(double discountMinPrice) throws DaoException;

    /**
     * Find <Code>DiscountInfo</Code> instances in range firstResult, maxResult
     * from persistence store by field discountMinPrice
     *
     * @param discountMinPrice
     * @param firstResult      first result to return
     * @param maxResult        max result to return
     * @return <Code>DiscountInfo</Code> instance list
     * @throws DaoException
     */
    List<DiscountInfo> findByDiscountMinPrice(double discountMinPrice, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>DiscountInfo</Code> instances from persistence store by discountRatio
     *
     * @param discountRatio
     * @return <Code>DiscountInfo</Code> instance list
     * @throws DaoException
     */
    List<DiscountInfo> findByDiscountRatio(double discountRatio) throws DaoException;

    /**
     * Find <Code>DiscountInfo</Code> instances in range firstResult, maxResult
     * from persistence store by field discountRatio
     *
     * @param discountRatio
     * @param firstResult   first result to return
     * @param maxResult     max result to return
     * @return <Code>DiscountInfo</Code> instance list
     * @throws DaoException
     */
    List<DiscountInfo> findByDiscountRatio(double discountRatio, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>DiscountInfo</Code> instances from persistence store by Shop
     *
     * @param shop
     * @return <Code>DiscountInfo</Code> instance list
     * @throws DaoException
     */
    List<DiscountInfo> findByShop(Shop shop) throws DaoException;

    /**
     * Find <Code>DiscountInfo</Code> instances  instances in range firstResult, maxResult
     * from persistence store by Shop
     *
     * @param shop
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>DiscountInfo</Code> instance list
     * @throws DaoException
     */
    List<DiscountInfo> findByShop(Shop shop, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>DiscountInfo</Code> instances from persistence store by DiscountType
     *
     * @param discountType
     * @return <Code>DiscountInfo</Code> instance list
     * @throws DaoException
     */
    List<DiscountInfo> findByDiscountType(DiscountType discountType) throws DaoException;

    /**
     * Find <Code>DiscountInfo</Code> instances  instances in range firstResult, maxResult
     * from persistence store by DiscountType
     *
     * @param discountType
     * @param firstResult  first result to return
     * @param maxResult    max result to return
     * @return <Code>DiscountInfo</Code> instance list
     * @throws DaoException
     */
    List<DiscountInfo> findByDiscountType(DiscountType discountType, int firstResult, int maxResult)
            throws DaoException;

    /**
     * 获得还在优惠时间范围内的优惠活动，按照发布时间倒序排列
     *
     * @param shop        如果是null，代表任何店铺的信息都可以显示
     * @param firstResult 如果是null，代表不指定firstResult
     * @param maxResult   如果是null，代表不指定maxResult
     * @return 需要的DiscountInfo列表
     * @throws DaoException
     */
    List<DiscountInfo> getLiveDiscountInfoListPublishTimeDesc(Shop shop, Integer firstResult, Integer maxResult)
            throws DaoException;
}