/***********************************************************************
 * Module:  UserEvaluationDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class UserEvaluation
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.UserEvaluation;
import com.centuryOldShop.server.persistence.UserEvaluationPK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class UserEvaluation
 */
public interface UserEvaluationDao extends Dao {

    /**
     * Save <Code>UserEvaluation</Code> instance
     *
     * @param userEvaluationObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(UserEvaluation userEvaluationObject) throws DaoException;

    /**
     * Load <Code>UserEvaluation</Code> instance by primary key
     *
     * @param pk
     * @return <Code>UserEvaluation</Code> instance
     * @throws DaoException
     */
    public UserEvaluation load(UserEvaluationPK pk) throws DaoException;

    /**
     * Delete <Code>UserEvaluation</Code> instance from persistence store
     *
     * @param userEvaluationObject
     * @throws DaoException
     */
    public void delete(UserEvaluation userEvaluationObject) throws DaoException;

    /**
     * Update <Code>UserEvaluation</Code> instance to persistence store
     *
     * @param userEvaluationObject
     * @throws DaoException
     */
    public void update(UserEvaluation userEvaluationObject) throws DaoException;

    /**
     * Save or update <Code>UserEvaluation</Code> instance to persistence store
     *
     * @param userEvaluationObject
     * @throws DaoException
     */
    public void saveOrUpdate(UserEvaluation userEvaluationObject) throws DaoException;

    /**
     * Get all <Code>UserEvaluation</Code> instances from persistence store
     *
     * @return <Code>UserEvaluation</Code> instance list
     * @throws DaoException
     */
    public List getUserEvaluationList() throws DaoException;

    /**
     * Get all <Code>UserEvaluation</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>UserEvaluation</Code> instance list
     * @throws DaoException
     */
    public List getUserEvaluationList(int firstResult, int maxResult);

    /**
     * Query <Code>UserEvaluation</Code> instances by example instance
     *
     * @param userEvaluationObject example instance
     * @return <Code>UserEvaluation</Code> instance list
     * @throws DaoException
     */
    public List queryByExample(UserEvaluation userEvaluationObject) throws DaoException;

    /**
     * Find <Code>UserEvaluation</Code> instances from persistence store by grade
     *
     * @param grade
     * @return <Code>UserEvaluation</Code> instance list
     * @throws DaoException
     */
    public List findByGrade(double grade) throws DaoException;

    /**
     * Find <Code>UserEvaluation</Code> instances in range firstResult, maxResult
     * from persistence store by field grade
     *
     * @param grade
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>UserEvaluation</Code> instance list
     * @throws DaoException
     */
    public List findByGrade(double grade, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>UserEvaluation</Code> instances from persistence store by comment
     *
     * @param comment
     * @return <Code>UserEvaluation</Code> instance list
     * @throws DaoException
     */
    public List findByComment(java.lang.String comment) throws DaoException;

    /**
     * Find <Code>UserEvaluation</Code> instances in range firstResult, maxResult
     * from persistence store by field comment
     *
     * @param comment
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>UserEvaluation</Code> instance list
     * @throws DaoException
     */
    public List findByComment(java.lang.String comment, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>UserEvaluation</Code> instances from persistence store by time
     *
     * @param time
     * @return <Code>UserEvaluation</Code> instance list
     * @throws DaoException
     */
    public List findByTime(java.util.Date time) throws DaoException;

    /**
     * Find <Code>UserEvaluation</Code> instances in range firstResult, maxResult
     * from persistence store by field time
     *
     * @param time
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>UserEvaluation</Code> instance list
     * @throws DaoException
     */
    public List findByTime(java.util.Date time, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>UserEvaluation</Code> instances from persistence store by Commodity
     *
     * @param commodity
     * @return <Code>UserEvaluation</Code> instance list
     * @throws DaoException
     */
    public List findByCommodity(com.centuryOldShop.server.persistence.Commodity commodity) throws DaoException;

    /**
     * Find <Code>UserEvaluation</Code> instances  instances in range firstResult, maxResult
     * from persistence store by Commodity
     *
     * @param commodity
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>UserEvaluation</Code> instance list
     * @throws DaoException
     */
    public List findByCommodity(com.centuryOldShop.server.persistence.Commodity commodity, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>UserEvaluation</Code> instances from persistence store by OrderForm
     *
     * @param orderForm
     * @return <Code>UserEvaluation</Code> instance list
     * @throws DaoException
     */
    public List findByOrderForm(com.centuryOldShop.server.persistence.OrderForm orderForm) throws DaoException;

    /**
     * Find <Code>UserEvaluation</Code> instances  instances in range firstResult, maxResult
     * from persistence store by OrderForm
     *
     * @param orderForm
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>UserEvaluation</Code> instance list
     * @throws DaoException
     */
    public List findByOrderForm(com.centuryOldShop.server.persistence.OrderForm orderForm, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>UserEvaluation</Code> instances from persistence store by AppUser
     *
     * @param appUser
     * @return <Code>UserEvaluation</Code> instance list
     * @throws DaoException
     */
    public List findByAppUser(com.centuryOldShop.server.persistence.AppUser appUser) throws DaoException;

    /**
     * Find <Code>UserEvaluation</Code> instances  instances in range firstResult, maxResult
     * from persistence store by AppUser
     *
     * @param appUser
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>UserEvaluation</Code> instance list
     * @throws DaoException
     */
    public List findByAppUser(com.centuryOldShop.server.persistence.AppUser appUser, int firstResult, int maxResult) throws DaoException;
}