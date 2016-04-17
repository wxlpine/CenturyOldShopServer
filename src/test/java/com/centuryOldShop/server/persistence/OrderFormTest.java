/***********************************************************************
 * Module:  OrderFormTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class OrderForm's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.OrderFormDao;
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
 * Test case class to test OrderForm's persistence
 */
@SuppressWarnings("ALL")
public class OrderFormTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    OrderFormDao dao;

    private Log logger = LogFactory.getLog(OrderFormTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public OrderFormTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>OrderForm</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        OrderForm orderForm = null;
        // Create new instance, delete instance if exists in database
        orderForm = preInsert();
        // Perform insert
        doInsert(orderForm);
        // Do assert
        afterInsert(orderForm);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>OrderForm</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        OrderForm orderForm = null;
        // Create and insert new instance
        orderForm = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(orderForm);
        // Do assert
        afterUpdate(orderForm);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>OrderForm</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        OrderForm orderForm = null;
        // Insert new OrderForm instance
        orderForm = preDelete();
        // Perform delete
        doDelete(orderForm);
        // Do assert
        afterDelete(orderForm);
        logger.debug("Test delete ends!");
    }


    /**
     * Test query function </tt>findByOrderedTime</tt>. First create multiple
     * <Code>OrderForm</Code> instances and save them by <tt>preFindByOrderedTime</tt>.
     * Then delegate the query operation to method <tt>doFindByOrderedTime</tt>.
     * In the end do some asserts in <tt>afterFindByOrderedTime</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByOrderedTime() throws Exception {

        logger.debug("Test find-by-orderedTime begins!");
        java.util.Date orderedTime = com.centuryOldShop.server.Util.getRandomDate();
        List orderForms = new ArrayList();
        // Create and insert orderedTime instances
        orderForms = preFindByOrderedTime(orderedTime);
        // Perform query
        List result = doFindByOrderedTime(orderedTime);
        // Do asserts
        afterFindByOrderedTime(orderForms, result);
        logger.debug("Test find-by-orderedTime ends!");

    }

    /**
     * Test query function </tt>findByPayedTime</tt>. First create multiple
     * <Code>OrderForm</Code> instances and save them by <tt>preFindByPayedTime</tt>.
     * Then delegate the query operation to method <tt>doFindByPayedTime</tt>.
     * In the end do some asserts in <tt>afterFindByPayedTime</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByPayedTime() throws Exception {

        logger.debug("Test find-by-payedTime begins!");
        java.util.Date payedTime = com.centuryOldShop.server.Util.getRandomDate();
        List orderForms = new ArrayList();
        // Create and insert payedTime instances
        orderForms = preFindByPayedTime(payedTime);
        // Perform query
        List result = doFindByPayedTime(payedTime);
        // Do asserts
        afterFindByPayedTime(orderForms, result);
        logger.debug("Test find-by-payedTime ends!");

    }

    /**
     * Test query function </tt>findBySendTime</tt>. First create multiple
     * <Code>OrderForm</Code> instances and save them by <tt>preFindBySendTime</tt>.
     * Then delegate the query operation to method <tt>doFindBySendTime</tt>.
     * In the end do some asserts in <tt>afterFindBySendTime</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindBySendTime() throws Exception {

        logger.debug("Test find-by-sendTime begins!");
        java.util.Date sendTime = com.centuryOldShop.server.Util.getRandomDate();
        List orderForms = new ArrayList();
        // Create and insert sendTime instances
        orderForms = preFindBySendTime(sendTime);
        // Perform query
        List result = doFindBySendTime(sendTime);
        // Do asserts
        afterFindBySendTime(orderForms, result);
        logger.debug("Test find-by-sendTime ends!");

    }

    /**
     * Test query function </tt>findByReceiptedTime</tt>. First create multiple
     * <Code>OrderForm</Code> instances and save them by <tt>preFindByReceiptedTime</tt>.
     * Then delegate the query operation to method <tt>doFindByReceiptedTime</tt>.
     * In the end do some asserts in <tt>afterFindByReceiptedTime</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByReceiptedTime() throws Exception {

        logger.debug("Test find-by-receiptedTime begins!");
        java.util.Date receiptedTime = com.centuryOldShop.server.Util.getRandomDate();
        List orderForms = new ArrayList();
        // Create and insert receiptedTime instances
        orderForms = preFindByReceiptedTime(receiptedTime);
        // Perform query
        List result = doFindByReceiptedTime(receiptedTime);
        // Do asserts
        afterFindByReceiptedTime(orderForms, result);
        logger.debug("Test find-by-receiptedTime ends!");

    }

    /**
     * Test query function </tt>findByExpressNumber</tt>. First create multiple
     * <Code>OrderForm</Code> instances and save them by <tt>preFindByExpressNumber</tt>.
     * Then delegate the query operation to method <tt>doFindByExpressNumber</tt>.
     * In the end do some asserts in <tt>afterFindByExpressNumber</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByExpressNumber() throws Exception {

        logger.debug("Test find-by-expressNumber begins!");
        java.lang.String expressNumber = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List orderForms = new ArrayList();
        // Create and insert expressNumber instances
        orderForms = preFindByExpressNumber(expressNumber);
        // Perform query
        List result = doFindByExpressNumber(expressNumber);
        // Do asserts
        afterFindByExpressNumber(orderForms, result);
        logger.debug("Test find-by-expressNumber ends!");

    }

    /**
     * Test function getOrderFormList. First create multiple <Code>OrderForm</Code>
     * instances and save them by <tt>preGetOrderFormList</tt>. Then delegate the
     * find all operation to method <tt>doGetOrderFormList</tt>. In the end do asserts
     * in <tt>afterGetOrderFormList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetOrderFormList() throws Exception {
        logger.debug("Test get-orderForm-list begins!");

        List orderForms = new ArrayList();
        // Insert OrderForm instance
        orderForms = preGetOrderFormList();
        // Perform query
        List result = doGetOrderFormList();
        // Make assertion
        afterGetOrderFormList(orderForms, result);
        logger.debug("Test get-orderForm-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>OrderForm</Code> instance
     * @throws Exception
     */
    private OrderForm preInsert() throws Exception {
        OrderForm orderForm = OrderFormTestHelper.newInstance(null, null, "", 0, false);
        OrderForm old = dao.load(orderForm.getOrderFormPK());
        if (old != null)
            OrderFormTestHelper.delete(old);
        return orderForm;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param orderForm instance to insert
     * @throws Exception
     */
    private void doInsert(OrderForm orderForm) {
        OrderFormTestHelper.save(orderForm);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param orderForm inserted instance
     * @throws Exception
     */
    private void afterInsert(OrderForm orderForm) {
        OrderForm anotherOrderForm = dao.load(orderForm.getOrderFormPK());
        assertEquals("Queried result does not equal to inserted instance",
                orderForm, anotherOrderForm);
        OrderFormTestHelper.delete(anotherOrderForm);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>OrderForm</Code> instance
     * @throws Exception
     * @see OrderFormTest#prepare()
     */
    private OrderForm preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param orderForm object to update
     * @throws Exception
     */
    private void doUpdate(OrderForm orderForm) throws Exception {
        OrderFormTestHelper.modifyObject(orderForm);
        dao.update(orderForm);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param orderForm object to update
     * @throws Exception
     */
    private void afterUpdate(OrderForm orderForm) throws Exception {
        OrderForm another = dao.load(orderForm.getOrderFormPK());
        assertEquals("Queried result does not equal to updated instance", orderForm, another);
        OrderFormTestHelper.delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>OrderForm</Code> instance
     * @throws Exception
     * @see OrderFormTest#prepare()
     */
    private OrderForm preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param orderForm object to delete
     * @throws Exception
     */
    private void doDelete(OrderForm orderForm) throws Exception {
        OrderFormTestHelper.delete(orderForm);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param orderForm deleted object
     * @throws Exception
     */
    private void afterDelete(OrderForm orderForm) throws Exception {
        OrderForm another = dao.load(orderForm.getOrderFormPK());
        assertNull("Inserted instance is not deleted", another);
    }


    /**
     * Do function <tt>FindByOrderedTime</tt> test preparation. Delete <Code>OrderForm</Code>
     * instances whose property orderedTime's value is orderedTime from persistent store. Then Create
     * multiple <Code>OrderForm</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByOrderedTime(java.util.Date orderedTime) throws Exception {
        List orderForms = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldOrderForms = dao.findByOrderedTime(orderedTime);

        if (oldOrderForms != null) {
            Iterator it = oldOrderForms.iterator();
            while (it.hasNext())
                OrderFormTestHelper.delete((OrderForm) it.next());
        }

        // Create instances of random count, set their orderedTime value to orderedTime
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            OrderForm orderForm = OrderFormTestHelper.newInstance(null, null, "", 0, false);
            orderForm.setOrderedTime(orderedTime);
            deleteBeforeSave(orderForm);
            dao.commitTransaction();
            orderForms.add(i, orderForm);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return orderForms;
    }

    /**
     * Perform <tt>FindByOrderedTime</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByOrderedTime(java.util.Date orderedTime) {
        return dao.findByOrderedTime(orderedTime);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByOrderedTimet</tt>.
     *
     * @param orderForms  inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByOrderedTime(List orderForms, List resultFound) {
        if (orderForms != null && orderForms.size() > 0) {
            assertNotNull("Result returned by find-by-orderedTime is null.", resultFound);
            assertEquals("Result count returned by find-by-orderedTime is incorrect.", orderForms.size(), resultFound.size());

            Iterator it = orderForms.iterator();
            while (it.hasNext()) {
                OrderForm orderForm = (OrderForm) it.next();
                OrderForm another = OrderFormTestHelper.getOrderFormByPk(resultFound, orderForm.getOrderFormPK());
                assertEquals("Result returned by find-by-orderedTime does not equal to inserted orderForm object.", orderForm, another);
                OrderFormTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByPayedTime</tt> test preparation. Delete <Code>OrderForm</Code>
     * instances whose property payedTime's value is payedTime from persistent store. Then Create
     * multiple <Code>OrderForm</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByPayedTime(java.util.Date payedTime) throws Exception {
        List orderForms = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldOrderForms = dao.findByPayedTime(payedTime);

        if (oldOrderForms != null) {
            Iterator it = oldOrderForms.iterator();
            while (it.hasNext())
                OrderFormTestHelper.delete((OrderForm) it.next());
        }

        // Create instances of random count, set their payedTime value to payedTime
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            OrderForm orderForm = OrderFormTestHelper.newInstance(null, null, "", 0, false);
            orderForm.setPayedTime(payedTime);
            deleteBeforeSave(orderForm);
            dao.commitTransaction();
            orderForms.add(i, orderForm);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return orderForms;
    }

    /**
     * Perform <tt>FindByPayedTime</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByPayedTime(java.util.Date payedTime) {
        return dao.findByPayedTime(payedTime);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByPayedTimet</tt>.
     *
     * @param orderForms  inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByPayedTime(List orderForms, List resultFound) {
        if (orderForms != null && orderForms.size() > 0) {
            assertNotNull("Result returned by find-by-payedTime is null.", resultFound);
            assertEquals("Result count returned by find-by-payedTime is incorrect.", orderForms.size(), resultFound.size());

            Iterator it = orderForms.iterator();
            while (it.hasNext()) {
                OrderForm orderForm = (OrderForm) it.next();
                OrderForm another = OrderFormTestHelper.getOrderFormByPk(resultFound, orderForm.getOrderFormPK());
                assertEquals("Result returned by find-by-payedTime does not equal to inserted orderForm object.", orderForm, another);
                OrderFormTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindBySendTime</tt> test preparation. Delete <Code>OrderForm</Code>
     * instances whose property sendTime's value is sendTime from persistent store. Then Create
     * multiple <Code>OrderForm</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindBySendTime(java.util.Date sendTime) throws Exception {
        List orderForms = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldOrderForms = dao.findBySendTime(sendTime);

        if (oldOrderForms != null) {
            Iterator it = oldOrderForms.iterator();
            while (it.hasNext())
                OrderFormTestHelper.delete((OrderForm) it.next());
        }

        // Create instances of random count, set their sendTime value to sendTime
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            OrderForm orderForm = OrderFormTestHelper.newInstance(null, null, "", 0, false);
            orderForm.setSendTime(sendTime);
            deleteBeforeSave(orderForm);
            dao.commitTransaction();
            orderForms.add(i, orderForm);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return orderForms;
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
     * @param orderForms  inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindBySendTime(List orderForms, List resultFound) {
        if (orderForms != null && orderForms.size() > 0) {
            assertNotNull("Result returned by find-by-sendTime is null.", resultFound);
            assertEquals("Result count returned by find-by-sendTime is incorrect.", orderForms.size(), resultFound.size());

            Iterator it = orderForms.iterator();
            while (it.hasNext()) {
                OrderForm orderForm = (OrderForm) it.next();
                OrderForm another = OrderFormTestHelper.getOrderFormByPk(resultFound, orderForm.getOrderFormPK());
                assertEquals("Result returned by find-by-sendTime does not equal to inserted orderForm object.", orderForm, another);
                OrderFormTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByReceiptedTime</tt> test preparation. Delete <Code>OrderForm</Code>
     * instances whose property receiptedTime's value is receiptedTime from persistent store. Then Create
     * multiple <Code>OrderForm</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByReceiptedTime(java.util.Date receiptedTime) throws Exception {
        List orderForms = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldOrderForms = dao.findByReceiptedTime(receiptedTime);

        if (oldOrderForms != null) {
            Iterator it = oldOrderForms.iterator();
            while (it.hasNext())
                OrderFormTestHelper.delete((OrderForm) it.next());
        }

        // Create instances of random count, set their receiptedTime value to receiptedTime
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            OrderForm orderForm = OrderFormTestHelper.newInstance(null, null, "", 0, false);
            orderForm.setReceiptedTime(receiptedTime);
            deleteBeforeSave(orderForm);
            dao.commitTransaction();
            orderForms.add(i, orderForm);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return orderForms;
    }

    /**
     * Perform <tt>FindByReceiptedTime</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByReceiptedTime(java.util.Date receiptedTime) {
        return dao.findByReceiptedTime(receiptedTime);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByReceiptedTimet</tt>.
     *
     * @param orderForms  inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByReceiptedTime(List orderForms, List resultFound) {
        if (orderForms != null && orderForms.size() > 0) {
            assertNotNull("Result returned by find-by-receiptedTime is null.", resultFound);
            assertEquals("Result count returned by find-by-receiptedTime is incorrect.", orderForms.size(), resultFound.size());

            Iterator it = orderForms.iterator();
            while (it.hasNext()) {
                OrderForm orderForm = (OrderForm) it.next();
                OrderForm another = OrderFormTestHelper.getOrderFormByPk(resultFound, orderForm.getOrderFormPK());
                assertEquals("Result returned by find-by-receiptedTime does not equal to inserted orderForm object.", orderForm, another);
                OrderFormTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByExpressNumber</tt> test preparation. Delete <Code>OrderForm</Code>
     * instances whose property expressNumber's value is expressNumber from persistent store. Then Create
     * multiple <Code>OrderForm</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByExpressNumber(java.lang.String expressNumber) throws Exception {
        List orderForms = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldOrderForms = dao.findByExpressNumber(expressNumber);

        if (oldOrderForms != null) {
            Iterator it = oldOrderForms.iterator();
            while (it.hasNext())
                OrderFormTestHelper.delete((OrderForm) it.next());
        }

        // Create instances of random count, set their expressNumber value to expressNumber
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            OrderForm orderForm = OrderFormTestHelper.newInstance(null, null, "", 0, false);
            orderForm.setExpressNumber(expressNumber);
            deleteBeforeSave(orderForm);
            dao.commitTransaction();
            orderForms.add(i, orderForm);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return orderForms;
    }

    /**
     * Perform <tt>FindByExpressNumber</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByExpressNumber(java.lang.String expressNumber) {
        return dao.findByExpressNumber(expressNumber);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByExpressNumbert</tt>.
     *
     * @param orderForms  inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByExpressNumber(List orderForms, List resultFound) {
        if (orderForms != null && orderForms.size() > 0) {
            assertNotNull("Result returned by find-by-expressNumber is null.", resultFound);
            assertEquals("Result count returned by find-by-expressNumber is incorrect.", orderForms.size(), resultFound.size());

            Iterator it = orderForms.iterator();
            while (it.hasNext()) {
                OrderForm orderForm = (OrderForm) it.next();
                OrderForm another = OrderFormTestHelper.getOrderFormByPk(resultFound, orderForm.getOrderFormPK());
                assertEquals("Result returned by find-by-expressNumber does not equal to inserted orderForm object.", orderForm, another);
                OrderFormTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>getOrderFormList</tt> test preparation.  First delete any <Code>OrderForm</Code>
     * instance from persistent store if exists. Then create multiple <Code>OrderForm</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetOrderFormList() throws Exception {
        List orderForms = new ArrayList();
        dao.setAutoCommit(false);

        List oldOrderForms = dao.getOrderFormList();

        if (oldOrderForms != null) {
            Iterator it = oldOrderForms.iterator();
            while (it.hasNext())
                OrderFormTestHelper.delete((OrderForm) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            OrderForm orderForm = prepare();
            dao.update(orderForm);
            dao.commitTransaction();
            orderForms.add(i, orderForm);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return orderForms;
    }

    /**
     * Perform <tt>getOrderFormList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetOrderFormList() throws Exception {
        return dao.getOrderFormList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getOrderFormList</tt>.
     *
     * @param orderForms  inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterGetOrderFormList(List orderForms, List resultFound) {
        if (orderForms != null && orderForms.size() > 0) {
            assertNotNull("Result returned by get-orderForm-list is null.", resultFound);
            assertEquals("Result count returned by get-orderForm-list is incorrect.", orderForms.size(), resultFound.size());

            Iterator it = orderForms.iterator();
            while (it.hasNext()) {
                OrderForm orderForm = (OrderForm) it.next();
                OrderForm another = OrderFormTestHelper.getOrderFormByPk(resultFound, orderForm.getOrderFormPK());
                assertEquals("Result returned by get-orderForm-list does not equal to inserted orderForm object.", orderForm, another);
                OrderFormTestHelper.delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>OrderForm</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>OrderForm</Code> instance
     * @throws Exception
     */
    private OrderForm prepare() {
        OrderForm orderForm = OrderFormTestHelper.newInstance(null, null, "", 0, false);
        return deleteBeforeSave(orderForm);
    }

    /**
     * For a new <Code>OrderForm</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param orderForm
     * @return newly created and saved <Code>OrderForm</Code> instance
     * @throws Exception
     */
    private OrderForm deleteBeforeSave(OrderForm orderForm) {
        // Delete instance from data store if already exists
        OrderForm old = dao.load(orderForm.getOrderFormPK());
        if (old != null)
            OrderFormTestHelper.delete(old);
        OrderFormTestHelper.save(orderForm);
        return orderForm;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getOrderFormDao();
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
     * @return test suite containing test class <Code>OrderFormTest</Code>
     */
    public static Test suite() {
        return new TestSuite(OrderFormTest.class);
    }
}