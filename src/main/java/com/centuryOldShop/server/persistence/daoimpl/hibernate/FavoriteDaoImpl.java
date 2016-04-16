/***********************************************************************
 * Module:  FavoriteDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class Favorite
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.Favorite;
import com.centuryOldShop.server.persistence.FavoritePK;
import com.centuryOldShop.server.persistence.dao.FavoriteDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of FavoriteDao interface
 */
@SuppressWarnings("ALL")
public class FavoriteDaoImpl extends HibernateDaoImpl implements FavoriteDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.FavoriteDao#save(com.centuryOldShop.server.persistence.Favorite)
     */
    public Serializable save(Favorite favoriteObject) throws DaoException {
        return super.save(favoriteObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.FavoriteDao#load(com.centuryOldShop.server.persistence.FavoritePK)
     */
    public Favorite load(FavoritePK pk) throws DaoException {
        List cs = new ArrayList();
        String[] paramNames = new String[]{};
        Object[] values = new Object[]{};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(Favorite.class, cs);
        return (((list != null) && (list.size() > 0)) ? (Favorite) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.FavoriteDao#delete(com.centuryOldShop.server.persistence.Favorite)
     */
    public void delete(Favorite favoriteObject) throws DaoException {
        super.delete(favoriteObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.FavoriteDao#update(com.centuryOldShop.server.persistence.Favorite)
     */
    public void update(Favorite favoriteObject) throws DaoException {
        super.update(favoriteObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.FavoriteDao#saveOrUpdate(com.centuryOldShop.server.persistence.Favorite)
     */
    public void saveOrUpdate(Favorite favoriteObject) throws DaoException {
        super.saveOrUpdate(favoriteObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.FavoriteDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.Favorite)
     */
    public List queryByExample(Favorite favoriteObject) throws DaoException {
        return super.queryByExample(Favorite.class, favoriteObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.FavoriteDao#getFavoriteList()
     */
    public List getFavoriteList() throws DaoException {
        return super.loadAll(Favorite.class);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.FavoriteDao#getFavoriteList(int, int)
     */
    public List getFavoriteList(int firstResult, int maxResult) {
        return super.loadAll(Favorite.class, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.FavoriteDao#findByAddTime(java.util.Date)
     */
    public List findByAddTime(java.util.Date addTime) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("addTime", addTime));
        return super.findByCriterions(Favorite.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.FavoriteDao#findByAddTime(java.util.Date, int, int)
     */
    public List findByAddTime(java.util.Date addTime, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("addTime", addTime));
        return super.findByCriterions(Favorite.class, cs, firstResult, maxResult);
    }
}