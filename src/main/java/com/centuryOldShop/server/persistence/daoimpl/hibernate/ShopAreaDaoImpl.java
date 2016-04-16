/***********************************************************************
 * Module:  ShopAreaDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class ShopArea
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.ShopArea;
import com.centuryOldShop.server.persistence.ShopAreaPK;
import com.centuryOldShop.server.persistence.dao.ShopAreaDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of ShopAreaDao interface
 */
@SuppressWarnings("ALL")
public class ShopAreaDaoImpl extends HibernateDaoImpl implements ShopAreaDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopAreaDao#save(com.centuryOldShop.server.persistence.ShopArea)
     */
    public Serializable save(ShopArea shopAreaObject) throws DaoException {
        return super.save(shopAreaObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopAreaDao#load(com.centuryOldShop.server.persistence.ShopAreaPK)
     */
    public ShopArea load(ShopAreaPK pk) throws DaoException {
        List cs = new ArrayList();
        String[] paramNames = new String[]{"shopAreaId"};
        Object[] values = new Object[]{new Long(pk.getShopAreaId())};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(ShopArea.class, cs);
        return (((list != null) && (list.size() > 0)) ? (ShopArea) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopAreaDao#delete(com.centuryOldShop.server.persistence.ShopArea)
     */
    public void delete(ShopArea shopAreaObject) throws DaoException {
        super.delete(shopAreaObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopAreaDao#update(com.centuryOldShop.server.persistence.ShopArea)
     */
    public void update(ShopArea shopAreaObject) throws DaoException {
        super.update(shopAreaObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopAreaDao#saveOrUpdate(com.centuryOldShop.server.persistence.ShopArea)
     */
    public void saveOrUpdate(ShopArea shopAreaObject) throws DaoException {
        super.saveOrUpdate(shopAreaObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopAreaDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.ShopArea)
     */
    public List queryByExample(ShopArea shopAreaObject) throws DaoException {
        return super.queryByExample(ShopArea.class, shopAreaObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopAreaDao#getShopAreaList()
     */
    public List getShopAreaList() throws DaoException {
        return super.loadAll(ShopArea.class);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopAreaDao#getShopAreaList(int, int)
     */
    public List getShopAreaList(int firstResult, int maxResult) {
        return super.loadAll(ShopArea.class, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopAreaDao#findByShopAreaName(java.lang.String)
     */
    public List findByShopAreaName(java.lang.String shopAreaName) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shopAreaName", shopAreaName));
        return super.findByCriterions(ShopArea.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopAreaDao#findByShopAreaName(java.lang.String, int, int)
     */
    public List findByShopAreaName(java.lang.String shopAreaName, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("shopAreaName", shopAreaName));
        return super.findByCriterions(ShopArea.class, cs, firstResult, maxResult);
    }
}