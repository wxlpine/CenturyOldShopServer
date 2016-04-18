/***********************************************************************
 * Module:  ShopHistoryTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class ShopHistory's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.ShopHistoryDao;
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

import static com.centuryOldShop.server.persistence.ShopHistoryTestHelper.unitTestEquals;

/**
 * Test case class to test ShopHistory's persistence
 */
@SuppressWarnings("ALL")
public class ShopHistoryTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    ShopHistoryDao dao;

    private Log logger = LogFactory.getLog(ShopHistoryTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public ShopHistoryTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>ShopHistory</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        ShopHistory shopHistory = null;
        // Create new instance, delete instance if exists in database
        shopHistory = preInsert();
        // Perform insert
        doInsert(shopHistory);
        // Do assert
        afterInsert(shopHistory);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>ShopHistory</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        ShopHistory shopHistory = null;
        // Create and insert new instance
        shopHistory = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(shopHistory);
        // Do assert
        afterUpdate(shopHistory);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>ShopHistory</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        ShopHistory shopHistory = null;
        // Insert new ShopHistory instance
        shopHistory = preDelete();
        // Perform delete
        doDelete(shopHistory);
        // Do assert
        afterDelete(shopHistory);
        logger.debug("Test delete ends!");
    }


    /**
     * Test query function </tt>findByTitle</tt>. First create multiple
     * <Code>ShopHistory</Code> instances and save them by <tt>preFindByTitle</tt>.
     * Then delegate the query operation to method <tt>doFindByTitle</tt>.
     * In the end do some asserts in <tt>afterFindByTitle</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByTitle() throws Exception {

        logger.debug("Test find-by-title begins!");
        java.lang.String title = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List shopHistorys = new ArrayList();
        // Create and insert title instances
        shopHistorys = preFindByTitle(title);
        // Perform query
        List result = doFindByTitle(title);
        // Do asserts
        afterFindByTitle(shopHistorys, result);
        logger.debug("Test find-by-title ends!");

    }

    /**
     * Test query function </tt>findBySmallPhotoUrl</tt>. First create multiple
     * <Code>ShopHistory</Code> instances and save them by <tt>preFindBySmallPhotoUrl</tt>.
     * Then delegate the query operation to method <tt>doFindBySmallPhotoUrl</tt>.
     * In the end do some asserts in <tt>afterFindBySmallPhotoUrl</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindBySmallPhotoUrl() throws Exception {

        logger.debug("Test find-by-smallPhotoUrl begins!");
        java.lang.String smallPhotoUrl = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List shopHistorys = new ArrayList();
        // Create and insert smallPhotoUrl instances
        shopHistorys = preFindBySmallPhotoUrl(smallPhotoUrl);
        // Perform query
        List result = doFindBySmallPhotoUrl(smallPhotoUrl);
        // Do asserts
        afterFindBySmallPhotoUrl(shopHistorys, result);
        logger.debug("Test find-by-smallPhotoUrl ends!");

    }

    /**
     * Test query function </tt>findByShortDescription</tt>. First create multiple
     * <Code>ShopHistory</Code> instances and save them by <tt>preFindByShortDescription</tt>.
     * Then delegate the query operation to method <tt>doFindByShortDescription</tt>.
     * In the end do some asserts in <tt>afterFindByShortDescription</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByShortDescription() throws Exception {

        logger.debug("Test find-by-shortDescription begins!");
        java.lang.String shortDescription = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List shopHistorys = new ArrayList();
        // Create and insert shortDescription instances
        shopHistorys = preFindByShortDescription(shortDescription);
        // Perform query
        List result = doFindByShortDescription(shortDescription);
        // Do asserts
        afterFindByShortDescription(shopHistorys, result);
        logger.debug("Test find-by-shortDescription ends!");

    }

    /**
     * Test query function </tt>findByPublishTime</tt>. First create multiple
     * <Code>ShopHistory</Code> instances and save them by <tt>preFindByPublishTime</tt>.
     * Then delegate the query operation to method <tt>doFindByPublishTime</tt>.
     * In the end do some asserts in <tt>afterFindByPublishTime</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByPublishTime() throws Exception {

        logger.debug("Test find-by-publishTime begins!");
        java.util.Date publishTime = com.centuryOldShop.server.Util.getRandomDate();
        List shopHistorys = new ArrayList();
        // Create and insert publishTime instances
        shopHistorys = preFindByPublishTime(publishTime);
        // Perform query
        List result = doFindByPublishTime(publishTime);
        // Do asserts
        afterFindByPublishTime(shopHistorys, result);
        logger.debug("Test find-by-publishTime ends!");

    }

    /**
     * Test query function </tt>findByVisitCount</tt>. First create multiple
     * <Code>ShopHistory</Code> instances and save them by <tt>preFindByVisitCount</tt>.
     * Then delegate the query operation to method <tt>doFindByVisitCount</tt>.
     * In the end do some asserts in <tt>afterFindByVisitCount</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByVisitCount() throws Exception {

        logger.debug("Test find-by-visitCount begins!");
        int visitCount = random.nextInt();
        List shopHistorys = new ArrayList();
        // Create and insert visitCount instances
        shopHistorys = preFindByVisitCount(visitCount);
        // Perform query
        List result = doFindByVisitCount(visitCount);
        // Do asserts
        afterFindByVisitCount(shopHistorys, result);
        logger.debug("Test find-by-visitCount ends!");

    }

    /**
     * Test query function </tt>findByDetailedIntroductionPageUrl</tt>. First create multiple
     * <Code>ShopHistory</Code> instances and save them by <tt>preFindByDetailedIntroductionPageUrl</tt>.
     * Then delegate the query operation to method <tt>doFindByDetailedIntroductionPageUrl</tt>.
     * In the end do some asserts in <tt>afterFindByDetailedIntroductionPageUrl</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByDetailedIntroductionPageUrl() throws Exception {

        logger.debug("Test find-by-detailedIntroductionPageUrl begins!");
        java.lang.String detailedIntroductionPageUrl = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List shopHistorys = new ArrayList();
        // Create and insert detailedIntroductionPageUrl instances
        shopHistorys = preFindByDetailedIntroductionPageUrl(detailedIntroductionPageUrl);
        // Perform query
        List result = doFindByDetailedIntroductionPageUrl(detailedIntroductionPageUrl);
        // Do asserts
        afterFindByDetailedIntroductionPageUrl(shopHistorys, result);
        logger.debug("Test find-by-detailedIntroductionPageUrl ends!");

    }

    /**
     * Test function getShopHistoryList. First create multiple <Code>ShopHistory</Code>
     * instances and save them by <tt>preGetShopHistoryList</tt>. Then delegate the
     * find all operation to method <tt>doGetShopHistoryList</tt>. In the end do asserts
     * in <tt>afterGetShopHistoryList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetShopHistoryList() throws Exception {
        logger.debug("Test get-shopHistory-list begins!");

        List shopHistorys = new ArrayList();
        // Insert ShopHistory instance
        shopHistorys = preGetShopHistoryList();
        // Perform query
        List result = doGetShopHistoryList();
        // Make assertion
        afterGetShopHistoryList(shopHistorys, result);
        logger.debug("Test get-shopHistory-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>ShopHistory</Code> instance
     * @throws Exception
     */
    private ShopHistory preInsert() throws Exception {
        ShopHistory shopHistory = ShopHistoryTestHelper.newInstance(null, null, "", 0, false);
        ShopHistory old = dao.load(shopHistory.getShopHistoryPK());
        if (old != null)
            ShopHistoryTestHelper.delete(old);
        return shopHistory;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param shopHistory instance to insert
     * @throws Exception
     */
    private void doInsert(ShopHistory shopHistory) {
        ShopHistoryTestHelper.save(shopHistory);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param shopHistory inserted instance
     * @throws Exception
     */
    private void afterInsert(ShopHistory shopHistory) {
        ShopHistory anotherShopHistory = dao.load(shopHistory.getShopHistoryPK());
        assertTrue(
                String.format("Queried result does not equal to inserted instance" +
                                "\nExpected: %s\n" +
                                "Actual  : %s",
                        shopHistory, anotherShopHistory),
                unitTestEquals(shopHistory, anotherShopHistory)
        );
        ShopHistoryTestHelper.delete(anotherShopHistory);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>ShopHistory</Code> instance
     * @throws Exception
     * @see ShopHistoryTest#prepare()
     */
    private ShopHistory preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param shopHistory object to update
     * @throws Exception
     */
    private void doUpdate(ShopHistory shopHistory) throws Exception {
        ShopHistoryTestHelper.modifyObject(shopHistory);
        dao.update(shopHistory);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param shopHistory object to update
     * @throws Exception
     */
    private void afterUpdate(ShopHistory shopHistory) throws Exception {
        ShopHistory another = dao.load(shopHistory.getShopHistoryPK());
        assertTrue(
                String.format("Queried result does not equal to updated instance" +
                                "\nExpected: %s\n" +
                                "Actual  : %s",
                        shopHistory, another),
                unitTestEquals(shopHistory, another)
        );
        ShopHistoryTestHelper.delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>ShopHistory</Code> instance
     * @throws Exception
     * @see ShopHistoryTest#prepare()
     */
    private ShopHistory preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param shopHistory object to delete
     * @throws Exception
     */
    private void doDelete(ShopHistory shopHistory) throws Exception {
        ShopHistoryTestHelper.delete(shopHistory);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param shopHistory deleted object
     * @throws Exception
     */
    private void afterDelete(ShopHistory shopHistory) throws Exception {
        ShopHistory another = dao.load(shopHistory.getShopHistoryPK());
        assertNull("Inserted instance is not deleted", another);
    }


    /**
     * Do function <tt>FindByTitle</tt> test preparation. Delete <Code>ShopHistory</Code>
     * instances whose property title's value is title from persistent store. Then Create
     * multiple <Code>ShopHistory</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByTitle(java.lang.String title) throws Exception {
        List shopHistorys = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShopHistorys = dao.findByTitle(title);

        if (oldShopHistorys != null) {
            Iterator it = oldShopHistorys.iterator();
            while (it.hasNext())
                ShopHistoryTestHelper.delete((ShopHistory) it.next());
        }

        // Create instances of random count, set their title value to title
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            ShopHistory shopHistory = ShopHistoryTestHelper.newInstance(null, null, "", 0, false);
            shopHistory.setTitle(title);
            deleteBeforeSave(shopHistory);
            dao.commitTransaction();
            shopHistorys.add(i, shopHistory);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shopHistorys;
    }

    /**
     * Perform <tt>FindByTitle</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByTitle(java.lang.String title) {
        return dao.findByTitle(title);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByTitlet</tt>.
     *
     * @param shopHistorys inserted instance list
     * @param resultFound  result instance list
     * @throws Exception
     */
    private void afterFindByTitle(List shopHistorys, List resultFound) {
        if (shopHistorys != null && shopHistorys.size() > 0) {
            assertNotNull("Result returned by find-by-title is null.", resultFound);
            assertEquals("Result count returned by find-by-title is incorrect.", shopHistorys.size(), resultFound.size());

            Iterator it = shopHistorys.iterator();
            while (it.hasNext()) {
                ShopHistory shopHistory = (ShopHistory) it.next();
                ShopHistory another = ShopHistoryTestHelper.getShopHistoryByPk(resultFound, shopHistory.getShopHistoryPK());
                assertTrue(
                        String.format("Result returned by find-by-title does not equal to inserted shopHistory object." +
                                        "\nExpected: %s\n" +
                                        "Actual  : %s",
                                shopHistory, another),
                        unitTestEquals(shopHistory, another)
                );
                ShopHistoryTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindBySmallPhotoUrl</tt> test preparation. Delete <Code>ShopHistory</Code>
     * instances whose property smallPhotoUrl's value is smallPhotoUrl from persistent store. Then Create
     * multiple <Code>ShopHistory</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindBySmallPhotoUrl(java.lang.String smallPhotoUrl) throws Exception {
        List shopHistorys = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShopHistorys = dao.findBySmallPhotoUrl(smallPhotoUrl);

        if (oldShopHistorys != null) {
            Iterator it = oldShopHistorys.iterator();
            while (it.hasNext())
                ShopHistoryTestHelper.delete((ShopHistory) it.next());
        }

        // Create instances of random count, set their smallPhotoUrl value to smallPhotoUrl
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            ShopHistory shopHistory = ShopHistoryTestHelper.newInstance(null, null, "", 0, false);
            shopHistory.setSmallPhotoUrl(smallPhotoUrl);
            deleteBeforeSave(shopHistory);
            dao.commitTransaction();
            shopHistorys.add(i, shopHistory);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shopHistorys;
    }

    /**
     * Perform <tt>FindBySmallPhotoUrl</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindBySmallPhotoUrl(java.lang.String smallPhotoUrl) {
        return dao.findBySmallPhotoUrl(smallPhotoUrl);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findBySmallPhotoUrlt</tt>.
     *
     * @param shopHistorys inserted instance list
     * @param resultFound  result instance list
     * @throws Exception
     */
    private void afterFindBySmallPhotoUrl(List shopHistorys, List resultFound) {
        if (shopHistorys != null && shopHistorys.size() > 0) {
            assertNotNull("Result returned by find-by-smallPhotoUrl is null.", resultFound);
            assertEquals("Result count returned by find-by-smallPhotoUrl is incorrect.", shopHistorys.size(), resultFound.size());

            Iterator it = shopHistorys.iterator();
            while (it.hasNext()) {
                ShopHistory shopHistory = (ShopHistory) it.next();
                ShopHistory another = ShopHistoryTestHelper.getShopHistoryByPk(resultFound, shopHistory.getShopHistoryPK());
                assertTrue(
                        String.format("Result returned by find-by-smallPhotoUrl does not equal to inserted shopHistory object." +
                                        "\nExpected: %s\n" +
                                        "Actual  : %s",
                                shopHistory, another),
                        unitTestEquals(shopHistory, another)
                );
                ShopHistoryTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByShortDescription</tt> test preparation. Delete <Code>ShopHistory</Code>
     * instances whose property shortDescription's value is shortDescription from persistent store. Then Create
     * multiple <Code>ShopHistory</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByShortDescription(java.lang.String shortDescription) throws Exception {
        List shopHistorys = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShopHistorys = dao.findByShortDescription(shortDescription);

        if (oldShopHistorys != null) {
            Iterator it = oldShopHistorys.iterator();
            while (it.hasNext())
                ShopHistoryTestHelper.delete((ShopHistory) it.next());
        }

        // Create instances of random count, set their shortDescription value to shortDescription
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            ShopHistory shopHistory = ShopHistoryTestHelper.newInstance(null, null, "", 0, false);
            shopHistory.setShortDescription(shortDescription);
            deleteBeforeSave(shopHistory);
            dao.commitTransaction();
            shopHistorys.add(i, shopHistory);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shopHistorys;
    }

    /**
     * Perform <tt>FindByShortDescription</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByShortDescription(java.lang.String shortDescription) {
        return dao.findByShortDescription(shortDescription);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByShortDescriptiont</tt>.
     *
     * @param shopHistorys inserted instance list
     * @param resultFound  result instance list
     * @throws Exception
     */
    private void afterFindByShortDescription(List shopHistorys, List resultFound) {
        if (shopHistorys != null && shopHistorys.size() > 0) {
            assertNotNull("Result returned by find-by-shortDescription is null.", resultFound);
            assertEquals("Result count returned by find-by-shortDescription is incorrect.", shopHistorys.size(), resultFound.size());

            Iterator it = shopHistorys.iterator();
            while (it.hasNext()) {
                ShopHistory shopHistory = (ShopHistory) it.next();
                ShopHistory another = ShopHistoryTestHelper.getShopHistoryByPk(resultFound, shopHistory.getShopHistoryPK());
                assertTrue(
                        String.format("Result returned by find-by-shortDescription does not equal to inserted shopHistory object." +
                                        "\nExpected: %s\n" +
                                        "Actual  : %s",
                                shopHistory, another),
                        unitTestEquals(shopHistory, another)
                );
                ShopHistoryTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByPublishTime</tt> test preparation. Delete <Code>ShopHistory</Code>
     * instances whose property publishTime's value is publishTime from persistent store. Then Create
     * multiple <Code>ShopHistory</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByPublishTime(java.util.Date publishTime) throws Exception {
        List shopHistorys = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShopHistorys = dao.findByPublishTime(publishTime);

        if (oldShopHistorys != null) {
            Iterator it = oldShopHistorys.iterator();
            while (it.hasNext())
                ShopHistoryTestHelper.delete((ShopHistory) it.next());
        }

        // Create instances of random count, set their publishTime value to publishTime
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            ShopHistory shopHistory = ShopHistoryTestHelper.newInstance(null, null, "", 0, false);
            shopHistory.setPublishTime(publishTime);
            deleteBeforeSave(shopHistory);
            dao.commitTransaction();
            shopHistorys.add(i, shopHistory);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shopHistorys;
    }

    /**
     * Perform <tt>FindByPublishTime</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByPublishTime(java.util.Date publishTime) {
        return dao.findByPublishTime(publishTime);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByPublishTimet</tt>.
     *
     * @param shopHistorys inserted instance list
     * @param resultFound  result instance list
     * @throws Exception
     */
    private void afterFindByPublishTime(List shopHistorys, List resultFound) {
        if (shopHistorys != null && shopHistorys.size() > 0) {
            assertNotNull("Result returned by find-by-publishTime is null.", resultFound);
            assertEquals("Result count returned by find-by-publishTime is incorrect.", shopHistorys.size(), resultFound.size());

            Iterator it = shopHistorys.iterator();
            while (it.hasNext()) {
                ShopHistory shopHistory = (ShopHistory) it.next();
                ShopHistory another = ShopHistoryTestHelper.getShopHistoryByPk(resultFound, shopHistory.getShopHistoryPK());
                assertTrue(
                        String.format("Result returned by find-by-publishTime does not equal to inserted shopHistory object." +
                                        "\nExpected: %s\n" +
                                        "Actual  : %s",
                                shopHistory, another),
                        unitTestEquals(shopHistory, another)
                );
                ShopHistoryTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByVisitCount</tt> test preparation. Delete <Code>ShopHistory</Code>
     * instances whose property visitCount's value is visitCount from persistent store. Then Create
     * multiple <Code>ShopHistory</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByVisitCount(int visitCount) throws Exception {
        List shopHistorys = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShopHistorys = dao.findByVisitCount(visitCount);

        if (oldShopHistorys != null) {
            Iterator it = oldShopHistorys.iterator();
            while (it.hasNext())
                ShopHistoryTestHelper.delete((ShopHistory) it.next());
        }

        // Create instances of random count, set their visitCount value to visitCount
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            ShopHistory shopHistory = ShopHistoryTestHelper.newInstance(null, null, "", 0, false);
            shopHistory.setVisitCount(visitCount);
            deleteBeforeSave(shopHistory);
            dao.commitTransaction();
            shopHistorys.add(i, shopHistory);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shopHistorys;
    }

    /**
     * Perform <tt>FindByVisitCount</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByVisitCount(int visitCount) {
        return dao.findByVisitCount(visitCount);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByVisitCountt</tt>.
     *
     * @param shopHistorys inserted instance list
     * @param resultFound  result instance list
     * @throws Exception
     */
    private void afterFindByVisitCount(List shopHistorys, List resultFound) {
        if (shopHistorys != null && shopHistorys.size() > 0) {
            assertNotNull("Result returned by find-by-visitCount is null.", resultFound);
            assertEquals("Result count returned by find-by-visitCount is incorrect.", shopHistorys.size(), resultFound.size());

            Iterator it = shopHistorys.iterator();
            while (it.hasNext()) {
                ShopHistory shopHistory = (ShopHistory) it.next();
                ShopHistory another = ShopHistoryTestHelper.getShopHistoryByPk(resultFound, shopHistory.getShopHistoryPK());
                assertTrue(
                        String.format("Result returned by find-by-visitCount does not equal to inserted shopHistory object." +
                                        "\nExpected: %s\n" +
                                        "Actual  : %s",
                                shopHistory, another),
                        unitTestEquals(shopHistory, another)
                );
                ShopHistoryTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByDetailedIntroductionPageUrl</tt> test preparation. Delete <Code>ShopHistory</Code>
     * instances whose property detailedIntroductionPageUrl's value is detailedIntroductionPageUrl from persistent store. Then Create
     * multiple <Code>ShopHistory</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByDetailedIntroductionPageUrl(java.lang.String detailedIntroductionPageUrl) throws Exception {
        List shopHistorys = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShopHistorys = dao.findByDetailedIntroductionPageUrl(detailedIntroductionPageUrl);

        if (oldShopHistorys != null) {
            Iterator it = oldShopHistorys.iterator();
            while (it.hasNext())
                ShopHistoryTestHelper.delete((ShopHistory) it.next());
        }

        // Create instances of random count, set their detailedIntroductionPageUrl value to detailedIntroductionPageUrl
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            ShopHistory shopHistory = ShopHistoryTestHelper.newInstance(null, null, "", 0, false);
            shopHistory.setDetailedIntroductionPageUrl(detailedIntroductionPageUrl);
            deleteBeforeSave(shopHistory);
            dao.commitTransaction();
            shopHistorys.add(i, shopHistory);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shopHistorys;
    }

    /**
     * Perform <tt>FindByDetailedIntroductionPageUrl</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByDetailedIntroductionPageUrl(java.lang.String detailedIntroductionPageUrl) {
        return dao.findByDetailedIntroductionPageUrl(detailedIntroductionPageUrl);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByDetailedIntroductionPageUrlt</tt>.
     *
     * @param shopHistorys inserted instance list
     * @param resultFound  result instance list
     * @throws Exception
     */
    private void afterFindByDetailedIntroductionPageUrl(List shopHistorys, List resultFound) {
        if (shopHistorys != null && shopHistorys.size() > 0) {
            assertNotNull("Result returned by find-by-detailedIntroductionPageUrl is null.", resultFound);
            assertEquals("Result count returned by find-by-detailedIntroductionPageUrl is incorrect.", shopHistorys.size(), resultFound.size());

            Iterator it = shopHistorys.iterator();
            while (it.hasNext()) {
                ShopHistory shopHistory = (ShopHistory) it.next();
                ShopHistory another = ShopHistoryTestHelper.getShopHistoryByPk(resultFound, shopHistory.getShopHistoryPK());
                assertTrue(
                        String.format("Result returned by find-by-detailedIntroductionPageUrl does not equal to inserted shopHistory object." +
                                        "\nExpected: %s\n" +
                                        "Actual  : %s",
                                shopHistory, another),
                        unitTestEquals(shopHistory, another)
                );
                ShopHistoryTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>getShopHistoryList</tt> test preparation.  First delete any <Code>ShopHistory</Code>
     * instance from persistent store if exists. Then create multiple <Code>ShopHistory</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetShopHistoryList() throws Exception {
        List shopHistorys = new ArrayList();
        dao.setAutoCommit(false);

        List oldShopHistorys = dao.getShopHistoryList();

        if (oldShopHistorys != null) {
            Iterator it = oldShopHistorys.iterator();
            while (it.hasNext())
                ShopHistoryTestHelper.delete((ShopHistory) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            ShopHistory shopHistory = prepare();
            dao.update(shopHistory);
            dao.commitTransaction();
            shopHistorys.add(i, shopHistory);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shopHistorys;
    }

    /**
     * Perform <tt>getShopHistoryList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetShopHistoryList() throws Exception {
        return dao.getShopHistoryList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getShopHistoryList</tt>.
     *
     * @param shopHistorys inserted instance list
     * @param resultFound  result instance list
     * @throws Exception
     */
    private void afterGetShopHistoryList(List shopHistorys, List resultFound) {
        if (shopHistorys != null && shopHistorys.size() > 0) {
            assertNotNull("Result returned by get-shopHistory-list is null.", resultFound);
            assertEquals("Result count returned by get-shopHistory-list is incorrect.", shopHistorys.size(), resultFound.size());

            Iterator it = shopHistorys.iterator();
            while (it.hasNext()) {
                ShopHistory shopHistory = (ShopHistory) it.next();
                ShopHistory another = ShopHistoryTestHelper.getShopHistoryByPk(resultFound, shopHistory.getShopHistoryPK());
                assertTrue(
                        String.format("Result returned by get-shopHistory-list does not equal to inserted shopHistory object." +
                                        "\nExpected: %s\n" +
                                        "Actual  : %s",
                                shopHistory, another),
                        unitTestEquals(shopHistory, another)
                );
                ShopHistoryTestHelper.delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>ShopHistory</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>ShopHistory</Code> instance
     * @throws Exception
     */
    private ShopHistory prepare() {
        ShopHistory shopHistory = ShopHistoryTestHelper.newInstance(null, null, "", 0, false);
        return deleteBeforeSave(shopHistory);
    }

    /**
     * For a new <Code>ShopHistory</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param shopHistory
     * @return newly created and saved <Code>ShopHistory</Code> instance
     * @throws Exception
     */
    private ShopHistory deleteBeforeSave(ShopHistory shopHistory) {
        // Delete instance from data store if already exists
        ShopHistory old = dao.load(shopHistory.getShopHistoryPK());
        if (old != null)
            ShopHistoryTestHelper.delete(old);
        ShopHistoryTestHelper.save(shopHistory);
        return shopHistory;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getShopHistoryDao();
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
     * @return test suite containing test class <Code>ShopHistoryTest</Code>
     */
    public static Test suite() {
        return new TestSuite(ShopHistoryTest.class);
    }
}