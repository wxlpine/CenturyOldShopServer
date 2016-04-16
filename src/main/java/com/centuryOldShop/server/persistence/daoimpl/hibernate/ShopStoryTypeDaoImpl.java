/***********************************************************************
 * Module:  ShopStoryTypeDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class ShopStoryType
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.ShopStoryType;
import com.centuryOldShop.server.persistence.ShopStoryTypePK;
import com.centuryOldShop.server.persistence.dao.ShopStoryTypeDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of ShopStoryTypeDao interface
 */
@SuppressWarnings("ALL")
public class ShopStoryTypeDaoImpl extends HibernateDaoImpl implements ShopStoryTypeDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryTypeDao#save(com.centuryOldShop.server.persistence.ShopStoryType)
     */
    public Serializable save(ShopStoryType shopStoryTypeObject) throws DaoException {
        return super.save(shopStoryTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryTypeDao#load(com.centuryOldShop.server.persistence.ShopStoryTypePK)
     */
    public ShopStoryType load(ShopStoryTypePK pk) throws DaoException {
        List cs = new ArrayList();
        String[] paramNames = new String[]{"storyTypeName"};
        Object[] values = new Object[]{pk.getStoryTypeName()};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(ShopStoryType.class, cs);
        return (((list != null) && (list.size() > 0)) ? (ShopStoryType) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryTypeDao#delete(com.centuryOldShop.server.persistence.ShopStoryType)
     */
    public void delete(ShopStoryType shopStoryTypeObject) throws DaoException {
        super.delete(shopStoryTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryTypeDao#update(com.centuryOldShop.server.persistence.ShopStoryType)
     */
    public void update(ShopStoryType shopStoryTypeObject) throws DaoException {
        super.update(shopStoryTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryTypeDao#saveOrUpdate(com.centuryOldShop.server.persistence.ShopStoryType)
     */
    public void saveOrUpdate(ShopStoryType shopStoryTypeObject) throws DaoException {
        super.saveOrUpdate(shopStoryTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryTypeDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.ShopStoryType)
     */
    public List queryByExample(ShopStoryType shopStoryTypeObject) throws DaoException {
        return super.queryByExample(ShopStoryType.class, shopStoryTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryTypeDao#getShopStoryTypeList()
     */
    public List getShopStoryTypeList() throws DaoException {
        return super.loadAll(ShopStoryType.class);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopStoryTypeDao#getShopStoryTypeList(int, int)
     */
    public List getShopStoryTypeList(int firstResult, int maxResult) {
        return super.loadAll(ShopStoryType.class, firstResult, maxResult);
    }

}