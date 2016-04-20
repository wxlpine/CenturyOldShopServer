/***********************************************************************
 * Module:  MessageDaoImpl.java
 * Author:  cmicat
 * Purpose: Defines dao implementation class for class Message
 ***********************************************************************/

package com.centuryOldShop.server.persistence.daoimpl.hibernate;

import com.centuryOldShop.server.persistence.Message;
import com.centuryOldShop.server.persistence.MessagePK;
import com.centuryOldShop.server.persistence.dao.MessageDao;
import com.sybase.orm.dao.DaoException;
import com.sybase.orm.hibernate.dao.HibernateDaoImpl;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements methods of MessageDao interface
 */

public class MessageDaoImpl extends HibernateDaoImpl implements MessageDao {

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.MessageDao#save(com.centuryOldShop.server.persistence.Message)
     */
    @Override
    public Serializable save(Message messageObject) throws DaoException {
        return super.save(messageObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.MessageDao#load(com.centuryOldShop.server.persistence.MessagePK)
     */
    @Override
    public Message load(MessagePK pk) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        String[] paramNames = new String[]{"messageId"};
        Object[] values = new Object[]{new Long(pk.getMessageId())};
        for (int i = 0; i < paramNames.length; i++)
            cs.add(Restrictions.eq(paramNames[i], values[i]));

        List list = super.findByCriterions(Message.class, cs);
        return (((list != null) && (list.size() > 0)) ? (Message) list.get(0) : null);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.MessageDao#delete(com.centuryOldShop.server.persistence.Message)
     */
    @Override
    public void delete(Message messageObject) throws DaoException {
        super.delete(messageObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.MessageDao#update(com.centuryOldShop.server.persistence.Message)
     */
    @Override
    public void update(Message messageObject) throws DaoException {
        super.update(messageObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.MessageDao#saveOrUpdate(com.centuryOldShop.server.persistence.Message)
     */
    @Override
    public void saveOrUpdate(Message messageObject) throws DaoException {
        super.saveOrUpdate(messageObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.MessageDao#queryByExample(java.lang.Class, com.centuryOldShop.server.persistence.Message)
     */
    @Override
    public List<Message> queryByExample(Message messageObject) throws DaoException {
        return super.queryByExample(Message.class, messageObject);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.MessageDao#getMessageList()
     */
    @Override
    public List<Message> getMessageList() throws DaoException {
        return super.loadAll(Message.class);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.MessageDao#getMessageList(int, int)
     */
    @Override
    public List<Message> getMessageList(int firstResult, int maxResult) {
        return super.loadAll(Message.class, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.MessageDao#findBySendTime(java.util.Date)
     */
    @Override
    public List<Message> findBySendTime(java.util.Date sendTime) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("sendTime", sendTime));
        return super.findByCriterions(Message.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.MessageDao#findBySendTime(java.util.Date, int, int)
     */
    @Override
    public List<Message> findBySendTime(java.util.Date sendTime, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("sendTime", sendTime));
        return super.findByCriterions(Message.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.MessageDao#findByContent(java.lang.String)
     */
    @Override
    public List<Message> findByContent(java.lang.String content) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("content", content));
        return super.findByCriterions(Message.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.MessageDao#findByContent(java.lang.String, int, int)
     */
    @Override
    public List<Message> findByContent(java.lang.String content, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("content", content));
        return super.findByCriterions(Message.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.MessageDao#findBySendUser(com.centuryOldShop.server.persistence.AppUser)
     */
    @Override
    public List<Message> findBySendUser(com.centuryOldShop.server.persistence.AppUser sendUser) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("sendUser", sendUser));
        return super.findByCriterions(Message.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.MessageDao#findBySendUser(com.centuryOldShop.server.persistence.AppUser, int, int)
     */
    @Override
    public List<Message> findBySendUser(com.centuryOldShop.server.persistence.AppUser sendUser, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("sendUser", sendUser));
        return super.findByCriterions(Message.class, cs, firstResult, maxResult);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.MessageDao#findByReceiveUser(com.centuryOldShop.server.persistence.AppUser)
     */
    @Override
    public List<Message> findByReceiveUser(com.centuryOldShop.server.persistence.AppUser receiveUser) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("receiveUser", receiveUser));
        return super.findByCriterions(Message.class, cs);
    }

    /* (non-Javadoc)
     * @see com.centuryOldShop.server.persistence.dao.MessageDao#findByReceiveUser(com.centuryOldShop.server.persistence.AppUser, int, int)
     */
    @Override
    public List<Message> findByReceiveUser(com.centuryOldShop.server.persistence.AppUser receiveUser, int firstResult, int maxResult) throws DaoException {
        List<Criterion> cs = new ArrayList<>();
        cs.add(Restrictions.eq("receiveUser", receiveUser));
        return super.findByCriterions(Message.class, cs, firstResult, maxResult);
    }
}