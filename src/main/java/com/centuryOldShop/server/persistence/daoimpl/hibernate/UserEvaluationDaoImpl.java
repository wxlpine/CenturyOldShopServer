/***********************************************************************
 * Module:  UserEvaluationDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class UserEvaluation
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.*;
import com.centuryOldShop.server.persistence.dao.UserEvaluationDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of UserEvaluationDao interface
 */

public class UserEvaluationDaoImpl extends HibernateDaoImpl implements UserEvaluationDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#save(com.centuryOldShop.server.persistence.UserEvaluation)
     */
    @Override
    public Serializable save(UserEvaluation userEvaluationObject) throws DaoException {
        return super.save(userEvaluationObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#load(com.centuryOldShop.server.persistence.UserEvaluationPK)
     */
    @Override
    public UserEvaluation load(UserEvaluationPK pk) throws DaoException {
        List<Criterion> cs = new ArrayList<>();

        cs.add(Restrictions.idEq(pk));

        List list = super.findByCriterions(UserEvaluation.class, cs, null, null, null);

        return (((list != null) && (list.size() > 0)) ? (UserEvaluation) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#delete(com.centuryOldShop.server.persistence.UserEvaluation)
     */
    @Override
    public void delete(UserEvaluation userEvaluationObject) throws DaoException {
        super.delete(userEvaluationObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#update(com.centuryOldShop.server.persistence.UserEvaluation)
     */
    @Override
    public void update(UserEvaluation userEvaluationObject) throws DaoException {
        super.update(userEvaluationObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#saveOrUpdate(com.centuryOldShop.server.persistence.UserEvaluation)
     */
    @Override
    public void saveOrUpdate(UserEvaluation userEvaluationObject) throws DaoException {
        super.saveOrUpdate(userEvaluationObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.UserEvaluation)
     */
    @Override
    public List<UserEvaluation> queryByExample(UserEvaluation userEvaluationObject) throws DaoException {
        return super.queryByExample(UserEvaluation.class, userEvaluationObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#getUserEvaluationList()
     */
    @Override
    public List<UserEvaluation> getUserEvaluationList() throws DaoException {
        return super.loadAll(UserEvaluation.class, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#getUserEvaluationList(int, int)
     */
    @Override
    public List<UserEvaluation> getUserEvaluationList(int firstResult, int maxResult) {
        return super.loadAll(UserEvaluation.class, firstResult, maxResult, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByGrade(double)
     */
    @Override
    public List<UserEvaluation> findByGrade(double grade) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("grade", new Double(grade)));
        return super.findByCriterions(UserEvaluation.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByGrade(double, int, int)
     */
    @Override
    public List<UserEvaluation> findByGrade(double grade, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("grade", new Double(grade)));
        return super.findByCriterions(UserEvaluation.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByComment(java.lang.String)
     */
    @Override
    public List<UserEvaluation> findByComment(java.lang.String comment) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("comment", comment));
        return super.findByCriterions(UserEvaluation.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByComment(java.lang.String, int, int)
     */
    @Override
    public List<UserEvaluation> findByComment(java.lang.String comment, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("comment", comment));
        return super.findByCriterions(UserEvaluation.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByTime(java.util.Date)
     */
    @Override
    public List<UserEvaluation> findByTime(java.util.Date time) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("time", time));
        return super.findByCriterions(UserEvaluation.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByTime(java.util.Date, int, int)
     */
    @Override
    public List<UserEvaluation> findByTime(java.util.Date time, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("time", time));
        return super.findByCriterions(UserEvaluation.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByCommodity(com.centuryOldShop.server.persistence.Commodity)
     */
    @Override
    public List<UserEvaluation> findByCommodity(Commodity commodity) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("commodity", commodity));
        return super.findByCriterions(UserEvaluation.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByCommodity(com.centuryOldShop.server.persistence.Commodity, int, int)
     */
    @Override
    public List<UserEvaluation> findByCommodity(Commodity commodity, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("commodity", commodity));
        return super.findByCriterions(UserEvaluation.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByOrderForm(com.centuryOldShop.server.persistence.OrderForm)
     */
    @Override
    public List<UserEvaluation> findByOrderForm(OrderForm orderForm) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("orderForm", orderForm));
        return super.findByCriterions(UserEvaluation.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByOrderForm(com.centuryOldShop.server.persistence.OrderForm, int, int)
     */
    @Override
    public List<UserEvaluation> findByOrderForm(OrderForm orderForm, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("orderForm", orderForm));
        return super.findByCriterions(UserEvaluation.class, cs, null, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByAppUser(com.centuryOldShop.server.persistence.AppUser)
     */
    @Override
    public List<UserEvaluation> findByAppUser(AppUser appUser) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("appUser", appUser));
        return super.findByCriterions(UserEvaluation.class, cs, null, null, null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByAppUser(com.centuryOldShop.server.persistence.AppUser, int, int)
     */
    @Override
    public List<UserEvaluation> findByAppUser(AppUser appUser, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("appUser", appUser));
        return super.findByCriterions(UserEvaluation.class, cs, null, firstResult, maxResult);
    }
}