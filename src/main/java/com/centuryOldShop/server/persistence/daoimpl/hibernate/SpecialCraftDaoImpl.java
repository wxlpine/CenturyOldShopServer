/***********************************************************************
 * Module:  SpecialCraftDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class SpecialCraft
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.SpecialCraft;
import com.centuryOldShop.server.persistence.SpecialCraftPK;
import com.centuryOldShop.server.persistence.dao.SpecialCraftDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of SpecialCraftDao interface
 */
@SuppressWarnings("ALL")
public class SpecialCraftDaoImpl extends HibernateDaoImpl implements SpecialCraftDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.SpecialCraftDao#save(com.centuryOldShop.server.persistence.SpecialCraft)
     */
    public Serializable save(SpecialCraft specialCraftObject) throws DaoException {
        return super.save(specialCraftObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.SpecialCraftDao#load(com.centuryOldShop.server.persistence.SpecialCraftPK)
     */
    public SpecialCraft load(SpecialCraftPK pk) throws DaoException {
        List cs = new ArrayList();
        String[] paramNames = new String[]{"specialCraftId"};
        Object[] values = new Object[]{new Long(pk.getSpecialCraftId())};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(SpecialCraft.class, cs);
        return (((list != null) && (list.size() > 0)) ? (SpecialCraft) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.SpecialCraftDao#delete(com.centuryOldShop.server.persistence.SpecialCraft)
     */
    public void delete(SpecialCraft specialCraftObject) throws DaoException {
        super.delete(specialCraftObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.SpecialCraftDao#update(com.centuryOldShop.server.persistence.SpecialCraft)
     */
    public void update(SpecialCraft specialCraftObject) throws DaoException {
        super.update(specialCraftObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.SpecialCraftDao#saveOrUpdate(com.centuryOldShop.server.persistence.SpecialCraft)
     */
    public void saveOrUpdate(SpecialCraft specialCraftObject) throws DaoException {
        super.saveOrUpdate(specialCraftObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.SpecialCraftDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.SpecialCraft)
     */
    public List queryByExample(SpecialCraft specialCraftObject) throws DaoException {
        return super.queryByExample(SpecialCraft.class, specialCraftObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.SpecialCraftDao#getSpecialCraftList()
     */
    public List getSpecialCraftList() throws DaoException {
        return super.loadAll(SpecialCraft.class);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.SpecialCraftDao#getSpecialCraftList(int, int)
     */
    public List getSpecialCraftList(int firstResult, int maxResult) {
        return super.loadAll(SpecialCraft.class, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.SpecialCraftDao#findByTitle(java.lang.String)
     */
    public List findByTitle(java.lang.String title) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("title", title));
        return super.findByCriterions(SpecialCraft.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.SpecialCraftDao#findByTitle(java.lang.String, int, int)
     */
    public List findByTitle(java.lang.String title, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("title", title));
        return super.findByCriterions(SpecialCraft.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.SpecialCraftDao#findBySmallPhotoUrl(java.lang.String)
     */
    public List findBySmallPhotoUrl(java.lang.String smallPhotoUrl) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("smallPhotoUrl", smallPhotoUrl));
        return super.findByCriterions(SpecialCraft.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.SpecialCraftDao#findBySmallPhotoUrl(java.lang.String, int, int)
     */
    public List findBySmallPhotoUrl(java.lang.String smallPhotoUrl, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("smallPhotoUrl", smallPhotoUrl));
        return super.findByCriterions(SpecialCraft.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.SpecialCraftDao#findByIntroductionUrl(java.lang.String)
     */
    public List findByIntroductionUrl(java.lang.String introductionUrl) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("introductionUrl", introductionUrl));
        return super.findByCriterions(SpecialCraft.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.SpecialCraftDao#findByIntroductionUrl(java.lang.String, int, int)
     */
    public List findByIntroductionUrl(java.lang.String introductionUrl, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("introductionUrl", introductionUrl));
        return super.findByCriterions(SpecialCraft.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.SpecialCraftDao#findByAddedTime(java.util.Date)
     */
    public List findByAddedTime(java.util.Date addedTime) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("addedTime", addedTime));
        return super.findByCriterions(SpecialCraft.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.SpecialCraftDao#findByAddedTime(java.util.Date, int, int)
     */
    public List findByAddedTime(java.util.Date addedTime, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("addedTime", addedTime));
        return super.findByCriterions(SpecialCraft.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.SpecialCraftDao#findByShortIntro(java.lang.String)
     */
    public List findByShortIntro(java.lang.String shortIntro) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shortIntro", shortIntro));
        return super.findByCriterions(SpecialCraft.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.SpecialCraftDao#findByShortIntro(java.lang.String, int, int)
     */
    public List findByShortIntro(java.lang.String shortIntro, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shortIntro", shortIntro));
        return super.findByCriterions(SpecialCraft.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.SpecialCraftDao#findByShop(com.centuryOldShop.server.persistence.Shop)
     */
    public List findByShop(com.centuryOldShop.server.persistence.Shop shop) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shop", shop));
        return super.findByCriterions(SpecialCraft.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.SpecialCraftDao#findByShop(com.centuryOldShop.server.persistence.Shop, int, int)
     */
    public List findByShop(com.centuryOldShop.server.persistence.Shop shop, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shop", shop));
        return super.findByCriterions(SpecialCraft.class, cs, firstResult, maxResult);
    }
}