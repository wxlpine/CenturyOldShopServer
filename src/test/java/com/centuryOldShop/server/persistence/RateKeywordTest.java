/***********************************************************************
 * Module:  RateKeywordTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class RateKeyword's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.RateKeywordDao;
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

import static com.centuryOldShop.server.persistence.RateKeywordTestHelper.unitTestEquals;

/**
 * Test case class to test RateKeyword's persistence
 */
@SuppressWarnings("ALL")
public class RateKeywordTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    RateKeywordDao dao;

    private Log logger = LogFactory.getLog(RateKeywordTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public RateKeywordTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>RateKeyword</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        RateKeyword rateKeyword = null;
        // Create new instance, delete instance if exists in database
        rateKeyword = preInsert();
        // Perform insert
        doInsert(rateKeyword);
        // Do assert
        afterInsert(rateKeyword);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>RateKeyword</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        RateKeyword rateKeyword = null;
        // Create and insert new instance
        rateKeyword = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(rateKeyword);
        // Do assert
        afterUpdate(rateKeyword);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>RateKeyword</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        RateKeyword rateKeyword = null;
        // Insert new RateKeyword instance
        rateKeyword = preDelete();
        // Perform delete
        doDelete(rateKeyword);
        // Do assert
        afterDelete(rateKeyword);
        logger.debug("Test delete ends!");
    }

    /**
     * Test function getRateKeywordList. First create multiple <Code>RateKeyword</Code>
     * instances and save them by <tt>preGetRateKeywordList</tt>. Then delegate the
     * find all operation to method <tt>doGetRateKeywordList</tt>. In the end do asserts
     * in <tt>afterGetRateKeywordList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetRateKeywordList() throws Exception {
        logger.debug("Test get-rateKeyword-list begins!");

        List rateKeywords = new ArrayList();
        // Insert RateKeyword instance
        rateKeywords = preGetRateKeywordList();
        // Perform query
        List result = doGetRateKeywordList();
        // Make assertion
        afterGetRateKeywordList(rateKeywords, result);
        logger.debug("Test get-rateKeyword-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>RateKeyword</Code> instance
     * @throws Exception
     */
    private RateKeyword preInsert() throws Exception {
        RateKeyword rateKeyword = RateKeywordTestHelper.newInstance(null, null, "", 0, false);
        RateKeyword old = dao.load(rateKeyword.getRateKeywordPK());
        if (old != null)
            RateKeywordTestHelper.delete(old);
        return rateKeyword;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param rateKeyword instance to insert
     * @throws Exception
     */
    private void doInsert(RateKeyword rateKeyword) {
        RateKeywordTestHelper.save(rateKeyword);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param rateKeyword inserted instance
     * @throws Exception
     */
    private void afterInsert(RateKeyword rateKeyword) {
        RateKeyword anotherRateKeyword = dao.load(rateKeyword.getRateKeywordPK());
        assertTrue(
                String.format("Queried result does not equal to inserted instance" +
                                "\nExpected: %s\n" +
                                "Actual  : %s",
                        rateKeyword, anotherRateKeyword),
                unitTestEquals(rateKeyword, anotherRateKeyword)
        );
        RateKeywordTestHelper.delete(anotherRateKeyword);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>RateKeyword</Code> instance
     * @throws Exception
     * @see RateKeywordTest#prepare()
     */
    private RateKeyword preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param rateKeyword object to update
     * @throws Exception
     */
    private void doUpdate(RateKeyword rateKeyword) throws Exception {
        RateKeywordTestHelper.modifyObject(rateKeyword);
        dao.update(rateKeyword);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param rateKeyword object to update
     * @throws Exception
     */
    private void afterUpdate(RateKeyword rateKeyword) throws Exception {
        RateKeyword another = dao.load(rateKeyword.getRateKeywordPK());
        assertTrue(
                String.format("Queried result does not equal to updated instance" +
                                "\nExpected: %s\n" +
                                "Actual  : %s",
                        rateKeyword, another),
                unitTestEquals(rateKeyword, another)
        );
        RateKeywordTestHelper.delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>RateKeyword</Code> instance
     * @throws Exception
     * @see RateKeywordTest#prepare()
     */
    private RateKeyword preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param rateKeyword object to delete
     * @throws Exception
     */
    private void doDelete(RateKeyword rateKeyword) throws Exception {
        RateKeywordTestHelper.delete(rateKeyword);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param rateKeyword deleted object
     * @throws Exception
     */
    private void afterDelete(RateKeyword rateKeyword) throws Exception {
        RateKeyword another = dao.load(rateKeyword.getRateKeywordPK());
        assertNull("Inserted instance is not deleted", another);
    }

    /**
     * Do function <tt>getRateKeywordList</tt> test preparation.  First delete any <Code>RateKeyword</Code>
     * instance from persistent store if exists. Then create multiple <Code>RateKeyword</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetRateKeywordList() throws Exception {
        List rateKeywords = new ArrayList();
        dao.setAutoCommit(false);

        List oldRateKeywords = dao.getRateKeywordList();

        if (oldRateKeywords != null) {
            Iterator it = oldRateKeywords.iterator();
            while (it.hasNext())
                RateKeywordTestHelper.delete((RateKeyword) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            RateKeyword rateKeyword = prepare();
            dao.update(rateKeyword);
            dao.commitTransaction();
            rateKeywords.add(i, rateKeyword);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return rateKeywords;
    }

    /**
     * Perform <tt>getRateKeywordList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetRateKeywordList() throws Exception {
        return dao.getRateKeywordList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getRateKeywordList</tt>.
     *
     * @param rateKeywords inserted instance list
     * @param resultFound  result instance list
     * @throws Exception
     */
    private void afterGetRateKeywordList(List rateKeywords, List resultFound) {
        if (rateKeywords != null && rateKeywords.size() > 0) {
            assertNotNull("Result returned by get-rateKeyword-list is null.", resultFound);
            assertEquals("Result count returned by get-rateKeyword-list is incorrect.", rateKeywords.size(), resultFound.size());

            Iterator it = rateKeywords.iterator();
            while (it.hasNext()) {
                RateKeyword rateKeyword = (RateKeyword) it.next();
                RateKeyword another = RateKeywordTestHelper.getRateKeywordByPk(resultFound, rateKeyword.getRateKeywordPK());
                assertTrue(
                        String.format("Result returned by get-rateKeyword-list does not equal to inserted rateKeyword object." +
                                        "\nExpected: %s\n" +
                                        "Actual  : %s",
                                rateKeyword, another),
                        unitTestEquals(rateKeyword, another)
                );
                RateKeywordTestHelper.delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>RateKeyword</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>RateKeyword</Code> instance
     * @throws Exception
     */
    private RateKeyword prepare() {
        RateKeyword rateKeyword = RateKeywordTestHelper.newInstance(null, null, "", 0, false);
        return deleteBeforeSave(rateKeyword);
    }

    /**
     * For a new <Code>RateKeyword</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param rateKeyword
     * @return newly created and saved <Code>RateKeyword</Code> instance
     * @throws Exception
     */
    private RateKeyword deleteBeforeSave(RateKeyword rateKeyword) {
        // Delete instance from data store if already exists
        RateKeyword old = dao.load(rateKeyword.getRateKeywordPK());
        if (old != null)
            RateKeywordTestHelper.delete(old);
        RateKeywordTestHelper.save(rateKeyword);
        return rateKeyword;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getRateKeywordDao();
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
     * @return test suite containing test class <Code>RateKeywordTest</Code>
     */
    public static Test suite() {
        return new TestSuite(RateKeywordTest.class);
    }
}