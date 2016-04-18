/***********************************************************************
 * Module:  ShopStoryTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class ShopStory's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.ShopStoryDao;
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

import static com.centuryOldShop.server.persistence.ShopStoryTestHelper.unitTestEquals;

/**
 * Test case class to test ShopStory's persistence
 */
@SuppressWarnings("ALL")
public class ShopStoryTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    ShopStoryDao dao;

    private Log logger = LogFactory.getLog(ShopStoryTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public ShopStoryTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>ShopStory</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        ShopStory shopStory = null;
        // Create new instance, delete instance if exists in database
        shopStory = preInsert();
        // Perform insert
        doInsert(shopStory);
        // Do assert
        afterInsert(shopStory);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>ShopStory</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        ShopStory shopStory = null;
        // Create and insert new instance
        shopStory = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(shopStory);
        // Do assert
        afterUpdate(shopStory);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>ShopStory</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        ShopStory shopStory = null;
        // Insert new ShopStory instance
        shopStory = preDelete();
        // Perform delete
        doDelete(shopStory);
        // Do assert
        afterDelete(shopStory);
        logger.debug("Test delete ends!");
    }


    /**
     * Test query function </tt>findByStoryName</tt>. First create multiple
     * <Code>ShopStory</Code> instances and save them by <tt>preFindByStoryName</tt>.
     * Then delegate the query operation to method <tt>doFindByStoryName</tt>.
     * In the end do some asserts in <tt>afterFindByStoryName</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByStoryName() throws Exception {

        logger.debug("Test find-by-storyName begins!");
        java.lang.String storyName = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List shopStorys = new ArrayList();
        // Create and insert storyName instances
        shopStorys = preFindByStoryName(storyName);
        // Perform query
        List result = doFindByStoryName(storyName);
        // Do asserts
        afterFindByStoryName(shopStorys, result);
        logger.debug("Test find-by-storyName ends!");

    }

    /**
     * Test query function </tt>findByStoryContentUrl</tt>. First create multiple
     * <Code>ShopStory</Code> instances and save them by <tt>preFindByStoryContentUrl</tt>.
     * Then delegate the query operation to method <tt>doFindByStoryContentUrl</tt>.
     * In the end do some asserts in <tt>afterFindByStoryContentUrl</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByStoryContentUrl() throws Exception {

        logger.debug("Test find-by-storyContentUrl begins!");
        java.lang.String storyContentUrl = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List shopStorys = new ArrayList();
        // Create and insert storyContentUrl instances
        shopStorys = preFindByStoryContentUrl(storyContentUrl);
        // Perform query
        List result = doFindByStoryContentUrl(storyContentUrl);
        // Do asserts
        afterFindByStoryContentUrl(shopStorys, result);
        logger.debug("Test find-by-storyContentUrl ends!");

    }

    /**
     * Test query function </tt>findByAddedTime</tt>. First create multiple
     * <Code>ShopStory</Code> instances and save them by <tt>preFindByAddedTime</tt>.
     * Then delegate the query operation to method <tt>doFindByAddedTime</tt>.
     * In the end do some asserts in <tt>afterFindByAddedTime</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByAddedTime() throws Exception {

        logger.debug("Test find-by-addedTime begins!");
        java.util.Date addedTime = com.centuryOldShop.server.Util.getRandomDate();
        List shopStorys = new ArrayList();
        // Create and insert addedTime instances
        shopStorys = preFindByAddedTime(addedTime);
        // Perform query
        List result = doFindByAddedTime(addedTime);
        // Do asserts
        afterFindByAddedTime(shopStorys, result);
        logger.debug("Test find-by-addedTime ends!");

    }

    /**
     * Test function getShopStoryList. First create multiple <Code>ShopStory</Code>
     * instances and save them by <tt>preGetShopStoryList</tt>. Then delegate the
     * find all operation to method <tt>doGetShopStoryList</tt>. In the end do asserts
     * in <tt>afterGetShopStoryList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetShopStoryList() throws Exception {
        logger.debug("Test get-shopStory-list begins!");

        List shopStorys = new ArrayList();
        // Insert ShopStory instance
        shopStorys = preGetShopStoryList();
        // Perform query
        List result = doGetShopStoryList();
        // Make assertion
        afterGetShopStoryList(shopStorys, result);
        logger.debug("Test get-shopStory-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>ShopStory</Code> instance
     * @throws Exception
     */
    private ShopStory preInsert() throws Exception {
        ShopStory shopStory = ShopStoryTestHelper.newInstance(null, null, "", 0, false);
        ShopStory old = dao.load(shopStory.getShopStoryPK());
        if (old != null)
            ShopStoryTestHelper.delete(old);
        return shopStory;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param shopStory instance to insert
     * @throws Exception
     */
    private void doInsert(ShopStory shopStory) {
        ShopStoryTestHelper.save(shopStory);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param shopStory inserted instance
     * @throws Exception
     */
    private void afterInsert(ShopStory shopStory) {
        ShopStory anotherShopStory = dao.load(shopStory.getShopStoryPK());
        assertTrue(
                String.format("Queried result does not equal to inserted instance" +
                                "\nExpected: %s\n" +
                                "Actual  : %s",
                        shopStory, anotherShopStory),
                unitTestEquals(shopStory, anotherShopStory)
        );
        ShopStoryTestHelper.delete(anotherShopStory);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>ShopStory</Code> instance
     * @throws Exception
     * @see ShopStoryTest#prepare()
     */
    private ShopStory preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param shopStory object to update
     * @throws Exception
     */
    private void doUpdate(ShopStory shopStory) throws Exception {
        ShopStoryTestHelper.modifyObject(shopStory);
        dao.update(shopStory);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param shopStory object to update
     * @throws Exception
     */
    private void afterUpdate(ShopStory shopStory) throws Exception {
        ShopStory another = dao.load(shopStory.getShopStoryPK());
        assertTrue(
                String.format("Queried result does not equal to updated instance" +
                                "\nExpected: %s\n" +
                                "Actual  : %s",
                        shopStory, another),
                unitTestEquals(shopStory, another)
        );
        ShopStoryTestHelper.delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>ShopStory</Code> instance
     * @throws Exception
     * @see ShopStoryTest#prepare()
     */
    private ShopStory preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param shopStory object to delete
     * @throws Exception
     */
    private void doDelete(ShopStory shopStory) throws Exception {
        ShopStoryTestHelper.delete(shopStory);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param shopStory deleted object
     * @throws Exception
     */
    private void afterDelete(ShopStory shopStory) throws Exception {
        ShopStory another = dao.load(shopStory.getShopStoryPK());
        assertNull("Inserted instance is not deleted", another);
    }


    /**
     * Do function <tt>FindByStoryName</tt> test preparation. Delete <Code>ShopStory</Code>
     * instances whose property storyName's value is storyName from persistent store. Then Create
     * multiple <Code>ShopStory</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByStoryName(java.lang.String storyName) throws Exception {
        List shopStorys = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShopStorys = dao.findByStoryName(storyName);

        if (oldShopStorys != null) {
            Iterator it = oldShopStorys.iterator();
            while (it.hasNext())
                ShopStoryTestHelper.delete((ShopStory) it.next());
        }

        // Create instances of random count, set their storyName value to storyName
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            ShopStory shopStory = ShopStoryTestHelper.newInstance(null, null, "", 0, false);
            shopStory.setStoryName(storyName);
            deleteBeforeSave(shopStory);
            dao.commitTransaction();
            shopStorys.add(i, shopStory);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shopStorys;
    }

    /**
     * Perform <tt>FindByStoryName</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByStoryName(java.lang.String storyName) {
        return dao.findByStoryName(storyName);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByStoryNamet</tt>.
     *
     * @param shopStorys  inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByStoryName(List shopStorys, List resultFound) {
        if (shopStorys != null && shopStorys.size() > 0) {
            assertNotNull("Result returned by find-by-storyName is null.", resultFound);
            assertEquals("Result count returned by find-by-storyName is incorrect.", shopStorys.size(), resultFound.size());

            Iterator it = shopStorys.iterator();
            while (it.hasNext()) {
                ShopStory shopStory = (ShopStory) it.next();
                ShopStory another = ShopStoryTestHelper.getShopStoryByPk(resultFound, shopStory.getShopStoryPK());
                assertTrue(
                        String.format("Result returned by find-by-storyName does not equal to inserted shopStory object." +
                                        "\nExpected: %s\n" +
                                        "Actual  : %s",
                                shopStory, another),
                        unitTestEquals(shopStory, another)
                );
                ShopStoryTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByStoryContentUrl</tt> test preparation. Delete <Code>ShopStory</Code>
     * instances whose property storyContentUrl's value is storyContentUrl from persistent store. Then Create
     * multiple <Code>ShopStory</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByStoryContentUrl(java.lang.String storyContentUrl) throws Exception {
        List shopStorys = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShopStorys = dao.findByStoryContentUrl(storyContentUrl);

        if (oldShopStorys != null) {
            Iterator it = oldShopStorys.iterator();
            while (it.hasNext())
                ShopStoryTestHelper.delete((ShopStory) it.next());
        }

        // Create instances of random count, set their storyContentUrl value to storyContentUrl
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            ShopStory shopStory = ShopStoryTestHelper.newInstance(null, null, "", 0, false);
            shopStory.setStoryContentUrl(storyContentUrl);
            deleteBeforeSave(shopStory);
            dao.commitTransaction();
            shopStorys.add(i, shopStory);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shopStorys;
    }

    /**
     * Perform <tt>FindByStoryContentUrl</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByStoryContentUrl(java.lang.String storyContentUrl) {
        return dao.findByStoryContentUrl(storyContentUrl);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByStoryContentUrlt</tt>.
     *
     * @param shopStorys  inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByStoryContentUrl(List shopStorys, List resultFound) {
        if (shopStorys != null && shopStorys.size() > 0) {
            assertNotNull("Result returned by find-by-storyContentUrl is null.", resultFound);
            assertEquals("Result count returned by find-by-storyContentUrl is incorrect.", shopStorys.size(), resultFound.size());

            Iterator it = shopStorys.iterator();
            while (it.hasNext()) {
                ShopStory shopStory = (ShopStory) it.next();
                ShopStory another = ShopStoryTestHelper.getShopStoryByPk(resultFound, shopStory.getShopStoryPK());
                assertTrue(
                        String.format("Result returned by find-by-storyContentUrl does not equal to inserted shopStory object." +
                                        "\nExpected: %s\n" +
                                        "Actual  : %s",
                                shopStory, another),
                        unitTestEquals(shopStory, another)
                );
                ShopStoryTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByAddedTime</tt> test preparation. Delete <Code>ShopStory</Code>
     * instances whose property addedTime's value is addedTime from persistent store. Then Create
     * multiple <Code>ShopStory</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByAddedTime(java.util.Date addedTime) throws Exception {
        List shopStorys = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShopStorys = dao.findByAddedTime(addedTime);

        if (oldShopStorys != null) {
            Iterator it = oldShopStorys.iterator();
            while (it.hasNext())
                ShopStoryTestHelper.delete((ShopStory) it.next());
        }

        // Create instances of random count, set their addedTime value to addedTime
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            ShopStory shopStory = ShopStoryTestHelper.newInstance(null, null, "", 0, false);
            shopStory.setAddedTime(addedTime);
            deleteBeforeSave(shopStory);
            dao.commitTransaction();
            shopStorys.add(i, shopStory);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shopStorys;
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
     * @param shopStorys  inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByAddedTime(List shopStorys, List resultFound) {
        if (shopStorys != null && shopStorys.size() > 0) {
            assertNotNull("Result returned by find-by-addedTime is null.", resultFound);
            assertEquals("Result count returned by find-by-addedTime is incorrect.", shopStorys.size(), resultFound.size());

            Iterator it = shopStorys.iterator();
            while (it.hasNext()) {
                ShopStory shopStory = (ShopStory) it.next();
                ShopStory another = ShopStoryTestHelper.getShopStoryByPk(resultFound, shopStory.getShopStoryPK());
                assertTrue(
                        String.format("Result returned by find-by-addedTime does not equal to inserted shopStory object." +
                                        "\nExpected: %s\n" +
                                        "Actual  : %s",
                                shopStory, another),
                        unitTestEquals(shopStory, another)
                );
                ShopStoryTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>getShopStoryList</tt> test preparation.  First delete any <Code>ShopStory</Code>
     * instance from persistent store if exists. Then create multiple <Code>ShopStory</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetShopStoryList() throws Exception {
        List shopStorys = new ArrayList();
        dao.setAutoCommit(false);

        List oldShopStorys = dao.getShopStoryList();

        if (oldShopStorys != null) {
            Iterator it = oldShopStorys.iterator();
            while (it.hasNext())
                ShopStoryTestHelper.delete((ShopStory) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            ShopStory shopStory = prepare();
            dao.update(shopStory);
            dao.commitTransaction();
            shopStorys.add(i, shopStory);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shopStorys;
    }

    /**
     * Perform <tt>getShopStoryList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetShopStoryList() throws Exception {
        return dao.getShopStoryList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getShopStoryList</tt>.
     *
     * @param shopStorys  inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterGetShopStoryList(List shopStorys, List resultFound) {
        if (shopStorys != null && shopStorys.size() > 0) {
            assertNotNull("Result returned by get-shopStory-list is null.", resultFound);
            assertEquals("Result count returned by get-shopStory-list is incorrect.", shopStorys.size(), resultFound.size());

            Iterator it = shopStorys.iterator();
            while (it.hasNext()) {
                ShopStory shopStory = (ShopStory) it.next();
                ShopStory another = ShopStoryTestHelper.getShopStoryByPk(resultFound, shopStory.getShopStoryPK());
                assertTrue(
                        String.format("Result returned by get-shopStory-list does not equal to inserted shopStory object." +
                                        "\nExpected: %s\n" +
                                        "Actual  : %s",
                                shopStory, another),
                        unitTestEquals(shopStory, another)
                );
                ShopStoryTestHelper.delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>ShopStory</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>ShopStory</Code> instance
     * @throws Exception
     */
    private ShopStory prepare() {
        ShopStory shopStory = ShopStoryTestHelper.newInstance(null, null, "", 0, false);
        return deleteBeforeSave(shopStory);
    }

    /**
     * For a new <Code>ShopStory</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param shopStory
     * @return newly created and saved <Code>ShopStory</Code> instance
     * @throws Exception
     */
    private ShopStory deleteBeforeSave(ShopStory shopStory) {
        // Delete instance from data store if already exists
        ShopStory old = dao.load(shopStory.getShopStoryPK());
        if (old != null)
            ShopStoryTestHelper.delete(old);
        ShopStoryTestHelper.save(shopStory);
        return shopStory;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getShopStoryDao();
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
     * @return test suite containing test class <Code>ShopStoryTest</Code>
     */
    public static Test suite() {
        return new TestSuite(ShopStoryTest.class);
    }
}