/***********************************************************************
 * Module:  ShopTypeDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class ShopType
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.ShopType;
import com.centuryOldShop.server.persistence.ShopTypePK;
import com.centuryOldShop.server.persistence.dao.ShopTypeDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of ShopTypeDao interface
 */

public class ShopTypeDaoImpl extends HibernateDaoImpl implements ShopTypeDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopTypeDao#save(com.centuryOldShop.server.persistence.ShopType)
     */
    @Override
    public Serializable save(ShopType shopTypeObject) throws DaoException {
        return super.save(shopTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopTypeDao#load(com.centuryOldShop.server.persistence.ShopTypePK)
     */
    @Override
    public ShopType load(ShopTypePK pk) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        String[] paramNames = new String[]{"shopTypeName"};
        Object[] values = new Object[]{pk.getShopTypeName()};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(ShopType.class, cs, null, null, null);
        return (((list != null) && (list.size() > 0)) ? (ShopType) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopTypeDao#delete(com.centuryOldShop.server.persistence.ShopType)
     */
    @Override
    public void delete(ShopType shopTypeObject) throws DaoException {
        super.delete(shopTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopTypeDao#update(com.centuryOldShop.server.persistence.ShopType)
     */
    @Override
    public void update(ShopType shopTypeObject) throws DaoException {
        super.update(shopTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopTypeDao#saveOrUpdate(com.centuryOldShop.server.persistence.ShopType)
     */
    @Override
    public void saveOrUpdate(ShopType shopTypeObject) throws DaoException {
        super.saveOrUpdate(shopTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopTypeDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.ShopType)
     */
    @Override
    public List<ShopType> queryByExample(ShopType shopTypeObject) throws DaoException {
        return super.queryByExample(ShopType.class, shopTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopTypeDao#getShopTypeList()
     */
    @Override
    public List<ShopType> getShopTypeList() throws DaoException {
        return super.loadAll(ShopType.class, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.ShopTypeDao#getShopTypeList(int, int)
     */
    @Override
    public List<ShopType> getShopTypeList(int firstResult, int maxResult) {
        return super.loadAll(ShopType.class, firstResult, maxResult, null);
    }

}