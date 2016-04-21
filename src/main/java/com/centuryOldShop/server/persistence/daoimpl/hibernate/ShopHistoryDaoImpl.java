/***********************************************************************
 * Module:  ShopHistoryDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class ShopHistory
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.Shop;
import com.centuryOldShop.server.persistence.ShopHistory;
import com.centuryOldShop.server.persistence.ShopHistoryPK;
import com.centuryOldShop.server.persistence.dao.ShopHistoryDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of ShopHistoryDao interface
 */

public class ShopHistoryDaoImpl extends HibernateDaoImpl implements ShopHistoryDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#save(com.centuryOldShop.server.persistence.ShopHistory)
     */
    @Override
    public Serializable save(ShopHistory shopHistoryObject) throws DaoException {
        return super.save(shopHistoryObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#load(com.centuryOldShop.server.persistence.ShopHistoryPK)
     */
    @Override
    public ShopHistory load(ShopHistoryPK pk) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        String[] paramNames = new String[]{"shopHistoryId"};
        Object[] values = new Object[]{new Long(pk.getShopHistoryId())};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(ShopHistory.class, cs, null, null, null);
        return (((list != null) && (list.size() > 0)) ? (ShopHistory) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#delete(com.centuryOldShop.server.persistence.ShopHistory)
     */
    @Override
    public void delete(ShopHistory shopHistoryObject) throws DaoException {
        super.delete(shopHistoryObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#update(com.centuryOldShop.server.persistence.ShopHistory)
     */
    @Override
    public void update(ShopHistory shopHistoryObject) throws DaoException {
        super.update(shopHistoryObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#saveOrUpdate(com.centuryOldShop.server.persistence.ShopHistory)
     */
    @Override
    public void saveOrUpdate(ShopHistory shopHistoryObject) throws DaoException {
        super.saveOrUpdate(shopHistoryObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.ShopHistory)
     */
    @Override
    public List<ShopHistory> queryByExample(ShopHistory shopHistoryObject) throws DaoException {
        return super.queryByExample(ShopHistory.class, shopHistoryObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#getShopHistoryList()
     */
    @Override
    public List<ShopHistory> getShopHistoryList() throws DaoException {
        return super.loadAll(ShopHistory.class, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#getShopHistoryList(int, int)
     */
    @Override
    public List<ShopHistory> getShopHistoryList(int firstResult, int maxResult) {
        return super.loadAll(ShopHistory.class, firstResult, maxResult, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByTitle(java.lang.String)
     */
    @Override
    public List<ShopHistory> findByTitle(java.lang.String title) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("title", title));
        return super.findByCriterions(ShopHistory.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByTitle(java.lang.String, int, int)
     */
    @Override
    public List<ShopHistory> findByTitle(java.lang.String title, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("title", title));
        return super.findByCriterions(ShopHistory.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findBySmallPhotoUrl(java.lang.String)
     */
    @Override
    public List<ShopHistory> findBySmallPhotoUrl(java.lang.String smallPhotoUrl) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("smallPhotoUrl", smallPhotoUrl));
        return super.findByCriterions(ShopHistory.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findBySmallPhotoUrl(java.lang.String, int, int)
     */
    @Override
    public List<ShopHistory> findBySmallPhotoUrl(java.lang.String smallPhotoUrl, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("smallPhotoUrl", smallPhotoUrl));
        return super.findByCriterions(ShopHistory.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByShortDescription(java.lang.String)
     */
    @Override
    public List<ShopHistory> findByShortDescription(java.lang.String shortDescription) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shortDescription", shortDescription));
        return super.findByCriterions(ShopHistory.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByShortDescription(java.lang.String, int, int)
     */
    @Override
    public List<ShopHistory> findByShortDescription(java.lang.String shortDescription, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shortDescription", shortDescription));
        return super.findByCriterions(ShopHistory.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByPublishTime(java.util.Date)
     */
    @Override
    public List<ShopHistory> findByPublishTime(java.util.Date publishTime) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("publishTime", publishTime));
        return super.findByCriterions(ShopHistory.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByPublishTime(java.util.Date, int, int)
     */
    @Override
    public List<ShopHistory> findByPublishTime(java.util.Date publishTime, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("publishTime", publishTime));
        return super.findByCriterions(ShopHistory.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByVisitCount(int)
     */
    @Override
    public List<ShopHistory> findByVisitCount(int visitCount) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("visitCount", new Integer(visitCount)));
        return super.findByCriterions(ShopHistory.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByVisitCount(int, int, int)
     */
    @Override
    public List<ShopHistory> findByVisitCount(int visitCount, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("visitCount", new Integer(visitCount)));
        return super.findByCriterions(ShopHistory.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByDetailedIntroductionPageUrl(java.lang.String)
     */
    @Override
    public List<ShopHistory> findByDetailedIntroductionPageUrl(java.lang.String detailedIntroductionPageUrl) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("detailedIntroductionPageUrl", detailedIntroductionPageUrl));
        return super.findByCriterions(ShopHistory.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByDetailedIntroductionPageUrl(java.lang.String, int, int)
     */
    @Override
    public List<ShopHistory> findByDetailedIntroductionPageUrl(java.lang.String detailedIntroductionPageUrl, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("detailedIntroductionPageUrl", detailedIntroductionPageUrl));
        return super.findByCriterions(ShopHistory.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByShop(com.centuryOldShop.server.persistence.Shop)
     */
    @Override
    public List<ShopHistory> findByShop(Shop shop) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shop", shop));
        return super.findByCriterions(ShopHistory.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByShop(com.centuryOldShop.server.persistence.Shop, int, int)
     */
    @Override
    public List<ShopHistory> findByShop(Shop shop, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shop", shop));
        return super.findByCriterions(ShopHistory.class, cs, null, firstResult, maxResult);
    }

    @Override
    public List<ShopHistory> findByShopOrderByPublishTimeDesc(Shop shop,
            int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shop", shop));

        List<Order> orders = new ArrayList<>();
        orders.add(Order.desc("publishTime"));

        return super.findByCriterions(ShopHistory.class, cs, orders, firstResult, maxResult);
    }
}