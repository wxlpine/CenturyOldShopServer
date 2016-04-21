/***********************************************************************
 * Module:  HibernateDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines implementation class of HibernateDao interface
 ***********************************************************************/

package com.sybase.orm.hibernate.dao;

import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.HibernateSessionManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.*;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.jdbc.Work;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Class that implements <Code>HibernateDao</Code> interface.
 */
public class HibernateDaoImpl implements HibernateDao {

    private boolean autoCommit = true;

    private boolean autoCloseSession = false;

    private boolean cacheQueries = false;

    private String queryCacheRegion;

    private Log log = LogFactory.getLog(HibernateDaoImpl.class);

    /**
     * Empty constructor
     */
    public HibernateDaoImpl() {
        super();
    }

    /**
     * Constructor with specified session factory
     *
     * @param sessionFactory sessionFactory
     */
    public HibernateDaoImpl(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }

    @Override
    public SessionFactory getSessionFactory() {
        return HibernateSessionManager.getSessionFactory();
    }

    @Override
    public void setSessionFactory(SessionFactory sessions) {

    }

    @Override
    public Session setSession(Session session) {
        return HibernateSessionManager.setSession(session);
    }

    @Override
    public Session getSession(boolean openSession) {
        return HibernateSessionManager.getSession(openSession);
    }

    @Override
    public Session getSession() {
        return getSession(false);
    }

    @Override
    public void closeSession() throws DaoException {
        HibernateSessionManager.closeSession();
    }

    @Override
    public void flushSession() throws DaoException {
        if (getSession() != null)
            try {
                getSession().flush();
            } catch (HibernateException e) {
                log.error("Fail to flush session", e);
                throw new DaoException("Fail to flush session", e);
            }
    }

    @Override
    public void clearSession() throws DaoException {
        if (getSession() != null)
            try {
                getSession().clear();
            } catch (HibernateException ex) {
                log.error("Fail to clear session", ex);
                throw new DaoException("Fail to clear session", ex);
            }
    }

    @Override
    public void beginTransaction() throws DaoException {
        HibernateSessionManager.beginTransaction();
    }

    @Override
    public void commitTransaction() throws DaoException {
        HibernateSessionManager.commitTransaction();
    }

    /*
     * (non-Javadoc)
     *
     * @see com.sybase.orm.dao.hibernate.HibernateDao#rollbackTransaction()
     */
    @Override
    public void rollbackTransaction() throws DaoException {
        HibernateSessionManager.rollbackTransaction();
    }

