/***********************************************************************
 * Module:  ShoppingCartTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class ShoppingCart's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.ShoppingCartDao;
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
 * Test case class to test ShoppingCart's persistence
 */
@SuppressWarnings("ALL")
public class ShoppingCartTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    ShoppingCartDao dao;

    private Log logger = LogFactory.getLog(ShoppingCartTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public ShoppingCartTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>ShoppingCart</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        ShoppingCart shoppingCart = null;
        // Create new instance, delete instance if exists in database
        shoppingCart = preInsert();
        // Perform insert
        doInsert(shoppingCart);
        // Do assert
        afterInsert(shoppingCart);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>ShoppingCart</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        ShoppingCart shoppingCart = null;
        // Create and insert new instance
        shoppingCart = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(shoppingCart);
        // Do assert
        afterUpdate(shoppingCart);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>ShoppingCart</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        ShoppingCart shoppingCart = null;
        // Insert new ShoppingCart instance
        shoppingCart = preDelete();
        // Perform delete
        doDelete(shoppingCart);
        // Do assert
        afterDelete(shoppingCart);
        logger.debug("Test delete ends!");
    }


    /**
     * Test query function </tt>findByAmount</tt>. First create multiple
     * <Code>ShoppingCart</Code> instances and save them by <tt>preFindByAmount</tt>.
     * Then delegate the query operation to method <tt>doFindByAmount</tt>.
     * In the end do some asserts in <tt>afterFindByAmount</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByAmount() throws Exception {

        logger.debug("Test find-by-amount begins!");
        int amount = random.nextInt();
        List shoppingCarts = new ArrayList();
        // Create and insert amount instances
        shoppingCarts = preFindByAmount(amount);
        // Perform query
        List result = doFindByAmount(amount);
        // Do asserts
        afterFindByAmount(shoppingCarts, result);
        logger.debug("Test find-by-amount ends!");

    }

    /**
     * Test query function </tt>findByAddedTime</tt>. First create multiple
     * <Code>ShoppingCart</Code> instances and save them by <tt>preFindByAddedTime</tt>.
     * Then delegate the query operation to method <tt>doFindByAddedTime</tt>.
     * In the end do some asserts in <tt>afterFindByAddedTime</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByAddedTime() throws Exception {

        logger.debug("Test find-by-addedTime begins!");
        java.util.Date addedTime = new java.util.Date(random.nextInt(10000));
        List shoppingCarts = new ArrayList();
        // Create and insert addedTime instances
        shoppingCarts = preFindByAddedTime(addedTime);
        // Perform query
        List result = doFindByAddedTime(addedTime);
        // Do asserts
        afterFindByAddedTime(shoppingCarts, result);
        logger.debug("Test find-by-addedTime ends!");

    }

    /**
     * Test function getShoppingCartList. First create multiple <Code>ShoppingCart</Code>
     * instances and save them by <tt>preGetShoppingCartList</tt>. Then delegate the
     * find all operation to method <tt>doGetShoppingCartList</tt>. In the end do asserts
     * in <tt>afterGetShoppingCartList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetShoppingCartList() throws Exception {
        logger.debug("Test get-shoppingCart-list begins!");

        List shoppingCarts = new ArrayList();
        // Insert ShoppingCart instance
        shoppingCarts = preGetShoppingCartList();
        // Perform query
        List result = doGetShoppingCartList();
        // Make assertion
        afterGetShoppingCartList(shoppingCarts, result);
        logger.debug("Test get-shoppingCart-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>ShoppingCart</Code> instance
     * @throws Exception
     */
    private ShoppingCart preInsert() throws Exception {
        ShoppingCart shoppingCart = ShoppingCartTestHelper.newInstance(null, null, "", 0, false);
        return shoppingCart;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param shoppingCart instance to insert
     * @throws Exception
     */
    private void doInsert(ShoppingCart shoppingCart) {
        ShoppingCartTestHelper.save(shoppingCart);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param shoppingCart inserted instance
     * @throws Exception
     */
    private void afterInsert(ShoppingCart shoppingCart) {
        ShoppingCart anotherShoppingCart = dao.load(shoppingCart.getShoppingCartPK());
        assertEquals("Queried result does not equal to inserted instance",
                shoppingCart, anotherShoppingCart);
        ShoppingCartTestHelper.delete(anotherShoppingCart);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>ShoppingCart</Code> instance
     * @throws Exception
     * @see ShoppingCartTest#prepare()
     */
    private ShoppingCart preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param shoppingCart object to update
     * @throws Exception
     */
    private void doUpdate(ShoppingCart shoppingCart) throws Exception {
        ShoppingCartTestHelper.modifyObject(shoppingCart);
        dao.update(shoppingCart);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param shoppingCart object to update
     * @throws Exception
     */
    private void afterUpdate(ShoppingCart shoppingCart) throws Exception {
        ShoppingCart another = dao.load(shoppingCart.getShoppingCartPK());
        assertEquals("Queried result does not equal to updated instance", shoppingCart, another);
        ShoppingCartTestHelper.delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>ShoppingCart</Code> instance
     * @throws Exception
     * @see ShoppingCartTest#prepare()
     */
    private ShoppingCart preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param shoppingCart object to delete
     * @throws Exception
     */
    private void doDelete(ShoppingCart shoppingCart) throws Exception {
        ShoppingCartTestHelper.delete(shoppingCart);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param shoppingCart deleted object
     * @throws Exception
     */
    private void afterDelete(ShoppingCart shoppingCart) throws Exception {
        ShoppingCart another = dao.load(shoppingCart.getShoppingCartPK());
        assertNull("Inserted instance is not deleted", another);
    }


    /**
     * Do function <tt>FindByAmount</tt> test preparation. Delete <Code>ShoppingCart</Code>
     * instances whose property amount's value is amount from persistent store. Then Create
     * multiple <Code>ShoppingCart</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByAmount(int amount) throws Exception {
        List shoppingCarts = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShoppingCarts = dao.findByAmount(amount);

        if (oldShoppingCarts != null) {
            Iterator it = oldShoppingCarts.iterator();
            while (it.hasNext())
                ShoppingCartTestHelper.delete((ShoppingCart) it.next());
        }

        // Create instances of random count, set their amount value to amount
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            ShoppingCart shoppingCart = ShoppingCartTestHelper.newInstance(null, null, "", 0, false);
            shoppingCart.setAmount(amount);
            deleteBeforeSave(shoppingCart);
            dao.commitTransaction();
            shoppingCarts.add(i, shoppingCart);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shoppingCarts;
    }

    /**
     * Perform <tt>FindByAmount</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByAmount(int amount) {
        return dao.findByAmount(amount);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByAmountt</tt>.
     *
     * @param shoppingCarts inserted instance list
     * @param resultFound   result instance list
     * @throws Exception
     */
    private void afterFindByAmount(List shoppingCarts, List resultFound) {
        if (shoppingCarts != null && shoppingCarts.size() > 0) {
            assertNotNull("Result returned by find-by-amount is null.", resultFound);
            assertEquals("Result count returned by find-by-amount is incorrect.", shoppingCarts.size(), resultFound.size());

            Iterator it = shoppingCarts.iterator();
            while (it.hasNext()) {
                ShoppingCart shoppingCart = (ShoppingCart) it.next();
                ShoppingCart another = ShoppingCartTestHelper.getShoppingCartByPk(resultFound, shoppingCart.getShoppingCartPK());
                assertEquals("Result returned by find-by-amount does not equal to inserted shoppingCart object.", shoppingCart, another);
                ShoppingCartTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByAddedTime</tt> test preparation. Delete <Code>ShoppingCart</Code>
     * instances whose property addedTime's value is addedTime from persistent store. Then Create
     * multiple <Code>ShoppingCart</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByAddedTime(java.util.Date addedTime) throws Exception {
        List shoppingCarts = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShoppingCarts = dao.findByAddedTime(addedTime);

        if (oldShoppingCarts != null) {
            Iterator it = oldShoppingCarts.iterator();
            while (it.hasNext())
                ShoppingCartTestHelper.delete((ShoppingCart) it.next());
        }

        // Create instances of random count, set their addedTime value to addedTime
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            ShoppingCart shoppingCart = ShoppingCartTestHelper.newInstance(null, null, "", 0, false);
            shoppingCart.setAddedTime(addedTime);
            deleteBeforeSave(shoppingCart);
            dao.commitTransaction();
            shoppingCarts.add(i, shoppingCart);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shoppingCarts;
    }

    /**
     * Perform <tt>FindByAddedTime</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByAddedTime(java.util.Date addedTime) {
        return dao.findByAddedTime(addedTime);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByAddedTimet</tt>.
     *
     * @param shoppingCarts inserted instance list
     * @param resultFound   result instance list
     * @throws Exception
     */
    private void afterFindByAddedTime(List shoppingCarts, List resultFound) {
        if (shoppingCarts != null && shoppingCarts.size() > 0) {
            assertNotNull("Result returned by find-by-addedTime is null.", resultFound);
            assertEquals("Result count returned by find-by-addedTime is incorrect.", shoppingCarts.size(), resultFound.size());

            Iterator it = shoppingCarts.iterator();
            while (it.hasNext()) {
                ShoppingCart shoppingCart = (ShoppingCart) it.next();
                ShoppingCart another = ShoppingCartTestHelper.getShoppingCartByPk(resultFound, shoppingCart.getShoppingCartPK());
                assertEquals("Result returned by find-by-addedTime does not equal to inserted shoppingCart object.", shoppingCart, another);
                ShoppingCartTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>getShoppingCartList</tt> test preparation.  First delete any <Code>ShoppingCart</Code>
     * instance from persistent store if exists. Then create multiple <Code>ShoppingCart</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetShoppingCartList() throws Exception {
        List shoppingCarts = new ArrayList();
        dao.setAutoCommit(false);

        List oldShoppingCarts = dao.getShoppingCartList();

        if (oldShoppingCarts != null) {
            Iterator it = oldShoppingCarts.iterator();
            while (it.hasNext())
                ShoppingCartTestHelper.delete((ShoppingCart) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            ShoppingCart shoppingCart = prepare();
            dao.update(shoppingCart);
            dao.commitTransaction();
            shoppingCarts.add(i, shoppingCart);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shoppingCarts;
    }

    /**
     * Perform <tt>getShoppingCartList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetShoppingCartList() throws Exception {
        return dao.getShoppingCartList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getShoppingCartList</tt>.
     *
     * @param shoppingCarts inserted instance list
     * @param resultFound   result instance list
     * @throws Exception
     */
    private void afterGetShoppingCartList(List shoppingCarts, List resultFound) {
        if (shoppingCarts != null && shoppingCarts.size() > 0) {
            assertNotNull("Result returned by get-shoppingCart-list is null.", resultFound);
            assertEquals("Result count returned by get-shoppingCart-list is incorrect.", shoppingCarts.size(), resultFound.size());

            Iterator it = shoppingCarts.iterator();
            while (it.hasNext()) {
                ShoppingCart shoppingCart = (ShoppingCart) it.next();
                ShoppingCart another = ShoppingCartTestHelper.getShoppingCartByPk(resultFound, shoppingCart.getShoppingCartPK());
                assertEquals("Result returned by get-shoppingCart-list does not equal to inserted shoppingCart object.", shoppingCart, another);
                ShoppingCartTestHelper.delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>ShoppingCart</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>ShoppingCart</Code> instance
     * @throws Exception
     */
    private ShoppingCart prepare() {
        ShoppingCart shoppingCart = ShoppingCartTestHelper.newInstance(null, null, "", 0, false);
        return deleteBeforeSave(shoppingCart);
    }

    /**
     * For a new <Code>ShoppingCart</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param shoppingCart
     * @return newly created and saved <Code>ShoppingCart</Code> instance
     * @throws Exception
     */
    private ShoppingCart deleteBeforeSave(ShoppingCart shoppingCart) {
        ShoppingCartTestHelper.save(shoppingCart);
        return shoppingCart;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getShoppingCartDao();
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
     * @return test suite containing test class <Code>ShoppingCartTest</Code>
     */
    public static Test suite() {
        return new TestSuite(ShoppingCartTest.class);
    }
}