/***********************************************************************
 * Module:  ShopHistoryDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class ShopHistory
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.ShopHistory;
import com.centuryOldShop.server.persistence.ShopHistoryPK;
import com.centuryOldShop.server.persistence.dao.ShopHistoryDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of ShopHistoryDao interface
 */
@SuppressWarnings("ALL")
public class ShopHistoryDaoImpl extends HibernateDaoImpl implements ShopHistoryDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#save(com.centuryOldShop.server.persistence.ShopHistory)
     */
    public Serializable save(ShopHistory shopHistoryObject) throws DaoException {
        return super.save(shopHistoryObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#load(com.centuryOldShop.server.persistence.ShopHistoryPK)
     */
    public ShopHistory load(ShopHistoryPK pk) throws DaoException {
        List cs = new ArrayList();
        String[] paramNames = new String[]{"shopHistoryId"};
        Object[] values = new Object[]{new Long(pk.getShopHistoryId())};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(ShopHistory.class, cs);
        return (((list != null) && (list.size() > 0)) ? (ShopHistory) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#delete(com.centuryOldShop.server.persistence.ShopHistory)
     */
    public void delete(ShopHistory shopHistoryObject) throws DaoException {
        super.delete(shopHistoryObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#update(com.centuryOldShop.server.persistence.ShopHistory)
     */
    public void update(ShopHistory shopHistoryObject) throws DaoException {
        super.update(shopHistoryObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#saveOrUpdate(com.centuryOldShop.server.persistence.ShopHistory)
     */
    public void saveOrUpdate(ShopHistory shopHistoryObject) throws DaoException {
        super.saveOrUpdate(shopHistoryObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.ShopHistory)
     */
    public List queryByExample(ShopHistory shopHistoryObject) throws DaoException {
        return super.queryByExample(ShopHistory.class, shopHistoryObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#getShopHistoryList()
     */
    public List getShopHistoryList() throws DaoException {
        return super.loadAll(ShopHistory.class);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#getShopHistoryList(int, int)
     */
    public List getShopHistoryList(int firstResult, int maxResult) {
        return super.loadAll(ShopHistory.class, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByTitle(java.lang.String)
     */
    public List findByTitle(java.lang.String title) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("title", title));
        return super.findByCriterions(ShopHistory.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByTitle(java.lang.String, int, int)
     */
    public List findByTitle(java.lang.String title, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("title", title));
        return super.findByCriterions(ShopHistory.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findBySmallPhotoUrl(java.lang.String)
     */
    public List findBySmallPhotoUrl(java.lang.String smallPhotoUrl) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("smallPhotoUrl", smallPhotoUrl));
        return super.findByCriterions(ShopHistory.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findBySmallPhotoUrl(java.lang.String, int, int)
     */
    public List findBySmallPhotoUrl(java.lang.String smallPhotoUrl, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("smallPhotoUrl", smallPhotoUrl));
        return super.findByCriterions(ShopHistory.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByShortDescription(java.lang.String)
     */
    public List findByShortDescription(java.lang.String shortDescription) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shortDescription", shortDescription));
        return super.findByCriterions(ShopHistory.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByShortDescription(java.lang.String, int, int)
     */
    public List findByShortDescription(java.lang.String shortDescription, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shortDescription", shortDescription));
        return super.findByCriterions(ShopHistory.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByPublishTime(java.util.Date)
     */
    public List findByPublishTime(java.util.Date publishTime) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("publishTime", publishTime));
        return super.findByCriterions(ShopHistory.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByPublishTime(java.util.Date, int, int)
     */
    public List findByPublishTime(java.util.Date publishTime, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("publishTime", publishTime));
        return super.findByCriterions(ShopHistory.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByVisitCount(int)
     */
    public List findByVisitCount(int visitCount) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("visitCount", new Integer(visitCount)));
        return super.findByCriterions(ShopHistory.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByVisitCount(int, int, int)
     */
    public List findByVisitCount(int visitCount, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("visitCount", new Integer(visitCount)));
        return super.findByCriterions(ShopHistory.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByDetailedIntroductionPageUrl(java.lang.String)
     */
    public List findByDetailedIntroductionPageUrl(java.lang.String detailedIntroductionPageUrl) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("detailedIntroductionPageUrl", detailedIntroductionPageUrl));
        return super.findByCriterions(ShopHistory.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByDetailedIntroductionPageUrl(java.lang.String, int, int)
     */
    public List findByDetailedIntroductionPageUrl(java.lang.String detailedIntroductionPageUrl, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("detailedIntroductionPageUrl", detailedIntroductionPageUrl));
        return super.findByCriterions(ShopHistory.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByShop(com.centuryOldShop.server.persistence.Shop)
     */
    public List findByShop(com.centuryOldShop.server.persistence.Shop shop) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shop", shop));
        return super.findByCriterions(ShopHistory.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopHistoryDao#findByShop(com.centuryOldShop.server.persistence.Shop, int, int)
     */
    public List findByShop(com.centuryOldShop.server.persistence.Shop shop, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shop", shop));
        return super.findByCriterions(ShopHistory.class, cs, firstResult, maxResult);
    }
}