    /*
     * (non-Javadoc)
     *
     * @see com.sybase.orm.dao.hibernate.HibernateDao#isAutoCommit()
     */
    @Override
    public boolean isAutoCommit() {
        return this.autoCommit;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.sybase.orm.dao.hibernate.HibernateDao#setAutoCommit(boolean)
     */
    @Override
    public void setAutoCommit(boolean autoCommit) {
        this.autoCommit = autoCommit;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.sybase.orm.dao.hibernate.HibernateDao#isAutoCloseSession()
     */
    @Override
    public boolean isAutoCloseSession() {
        return this.autoCloseSession;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.sybase.orm.dao.hibernate.HibernateDao#setAutoCloseSession(boolean)
     */
    @Override
    public void setAutoCloseSession(boolean autoClose) {
        this.autoCloseSession = autoClose;
    }

   /*
    * (non-Javadoc)
    *
    * @see com.sybase.orm.dao.hibernate.HibernateDao#getConnection()
    */
//   public Connection getConnection() {
//      if (getSession() != null && getSession().isConnected())
//         return getSession().connection();
//      return null;
//   }

    /*
     * (non-Javadoc)
     *
     * @see com.sybase.orm.dao.hibernate.HibernateDao#getConnection()
     */
    @Override
    public void doWork(Work work) {
        if (getSession() != null && getSession().isConnected()) {
            try {
                getSession().doWork(work);
            } catch (HibernateException ex) {
                log.error("Failed to doWork");
                throw new DaoException("Failed to doWork", ex);
            }
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see com.sybase.orm.dao.hibernate.HibernateDao#closeConnection()
     */
    @Override
    public void closeConnection() throws DaoException {
        if (getSession() != null)
            try {
                getSession().disconnect();
            } catch (HibernateException ex) {
                log.error("Fail to close connection", ex);
                throw new DaoException("Fail to close connection", ex);
            } finally {
                if (autoCloseSession)
                    closeSession();
            }
    }

    /*
     * (non-Javadoc)
     *
     * @see com.sybase.orm.hibernate.dao.HibernateDao#update(java.lang.Object)
     */
    @Override
    public void update(Object persistentObject) throws DaoException {
        try {
            Session session = openSession();
            beginTransaction();
            session.update(persistentObject);
            if (autoCommit)
                commitTransaction();
        } catch (HibernateException ex) {
            rollbackTransaction();
            log.error("Fail to update", ex);
            throw new DaoException("Fail to update", ex);
        } finally {
            if (autoCloseSession)
                closeSession();
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see com.sybase.orm.hibernate.dao.HibernateDao#delete(java.lang.Object)
     */
    @Override
    public void delete(Object persistentObject) throws DaoException {
        try {
            Session session = openSession();
            beginTransaction();
            session.delete(persistentObject);
            if (autoCommit)
                commitTransaction();
        } catch (HibernateException ex) {
            rollbackTransaction();
            log.error("Fail to delete", ex);
            throw new DaoException("Fail tlo delete", ex);
        } finally {
            if (autoCloseSession)
                closeSession();
        }
    }

    @Override
    public <T> List<T> queryByExample(Class<T> clazz, Object persistentObject) throws DaoException {
        List objs = new ArrayList();

        try {
            Session session = this.openSession();
            beginTransaction();
            objs = session.createCriteria(clazz).add(Example.create(persistentObject)).list();
            if (autoCommit)
                commitTransaction();
        } catch (HibernateException ex) {
            rollbackTransaction();
            log.error("Fail to find all  objects", ex);
            throw new DaoException("Fail to find all  objects", ex);
        } finally {
            if (autoCloseSession)
                closeSession();
        }
        return objs;
    }

    @Override
    public <T> List<T> findAll(Class<T> clazz) throws DaoException {
        List objs = new ArrayList();

        try {
            Session session = this.openSession();
            beginTransaction();
            objs = session.createCriteria(clazz).list();
            if (autoCommit)
                commitTransaction();
        } catch (HibernateException ex) {
            rollbackTransaction();
            log.error("Fail to find all  objects", ex);
            throw new DaoException("Fail to find all  objects", ex);
        } finally {
            if (autoCloseSession)
                closeSession();
        }
        return objs;
    }

    @Override
    public <T> List<T> findByProperty(Class<T> clazz, Criterion restriction) throws DaoException {
        List objs = new ArrayList();

        try {
            Session session = this.openSession();
            beginTransaction();
            objs = session.createCriteria(clazz).add(restriction).list();
            if (autoCommit)
                commitTransaction();
        } catch (HibernateException ex) {
            rollbackTransaction();
            log.error("Fail to find objects by property", ex);
            throw new DaoException("Fail to find objects by property", ex);
        } finally {
            if (autoCloseSession)
                closeSession();
        }
        return objs;
    }

    public <T> List<T> findByCriterions(Class<T> clazz, List<Criterion> restrictions,
            List<Order> orders, Integer firstResult, Integer maxResult)
            throws DaoException {
        List<T> objs = new ArrayList<>();

        try {
            Session session = this.openSession();
            beginTransaction();
            Criteria criteria = session.createCriteria(clazz);

            if (firstResult != null) {
                criteria.setFirstResult(firstResult);
            }
            if (maxResult != null) {
                criteria.setMaxResults(maxResult);
            }

            Iterator<Criterion> it = restrictions.iterator();
            while (it.hasNext())
                criteria.add(it.next());

            if (orders != null) {
                orders.forEach(criteria::addOrder);
            }
            
            objs = criteria.list();
            if (autoCommit)
                commitTransaction();
        } catch (HibernateException ex) {
            rollbackTransaction();
            log.error("Fail to find objects by criterions", ex);
            throw new DaoException("Fail to find objects by criterions", ex);
        } finally {
            if (autoCloseSession)
                closeSession();
        }
        return objs;
    }

    @Override
    public <T> List<T> findBySQLQuery(String sqlQuery, String aliasName, Class<T> clazz) throws DaoException {
        List result = new ArrayList();
        try {
            Session session = this.openSession();
            beginTransaction();
            result = session.createSQLQuery(sqlQuery).addEntity(aliasName, clazz).list();
            if (autoCommit)
                commitTransaction();
        } catch (HibernateException ex) {
            rollbackTransaction();
            log.error("Fail to execute query", ex);
            throw new DaoException("Fail to execute query", ex);
        } finally {
            if (autoCloseSession)
                closeSession();
        }
        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.sybase.orm.hibernate.dao.HibernateDao#findByHQLQuery(java.lang.String)
     */
    @Override
    public List findByHQLQuery(String hqlQuery) throws DaoException {
        List result = new ArrayList();
        try {
            Session session = this.openSession();
            beginTransaction();
            result = session.createQuery(hqlQuery).list();
            if (autoCommit)
                commitTransaction();
        } catch (HibernateException ex) {
            rollbackTransaction();
            log.error("Fail to execute query", ex);
            throw new DaoException("Fail to execute query", ex);
        } finally {
            if (autoCloseSession)
                closeSession();
        }
        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.sybase.orm.hibernate.dao.HibernateDao#findByNamedParam(java.lang.String, java.lang.String,java.lang.Object)
     */
    @Override
    public List findByNamedParam(String queryString, String paramName, Object value) throws DaoException {
        return findByNamedParam(queryString, new String[]{paramName}, new Object[]{value});
    }

    /*
     * (non-Javadoc)
     *
     * @see com.sybase.orm.hibernate.dao.HibernateDao#findByNamedParam(java.lang.String, java.lang.String, java.lang.Object, int, int)
     */
    @Override
    public List findByNamedParam(String queryString, String paramName, Object value, int firstResult, int maxResult)
            throws DaoException {
        return findByNamedParam(queryString, new String[]{paramName}, new Object[]{value}, firstResult, maxResult);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.sybase.orm.hibernate.dao.HibernateDao#findByNamedParam(java.lang.String, java.lang.String[], java.lang.Object[])
     */
    @Override
    public List findByNamedParam(final String queryString, final String[] paramNames, final Object[] values)
            throws DaoException {
        try {
            if (paramNames.length != values.length) {
                throw new IllegalArgumentException("Length of paramNames array must match length of values array");
            }
            Session session = this.openSession();
            //beginTransaction();
            Query queryObject = session.createQuery(queryString);

            prepareQuery(queryObject);
            if (values != null) {
                for (int i = 0; i < values.length; i++) {
                    applyNamedParameterToQuery(queryObject, paramNames[i], values[i]);
                }
            }

            return queryObject.list();
            // if (autoCommit)
            // commitTransaction();
        } catch (HibernateException ex) {
            log.error("Fail to find", ex);
            throw new DaoException("Fail to find", ex);
        } finally {
            if (autoCloseSession)
                closeSession();
        }
    }

    @Override
    public List findByNamedParam(final String queryString, final String[] paramNames, final Object[] values,
                                 final int firstResult, final int maxResult) throws DaoException {
        if (paramNames.length != values.length) {
            throw new IllegalArgumentException("Length of paramNames array must match length of values array");
        }
        try {
            Session session = this.openSession();
            Query queryObject = session.createQuery(queryString);
            queryObject.setFirstResult(firstResult);
            queryObject.setMaxResults(maxResult);
            prepareQuery(queryObject);
            if (values != null) {
                for (int i = 0; i < values.length; i++) {
                    applyNamedParameterToQuery(queryObject, paramNames[i], values[i]);
                }
            }
            return queryObject.list();
        } catch (HibernateException ex) {
            log.error("Fail to find by named param");
            throw new DaoException("Fail to find by named param", ex);
        } finally {
            if (autoCloseSession)
                closeSession();
        }
    }

    @Override
    public List findByValueBean(final String queryString, final Object valueBean) throws DaoException {
        Session session = this.openSession();
        try {
            Query queryObject = session.createQuery(queryString);
            prepareQuery(queryObject);
            queryObject.setProperties(valueBean);
            return queryObject.list();
        } catch (HibernateException ex) {
            log.error("Fail to find by valueBean", ex);
            throw new DaoException("Fail to find by valueBeam", ex);
        } finally {
            if (autoCloseSession)
                closeSession();
        }
    }

    @Override
    public List findByNamedQuery(String queryName) throws DaoException {
        return findByNamedQuery(queryName, (Object[]) null);
    }

    @Override
    public List findByNamedQuery(String queryName, Object value) throws DaoException {
        return findByNamedQuery(queryName, new Object[]{value});
    }

    @Override
    public List findByNamedQuery(final String queryName, final Object[] values) throws DaoException {
        Session session = this.openSession();
        try {
            Query queryObject = session.getNamedQuery(queryName);
            prepareQuery(queryObject);
            if (values != null) {
                for (int i = 0; i < values.length; i++) {
                    queryObject.setParameter(i, values[i]);
                }
            }
            return queryObject.list();
        } catch (HibernateException ex) {
            log.error("Fail to find by Named query", ex);
            throw new DaoException("Fail to find by Named query", ex);
        } finally {
            if (autoCloseSession)
                closeSession();
        }
    }

    @Override
    public List findByNamedQueryAndNamedParam(String queryName, String paramName, Object value) throws DaoException {
        return findByNamedQueryAndNamedParam(queryName, new String[]{paramName}, new Object[]{value});
    }

    @Override
    public List findByNamedQueryAndNamedParam(final String queryName, final String[] paramNames,
                                              final Object[] values) throws DaoException {
        if (paramNames != null && values != null && paramNames.length != values.length) {
            throw new IllegalArgumentException("Length of paramNames array must match length of values array");
        }
        Session session = this.openSession();
        try {
            Query queryObject = session.getNamedQuery(queryName);
            prepareQuery(queryObject);
            if (values != null) {
                for (int i = 0; i < values.length; i++) {
                    applyNamedParameterToQuery(queryObject, paramNames[i], values[i]);
                }
            }
            return queryObject.list();
        } catch (HibernateException ex) {
            log.error("Fail to find by Named query and Named Param", ex);
            throw new DaoException("Fail to find by Named query and Named Param", ex);
        } finally {
            if (autoCloseSession)
                closeSession();
        }
    }

    @Override
    public List findByNamedQueryAndValueBean(final String queryName, final Object valueBean) throws DaoException {
        Session session = this.openSession();
        try {
            Query queryObject = session.getNamedQuery(queryName);
            prepareQuery(queryObject);
            queryObject.setProperties(valueBean);
            return queryObject.list();
        } catch (HibernateException ex) {
            log.error("Fail to find by Named query and value bean", ex);
            throw new DaoException("Fail to find by Named query and value bean", ex);
        } finally {
            if (autoCloseSession)
                closeSession();
        }
    }

    /**
     * Make query preparation, such as seting cacheable and cache region
     *
     * @param queryObject
     */
    protected void prepareQuery(Query queryObject) {
        if (isCacheQueries()) {
            queryObject.setCacheable(true);
            if (getQueryCacheRegion() != null) {
                queryObject.setCacheRegion(getQueryCacheRegion());
            }
        }
    }

    /**
     * Apply parameter value to query parameter
     *
     * @param queryObject
     * @param paramName
     * @param value
     * @throws HibernateException
     */
    protected void applyNamedParameterToQuery(Query queryObject, String paramName, Object value)
            throws HibernateException {
        if (value instanceof Collection) {
            queryObject.setParameterList(paramName, (Collection) value);
        } else if (value instanceof Object[]) {
            queryObject.setParameterList(paramName, (Object[]) value);
        } else {
            queryObject.setParameter(paramName, value);
        }
    }

    @Override
    public boolean isCacheQueries() {
        return cacheQueries;
    }

    @Override
    public String getQueryCacheRegion() {
        return queryCacheRegion;
    }

    @Override
    public Serializable save(Object persistentObject) throws DaoException {
        try {
            Session session = this.openSession();
            beginTransaction();
            Serializable id = session.save(persistentObject);
            if (autoCommit)
                commitTransaction();
            return id;
        } catch (HibernateException ex) {
            log.error("Fail to save persistentObject", ex);
            throw new DaoException("Fail to save persistentObject", ex);
        } finally {
            if (autoCloseSession)
                closeSession();
        }
    }

    @Override
    public void saveOrUpdate(Object persistentObject) throws DaoException {
        try {
            Session session = this.openSession();
            beginTransaction();
            session.saveOrUpdate(persistentObject);
            if (autoCommit)
                commitTransaction();
        } catch (HibernateException ex) {
            log.error("Fail to save or update persistentObject", ex);
            throw new DaoException("Fail to save or update persistentObject", ex);
        } finally {
            if (autoCloseSession)
                closeSession();
        }
    }

    @Override
    public List find(String queryString, int firstResult, int maxResult) throws DaoException {
        return find(queryString, (Object[]) null, firstResult, maxResult);
    }

    @Override
    public List find(String queryString) throws DaoException {
        return find(queryString, (Object[]) null);
    }

    @Override
    public List find(String queryString, Object value) throws DaoException {
        return find(queryString, new Object[]{value});
    }

    @Override
    public List find(final String queryString, final Object[] values) throws DaoException {
        Session session = this.openSession();
        try {
            Query queryObject = session.createQuery(queryString);
            prepareQuery(queryObject);
            if (values != null) {
                for (int i = 0; i < values.length; i++) {
                    queryObject.setParameter(i, values[i]);
                }
            }
            return queryObject.list();
        } catch (HibernateException ex) {
            log.error("Fail to find by query string", ex);
            throw new DaoException("Fail to find by query string", ex);
        } finally {
            if (autoCloseSession)
                closeSession();
        }
    }

    @Override
    public List find(final String queryString, final Object[] values, final int firstResult,
                     final int maxResult) throws DaoException {
        Session session = this.openSession();
        try {
            Query queryObject = session.createQuery(queryString).setFirstResult(firstResult).setMaxResults(maxResult);
            prepareQuery(queryObject);
            if (values != null) {
                for (int i = 0; i < values.length; i++) {
                    queryObject.setParameter(i, values[i]);
                }
            }
            return queryObject.list();
        } catch (HibernateException ex) {
            log.error("Fail to find by query string", ex);
            throw new DaoException("Fail to find by query string", ex);
        } finally {
            if (autoCloseSession)
                closeSession();
        }
    }

    @Override
    public <T> List<T> loadAll(final Class<T> entityClass, List<Order> order) throws DaoException {

        Session session = this.openSession();
        try {
            beginTransaction();
            Criteria criteria = session.createCriteria(entityClass);

            if (order != null) {
                order.forEach(criteria::addOrder);
            }

            if (autoCommit)
                commitTransaction();
            return criteria.list();
        } catch (HibernateException ex) {
            log.error("Fail to load all ", ex);
            throw new DaoException("Fail to load all", ex);
        } finally {
            if (autoCloseSession)
                closeSession();
        }
    }

    @Override
    public <T> List<T> loadAll(final Class<T> entityClass, final int firstResult,
                               final int maxResult, List<Order> orders)
            throws DaoException {
        Session session = this.openSession();
        try {
            beginTransaction();
            Criteria criteria = session.createCriteria(entityClass)
                    .setFirstResult(firstResult)
                    .setMaxResults(maxResult);

            if (orders != null) {
                orders.forEach(criteria::addOrder);
            }

            if (autoCommit)
                commitTransaction();
            return criteria.list();
        } catch (HibernateException ex) {
            log.error("Fail to load all ", ex);
            throw new DaoException("Fail to load all", ex);
        } finally {
            if (autoCloseSession)
                closeSession();
        }
    }

    /*
     * Get session associated with current thread. Open new session
     * if not exist.
     *
     * @return session
     */
    private Session openSession() {
        return getSession(true);
    }
}