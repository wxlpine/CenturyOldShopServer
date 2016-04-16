/***********************************************************************
 * Module:  DisputeStatusTypeDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class DisputeStatusType
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.DisputeStatusType;
import com.centuryOldShop.server.persistence.DisputeStatusTypePK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class DisputeStatusType
 */
public interface DisputeStatusTypeDao extends Dao {

    /**
     * Save <Code>DisputeStatusType</Code> instance
     *
     * @param disputeStatusTypeObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(DisputeStatusType disputeStatusTypeObject) throws DaoException;

    /**
     * Load <Code>DisputeStatusType</Code> instance by primary key
     *
     * @param pk
     * @return <Code>DisputeStatusType</Code> instance
     * @throws DaoException
     */
    public DisputeStatusType load(DisputeStatusTypePK pk) throws DaoException;

    /**
     * Delete <Code>DisputeStatusType</Code> instance from persistence store
     *
     * @param disputeStatusTypeObject
     * @throws DaoException
     */
    public void delete(DisputeStatusType disputeStatusTypeObject) throws DaoException;

    /**
     * Update <Code>DisputeStatusType</Code> instance to persistence store
     *
     * @param disputeStatusTypeObject
     * @throws DaoException
     */
    public void update(DisputeStatusType disputeStatusTypeObject) throws DaoException;

    /**
     * Save or update <Code>DisputeStatusType</Code> instance to persistence store
     *
     * @param disputeStatusTypeObject
     * @throws DaoException
     */
    public void saveOrUpdate(DisputeStatusType disputeStatusTypeObject) throws DaoException;

    /**
     * Get all <Code>DisputeStatusType</Code> instances from persistence store
     *
     * @return <Code>DisputeStatusType</Code> instance list
     * @throws DaoException
     */
    public List getDisputeStatusTypeList() throws DaoException;

    /**
     * Get all <Code>DisputeStatusType</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>DisputeStatusType</Code> instance list
     * @throws DaoException
     */
    public List getDisputeStatusTypeList(int firstResult, int maxResult);

    /**
     * Query <Code>DisputeStatusType</Code> instances by example instance
     *
     * @param disputeStatusTypeObject example instance
     * @return <Code>DisputeStatusType</Code> instance list
     * @throws DaoException
     */
    public List queryByExample(DisputeStatusType disputeStatusTypeObject) throws DaoException;

}