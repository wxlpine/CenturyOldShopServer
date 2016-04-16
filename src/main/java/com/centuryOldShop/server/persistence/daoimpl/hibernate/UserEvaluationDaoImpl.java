/***********************************************************************
 * Module:  UserEvaluationDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class UserEvaluation
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.UserEvaluation;
import com.centuryOldShop.server.persistence.UserEvaluationPK;
import com.centuryOldShop.server.persistence.dao.UserEvaluationDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of UserEvaluationDao interface
 */
@SuppressWarnings("ALL")
public class UserEvaluationDaoImpl extends HibernateDaoImpl implements UserEvaluationDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#save(com.centuryOldShop.server.persistence.UserEvaluation)
     */
    public Serializable save(UserEvaluation userEvaluationObject) throws DaoException {
        return super.save(userEvaluationObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#load(com.centuryOldShop.server.persistence.UserEvaluationPK)
     */
    public UserEvaluation load(UserEvaluationPK pk) throws DaoException {
        List cs = new ArrayList();
        String[] paramNames = new String[]{"commodity", "orderForm", "appUser"};
        Object[] values = new Object[]{pk.getCommodity(), pk.getOrderForm(), pk.getAppUser()};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(UserEvaluation.class, cs);
        return (((list != null) && (list.size() > 0)) ? (UserEvaluation) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#delete(com.centuryOldShop.server.persistence.UserEvaluation)
     */
    public void delete(UserEvaluation userEvaluationObject) throws DaoException {
        super.delete(userEvaluationObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#update(com.centuryOldShop.server.persistence.UserEvaluation)
     */
    public void update(UserEvaluation userEvaluationObject) throws DaoException {
        super.update(userEvaluationObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#saveOrUpdate(com.centuryOldShop.server.persistence.UserEvaluation)
     */
    public void saveOrUpdate(UserEvaluation userEvaluationObject) throws DaoException {
        super.saveOrUpdate(userEvaluationObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.UserEvaluation)
     */
    public List queryByExample(UserEvaluation userEvaluationObject) throws DaoException {
        return super.queryByExample(UserEvaluation.class, userEvaluationObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#getUserEvaluationList()
     */
    public List getUserEvaluationList() throws DaoException {
        return super.loadAll(UserEvaluation.class);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#getUserEvaluationList(int, int)
     */
    public List getUserEvaluationList(int firstResult, int maxResult) {
        return super.loadAll(UserEvaluation.class, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByGrade(double)
     */
    public List findByGrade(double grade) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("grade", new Double(grade)));
        return super.findByCriterions(UserEvaluation.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByGrade(double, int, int)
     */
    public List findByGrade(double grade, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("grade", new Double(grade)));
        return super.findByCriterions(UserEvaluation.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByComment(java.lang.String)
     */
    public List findByComment(java.lang.String comment) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("comment", comment));
        return super.findByCriterions(UserEvaluation.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByComment(java.lang.String, int, int)
     */
    public List findByComment(java.lang.String comment, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("comment", comment));
        return super.findByCriterions(UserEvaluation.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByTime(java.util.Date)
     */
    public List findByTime(java.util.Date time) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("time", time));
        return super.findByCriterions(UserEvaluation.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByTime(java.util.Date, int, int)
     */
    public List findByTime(java.util.Date time, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("time", time));
        return super.findByCriterions(UserEvaluation.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByCommodity(com.centuryOldShop.server.persistence.Commodity)
     */
    public List findByCommodity(com.centuryOldShop.server.persistence.Commodity commodity) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("commodity", commodity));
        return super.findByCriterions(UserEvaluation.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByCommodity(com.centuryOldShop.server.persistence.Commodity, int, int)
     */
    public List findByCommodity(com.centuryOldShop.server.persistence.Commodity commodity, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("commodity", commodity));
        return super.findByCriterions(UserEvaluation.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByOrderForm(com.centuryOldShop.server.persistence.OrderForm)
     */
    public List findByOrderForm(com.centuryOldShop.server.persistence.OrderForm orderForm) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("orderForm", orderForm));
        return super.findByCriterions(UserEvaluation.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByOrderForm(com.centuryOldShop.server.persistence.OrderForm, int, int)
     */
    public List findByOrderForm(com.centuryOldShop.server.persistence.OrderForm orderForm, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("orderForm", orderForm));
        return super.findByCriterions(UserEvaluation.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByAppUser(com.centuryOldShop.server.persistence.AppUser)
     */
    public List findByAppUser(com.centuryOldShop.server.persistence.AppUser appUser) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("appUser", appUser));
        return super.findByCriterions(UserEvaluation.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.UserEvaluationDao#findByAppUser(com.centuryOldShop.server.persistence.AppUser, int, int)
     */
    public List findByAppUser(com.centuryOldShop.server.persistence.AppUser appUser, int firstResult, int maxResult) throws DaoException {
        List cs = new ArrayList();
        cs.add(Restrictions.eq("appUser", appUser));
        return super.findByCriterions(UserEvaluation.class, cs, firstResult, maxResult);
    }
}