/***********************************************************************
 * Module:  CommodityDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class Commodity
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.Commodity;
import com.centuryOldShop.server.persistence.CommodityPK;
import com.centuryOldShop.server.persistence.CommodityType;
import com.centuryOldShop.server.persistence.Shop;
import com.centuryOldShop.server.persistence.dao.CommodityDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of CommodityDao interface
 */
@SuppressWarnings("ALL")
public class CommodityDaoImpl extends HibernateDaoImpl implements CommodityDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#save(com.centuryOldShop.server.persistence.Commodity)
     */
    public Serializable save(Commodity commodityObject) throws DaoException {
        return super.save(commodityObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#load(com.centuryOldShop.server.persistence.CommodityPK)
     */
    public Commodity load(CommodityPK pk) throws DaoException {
        List cs = new ArrayList();
        String[] paramNames = new String[]{"commodityId"};
        Object[] values = new Object[]{new Long(pk.getCommodityId())};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(Commodity.class, cs);
        return (((list != null) && (list.size() > 0)) ? (Commodity) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#delete(com.centuryOldShop.server.persistence.Commodity)
     */
    public void delete(Commodity commodityObject) throws DaoException {
        super.delete(commodityObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#update(com.centuryOldShop.server.persistence.Commodity)
     */
    public void update(Commodity commodityObject) throws DaoException {
        super.update(commodityObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#saveOrUpdate(com.centuryOldShop.server.persistence.Commodity)
     */
    public void saveOrUpdate(Commodity commodityObject) throws DaoException {
        super.saveOrUpdate(commodityObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.Commodity)
     */
    public List<Commodity> queryByExample(Commodity commodityObject) throws DaoException {
        return super.queryByExample(Commodity.class, commodityObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#getCommodityList()
     */
    public List<Commodity> getCommodityList() throws DaoException {
        return super.loadAll(Commodity.class);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#getCommodityList(int, int)
     */
    public List<Commodity> getCommodityList(int firstResult, int maxResult) {
        return super.loadAll(Commodity.class, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findByCommodityName(java.lang.String)
     */
    public List<Commodity> findByCommodityName(java.lang.String commodityName) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("commodityName", commodityName));
        return super.findByCriterions(Commodity.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findByCommodityName(java.lang.String, int, int)
     */
    public List<Commodity> findByCommodityName(java.lang.String commodityName, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("commodityName", commodityName));
        return super.findByCriterions(Commodity.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findBySmallPhotoUrl(java.lang.String)
     */
    public List<Commodity> findBySmallPhotoUrl(java.lang.String smallPhotoUrl) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("smallPhotoUrl", smallPhotoUrl));
        return super.findByCriterions(Commodity.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findBySmallPhotoUrl(java.lang.String, int, int)
     */
    public List<Commodity> findBySmallPhotoUrl(java.lang.String smallPhotoUrl, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("smallPhotoUrl", smallPhotoUrl));
        return super.findByCriterions(Commodity.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findByShortDescription(java.lang.String)
     */
    public List<Commodity> findByShortDescription(java.lang.String shortDescription) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shortDescription", shortDescription));
        return super.findByCriterions(Commodity.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findByShortDescription(java.lang.String, int, int)
     */
    public List<Commodity> findByShortDescription(java.lang.String shortDescription, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shortDescription", shortDescription));
        return super.findByCriterions(Commodity.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findByPrice(double)
     */
    public List<Commodity> findByPrice(double price) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("price", new Double(price)));
        return super.findByCriterions(Commodity.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findByPrice(double, int, int)
     */
    public List<Commodity> findByPrice(double price, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("price", new Double(price)));
        return super.findByCriterions(Commodity.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findBySalesVolume(int)
     */
    public List<Commodity> findBySalesVolume(int salesVolume) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("salesVolume", new Integer(salesVolume)));
        return super.findByCriterions(Commodity.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findBySalesVolume(int, int, int)
     */
    public List<Commodity> findBySalesVolume(int salesVolume, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("salesVolume", new Integer(salesVolume)));
        return super.findByCriterions(Commodity.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findByExemptionFromPostage(boolean)
     */
    public List<Commodity> findByExemptionFromPostage(boolean exemptionFromPostage) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("exemptionFromPostage", new Boolean(exemptionFromPostage)));
        return super.findByCriterions(Commodity.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findByExemptionFromPostage(boolean, int, int)
     */
    public List<Commodity> findByExemptionFromPostage(boolean exemptionFromPostage, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("exemptionFromPostage", new Boolean(exemptionFromPostage)));
        return super.findByCriterions(Commodity.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findByAddedTime(java.util.Date)
     */
    public List<Commodity> findByAddedTime(java.util.Date addedTime) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("addedTime", addedTime));
        return super.findByCriterions(Commodity.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findByAddedTime(java.util.Date, int, int)
     */
    public List<Commodity> findByAddedTime(java.util.Date addedTime, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("addedTime", addedTime));
        return super.findByCriterions(Commodity.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findByPhoneTopBigPhotoUrl(java.lang.String)
     */
    public List<Commodity> findByPhoneTopBigPhotoUrl(java.lang.String phoneTopBigPhotoUrl) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("phoneTopBigPhotoUrl", phoneTopBigPhotoUrl));
        return super.findByCriterions(Commodity.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findByPhoneTopBigPhotoUrl(java.lang.String, int, int)
     */
    public List<Commodity> findByPhoneTopBigPhotoUrl(java.lang.String phoneTopBigPhotoUrl, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("phoneTopBigPhotoUrl", phoneTopBigPhotoUrl));
        return super.findByCriterions(Commodity.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findByOffShelf(boolean)
     */
    public List<Commodity> findByOffShelf(boolean offShelf) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("offShelf", new Boolean(offShelf)));
        return super.findByCriterions(Commodity.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findByOffShelf(boolean, int, int)
     */
    public List<Commodity> findByOffShelf(boolean offShelf, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("offShelf", new Boolean(offShelf)));
        return super.findByCriterions(Commodity.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findByRemainingQuantity(int)
     */
    public List<Commodity> findByRemainingQuantity(int remainingQuantity) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("remainingQuantity", new Integer(remainingQuantity)));
        return super.findByCriterions(Commodity.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findByRemainingQuantity(int, int, int)
     */
    public List<Commodity> findByRemainingQuantity(int remainingQuantity, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("remainingQuantity", new Integer(remainingQuantity)));
        return super.findByCriterions(Commodity.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findByCommodityType(com.centuryOldShop.server.persistence.CommodityType)
     */
    public List<Commodity> findByCommodityType(CommodityType commodityType) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("commodityType", commodityType));
        return super.findByCriterions(Commodity.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityDao#findByCommodityType(com.centuryOldShop.server.persistence.CommodityType, int, int)
     */
    public List<Commodity> findByCommodityType(CommodityType commodityType, int firstResult, int maxResult)
            throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("commodityType", commodityType));
        return super.findByCriterions(Commodity.class, cs, firstResult, maxResult);
    }

    @Override
    public List<Commodity> findByShop(Shop shop) throws DaoException {
        List<Criterion> cs = new ArrayList();
        cs.add(Restrictions.eq("shop", shop));
        return super.findByCriterions(Commodity.class, cs);
    }

    @Override
    public List<Commodity> findByShop(Shop shop, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList();
        cs.add(Restrictions.eq("shop", shop));
        return super.findByCriterions(Commodity.class, cs, firstResult, maxResult);
    }
}