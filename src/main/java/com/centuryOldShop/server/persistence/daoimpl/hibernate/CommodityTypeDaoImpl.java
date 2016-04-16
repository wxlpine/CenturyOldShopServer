/***********************************************************************
 * Module:  CommodityTypeDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class CommodityType
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.CommodityType;
import com.centuryOldShop.server.persistence.CommodityTypePK;
import com.centuryOldShop.server.persistence.dao.CommodityTypeDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of CommodityTypeDao interface
 */
@SuppressWarnings("ALL")
public class CommodityTypeDaoImpl extends HibernateDaoImpl implements CommodityTypeDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityTypeDao#save(com.centuryOldShop.server.persistence.CommodityType)
     */
    public Serializable save(CommodityType commodityTypeObject) throws DaoException {
        return super.save(commodityTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityTypeDao#load(com.centuryOldShop.server.persistence.CommodityTypePK)
     */
    public CommodityType load(CommodityTypePK pk) throws DaoException {
        List cs = new ArrayList();
        String[] paramNames = new String[]{"commodityType"};
        Object[] values = new Object[]{pk.getCommodityType()};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(CommodityType.class, cs);
        return (((list != null) && (list.size() > 0)) ? (CommodityType) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityTypeDao#delete(com.centuryOldShop.server.persistence.CommodityType)
     */
    public void delete(CommodityType commodityTypeObject) throws DaoException {
        super.delete(commodityTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityTypeDao#update(com.centuryOldShop.server.persistence.CommodityType)
     */
    public void update(CommodityType commodityTypeObject) throws DaoException {
        super.update(commodityTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityTypeDao#saveOrUpdate(com.centuryOldShop.server.persistence.CommodityType)
     */
    public void saveOrUpdate(CommodityType commodityTypeObject) throws DaoException {
        super.saveOrUpdate(commodityTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityTypeDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.CommodityType)
     */
    public List queryByExample(CommodityType commodityTypeObject) throws DaoException {
        return super.queryByExample(CommodityType.class, commodityTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityTypeDao#getCommodityTypeList()
     */
    public List getCommodityTypeList() throws DaoException {
        return super.loadAll(CommodityType.class);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.CommodityTypeDao#getCommodityTypeList(int, int)
     */
    public List getCommodityTypeList(int firstResult, int maxResult) {
        return super.loadAll(CommodityType.class, firstResult, maxResult);
    }

}