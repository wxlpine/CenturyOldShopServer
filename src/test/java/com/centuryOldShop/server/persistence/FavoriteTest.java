/***********************************************************************
 * Module:  FavoriteTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class Favorite's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.FavoriteDao;
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
 * Test case class to test Favorite's persistence
 */
@SuppressWarnings("ALL")
public class FavoriteTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    FavoriteDao dao;

    private Log logger = LogFactory.getLog(FavoriteTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public FavoriteTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>Favorite</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        Favorite favorite = null;
        // Create new instance, delete instance if exists in database
        favorite = preInsert();
        // Perform insert
        doInsert(favorite);
        // Do assert
        afterInsert(favorite);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>Favorite</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        Favorite favorite = null;
        // Create and insert new instance
        favorite = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(favorite);
        // Do assert
        afterUpdate(favorite);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>Favorite</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        Favorite favorite = null;
        // Insert new Favorite instance
        favorite = preDelete();
        // Perform delete
        doDelete(favorite);
        // Do assert
        afterDelete(favorite);
        logger.debug("Test delete ends!");
    }


    /**
     * Test query function </tt>findByAddTime</tt>. First create multiple
     * <Code>Favorite</Code> instances and save them by <tt>preFindByAddTime</tt>.
     * Then delegate the query operation to method <tt>doFindByAddTime</tt>.
     * In the end do some asserts in <tt>afterFindByAddTime</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByAddTime() throws Exception {

        logger.debug("Test find-by-addTime begins!");
        java.util.Date addTime = com.centuryOldShop.server.Util.getRandomDate();
        List favorites = new ArrayList();
        // Create and insert addTime instances
        favorites = preFindByAddTime(addTime);
        // Perform query
        List result = doFindByAddTime(addTime);
        // Do asserts
        afterFindByAddTime(favorites, result);
        logger.debug("Test find-by-addTime ends!");

    }

    /**
     * Test function getFavoriteList. First create multiple <Code>Favorite</Code>
     * instances and save them by <tt>preGetFavoriteList</tt>. Then delegate the
     * find all operation to method <tt>doGetFavoriteList</tt>. In the end do asserts
     * in <tt>afterGetFavoriteList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetFavoriteList() throws Exception {
        logger.debug("Test get-favorite-list begins!");

        List favorites = new ArrayList();
        // Insert Favorite instance
        favorites = preGetFavoriteList();
        // Perform query
        List result = doGetFavoriteList();
        // Make assertion
        afterGetFavoriteList(favorites, result);
        logger.debug("Test get-favorite-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>Favorite</Code> instance
     * @throws Exception
     */
    private Favorite preInsert() throws Exception {
        Favorite favorite = FavoriteTestHelper.newInstance(null, null, "", 0, false);
        return favorite;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param favorite instance to insert
     * @throws Exception
     */
    private void doInsert(Favorite favorite) {
        FavoriteTestHelper.save(favorite);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param favorite inserted instance
     * @throws Exception
     */
    private void afterInsert(Favorite favorite) {
        Favorite anotherFavorite = dao.load(favorite.getFavoritePK());
        assertEquals("Queried result does not equal to inserted instance",
                favorite, anotherFavorite);
        FavoriteTestHelper.delete(anotherFavorite);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>Favorite</Code> instance
     * @throws Exception
     * @see FavoriteTest#prepare()
     */
    private Favorite preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param favorite object to update
     * @throws Exception
     */
    private void doUpdate(Favorite favorite) throws Exception {
        FavoriteTestHelper.modifyObject(favorite);
        dao.update(favorite);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param favorite object to update
     * @throws Exception
     */
    private void afterUpdate(Favorite favorite) throws Exception {
        Favorite another = dao.load(favorite.getFavoritePK());
        assertEquals("Queried result does not equal to updated instance", favorite, another);
        FavoriteTestHelper.delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>Favorite</Code> instance
     * @throws Exception
     * @see FavoriteTest#prepare()
     */
    private Favorite preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param favorite object to delete
     * @throws Exception
     */
    private void doDelete(Favorite favorite) throws Exception {
        FavoriteTestHelper.delete(favorite);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param favorite deleted object
     * @throws Exception
     */
    private void afterDelete(Favorite favorite) throws Exception {
        Favorite another = dao.load(favorite.getFavoritePK());
        assertNull("Inserted instance is not deleted", another);
    }


    /**
     * Do function <tt>FindByAddTime</tt> test preparation. Delete <Code>Favorite</Code>
     * instances whose property addTime's value is addTime from persistent store. Then Create
     * multiple <Code>Favorite</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByAddTime(java.util.Date addTime) throws Exception {
        List favorites = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldFavorites = dao.findByAddTime(addTime);

        if (oldFavorites != null) {
            Iterator it = oldFavorites.iterator();
            while (it.hasNext())
                FavoriteTestHelper.delete((Favorite) it.next());
        }

        // Create instances of random count, set their addTime value to addTime
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            Favorite favorite = FavoriteTestHelper.newInstance(null, null, "", 0, false);
            favorite.setAddTime(addTime);
            deleteBeforeSave(favorite);
            dao.commitTransaction();
            favorites.add(i, favorite);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return favorites;
    }

    /**
     * Perform <tt>FindByAddTime</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByAddTime(java.util.Date addTime) {
        return dao.findByAddTime(addTime);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByAddTimet</tt>.
     *
     * @param favorites   inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByAddTime(List favorites, List resultFound) {
        if (favorites != null && favorites.size() > 0) {
            assertNotNull("Result returned by find-by-addTime is null.", resultFound);
            assertEquals("Result count returned by find-by-addTime is incorrect.", favorites.size(), resultFound.size());

            Iterator it = favorites.iterator();
            while (it.hasNext()) {
                Favorite favorite = (Favorite) it.next();
                Favorite another = FavoriteTestHelper.getFavoriteByPk(resultFound, favorite.getFavoritePK());
                assertEquals("Result returned by find-by-addTime does not equal to inserted favorite object.", favorite, another);
                FavoriteTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>getFavoriteList</tt> test preparation.  First delete any <Code>Favorite</Code>
     * instance from persistent store if exists. Then create multiple <Code>Favorite</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetFavoriteList() throws Exception {
        List favorites = new ArrayList();
        dao.setAutoCommit(false);

        List oldFavorites = dao.getFavoriteList();

        if (oldFavorites != null) {
            Iterator it = oldFavorites.iterator();
            while (it.hasNext())
                FavoriteTestHelper.delete((Favorite) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            Favorite favorite = prepare();
            dao.update(favorite);
            dao.commitTransaction();
            favorites.add(i, favorite);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return favorites;
    }

    /**
     * Perform <tt>getFavoriteList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetFavoriteList() throws Exception {
        return dao.getFavoriteList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getFavoriteList</tt>.
     *
     * @param favorites   inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterGetFavoriteList(List favorites, List resultFound) {
        if (favorites != null && favorites.size() > 0) {
            assertNotNull("Result returned by get-favorite-list is null.", resultFound);
            assertEquals("Result count returned by get-favorite-list is incorrect.", favorites.size(), resultFound.size());

            Iterator it = favorites.iterator();
            while (it.hasNext()) {
                Favorite favorite = (Favorite) it.next();
                Favorite another = FavoriteTestHelper.getFavoriteByPk(resultFound, favorite.getFavoritePK());
                assertEquals("Result returned by get-favorite-list does not equal to inserted favorite object.", favorite, another);
                FavoriteTestHelper.delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>Favorite</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>Favorite</Code> instance
     * @throws Exception
     */
    private Favorite prepare() {
        Favorite favorite = FavoriteTestHelper.newInstance(null, null, "", 0, false);
        return deleteBeforeSave(favorite);
    }

    /**
     * For a new <Code>Favorite</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param favorite
     * @return newly created and saved <Code>Favorite</Code> instance
     * @throws Exception
     */
    private Favorite deleteBeforeSave(Favorite favorite) {
        FavoriteTestHelper.save(favorite);
        return favorite;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getFavoriteDao();
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
     * @return test suite containing test class <Code>FavoriteTest</Code>
     */
    public static Test suite() {
        return new TestSuite(FavoriteTest.class);
    }
}