/***********************************************************************
 * Module:  SpecialCraftTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class SpecialCraft's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.SpecialCraftDao;
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
 * Test case class to test SpecialCraft's persistence
 */
@SuppressWarnings("ALL")
public class SpecialCraftTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    SpecialCraftDao dao;

    private Log logger = LogFactory.getLog(SpecialCraftTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public SpecialCraftTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>SpecialCraft</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        SpecialCraft specialCraft = null;
        // Create new instance, delete instance if exists in database
        specialCraft = preInsert();
        // Perform insert
        doInsert(specialCraft);
        // Do assert
        afterInsert(specialCraft);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>SpecialCraft</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        SpecialCraft specialCraft = null;
        // Create and insert new instance
        specialCraft = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(specialCraft);
        // Do assert
        afterUpdate(specialCraft);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>SpecialCraft</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        SpecialCraft specialCraft = null;
        // Insert new SpecialCraft instance
        specialCraft = preDelete();
        // Perform delete
        doDelete(specialCraft);
        // Do assert
        afterDelete(specialCraft);
        logger.debug("Test delete ends!");
    }


    /**
     * Test query function </tt>findByTitle</tt>. First create multiple
     * <Code>SpecialCraft</Code> instances and save them by <tt>preFindByTitle</tt>.
     * Then delegate the query operation to method <tt>doFindByTitle</tt>.
     * In the end do some asserts in <tt>afterFindByTitle</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByTitle() throws Exception {

        logger.debug("Test find-by-title begins!");
        java.lang.String title = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List specialCrafts = new ArrayList();
        // Create and insert title instances
        specialCrafts = preFindByTitle(title);
        // Perform query
        List result = doFindByTitle(title);
        // Do asserts
        afterFindByTitle(specialCrafts, result);
        logger.debug("Test find-by-title ends!");

    }

    /**
     * Test query function </tt>findBySmallPhotoUrl</tt>. First create multiple
     * <Code>SpecialCraft</Code> instances and save them by <tt>preFindBySmallPhotoUrl</tt>.
     * Then delegate the query operation to method <tt>doFindBySmallPhotoUrl</tt>.
     * In the end do some asserts in <tt>afterFindBySmallPhotoUrl</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindBySmallPhotoUrl() throws Exception {

        logger.debug("Test find-by-smallPhotoUrl begins!");
        java.lang.String smallPhotoUrl = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List specialCrafts = new ArrayList();
        // Create and insert smallPhotoUrl instances
        specialCrafts = preFindBySmallPhotoUrl(smallPhotoUrl);
        // Perform query
        List result = doFindBySmallPhotoUrl(smallPhotoUrl);
        // Do asserts
        afterFindBySmallPhotoUrl(specialCrafts, result);
        logger.debug("Test find-by-smallPhotoUrl ends!");

    }

    /**
     * Test query function </tt>findByIntroductionUrl</tt>. First create multiple
     * <Code>SpecialCraft</Code> instances and save them by <tt>preFindByIntroductionUrl</tt>.
     * Then delegate the query operation to method <tt>doFindByIntroductionUrl</tt>.
     * In the end do some asserts in <tt>afterFindByIntroductionUrl</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByIntroductionUrl() throws Exception {

        logger.debug("Test find-by-introductionUrl begins!");
        java.lang.String introductionUrl = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List specialCrafts = new ArrayList();
        // Create and insert introductionUrl instances
        specialCrafts = preFindByIntroductionUrl(introductionUrl);
        // Perform query
        List result = doFindByIntroductionUrl(introductionUrl);
        // Do asserts
        afterFindByIntroductionUrl(specialCrafts, result);
        logger.debug("Test find-by-introductionUrl ends!");

    }

    /**
     * Test query function </tt>findByAddedTime</tt>. First create multiple
     * <Code>SpecialCraft</Code> instances and save them by <tt>preFindByAddedTime</tt>.
     * Then delegate the query operation to method <tt>doFindByAddedTime</tt>.
     * In the end do some asserts in <tt>afterFindByAddedTime</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByAddedTime() throws Exception {

        logger.debug("Test find-by-addedTime begins!");
        java.util.Date addedTime = com.centuryOldShop.server.Util.getRandomDate();
        List specialCrafts = new ArrayList();
        // Create and insert addedTime instances
        specialCrafts = preFindByAddedTime(addedTime);
        // Perform query
        List result = doFindByAddedTime(addedTime);
        // Do asserts
        afterFindByAddedTime(specialCrafts, result);
        logger.debug("Test find-by-addedTime ends!");

    }

    /**
     * Test query function </tt>findByShortIntro</tt>. First create multiple
     * <Code>SpecialCraft</Code> instances and save them by <tt>preFindByShortIntro</tt>.
     * Then delegate the query operation to method <tt>doFindByShortIntro</tt>.
     * In the end do some asserts in <tt>afterFindByShortIntro</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByShortIntro() throws Exception {

        logger.debug("Test find-by-shortIntro begins!");
        java.lang.String shortIntro = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List specialCrafts = new ArrayList();
        // Create and insert shortIntro instances
        specialCrafts = preFindByShortIntro(shortIntro);
        // Perform query
        List result = doFindByShortIntro(shortIntro);
        // Do asserts
        afterFindByShortIntro(specialCrafts, result);
        logger.debug("Test find-by-shortIntro ends!");

    }

    /**
     * Test function getSpecialCraftList. First create multiple <Code>SpecialCraft</Code>
     * instances and save them by <tt>preGetSpecialCraftList</tt>. Then delegate the
     * find all operation to method <tt>doGetSpecialCraftList</tt>. In the end do asserts
     * in <tt>afterGetSpecialCraftList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetSpecialCraftList() throws Exception {
        logger.debug("Test get-specialCraft-list begins!");

        List specialCrafts = new ArrayList();
        // Insert SpecialCraft instance
        specialCrafts = preGetSpecialCraftList();
        // Perform query
        List result = doGetSpecialCraftList();
        // Make assertion
        afterGetSpecialCraftList(specialCrafts, result);
        logger.debug("Test get-specialCraft-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>SpecialCraft</Code> instance
     * @throws Exception
     */
    private SpecialCraft preInsert() throws Exception {
        SpecialCraft specialCraft = SpecialCraftTestHelper.newInstance(null, null, "", 0, false);
        SpecialCraft old = dao.load(specialCraft.getSpecialCraftPK());
        if (old != null)
            SpecialCraftTestHelper.delete(old);
        return specialCraft;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param specialCraft instance to insert
     * @throws Exception
     */
    private void doInsert(SpecialCraft specialCraft) {
        SpecialCraftTestHelper.save(specialCraft);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param specialCraft inserted instance
     * @throws Exception
     */
    private void afterInsert(SpecialCraft specialCraft) {
        SpecialCraft anotherSpecialCraft = dao.load(specialCraft.getSpecialCraftPK());
        assertEquals("Queried result does not equal to inserted instance",
                specialCraft, anotherSpecialCraft);
        SpecialCraftTestHelper.delete(anotherSpecialCraft);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>SpecialCraft</Code> instance
     * @throws Exception
     * @see SpecialCraftTest#prepare()
     */
    private SpecialCraft preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param specialCraft object to update
     * @throws Exception
     */
    private void doUpdate(SpecialCraft specialCraft) throws Exception {
        SpecialCraftTestHelper.modifyObject(specialCraft);
        dao.update(specialCraft);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param specialCraft object to update
     * @throws Exception
     */
    private void afterUpdate(SpecialCraft specialCraft) throws Exception {
        SpecialCraft another = dao.load(specialCraft.getSpecialCraftPK());
        assertEquals("Queried result does not equal to updated instance", specialCraft, another);
        SpecialCraftTestHelper.delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>SpecialCraft</Code> instance
     * @throws Exception
     * @see SpecialCraftTest#prepare()
     */
    private SpecialCraft preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param specialCraft object to delete
     * @throws Exception
     */
    private void doDelete(SpecialCraft specialCraft) throws Exception {
        SpecialCraftTestHelper.delete(specialCraft);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param specialCraft deleted object
     * @throws Exception
     */
    private void afterDelete(SpecialCraft specialCraft) throws Exception {
        SpecialCraft another = dao.load(specialCraft.getSpecialCraftPK());
        assertNull("Inserted instance is not deleted", another);
    }


    /**
     * Do function <tt>FindByTitle</tt> test preparation. Delete <Code>SpecialCraft</Code>
     * instances whose property title's value is title from persistent store. Then Create
     * multiple <Code>SpecialCraft</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByTitle(java.lang.String title) throws Exception {
        List specialCrafts = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldSpecialCrafts = dao.findByTitle(title);

        if (oldSpecialCrafts != null) {
            Iterator it = oldSpecialCrafts.iterator();
            while (it.hasNext())
                SpecialCraftTestHelper.delete((SpecialCraft) it.next());
        }

        // Create instances of random count, set their title value to title
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            SpecialCraft specialCraft = SpecialCraftTestHelper.newInstance(null, null, "", 0, false);
            specialCraft.setTitle(title);
            deleteBeforeSave(specialCraft);
            dao.commitTransaction();
            specialCrafts.add(i, specialCraft);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return specialCrafts;
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
     * @param specialCrafts inserted instance list
     * @param resultFound   result instance list
     * @throws Exception
     */
    private void afterFindByTitle(List specialCrafts, List resultFound) {
        if (specialCrafts != null && specialCrafts.size() > 0) {
            assertNotNull("Result returned by find-by-title is null.", resultFound);
            assertEquals("Result count returned by find-by-title is incorrect.", specialCrafts.size(), resultFound.size());

            Iterator it = specialCrafts.iterator();
            while (it.hasNext()) {
                SpecialCraft specialCraft = (SpecialCraft) it.next();
                SpecialCraft another = SpecialCraftTestHelper.getSpecialCraftByPk(resultFound, specialCraft.getSpecialCraftPK());
                assertEquals("Result returned by find-by-title does not equal to inserted specialCraft object.", specialCraft, another);
                SpecialCraftTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindBySmallPhotoUrl</tt> test preparation. Delete <Code>SpecialCraft</Code>
     * instances whose property smallPhotoUrl's value is smallPhotoUrl from persistent store. Then Create
     * multiple <Code>SpecialCraft</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindBySmallPhotoUrl(java.lang.String smallPhotoUrl) throws Exception {
        List specialCrafts = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldSpecialCrafts = dao.findBySmallPhotoUrl(smallPhotoUrl);

        if (oldSpecialCrafts != null) {
            Iterator it = oldSpecialCrafts.iterator();
            while (it.hasNext())
                SpecialCraftTestHelper.delete((SpecialCraft) it.next());
        }

        // Create instances of random count, set their smallPhotoUrl value to smallPhotoUrl
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            SpecialCraft specialCraft = SpecialCraftTestHelper.newInstance(null, null, "", 0, false);
            specialCraft.setSmallPhotoUrl(smallPhotoUrl);
            deleteBeforeSave(specialCraft);
            dao.commitTransaction();
            specialCrafts.add(i, specialCraft);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return specialCrafts;
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
     * @param specialCrafts inserted instance list
     * @param resultFound   result instance list
     * @throws Exception
     */
    private void afterFindBySmallPhotoUrl(List specialCrafts, List resultFound) {
        if (specialCrafts != null && specialCrafts.size() > 0) {
            assertNotNull("Result returned by find-by-smallPhotoUrl is null.", resultFound);
            assertEquals("Result count returned by find-by-smallPhotoUrl is incorrect.", specialCrafts.size(), resultFound.size());

            Iterator it = specialCrafts.iterator();
            while (it.hasNext()) {
                SpecialCraft specialCraft = (SpecialCraft) it.next();
                SpecialCraft another = SpecialCraftTestHelper.getSpecialCraftByPk(resultFound, specialCraft.getSpecialCraftPK());
                assertEquals("Result returned by find-by-smallPhotoUrl does not equal to inserted specialCraft object.", specialCraft, another);
                SpecialCraftTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByIntroductionUrl</tt> test preparation. Delete <Code>SpecialCraft</Code>
     * instances whose property introductionUrl's value is introductionUrl from persistent store. Then Create
     * multiple <Code>SpecialCraft</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByIntroductionUrl(java.lang.String introductionUrl) throws Exception {
        List specialCrafts = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldSpecialCrafts = dao.findByIntroductionUrl(introductionUrl);

        if (oldSpecialCrafts != null) {
            Iterator it = oldSpecialCrafts.iterator();
            while (it.hasNext())
                SpecialCraftTestHelper.delete((SpecialCraft) it.next());
        }

        // Create instances of random count, set their introductionUrl value to introductionUrl
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            SpecialCraft specialCraft = SpecialCraftTestHelper.newInstance(null, null, "", 0, false);
            specialCraft.setIntroductionUrl(introductionUrl);
            deleteBeforeSave(specialCraft);
            dao.commitTransaction();
            specialCrafts.add(i, specialCraft);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return specialCrafts;
    }

    /**
     * Perform <tt>FindByIntroductionUrl</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByIntroductionUrl(java.lang.String introductionUrl) {
        return dao.findByIntroductionUrl(introductionUrl);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByIntroductionUrlt</tt>.
     *
     * @param specialCrafts inserted instance list
     * @param resultFound   result instance list
     * @throws Exception
     */
    private void afterFindByIntroductionUrl(List specialCrafts, List resultFound) {
        if (specialCrafts != null && specialCrafts.size() > 0) {
            assertNotNull("Result returned by find-by-introductionUrl is null.", resultFound);
            assertEquals("Result count returned by find-by-introductionUrl is incorrect.", specialCrafts.size(), resultFound.size());

            Iterator it = specialCrafts.iterator();
            while (it.hasNext()) {
                SpecialCraft specialCraft = (SpecialCraft) it.next();
                SpecialCraft another = SpecialCraftTestHelper.getSpecialCraftByPk(resultFound, specialCraft.getSpecialCraftPK());
                assertEquals("Result returned by find-by-introductionUrl does not equal to inserted specialCraft object.", specialCraft, another);
                SpecialCraftTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByAddedTime</tt> test preparation. Delete <Code>SpecialCraft</Code>
     * instances whose property addedTime's value is addedTime from persistent store. Then Create
     * multiple <Code>SpecialCraft</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByAddedTime(java.util.Date addedTime) throws Exception {
        List specialCrafts = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldSpecialCrafts = dao.findByAddedTime(addedTime);

        if (oldSpecialCrafts != null) {
            Iterator it = oldSpecialCrafts.iterator();
            while (it.hasNext())
                SpecialCraftTestHelper.delete((SpecialCraft) it.next());
        }

        // Create instances of random count, set their addedTime value to addedTime
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            SpecialCraft specialCraft = SpecialCraftTestHelper.newInstance(null, null, "", 0, false);
            specialCraft.setAddedTime(addedTime);
            deleteBeforeSave(specialCraft);
            dao.commitTransaction();
            specialCrafts.add(i, specialCraft);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return specialCrafts;
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
     * @param specialCrafts inserted instance list
     * @param resultFound   result instance list
     * @throws Exception
     */
    private void afterFindByAddedTime(List specialCrafts, List resultFound) {
        if (specialCrafts != null && specialCrafts.size() > 0) {
            assertNotNull("Result returned by find-by-addedTime is null.", resultFound);
            assertEquals("Result count returned by find-by-addedTime is incorrect.", specialCrafts.size(), resultFound.size());

            Iterator it = specialCrafts.iterator();
            while (it.hasNext()) {
                SpecialCraft specialCraft = (SpecialCraft) it.next();
                SpecialCraft another = SpecialCraftTestHelper.getSpecialCraftByPk(resultFound, specialCraft.getSpecialCraftPK());
                assertEquals("Result returned by find-by-addedTime does not equal to inserted specialCraft object.", specialCraft, another);
                SpecialCraftTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByShortIntro</tt> test preparation. Delete <Code>SpecialCraft</Code>
     * instances whose property shortIntro's value is shortIntro from persistent store. Then Create
     * multiple <Code>SpecialCraft</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByShortIntro(java.lang.String shortIntro) throws Exception {
        List specialCrafts = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldSpecialCrafts = dao.findByShortIntro(shortIntro);

        if (oldSpecialCrafts != null) {
            Iterator it = oldSpecialCrafts.iterator();
            while (it.hasNext())
                SpecialCraftTestHelper.delete((SpecialCraft) it.next());
        }

        // Create instances of random count, set their shortIntro value to shortIntro
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            SpecialCraft specialCraft = SpecialCraftTestHelper.newInstance(null, null, "", 0, false);
            specialCraft.setShortIntro(shortIntro);
            deleteBeforeSave(specialCraft);
            dao.commitTransaction();
            specialCrafts.add(i, specialCraft);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return specialCrafts;
    }

    /**
     * Perform <tt>FindByShortIntro</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByShortIntro(java.lang.String shortIntro) {
        return dao.findByShortIntro(shortIntro);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByShortIntrot</tt>.
     *
     * @param specialCrafts inserted instance list
     * @param resultFound   result instance list
     * @throws Exception
     */
    private void afterFindByShortIntro(List specialCrafts, List resultFound) {
        if (specialCrafts != null && specialCrafts.size() > 0) {
            assertNotNull("Result returned by find-by-shortIntro is null.", resultFound);
            assertEquals("Result count returned by find-by-shortIntro is incorrect.", specialCrafts.size(), resultFound.size());

            Iterator it = specialCrafts.iterator();
            while (it.hasNext()) {
                SpecialCraft specialCraft = (SpecialCraft) it.next();
                SpecialCraft another = SpecialCraftTestHelper.getSpecialCraftByPk(resultFound, specialCraft.getSpecialCraftPK());
                assertEquals("Result returned by find-by-shortIntro does not equal to inserted specialCraft object.", specialCraft, another);
                SpecialCraftTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>getSpecialCraftList</tt> test preparation.  First delete any <Code>SpecialCraft</Code>
     * instance from persistent store if exists. Then create multiple <Code>SpecialCraft</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetSpecialCraftList() throws Exception {
        List specialCrafts = new ArrayList();
        dao.setAutoCommit(false);

        List oldSpecialCrafts = dao.getSpecialCraftList();

        if (oldSpecialCrafts != null) {
            Iterator it = oldSpecialCrafts.iterator();
            while (it.hasNext())
                SpecialCraftTestHelper.delete((SpecialCraft) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            SpecialCraft specialCraft = prepare();
            dao.update(specialCraft);
            dao.commitTransaction();
            specialCrafts.add(i, specialCraft);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return specialCrafts;
    }

    /**
     * Perform <tt>getSpecialCraftList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetSpecialCraftList() throws Exception {
        return dao.getSpecialCraftList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getSpecialCraftList</tt>.
     *
     * @param specialCrafts inserted instance list
     * @param resultFound   result instance list
     * @throws Exception
     */
    private void afterGetSpecialCraftList(List specialCrafts, List resultFound) {
        if (specialCrafts != null && specialCrafts.size() > 0) {
            assertNotNull("Result returned by get-specialCraft-list is null.", resultFound);
            assertEquals("Result count returned by get-specialCraft-list is incorrect.", specialCrafts.size(), resultFound.size());

            Iterator it = specialCrafts.iterator();
            while (it.hasNext()) {
                SpecialCraft specialCraft = (SpecialCraft) it.next();
                SpecialCraft another = SpecialCraftTestHelper.getSpecialCraftByPk(resultFound, specialCraft.getSpecialCraftPK());
                assertEquals("Result returned by get-specialCraft-list does not equal to inserted specialCraft object.", specialCraft, another);
                SpecialCraftTestHelper.delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>SpecialCraft</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>SpecialCraft</Code> instance
     * @throws Exception
     */
    private SpecialCraft prepare() {
        SpecialCraft specialCraft = SpecialCraftTestHelper.newInstance(null, null, "", 0, false);
        return deleteBeforeSave(specialCraft);
    }

    /**
     * For a new <Code>SpecialCraft</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param specialCraft
     * @return newly created and saved <Code>SpecialCraft</Code> instance
     * @throws Exception
     */
    private SpecialCraft deleteBeforeSave(SpecialCraft specialCraft) {
        // Delete instance from data store if already exists
        SpecialCraft old = dao.load(specialCraft.getSpecialCraftPK());
        if (old != null)
            SpecialCraftTestHelper.delete(old);
        SpecialCraftTestHelper.save(specialCraft);
        return specialCraft;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getSpecialCraftDao();
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
     * @return test suite containing test class <Code>SpecialCraftTest</Code>
     */
    public static Test suite() {
        return new TestSuite(SpecialCraftTest.class);
    }
}