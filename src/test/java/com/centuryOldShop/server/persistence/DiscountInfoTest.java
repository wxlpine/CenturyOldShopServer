/***********************************************************************
 * Module:  DiscountInfoTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class DiscountInfo's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.Util;
import com.centuryOldShop.server.persistence.dao.DiscountInfoDao;
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
 * Test case class to test DiscountInfo's persistence
 */
@SuppressWarnings("ALL")
public class DiscountInfoTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    DiscountInfoDao dao;

    private Log logger = LogFactory.getLog(DiscountInfoTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public DiscountInfoTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>DiscountInfo</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        DiscountInfo discountInfo = null;
        // Create new instance, delete instance if exists in database
        discountInfo = preInsert();
        // Perform insert
        doInsert(discountInfo);
        // Do assert
        afterInsert(discountInfo);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>DiscountInfo</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        DiscountInfo discountInfo = null;
        // Create and insert new instance
        discountInfo = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(discountInfo);
        // Do assert
        afterUpdate(discountInfo);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>DiscountInfo</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        DiscountInfo discountInfo = null;
        // Insert new DiscountInfo instance
        discountInfo = preDelete();
        // Perform delete
        doDelete(discountInfo);
        // Do assert
        afterDelete(discountInfo);
        logger.debug("Test delete ends!");
    }


    /**
     * Test query function </tt>findByTitle</tt>. First create multiple
     * <Code>DiscountInfo</Code> instances and save them by <tt>preFindByTitle</tt>.
     * Then delegate the query operation to method <tt>doFindByTitle</tt>.
     * In the end do some asserts in <tt>afterFindByTitle</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByTitle() throws Exception {

        logger.debug("Test find-by-title begins!");
        java.lang.String title = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List discountInfos = new ArrayList();
        // Create and insert title instances
        discountInfos = preFindByTitle(title);
        // Perform query
        List result = doFindByTitle(title);
        // Do asserts
        afterFindByTitle(discountInfos, result);
        logger.debug("Test find-by-title ends!");

    }

    /**
     * Test query function </tt>findByDiscountStartTime</tt>. First create multiple
     * <Code>DiscountInfo</Code> instances and save them by <tt>preFindByDiscountStartTime</tt>.
     * Then delegate the query operation to method <tt>doFindByDiscountStartTime</tt>.
     * In the end do some asserts in <tt>afterFindByDiscountStartTime</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByDiscountStartTime() throws Exception {

        logger.debug("Test find-by-discountStartTime begins!");
        java.util.Date discountStartTime = Util.getRandomDate();
        List discountInfos = new ArrayList();
        // Create and insert discountStartTime instances
        discountInfos = preFindByDiscountStartTime(discountStartTime);
        // Perform query
        List result = doFindByDiscountStartTime(discountStartTime);
        // Do asserts
        afterFindByDiscountStartTime(discountInfos, result);
        logger.debug("Test find-by-discountStartTime ends!");

    }

    /**
     * Test query function </tt>findByDiscountEndTime</tt>. First create multiple
     * <Code>DiscountInfo</Code> instances and save them by <tt>preFindByDiscountEndTime</tt>.
     * Then delegate the query operation to method <tt>doFindByDiscountEndTime</tt>.
     * In the end do some asserts in <tt>afterFindByDiscountEndTime</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByDiscountEndTime() throws Exception {

        logger.debug("Test find-by-discountEndTime begins!");
        java.util.Date discountEndTime = Util.getRandomDate();
        List discountInfos = new ArrayList();
        // Create and insert discountEndTime instances
        discountInfos = preFindByDiscountEndTime(discountEndTime);
        // Perform query
        List result = doFindByDiscountEndTime(discountEndTime);
        // Do asserts
        afterFindByDiscountEndTime(discountInfos, result);
        logger.debug("Test find-by-discountEndTime ends!");

    }

    /**
     * Test query function </tt>findByPriceReduceMinPrice</tt>. First create multiple
     * <Code>DiscountInfo</Code> instances and save them by <tt>preFindByPriceReduceMinPrice</tt>.
     * Then delegate the query operation to method <tt>doFindByPriceReduceMinPrice</tt>.
     * In the end do some asserts in <tt>afterFindByPriceReduceMinPrice</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByPriceReduceMinPrice() throws Exception {

        logger.debug("Test find-by-priceReduceMinPrice begins!");
        double priceReduceMinPrice = DiscountInfoTestHelper.getRandomPriceReduceMinPrice();
        List discountInfos = new ArrayList();
        // Create and insert priceReduceMinPrice instances
        discountInfos = preFindByPriceReduceMinPrice(priceReduceMinPrice);
        // Perform query
        List result = doFindByPriceReduceMinPrice(priceReduceMinPrice);
        // Do asserts
        afterFindByPriceReduceMinPrice(discountInfos, result);
        logger.debug("Test find-by-priceReduceMinPrice ends!");

    }

    /**
     * Test query function </tt>findByPriceReduceAmount</tt>. First create multiple
     * <Code>DiscountInfo</Code> instances and save them by <tt>preFindByPriceReduceAmount</tt>.
     * Then delegate the query operation to method <tt>doFindByPriceReduceAmount</tt>.
     * In the end do some asserts in <tt>afterFindByPriceReduceAmount</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByPriceReduceAmount() throws Exception {

        logger.debug("Test find-by-priceReduceAmount begins!");
        double priceReduceAmount = DiscountInfoTestHelper.getRandomPriceReduceAmount();
        List discountInfos = new ArrayList();
        // Create and insert priceReduceAmount instances
        discountInfos = preFindByPriceReduceAmount(priceReduceAmount);
        // Perform query
        List result = doFindByPriceReduceAmount(priceReduceAmount);
        // Do asserts
        afterFindByPriceReduceAmount(discountInfos, result);
        logger.debug("Test find-by-priceReduceAmount ends!");

    }

    /**
     * Test query function </tt>findByDiscountMinPrice</tt>. First create multiple
     * <Code>DiscountInfo</Code> instances and save them by <tt>preFindByDiscountMinPrice</tt>.
     * Then delegate the query operation to method <tt>doFindByDiscountMinPrice</tt>.
     * In the end do some asserts in <tt>afterFindByDiscountMinPrice</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByDiscountMinPrice() throws Exception {

        logger.debug("Test find-by-discountMinPrice begins!");
        double discountMinPrice = DiscountInfoTestHelper.getRandomDiscountMinPrice();
        List discountInfos = new ArrayList();
        // Create and insert discountMinPrice instances
        discountInfos = preFindByDiscountMinPrice(discountMinPrice);
        // Perform query
        List result = doFindByDiscountMinPrice(discountMinPrice);
        // Do asserts
        afterFindByDiscountMinPrice(discountInfos, result);
        logger.debug("Test find-by-discountMinPrice ends!");

    }

    /**
     * Test query function </tt>findByDiscountRatio</tt>. First create multiple
     * <Code>DiscountInfo</Code> instances and save them by <tt>preFindByDiscountRatio</tt>.
     * Then delegate the query operation to method <tt>doFindByDiscountRatio</tt>.
     * In the end do some asserts in <tt>afterFindByDiscountRatio</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByDiscountRatio() throws Exception {

        logger.debug("Test find-by-discountRatio begins!");
        double discountRatio = DiscountInfoTestHelper.getRandomDiscountRatio();
        List discountInfos = new ArrayList();
        // Create and insert discountRatio instances
        discountInfos = preFindByDiscountRatio(discountRatio);
        // Perform query
        List result = doFindByDiscountRatio(discountRatio);
        // Do asserts
        afterFindByDiscountRatio(discountInfos, result);
        logger.debug("Test find-by-discountRatio ends!");

    }

    /**
     * Test function getDiscountInfoList. First create multiple <Code>DiscountInfo</Code>
     * instances and save them by <tt>preGetDiscountInfoList</tt>. Then delegate the
     * find all operation to method <tt>doGetDiscountInfoList</tt>. In the end do asserts
     * in <tt>afterGetDiscountInfoList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetDiscountInfoList() throws Exception {
        logger.debug("Test get-discountInfo-list begins!");

        List discountInfos = new ArrayList();
        // Insert DiscountInfo instance
        discountInfos = preGetDiscountInfoList();
        // Perform query
        List result = doGetDiscountInfoList();
        // Make assertion
        afterGetDiscountInfoList(discountInfos, result);
        logger.debug("Test get-discountInfo-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>DiscountInfo</Code> instance
     * @throws Exception
     */
    private DiscountInfo preInsert() throws Exception {
        DiscountInfo discountInfo = DiscountInfoTestHelper.newInstance(null, null, "", 0, false);
        DiscountInfo old = dao.load(discountInfo.getDiscountInfoPK());
        if (old != null)
            DiscountInfoTestHelper.delete(old);
        return discountInfo;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param discountInfo instance to insert
     * @throws Exception
     */
    private void doInsert(DiscountInfo discountInfo) {
        DiscountInfoTestHelper.save(discountInfo);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param discountInfo inserted instance
     * @throws Exception
     */
    private void afterInsert(DiscountInfo discountInfo) {
        DiscountInfo anotherDiscountInfo = dao.load(discountInfo.getDiscountInfoPK());
        assertEquals("Queried result does not equal to inserted instance",
                discountInfo, anotherDiscountInfo);
        DiscountInfoTestHelper.delete(anotherDiscountInfo);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>DiscountInfo</Code> instance
     * @throws Exception
     * @see DiscountInfoTest#prepare()
     */
    private DiscountInfo preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param discountInfo object to update
     * @throws Exception
     */
    private void doUpdate(DiscountInfo discountInfo) throws Exception {
        DiscountInfoTestHelper.modifyObject(discountInfo);
        dao.update(discountInfo);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param discountInfo object to update
     * @throws Exception
     */
    private void afterUpdate(DiscountInfo discountInfo) throws Exception {
        DiscountInfo another = dao.load(discountInfo.getDiscountInfoPK());
        assertEquals("Queried result does not equal to updated instance", discountInfo, another);
        DiscountInfoTestHelper.delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>DiscountInfo</Code> instance
     * @throws Exception
     * @see DiscountInfoTest#prepare()
     */
    private DiscountInfo preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param discountInfo object to delete
     * @throws Exception
     */
    private void doDelete(DiscountInfo discountInfo) throws Exception {
        DiscountInfoTestHelper.delete(discountInfo);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param discountInfo deleted object
     * @throws Exception
     */
    private void afterDelete(DiscountInfo discountInfo) throws Exception {
        DiscountInfo another = dao.load(discountInfo.getDiscountInfoPK());
        assertNull("Inserted instance is not deleted", another);
    }


    /**
     * Do function <tt>FindByTitle</tt> test preparation. Delete <Code>DiscountInfo</Code>
     * instances whose property title's value is title from persistent store. Then Create
     * multiple <Code>DiscountInfo</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByTitle(java.lang.String title) throws Exception {
        List discountInfos = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldDiscountInfos = dao.findByTitle(title);

        if (oldDiscountInfos != null) {
            Iterator it = oldDiscountInfos.iterator();
            while (it.hasNext())
                DiscountInfoTestHelper.delete((DiscountInfo) it.next());
        }

        // Create instances of random count, set their title value to title
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            DiscountInfo discountInfo = DiscountInfoTestHelper.newInstance(null, null, "", 0, false);
            discountInfo.setTitle(title);
            deleteBeforeSave(discountInfo);
            dao.commitTransaction();
            discountInfos.add(i, discountInfo);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return discountInfos;
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
     * @param discountInfos inserted instance list
     * @param resultFound   result instance list
     * @throws Exception
     */
    private void afterFindByTitle(List discountInfos, List resultFound) {
        if (discountInfos != null && discountInfos.size() > 0) {
            assertNotNull("Result returned by find-by-title is null.", resultFound);
            assertEquals("Result count returned by find-by-title is incorrect.", discountInfos.size(), resultFound.size());

            Iterator it = discountInfos.iterator();
            while (it.hasNext()) {
                DiscountInfo discountInfo = (DiscountInfo) it.next();
                DiscountInfo another = DiscountInfoTestHelper.getDiscountInfoByPk(resultFound, discountInfo.getDiscountInfoPK());
                assertEquals("Result returned by find-by-title does not equal to inserted discountInfo object.", discountInfo, another);
                DiscountInfoTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByDiscountStartTime</tt> test preparation. Delete <Code>DiscountInfo</Code>
     * instances whose property discountStartTime's value is discountStartTime from persistent store. Then Create
     * multiple <Code>DiscountInfo</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByDiscountStartTime(java.util.Date discountStartTime) throws Exception {
        List discountInfos = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldDiscountInfos = dao.findByDiscountStartTime(discountStartTime);

        if (oldDiscountInfos != null) {
            Iterator it = oldDiscountInfos.iterator();
            while (it.hasNext())
                DiscountInfoTestHelper.delete((DiscountInfo) it.next());
        }

        // Create instances of random count, set their discountStartTime value to discountStartTime
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            DiscountInfo discountInfo = DiscountInfoTestHelper.newInstance(null, null, "", 0, false);
            discountInfo.setDiscountStartTime(discountStartTime);
            deleteBeforeSave(discountInfo);
            dao.commitTransaction();
            discountInfos.add(i, discountInfo);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return discountInfos;
    }

    /**
     * Perform <tt>FindByDiscountStartTime</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByDiscountStartTime(java.util.Date discountStartTime) {
        return dao.findByDiscountStartTime(discountStartTime);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByDiscountStartTimet</tt>.
     *
     * @param discountInfos inserted instance list
     * @param resultFound   result instance list
     * @throws Exception
     */
    private void afterFindByDiscountStartTime(List discountInfos, List resultFound) {
        if (discountInfos != null && discountInfos.size() > 0) {
            assertNotNull("Result returned by find-by-discountStartTime is null.", resultFound);
            assertEquals("Result count returned by find-by-discountStartTime is incorrect.", discountInfos.size(), resultFound.size());

            Iterator it = discountInfos.iterator();
            while (it.hasNext()) {
                DiscountInfo discountInfo = (DiscountInfo) it.next();
                DiscountInfo another = DiscountInfoTestHelper.getDiscountInfoByPk(resultFound, discountInfo.getDiscountInfoPK());
                assertEquals("Result returned by find-by-discountStartTime does not equal to inserted discountInfo object.", discountInfo, another);
                DiscountInfoTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByDiscountEndTime</tt> test preparation. Delete <Code>DiscountInfo</Code>
     * instances whose property discountEndTime's value is discountEndTime from persistent store. Then Create
     * multiple <Code>DiscountInfo</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByDiscountEndTime(java.util.Date discountEndTime) throws Exception {
        List discountInfos = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldDiscountInfos = dao.findByDiscountEndTime(discountEndTime);

        if (oldDiscountInfos != null) {
            Iterator it = oldDiscountInfos.iterator();
            while (it.hasNext())
                DiscountInfoTestHelper.delete((DiscountInfo) it.next());
        }

        // Create instances of random count, set their discountEndTime value to discountEndTime
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            DiscountInfo discountInfo = DiscountInfoTestHelper.newInstance(null, null, "", 0, false);
            discountInfo.setDiscountEndTime(discountEndTime);
            deleteBeforeSave(discountInfo);
            dao.commitTransaction();
            discountInfos.add(i, discountInfo);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return discountInfos;
    }

    /**
     * Perform <tt>FindByDiscountEndTime</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByDiscountEndTime(java.util.Date discountEndTime) {
        return dao.findByDiscountEndTime(discountEndTime);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByDiscountEndTimet</tt>.
     *
     * @param discountInfos inserted instance list
     * @param resultFound   result instance list
     * @throws Exception
     */
    private void afterFindByDiscountEndTime(List discountInfos, List resultFound) {
        if (discountInfos != null && discountInfos.size() > 0) {
            assertNotNull("Result returned by find-by-discountEndTime is null.", resultFound);
            assertEquals("Result count returned by find-by-discountEndTime is incorrect.", discountInfos.size(), resultFound.size());

            Iterator it = discountInfos.iterator();
            while (it.hasNext()) {
                DiscountInfo discountInfo = (DiscountInfo) it.next();
                DiscountInfo another = DiscountInfoTestHelper.getDiscountInfoByPk(resultFound, discountInfo.getDiscountInfoPK());
                assertEquals("Result returned by find-by-discountEndTime does not equal to inserted discountInfo object.", discountInfo, another);
                DiscountInfoTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByPriceReduceMinPrice</tt> test preparation. Delete <Code>DiscountInfo</Code>
     * instances whose property priceReduceMinPrice's value is priceReduceMinPrice from persistent store. Then Create
     * multiple <Code>DiscountInfo</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByPriceReduceMinPrice(double priceReduceMinPrice) throws Exception {
        List discountInfos = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldDiscountInfos = dao.findByPriceReduceMinPrice(priceReduceMinPrice);

        if (oldDiscountInfos != null) {
            Iterator it = oldDiscountInfos.iterator();
            while (it.hasNext())
                DiscountInfoTestHelper.delete((DiscountInfo) it.next());
        }

        // Create instances of random count, set their priceReduceMinPrice value to priceReduceMinPrice
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            DiscountInfo discountInfo = DiscountInfoTestHelper.newInstance(null, null, "", 0, false);
            discountInfo.setPriceReduceMinPrice(priceReduceMinPrice);
            deleteBeforeSave(discountInfo);
            dao.commitTransaction();
            discountInfos.add(i, discountInfo);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return discountInfos;
    }

    /**
     * Perform <tt>FindByPriceReduceMinPrice</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByPriceReduceMinPrice(double priceReduceMinPrice) {
        return dao.findByPriceReduceMinPrice(priceReduceMinPrice);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByPriceReduceMinPricet</tt>.
     *
     * @param discountInfos inserted instance list
     * @param resultFound   result instance list
     * @throws Exception
     */
    private void afterFindByPriceReduceMinPrice(List discountInfos, List resultFound) {
        if (discountInfos != null && discountInfos.size() > 0) {
            assertNotNull("Result returned by find-by-priceReduceMinPrice is null.", resultFound);
            assertEquals("Result count returned by find-by-priceReduceMinPrice is incorrect.", discountInfos.size(), resultFound.size());

            Iterator it = discountInfos.iterator();
            while (it.hasNext()) {
                DiscountInfo discountInfo = (DiscountInfo) it.next();
                DiscountInfo another = DiscountInfoTestHelper.getDiscountInfoByPk(resultFound, discountInfo.getDiscountInfoPK());
                assertEquals("Result returned by find-by-priceReduceMinPrice does not equal to inserted discountInfo object.", discountInfo, another);
                DiscountInfoTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByPriceReduceAmount</tt> test preparation. Delete <Code>DiscountInfo</Code>
     * instances whose property priceReduceAmount's value is priceReduceAmount from persistent store. Then Create
     * multiple <Code>DiscountInfo</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByPriceReduceAmount(double priceReduceAmount) throws Exception {
        List discountInfos = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldDiscountInfos = dao.findByPriceReduceAmount(priceReduceAmount);

        if (oldDiscountInfos != null) {
            Iterator it = oldDiscountInfos.iterator();
            while (it.hasNext())
                DiscountInfoTestHelper.delete((DiscountInfo) it.next());
        }

        // Create instances of random count, set their priceReduceAmount value to priceReduceAmount
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            DiscountInfo discountInfo = DiscountInfoTestHelper.newInstance(null, null, "", 0, false);
            discountInfo.setPriceReduceAmount(priceReduceAmount);
            deleteBeforeSave(discountInfo);
            dao.commitTransaction();
            discountInfos.add(i, discountInfo);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return discountInfos;
    }

    /**
     * Perform <tt>FindByPriceReduceAmount</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByPriceReduceAmount(double priceReduceAmount) {
        return dao.findByPriceReduceAmount(priceReduceAmount);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByPriceReduceAmountt</tt>.
     *
     * @param discountInfos inserted instance list
     * @param resultFound   result instance list
     * @throws Exception
     */
    private void afterFindByPriceReduceAmount(List discountInfos, List resultFound) {
        if (discountInfos != null && discountInfos.size() > 0) {
            assertNotNull("Result returned by find-by-priceReduceAmount is null.", resultFound);
            assertEquals("Result count returned by find-by-priceReduceAmount is incorrect.", discountInfos.size(), resultFound.size());

            Iterator it = discountInfos.iterator();
            while (it.hasNext()) {
                DiscountInfo discountInfo = (DiscountInfo) it.next();
                DiscountInfo another = DiscountInfoTestHelper.getDiscountInfoByPk(resultFound, discountInfo.getDiscountInfoPK());
                assertEquals("Result returned by find-by-priceReduceAmount does not equal to inserted discountInfo object.", discountInfo, another);
                DiscountInfoTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByDiscountMinPrice</tt> test preparation. Delete <Code>DiscountInfo</Code>
     * instances whose property discountMinPrice's value is discountMinPrice from persistent store. Then Create
     * multiple <Code>DiscountInfo</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByDiscountMinPrice(double discountMinPrice) throws Exception {
        List discountInfos = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldDiscountInfos = dao.findByDiscountMinPrice(discountMinPrice);

        if (oldDiscountInfos != null) {
            Iterator it = oldDiscountInfos.iterator();
            while (it.hasNext())
                DiscountInfoTestHelper.delete((DiscountInfo) it.next());
        }

        // Create instances of random count, set their discountMinPrice value to discountMinPrice
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            DiscountInfo discountInfo = DiscountInfoTestHelper.newInstance(null, null, "", 0, false);
            discountInfo.setDiscountMinPrice(discountMinPrice);
            deleteBeforeSave(discountInfo);
            dao.commitTransaction();
            discountInfos.add(i, discountInfo);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return discountInfos;
    }

    /**
     * Perform <tt>FindByDiscountMinPrice</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByDiscountMinPrice(double discountMinPrice) {
        return dao.findByDiscountMinPrice(discountMinPrice);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByDiscountMinPricet</tt>.
     *
     * @param discountInfos inserted instance list
     * @param resultFound   result instance list
     * @throws Exception
     */
    private void afterFindByDiscountMinPrice(List discountInfos, List resultFound) {
        if (discountInfos != null && discountInfos.size() > 0) {
            assertNotNull("Result returned by find-by-discountMinPrice is null.", resultFound);
            assertEquals("Result count returned by find-by-discountMinPrice is incorrect.", discountInfos.size(), resultFound.size());

            Iterator it = discountInfos.iterator();
            while (it.hasNext()) {
                DiscountInfo discountInfo = (DiscountInfo) it.next();
                DiscountInfo another = DiscountInfoTestHelper.getDiscountInfoByPk(resultFound, discountInfo.getDiscountInfoPK());
                assertEquals("Result returned by find-by-discountMinPrice does not equal to inserted discountInfo object.", discountInfo, another);
                DiscountInfoTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByDiscountRatio</tt> test preparation. Delete <Code>DiscountInfo</Code>
     * instances whose property discountRatio's value is discountRatio from persistent store. Then Create
     * multiple <Code>DiscountInfo</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByDiscountRatio(double discountRatio) throws Exception {
        List discountInfos = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldDiscountInfos = dao.findByDiscountRatio(discountRatio);

        if (oldDiscountInfos != null) {
            Iterator it = oldDiscountInfos.iterator();
            while (it.hasNext())
                DiscountInfoTestHelper.delete((DiscountInfo) it.next());
        }

        // Create instances of random count, set their discountRatio value to discountRatio
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            DiscountInfo discountInfo = DiscountInfoTestHelper.newInstance(null, null, "", 0, false);
            discountInfo.setDiscountRatio(discountRatio);
            deleteBeforeSave(discountInfo);
            dao.commitTransaction();
            discountInfos.add(i, discountInfo);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return discountInfos;
    }

    /**
     * Perform <tt>FindByDiscountRatio</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByDiscountRatio(double discountRatio) {
        return dao.findByDiscountRatio(discountRatio);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByDiscountRatiot</tt>.
     *
     * @param discountInfos inserted instance list
     * @param resultFound   result instance list
     * @throws Exception
     */
    private void afterFindByDiscountRatio(List discountInfos, List resultFound) {
        if (discountInfos != null && discountInfos.size() > 0) {
            assertNotNull("Result returned by find-by-discountRatio is null.", resultFound);
            assertEquals("Result count returned by find-by-discountRatio is incorrect.", discountInfos.size(), resultFound.size());

            Iterator it = discountInfos.iterator();
            while (it.hasNext()) {
                DiscountInfo discountInfo = (DiscountInfo) it.next();
                DiscountInfo another = DiscountInfoTestHelper.getDiscountInfoByPk(resultFound, discountInfo.getDiscountInfoPK());
                assertEquals("Result returned by find-by-discountRatio does not equal to inserted discountInfo object.", discountInfo, another);
                DiscountInfoTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>getDiscountInfoList</tt> test preparation.  First delete any <Code>DiscountInfo</Code>
     * instance from persistent store if exists. Then create multiple <Code>DiscountInfo</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetDiscountInfoList() throws Exception {
        List discountInfos = new ArrayList();
        dao.setAutoCommit(false);

        List oldDiscountInfos = dao.getDiscountInfoList();

        if (oldDiscountInfos != null) {
            Iterator it = oldDiscountInfos.iterator();
            while (it.hasNext())
                DiscountInfoTestHelper.delete((DiscountInfo) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            DiscountInfo discountInfo = prepare();
            dao.update(discountInfo);
            dao.commitTransaction();
            discountInfos.add(i, discountInfo);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return discountInfos;
    }

    /**
     * Perform <tt>getDiscountInfoList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetDiscountInfoList() throws Exception {
        return dao.getDiscountInfoList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getDiscountInfoList</tt>.
     *
     * @param discountInfos inserted instance list
     * @param resultFound   result instance list
     * @throws Exception
     */
    private void afterGetDiscountInfoList(List discountInfos, List resultFound) {
        if (discountInfos != null && discountInfos.size() > 0) {
            assertNotNull("Result returned by get-discountInfo-list is null.", resultFound);
            assertEquals("Result count returned by get-discountInfo-list is incorrect.", discountInfos.size(), resultFound.size());

            Iterator it = discountInfos.iterator();
            while (it.hasNext()) {
                DiscountInfo discountInfo = (DiscountInfo) it.next();
                DiscountInfo another = DiscountInfoTestHelper.getDiscountInfoByPk(resultFound, discountInfo.getDiscountInfoPK());
                assertEquals("Result returned by get-discountInfo-list does not equal to inserted discountInfo object.", discountInfo, another);
                DiscountInfoTestHelper.delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>DiscountInfo</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>DiscountInfo</Code> instance
     * @throws Exception
     */
    private DiscountInfo prepare() {
        DiscountInfo discountInfo = DiscountInfoTestHelper.newInstance(null, null, "", 0, false);
        return deleteBeforeSave(discountInfo);
    }

    /**
     * For a new <Code>DiscountInfo</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param discountInfo
     * @return newly created and saved <Code>DiscountInfo</Code> instance
     * @throws Exception
     */
    private DiscountInfo deleteBeforeSave(DiscountInfo discountInfo) {
        // Delete instance from data store if already exists
        DiscountInfo old = dao.load(discountInfo.getDiscountInfoPK());
        if (old != null)
            DiscountInfoTestHelper.delete(old);
        DiscountInfoTestHelper.save(discountInfo);
        return discountInfo;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getDiscountInfoDao();
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
     * @return test suite containing test class <Code>DiscountInfoTest</Code>
     */
    public static Test suite() {
        return new TestSuite(DiscountInfoTest.class);
    }
}