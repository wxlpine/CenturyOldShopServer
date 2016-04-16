/***********************************************************************
 * Module:  MessageTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class Message's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.MessageDao;
import factory.DaoFactory;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Test case class to test Message's persistence
 */
@SuppressWarnings("ALL")
public class MessageTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    MessageDao dao;

    private Log logger = LogFactory.getLog(MessageTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public MessageTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>Message</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        Message message = null;
        // Create new instance, delete instance if exists in database
        message = preInsert();
        // Perform insert
        doInsert(message);
        // Do assert
        afterInsert(message);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>Message</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        Message message = null;
        // Create and insert new instance
        message = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(message);
        // Do assert
        afterUpdate(message);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>Message</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        Message message = null;
        // Insert new Message instance
        message = preDelete();
        // Perform delete
        doDelete(message);
        // Do assert
        afterDelete(message);
        logger.debug("Test delete ends!");
    }


    /**
     * Test query function </tt>findBySendTime</tt>. First create multiple
     * <Code>Message</Code> instances and save them by <tt>preFindBySendTime</tt>.
     * Then delegate the query operation to method <tt>doFindBySendTime</tt>.
     * In the end do some asserts in <tt>afterFindBySendTime</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindBySendTime() throws Exception {

        logger.debug("Test find-by-sendTime begins!");
        java.util.Date sendTime = new java.util.Date(random.nextInt(10000));
        List messages = new ArrayList();
        // Create and insert sendTime instances
        messages = preFindBySendTime(sendTime);
        // Perform query
        List result = doFindBySendTime(sendTime);
        // Do asserts
        afterFindBySendTime(messages, result);
        logger.debug("Test find-by-sendTime ends!");

    }

    /**
     * Test query function </tt>findByContent</tt>. First create multiple
     * <Code>Message</Code> instances and save them by <tt>preFindByContent</tt>.
     * Then delegate the query operation to method <tt>doFindByContent</tt>.
     * In the end do some asserts in <tt>afterFindByContent</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByContent() throws Exception {

        logger.debug("Test find-by-content begins!");
        java.lang.String content = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List messages = new ArrayList();
        // Create and insert content instances
        messages = preFindByContent(content);
        // Perform query
        List result = doFindByContent(content);
        // Do asserts
        afterFindByContent(messages, result);
        logger.debug("Test find-by-content ends!");

    }

    /**
     * Test function getMessageList. First create multiple <Code>Message</Code>
     * instances and save them by <tt>preGetMessageList</tt>. Then delegate the
     * find all operation to method <tt>doGetMessageList</tt>. In the end do asserts
     * in <tt>afterGetMessageList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetMessageList() throws Exception {
        logger.debug("Test get-message-list begins!");

        List messages = new ArrayList();
        // Insert Message instance
        messages = preGetMessageList();
        // Perform query
        List result = doGetMessageList();
        // Make assertion
        afterGetMessageList(messages, result);
        logger.debug("Test get-message-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>Message</Code> instance
     * @throws Exception
     */
    private Message preInsert() throws Exception {
        Message message = MessageTestHelper.newInstance(null, null, "", 0, false);
        Message old = dao.load(message.getMessagePK());
        if (old != null)
            MessageTestHelper.delete(old);
        return message;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param message instance to insert
     * @throws Exception
     */
    private void doInsert(Message message) {
        MessageTestHelper.save(message);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param message inserted instance
     * @throws Exception
     */
    private void afterInsert(Message message) {
        Message anotherMessage = dao.load(message.getMessagePK());
        assertEquals("Queried result does not equal to inserted instance",
                message, anotherMessage);
        MessageTestHelper.delete(anotherMessage);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>Message</Code> instance
     * @throws Exception
     * @see MessageTest#prepare()
     */
    private Message preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param message object to update
     * @throws Exception
     */
    private void doUpdate(Message message) throws Exception {
        MessageTestHelper.modifyObject(message);
        dao.update(message);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param message object to update
     * @throws Exception
     */
    private void afterUpdate(Message message) throws Exception {
        Message another = dao.load(message.getMessagePK());
        assertEquals("Queried result does not equal to updated instance", message, another);
        MessageTestHelper.delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>Message</Code> instance
     * @throws Exception
     * @see MessageTest#prepare()
     */
    private Message preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param message object to delete
     * @throws Exception
     */
    private void doDelete(Message message) throws Exception {
        MessageTestHelper.delete(message);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param message deleted object
     * @throws Exception
     */
    private void afterDelete(Message message) throws Exception {
        Message another = dao.load(message.getMessagePK());
        assertNull("Inserted instance is not deleted", another);
    }


    /**
     * Do function <tt>FindBySendTime</tt> test preparation. Delete <Code>Message</Code>
     * instances whose property sendTime's value is sendTime from persistent store. Then Create
     * multiple <Code>Message</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindBySendTime(java.util.Date sendTime) throws Exception {
        List messages = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldMessages = dao.findBySendTime(sendTime);

        if (oldMessages != null) {
            Iterator it = oldMessages.iterator();
            while (it.hasNext())
                MessageTestHelper.delete((Message) it.next());
        }

        // Create instances of random count, set their sendTime value to sendTime
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Message message = MessageTestHelper.newInstance(null, null, "", 0, false);
            message.setSendTime(sendTime);
            deleteBeforeSave(message);
            dao.commitTransaction();
            messages.add(i, message);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return messages;
    }

    /**
     * Perform <tt>FindBySendTime</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindBySendTime(java.util.Date sendTime) {
        return dao.findBySendTime(sendTime);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findBySendTimet</tt>.
     *
     * @param messages    inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindBySendTime(List messages, List resultFound) {
        if (messages != null && messages.size() > 0) {
            assertNotNull("Result returned by find-by-sendTime is null.", resultFound);
            assertEquals("Result count returned by find-by-sendTime is incorrect.", messages.size(), resultFound.size());

            Iterator it = messages.iterator();
            while (it.hasNext()) {
                Message message = (Message) it.next();
                Message another = MessageTestHelper.getMessageByPk(resultFound, message.getMessagePK());
                assertEquals("Result returned by find-by-sendTime does not equal to inserted message object.", message, another);
                MessageTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByContent</tt> test preparation. Delete <Code>Message</Code>
     * instances whose property content's value is content from persistent store. Then Create
     * multiple <Code>Message</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByContent(java.lang.String content) throws Exception {
        List messages = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldMessages = dao.findByContent(content);

        if (oldMessages != null) {
            Iterator it = oldMessages.iterator();
            while (it.hasNext())
                MessageTestHelper.delete((Message) it.next());
        }

        // Create instances of random count, set their content value to content
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Message message = MessageTestHelper.newInstance(null, null, "", 0, false);
            message.setContent(content);
            deleteBeforeSave(message);
            dao.commitTransaction();
            messages.add(i, message);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return messages;
    }

    /**
     * Perform <tt>FindByContent</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByContent(java.lang.String content) {
        return dao.findByContent(content);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByContentt</tt>.
     *
     * @param messages    inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByContent(List messages, List resultFound) {
        if (messages != null && messages.size() > 0) {
            assertNotNull("Result returned by find-by-content is null.", resultFound);
            assertEquals("Result count returned by find-by-content is incorrect.", messages.size(), resultFound.size());

            Iterator it = messages.iterator();
            while (it.hasNext()) {
                Message message = (Message) it.next();
                Message another = MessageTestHelper.getMessageByPk(resultFound, message.getMessagePK());
                assertEquals("Result returned by find-by-content does not equal to inserted message object.", message, another);
                MessageTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>getMessageList</tt> test preparation.  First delete any <Code>Message</Code>
     * instance from persistent store if exists. Then create multiple <Code>Message</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetMessageList() throws Exception {
        List messages = new ArrayList();
        dao.setAutoCommit(false);

        List oldMessages = dao.getMessageList();

        if (oldMessages != null) {
            Iterator it = oldMessages.iterator();
            while (it.hasNext())
                MessageTestHelper.delete((Message) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            Message message = prepare();
            dao.update(message);
            dao.commitTransaction();
            messages.add(i, message);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return messages;
    }

    /**
     * Perform <tt>getMessageList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetMessageList() throws Exception {
        return dao.getMessageList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getMessageList</tt>.
     *
     * @param messages    inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterGetMessageList(List messages, List resultFound) {
        if (messages != null && messages.size() > 0) {
            assertNotNull("Result returned by get-message-list is null.", resultFound);
            assertEquals("Result count returned by get-message-list is incorrect.", messages.size(), resultFound.size());

            Iterator it = messages.iterator();
            while (it.hasNext()) {
                Message message = (Message) it.next();
                Message another = MessageTestHelper.getMessageByPk(resultFound, message.getMessagePK());
                assertEquals("Result returned by get-message-list does not equal to inserted message object.", message, another);
                MessageTestHelper.delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>Message</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>Message</Code> instance
     * @throws Exception
     */
    private Message prepare() {
        Message message = MessageTestHelper.newInstance(null, null, "", 0, false);
        return deleteBeforeSave(message);
    }

    /**
     * For a new <Code>Message</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param message
     * @return newly created and saved <Code>Message</Code> instance
     * @throws Exception
     */
    private Message deleteBeforeSave(Message message) {
        // Delete instance from data store if already exists
        Message old = dao.load(message.getMessagePK());
        if (old != null)
            MessageTestHelper.delete(old);
        MessageTestHelper.save(message);
        return message;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getMessageDao();
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
        if (dao != null) dao.closeSession();
    }

    /**
     * Return test suite containing current test class
     *
     * @return test suite containing test class <Code>MessageTest</Code>
     */
    public static Test suite() {
        return new TestSuite(MessageTest.class);
    }
}