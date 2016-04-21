/***********************************************************************
 * Module:  HibernateDao.java
 * Author:  cmicat
 * Purpose: Defines common interface for Hibernate access
 ***********************************************************************/

package com.sybase.orm.hibernate.dao;

import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.jdbc.Work;

import java.io.Serializable;
import java.util.List;

/**
 * Interface that defines common methods for Hibernate access.
 */
public interface HibernateDao extends Dao {

    public void doWork(Work work);

    public SessionFactory getSessionFactory();

    public void setSessionFactory(SessionFactory sessions);

    public Session setSession(Session session);

    public Session getSession(boolean openSession);

    public Session getSession();

    public void update(Object persistentObject) throws DaoException;

    public void delete(Object persistentObject) throws DaoException;

    public <T> List<T> queryByExample(Class<T> clazz, Object persistentObject) throws DaoException;

    public <T> List<T> findAll(Class<T> clazz) throws DaoException;

    public <T> List<T> findByProperty(Class<T> clazz, Criterion restriction) throws DaoException;

    public <T> List<T> findByCriterions(Class<T> clazz, List<Criterion> restrictions,
            List<Order> orders, Integer firstResult, Integer maxResult)
            throws DaoException;

    public <T> List<T> findBySQLQuery(String sqlQuery, String aliasName, Class<T> clazz) throws DaoException;

    public List findByHQLQuery(String hqlQuery) throws DaoException;

    public List findByNamedParam(String queryString, String paramName, Object value) throws DaoException;

    public List findByNamedParam(String queryString, String paramName, Object value, int firstResult, int maxResult)
            throws DaoException;

    public List findByNamedParam(final String queryString, final String[] paramNames, final Object[] values)
            throws DaoException;

    public List findByNamedParam(final String queryString, final String[] paramNames, final Object[] values,
                                 final int firstResult, final int maxResult) throws DaoException;

    public List findByValueBean(final String queryString, final Object valueBean) throws DaoException;

    public List findByNamedQuery(String queryName) throws DaoException;

    public List findByNamedQuery(String queryName, Object value) throws DaoException;

    public List findByNamedQuery(final String queryName, final Object[] values) throws DaoException;

    public abstract List findByNamedQueryAndNamedParam(String queryName, String paramName, Object value)
            throws DaoException;

    public List findByNamedQueryAndNamedParam(final String queryName, final String[] paramNames,
                                              final Object[] values) throws DaoException;

    public List findByNamedQueryAndValueBean(final String queryName, final Object valueBean)
            throws DaoException;

    public boolean isCacheQueries();

    public String getQueryCacheRegion();

    public Serializable save(Object persistentObject) throws DaoException;

    public void saveOrUpdate(Object persistentObject) throws DaoException;

    public List find(String queryString, int firstResult, int maxResult) throws DaoException;

    public List find(String queryString) throws DaoException;

    public List find(String queryString, Object value) throws DaoException;

    public List find(final String queryString, final Object[] values) throws DaoException;

    public List find(final String queryString, final Object[] values, final int firstResult, final int maxResult)
            throws DaoException;

    public <T> List<T> loadAll(final Class<T> entityClass, List<Order> order) throws DaoException;

    public <T> List<T> loadAll(final Class<T> entityClass, final int firstResult, final int maxResult,
                               List<Order> orders)
            throws DaoException;
}