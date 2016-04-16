/***********************************************************************
 * Module:  DiscountTypeTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class DiscountType's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.DiscountTypeDao;
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
 * Test case class to test DiscountType's persistence
 */
@SuppressWarnings("ALL")
public class DiscountTypeTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    DiscountTypeDao dao;

    private Log logger = LogFactory.getLog(DiscountTypeTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public DiscountTypeTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>DiscountType</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        DiscountType discountType = null;
        // Create new instance, delete instance if exists in database
        discountType = preInsert();
        // Perform insert
        doInsert(discountType);
        // Do assert
        afterInsert(discountType);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>DiscountType</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        DiscountType discountType = null;
        // Create and insert new instance
        discountType = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(discountType);
        // Do assert
        afterUpdate(discountType);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>DiscountType</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        DiscountType discountType = null;
        // Insert new DiscountType instance
        discountType = preDelete();
        // Perform delete
        doDelete(discountType);
        // Do assert
        afterDelete(discountType);
        logger.debug("Test delete ends!");
    }


    /**
     * Test query function </tt>findByDiscountTypeName</tt>. First create multiple
     * <Code>DiscountType</Code> instances and save them by <tt>preFindByDiscountTypeName</tt>.
     * Then delegate the query operation to method <tt>doFindByDiscountTypeName</tt>.
     * In the end do some asserts in <tt>afterFindByDiscountTypeName</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByDiscountTypeName() throws Exception {

        logger.debug("Test find-by-discountTypeName begins!");
        java.lang.String discountTypeName = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List discountTypes = new ArrayList();
        // Create and insert discountTypeName instances
        discountTypes = preFindByDiscountTypeName(discountTypeName);
        // Perform query
        List result = doFindByDiscountTypeName(discountTypeName);
        // Do asserts
        afterFindByDiscountTypeName(discountTypes, result);
        logger.debug("Test find-by-discountTypeName ends!");

    }

    /**
     * Test function getDiscountTypeList. First create multiple <Code>DiscountType</Code>
     * instances and save them by <tt>preGetDiscountTypeList</tt>. Then delegate the
     * find all operation to method <tt>doGetDiscountTypeList</tt>. In the end do asserts
     * in <tt>afterGetDiscountTypeList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetDiscountTypeList() throws Exception {
        logger.debug("Test get-discountType-list begins!");

        List discountTypes = new ArrayList();
        // Insert DiscountType instance
        discountTypes = preGetDiscountTypeList();
        // Perform query
        List result = doGetDiscountTypeList();
        // Make assertion
        afterGetDiscountTypeList(discountTypes, result);
        logger.debug("Test get-discountType-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>DiscountType</Code> instance
     * @throws Exception
     */
    private DiscountType preInsert() throws Exception {
        DiscountType discountType = DiscountTypeTestHelper.newInstance(null, null, "", 0, false);
        DiscountType old = dao.load(discountType.getDiscountTypePK());
        if (old != null)
            DiscountTypeTestHelper.delete(old);
        return discountType;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param discountType instance to insert
     * @throws Exception
     */
    private void doInsert(DiscountType discountType) {
        DiscountTypeTestHelper.save(discountType);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param discountType inserted instance
     * @throws Exception
     */
    private void afterInsert(DiscountType discountType) {
        DiscountType anotherDiscountType = dao.load(discountType.getDiscountTypePK());
        assertEquals("Queried result does not equal to inserted instance",
                discountType, anotherDiscountType);
        DiscountTypeTestHelper.delete(anotherDiscountType);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>DiscountType</Code> instance
     * @throws Exception
     * @see DiscountTypeTest#prepare()
     */
    private DiscountType preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param discountType object to update
     * @throws Exception
     */
    private void doUpdate(DiscountType discountType) throws Exception {
        DiscountTypeTestHelper.modifyObject(discountType);
        dao.update(discountType);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param discountType object to update
     * @throws Exception
     */
    private void afterUpdate(DiscountType discountType) throws Exception {
        DiscountType another = dao.load(discountType.getDiscountTypePK());
        assertEquals("Queried result does not equal to updated instance", discountType, another);
        DiscountTypeTestHelper.delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>DiscountType</Code> instance
     * @throws Exception
     * @see DiscountTypeTest#prepare()
     */
    private DiscountType preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param discountType object to delete
     * @throws Exception
     */
    private void doDelete(DiscountType discountType) throws Exception {
        DiscountTypeTestHelper.delete(discountType);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param discountType deleted object
     * @throws Exception
     */
    private void afterDelete(DiscountType discountType) throws Exception {
        DiscountType another = dao.load(discountType.getDiscountTypePK());
        assertNull("Inserted instance is not deleted", another);
    }


    /**
     * Do function <tt>FindByDiscountTypeName</tt> test preparation. Delete <Code>DiscountType</Code>
     * instances whose property discountTypeName's value is discountTypeName from persistent store. Then Create
     * multiple <Code>DiscountType</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByDiscountTypeName(java.lang.String discountTypeName) throws Exception {
        List discountTypes = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldDiscountTypes = dao.findByDiscountTypeName(discountTypeName);

        if (oldDiscountTypes != null) {
            Iterator it = oldDiscountTypes.iterator();
            while (it.hasNext())
                DiscountTypeTestHelper.delete((DiscountType) it.next());
        }

        // Create instances of random count, set their discountTypeName value to discountTypeName
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            DiscountType discountType = DiscountTypeTestHelper.newInstance(null, null, "", 0, false);
            discountType.setDiscountTypeName(discountTypeName);
            deleteBeforeSave(discountType);
            dao.commitTransaction();
            discountTypes.add(i, discountType);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return discountTypes;
    }

    /**
     * Perform <tt>FindByDiscountTypeName</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByDiscountTypeName(java.lang.String discountTypeName) {
        return dao.findByDiscountTypeName(discountTypeName);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByDiscountTypeNamet</tt>.
     *
     * @param discountTypes inserted instance list
     * @param resultFound   result instance list
     * @throws Exception
     */
    private void afterFindByDiscountTypeName(List discountTypes, List resultFound) {
        if (discountTypes != null && discountTypes.size() > 0) {
            assertNotNull("Result returned by find-by-discountTypeName is null.", resultFound);
            assertEquals("Result count returned by find-by-discountTypeName is incorrect.", discountTypes.size(), resultFound.size());

            Iterator it = discountTypes.iterator();
            while (it.hasNext()) {
                DiscountType discountType = (DiscountType) it.next();
                DiscountType another = DiscountTypeTestHelper.getDiscountTypeByPk(resultFound, discountType.getDiscountTypePK());
                assertEquals("Result returned by find-by-discountTypeName does not equal to inserted discountType object.", discountType, another);
                DiscountTypeTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>getDiscountTypeList</tt> test preparation.  First delete any <Code>DiscountType</Code>
     * instance from persistent store if exists. Then create multiple <Code>DiscountType</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetDiscountTypeList() throws Exception {
        List discountTypes = new ArrayList();
        dao.setAutoCommit(false);

        List oldDiscountTypes = dao.getDiscountTypeList();

        if (oldDiscountTypes != null) {
            Iterator it = oldDiscountTypes.iterator();
            while (it.hasNext())
                DiscountTypeTestHelper.delete((DiscountType) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            DiscountType discountType = prepare();
            dao.update(discountType);
            dao.commitTransaction();
            discountTypes.add(i, discountType);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return discountTypes;
    }

    /**
     * Perform <tt>getDiscountTypeList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetDiscountTypeList() throws Exception {
        return dao.getDiscountTypeList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getDiscountTypeList</tt>.
     *
     * @param discountTypes inserted instance list
     * @param resultFound   result instance list
     * @throws Exception
     */
    private void afterGetDiscountTypeList(List discountTypes, List resultFound) {
        if (discountTypes != null && discountTypes.size() > 0) {
            assertNotNull("Result returned by get-discountType-list is null.", resultFound);
            assertEquals("Result count returned by get-discountType-list is incorrect.", discountTypes.size(), resultFound.size());

            Iterator it = discountTypes.iterator();
            while (it.hasNext()) {
                DiscountType discountType = (DiscountType) it.next();
                DiscountType another = DiscountTypeTestHelper.getDiscountTypeByPk(resultFound, discountType.getDiscountTypePK());
                assertEquals("Result returned by get-discountType-list does not equal to inserted discountType object.", discountType, another);
                DiscountTypeTestHelper.delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>DiscountType</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>DiscountType</Code> instance
     * @throws Exception
     */
    private DiscountType prepare() {
        DiscountType discountType = DiscountTypeTestHelper.newInstance(null, null, "", 0, false);
        return deleteBeforeSave(discountType);
    }

    /**
     * For a new <Code>DiscountType</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param discountType
     * @return newly created and saved <Code>DiscountType</Code> instance
     * @throws Exception
     */
    private DiscountType deleteBeforeSave(DiscountType discountType) {
        // Delete instance from data store if already exists
        DiscountType old = dao.load(discountType.getDiscountTypePK());
        if (old != null)
            DiscountTypeTestHelper.delete(old);
        DiscountTypeTestHelper.save(discountType);
        return discountType;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getDiscountTypeDao();
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
     * @return test suite containing test class <Code>DiscountTypeTest</Code>
     */
    public static Test suite() {
        return new TestSuite(DiscountTypeTest.class);
    }
}