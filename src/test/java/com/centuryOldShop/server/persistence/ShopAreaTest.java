/***********************************************************************
 * Module:  ShopAreaTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class ShopArea's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.ShopAreaDao;
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

import static com.centuryOldShop.server.persistence.ShopAreaTestHelper.unitTestEquals;

/**
 * Test case class to test ShopArea's persistence
 */
@SuppressWarnings("ALL")
public class ShopAreaTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    ShopAreaDao dao;

    private Log logger = LogFactory.getLog(ShopAreaTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public ShopAreaTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>ShopArea</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        ShopArea shopArea = null;
        // Create new instance, delete instance if exists in database
        shopArea = preInsert();
        // Perform insert
        doInsert(shopArea);
        // Do assert
        afterInsert(shopArea);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>ShopArea</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        ShopArea shopArea = null;
        // Create and insert new instance
        shopArea = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(shopArea);
        // Do assert
        afterUpdate(shopArea);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>ShopArea</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        ShopArea shopArea = null;
        // Insert new ShopArea instance
        shopArea = preDelete();
        // Perform delete
        doDelete(shopArea);
        // Do assert
        afterDelete(shopArea);
        logger.debug("Test delete ends!");
    }


    /**
     * Test query function </tt>findByShopAreaName</tt>. First create multiple
     * <Code>ShopArea</Code> instances and save them by <tt>preFindByShopAreaName</tt>.
     * Then delegate the query operation to method <tt>doFindByShopAreaName</tt>.
     * In the end do some asserts in <tt>afterFindByShopAreaName</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByShopAreaName() throws Exception {

        logger.debug("Test find-by-shopAreaName begins!");
        java.lang.String shopAreaName = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List shopAreas = new ArrayList();
        // Create and insert shopAreaName instances
        shopAreas = preFindByShopAreaName(shopAreaName);
        // Perform query
        List result = doFindByShopAreaName(shopAreaName);
        // Do asserts
        afterFindByShopAreaName(shopAreas, result);
        logger.debug("Test find-by-shopAreaName ends!");

    }

    /**
     * Test function getShopAreaList. First create multiple <Code>ShopArea</Code>
     * instances and save them by <tt>preGetShopAreaList</tt>. Then delegate the
     * find all operation to method <tt>doGetShopAreaList</tt>. In the end do asserts
     * in <tt>afterGetShopAreaList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetShopAreaList() throws Exception {
        logger.debug("Test get-shopArea-list begins!");

        List shopAreas = new ArrayList();
        // Insert ShopArea instance
        shopAreas = preGetShopAreaList();
        // Perform query
        List result = doGetShopAreaList();
        // Make assertion
        afterGetShopAreaList(shopAreas, result);
        logger.debug("Test get-shopArea-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>ShopArea</Code> instance
     * @throws Exception
     */
    private ShopArea preInsert() throws Exception {
        ShopArea shopArea = ShopAreaTestHelper.newInstance(null, null, "", 0, true);
        ShopArea old = dao.load(shopArea.getShopAreaPK());
        if (old != null)
            ShopAreaTestHelper.delete(old);
        return shopArea;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param shopArea instance to insert
     * @throws Exception
     */
    private void doInsert(ShopArea shopArea) {
        ShopAreaTestHelper.save(shopArea);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param shopArea inserted instance
     * @throws Exception
     */
    private void afterInsert(ShopArea shopArea) {
        ShopArea anotherShopArea = dao.load(shopArea.getShopAreaPK());
        assertTrue(
                String.format("Queried result does not equal to inserted instance" +
                                "\nExpected: %s\n" +
                                "Actual  : %s",
                        shopArea, anotherShopArea),
                unitTestEquals(shopArea, anotherShopArea)
        );
        ShopAreaTestHelper.delete(anotherShopArea);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>ShopArea</Code> instance
     * @throws Exception
     * @see ShopAreaTest#prepare()
     */
    private ShopArea preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param shopArea object to update
     * @throws Exception
     */
    private void doUpdate(ShopArea shopArea) throws Exception {
        ShopAreaTestHelper.modifyObject(shopArea);
        dao.update(shopArea);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param shopArea object to update
     * @throws Exception
     */
    private void afterUpdate(ShopArea shopArea) throws Exception {
        ShopArea another = dao.load(shopArea.getShopAreaPK());
        assertTrue(
                String.format("Queried result does not equal to updated instance" +
                                "\nExpected: %s\n" +
                                "Actual  : %s",
                        shopArea, another),
                unitTestEquals(shopArea, another)
        );
        ShopAreaTestHelper.delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>ShopArea</Code> instance
     * @throws Exception
     * @see ShopAreaTest#prepare()
     */
    private ShopArea preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param shopArea object to delete
     * @throws Exception
     */
    private void doDelete(ShopArea shopArea) throws Exception {
        ShopAreaTestHelper.delete(shopArea);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param shopArea deleted object
     * @throws Exception
     */
    private void afterDelete(ShopArea shopArea) throws Exception {
        ShopArea another = dao.load(shopArea.getShopAreaPK());
        assertNull("Inserted instance is not deleted", another);
    }


    /**
     * Do function <tt>FindByShopAreaName</tt> test preparation. Delete <Code>ShopArea</Code>
     * instances whose property shopAreaName's value is shopAreaName from persistent store. Then Create
     * multiple <Code>ShopArea</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByShopAreaName(java.lang.String shopAreaName) throws Exception {
        List shopAreas = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShopAreas = dao.findByShopAreaName(shopAreaName);

        if (oldShopAreas != null) {
            Iterator it = oldShopAreas.iterator();
            while (it.hasNext())
                ShopAreaTestHelper.delete((ShopArea) it.next());
        }

        // Create instances of random count, set their shopAreaName value to shopAreaName
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            ShopArea shopArea = ShopAreaTestHelper.newInstance(null, null, "", 0, true);
            shopArea.setShopAreaName(shopAreaName);
            deleteBeforeSave(shopArea);
            dao.commitTransaction();
            shopAreas.add(i, shopArea);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shopAreas;
    }

    /**
     * Perform <tt>FindByShopAreaName</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByShopAreaName(java.lang.String shopAreaName) {
        return dao.findByShopAreaName(shopAreaName);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByShopAreaNamet</tt>.
     *
     * @param shopAreas   inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByShopAreaName(List shopAreas, List resultFound) {
        if (shopAreas != null && shopAreas.size() > 0) {
            assertNotNull("Result returned by find-by-shopAreaName is null.", resultFound);
            assertEquals("Result count returned by find-by-shopAreaName is incorrect.", shopAreas.size(), resultFound.size());

            Iterator it = shopAreas.iterator();
            while (it.hasNext()) {
                ShopArea shopArea = (ShopArea) it.next();
                ShopArea another = ShopAreaTestHelper.getShopAreaByPk(resultFound, shopArea.getShopAreaPK());
                assertTrue(
                        String.format("Result returned by find-by-shopAreaName does not equal to inserted shopArea object." +
                                        "\nExpected: %s\n" +
                                        "Actual  : %s",
                                shopArea, another),
                        unitTestEquals(shopArea, another)
                );
                ShopAreaTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>getShopAreaList</tt> test preparation.  First delete any <Code>ShopArea</Code>
     * instance from persistent store if exists. Then create multiple <Code>ShopArea</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetShopAreaList() throws Exception {
        List shopAreas = new ArrayList();
        dao.setAutoCommit(false);

        List oldShopAreas = dao.getShopAreaList();

        if (oldShopAreas != null) {
            Iterator it = oldShopAreas.iterator();
            while (it.hasNext())
                ShopAreaTestHelper.delete((ShopArea) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            ShopArea shopArea = prepare();
            dao.update(shopArea);
            dao.commitTransaction();
            shopAreas.add(i, shopArea);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shopAreas;
    }

    /**
     * Perform <tt>getShopAreaList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetShopAreaList() throws Exception {
        return dao.getShopAreaList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getShopAreaList</tt>.
     *
     * @param shopAreas   inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterGetShopAreaList(List shopAreas, List resultFound) {
        if (shopAreas != null && shopAreas.size() > 0) {
            assertNotNull("Result returned by get-shopArea-list is null.", resultFound);
            assertEquals("Result count returned by get-shopArea-list is incorrect.", shopAreas.size(), resultFound.size());

            Iterator it = shopAreas.iterator();
            while (it.hasNext()) {
                ShopArea shopArea = (ShopArea) it.next();
                ShopArea another = ShopAreaTestHelper.getShopAreaByPk(resultFound, shopArea.getShopAreaPK());
                assertTrue(
                        String.format("Result returned by get-shopArea-list does not equal to inserted shopArea object." +
                                        "\nExpected: %s\n" +
                                        "Actual  : %s",
                                shopArea, another),
                        unitTestEquals(shopArea, another)
                );
                ShopAreaTestHelper.delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>ShopArea</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>ShopArea</Code> instance
     * @throws Exception
     */
    private ShopArea prepare() {
        ShopArea shopArea = ShopAreaTestHelper.newInstance(null, null, "", 0, true);
        return deleteBeforeSave(shopArea);
    }

    /**
     * For a new <Code>ShopArea</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param shopArea
     * @return newly created and saved <Code>ShopArea</Code> instance
     * @throws Exception
     */
    private ShopArea deleteBeforeSave(ShopArea shopArea) {
        // Delete instance from data store if already exists
        ShopArea old = dao.load(shopArea.getShopAreaPK());
        if (old != null)
            ShopAreaTestHelper.delete(old);
        ShopAreaTestHelper.save(shopArea);
        return shopArea;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getShopAreaDao();
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
     * @return test suite containing test class <Code>ShopAreaTest</Code>
     */
    public static Test suite() {
        return new TestSuite(ShopAreaTest.class);
    }
}