/***********************************************************************
 * Module:  ShopDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class Shop
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.Shop;
import com.centuryOldShop.server.persistence.ShopPK;
import com.centuryOldShop.server.persistence.dao.ShopDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of ShopDao interface
 */
@SuppressWarnings("ALL")
public class ShopDaoImpl extends HibernateDaoImpl implements ShopDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#save(com.centuryOldShop.server.persistence.Shop)
     */
    public Serializable save(Shop shopObject) throws DaoException {
        return super.save(shopObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#load(com.centuryOldShop.server.persistence.ShopPK)
     */
    public Shop load(ShopPK pk) throws DaoException {
        List cs = new ArrayList();
        String[] paramNames = new String[]{"shopId"};
        Object[] values = new Object[]{new Long(pk.getShopId())};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(Shop.class, cs);
        return (((list != null) && (list.size() > 0)) ? (Shop) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#delete(com.centuryOldShop.server.persistence.Shop)
     */
    public void delete(Shop shopObject) throws DaoException {
        super.delete(shopObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#update(com.centuryOldShop.server.persistence.Shop)
     */
    public void update(Shop shopObject) throws DaoException {
        super.update(shopObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#saveOrUpdate(com.centuryOldShop.server.persistence.Shop)
     */
    public void saveOrUpdate(Shop shopObject) throws DaoException {
        super.saveOrUpdate(shopObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.Shop)
     */
    public List queryByExample(Shop shopObject) throws DaoException {
        return super.queryByExample(Shop.class, shopObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#getShopList()
     */
    public List getShopList() throws DaoException {
        return super.loadAll(Shop.class);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#getShopList(int, int)
     */
    public List getShopList(int firstResult, int maxResult) {
        return super.loadAll(Shop.class, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByShopName(java.lang.String)
     */
    public List findByShopName(java.lang.String shopName) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shopName", shopName));
        return super.findByCriterions(Shop.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByShopName(java.lang.String, int, int)
     */
    public List findByShopName(java.lang.String shopName, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shopName", shopName));
        return super.findByCriterions(Shop.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByShortDescription(java.lang.String)
     */
    public List findByShortDescription(java.lang.String shortDescription) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shortDescription", shortDescription));
        return super.findByCriterions(Shop.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByShortDescription(java.lang.String, int, int)
     */
    public List findByShortDescription(java.lang.String shortDescription, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shortDescription", shortDescription));
        return super.findByCriterions(Shop.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByOpenABusinessTime(java.util.Date)
     */
    public List findByOpenABusinessTime(java.util.Date openABusinessTime) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("openABusinessTime", openABusinessTime));
        return super.findByCriterions(Shop.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByOpenABusinessTime(java.util.Date, int, int)
     */
    public List findByOpenABusinessTime(java.util.Date openABusinessTime, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("openABusinessTime", openABusinessTime));
        return super.findByCriterions(Shop.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByVisitCount(int)
     */
    public List findByVisitCount(int visitCount) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("visitCount", new Integer(visitCount)));
        return super.findByCriterions(Shop.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByVisitCount(int, int, int)
     */
    public List findByVisitCount(int visitCount, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("visitCount", new Integer(visitCount)));
        return super.findByCriterions(Shop.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByDetailedAddress(java.lang.String)
     */
    public List findByDetailedAddress(java.lang.String detailedAddress) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("detailedAddress", detailedAddress));
        return super.findByCriterions(Shop.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByDetailedAddress(java.lang.String, int, int)
     */
    public List findByDetailedAddress(java.lang.String detailedAddress, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("detailedAddress", detailedAddress));
        return super.findByCriterions(Shop.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByTrademark(java.lang.String)
     */
    public List findByTrademark(java.lang.String trademark) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("trademark", trademark));
        return super.findByCriterions(Shop.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByTrademark(java.lang.String, int, int)
     */
    public List findByTrademark(java.lang.String trademark, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("trademark", trademark));
        return super.findByCriterions(Shop.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByEnterTime(java.util.Date)
     */
    public List findByEnterTime(java.util.Date enterTime) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("enterTime", enterTime));
        return super.findByCriterions(Shop.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByEnterTime(java.util.Date, int, int)
     */
    public List findByEnterTime(java.util.Date enterTime, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("enterTime", enterTime));
        return super.findByCriterions(Shop.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByPhoneNumber(java.lang.String)
     */
    public List findByPhoneNumber(java.lang.String phoneNumber) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("phoneNumber", phoneNumber));
        return super.findByCriterions(Shop.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByPhoneNumber(java.lang.String, int, int)
     */
    public List findByPhoneNumber(java.lang.String phoneNumber, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("phoneNumber", phoneNumber));
        return super.findByCriterions(Shop.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByFax(java.lang.String)
     */
    public List findByFax(java.lang.String fax) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("fax", fax));
        return super.findByCriterions(Shop.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByFax(java.lang.String, int, int)
     */
    public List findByFax(java.lang.String fax, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("fax", fax));
        return super.findByCriterions(Shop.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByLongDescription(java.lang.String)
     */
    public List findByLongDescription(java.lang.String longDescription) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("longDescription", longDescription));
        return super.findByCriterions(Shop.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByLongDescription(java.lang.String, int, int)
     */
    public List findByLongDescription(java.lang.String longDescription, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("longDescription", longDescription));
        return super.findByCriterions(Shop.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByShopType(com.centuryOldShop.server.persistence.ShopType)
     */
    public List findByShopType(com.centuryOldShop.server.persistence.ShopType shopType) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shopType", shopType));
        return super.findByCriterions(Shop.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByShopType(com.centuryOldShop.server.persistence.ShopType, int, int)
     */
    public List findByShopType(com.centuryOldShop.server.persistence.ShopType shopType, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shopType", shopType));
        return super.findByCriterions(Shop.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByShopArea(com.centuryOldShop.server.persistence.ShopArea)
     */
    public List findByShopArea(com.centuryOldShop.server.persistence.ShopArea shopArea) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shopArea", shopArea));
        return super.findByCriterions(Shop.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopDao#findByShopArea(com.centuryOldShop.server.persistence.ShopArea, int, int)
     */
    public List findByShopArea(com.centuryOldShop.server.persistence.ShopArea shopArea, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shopArea", shopArea));
        return super.findByCriterions(Shop.class, cs, firstResult, maxResult);
    }
}