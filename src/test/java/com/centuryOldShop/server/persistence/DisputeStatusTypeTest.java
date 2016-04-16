/***********************************************************************
 * Module:  DisputeStatusTypeTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class DisputeStatusType's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.DisputeStatusTypeDao;
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
 * Test case class to test DisputeStatusType's persistence
 */
@SuppressWarnings("ALL")
public class DisputeStatusTypeTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    DisputeStatusTypeDao dao;

    private Log logger = LogFactory.getLog(DisputeStatusTypeTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public DisputeStatusTypeTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>DisputeStatusType</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        DisputeStatusType disputeStatusType = null;
        // Create new instance, delete instance if exists in database
        disputeStatusType = preInsert();
        // Perform insert
        doInsert(disputeStatusType);
        // Do assert
        afterInsert(disputeStatusType);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>DisputeStatusType</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        DisputeStatusType disputeStatusType = null;
        // Create and insert new instance
        disputeStatusType = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(disputeStatusType);
        // Do assert
        afterUpdate(disputeStatusType);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>DisputeStatusType</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        DisputeStatusType disputeStatusType = null;
        // Insert new DisputeStatusType instance
        disputeStatusType = preDelete();
        // Perform delete
        doDelete(disputeStatusType);
        // Do assert
        afterDelete(disputeStatusType);
        logger.debug("Test delete ends!");
    }

    /**
     * Test function getDisputeStatusTypeList. First create multiple <Code>DisputeStatusType</Code>
     * instances and save them by <tt>preGetDisputeStatusTypeList</tt>. Then delegate the
     * find all operation to method <tt>doGetDisputeStatusTypeList</tt>. In the end do asserts
     * in <tt>afterGetDisputeStatusTypeList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetDisputeStatusTypeList() throws Exception {
        logger.debug("Test get-disputeStatusType-list begins!");

        List disputeStatusTypes = new ArrayList();
        // Insert DisputeStatusType instance
        disputeStatusTypes = preGetDisputeStatusTypeList();
        // Perform query
        List result = doGetDisputeStatusTypeList();
        // Make assertion
        afterGetDisputeStatusTypeList(disputeStatusTypes, result);
        logger.debug("Test get-disputeStatusType-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>DisputeStatusType</Code> instance
     * @throws Exception
     */
    private DisputeStatusType preInsert() throws Exception {
        DisputeStatusType disputeStatusType = DisputeStatusTypeTestHelper.newInstance(null, null, "", 0, false);
        DisputeStatusType old = dao.load(disputeStatusType.getDisputeStatusTypePK());
        if (old != null)
            DisputeStatusTypeTestHelper.delete(old);
        return disputeStatusType;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param disputeStatusType instance to insert
     * @throws Exception
     */
    private void doInsert(DisputeStatusType disputeStatusType) {
        DisputeStatusTypeTestHelper.save(disputeStatusType);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param disputeStatusType inserted instance
     * @throws Exception
     */
    private void afterInsert(DisputeStatusType disputeStatusType) {
        DisputeStatusType anotherDisputeStatusType = dao.load(disputeStatusType.getDisputeStatusTypePK());
        assertEquals("Queried result does not equal to inserted instance",
                disputeStatusType, anotherDisputeStatusType);
        DisputeStatusTypeTestHelper.delete(anotherDisputeStatusType);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>DisputeStatusType</Code> instance
     * @throws Exception
     * @see DisputeStatusTypeTest#prepare()
     */
    private DisputeStatusType preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param disputeStatusType object to update
     * @throws Exception
     */
    private void doUpdate(DisputeStatusType disputeStatusType) throws Exception {
        DisputeStatusTypeTestHelper.modifyObject(disputeStatusType);
        dao.update(disputeStatusType);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param disputeStatusType object to update
     * @throws Exception
     */
    private void afterUpdate(DisputeStatusType disputeStatusType) throws Exception {
        DisputeStatusType another = dao.load(disputeStatusType.getDisputeStatusTypePK());
        assertEquals("Queried result does not equal to updated instance", disputeStatusType, another);
        DisputeStatusTypeTestHelper.delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>DisputeStatusType</Code> instance
     * @throws Exception
     * @see DisputeStatusTypeTest#prepare()
     */
    private DisputeStatusType preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param disputeStatusType object to delete
     * @throws Exception
     */
    private void doDelete(DisputeStatusType disputeStatusType) throws Exception {
        DisputeStatusTypeTestHelper.delete(disputeStatusType);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param disputeStatusType deleted object
     * @throws Exception
     */
    private void afterDelete(DisputeStatusType disputeStatusType) throws Exception {
        DisputeStatusType another = dao.load(disputeStatusType.getDisputeStatusTypePK());
        assertNull("Inserted instance is not deleted", another);
    }

    /**
     * Do function <tt>getDisputeStatusTypeList</tt> test preparation.  First delete any <Code>DisputeStatusType</Code>
     * instance from persistent store if exists. Then create multiple <Code>DisputeStatusType</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetDisputeStatusTypeList() throws Exception {
        List disputeStatusTypes = new ArrayList();
        dao.setAutoCommit(false);

        List oldDisputeStatusTypes = dao.getDisputeStatusTypeList();

        if (oldDisputeStatusTypes != null) {
            Iterator it = oldDisputeStatusTypes.iterator();
            while (it.hasNext())
                DisputeStatusTypeTestHelper.delete((DisputeStatusType) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            DisputeStatusType disputeStatusType = prepare();
            dao.update(disputeStatusType);
            dao.commitTransaction();
            disputeStatusTypes.add(i, disputeStatusType);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return disputeStatusTypes;
    }

    /**
     * Perform <tt>getDisputeStatusTypeList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetDisputeStatusTypeList() throws Exception {
        return dao.getDisputeStatusTypeList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getDisputeStatusTypeList</tt>.
     *
     * @param disputeStatusTypes inserted instance list
     * @param resultFound        result instance list
     * @throws Exception
     */
    private void afterGetDisputeStatusTypeList(List disputeStatusTypes, List resultFound) {
        if (disputeStatusTypes != null && disputeStatusTypes.size() > 0) {
            assertNotNull("Result returned by get-disputeStatusType-list is null.", resultFound);
            assertEquals("Result count returned by get-disputeStatusType-list is incorrect.", disputeStatusTypes.size(), resultFound.size());

            Iterator it = disputeStatusTypes.iterator();
            while (it.hasNext()) {
                DisputeStatusType disputeStatusType = (DisputeStatusType) it.next();
                DisputeStatusType another = DisputeStatusTypeTestHelper.getDisputeStatusTypeByPk(resultFound, disputeStatusType.getDisputeStatusTypePK());
                assertEquals("Result returned by get-disputeStatusType-list does not equal to inserted disputeStatusType object.", disputeStatusType, another);
                DisputeStatusTypeTestHelper.delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>DisputeStatusType</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>DisputeStatusType</Code> instance
     * @throws Exception
     */
    private DisputeStatusType prepare() {
        DisputeStatusType disputeStatusType = DisputeStatusTypeTestHelper.newInstance(null, null, "", 0, false);
        return deleteBeforeSave(disputeStatusType);
    }

    /**
     * For a new <Code>DisputeStatusType</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param disputeStatusType
     * @return newly created and saved <Code>DisputeStatusType</Code> instance
     * @throws Exception
     */
    private DisputeStatusType deleteBeforeSave(DisputeStatusType disputeStatusType) {
        // Delete instance from data store if already exists
        DisputeStatusType old = dao.load(disputeStatusType.getDisputeStatusTypePK());
        if (old != null)
            DisputeStatusTypeTestHelper.delete(old);
        DisputeStatusTypeTestHelper.save(disputeStatusType);
        return disputeStatusType;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getDisputeStatusTypeDao();
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
     * @return test suite containing test class <Code>DisputeStatusTypeTest</Code>
     */
    public static Test suite() {
        return new TestSuite(DisputeStatusTypeTest.class);
    }
}