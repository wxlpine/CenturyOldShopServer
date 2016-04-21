/***********************************************************************
 * Module:  DisputeStatusTypeDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class DisputeStatusType
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.DisputeStatusType;
import com.centuryOldShop.server.persistence.DisputeStatusTypePK;
import com.centuryOldShop.server.persistence.dao.DisputeStatusTypeDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of DisputeStatusTypeDao interface
 */

public class DisputeStatusTypeDaoImpl extends HibernateDaoImpl implements DisputeStatusTypeDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DisputeStatusTypeDao#save(com.centuryOldShop.server.persistence.DisputeStatusType)
     */
    @Override
    public Serializable save(DisputeStatusType disputeStatusTypeObject) throws DaoException {
        return super.save(disputeStatusTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DisputeStatusTypeDao#load(com.centuryOldShop.server.persistence.DisputeStatusTypePK)
     */
    @Override
    public DisputeStatusType load(DisputeStatusTypePK pk) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        String[] paramNames = new String[]{"disputeStatusType"};
        Object[] values = new Object[]{pk.getDisputeStatusType()};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(DisputeStatusType.class, cs);
        return (((list != null) && (list.size() > 0)) ? (DisputeStatusType) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DisputeStatusTypeDao#delete(com.centuryOldShop.server.persistence.DisputeStatusType)
     */
    @Override
    public void delete(DisputeStatusType disputeStatusTypeObject) throws DaoException {
        super.delete(disputeStatusTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DisputeStatusTypeDao#update(com.centuryOldShop.server.persistence.DisputeStatusType)
     */
    @Override
    public void update(DisputeStatusType disputeStatusTypeObject) throws DaoException {
        super.update(disputeStatusTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DisputeStatusTypeDao#saveOrUpdate(com.centuryOldShop.server.persistence.DisputeStatusType)
     */
    @Override
    public void saveOrUpdate(DisputeStatusType disputeStatusTypeObject) throws DaoException {
        super.saveOrUpdate(disputeStatusTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DisputeStatusTypeDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.DisputeStatusType)
     */
    @Override
    public List<DisputeStatusType> queryByExample(DisputeStatusType disputeStatusTypeObject) throws DaoException {
        return super.queryByExample(DisputeStatusType.class, disputeStatusTypeObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DisputeStatusTypeDao#getDisputeStatusTypeList()
     */
    @Override
    public List<DisputeStatusType> getDisputeStatusTypeList() throws DaoException {
        return super.loadAll(DisputeStatusType.class, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DisputeStatusTypeDao#getDisputeStatusTypeList(int, int)
     */
    @Override
    public List<DisputeStatusType> getDisputeStatusTypeList(int firstResult, int maxResult) {
        return super.loadAll(DisputeStatusType.class, firstResult, maxResult, null);
    }

}