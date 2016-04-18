/***********************************************************************
 * Module:  OrderStatusTypeTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class OrderStatusType's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.OrderStatusTypeDao;
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

import static com.centuryOldShop.server.persistence.OrderStatusTypeTestHelper.unitTestEquals;

/**
 * Test case class to test OrderStatusType's persistence
 */
@SuppressWarnings("ALL")
public class OrderStatusTypeTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    OrderStatusTypeDao dao;

    private Log logger = LogFactory.getLog(OrderStatusTypeTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public OrderStatusTypeTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>OrderStatusType</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        OrderStatusType orderStatusType = null;
        // Create new instance, delete instance if exists in database
        orderStatusType = preInsert();
        // Perform insert
        doInsert(orderStatusType);
        // Do assert
        afterInsert(orderStatusType);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>OrderStatusType</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        OrderStatusType orderStatusType = null;
        // Create and insert new instance
        orderStatusType = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(orderStatusType);
        // Do assert
        afterUpdate(orderStatusType);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>OrderStatusType</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        OrderStatusType orderStatusType = null;
        // Insert new OrderStatusType instance
        orderStatusType = preDelete();
        // Perform delete
        doDelete(orderStatusType);
        // Do assert
        afterDelete(orderStatusType);
        logger.debug("Test delete ends!");
    }

    /**
     * Test function getOrderStatusTypeList. First create multiple <Code>OrderStatusType</Code>
     * instances and save them by <tt>preGetOrderStatusTypeList</tt>. Then delegate the
     * find all operation to method <tt>doGetOrderStatusTypeList</tt>. In the end do asserts
     * in <tt>afterGetOrderStatusTypeList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetOrderStatusTypeList() throws Exception {
        logger.debug("Test get-orderStatusType-list begins!");

        List orderStatusTypes = new ArrayList();
        // Insert OrderStatusType instance
        orderStatusTypes = preGetOrderStatusTypeList();
        // Perform query
        List result = doGetOrderStatusTypeList();
        // Make assertion
        afterGetOrderStatusTypeList(orderStatusTypes, result);
        logger.debug("Test get-orderStatusType-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>OrderStatusType</Code> instance
     * @throws Exception
     */
    private OrderStatusType preInsert() throws Exception {
        OrderStatusType orderStatusType = OrderStatusTypeTestHelper.newInstance(null, null, "", 0, false);
        OrderStatusType old = dao.load(orderStatusType.getOrderStatusTypePK());
        if (old != null)
            OrderStatusTypeTestHelper.delete(old);
        return orderStatusType;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param orderStatusType instance to insert
     * @throws Exception
     */
    private void doInsert(OrderStatusType orderStatusType) {
        OrderStatusTypeTestHelper.save(orderStatusType);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param orderStatusType inserted instance
     * @throws Exception
     */
    private void afterInsert(OrderStatusType orderStatusType) {
        OrderStatusType anotherOrderStatusType = dao.load(orderStatusType.getOrderStatusTypePK());
        assertTrue(
                String.format("Queried result does not equal to inserted instance" +
                                "\nExpected: %s\n" +
                                "Actual  : %s",
                        orderStatusType, anotherOrderStatusType),
                unitTestEquals(orderStatusType, anotherOrderStatusType)
        );
        OrderStatusTypeTestHelper.delete(anotherOrderStatusType);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>OrderStatusType</Code> instance
     * @throws Exception
     * @see OrderStatusTypeTest#prepare()
     */
    private OrderStatusType preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param orderStatusType object to update
     * @throws Exception
     */
    private void doUpdate(OrderStatusType orderStatusType) throws Exception {
        OrderStatusTypeTestHelper.modifyObject(orderStatusType);
        dao.update(orderStatusType);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param orderStatusType object to update
     * @throws Exception
     */
    private void afterUpdate(OrderStatusType orderStatusType) throws Exception {
        OrderStatusType another = dao.load(orderStatusType.getOrderStatusTypePK());
        assertTrue(
                String.format("Queried result does not equal to updated instance" +
                                "\nExpected: %s\n" +
                                "Actual  : %s",
                        orderStatusType, another),
                unitTestEquals(orderStatusType, another)
        );
        OrderStatusTypeTestHelper.delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>OrderStatusType</Code> instance
     * @throws Exception
     * @see OrderStatusTypeTest#prepare()
     */
    private OrderStatusType preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param orderStatusType object to delete
     * @throws Exception
     */
    private void doDelete(OrderStatusType orderStatusType) throws Exception {
        OrderStatusTypeTestHelper.delete(orderStatusType);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param orderStatusType deleted object
     * @throws Exception
     */
    private void afterDelete(OrderStatusType orderStatusType) throws Exception {
        OrderStatusType another = dao.load(orderStatusType.getOrderStatusTypePK());
        assertNull("Inserted instance is not deleted", another);
    }

    /**
     * Do function <tt>getOrderStatusTypeList</tt> test preparation.  First delete any <Code>OrderStatusType</Code>
     * instance from persistent store if exists. Then create multiple <Code>OrderStatusType</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetOrderStatusTypeList() throws Exception {
        List orderStatusTypes = new ArrayList();
        dao.setAutoCommit(false);

        List oldOrderStatusTypes = dao.getOrderStatusTypeList();

        if (oldOrderStatusTypes != null) {
            Iterator it = oldOrderStatusTypes.iterator();
            while (it.hasNext())
                OrderStatusTypeTestHelper.delete((OrderStatusType) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            OrderStatusType orderStatusType = prepare();
            dao.update(orderStatusType);
            dao.commitTransaction();
            orderStatusTypes.add(i, orderStatusType);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return orderStatusTypes;
    }

    /**
     * Perform <tt>getOrderStatusTypeList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetOrderStatusTypeList() throws Exception {
        return dao.getOrderStatusTypeList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getOrderStatusTypeList</tt>.
     *
     * @param orderStatusTypes inserted instance list
     * @param resultFound      result instance list
     * @throws Exception
     */
    private void afterGetOrderStatusTypeList(List orderStatusTypes, List resultFound) {
        if (orderStatusTypes != null && orderStatusTypes.size() > 0) {
            assertNotNull("Result returned by get-orderStatusType-list is null.", resultFound);
            assertEquals("Result count returned by get-orderStatusType-list is incorrect.", orderStatusTypes.size(), resultFound.size());

            Iterator it = orderStatusTypes.iterator();
            while (it.hasNext()) {
                OrderStatusType orderStatusType = (OrderStatusType) it.next();
                OrderStatusType another = OrderStatusTypeTestHelper.getOrderStatusTypeByPk(resultFound, orderStatusType.getOrderStatusTypePK());
                assertTrue(
                        String.format("Result returned by get-orderStatusType-list does not equal to inserted orderStatusType object." +
                                        "\nExpected: %s\n" +
                                        "Actual  : %s",
                                orderStatusType, another),
                        unitTestEquals(orderStatusType, another)
                );
                OrderStatusTypeTestHelper.delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>OrderStatusType</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>OrderStatusType</Code> instance
     * @throws Exception
     */
    private OrderStatusType prepare() {
        OrderStatusType orderStatusType = OrderStatusTypeTestHelper.newInstance(null, null, "", 0, false);
        return deleteBeforeSave(orderStatusType);
    }

    /**
     * For a new <Code>OrderStatusType</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param orderStatusType
     * @return newly created and saved <Code>OrderStatusType</Code> instance
     * @throws Exception
     */
    private OrderStatusType deleteBeforeSave(OrderStatusType orderStatusType) {
        // Delete instance from data store if already exists
        OrderStatusType old = dao.load(orderStatusType.getOrderStatusTypePK());
        if (old != null)
            OrderStatusTypeTestHelper.delete(old);
        OrderStatusTypeTestHelper.save(orderStatusType);
        return orderStatusType;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getOrderStatusTypeDao();
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
     * @return test suite containing test class <Code>OrderStatusTypeTest</Code>
     */
    public static Test suite() {
        return new TestSuite(OrderStatusTypeTest.class);
    }
}