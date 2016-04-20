/***********************************************************************
 * Module:  CommodityDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class Commodity
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.Commodity;
import com.centuryOldShop.server.persistence.CommodityPK;
import com.centuryOldShop.server.persistence.CommodityType;
import com.centuryOldShop.server.persistence.Shop;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class Commodity
 */
public interface CommodityDao extends Dao {

    /**
     * Save <Code>Commodity</Code> instance
     *
     * @param commodityObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(Commodity commodityObject) throws DaoException;

    /**
     * Load <Code>Commodity</Code> instance by primary key
     *
     * @param pk
     * @return <Code>Commodity</Code> instance
     * @throws DaoException
     */
    public Commodity load(CommodityPK pk) throws DaoException;

    /**
     * Delete <Code>Commodity</Code> instance from persistence store
     *
     * @param commodityObject
     * @throws DaoException
     */
    public void delete(Commodity commodityObject) throws DaoException;

    /**
     * Update <Code>Commodity</Code> instance to persistence store
     *
     * @param commodityObject
     * @throws DaoException
     */
    public void update(Commodity commodityObject) throws DaoException;

    /**
     * Save or update <Code>Commodity</Code> instance to persistence store
     *
     * @param commodityObject
     * @throws DaoException
     */
    public void saveOrUpdate(Commodity commodityObject) throws DaoException;

    /**
     * Get all <Code>Commodity</Code> instances from persistence store
     *
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> getCommodityList() throws DaoException;

    /**
     * Get all <Code>Commodity</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> getCommodityList(int firstResult, int maxResult);

    /**
     * Query <Code>Commodity</Code> instances by example instance
     *
     * @param commodityObject example instance
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> queryByExample(Commodity commodityObject) throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances from persistence store by commodityName
     *
     * @param commodityName
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findByCommodityName(java.lang.String commodityName) throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances in range firstResult, maxResult
     * from persistence store by field commodityName
     *
     * @param commodityName
     * @param firstResult   first result to return
     * @param maxResult     max result to return
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findByCommodityName(java.lang.String commodityName, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances from persistence store by smallPhotoUrl
     *
     * @param smallPhotoUrl
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findBySmallPhotoUrl(java.lang.String smallPhotoUrl) throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances in range firstResult, maxResult
     * from persistence store by field smallPhotoUrl
     *
     * @param smallPhotoUrl
     * @param firstResult   first result to return
     * @param maxResult     max result to return
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findBySmallPhotoUrl(java.lang.String smallPhotoUrl, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances from persistence store by shortDescription
     *
     * @param shortDescription
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findByShortDescription(java.lang.String shortDescription) throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances in range firstResult, maxResult
     * from persistence store by field shortDescription
     *
     * @param shortDescription
     * @param firstResult      first result to return
     * @param maxResult        max result to return
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findByShortDescription(java.lang.String shortDescription, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances from persistence store by price
     *
     * @param price
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findByPrice(double price) throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances in range firstResult, maxResult
     * from persistence store by field price
     *
     * @param price
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findByPrice(double price, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances from persistence store by salesVolume
     *
     * @param salesVolume
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findBySalesVolume(int salesVolume) throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances in range firstResult, maxResult
     * from persistence store by field salesVolume
     *
     * @param salesVolume
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findBySalesVolume(int salesVolume, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances from persistence store by exemptionFromPostage
     *
     * @param exemptionFromPostage
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findByExemptionFromPostage(boolean exemptionFromPostage) throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances in range firstResult, maxResult
     * from persistence store by field exemptionFromPostage
     *
     * @param exemptionFromPostage
     * @param firstResult          first result to return
     * @param maxResult            max result to return
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findByExemptionFromPostage(boolean exemptionFromPostage, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances from persistence store by addedTime
     *
     * @param addedTime
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findByAddedTime(java.util.Date addedTime) throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances in range firstResult, maxResult
     * from persistence store by field addedTime
     *
     * @param addedTime
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findByAddedTime(java.util.Date addedTime, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances from persistence store by phoneTopBigPhotoUrl
     *
     * @param phoneTopBigPhotoUrl
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findByPhoneTopBigPhotoUrl(java.lang.String phoneTopBigPhotoUrl) throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances in range firstResult, maxResult
     * from persistence store by field phoneTopBigPhotoUrl
     *
     * @param phoneTopBigPhotoUrl
     * @param firstResult         first result to return
     * @param maxResult           max result to return
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findByPhoneTopBigPhotoUrl(java.lang.String phoneTopBigPhotoUrl, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances from persistence store by offShelf
     *
     * @param offShelf
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findByOffShelf(boolean offShelf) throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances in range firstResult, maxResult
     * from persistence store by field offShelf
     *
     * @param offShelf
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findByOffShelf(boolean offShelf, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances from persistence store by remainingQuantity
     *
     * @param remainingQuantity
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findByRemainingQuantity(int remainingQuantity) throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances in range firstResult, maxResult
     * from persistence store by field remainingQuantity
     *
     * @param remainingQuantity
     * @param firstResult       first result to return
     * @param maxResult         max result to return
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findByRemainingQuantity(int remainingQuantity, int firstResult, int maxResult)
            throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances from persistence store by CommodityType
     *
     * @param commodityType
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findByCommodityType(CommodityType commodityType) throws DaoException;

    /**
     * Find <Code>Commodity</Code> instances  instances in range firstResult, maxResult
     * from persistence store by CommodityType
     *
     * @param commodityType
     * @param firstResult   first result to return
     * @param maxResult     max result to return
     * @return <Code>Commodity</Code> instance list
     * @throws DaoException
     */
    List<Commodity> findByCommodityType(CommodityType commodityType, int firstResult, int maxResult)
            throws DaoException;

    List<Commodity> findByShop(Shop shop) throws DaoException;

    List<Commodity> findByShop(Shop shop, int firstResult, int maxResult) throws DaoException;
}