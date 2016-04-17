/***********************************************************************
 * Module:  CommodityTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class Commodity's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.CommodityDao;
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
 * Test case class to test Commodity's persistence
 */
@SuppressWarnings("ALL")
public class CommodityTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    CommodityDao dao;

    private Log logger = LogFactory.getLog(CommodityTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public CommodityTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>Commodity</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        Commodity commodity = null;
        // Create new instance, delete instance if exists in database
        commodity = preInsert();
        // Perform insert
        doInsert(commodity);
        // Do assert
        afterInsert(commodity);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>Commodity</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        Commodity commodity = null;
        // Create and insert new instance
        commodity = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(commodity);
        // Do assert
        afterUpdate(commodity);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>Commodity</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        Commodity commodity = null;
        // Insert new Commodity instance
        commodity = preDelete();
        // Perform delete
        doDelete(commodity);
        // Do assert
        afterDelete(commodity);
        logger.debug("Test delete ends!");
    }


    /**
     * Test query function </tt>findByCommodityName</tt>. First create multiple
     * <Code>Commodity</Code> instances and save them by <tt>preFindByCommodityName</tt>.
     * Then delegate the query operation to method <tt>doFindByCommodityName</tt>.
     * In the end do some asserts in <tt>afterFindByCommodityName</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByCommodityName() throws Exception {

        logger.debug("Test find-by-commodityName begins!");
        java.lang.String commodityName = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List commoditys = new ArrayList();
        // Create and insert commodityName instances
        commoditys = preFindByCommodityName(commodityName);
        // Perform query
        List result = doFindByCommodityName(commodityName);
        // Do asserts
        afterFindByCommodityName(commoditys, result);
        logger.debug("Test find-by-commodityName ends!");

    }

    /**
     * Test query function </tt>findBySmallPhotoUrl</tt>. First create multiple
     * <Code>Commodity</Code> instances and save them by <tt>preFindBySmallPhotoUrl</tt>.
     * Then delegate the query operation to method <tt>doFindBySmallPhotoUrl</tt>.
     * In the end do some asserts in <tt>afterFindBySmallPhotoUrl</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindBySmallPhotoUrl() throws Exception {

        logger.debug("Test find-by-smallPhotoUrl begins!");
        java.lang.String smallPhotoUrl = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List commoditys = new ArrayList();
        // Create and insert smallPhotoUrl instances
        commoditys = preFindBySmallPhotoUrl(smallPhotoUrl);
        // Perform query
        List result = doFindBySmallPhotoUrl(smallPhotoUrl);
        // Do asserts
        afterFindBySmallPhotoUrl(commoditys, result);
        logger.debug("Test find-by-smallPhotoUrl ends!");

    }

    /**
     * Test query function </tt>findByShortDescription</tt>. First create multiple
     * <Code>Commodity</Code> instances and save them by <tt>preFindByShortDescription</tt>.
     * Then delegate the query operation to method <tt>doFindByShortDescription</tt>.
     * In the end do some asserts in <tt>afterFindByShortDescription</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByShortDescription() throws Exception {

        logger.debug("Test find-by-shortDescription begins!");
        java.lang.String shortDescription = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List commoditys = new ArrayList();
        // Create and insert shortDescription instances
        commoditys = preFindByShortDescription(shortDescription);
        // Perform query
        List result = doFindByShortDescription(shortDescription);
        // Do asserts
        afterFindByShortDescription(commoditys, result);
        logger.debug("Test find-by-shortDescription ends!");

    }

    /**
     * Test query function </tt>findByPrice</tt>. First create multiple
     * <Code>Commodity</Code> instances and save them by <tt>preFindByPrice</tt>.
     * Then delegate the query operation to method <tt>doFindByPrice</tt>.
     * In the end do some asserts in <tt>afterFindByPrice</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByPrice() throws Exception {

        logger.debug("Test find-by-price begins!");
        double price = CommodityTestHelper.getRandomPrice();
        List commoditys = new ArrayList();
        // Create and insert price instances
        commoditys = preFindByPrice(price);
        // Perform query
        List result = doFindByPrice(price);
        // Do asserts
        afterFindByPrice(commoditys, result);
        logger.debug("Test find-by-price ends!");

    }

    /**
     * Test query function </tt>findBySalesVolume</tt>. First create multiple
     * <Code>Commodity</Code> instances and save them by <tt>preFindBySalesVolume</tt>.
     * Then delegate the query operation to method <tt>doFindBySalesVolume</tt>.
     * In the end do some asserts in <tt>afterFindBySalesVolume</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindBySalesVolume() throws Exception {

        logger.debug("Test find-by-salesVolume begins!");
        int salesVolume = random.nextInt();
        List commoditys = new ArrayList();
        // Create and insert salesVolume instances
        commoditys = preFindBySalesVolume(salesVolume);
        // Perform query
        List result = doFindBySalesVolume(salesVolume);
        // Do asserts
        afterFindBySalesVolume(commoditys, result);
        logger.debug("Test find-by-salesVolume ends!");

    }

    /**
     * Test query function </tt>findByExemptionFromPostage</tt>. First create multiple
     * <Code>Commodity</Code> instances and save them by <tt>preFindByExemptionFromPostage</tt>.
     * Then delegate the query operation to method <tt>doFindByExemptionFromPostage</tt>.
     * In the end do some asserts in <tt>afterFindByExemptionFromPostage</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByExemptionFromPostage() throws Exception {

        logger.debug("Test find-by-exemptionFromPostage begins!");
        boolean exemptionFromPostage = random.nextBoolean();
        List commoditys = new ArrayList();
        // Create and insert exemptionFromPostage instances
        commoditys = preFindByExemptionFromPostage(exemptionFromPostage);
        // Perform query
        List result = doFindByExemptionFromPostage(exemptionFromPostage);
        // Do asserts
        afterFindByExemptionFromPostage(commoditys, result);
        logger.debug("Test find-by-exemptionFromPostage ends!");

    }

    /**
     * Test query function </tt>findByAddedTime</tt>. First create multiple
     * <Code>Commodity</Code> instances and save them by <tt>preFindByAddedTime</tt>.
     * Then delegate the query operation to method <tt>doFindByAddedTime</tt>.
     * In the end do some asserts in <tt>afterFindByAddedTime</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByAddedTime() throws Exception {

        logger.debug("Test find-by-addedTime begins!");
        java.util.Date addedTime = com.centuryOldShop.server.Util.getRandomDate();
        List commoditys = new ArrayList();
        // Create and insert addedTime instances
        commoditys = preFindByAddedTime(addedTime);
        // Perform query
        List result = doFindByAddedTime(addedTime);
        // Do asserts
        afterFindByAddedTime(commoditys, result);
        logger.debug("Test find-by-addedTime ends!");

    }

    /**
     * Test query function </tt>findByPhoneTopBigPhotoUrl</tt>. First create multiple
     * <Code>Commodity</Code> instances and save them by <tt>preFindByPhoneTopBigPhotoUrl</tt>.
     * Then delegate the query operation to method <tt>doFindByPhoneTopBigPhotoUrl</tt>.
     * In the end do some asserts in <tt>afterFindByPhoneTopBigPhotoUrl</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByPhoneTopBigPhotoUrl() throws Exception {

        logger.debug("Test find-by-phoneTopBigPhotoUrl begins!");
        java.lang.String phoneTopBigPhotoUrl = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List commoditys = new ArrayList();
        // Create and insert phoneTopBigPhotoUrl instances
        commoditys = preFindByPhoneTopBigPhotoUrl(phoneTopBigPhotoUrl);
        // Perform query
        List result = doFindByPhoneTopBigPhotoUrl(phoneTopBigPhotoUrl);
        // Do asserts
        afterFindByPhoneTopBigPhotoUrl(commoditys, result);
        logger.debug("Test find-by-phoneTopBigPhotoUrl ends!");

    }

    /**
     * Test query function </tt>findByOffShelf</tt>. First create multiple
     * <Code>Commodity</Code> instances and save them by <tt>preFindByOffShelf</tt>.
     * Then delegate the query operation to method <tt>doFindByOffShelf</tt>.
     * In the end do some asserts in <tt>afterFindByOffShelf</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByOffShelf() throws Exception {

        logger.debug("Test find-by-offShelf begins!");
        boolean offShelf = random.nextBoolean();
        List commoditys = new ArrayList();
        // Create and insert offShelf instances
        commoditys = preFindByOffShelf(offShelf);
        // Perform query
        List result = doFindByOffShelf(offShelf);
        // Do asserts
        afterFindByOffShelf(commoditys, result);
        logger.debug("Test find-by-offShelf ends!");

    }

    /**
     * Test query function </tt>findByRemainingQuantity</tt>. First create multiple
     * <Code>Commodity</Code> instances and save them by <tt>preFindByRemainingQuantity</tt>.
     * Then delegate the query operation to method <tt>doFindByRemainingQuantity</tt>.
     * In the end do some asserts in <tt>afterFindByRemainingQuantity</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByRemainingQuantity() throws Exception {

        logger.debug("Test find-by-remainingQuantity begins!");
        int remainingQuantity = random.nextInt();
        List commoditys = new ArrayList();
        // Create and insert remainingQuantity instances
        commoditys = preFindByRemainingQuantity(remainingQuantity);
        // Perform query
        List result = doFindByRemainingQuantity(remainingQuantity);
        // Do asserts
        afterFindByRemainingQuantity(commoditys, result);
        logger.debug("Test find-by-remainingQuantity ends!");

    }

    /**
     * Test function getCommodityList. First create multiple <Code>Commodity</Code>
     * instances and save them by <tt>preGetCommodityList</tt>. Then delegate the
     * find all operation to method <tt>doGetCommodityList</tt>. In the end do asserts
     * in <tt>afterGetCommodityList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetCommodityList() throws Exception {
        logger.debug("Test get-commodity-list begins!");

        List commoditys = new ArrayList();
        // Insert Commodity instance
        commoditys = preGetCommodityList();
        // Perform query
        List result = doGetCommodityList();
        // Make assertion
        afterGetCommodityList(commoditys, result);
        logger.debug("Test get-commodity-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>Commodity</Code> instance
     * @throws Exception
     */
    private Commodity preInsert() throws Exception {
        Commodity commodity = CommodityTestHelper.newInstance(null, null, "", 0, false);
        Commodity old = dao.load(commodity.getCommodityPK());
        if (old != null)
            CommodityTestHelper.delete(old);
        return commodity;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param commodity instance to insert
     * @throws Exception
     */
    private void doInsert(Commodity commodity) {
        CommodityTestHelper.save(commodity);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param commodity inserted instance
     * @throws Exception
     */
    private void afterInsert(Commodity commodity) {
        Commodity anotherCommodity = dao.load(commodity.getCommodityPK());
        assertEquals("Queried result does not equal to inserted instance",
                commodity, anotherCommodity);
        CommodityTestHelper.delete(anotherCommodity);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>Commodity</Code> instance
     * @throws Exception
     * @see CommodityTest#prepare()
     */
    private Commodity preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param commodity object to update
     * @throws Exception
     */
    private void doUpdate(Commodity commodity) throws Exception {
        CommodityTestHelper.modifyObject(commodity);
        dao.update(commodity);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param commodity object to update
     * @throws Exception
     */
    private void afterUpdate(Commodity commodity) throws Exception {
        Commodity another = dao.load(commodity.getCommodityPK());
        assertEquals("Queried result does not equal to updated instance", commodity, another);
        CommodityTestHelper.delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>Commodity</Code> instance
     * @throws Exception
     * @see CommodityTest#prepare()
     */
    private Commodity preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param commodity object to delete
     * @throws Exception
     */
    private void doDelete(Commodity commodity) throws Exception {
        CommodityTestHelper.delete(commodity);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param commodity deleted object
     * @throws Exception
     */
    private void afterDelete(Commodity commodity) throws Exception {
        Commodity another = dao.load(commodity.getCommodityPK());
        assertNull("Inserted instance is not deleted", another);
    }


    /**
     * Do function <tt>FindByCommodityName</tt> test preparation. Delete <Code>Commodity</Code>
     * instances whose property commodityName's value is commodityName from persistent store. Then Create
     * multiple <Code>Commodity</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByCommodityName(java.lang.String commodityName) throws Exception {
        List commoditys = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldCommoditys = dao.findByCommodityName(commodityName);

        if (oldCommoditys != null) {
            Iterator it = oldCommoditys.iterator();
            while (it.hasNext())
                CommodityTestHelper.delete((Commodity) it.next());
        }

        // Create instances of random count, set their commodityName value to commodityName
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Commodity commodity = CommodityTestHelper.newInstance(null, null, "", 0, false);
            commodity.setCommodityName(commodityName);
            deleteBeforeSave(commodity);
            dao.commitTransaction();
            commoditys.add(i, commodity);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return commoditys;
    }

    /**
     * Perform <tt>FindByCommodityName</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByCommodityName(java.lang.String commodityName) {
        return dao.findByCommodityName(commodityName);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByCommodityNamet</tt>.
     *
     * @param commoditys  inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByCommodityName(List commoditys, List resultFound) {
        if (commoditys != null && commoditys.size() > 0) {
            assertNotNull("Result returned by find-by-commodityName is null.", resultFound);
            assertEquals("Result count returned by find-by-commodityName is incorrect.", commoditys.size(), resultFound.size());

            Iterator it = commoditys.iterator();
            while (it.hasNext()) {
                Commodity commodity = (Commodity) it.next();
                Commodity another = CommodityTestHelper.getCommodityByPk(resultFound, commodity.getCommodityPK());
                assertEquals("Result returned by find-by-commodityName does not equal to inserted commodity object.", commodity, another);
                CommodityTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindBySmallPhotoUrl</tt> test preparation. Delete <Code>Commodity</Code>
     * instances whose property smallPhotoUrl's value is smallPhotoUrl from persistent store. Then Create
     * multiple <Code>Commodity</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindBySmallPhotoUrl(java.lang.String smallPhotoUrl) throws Exception {
        List commoditys = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldCommoditys = dao.findBySmallPhotoUrl(smallPhotoUrl);

        if (oldCommoditys != null) {
            Iterator it = oldCommoditys.iterator();
            while (it.hasNext())
                CommodityTestHelper.delete((Commodity) it.next());
        }

        // Create instances of random count, set their smallPhotoUrl value to smallPhotoUrl
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Commodity commodity = CommodityTestHelper.newInstance(null, null, "", 0, false);
            commodity.setSmallPhotoUrl(smallPhotoUrl);
            deleteBeforeSave(commodity);
            dao.commitTransaction();
            commoditys.add(i, commodity);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return commoditys;
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
     * @param commoditys  inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindBySmallPhotoUrl(List commoditys, List resultFound) {
        if (commoditys != null && commoditys.size() > 0) {
            assertNotNull("Result returned by find-by-smallPhotoUrl is null.", resultFound);
            assertEquals("Result count returned by find-by-smallPhotoUrl is incorrect.", commoditys.size(), resultFound.size());

            Iterator it = commoditys.iterator();
            while (it.hasNext()) {
                Commodity commodity = (Commodity) it.next();
                Commodity another = CommodityTestHelper.getCommodityByPk(resultFound, commodity.getCommodityPK());
                assertEquals("Result returned by find-by-smallPhotoUrl does not equal to inserted commodity object.", commodity, another);
                CommodityTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByShortDescription</tt> test preparation. Delete <Code>Commodity</Code>
     * instances whose property shortDescription's value is shortDescription from persistent store. Then Create
     * multiple <Code>Commodity</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByShortDescription(java.lang.String shortDescription) throws Exception {
        List commoditys = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldCommoditys = dao.findByShortDescription(shortDescription);

        if (oldCommoditys != null) {
            Iterator it = oldCommoditys.iterator();
            while (it.hasNext())
                CommodityTestHelper.delete((Commodity) it.next());
        }

        // Create instances of random count, set their shortDescription value to shortDescription
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Commodity commodity = CommodityTestHelper.newInstance(null, null, "", 0, false);
            commodity.setShortDescription(shortDescription);
            deleteBeforeSave(commodity);
            dao.commitTransaction();
            commoditys.add(i, commodity);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return commoditys;
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
     * @param commoditys  inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByShortDescription(List commoditys, List resultFound) {
        if (commoditys != null && commoditys.size() > 0) {
            assertNotNull("Result returned by find-by-shortDescription is null.", resultFound);
            assertEquals("Result count returned by find-by-shortDescription is incorrect.", commoditys.size(), resultFound.size());

            Iterator it = commoditys.iterator();
            while (it.hasNext()) {
                Commodity commodity = (Commodity) it.next();
                Commodity another = CommodityTestHelper.getCommodityByPk(resultFound, commodity.getCommodityPK());
                assertEquals("Result returned by find-by-shortDescription does not equal to inserted commodity object.", commodity, another);
                CommodityTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByPrice</tt> test preparation. Delete <Code>Commodity</Code>
     * instances whose property price's value is price from persistent store. Then Create
     * multiple <Code>Commodity</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByPrice(double price) throws Exception {
        List commoditys = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldCommoditys = dao.findByPrice(price);

        if (oldCommoditys != null) {
            Iterator it = oldCommoditys.iterator();
            while (it.hasNext())
                CommodityTestHelper.delete((Commodity) it.next());
        }

        // Create instances of random count, set their price value to price
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Commodity commodity = CommodityTestHelper.newInstance(null, null, "", 0, false);
            commodity.setPrice(price);
            deleteBeforeSave(commodity);
            dao.commitTransaction();
            commoditys.add(i, commodity);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return commoditys;
    }

    /**
     * Perform <tt>FindByPrice</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByPrice(double price) {
        return dao.findByPrice(price);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByPricet</tt>.
     *
     * @param commoditys  inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByPrice(List commoditys, List resultFound) {
        if (commoditys != null && commoditys.size() > 0) {
            assertNotNull("Result returned by find-by-price is null.", resultFound);
            assertEquals("Result count returned by find-by-price is incorrect.", commoditys.size(), resultFound.size());

            Iterator it = commoditys.iterator();
            while (it.hasNext()) {
                Commodity commodity = (Commodity) it.next();
                Commodity another = CommodityTestHelper.getCommodityByPk(resultFound, commodity.getCommodityPK());
                assertEquals("Result returned by find-by-price does not equal to inserted commodity object.", commodity, another);
                CommodityTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindBySalesVolume</tt> test preparation. Delete <Code>Commodity</Code>
     * instances whose property salesVolume's value is salesVolume from persistent store. Then Create
     * multiple <Code>Commodity</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindBySalesVolume(int salesVolume) throws Exception {
        List commoditys = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldCommoditys = dao.findBySalesVolume(salesVolume);

        if (oldCommoditys != null) {
            Iterator it = oldCommoditys.iterator();
            while (it.hasNext())
                CommodityTestHelper.delete((Commodity) it.next());
        }

        // Create instances of random count, set their salesVolume value to salesVolume
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Commodity commodity = CommodityTestHelper.newInstance(null, null, "", 0, false);
            commodity.setSalesVolume(salesVolume);
            deleteBeforeSave(commodity);
            dao.commitTransaction();
            commoditys.add(i, commodity);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return commoditys;
    }

    /**
     * Perform <tt>FindBySalesVolume</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindBySalesVolume(int salesVolume) {
        return dao.findBySalesVolume(salesVolume);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findBySalesVolumet</tt>.
     *
     * @param commoditys  inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindBySalesVolume(List commoditys, List resultFound) {
        if (commoditys != null && commoditys.size() > 0) {
            assertNotNull("Result returned by find-by-salesVolume is null.", resultFound);
            assertEquals("Result count returned by find-by-salesVolume is incorrect.", commoditys.size(), resultFound.size());

            Iterator it = commoditys.iterator();
            while (it.hasNext()) {
                Commodity commodity = (Commodity) it.next();
                Commodity another = CommodityTestHelper.getCommodityByPk(resultFound, commodity.getCommodityPK());
                assertEquals("Result returned by find-by-salesVolume does not equal to inserted commodity object.", commodity, another);
                CommodityTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByExemptionFromPostage</tt> test preparation. Delete <Code>Commodity</Code>
     * instances whose property exemptionFromPostage's value is exemptionFromPostage from persistent store. Then Create
     * multiple <Code>Commodity</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByExemptionFromPostage(boolean exemptionFromPostage) throws Exception {
        List commoditys = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldCommoditys = dao.findByExemptionFromPostage(exemptionFromPostage);

        if (oldCommoditys != null) {
            Iterator it = oldCommoditys.iterator();
            while (it.hasNext())
                CommodityTestHelper.delete((Commodity) it.next());
        }

        // Create instances of random count, set their exemptionFromPostage value to exemptionFromPostage
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Commodity commodity = CommodityTestHelper.newInstance(null, null, "", 0, false);
            commodity.setExemptionFromPostage(exemptionFromPostage);
            deleteBeforeSave(commodity);
            dao.commitTransaction();
            commoditys.add(i, commodity);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return commoditys;
    }

    /**
     * Perform <tt>FindByExemptionFromPostage</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByExemptionFromPostage(boolean exemptionFromPostage) {
        return dao.findByExemptionFromPostage(exemptionFromPostage);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByExemptionFromPostaget</tt>.
     *
     * @param commoditys  inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByExemptionFromPostage(List commoditys, List resultFound) {
        if (commoditys != null && commoditys.size() > 0) {
            assertNotNull("Result returned by find-by-exemptionFromPostage is null.", resultFound);
            assertEquals("Result count returned by find-by-exemptionFromPostage is incorrect.", commoditys.size(), resultFound.size());

            Iterator it = commoditys.iterator();
            while (it.hasNext()) {
                Commodity commodity = (Commodity) it.next();
                Commodity another = CommodityTestHelper.getCommodityByPk(resultFound, commodity.getCommodityPK());
                assertEquals("Result returned by find-by-exemptionFromPostage does not equal to inserted commodity object.", commodity, another);
                CommodityTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByAddedTime</tt> test preparation. Delete <Code>Commodity</Code>
     * instances whose property addedTime's value is addedTime from persistent store. Then Create
     * multiple <Code>Commodity</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByAddedTime(java.util.Date addedTime) throws Exception {
        List commoditys = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldCommoditys = dao.findByAddedTime(addedTime);

        if (oldCommoditys != null) {
            Iterator it = oldCommoditys.iterator();
            while (it.hasNext())
                CommodityTestHelper.delete((Commodity) it.next());
        }

        // Create instances of random count, set their addedTime value to addedTime
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Commodity commodity = CommodityTestHelper.newInstance(null, null, "", 0, false);
            commodity.setAddedTime(addedTime);
            deleteBeforeSave(commodity);
            dao.commitTransaction();
            commoditys.add(i, commodity);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return commoditys;
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
     * @param commoditys  inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByAddedTime(List commoditys, List resultFound) {
        if (commoditys != null && commoditys.size() > 0) {
            assertNotNull("Result returned by find-by-addedTime is null.", resultFound);
            assertEquals("Result count returned by find-by-addedTime is incorrect.", commoditys.size(), resultFound.size());

            Iterator it = commoditys.iterator();
            while (it.hasNext()) {
                Commodity commodity = (Commodity) it.next();
                Commodity another = CommodityTestHelper.getCommodityByPk(resultFound, commodity.getCommodityPK());
                assertEquals("Result returned by find-by-addedTime does not equal to inserted commodity object.", commodity, another);
                CommodityTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByPhoneTopBigPhotoUrl</tt> test preparation. Delete <Code>Commodity</Code>
     * instances whose property phoneTopBigPhotoUrl's value is phoneTopBigPhotoUrl from persistent store. Then Create
     * multiple <Code>Commodity</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByPhoneTopBigPhotoUrl(java.lang.String phoneTopBigPhotoUrl) throws Exception {
        List commoditys = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldCommoditys = dao.findByPhoneTopBigPhotoUrl(phoneTopBigPhotoUrl);

        if (oldCommoditys != null) {
            Iterator it = oldCommoditys.iterator();
            while (it.hasNext())
                CommodityTestHelper.delete((Commodity) it.next());
        }

        // Create instances of random count, set their phoneTopBigPhotoUrl value to phoneTopBigPhotoUrl
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Commodity commodity = CommodityTestHelper.newInstance(null, null, "", 0, false);
            commodity.setPhoneTopBigPhotoUrl(phoneTopBigPhotoUrl);
            deleteBeforeSave(commodity);
            dao.commitTransaction();
            commoditys.add(i, commodity);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return commoditys;
    }

    /**
     * Perform <tt>FindByPhoneTopBigPhotoUrl</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByPhoneTopBigPhotoUrl(java.lang.String phoneTopBigPhotoUrl) {
        return dao.findByPhoneTopBigPhotoUrl(phoneTopBigPhotoUrl);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByPhoneTopBigPhotoUrlt</tt>.
     *
     * @param commoditys  inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByPhoneTopBigPhotoUrl(List commoditys, List resultFound) {
        if (commoditys != null && commoditys.size() > 0) {
            assertNotNull("Result returned by find-by-phoneTopBigPhotoUrl is null.", resultFound);
            assertEquals("Result count returned by find-by-phoneTopBigPhotoUrl is incorrect.", commoditys.size(), resultFound.size());

            Iterator it = commoditys.iterator();
            while (it.hasNext()) {
                Commodity commodity = (Commodity) it.next();
                Commodity another = CommodityTestHelper.getCommodityByPk(resultFound, commodity.getCommodityPK());
                assertEquals("Result returned by find-by-phoneTopBigPhotoUrl does not equal to inserted commodity object.", commodity, another);
                CommodityTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByOffShelf</tt> test preparation. Delete <Code>Commodity</Code>
     * instances whose property offShelf's value is offShelf from persistent store. Then Create
     * multiple <Code>Commodity</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByOffShelf(boolean offShelf) throws Exception {
        List commoditys = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldCommoditys = dao.findByOffShelf(offShelf);

        if (oldCommoditys != null) {
            Iterator it = oldCommoditys.iterator();
            while (it.hasNext())
                CommodityTestHelper.delete((Commodity) it.next());
        }

        // Create instances of random count, set their offShelf value to offShelf
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Commodity commodity = CommodityTestHelper.newInstance(null, null, "", 0, false);
            commodity.setOffShelf(offShelf);
            deleteBeforeSave(commodity);
            dao.commitTransaction();
            commoditys.add(i, commodity);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return commoditys;
    }

    /**
     * Perform <tt>FindByOffShelf</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByOffShelf(boolean offShelf) {
        return dao.findByOffShelf(offShelf);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByOffShelft</tt>.
     *
     * @param commoditys  inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByOffShelf(List commoditys, List resultFound) {
        if (commoditys != null && commoditys.size() > 0) {
            assertNotNull("Result returned by find-by-offShelf is null.", resultFound);
            assertEquals("Result count returned by find-by-offShelf is incorrect.", commoditys.size(), resultFound.size());

            Iterator it = commoditys.iterator();
            while (it.hasNext()) {
                Commodity commodity = (Commodity) it.next();
                Commodity another = CommodityTestHelper.getCommodityByPk(resultFound, commodity.getCommodityPK());
                assertEquals("Result returned by find-by-offShelf does not equal to inserted commodity object.", commodity, another);
                CommodityTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByRemainingQuantity</tt> test preparation. Delete <Code>Commodity</Code>
     * instances whose property remainingQuantity's value is remainingQuantity from persistent store. Then Create
     * multiple <Code>Commodity</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByRemainingQuantity(int remainingQuantity) throws Exception {
        List commoditys = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldCommoditys = dao.findByRemainingQuantity(remainingQuantity);

        if (oldCommoditys != null) {
            Iterator it = oldCommoditys.iterator();
            while (it.hasNext())
                CommodityTestHelper.delete((Commodity) it.next());
        }

        // Create instances of random count, set their remainingQuantity value to remainingQuantity
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Commodity commodity = CommodityTestHelper.newInstance(null, null, "", 0, false);
            commodity.setRemainingQuantity(remainingQuantity);
            deleteBeforeSave(commodity);
            dao.commitTransaction();
            commoditys.add(i, commodity);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return commoditys;
    }

    /**
     * Perform <tt>FindByRemainingQuantity</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByRemainingQuantity(int remainingQuantity) {
        return dao.findByRemainingQuantity(remainingQuantity);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByRemainingQuantityt</tt>.
     *
     * @param commoditys  inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByRemainingQuantity(List commoditys, List resultFound) {
        if (commoditys != null && commoditys.size() > 0) {
            assertNotNull("Result returned by find-by-remainingQuantity is null.", resultFound);
            assertEquals("Result count returned by find-by-remainingQuantity is incorrect.", commoditys.size(), resultFound.size());

            Iterator it = commoditys.iterator();
            while (it.hasNext()) {
                Commodity commodity = (Commodity) it.next();
                Commodity another = CommodityTestHelper.getCommodityByPk(resultFound, commodity.getCommodityPK());
                assertEquals("Result returned by find-by-remainingQuantity does not equal to inserted commodity object.", commodity, another);
                CommodityTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>getCommodityList</tt> test preparation.  First delete any <Code>Commodity</Code>
     * instance from persistent store if exists. Then create multiple <Code>Commodity</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetCommodityList() throws Exception {
        List commoditys = new ArrayList();
        dao.setAutoCommit(false);

        List oldCommoditys = dao.getCommodityList();

        if (oldCommoditys != null) {
            Iterator it = oldCommoditys.iterator();
            while (it.hasNext())
                CommodityTestHelper.delete((Commodity) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            Commodity commodity = prepare();
            dao.update(commodity);
            dao.commitTransaction();
            commoditys.add(i, commodity);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return commoditys;
    }

    /**
     * Perform <tt>getCommodityList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetCommodityList() throws Exception {
        return dao.getCommodityList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getCommodityList</tt>.
     *
     * @param commoditys  inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterGetCommodityList(List commoditys, List resultFound) {
        if (commoditys != null && commoditys.size() > 0) {
            assertNotNull("Result returned by get-commodity-list is null.", resultFound);
            assertEquals("Result count returned by get-commodity-list is incorrect.", commoditys.size(), resultFound.size());

            Iterator it = commoditys.iterator();
            while (it.hasNext()) {
                Commodity commodity = (Commodity) it.next();
                Commodity another = CommodityTestHelper.getCommodityByPk(resultFound, commodity.getCommodityPK());
                assertEquals("Result returned by get-commodity-list does not equal to inserted commodity object.", commodity, another);
                CommodityTestHelper.delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>Commodity</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>Commodity</Code> instance
     * @throws Exception
     */
    private Commodity prepare() {
        Commodity commodity = CommodityTestHelper.newInstance(null, null, "", 0, false);
        return deleteBeforeSave(commodity);
    }

    /**
     * For a new <Code>Commodity</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param commodity
     * @return newly created and saved <Code>Commodity</Code> instance
     * @throws Exception
     */
    private Commodity deleteBeforeSave(Commodity commodity) {
        // Delete instance from data store if already exists
        Commodity old = dao.load(commodity.getCommodityPK());
        if (old != null)
            CommodityTestHelper.delete(old);
        CommodityTestHelper.save(commodity);
        return commodity;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getCommodityDao();
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
     * @return test suite containing test class <Code>CommodityTest</Code>
     */
    public static Test suite() {
        return new TestSuite(CommodityTest.class);
    }
}