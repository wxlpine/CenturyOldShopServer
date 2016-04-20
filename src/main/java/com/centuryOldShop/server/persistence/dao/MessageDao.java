/***********************************************************************
 * Module:  MessageDao.java
 * Author:  cmicat
 * Purpose: Defines the dao interface for class Message
 ***********************************************************************/

package com.centuryOldShop.server.persistence.dao;

import com.centuryOldShop.server.persistence.Message;
import com.centuryOldShop.server.persistence.MessagePK;
import com.sybase.orm.dao.Dao;
import com.sybase.orm.dao.DaoException;

import java.io.Serializable;
import java.util.List;

/**
 * dao interface that defines data access methods for class Message
 */
public interface MessageDao extends Dao {

    /**
     * Save <Code>Message</Code> instance
     *
     * @param messageObject
     * @return identifier
     * @throws DaoException
     */
    public Serializable save(Message messageObject) throws DaoException;

    /**
     * Load <Code>Message</Code> instance by primary key
     *
     * @param pk
     * @return <Code>Message</Code> instance
     * @throws DaoException
     */
    public Message load(MessagePK pk) throws DaoException;

    /**
     * Delete <Code>Message</Code> instance from persistence store
     *
     * @param messageObject
     * @throws DaoException
     */
    public void delete(Message messageObject) throws DaoException;

    /**
     * Update <Code>Message</Code> instance to persistence store
     *
     * @param messageObject
     * @throws DaoException
     */
    public void update(Message messageObject) throws DaoException;

    /**
     * Save or update <Code>Message</Code> instance to persistence store
     *
     * @param messageObject
     * @throws DaoException
     */
    public void saveOrUpdate(Message messageObject) throws DaoException;

    /**
     * Get all <Code>Message</Code> instances from persistence store
     *
     * @return <Code>Message</Code> instance list
     * @throws DaoException
     */
    List<Message> getMessageList() throws DaoException;

    /**
     * Get all <Code>Message</Code> instances from persistence store by range
     *
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>Message</Code> instance list
     * @throws DaoException
     */
    List<Message> getMessageList(int firstResult, int maxResult);

    /**
     * Query <Code>Message</Code> instances by example instance
     *
     * @param messageObject example instance
     * @return <Code>Message</Code> instance list
     * @throws DaoException
     */
    List<Message> queryByExample(Message messageObject) throws DaoException;

    /**
     * Find <Code>Message</Code> instances from persistence store by sendTime
     *
     * @param sendTime
     * @return <Code>Message</Code> instance list
     * @throws DaoException
     */
    List<Message> findBySendTime(java.util.Date sendTime) throws DaoException;

    /**
     * Find <Code>Message</Code> instances in range firstResult, maxResult
     * from persistence store by field sendTime
     *
     * @param sendTime
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>Message</Code> instance list
     * @throws DaoException
     */
    List<Message> findBySendTime(java.util.Date sendTime, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Message</Code> instances from persistence store by content
     *
     * @param content
     * @return <Code>Message</Code> instance list
     * @throws DaoException
     */
    List<Message> findByContent(java.lang.String content) throws DaoException;

    /**
     * Find <Code>Message</Code> instances in range firstResult, maxResult
     * from persistence store by field content
     *
     * @param content
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>Message</Code> instance list
     * @throws DaoException
     */
    List<Message> findByContent(java.lang.String content, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Message</Code> instances from persistence store by AppUser
     *
     * @param sendUser
     * @return <Code>Message</Code> instance list
     * @throws DaoException
     */
    List<Message> findBySendUser(com.centuryOldShop.server.persistence.AppUser sendUser) throws DaoException;

    /**
     * Find <Code>Message</Code> instances  instances in range firstResult, maxResult
     * from persistence store by AppUser
     *
     * @param sendUser
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>Message</Code> instance list
     * @throws DaoException
     */
    List<Message> findBySendUser(com.centuryOldShop.server.persistence.AppUser sendUser, int firstResult, int maxResult) throws DaoException;

    /**
     * Find <Code>Message</Code> instances from persistence store by AppUser
     *
     * @param receiveUser
     * @return <Code>Message</Code> instance list
     * @throws DaoException
     */
    List<Message> findByReceiveUser(com.centuryOldShop.server.persistence.AppUser receiveUser) throws DaoException;

    /**
     * Find <Code>Message</Code> instances  instances in range firstResult, maxResult
     * from persistence store by AppUser
     *
     * @param receiveUser
     * @param firstResult first result to return
     * @param maxResult   max result to return
     * @return <Code>Message</Code> instance list
     * @throws DaoException
     */
    List<Message> findByReceiveUser(com.centuryOldShop.server.persistence.AppUser receiveUser, int firstResult, int maxResult) throws DaoException;
}