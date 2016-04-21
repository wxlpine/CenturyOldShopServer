/***********************************************************************
 * Module:  NewsDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class News
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.News;
import com.centuryOldShop.server.persistence.NewsPK;
import com.centuryOldShop.server.persistence.dao.NewsDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of NewsDao interface
 */

public class NewsDaoImpl extends HibernateDaoImpl implements NewsDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.NewsDao#save(com.centuryOldShop.server.persistence.News)
     */
    @Override
    public Serializable save(News newsObject) throws DaoException {
        return super.save(newsObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.NewsDao#load(com.centuryOldShop.server.persistence.NewsPK)
     */
    @Override
    public News load(NewsPK pk) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        String[] paramNames = new String[]{"newsId"};
        Object[] values = new Object[]{new Long(pk.getNewsId())};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(News.class, cs);
        return (((list != null) && (list.size() > 0)) ? (News) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.NewsDao#delete(com.centuryOldShop.server.persistence.News)
     */
    @Override
    public void delete(News newsObject) throws DaoException {
        super.delete(newsObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.NewsDao#update(com.centuryOldShop.server.persistence.News)
     */
    @Override
    public void update(News newsObject) throws DaoException {
        super.update(newsObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.NewsDao#saveOrUpdate(com.centuryOldShop.server.persistence.News)
     */
    @Override
    public void saveOrUpdate(News newsObject) throws DaoException {
        super.saveOrUpdate(newsObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.NewsDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.News)
     */
    @Override
    public List<News> queryByExample(News newsObject) throws DaoException {
        return super.queryByExample(News.class, newsObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.NewsDao#getNewsList()
     */
    @Override
    public List<News> getNewsList() throws DaoException {
        return super.loadAll(News.class, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.NewsDao#getNewsList(int, int)
     */
    @Override
    public List<News> getNewsList(int firstResult, int maxResult) {
        return super.loadAll(News.class, firstResult, maxResult, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.NewsDao#findByTitle(java.lang.String)
     */
    @Override
    public List<News> findByTitle(java.lang.String title) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("title", title));
        return super.findByCriterions(News.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.NewsDao#findByTitle(java.lang.String, int, int)
     */
    @Override
    public List<News> findByTitle(java.lang.String title, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("title", title));
        return super.findByCriterions(News.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.NewsDao#findByContentUrl(java.lang.String)
     */
    @Override
    public List<News> findByContentUrl(java.lang.String contentUrl) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("contentUrl", contentUrl));
        return super.findByCriterions(News.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.NewsDao#findByContentUrl(java.lang.String, int, int)
     */
    @Override
    public List<News> findByContentUrl(java.lang.String contentUrl, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("contentUrl", contentUrl));
        return super.findByCriterions(News.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.NewsDao#findByPublishTime(java.util.Date)
     */
    @Override
    public List<News> findByPublishTime(java.util.Date publishTime) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("publishTime", publishTime));
        return super.findByCriterions(News.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.NewsDao#findByPublishTime(java.util.Date, int, int)
     */
    @Override
    public List<News> findByPublishTime(java.util.Date publishTime, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("publishTime", publishTime));
        return super.findByCriterions(News.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.NewsDao#findByReadCount(int)
     */
    @Override
    public List<News> findByReadCount(int readCount) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("readCount", new Integer(readCount)));
        return super.findByCriterions(News.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.NewsDao#findByReadCount(int, int, int)
     */
    @Override
    public List<News> findByReadCount(int readCount, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("readCount", new Integer(readCount)));
        return super.findByCriterions(News.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.NewsDao#findBySpotScene(java.lang.String)
     */
    @Override
    public List<News> findBySpotScene(java.lang.String spotScene) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("spotScene", spotScene));
        return super.findByCriterions(News.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.NewsDao#findBySpotScene(java.lang.String, int, int)
     */
    @Override
    public List<News> findBySpotScene(java.lang.String spotScene, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("spotScene", spotScene));
        return super.findByCriterions(News.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.NewsDao#findByShop(com.centuryOldShop.server.persistence.Shop)
     */
    @Override
    public List<News> findByShop(com.centuryOldShop.server.persistence.Shop shop) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shop", shop));
        return super.findByCriterions(News.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.NewsDao#findByShop(com.centuryOldShop.server.persistence.Shop, int, int)
     */
    @Override
    public List<News> findByShop(com.centuryOldShop.server.persistence.Shop shop, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shop", shop));
        return super.findByCriterions(News.class, cs, firstResult, maxResult);
    }
}