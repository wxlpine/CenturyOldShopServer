/***********************************************************************
 * Module:  DiscountTypeDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class DiscountType
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.DiscountType;
import com.centuryOldShop.server.persistence.DiscountTypePK;
import com.centuryOldShop.server.persistence.dao.DiscountTypeDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of DiscountTypeDao interface
 */
@SuppressWarnings("ALL")
public class DiscountTypeDaoImpl extends HibernateDaoImpl implements DiscountTypeDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountTypeDao#save(com.centuryOldShop.server.persistence.DiscountType)
     */
    public Serializable save(DiscountType discountTypeObject) throws DaoException {
        return super.save(discountTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountTypeDao#load(com.centuryOldShop.server.persistence.DiscountTypePK)
     */
    public DiscountType load(DiscountTypePK pk) throws DaoException {
        List cs = new ArrayList();
        String[] paramNames = new String[]{"discountTypeId"};
        Object[] values = new Object[]{new Long(pk.getDiscountTypeId())};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(DiscountType.class, cs);
        return (((list != null) && (list.size() > 0)) ? (DiscountType) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountTypeDao#delete(com.centuryOldShop.server.persistence.DiscountType)
     */
    public void delete(DiscountType discountTypeObject) throws DaoException {
        super.delete(discountTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountTypeDao#update(com.centuryOldShop.server.persistence.DiscountType)
     */
    public void update(DiscountType discountTypeObject) throws DaoException {
        super.update(discountTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountTypeDao#saveOrUpdate(com.centuryOldShop.server.persistence.DiscountType)
     */
    public void saveOrUpdate(DiscountType discountTypeObject) throws DaoException {
        super.saveOrUpdate(discountTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountTypeDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.DiscountType)
     */
    public List queryByExample(DiscountType discountTypeObject) throws DaoException {
        return super.queryByExample(DiscountType.class, discountTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountTypeDao#getDiscountTypeList()
     */
    public List getDiscountTypeList() throws DaoException {
        return super.loadAll(DiscountType.class);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountTypeDao#getDiscountTypeList(int, int)
     */
    public List getDiscountTypeList(int firstResult, int maxResult) {
        return super.loadAll(DiscountType.class, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountTypeDao#findByDiscountTypeName(java.lang.String)
     */
    public List findByDiscountTypeName(java.lang.String discountTypeName) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("discountTypeName", discountTypeName));
        return super.findByCriterions(DiscountType.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountTypeDao#findByDiscountTypeName(java.lang.String, int, int)
     */
    public List findByDiscountTypeName(java.lang.String discountTypeName, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("discountTypeName", discountTypeName));
        return super.findByCriterions(DiscountType.class, cs, firstResult, maxResult);
    }
}