/***********************************************************************
 * Module:  OrderFormCommodityTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class OrderFormCommodity's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.OrderFormCommodityDao;
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

import static com.centuryOldShop.server.persistence.OrderFormCommodityTestHelper.*;

/**
 * Test case class to test OrderFormCommodity's persistence
 */
@SuppressWarnings("ALL")
public class OrderFormCommodityTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    OrderFormCommodityDao dao;

    private Log logger = LogFactory.getLog(OrderFormCommodityTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public OrderFormCommodityTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>OrderFormCommodity</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        OrderFormCommodity orderFormCommodity = null;
        // Create new instance, delete instance if exists in database
        orderFormCommodity = preInsert();
        // Perform insert
        doInsert(orderFormCommodity);
        // Do assert
        afterInsert(orderFormCommodity);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>OrderFormCommodity</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        OrderFormCommodity orderFormCommodity = null;
        // Create and insert new instance
        orderFormCommodity = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(orderFormCommodity);
        // Do assert
        afterUpdate(orderFormCommodity);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>OrderFormCommodity</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        OrderFormCommodity orderFormCommodity = null;
        // Insert new OrderFormCommodity instance
        orderFormCommodity = preDelete();
        // Perform delete
        doDelete(orderFormCommodity);
        // Do assert
        afterDelete(orderFormCommodity);
        logger.debug("Test delete ends!");
    }


    /**
     * Test query function </tt>findByBuyPrice</tt>. First create multiple
     * <Code>OrderFormCommodity</Code> instances and save them by <tt>preFindByBuyPrice</tt>.
     * Then delegate the query operation to method <tt>doFindByBuyPrice</tt>.
     * In the end do some asserts in <tt>afterFindByBuyPrice</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByBuyPrice() throws Exception {

        logger.debug("Test find-by-buyPrice begins!");
        double buyPrice = getRandomBuyPrice();
        // Create and insert buyPrice instances
        List orderFormCommoditys = preFindByBuyPrice(buyPrice);
        // Perform query
        List result = doFindByBuyPrice(buyPrice);
        // Do asserts
        afterFindByBuyPrice(orderFormCommoditys, result);
        logger.debug("Test find-by-buyPrice ends!");

    }

    /**
     * Test query function </tt>findByBuyAmount</tt>. First create multiple
     * <Code>OrderFormCommodity</Code> instances and save them by <tt>preFindByBuyAmount</tt>.
     * Then delegate the query operation to method <tt>doFindByBuyAmount</tt>.
     * In the end do some asserts in <tt>afterFindByBuyAmount</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByBuyAmount() throws Exception {

        logger.debug("Test find-by-buyAmount begins!");
        int buyAmount = random.nextInt();
        List orderFormCommoditys = new ArrayList();
        // Create and insert buyAmount instances
        orderFormCommoditys = preFindByBuyAmount(buyAmount);
        // Perform query
        List result = doFindByBuyAmount(buyAmount);
        // Do asserts
        afterFindByBuyAmount(orderFormCommoditys, result);
        logger.debug("Test find-by-buyAmount ends!");

    }

    /**
     * Test function getOrderFormCommodityList. First create multiple <Code>OrderFormCommodity</Code>
     * instances and save them by <tt>preGetOrderFormCommodityList</tt>. Then delegate the
     * find all operation to method <tt>doGetOrderFormCommodityList</tt>. In the end do asserts
     * in <tt>afterGetOrderFormCommodityList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetOrderFormCommodityList() throws Exception {
        logger.debug("Test get-orderFormCommodity-list begins!");

        List orderFormCommoditys = new ArrayList();
        // Insert OrderFormCommodity instance
        orderFormCommoditys = preGetOrderFormCommodityList();
        // Perform query
        List result = doGetOrderFormCommodityList();
        // Make assertion
        afterGetOrderFormCommodityList(orderFormCommoditys, result);
        logger.debug("Test get-orderFormCommodity-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>OrderFormCommodity</Code> instance
     * @throws Exception
     */
    private OrderFormCommodity preInsert() throws Exception {
        OrderFormCommodity orderFormCommodity = newInstance(null, null, "", 0, true);
        return orderFormCommodity;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param orderFormCommodity instance to insert
     * @throws Exception
     */
    private void doInsert(OrderFormCommodity orderFormCommodity) {
        OrderFormCommodityTestHelper.save(orderFormCommodity);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param orderFormCommodity inserted instance
     * @throws Exception
     */
    private void afterInsert(OrderFormCommodity orderFormCommodity) {
        OrderFormCommodity anotherOrderFormCommodity = dao.load(orderFormCommodity.getOrderFormCommodityPK());
        assertTrue(
                String.format("Queried result does not equal to inserted instance" +
                                "\nExpected: %s\n" +
                                "Actual: %s",
                        orderFormCommodity, anotherOrderFormCommodity),
                unitTestEquals(orderFormCommodity, anotherOrderFormCommodity)
        );
        OrderFormCommodityTestHelper.delete(anotherOrderFormCommodity);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>OrderFormCommodity</Code> instance
     * @throws Exception
     * @see OrderFormCommodityTest#prepare()
     */
    private OrderFormCommodity preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param orderFormCommodity object to update
     * @throws Exception
     */
    private void doUpdate(OrderFormCommodity orderFormCommodity) throws Exception {
        OrderFormCommodityTestHelper.modifyObject(orderFormCommodity);
        dao.update(orderFormCommodity);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param orderFormCommodity object to update
     * @throws Exception
     */
    private void afterUpdate(OrderFormCommodity orderFormCommodity) throws Exception {
        OrderFormCommodity another = dao.load(orderFormCommodity.getOrderFormCommodityPK());
        assertTrue(
                String.format("Queried result does not equal to updated instance" +
                                "\nExpected: %s\n" +
                                "Actual: %s",
                        orderFormCommodity, another),
                unitTestEquals(orderFormCommodity, another)
        );
        OrderFormCommodityTestHelper.delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>OrderFormCommodity</Code> instance
     * @throws Exception
     * @see OrderFormCommodityTest#prepare()
     */
    private OrderFormCommodity preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param orderFormCommodity object to delete
     * @throws Exception
     */
    private void doDelete(OrderFormCommodity orderFormCommodity) throws Exception {
        OrderFormCommodityTestHelper.delete(orderFormCommodity);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param orderFormCommodity deleted object
     * @throws Exception
     */
    private void afterDelete(OrderFormCommodity orderFormCommodity) throws Exception {
        OrderFormCommodity another = dao.load(orderFormCommodity.getOrderFormCommodityPK());
        assertNull("Inserted instance is not deleted", another);
    }


    /**
     * Do function <tt>FindByBuyPrice</tt> test preparation. Delete <Code>OrderFormCommodity</Code>
     * instances whose property buyPrice's value is buyPrice from persistent store. Then Create
     * multiple <Code>OrderFormCommodity</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByBuyPrice(double buyPrice) throws Exception {
        List orderFormCommoditys = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldOrderFormCommoditys = dao.findByBuyPrice(buyPrice);

        if (oldOrderFormCommoditys != null) {
            Iterator it = oldOrderFormCommoditys.iterator();
            while (it.hasNext())
                OrderFormCommodityTestHelper.delete((OrderFormCommodity) it.next());
        }

        // Create instances of random count, set their buyPrice value to buyPrice
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            OrderFormCommodity orderFormCommodity = newInstance(null, null, "", 0, true);
            orderFormCommodity.setBuyPrice(buyPrice);
            deleteBeforeSave(orderFormCommodity);
            dao.commitTransaction();
            orderFormCommoditys.add(i, orderFormCommodity);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return orderFormCommoditys;
    }

    /**
     * Perform <tt>FindByBuyPrice</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByBuyPrice(double buyPrice) {
        return dao.findByBuyPrice(buyPrice);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByBuyPricet</tt>.
     *
     * @param orderFormCommoditys inserted instance list
     * @param resultFound         result instance list
     * @throws Exception
     */
    private void afterFindByBuyPrice(List orderFormCommoditys, List resultFound) {
        if (orderFormCommoditys != null && orderFormCommoditys.size() > 0) {
            assertNotNull("Result returned by find-by-buyPrice is null.", resultFound);
            assertEquals("Result count returned by find-by-buyPrice is incorrect.", orderFormCommoditys.size(), resultFound.size());

            Iterator it = orderFormCommoditys.iterator();
            while (it.hasNext()) {
                OrderFormCommodity orderFormCommodity = (OrderFormCommodity) it.next();
                OrderFormCommodity another = OrderFormCommodityTestHelper.getOrderFormCommodityByPk(resultFound, orderFormCommodity.getOrderFormCommodityPK());
                assertTrue(
                        String.format("Result returned by find-by-buyPrice does not equal to inserted orderFormCommodity object." +
                                        "\nExpected: %s\n" +
                                        "Actual: %s",
                                orderFormCommodity, another),
                        unitTestEquals(orderFormCommodity, another)
                );
                OrderFormCommodityTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByBuyAmount</tt> test preparation. Delete <Code>OrderFormCommodity</Code>
     * instances whose property buyAmount's value is buyAmount from persistent store. Then Create
     * multiple <Code>OrderFormCommodity</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByBuyAmount(int buyAmount) throws Exception {
        List orderFormCommoditys = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldOrderFormCommoditys = dao.findByBuyAmount(buyAmount);

        if (oldOrderFormCommoditys != null) {
            Iterator it = oldOrderFormCommoditys.iterator();
            while (it.hasNext())
                OrderFormCommodityTestHelper.delete((OrderFormCommodity) it.next());
        }

        // Create instances of random count, set their buyAmount value to buyAmount
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            OrderFormCommodity orderFormCommodity = newInstance(null, null, "", 0, true);
            orderFormCommodity.setBuyAmount(buyAmount);
            deleteBeforeSave(orderFormCommodity);
            dao.commitTransaction();
            orderFormCommoditys.add(i, orderFormCommodity);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return orderFormCommoditys;
    }

    /**
     * Perform <tt>FindByBuyAmount</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByBuyAmount(int buyAmount) {
        return dao.findByBuyAmount(buyAmount);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByBuyAmountt</tt>.
     *
     * @param orderFormCommoditys inserted instance list
     * @param resultFound         result instance list
     * @throws Exception
     */
    private void afterFindByBuyAmount(List orderFormCommoditys, List resultFound) {
        if (orderFormCommoditys != null && orderFormCommoditys.size() > 0) {
            assertNotNull("Result returned by find-by-buyAmount is null.", resultFound);
            assertEquals("Result count returned by find-by-buyAmount is incorrect.", orderFormCommoditys.size(), resultFound.size());

            Iterator it = orderFormCommoditys.iterator();
            while (it.hasNext()) {
                OrderFormCommodity orderFormCommodity = (OrderFormCommodity) it.next();
                OrderFormCommodity another = OrderFormCommodityTestHelper.getOrderFormCommodityByPk(resultFound, orderFormCommodity.getOrderFormCommodityPK());
                assertTrue(
                        String.format("Result returned by find-by-buyAmount does not equal to inserted orderFormCommodity object." +
                                        "\nExpected: %s\n" +
                                        "Actual: %s",
                                orderFormCommodity, another),
                        unitTestEquals(orderFormCommodity, another)
                );
                OrderFormCommodityTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>getOrderFormCommodityList</tt> test preparation.  First delete any <Code>OrderFormCommodity</Code>
     * instance from persistent store if exists. Then create multiple <Code>OrderFormCommodity</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetOrderFormCommodityList() throws Exception {
        List orderFormCommoditys = new ArrayList();
        dao.setAutoCommit(false);

        List oldOrderFormCommoditys = dao.getOrderFormCommodityList();

        if (oldOrderFormCommoditys != null) {
            Iterator it = oldOrderFormCommoditys.iterator();
            while (it.hasNext())
                OrderFormCommodityTestHelper.delete((OrderFormCommodity) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            OrderFormCommodity orderFormCommodity = prepare();
            dao.update(orderFormCommodity);
            dao.commitTransaction();
            orderFormCommoditys.add(i, orderFormCommodity);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return orderFormCommoditys;
    }

    /**
     * Perform <tt>getOrderFormCommodityList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetOrderFormCommodityList() throws Exception {
        return dao.getOrderFormCommodityList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getOrderFormCommodityList</tt>.
     *
     * @param orderFormCommoditys inserted instance list
     * @param resultFound         result instance list
     * @throws Exception
     */
    private void afterGetOrderFormCommodityList(List orderFormCommoditys, List resultFound) {
        if (orderFormCommoditys != null && orderFormCommoditys.size() > 0) {
            assertNotNull("Result returned by get-orderFormCommodity-list is null.", resultFound);
            assertEquals("Result count returned by get-orderFormCommodity-list is incorrect.", orderFormCommoditys.size(), resultFound.size());

            Iterator it = orderFormCommoditys.iterator();
            while (it.hasNext()) {
                OrderFormCommodity orderFormCommodity = (OrderFormCommodity) it.next();
                OrderFormCommodity another = OrderFormCommodityTestHelper.getOrderFormCommodityByPk(resultFound, orderFormCommodity.getOrderFormCommodityPK());
                assertTrue(
                        String.format("Result returned by get-orderFormCommodity-list does not equal to inserted orderFormCommodity object." +
                                        "\nExpected: %s\n" +
                                        "Actual: %s",
                                orderFormCommodity, another),
                        unitTestEquals(orderFormCommodity, another)
                );
                OrderFormCommodityTestHelper.delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>OrderFormCommodity</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>OrderFormCommodity</Code> instance
     * @throws Exception
     */
    private OrderFormCommodity prepare() {
        OrderFormCommodity orderFormCommodity = newInstance(null, null, "", 0, true);
        return deleteBeforeSave(orderFormCommodity);
    }

    /**
     * For a new <Code>OrderFormCommodity</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param orderFormCommodity
     * @return newly created and saved <Code>OrderFormCommodity</Code> instance
     * @throws Exception
     */
    private OrderFormCommodity deleteBeforeSave(OrderFormCommodity orderFormCommodity) {
        OrderFormCommodityTestHelper.save(orderFormCommodity);
        return orderFormCommodity;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getOrderFormCommodityDao();
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
     * @return test suite containing test class <Code>OrderFormCommodityTest</Code>
     */
    public static Test suite() {
        return new TestSuite(OrderFormCommodityTest.class);
    }
}