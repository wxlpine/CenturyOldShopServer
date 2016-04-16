/***********************************************************************
 * Module:  ShopStoryDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class ShopStory
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.ShopStory;
import com.centuryOldShop.server.persistence.ShopStoryPK;
import com.centuryOldShop.server.persistence.dao.ShopStoryDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of ShopStoryDao interface
 */
@SuppressWarnings("ALL")
public class ShopStoryDaoImpl extends HibernateDaoImpl implements ShopStoryDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#save(com.centuryOldShop.server.persistence.ShopStory)
     */
    public Serializable save(ShopStory shopStoryObject) throws DaoException {
        return super.save(shopStoryObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#load(com.centuryOldShop.server.persistence.ShopStoryPK)
     */
    public ShopStory load(ShopStoryPK pk) throws DaoException {
        List cs = new ArrayList();
        String[] paramNames = new String[]{"storyId"};
        Object[] values = new Object[]{new Long(pk.getStoryId())};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(ShopStory.class, cs);
        return (((list != null) && (list.size() > 0)) ? (ShopStory) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#delete(com.centuryOldShop.server.persistence.ShopStory)
     */
    public void delete(ShopStory shopStoryObject) throws DaoException {
        super.delete(shopStoryObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#update(com.centuryOldShop.server.persistence.ShopStory)
     */
    public void update(ShopStory shopStoryObject) throws DaoException {
        super.update(shopStoryObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#saveOrUpdate(com.centuryOldShop.server.persistence.ShopStory)
     */
    public void saveOrUpdate(ShopStory shopStoryObject) throws DaoException {
        super.saveOrUpdate(shopStoryObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.ShopStory)
     */
    public List queryByExample(ShopStory shopStoryObject) throws DaoException {
        return super.queryByExample(ShopStory.class, shopStoryObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#getShopStoryList()
     */
    public List getShopStoryList() throws DaoException {
        return super.loadAll(ShopStory.class);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#getShopStoryList(int, int)
     */
    public List getShopStoryList(int firstResult, int maxResult) {
        return super.loadAll(ShopStory.class, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#findByStoryName(java.lang.String)
     */
    public List findByStoryName(java.lang.String storyName) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("storyName", storyName));
        return super.findByCriterions(ShopStory.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#findByStoryName(java.lang.String, int, int)
     */
    public List findByStoryName(java.lang.String storyName, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("storyName", storyName));
        return super.findByCriterions(ShopStory.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#findByStoryContentUrl(java.lang.String)
     */
    public List findByStoryContentUrl(java.lang.String storyContentUrl) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("storyContentUrl", storyContentUrl));
        return super.findByCriterions(ShopStory.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#findByStoryContentUrl(java.lang.String, int, int)
     */
    public List findByStoryContentUrl(java.lang.String storyContentUrl, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("storyContentUrl", storyContentUrl));
        return super.findByCriterions(ShopStory.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#findByAddedTime(java.util.Date)
     */
    public List findByAddedTime(java.util.Date addedTime) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("addedTime", addedTime));
        return super.findByCriterions(ShopStory.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#findByAddedTime(java.util.Date, int, int)
     */
    public List findByAddedTime(java.util.Date addedTime, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("addedTime", addedTime));
        return super.findByCriterions(ShopStory.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#findByShop(com.centuryOldShop.server.persistence.Shop)
     */
    public List findByShop(com.centuryOldShop.server.persistence.Shop shop) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shop", shop));
        return super.findByCriterions(ShopStory.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#findByShop(com.centuryOldShop.server.persistence.Shop, int, int)
     */
    public List findByShop(com.centuryOldShop.server.persistence.Shop shop, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shop", shop));
        return super.findByCriterions(ShopStory.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#findByShopStoryType(com.centuryOldShop.server.persistence.ShopStoryType)
     */
    public List findByShopStoryType(com.centuryOldShop.server.persistence.ShopStoryType shopStoryType) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shopStoryType", shopStoryType));
        return super.findByCriterions(ShopStory.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#findByShopStoryType(com.centuryOldShop.server.persistence.ShopStoryType, int, int)
     */
    public List findByShopStoryType(com.centuryOldShop.server.persistence.ShopStoryType shopStoryType, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shopStoryType", shopStoryType));
        return super.findByCriterions(ShopStory.class, cs, firstResult, maxResult);
    }
}