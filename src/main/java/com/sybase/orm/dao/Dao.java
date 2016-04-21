/***********************************************************************
 * Module:  Dao.java
 * Author:  cmicat
 * Purpose: Defines common interface for data access
 ***********************************************************************/

package com.sybase.orm.dao;

/**
 * Interface that defines common methods used by data access.
 */
public interface Dao {

    /**
     * Close connection used
     */
    public void closeConnection() throws DaoException;

    /**
     * Begin transaction
     */
    public void beginTransaction() throws DaoException;

    /**
     * Begin transaction
     */
    public void commitTransaction() throws DaoException;

    /**
     * Rollback transaction
     */
    public void rollbackTransaction() throws DaoException;

    /**
     * Check if auto commit is set
     *
     * @return Auto commit flag
     */
    public boolean isAutoCommit();

    /**
     * Set auto commit flag
     */
    public void setAutoCommit(boolean autoCommit);

    /**
     * Check if auto close session is set
     *
     * @return Auto close session flag
     */
    public boolean isAutoCloseSession();

    /**
     * Set auto close session flag
     *
     * @param autoClose
     */
    public void setAutoCloseSession(boolean autoClose);

    /**
     * Close session
     */
    public void closeSession() throws DaoException;

    /**
     * Flush session
     *
     * @return
     */
    public void flushSession() throws DaoException;

    /**
     * Clear session
     */
    public void clearSession() throws DaoException;
}