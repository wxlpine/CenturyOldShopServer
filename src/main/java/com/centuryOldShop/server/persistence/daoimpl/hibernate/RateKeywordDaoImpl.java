/***********************************************************************
 * Module:  RateKeywordDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class RateKeyword
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.RateKeyword;
import com.centuryOldShop.server.persistence.RateKeywordPK;
import com.centuryOldShop.server.persistence.dao.RateKeywordDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of RateKeywordDao interface
 */

public class RateKeywordDaoImpl extends HibernateDaoImpl implements RateKeywordDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.RateKeywordDao#save(com.centuryOldShop.server.persistence.RateKeyword)
     */
    @Override
    public Serializable save(RateKeyword rateKeywordObject) throws DaoException {
        return super.save(rateKeywordObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.RateKeywordDao#load(com.centuryOldShop.server.persistence.RateKeywordPK)
     */
    @Override
    public RateKeyword load(RateKeywordPK pk) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        String[] paramNames = new String[]{"rateKeyword"};
        Object[] values = new Object[]{pk.getRateKeyword()};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(RateKeyword.class, cs);
        return (((list != null) && (list.size() > 0)) ? (RateKeyword) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.RateKeywordDao#delete(com.centuryOldShop.server.persistence.RateKeyword)
     */
    @Override
    public void delete(RateKeyword rateKeywordObject) throws DaoException {
        super.delete(rateKeywordObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.RateKeywordDao#update(com.centuryOldShop.server.persistence.RateKeyword)
     */
    @Override
    public void update(RateKeyword rateKeywordObject) throws DaoException {
        super.update(rateKeywordObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.RateKeywordDao#saveOrUpdate(com.centuryOldShop.server.persistence.RateKeyword)
     */
    @Override
    public void saveOrUpdate(RateKeyword rateKeywordObject) throws DaoException {
        super.saveOrUpdate(rateKeywordObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.RateKeywordDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.RateKeyword)
     */
    @Override
    public List<RateKeyword> queryByExample(RateKeyword rateKeywordObject) throws DaoException {
        return super.queryByExample(RateKeyword.class, rateKeywordObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.RateKeywordDao#getRateKeywordList()
     */
    @Override
    public List<RateKeyword> getRateKeywordList() throws DaoException {
        return super.loadAll(RateKeyword.class);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.RateKeywordDao#getRateKeywordList(int, int)
     */
    @Override
    public List<RateKeyword> getRateKeywordList(int firstResult, int maxResult) {
        return super.loadAll(RateKeyword.class, firstResult, maxResult);
    }

}