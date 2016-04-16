/***********************************************************************
 * Module:  ShopTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class Shop's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.ShopDao;
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
 * Test case class to test Shop's persistence
 */
@SuppressWarnings("ALL")
public class ShopTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    ShopDao dao;

    private Log logger = LogFactory.getLog(ShopTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public ShopTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>Shop</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        Shop shop = null;
        // Create new instance, delete instance if exists in database
        shop = preInsert();
        // Perform insert
        doInsert(shop);
        // Do assert
        afterInsert(shop);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>Shop</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        Shop shop = null;
        // Create and insert new instance
        shop = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(shop);
        // Do assert
        afterUpdate(shop);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>Shop</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        Shop shop = null;
        // Insert new Shop instance
        shop = preDelete();
        // Perform delete
        doDelete(shop);
        // Do assert
        afterDelete(shop);
        logger.debug("Test delete ends!");
    }


    /**
     * Test query function </tt>findByShopName</tt>. First create multiple
     * <Code>Shop</Code> instances and save them by <tt>preFindByShopName</tt>.
     * Then delegate the query operation to method <tt>doFindByShopName</tt>.
     * In the end do some asserts in <tt>afterFindByShopName</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByShopName() throws Exception {

        logger.debug("Test find-by-shopName begins!");
        java.lang.String shopName = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List shops = new ArrayList();
        // Create and insert shopName instances
        shops = preFindByShopName(shopName);
        // Perform query
        List result = doFindByShopName(shopName);
        // Do asserts
        afterFindByShopName(shops, result);
        logger.debug("Test find-by-shopName ends!");

    }

    /**
     * Test query function </tt>findByShortDescription</tt>. First create multiple
     * <Code>Shop</Code> instances and save them by <tt>preFindByShortDescription</tt>.
     * Then delegate the query operation to method <tt>doFindByShortDescription</tt>.
     * In the end do some asserts in <tt>afterFindByShortDescription</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByShortDescription() throws Exception {

        logger.debug("Test find-by-shortDescription begins!");
        java.lang.String shortDescription = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List shops = new ArrayList();
        // Create and insert shortDescription instances
        shops = preFindByShortDescription(shortDescription);
        // Perform query
        List result = doFindByShortDescription(shortDescription);
        // Do asserts
        afterFindByShortDescription(shops, result);
        logger.debug("Test find-by-shortDescription ends!");

    }

    /**
     * Test query function </tt>findByOpenABusinessTime</tt>. First create multiple
     * <Code>Shop</Code> instances and save them by <tt>preFindByOpenABusinessTime</tt>.
     * Then delegate the query operation to method <tt>doFindByOpenABusinessTime</tt>.
     * In the end do some asserts in <tt>afterFindByOpenABusinessTime</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByOpenABusinessTime() throws Exception {

        logger.debug("Test find-by-openABusinessTime begins!");
        java.util.Date openABusinessTime = new java.util.Date(random.nextInt(10000));
        List shops = new ArrayList();
        // Create and insert openABusinessTime instances
        shops = preFindByOpenABusinessTime(openABusinessTime);
        // Perform query
        List result = doFindByOpenABusinessTime(openABusinessTime);
        // Do asserts
        afterFindByOpenABusinessTime(shops, result);
        logger.debug("Test find-by-openABusinessTime ends!");

    }

    /**
     * Test query function </tt>findByVisitCount</tt>. First create multiple
     * <Code>Shop</Code> instances and save them by <tt>preFindByVisitCount</tt>.
     * Then delegate the query operation to method <tt>doFindByVisitCount</tt>.
     * In the end do some asserts in <tt>afterFindByVisitCount</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByVisitCount() throws Exception {

        logger.debug("Test find-by-visitCount begins!");
        int visitCount = random.nextInt();
        List shops = new ArrayList();
        // Create and insert visitCount instances
        shops = preFindByVisitCount(visitCount);
        // Perform query
        List result = doFindByVisitCount(visitCount);
        // Do asserts
        afterFindByVisitCount(shops, result);
        logger.debug("Test find-by-visitCount ends!");

    }

    /**
     * Test query function </tt>findByDetailedAddress</tt>. First create multiple
     * <Code>Shop</Code> instances and save them by <tt>preFindByDetailedAddress</tt>.
     * Then delegate the query operation to method <tt>doFindByDetailedAddress</tt>.
     * In the end do some asserts in <tt>afterFindByDetailedAddress</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByDetailedAddress() throws Exception {

        logger.debug("Test find-by-detailedAddress begins!");
        java.lang.String detailedAddress = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List shops = new ArrayList();
        // Create and insert detailedAddress instances
        shops = preFindByDetailedAddress(detailedAddress);
        // Perform query
        List result = doFindByDetailedAddress(detailedAddress);
        // Do asserts
        afterFindByDetailedAddress(shops, result);
        logger.debug("Test find-by-detailedAddress ends!");

    }

    /**
     * Test query function </tt>findByTrademark</tt>. First create multiple
     * <Code>Shop</Code> instances and save them by <tt>preFindByTrademark</tt>.
     * Then delegate the query operation to method <tt>doFindByTrademark</tt>.
     * In the end do some asserts in <tt>afterFindByTrademark</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByTrademark() throws Exception {

        logger.debug("Test find-by-trademark begins!");
        java.lang.String trademark = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List shops = new ArrayList();
        // Create and insert trademark instances
        shops = preFindByTrademark(trademark);
        // Perform query
        List result = doFindByTrademark(trademark);
        // Do asserts
        afterFindByTrademark(shops, result);
        logger.debug("Test find-by-trademark ends!");

    }

    /**
     * Test query function </tt>findByEnterTime</tt>. First create multiple
     * <Code>Shop</Code> instances and save them by <tt>preFindByEnterTime</tt>.
     * Then delegate the query operation to method <tt>doFindByEnterTime</tt>.
     * In the end do some asserts in <tt>afterFindByEnterTime</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByEnterTime() throws Exception {

        logger.debug("Test find-by-enterTime begins!");
        java.util.Date enterTime = new java.util.Date(random.nextInt(10000));
        List shops = new ArrayList();
        // Create and insert enterTime instances
        shops = preFindByEnterTime(enterTime);
        // Perform query
        List result = doFindByEnterTime(enterTime);
        // Do asserts
        afterFindByEnterTime(shops, result);
        logger.debug("Test find-by-enterTime ends!");

    }

    /**
     * Test query function </tt>findByPhoneNumber</tt>. First create multiple
     * <Code>Shop</Code> instances and save them by <tt>preFindByPhoneNumber</tt>.
     * Then delegate the query operation to method <tt>doFindByPhoneNumber</tt>.
     * In the end do some asserts in <tt>afterFindByPhoneNumber</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByPhoneNumber() throws Exception {

        logger.debug("Test find-by-phoneNumber begins!");
        java.lang.String phoneNumber = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List shops = new ArrayList();
        // Create and insert phoneNumber instances
        shops = preFindByPhoneNumber(phoneNumber);
        // Perform query
        List result = doFindByPhoneNumber(phoneNumber);
        // Do asserts
        afterFindByPhoneNumber(shops, result);
        logger.debug("Test find-by-phoneNumber ends!");

    }

    /**
     * Test query function </tt>findByFax</tt>. First create multiple
     * <Code>Shop</Code> instances and save them by <tt>preFindByFax</tt>.
     * Then delegate the query operation to method <tt>doFindByFax</tt>.
     * In the end do some asserts in <tt>afterFindByFax</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByFax() throws Exception {

        logger.debug("Test find-by-fax begins!");
        java.lang.String fax = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List shops = new ArrayList();
        // Create and insert fax instances
        shops = preFindByFax(fax);
        // Perform query
        List result = doFindByFax(fax);
        // Do asserts
        afterFindByFax(shops, result);
        logger.debug("Test find-by-fax ends!");

    }

    /**
     * Test query function </tt>findByLongDescription</tt>. First create multiple
     * <Code>Shop</Code> instances and save them by <tt>preFindByLongDescription</tt>.
     * Then delegate the query operation to method <tt>doFindByLongDescription</tt>.
     * In the end do some asserts in <tt>afterFindByLongDescription</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByLongDescription() throws Exception {

        logger.debug("Test find-by-longDescription begins!");
        java.lang.String longDescription = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List shops = new ArrayList();
        // Create and insert longDescription instances
        shops = preFindByLongDescription(longDescription);
        // Perform query
        List result = doFindByLongDescription(longDescription);
        // Do asserts
        afterFindByLongDescription(shops, result);
        logger.debug("Test find-by-longDescription ends!");

    }

    /**
     * Test function getShopList. First create multiple <Code>Shop</Code>
     * instances and save them by <tt>preGetShopList</tt>. Then delegate the
     * find all operation to method <tt>doGetShopList</tt>. In the end do asserts
     * in <tt>afterGetShopList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetShopList() throws Exception {
        logger.debug("Test get-shop-list begins!");

        List shops = new ArrayList();
        // Insert Shop instance
        shops = preGetShopList();
        // Perform query
        List result = doGetShopList();
        // Make assertion
        afterGetShopList(shops, result);
        logger.debug("Test get-shop-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>Shop</Code> instance
     * @throws Exception
     */
    private Shop preInsert() throws Exception {
        Shop shop = ShopTestHelper.newInstance(null, null, "", 0, false);
        Shop old = dao.load(shop.getShopPK());
        if (old != null)
            ShopTestHelper.delete(old);
        return shop;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param shop instance to insert
     * @throws Exception
     */
    private void doInsert(Shop shop) {
        ShopTestHelper.save(shop);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param shop inserted instance
     * @throws Exception
     */
    private void afterInsert(Shop shop) {
        Shop anotherShop = dao.load(shop.getShopPK());
        assertEquals("Queried result does not equal to inserted instance",
                shop, anotherShop);
        ShopTestHelper.delete(anotherShop);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>Shop</Code> instance
     * @throws Exception
     * @see ShopTest#prepare()
     */
    private Shop preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param shop object to update
     * @throws Exception
     */
    private void doUpdate(Shop shop) throws Exception {
        ShopTestHelper.modifyObject(shop);
        dao.update(shop);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param shop object to update
     * @throws Exception
     */
    private void afterUpdate(Shop shop) throws Exception {
        Shop another = dao.load(shop.getShopPK());
        assertEquals("Queried result does not equal to updated instance", shop, another);
        ShopTestHelper.delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>Shop</Code> instance
     * @throws Exception
     * @see ShopTest#prepare()
     */
    private Shop preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param shop object to delete
     * @throws Exception
     */
    private void doDelete(Shop shop) throws Exception {
        ShopTestHelper.delete(shop);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param shop deleted object
     * @throws Exception
     */
    private void afterDelete(Shop shop) throws Exception {
        Shop another = dao.load(shop.getShopPK());
        assertNull("Inserted instance is not deleted", another);
    }


    /**
     * Do function <tt>FindByShopName</tt> test preparation. Delete <Code>Shop</Code>
     * instances whose property shopName's value is shopName from persistent store. Then Create
     * multiple <Code>Shop</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByShopName(java.lang.String shopName) throws Exception {
        List shops = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShops = dao.findByShopName(shopName);

        if (oldShops != null) {
            Iterator it = oldShops.iterator();
            while (it.hasNext())
                ShopTestHelper.delete((Shop) it.next());
        }

        // Create instances of random count, set their shopName value to shopName
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Shop shop = ShopTestHelper.newInstance(null, null, "", 0, false);
            shop.setShopName(shopName);
            deleteBeforeSave(shop);
            dao.commitTransaction();
            shops.add(i, shop);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shops;
    }

    /**
     * Perform <tt>FindByShopName</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByShopName(java.lang.String shopName) {
        return dao.findByShopName(shopName);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByShopNamet</tt>.
     *
     * @param shops       inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByShopName(List shops, List resultFound) {
        if (shops != null && shops.size() > 0) {
            assertNotNull("Result returned by find-by-shopName is null.", resultFound);
            assertEquals("Result count returned by find-by-shopName is incorrect.", shops.size(), resultFound.size());

            Iterator it = shops.iterator();
            while (it.hasNext()) {
                Shop shop = (Shop) it.next();
                Shop another = ShopTestHelper.getShopByPk(resultFound, shop.getShopPK());
                assertEquals("Result returned by find-by-shopName does not equal to inserted shop object.", shop, another);
                ShopTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByShortDescription</tt> test preparation. Delete <Code>Shop</Code>
     * instances whose property shortDescription's value is shortDescription from persistent store. Then Create
     * multiple <Code>Shop</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByShortDescription(java.lang.String shortDescription) throws Exception {
        List shops = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShops = dao.findByShortDescription(shortDescription);

        if (oldShops != null) {
            Iterator it = oldShops.iterator();
            while (it.hasNext())
                ShopTestHelper.delete((Shop) it.next());
        }

        // Create instances of random count, set their shortDescription value to shortDescription
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Shop shop = ShopTestHelper.newInstance(null, null, "", 0, false);
            shop.setShortDescription(shortDescription);
            deleteBeforeSave(shop);
            dao.commitTransaction();
            shops.add(i, shop);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shops;
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
     * @param shops       inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByShortDescription(List shops, List resultFound) {
        if (shops != null && shops.size() > 0) {
            assertNotNull("Result returned by find-by-shortDescription is null.", resultFound);
            assertEquals("Result count returned by find-by-shortDescription is incorrect.", shops.size(), resultFound.size());

            Iterator it = shops.iterator();
            while (it.hasNext()) {
                Shop shop = (Shop) it.next();
                Shop another = ShopTestHelper.getShopByPk(resultFound, shop.getShopPK());
                assertEquals("Result returned by find-by-shortDescription does not equal to inserted shop object.", shop, another);
                ShopTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByOpenABusinessTime</tt> test preparation. Delete <Code>Shop</Code>
     * instances whose property openABusinessTime's value is openABusinessTime from persistent store. Then Create
     * multiple <Code>Shop</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByOpenABusinessTime(java.util.Date openABusinessTime) throws Exception {
        List shops = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShops = dao.findByOpenABusinessTime(openABusinessTime);

        if (oldShops != null) {
            Iterator it = oldShops.iterator();
            while (it.hasNext())
                ShopTestHelper.delete((Shop) it.next());
        }

        // Create instances of random count, set their openABusinessTime value to openABusinessTime
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Shop shop = ShopTestHelper.newInstance(null, null, "", 0, false);
            shop.setOpenABusinessTime(openABusinessTime);
            deleteBeforeSave(shop);
            dao.commitTransaction();
            shops.add(i, shop);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shops;
    }

    /**
     * Perform <tt>FindByOpenABusinessTime</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByOpenABusinessTime(java.util.Date openABusinessTime) {
        return dao.findByOpenABusinessTime(openABusinessTime);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByOpenABusinessTimet</tt>.
     *
     * @param shops       inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByOpenABusinessTime(List shops, List resultFound) {
        if (shops != null && shops.size() > 0) {
            assertNotNull("Result returned by find-by-openABusinessTime is null.", resultFound);
            assertEquals("Result count returned by find-by-openABusinessTime is incorrect.", shops.size(), resultFound.size());

            Iterator it = shops.iterator();
            while (it.hasNext()) {
                Shop shop = (Shop) it.next();
                Shop another = ShopTestHelper.getShopByPk(resultFound, shop.getShopPK());
                assertEquals("Result returned by find-by-openABusinessTime does not equal to inserted shop object.", shop, another);
                ShopTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByVisitCount</tt> test preparation. Delete <Code>Shop</Code>
     * instances whose property visitCount's value is visitCount from persistent store. Then Create
     * multiple <Code>Shop</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByVisitCount(int visitCount) throws Exception {
        List shops = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShops = dao.findByVisitCount(visitCount);

        if (oldShops != null) {
            Iterator it = oldShops.iterator();
            while (it.hasNext())
                ShopTestHelper.delete((Shop) it.next());
        }

        // Create instances of random count, set their visitCount value to visitCount
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Shop shop = ShopTestHelper.newInstance(null, null, "", 0, false);
            shop.setVisitCount(visitCount);
            deleteBeforeSave(shop);
            dao.commitTransaction();
            shops.add(i, shop);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shops;
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
     * @param shops       inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByVisitCount(List shops, List resultFound) {
        if (shops != null && shops.size() > 0) {
            assertNotNull("Result returned by find-by-visitCount is null.", resultFound);
            assertEquals("Result count returned by find-by-visitCount is incorrect.", shops.size(), resultFound.size());

            Iterator it = shops.iterator();
            while (it.hasNext()) {
                Shop shop = (Shop) it.next();
                Shop another = ShopTestHelper.getShopByPk(resultFound, shop.getShopPK());
                assertEquals("Result returned by find-by-visitCount does not equal to inserted shop object.", shop, another);
                ShopTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByDetailedAddress</tt> test preparation. Delete <Code>Shop</Code>
     * instances whose property detailedAddress's value is detailedAddress from persistent store. Then Create
     * multiple <Code>Shop</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByDetailedAddress(java.lang.String detailedAddress) throws Exception {
        List shops = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShops = dao.findByDetailedAddress(detailedAddress);

        if (oldShops != null) {
            Iterator it = oldShops.iterator();
            while (it.hasNext())
                ShopTestHelper.delete((Shop) it.next());
        }

        // Create instances of random count, set their detailedAddress value to detailedAddress
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Shop shop = ShopTestHelper.newInstance(null, null, "", 0, false);
            shop.setDetailedAddress(detailedAddress);
            deleteBeforeSave(shop);
            dao.commitTransaction();
            shops.add(i, shop);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shops;
    }

    /**
     * Perform <tt>FindByDetailedAddress</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByDetailedAddress(java.lang.String detailedAddress) {
        return dao.findByDetailedAddress(detailedAddress);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByDetailedAddresst</tt>.
     *
     * @param shops       inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByDetailedAddress(List shops, List resultFound) {
        if (shops != null && shops.size() > 0) {
            assertNotNull("Result returned by find-by-detailedAddress is null.", resultFound);
            assertEquals("Result count returned by find-by-detailedAddress is incorrect.", shops.size(), resultFound.size());

            Iterator it = shops.iterator();
            while (it.hasNext()) {
                Shop shop = (Shop) it.next();
                Shop another = ShopTestHelper.getShopByPk(resultFound, shop.getShopPK());
                assertEquals("Result returned by find-by-detailedAddress does not equal to inserted shop object.", shop, another);
                ShopTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByTrademark</tt> test preparation. Delete <Code>Shop</Code>
     * instances whose property trademark's value is trademark from persistent store. Then Create
     * multiple <Code>Shop</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByTrademark(java.lang.String trademark) throws Exception {
        List shops = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShops = dao.findByTrademark(trademark);

        if (oldShops != null) {
            Iterator it = oldShops.iterator();
            while (it.hasNext())
                ShopTestHelper.delete((Shop) it.next());
        }

        // Create instances of random count, set their trademark value to trademark
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Shop shop = ShopTestHelper.newInstance(null, null, "", 0, false);
            shop.setTrademark(trademark);
            deleteBeforeSave(shop);
            dao.commitTransaction();
            shops.add(i, shop);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shops;
    }

    /**
     * Perform <tt>FindByTrademark</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByTrademark(java.lang.String trademark) {
        return dao.findByTrademark(trademark);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByTrademarkt</tt>.
     *
     * @param shops       inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByTrademark(List shops, List resultFound) {
        if (shops != null && shops.size() > 0) {
            assertNotNull("Result returned by find-by-trademark is null.", resultFound);
            assertEquals("Result count returned by find-by-trademark is incorrect.", shops.size(), resultFound.size());

            Iterator it = shops.iterator();
            while (it.hasNext()) {
                Shop shop = (Shop) it.next();
                Shop another = ShopTestHelper.getShopByPk(resultFound, shop.getShopPK());
                assertEquals("Result returned by find-by-trademark does not equal to inserted shop object.", shop, another);
                ShopTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByEnterTime</tt> test preparation. Delete <Code>Shop</Code>
     * instances whose property enterTime's value is enterTime from persistent store. Then Create
     * multiple <Code>Shop</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByEnterTime(java.util.Date enterTime) throws Exception {
        List shops = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShops = dao.findByEnterTime(enterTime);

        if (oldShops != null) {
            Iterator it = oldShops.iterator();
            while (it.hasNext())
                ShopTestHelper.delete((Shop) it.next());
        }

        // Create instances of random count, set their enterTime value to enterTime
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Shop shop = ShopTestHelper.newInstance(null, null, "", 0, false);
            shop.setEnterTime(enterTime);
            deleteBeforeSave(shop);
            dao.commitTransaction();
            shops.add(i, shop);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shops;
    }

    /**
     * Perform <tt>FindByEnterTime</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByEnterTime(java.util.Date enterTime) {
        return dao.findByEnterTime(enterTime);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByEnterTimet</tt>.
     *
     * @param shops       inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByEnterTime(List shops, List resultFound) {
        if (shops != null && shops.size() > 0) {
            assertNotNull("Result returned by find-by-enterTime is null.", resultFound);
            assertEquals("Result count returned by find-by-enterTime is incorrect.", shops.size(), resultFound.size());

            Iterator it = shops.iterator();
            while (it.hasNext()) {
                Shop shop = (Shop) it.next();
                Shop another = ShopTestHelper.getShopByPk(resultFound, shop.getShopPK());
                assertEquals("Result returned by find-by-enterTime does not equal to inserted shop object.", shop, another);
                ShopTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByPhoneNumber</tt> test preparation. Delete <Code>Shop</Code>
     * instances whose property phoneNumber's value is phoneNumber from persistent store. Then Create
     * multiple <Code>Shop</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByPhoneNumber(java.lang.String phoneNumber) throws Exception {
        List shops = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShops = dao.findByPhoneNumber(phoneNumber);

        if (oldShops != null) {
            Iterator it = oldShops.iterator();
            while (it.hasNext())
                ShopTestHelper.delete((Shop) it.next());
        }

        // Create instances of random count, set their phoneNumber value to phoneNumber
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Shop shop = ShopTestHelper.newInstance(null, null, "", 0, false);
            shop.setPhoneNumber(phoneNumber);
            deleteBeforeSave(shop);
            dao.commitTransaction();
            shops.add(i, shop);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shops;
    }

    /**
     * Perform <tt>FindByPhoneNumber</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByPhoneNumber(java.lang.String phoneNumber) {
        return dao.findByPhoneNumber(phoneNumber);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByPhoneNumbert</tt>.
     *
     * @param shops       inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByPhoneNumber(List shops, List resultFound) {
        if (shops != null && shops.size() > 0) {
            assertNotNull("Result returned by find-by-phoneNumber is null.", resultFound);
            assertEquals("Result count returned by find-by-phoneNumber is incorrect.", shops.size(), resultFound.size());

            Iterator it = shops.iterator();
            while (it.hasNext()) {
                Shop shop = (Shop) it.next();
                Shop another = ShopTestHelper.getShopByPk(resultFound, shop.getShopPK());
                assertEquals("Result returned by find-by-phoneNumber does not equal to inserted shop object.", shop, another);
                ShopTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByFax</tt> test preparation. Delete <Code>Shop</Code>
     * instances whose property fax's value is fax from persistent store. Then Create
     * multiple <Code>Shop</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByFax(java.lang.String fax) throws Exception {
        List shops = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShops = dao.findByFax(fax);

        if (oldShops != null) {
            Iterator it = oldShops.iterator();
            while (it.hasNext())
                ShopTestHelper.delete((Shop) it.next());
        }

        // Create instances of random count, set their fax value to fax
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Shop shop = ShopTestHelper.newInstance(null, null, "", 0, false);
            shop.setFax(fax);
            deleteBeforeSave(shop);
            dao.commitTransaction();
            shops.add(i, shop);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shops;
    }

    /**
     * Perform <tt>FindByFax</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByFax(java.lang.String fax) {
        return dao.findByFax(fax);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByFaxt</tt>.
     *
     * @param shops       inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByFax(List shops, List resultFound) {
        if (shops != null && shops.size() > 0) {
            assertNotNull("Result returned by find-by-fax is null.", resultFound);
            assertEquals("Result count returned by find-by-fax is incorrect.", shops.size(), resultFound.size());

            Iterator it = shops.iterator();
            while (it.hasNext()) {
                Shop shop = (Shop) it.next();
                Shop another = ShopTestHelper.getShopByPk(resultFound, shop.getShopPK());
                assertEquals("Result returned by find-by-fax does not equal to inserted shop object.", shop, another);
                ShopTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByLongDescription</tt> test preparation. Delete <Code>Shop</Code>
     * instances whose property longDescription's value is longDescription from persistent store. Then Create
     * multiple <Code>Shop</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByLongDescription(java.lang.String longDescription) throws Exception {
        List shops = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldShops = dao.findByLongDescription(longDescription);

        if (oldShops != null) {
            Iterator it = oldShops.iterator();
            while (it.hasNext())
                ShopTestHelper.delete((Shop) it.next());
        }

        // Create instances of random count, set their longDescription value to longDescription
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Shop shop = ShopTestHelper.newInstance(null, null, "", 0, false);
            shop.setLongDescription(longDescription);
            deleteBeforeSave(shop);
            dao.commitTransaction();
            shops.add(i, shop);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shops;
    }

    /**
     * Perform <tt>FindByLongDescription</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByLongDescription(java.lang.String longDescription) {
        return dao.findByLongDescription(longDescription);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByLongDescriptiont</tt>.
     *
     * @param shops       inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByLongDescription(List shops, List resultFound) {
        if (shops != null && shops.size() > 0) {
            assertNotNull("Result returned by find-by-longDescription is null.", resultFound);
            assertEquals("Result count returned by find-by-longDescription is incorrect.", shops.size(), resultFound.size());

            Iterator it = shops.iterator();
            while (it.hasNext()) {
                Shop shop = (Shop) it.next();
                Shop another = ShopTestHelper.getShopByPk(resultFound, shop.getShopPK());
                assertEquals("Result returned by find-by-longDescription does not equal to inserted shop object.", shop, another);
                ShopTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>getShopList</tt> test preparation.  First delete any <Code>Shop</Code>
     * instance from persistent store if exists. Then create multiple <Code>Shop</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetShopList() throws Exception {
        List shops = new ArrayList();
        dao.setAutoCommit(false);

        List oldShops = dao.getShopList();

        if (oldShops != null) {
            Iterator it = oldShops.iterator();
            while (it.hasNext())
                ShopTestHelper.delete((Shop) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            Shop shop = prepare();
            dao.update(shop);
            dao.commitTransaction();
            shops.add(i, shop);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return shops;
    }

    /**
     * Perform <tt>getShopList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetShopList() throws Exception {
        return dao.getShopList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getShopList</tt>.
     *
     * @param shops       inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterGetShopList(List shops, List resultFound) {
        if (shops != null && shops.size() > 0) {
            assertNotNull("Result returned by get-shop-list is null.", resultFound);
            assertEquals("Result count returned by get-shop-list is incorrect.", shops.size(), resultFound.size());

            Iterator it = shops.iterator();
            while (it.hasNext()) {
                Shop shop = (Shop) it.next();
                Shop another = ShopTestHelper.getShopByPk(resultFound, shop.getShopPK());
                assertEquals("Result returned by get-shop-list does not equal to inserted shop object.", shop, another);
                ShopTestHelper.delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>Shop</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>Shop</Code> instance
     * @throws Exception
     */
    private Shop prepare() {
        Shop shop = ShopTestHelper.newInstance(null, null, "", 0, false);
        return deleteBeforeSave(shop);
    }

    /**
     * For a new <Code>Shop</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param shop
     * @return newly created and saved <Code>Shop</Code> instance
     * @throws Exception
     */
    private Shop deleteBeforeSave(Shop shop) {
        // Delete instance from data store if already exists
        Shop old = dao.load(shop.getShopPK());
        if (old != null)
            ShopTestHelper.delete(old);
        ShopTestHelper.save(shop);
        return shop;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getShopDao();
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
     * @return test suite containing test class <Code>ShopTest</Code>
     */
    public static Test suite() {
        return new TestSuite(ShopTest.class);
    }
}