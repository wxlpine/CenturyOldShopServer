/***********************************************************************
 * Module:  ShopTypeTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class ShopType's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.ShopTypeDao;
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

import static com.centuryOldShop.server.persistence.ShopTypeTestHelper.unitTestEquals;

/**
 * Test case class to test ShopType's persistence
 */
@SuppressWarnings("ALL")
public class ShopTypeTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    ShopTypeDao dao;

    private Log logger = LogFactory.getLog(ShopTypeTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public ShopTypeTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>ShopType</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        ShopType shopType = null;
        // Create new instance, delete instance if exists in database
        shopType = preInsert();
        // Perform insert
        doInsert(shopType);
        // Do assert
        afterInsert(shopType);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>ShopType</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        ShopType shopType = null;
        // Create and insert new instance
        shopType = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(shopType);
        // Do assert
        afterUpdate(shopType);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>ShopType</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        ShopType shopType = null;
        // Insert new ShopType instance
        shopType = preDelete();
        // Perform delete
        doDelete(shopType);
        // Do assert
        afterDelete(shopType);
        logger.debug("Test delete ends!");
    }

    /**
     * Test function getShopTypeList. First create multiple <Code>ShopType</Code>
     * instances and save them by <tt>preGetShopTypeList</tt>. Then delegate the
     * find all operation to method <tt>doGetShopTypeList</tt>. In the end do asserts
     * in <tt>afterGetShopTypeList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetShopTypeList() throws Exception {
        logger.debug("Test get-shopType-list begins!");

        List shopTypes = new ArrayList();
        // Insert ShopType instance
        shopTypes = preGetShopTypeList();
        // Perform query
        List result = doGetShopTypeList();
        // Make assertion
        afterGetShopTypeList(shopTypes, result);
        logger.debug("Test get-shopType-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>ShopType</Code> instance
     * @throws Exception
     */
    private ShopType preInsert() throws Exception {
        ShopType shopType = ShopTypeTestHelper.newInstance(null, null, "", 0, false);
        ShopType old = dao.load(shopType.getShopTypePK());
        if (old != null)
            ShopTypeTestHelper.delete(old);
        return shopType;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param shopType instance to insert
     * @throws Exception
     */
    private void doInsert(ShopType shopType) {
        ShopTypeTestHelper.save(shopType);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param shopType inserted instance
     * @throws Exception
     */
    private void afterInsert(ShopType shopType) {
        ShopType anotherShopType = dao.load(shopType.getShopTypePK());
        assertTrue(
                String.format("Queried result does not equal to inserted instance" +
                                "\nExpected: %s\n" +
                                "Actual  : %s",
                        shopType, anotherShopType),
                unitTestEquals(shopType, anotherShopType)
        );
        ShopTypeTestHelper.delete(anotherShopType);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>ShopType</Code> instance
     * @throws Exception
     * @see ShopTypeTest#prepare()
     */
    private ShopType preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param shopType object to update
     * @throws Exception
     */
    private void doUpdate(ShopType shopType) throws Exception {
        ShopTypeTestHelper.modifyObject(shopType);
        dao.update(shopType);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param shopType object to update
     * @throws Exception
     */
    private void afterUpdate(ShopType shopType) throws Exception {
        ShopType another = dao.load(shopType.getShopTypePK());
        assertTrue(
                String.format("Queried result does not equal to updated instance" +
                                "\nExpected: %s\n" +
                                "Actual  : %s",
                        shopType, another),
                unitTestEquals(shopType, another)
        );
        ShopTypeTestHelper.delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>ShopType</Code> instance
     * @throws Exception
     * @see ShopTypeTest#prepare()
     */
    private ShopType preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param shopType object to delete
     * @throws Exception
     */
    private void doDelete(ShopType shopType) throws Exception {
        ShopTypeTestHelper.delete(shopType);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param shopType deleted object
     * @throws Exception
     */
    private void afterDelete(ShopType shopType) throws Exception {
        ShopType another = dao.load(shopType.getShopTypePK());
        assertNull("Inserted instance is not deleted", another);
    }

    /**
     * Do function <tt>getShopTypeList</tt> test preparation.  First delete any <Code>ShopType</Code>
     * instance from persistent store if exists. Then create multiple <Code>ShopType</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetShopTypeList() throws Exception {
        List shopTypes = new ArrayList();
        dao.setAutoCommit(false);

        List oldShopTypes = dao.getShopTypeList();

        if (oldShopTypes != null) {
            Iterator it = oldShopTypes.iterator();
            while (it.hasNext())
                ShopTypeTestHelper.delete((ShopType) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            ShopType shopType = prepare();
            dao.update(shopType);
            dao.commitTransaction();
            shopTypes.add(i, shopType);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shopTypes;
    }

    /**
     * Perform <tt>getShopTypeList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetShopTypeList() throws Exception {
        return dao.getShopTypeList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getShopTypeList</tt>.
     *
     * @param shopTypes   inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterGetShopTypeList(List shopTypes, List resultFound) {
        if (shopTypes != null && shopTypes.size() > 0) {
            assertNotNull("Result returned by get-shopType-list is null.", resultFound);
            assertEquals("Result count returned by get-shopType-list is incorrect.", shopTypes.size(), resultFound.size());

            Iterator it = shopTypes.iterator();
            while (it.hasNext()) {
                ShopType shopType = (ShopType) it.next();
                ShopType another = ShopTypeTestHelper.getShopTypeByPk(resultFound, shopType.getShopTypePK());
                assertTrue(
                        String.format("Result returned by get-shopType-list does not equal to inserted shopType object." +
                                        "\nExpected: %s\n" +
                                        "Actual  : %s",
                                shopType, another),
                        unitTestEquals(shopType, another)
                );
                ShopTypeTestHelper.delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>ShopType</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>ShopType</Code> instance
     * @throws Exception
     */
    private ShopType prepare() {
        ShopType shopType = ShopTypeTestHelper.newInstance(null, null, "", 0, false);
        return deleteBeforeSave(shopType);
    }

    /**
     * For a new <Code>ShopType</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param shopType
     * @return newly created and saved <Code>ShopType</Code> instance
     * @throws Exception
     */
    private ShopType deleteBeforeSave(ShopType shopType) {
        // Delete instance from data store if already exists
        ShopType old = dao.load(shopType.getShopTypePK());
        if (old != null)
            ShopTypeTestHelper.delete(old);
        ShopTypeTestHelper.save(shopType);
        return shopType;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getShopTypeDao();
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
     * @return test suite containing test class <Code>ShopTypeTest</Code>
     */
    public static Test suite() {
        return new TestSuite(ShopTypeTest.class);
    }
}