/***********************************************************************
 * Module:  MessageTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class Message
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.MessageDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Test helper class for Message. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class MessageTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(MessageTestHelper.class);

    /**
     * Empty Constructor
     */
    public MessageTestHelper() {

    }

    /**
     * Create new Message instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static Message newInstance(Message persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new Message();

//        persistentObject.setMessageId((long) random.nextInt());
        persistentObject.setSendTime(com.centuryOldShop.server.Util.getRandomDate());
        persistentObject.setContent(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        if (precedingObject != null && associationId.equals("F65FB421-7546-45B4-B69C-3902DECB6B59")) {
            persistentObject.setSendUser((AppUser) precedingObject);
        }

        if (precedingObject != null && associationId.equals("93D61792-C9D6-4F71-B280-1051DDE83EF5")) {
            persistentObject.setReceiveUser((AppUser) precedingObject);
        }
        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param persistentObject saved persistent object
     */

    public static void modifyObject(Message persistentObject) {
        persistentObject.setSendTime(com.centuryOldShop.server.Util.getRandomDate());
        persistentObject.setContent(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
    }

    /**
     * Save Message object. Foreign key constraints are taked cared here.
     *
     * @param messageObject persistent object to be saved
     * @throws Exception
     */
    public static void save(Message messageObject) {

        AppUser sendUser = messageObject.getSendUser();
        if (sendUser == null) {
            sendUser = com.centuryOldShop.server.persistence.AppUserTestHelper.newInstance(null, null, "F65FB421-7546-45B4-B69C-3902DECB6B59", 1, false);
        }
        sendUser.setSendMessage(null);
        DaoFactory.getDaoFactory().getAppUserDao().save(sendUser);
        messageObject.setSendUser(sendUser);
        AppUser receiveUser = messageObject.getReceiveUser();
        if (receiveUser == null) {
            receiveUser = com.centuryOldShop.server.persistence.AppUserTestHelper.newInstance(null, null, "93D61792-C9D6-4F71-B280-1051DDE83EF5", 1, false);
        }
        receiveUser.setReceiveMessage(null);
        DaoFactory.getDaoFactory().getAppUserDao().save(receiveUser);
        messageObject.setReceiveUser(receiveUser);
        MessageDao dao = DaoFactory.getDaoFactory().getMessageDao();
        dao.saveOrUpdate(messageObject);
    }

    /**
     * Delete Message object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param messageObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(Message messageObject) {
        MessageDao dao = DaoFactory.getDaoFactory().getMessageDao();
        dao.delete(messageObject);
    }

    /**
     * Get Message instance from collection by primary key.
     *
     * @param collection Message instance collection
     * @param pk         primary key
     * @return Message instance
     */
    public static Message getMessageByPk(Collection collection, MessagePK pk) {
        Message messageObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Message object = (Message) iterator.next();
            if (object.getMessagePK().equals(pk)) {
                messageObject = object;
                break;
            }
        }
        return messageObject;
    }

    /**
     * Get Message instance from <Code>Message</Code> instance array by primary key.
     *
     * @param messageArray Message instance array
     * @param pk           primary key
     * @return Message instance
     */
    public static Message getMessageByPk(Message[] messageArray, MessagePK pk) {
        return messageArray == null ? null : getMessageByPk(Arrays.asList(messageArray), pk);
    }
}