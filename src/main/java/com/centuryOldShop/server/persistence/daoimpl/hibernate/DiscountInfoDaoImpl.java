/***********************************************************************
 * Module:  DiscountInfoDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class DiscountInfo
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.DiscountInfo;
import com.centuryOldShop.server.persistence.DiscountInfoPK;
import com.centuryOldShop.server.persistence.dao.DiscountInfoDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of DiscountInfoDao interface
 */

public class DiscountInfoDaoImpl extends HibernateDaoImpl implements DiscountInfoDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#save(com.centuryOldShop.server.persistence.DiscountInfo)
     */
    @Override
    public Serializable save(DiscountInfo discountInfoObject) throws DaoException {
        return super.save(discountInfoObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#load(com.centuryOldShop.server.persistence.DiscountInfoPK)
     */
    @Override
    public DiscountInfo load(DiscountInfoPK pk) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        String[] paramNames = new String[]{"discountInfoId"};
        Object[] values = new Object[]{new Long(pk.getDiscountInfoId())};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(DiscountInfo.class, cs);
        return (((list != null) && (list.size() > 0)) ? (DiscountInfo) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#delete(com.centuryOldShop.server.persistence.DiscountInfo)
     */
    @Override
    public void delete(DiscountInfo discountInfoObject) throws DaoException {
        super.delete(discountInfoObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#update(com.centuryOldShop.server.persistence.DiscountInfo)
     */
    @Override
    public void update(DiscountInfo discountInfoObject) throws DaoException {
        super.update(discountInfoObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#saveOrUpdate(com.centuryOldShop.server.persistence.DiscountInfo)
     */
    @Override
    public void saveOrUpdate(DiscountInfo discountInfoObject) throws DaoException {
        super.saveOrUpdate(discountInfoObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.DiscountInfo)
     */
    @Override
    public List<DiscountInfo> queryByExample(DiscountInfo discountInfoObject) throws DaoException {
        return super.queryByExample(DiscountInfo.class, discountInfoObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#getDiscountInfoList()
     */
    @Override
    public List<DiscountInfo> getDiscountInfoList() throws DaoException {
        return super.loadAll(DiscountInfo.class);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#getDiscountInfoList(int, int)
     */
    @Override
    public List<DiscountInfo> getDiscountInfoList(int firstResult, int maxResult) {
        return super.loadAll(DiscountInfo.class, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#findByTitle(java.lang.String)
     */
    @Override
    public List<DiscountInfo> findByTitle(java.lang.String title) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("title", title));
        return super.findByCriterions(DiscountInfo.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#findByTitle(java.lang.String, int, int)
     */
    @Override
    public List<DiscountInfo> findByTitle(java.lang.String title, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("title", title));
        return super.findByCriterions(DiscountInfo.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#findByDiscountStartTime(java.util.Date)
     */
    @Override
    public List<DiscountInfo> findByDiscountStartTime(java.util.Date discountStartTime) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("discountStartTime", discountStartTime));
        return super.findByCriterions(DiscountInfo.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#findByDiscountStartTime(java.util.Date, int, int)
     */
    @Override
    public List<DiscountInfo> findByDiscountStartTime(java.util.Date discountStartTime, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("discountStartTime", discountStartTime));
        return super.findByCriterions(DiscountInfo.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#findByDiscountEndTime(java.util.Date)
     */
    @Override
    public List<DiscountInfo> findByDiscountEndTime(java.util.Date discountEndTime) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("discountEndTime", discountEndTime));
        return super.findByCriterions(DiscountInfo.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#findByDiscountEndTime(java.util.Date, int, int)
     */
    @Override
    public List<DiscountInfo> findByDiscountEndTime(java.util.Date discountEndTime, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("discountEndTime", discountEndTime));
        return super.findByCriterions(DiscountInfo.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#findByPriceReduceMinPrice(double)
     */
    @Override
    public List<DiscountInfo> findByPriceReduceMinPrice(double priceReduceMinPrice) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("priceReduceMinPrice", new Double(priceReduceMinPrice)));
        return super.findByCriterions(DiscountInfo.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#findByPriceReduceMinPrice(double, int, int)
     */
    @Override
    public List<DiscountInfo> findByPriceReduceMinPrice(double priceReduceMinPrice, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("priceReduceMinPrice", new Double(priceReduceMinPrice)));
        return super.findByCriterions(DiscountInfo.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#findByPriceReduceAmount(double)
     */
    @Override
    public List<DiscountInfo> findByPriceReduceAmount(double priceReduceAmount) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("priceReduceAmount", new Double(priceReduceAmount)));
        return super.findByCriterions(DiscountInfo.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#findByPriceReduceAmount(double, int, int)
     */
    @Override
    public List<DiscountInfo> findByPriceReduceAmount(double priceReduceAmount, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("priceReduceAmount", new Double(priceReduceAmount)));
        return super.findByCriterions(DiscountInfo.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#findByDiscountMinPrice(double)
     */
    @Override
    public List<DiscountInfo> findByDiscountMinPrice(double discountMinPrice) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("discountMinPrice", new Double(discountMinPrice)));
        return super.findByCriterions(DiscountInfo.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#findByDiscountMinPrice(double, int, int)
     */
    @Override
    public List<DiscountInfo> findByDiscountMinPrice(double discountMinPrice, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("discountMinPrice", new Double(discountMinPrice)));
        return super.findByCriterions(DiscountInfo.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#findByDiscountRatio(double)
     */
    @Override
    public List<DiscountInfo> findByDiscountRatio(double discountRatio) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("discountRatio", new Double(discountRatio)));
        return super.findByCriterions(DiscountInfo.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#findByDiscountRatio(double, int, int)
     */
    @Override
    public List<DiscountInfo> findByDiscountRatio(double discountRatio, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("discountRatio", new Double(discountRatio)));
        return super.findByCriterions(DiscountInfo.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#findByShop(com.centuryOldShop.server.persistence.Shop)
     */
    @Override
    public List<DiscountInfo> findByShop(com.centuryOldShop.server.persistence.Shop shop) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shop", shop));
        return super.findByCriterions(DiscountInfo.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#findByShop(com.centuryOldShop.server.persistence.Shop, int, int)
     */
    @Override
    public List<DiscountInfo> findByShop(com.centuryOldShop.server.persistence.Shop shop, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("shop", shop));
        return super.findByCriterions(DiscountInfo.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#findByDiscountType(com.centuryOldShop.server.persistence.DiscountType)
     */
    @Override
    public List<DiscountInfo> findByDiscountType(com.centuryOldShop.server.persistence.DiscountType discountType) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("discountType", discountType));
        return super.findByCriterions(DiscountInfo.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.DiscountInfoDao#findByDiscountType(com.centuryOldShop.server.persistence.DiscountType, int, int)
     */
    @Override
    public List<DiscountInfo> findByDiscountType(com.centuryOldShop.server.persistence.DiscountType discountType, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("discountType", discountType));
        return super.findByCriterions(DiscountInfo.class, cs, firstResult, maxResult);
    }
}