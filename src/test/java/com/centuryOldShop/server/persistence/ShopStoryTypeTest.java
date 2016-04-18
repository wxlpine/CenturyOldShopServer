/***********************************************************************
 * Module:  ShopStoryTypeTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class ShopStoryType's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.ShopStoryTypeDao;
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

import static com.centuryOldShop.server.persistence.ShopStoryTypeTestHelper.unitTestEquals;

/**
 * Test case class to test ShopStoryType's persistence
 */
@SuppressWarnings("ALL")
public class ShopStoryTypeTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    ShopStoryTypeDao dao;

    private Log logger = LogFactory.getLog(ShopStoryTypeTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public ShopStoryTypeTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>ShopStoryType</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        ShopStoryType shopStoryType = null;
        // Create new instance, delete instance if exists in database
        shopStoryType = preInsert();
        // Perform insert
        doInsert(shopStoryType);
        // Do assert
        afterInsert(shopStoryType);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>ShopStoryType</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        ShopStoryType shopStoryType = null;
        // Create and insert new instance
        shopStoryType = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(shopStoryType);
        // Do assert
        afterUpdate(shopStoryType);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>ShopStoryType</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        ShopStoryType shopStoryType = null;
        // Insert new ShopStoryType instance
        shopStoryType = preDelete();
        // Perform delete
        doDelete(shopStoryType);
        // Do assert
        afterDelete(shopStoryType);
        logger.debug("Test delete ends!");
    }

    /**
     * Test function getShopStoryTypeList. First create multiple <Code>ShopStoryType</Code>
     * instances and save them by <tt>preGetShopStoryTypeList</tt>. Then delegate the
     * find all operation to method <tt>doGetShopStoryTypeList</tt>. In the end do asserts
     * in <tt>afterGetShopStoryTypeList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetShopStoryTypeList() throws Exception {
        logger.debug("Test get-shopStoryType-list begins!");

        List shopStoryTypes = new ArrayList();
        // Insert ShopStoryType instance
        shopStoryTypes = preGetShopStoryTypeList();
        // Perform query
        List result = doGetShopStoryTypeList();
        // Make assertion
        afterGetShopStoryTypeList(shopStoryTypes, result);
        logger.debug("Test get-shopStoryType-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>ShopStoryType</Code> instance
     * @throws Exception
     */
    private ShopStoryType preInsert() throws Exception {
        ShopStoryType shopStoryType = ShopStoryTypeTestHelper.newInstance(null, null, "", 0, false);
        ShopStoryType old = dao.load(shopStoryType.getShopStoryTypePK());
        if (old != null)
            ShopStoryTypeTestHelper.delete(old);
        return shopStoryType;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param shopStoryType instance to insert
     * @throws Exception
     */
    private void doInsert(ShopStoryType shopStoryType) {
        ShopStoryTypeTestHelper.save(shopStoryType);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param shopStoryType inserted instance
     * @throws Exception
     */
    private void afterInsert(ShopStoryType shopStoryType) {
        ShopStoryType anotherShopStoryType = dao.load(shopStoryType.getShopStoryTypePK());
//        ShopStoryType anotherShopStoryType = null;
        assertTrue(
                String.format("Queried result does not equal to inserted instance\nExpected: %s\nActual: %s",
                        shopStoryType, anotherShopStoryType),
                unitTestEquals(shopStoryType, anotherShopStoryType)
        );
//        assertEquals(shopStoryType, anotherShopStoryType);
        ShopStoryTypeTestHelper.delete(anotherShopStoryType);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>ShopStoryType</Code> instance
     * @throws Exception
     * @see ShopStoryTypeTest#prepare()
     */
    private ShopStoryType preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param shopStoryType object to update
     * @throws Exception
     */
    private void doUpdate(ShopStoryType shopStoryType) throws Exception {
        ShopStoryTypeTestHelper.modifyObject(shopStoryType);
        dao.update(shopStoryType);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param shopStoryType object to update
     * @throws Exception
     */
    private void afterUpdate(ShopStoryType shopStoryType) throws Exception {
        ShopStoryType another = dao.load(shopStoryType.getShopStoryTypePK());
        assertTrue(
                String.format("Queried result does not equal to updated instance\nExpected: %s\nActual: %s",
                        shopStoryType, another),
                unitTestEquals(shopStoryType, another)
        );
        ShopStoryTypeTestHelper.delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>ShopStoryType</Code> instance
     * @throws Exception
     * @see ShopStoryTypeTest#prepare()
     */
    private ShopStoryType preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param shopStoryType object to delete
     * @throws Exception
     */
    private void doDelete(ShopStoryType shopStoryType) throws Exception {
        ShopStoryTypeTestHelper.delete(shopStoryType);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param shopStoryType deleted object
     * @throws Exception
     */
    private void afterDelete(ShopStoryType shopStoryType) throws Exception {
        ShopStoryType another = dao.load(shopStoryType.getShopStoryTypePK());
        assertNull("Inserted instance is not deleted", another);
    }

    /**
     * Do function <tt>getShopStoryTypeList</tt> test preparation.  First delete any <Code>ShopStoryType</Code>
     * instance from persistent store if exists. Then create multiple <Code>ShopStoryType</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetShopStoryTypeList() throws Exception {
        List shopStoryTypes = new ArrayList();
        dao.setAutoCommit(false);

        List oldShopStoryTypes = dao.getShopStoryTypeList();

        if (oldShopStoryTypes != null) {
            Iterator it = oldShopStoryTypes.iterator();
            while (it.hasNext())
                ShopStoryTypeTestHelper.delete((ShopStoryType) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            ShopStoryType shopStoryType = prepare();
            dao.update(shopStoryType);
            dao.commitTransaction();
            shopStoryTypes.add(i, shopStoryType);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shopStoryTypes;
    }

    /**
     * Perform <tt>getShopStoryTypeList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetShopStoryTypeList() throws Exception {
        return dao.getShopStoryTypeList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getShopStoryTypeList</tt>.
     *
     * @param shopStoryTypes inserted instance list
     * @param resultFound    result instance list
     * @throws Exception
     */
    private void afterGetShopStoryTypeList(List shopStoryTypes, List resultFound) {
        if (shopStoryTypes != null && shopStoryTypes.size() > 0) {
            assertNotNull("Result returned by get-shopStoryType-list is null.", resultFound);
            assertEquals("Result count returned by get-shopStoryType-list is incorrect.", shopStoryTypes.size(), resultFound.size());

            Iterator it = shopStoryTypes.iterator();
            while (it.hasNext()) {
                ShopStoryType shopStoryType = (ShopStoryType) it.next();
                ShopStoryType another = ShopStoryTypeTestHelper.getShopStoryTypeByPk(
                        resultFound, shopStoryType.getShopStoryTypePK());

                assertTrue(
                        String.format("Result returned by get-shopStoryType-list does not equal to inserted shopStoryType object.\n" +
                                        "Expected: %s\n" +
                                        "Actual: %s",
                                shopStoryType, another),
                        unitTestEquals(shopStoryType, another)
                );
                ShopStoryTypeTestHelper.delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>ShopStoryType</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>ShopStoryType</Code> instance
     * @throws Exception
     */
    private ShopStoryType prepare() {
        ShopStoryType shopStoryType = ShopStoryTypeTestHelper.newInstance(null, null, "", 0, false);
        return deleteBeforeSave(shopStoryType);
    }

    /**
     * For a new <Code>ShopStoryType</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param shopStoryType
     * @return newly created and saved <Code>ShopStoryType</Code> instance
     * @throws Exception
     */
    private ShopStoryType deleteBeforeSave(ShopStoryType shopStoryType) {
        // Delete instance from data store if already exists
        ShopStoryType old = dao.load(shopStoryType.getShopStoryTypePK());
        if (old != null)
            ShopStoryTypeTestHelper.delete(old);
        ShopStoryTypeTestHelper.save(shopStoryType);
        return shopStoryType;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getShopStoryTypeDao();
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
     * @return test suite containing test class <Code>ShopStoryTypeTest</Code>
     */
    public static Test suite() {
        return new TestSuite(ShopStoryTypeTest.class);
    }
}