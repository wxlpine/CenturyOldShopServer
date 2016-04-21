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
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of ShopStoryDao interface
 */

public class ShopStoryDaoImpl extends HibernateDaoImpl implements ShopStoryDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#save(com.centuryOldShop.server.persistence.ShopStory)
     */
    @Override
    public Serializable save(ShopStory shopStoryObject) throws DaoException {
        return super.save(shopStoryObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#load(com.centuryOldShop.server.persistence.ShopStoryPK)
     */
    @Override
    public ShopStory load(ShopStoryPK pk) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        String[] paramNames = new String[]{"storyId"};
        Object[] values = new Object[]{new Long(pk.getStoryId())};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(ShopStory.class, cs, null, null, null);
        return (((list != null) && (list.size() > 0)) ? (ShopStory) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#delete(com.centuryOldShop.server.persistence.ShopStory)
     */
    @Override
    public void delete(ShopStory shopStoryObject) throws DaoException {
        super.delete(shopStoryObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#update(com.centuryOldShop.server.persistence.ShopStory)
     */
    @Override
    public void update(ShopStory shopStoryObject) throws DaoException {
        super.update(shopStoryObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#saveOrUpdate(com.centuryOldShop.server.persistence.ShopStory)
     */
    @Override
    public void saveOrUpdate(ShopStory shopStoryObject) throws DaoException {
        super.saveOrUpdate(shopStoryObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.ShopStory)
     */
    @Override
    public List<ShopStory> queryByExample(ShopStory shopStoryObject) throws DaoException {
        return super.queryByExample(ShopStory.class, shopStoryObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#getShopStoryList()
     */
    @Override
    public List<ShopStory> getShopStoryList() throws DaoException {
        return super.loadAll(ShopStory.class, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#getShopStoryList(int, int)
     */
    @Override
    public List<ShopStory> getShopStoryList(int firstResult, int maxResult) {
        return super.loadAll(ShopStory.class, firstResult, maxResult, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#findByStoryName(java.lang.String)
     */
    @Override
    public List<ShopStory> findByStoryName(java.lang.String storyName) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("storyName", storyName));
        return super.findByCriterions(ShopStory.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#findByStoryName(java.lang.String, int, int)
     */
    @Override
    public List<ShopStory> findByStoryName(java.lang.String storyName, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("storyName", storyName));
        return super.findByCriterions(ShopStory.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#findByStoryContentUrl(java.lang.String)
     */
    @Override
    public List<ShopStory> findByStoryContentUrl(java.lang.String storyContentUrl) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("storyContentUrl", storyContentUrl));
        return super.findByCriterions(ShopStory.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#findByStoryContentUrl(java.lang.String, int, int)
     */
    @Override
    public List<ShopStory> findByStoryContentUrl(java.lang.String storyContentUrl, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("storyContentUrl", storyContentUrl));
        return super.findByCriterions(ShopStory.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#findByAddedTime(java.util.Date)
     */
    @Override
    public List<ShopStory> findByAddedTime(java.util.Date addedTime) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("addedTime", addedTime));
        return super.findByCriterions(ShopStory.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#findByAddedTime(java.util.Date, int, int)
     */
    @Override
    public List<ShopStory> findByAddedTime(java.util.Date addedTime, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("addedTime", addedTime));
        return super.findByCriterions(ShopStory.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#findByShop(com.centuryOldShop.server.persistence.Shop)
     */
    @Override
    public List<ShopStory> findByShop(com.centuryOldShop.server.persistence.Shop shop) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shop", shop));
        return super.findByCriterions(ShopStory.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#findByShop(com.centuryOldShop.server.persistence.Shop, int, int)
     */
    @Override
    public List<ShopStory> findByShop(com.centuryOldShop.server.persistence.Shop shop, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shop", shop));
        return super.findByCriterions(ShopStory.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#findByShopStoryType(com.centuryOldShop.server.persistence.ShopStoryType)
     */
    @Override
    public List<ShopStory> findByShopStoryType(com.centuryOldShop.server.persistence.ShopStoryType shopStoryType) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shopStoryType", shopStoryType));
        return super.findByCriterions(ShopStory.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryDao#findByShopStoryType(com.centuryOldShop.server.persistence.ShopStoryType, int, int)
     */
    @Override
    public List<ShopStory> findByShopStoryType(com.centuryOldShop.server.persistence.ShopStoryType shopStoryType, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shopStoryType", shopStoryType));
        return super.findByCriterions(ShopStory.class, cs, null, firstResult, maxResult);
    }
}