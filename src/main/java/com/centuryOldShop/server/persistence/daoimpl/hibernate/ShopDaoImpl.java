/***********************************************************************
 * Module:  ShopDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class Shop
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.Shop;
import com.centuryOldShop.server.persistence.ShopArea;
import com.centuryOldShop.server.persistence.ShopPK;
import com.centuryOldShop.server.persistence.ShopType;
import com.centuryOldShop.server.persistence.dao.ShopDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of ShopDao interface
 */

public class ShopDaoImpl extends HibernateDaoImpl implements ShopDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#save(com.centuryOldShop.server.persistence.Shop)
     */
    @Override
    public Serializable save(Shop shopObject) throws DaoException {
        return super.save(shopObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#load(com.centuryOldShop.server.persistence.ShopPK)
     */
    @Override
    public Shop load(ShopPK pk) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        String[] paramNames = new String[]{"shopId"};
        Object[] values = new Object[]{new Long(pk.getShopId())};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(Shop.class, cs, null, null, null);
        return (((list != null) && (list.size() > 0)) ? (Shop) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#delete(com.centuryOldShop.server.persistence.Shop)
     */
    @Override
    public void delete(Shop shopObject) throws DaoException {
        super.delete(shopObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#update(com.centuryOldShop.server.persistence.Shop)
     */
    @Override
    public void update(Shop shopObject) throws DaoException {
        super.update(shopObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#saveOrUpdate(com.centuryOldShop.server.persistence.Shop)
     */
    @Override
    public void saveOrUpdate(Shop shopObject) throws DaoException {
        super.saveOrUpdate(shopObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao
     * #queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.Shop)
     */
    @Override
    public List<Shop> queryByExample(Shop shopObject) throws DaoException {
        return super.queryByExample(Shop.class, shopObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#getShopList()
     */
    @Override
    public List<Shop> getShopList() throws DaoException {
        return super.loadAll(Shop.class, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#getShopList(int, int)
     */
    @Override
    public List<Shop> getShopList(int firstResult, int maxResult) {
        return super.loadAll(Shop.class, firstResult, maxResult, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByShopName(java.lang.String)
     */
    @Override
    public List<Shop> findByShopName(String shopName) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shopName", shopName));
        return super.findByCriterions(Shop.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByShopName(java.lang.String, int, int)
     */
    @Override
    public List<Shop> findByShopName(String shopName, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shopName", shopName));
        return super.findByCriterions(Shop.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByShortDescription(java.lang.String)
     */
    @Override
    public List<Shop> findByShortDescription(String shortDescription) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shortDescription", shortDescription));
        return super.findByCriterions(Shop.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByShortDescription(java.lang.String, int, int)
     */
    @Override
    public List<Shop> findByShortDescription(String shortDescription,
            int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shortDescription", shortDescription));
        return super.findByCriterions(Shop.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByOpenABusinessTime(java.util.Date)
     */
    @Override
    public List<Shop> findByOpenABusinessTime(java.util.Date openABusinessTime) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("openABusinessTime", openABusinessTime));
        return super.findByCriterions(Shop.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao
     * #findByOpenABusinessTime(java.util.Date, int, int)
     */
    @Override
    public List<Shop> findByOpenABusinessTime(java.util.Date openABusinessTime,
            int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("openABusinessTime", openABusinessTime));
        return super.findByCriterions(Shop.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByVisitCount(int)
     */
    @Override
    public List<Shop> findByVisitCount(int visitCount) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("visitCount", new Integer(visitCount)));
        return super.findByCriterions(Shop.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByVisitCount(int, int, int)
     */
    @Override
    public List<Shop> findByVisitCount(int visitCount, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("visitCount", new Integer(visitCount)));
        return super.findByCriterions(Shop.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByDetailedAddress(java.lang.String)
     */
    @Override
    public List<Shop> findByDetailedAddress(String detailedAddress) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("detailedAddress", detailedAddress));
        return super.findByCriterions(Shop.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByDetailedAddress(java.lang.String, int, int)
     */
    @Override
    public List<Shop> findByDetailedAddress(String detailedAddress,
            int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("detailedAddress", detailedAddress));
        return super.findByCriterions(Shop.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByTrademark(java.lang.String)
     */
    @Override
    public List<Shop> findByTrademark(String trademark) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("trademark", trademark));
        return super.findByCriterions(Shop.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByTrademark(java.lang.String, int, int)
     */
    @Override
    public List<Shop> findByTrademark(String trademark,
            int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("trademark", trademark));
        return super.findByCriterions(Shop.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByEnterTime(java.util.Date)
     */
    @Override
    public List<Shop> findByEnterTime(java.util.Date enterTime) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("enterTime", enterTime));
        return super.findByCriterions(Shop.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByEnterTime(java.util.Date, int, int)
     */
    @Override
    public List<Shop> findByEnterTime(java.util.Date enterTime,
            int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("enterTime", enterTime));
        return super.findByCriterions(Shop.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByPhoneNumber(java.lang.String)
     */
    @Override
    public List<Shop> findByPhoneNumber(String phoneNumber) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("phoneNumber", phoneNumber));
        return super.findByCriterions(Shop.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByPhoneNumber(java.lang.String, int, int)
     */
    @Override
    public List<Shop> findByPhoneNumber(String phoneNumber,
            int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("phoneNumber", phoneNumber));
        return super.findByCriterions(Shop.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByFax(java.lang.String)
     */
    @Override
    public List<Shop> findByFax(String fax) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("fax", fax));
        return super.findByCriterions(Shop.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByFax(java.lang.String, int, int)
     */
    @Override
    public List<Shop> findByFax(String fax, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("fax", fax));
        return super.findByCriterions(Shop.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByLongDescription(java.lang.String)
     */
    @Override
    public List<Shop> findByLongDescription(String longDescription) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("longDescription", longDescription));
        return super.findByCriterions(Shop.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByLongDescription(java.lang.String, int, int)
     */
    @Override
    public List<Shop> findByLongDescription(String longDescription,
            int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("longDescription", longDescription));
        return super.findByCriterions(Shop.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao
     * #findByShopType(com.centuryOldShop.server.persistence.ShopType)
     */
    @Override
    public List<Shop> findByShopType(ShopType shopType) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shopType", shopType));
        return super.findByCriterions(Shop.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao
     * #findByShopType(com.centuryOldShop.server.persistence.ShopType, int, int)
     */
    @Override
    public List<Shop> findByShopType(ShopType shopType, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shopType", shopType));
        return super.findByCriterions(Shop.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao
     * #findByShopArea(com.centuryOldShop.server.persistence.ShopArea)
     */
    @Override
    public List<Shop> findByShopArea(ShopArea shopArea) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shopArea", shopArea));
        return super.findByCriterions(Shop.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao
     * #findByShopArea(com.centuryOldShop.server.persistence.ShopArea, int, int)
     */
    @Override
    public List<Shop> findByShopArea(ShopArea shopArea, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shopArea", shopArea));
        return super.findByCriterions(Shop.class, cs, null, firstResult, maxResult);
    }


}