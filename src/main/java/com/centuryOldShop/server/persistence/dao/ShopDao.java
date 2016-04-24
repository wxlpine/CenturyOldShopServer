/***********************************************************************
 * Module:  ShopDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class Shop
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.Shop;
import com.centuryOldShop.server.persistence.ShopArea;
import com.centuryOldShop.server.persistence.ShopPK;
import com.centuryOldShop.server.persistence.ShopType;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * dao interface that defines data access methods for class Shop
 */
public interface ShopDao extends Dao {

    /**
     * Save <Code>Shop</Code> instance
     *
     * @param shopObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(Shop shopObject) throws DaoException;

    /**
     * Load <Code>Shop</Code> instance by primary key
     *
     * @param pk
     * @return <Code>Shop</Code> instance
     * @throws DaoException
     */
    public Shop load(ShopPK pk) throws DaoException;

    /**
     * Delete <Code>Shop</Code> instance from persistence store
     *
     * @param shopObject
     * @throws DaoException
     */
    public void delete(Shop shopObject) throws DaoException;

    /**
     * Update <Code>Shop</Code> instance to persistence store
     *
     * @param shopObject
     * @throws DaoException
     */
    public void update(Shop shopObject) throws DaoException;

    /**
     * Save or update <Code>Shop</Code> instance to persistence store
     *
     * @param shopObject
     * @throws DaoException
     */
    public void saveOrUpdate(Shop shopObject) throws DaoException;

    /**
     * Get all <Code>Shop</Code> instances from persistence store
     *
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> getShopList() throws DaoException;

    /**
     * Get all <Code>Shop</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> getShopList(int firstResult, int maxResult);

    /**
     * Query <Code>Shop</Code> instances by example instance
     *
     * @param shopObject example instance
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> queryByExample(Shop shopObject) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances from persistence store by shopName
     *
     * @param shopName
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByShopName(java.lang.String shopName) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances in range firstResult, maxResult
     * from persistence store by field shopName
     *
     * @param shopName
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByShopName(java.lang.String shopName, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances from persistence store by shortDescription
     *
     * @param shortDescription
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByShortDescription(java.lang.String shortDescription) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances in range firstResult, maxResult
     * from persistence store by field shortDescription
     *
     * @param shortDescription
     * @param firstResult      first result to return
     * @param maxResult        max result to return
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByShortDescription(java.lang.String shortDescription, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances from persistence store by openABusinessTime
     *
     * @param openABusinessTime
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByOpenABusinessTime(java.util.Date openABusinessTime) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances in range firstResult, maxResult
     * from persistence store by field openABusinessTime
     *
     * @param openABusinessTime
     * @param firstResult       first result to return
     * @param maxResult         max result to return
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByOpenABusinessTime(java.util.Date openABusinessTime, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances from persistence store by visitCount
     *
     * @param visitCount
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByVisitCount(int visitCount) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances in range firstResult, maxResult
     * from persistence store by field visitCount
     *
     * @param visitCount
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByVisitCount(int visitCount, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances from persistence store by detailedAddress
     *
     * @param detailedAddress
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByDetailedAddress(java.lang.String detailedAddress) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances in range firstResult, maxResult
     * from persistence store by field detailedAddress
     *
     * @param detailedAddress
     * @param firstResult     first result to return
     * @param maxResult       max result to return
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByDetailedAddress(java.lang.String detailedAddress, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances from persistence store by trademark
     *
     * @param trademark
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByTrademark(java.lang.String trademark) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances in range firstResult, maxResult
     * from persistence store by field trademark
     *
     * @param trademark
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByTrademark(java.lang.String trademark, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances from persistence store by enterTime
     *
     * @param enterTime
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByEnterTime(java.util.Date enterTime) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances in range firstResult, maxResult
     * from persistence store by field enterTime
     *
     * @param enterTime
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByEnterTime(java.util.Date enterTime, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances from persistence store by phoneNumber
     *
     * @param phoneNumber
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByPhoneNumber(java.lang.String phoneNumber) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances in range firstResult, maxResult
     * from persistence store by field phoneNumber
     *
     * @param phoneNumber
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByPhoneNumber(java.lang.String phoneNumber, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances from persistence store by fax
     *
     * @param fax
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByFax(java.lang.String fax) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances in range firstResult, maxResult
     * from persistence store by field fax
     *
     * @param fax
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByFax(java.lang.String fax, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances from persistence store by longDescription
     *
     * @param longDescription
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByLongDescription(java.lang.String longDescription) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances in range firstResult, maxResult
     * from persistence store by field longDescription
     *
     * @param longDescription
     * @param firstResult     first result to return
     * @param maxResult       max result to return
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByLongDescription(java.lang.String longDescription, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances from persistence store by ShopType
     *
     * @param shopType
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByShopType(com.centuryOldShop.server.persistence.ShopType shopType) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances  instances in range firstResult, maxResult
     * from persistence store by ShopType
     *
     * @param shopType
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByShopType(com.centuryOldShop.server.persistence.ShopType shopType, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances from persistence store by ShopArea
     *
     * @param shopArea
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByShopArea(ShopArea shopArea) throws DaoException;

    /**
     * Find <Code>Shop</Code> instances  instances in range firstResult, maxResult
     * from persistence store by ShopArea
     *
     * @param shopArea 店铺区域
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>Shop</Code> instance list
     * @throws DaoException
     */
    List<Shop> findByShopArea(ShopArea shopArea, int firstResult, int maxResult) throws DaoException;

    /**
     * 寻找指定的shopType，开业时间早于指定的值，指定的shopArea的店铺
     *
     * @param shopType          店铺类型
     * @param openABusinessTime 早于的开业时间
     * @param shopArea          店铺区域
     * @param firstResult       first result to return，count start from 0
     * @param maxResult         max result to return
     * @return Shop列表
     * @throws DaoException
     */
    List<Shop> find(ShopType shopType, Date openABusinessTime, ShopArea shopArea,
            int firstResult, int maxResult) throws DaoException;
}