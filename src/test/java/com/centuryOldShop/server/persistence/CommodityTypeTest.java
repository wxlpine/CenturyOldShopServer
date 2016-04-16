/***********************************************************************
 * Module:  CommodityTypeTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class CommodityType's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.CommodityTypeDao;
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
 * Test case class to test CommodityType's persistence
 */
@SuppressWarnings("ALL")
public class CommodityTypeTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    CommodityTypeDao dao;

    private Log logger = LogFactory.getLog(CommodityTypeTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public CommodityTypeTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>CommodityType</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        CommodityType commodityType = null;
        // Create new instance, delete instance if exists in database
        commodityType = preInsert();
        // Perform insert
        doInsert(commodityType);
        // Do assert
        afterInsert(commodityType);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>CommodityType</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        CommodityType commodityType = null;
        // Create and insert new instance
        commodityType = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(commodityType);
        // Do assert
        afterUpdate(commodityType);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>CommodityType</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        CommodityType commodityType = null;
        // Insert new CommodityType instance
        commodityType = preDelete();
        // Perform delete
        doDelete(commodityType);
        // Do assert
        afterDelete(commodityType);
        logger.debug("Test delete ends!");
    }

    /**
     * Test function getCommodityTypeList. First create multiple <Code>CommodityType</Code>
     * instances and save them by <tt>preGetCommodityTypeList</tt>. Then delegate the
     * find all operation to method <tt>doGetCommodityTypeList</tt>. In the end do asserts
     * in <tt>afterGetCommodityTypeList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetCommodityTypeList() throws Exception {
        logger.debug("Test get-commodityType-list begins!");

        List commodityTypes = new ArrayList();
        // Insert CommodityType instance
        commodityTypes = preGetCommodityTypeList();
        // Perform query
        List result = doGetCommodityTypeList();
        // Make assertion
        afterGetCommodityTypeList(commodityTypes, result);
        logger.debug("Test get-commodityType-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>CommodityType</Code> instance
     * @throws Exception
     */
    private CommodityType preInsert() throws Exception {
        CommodityType commodityType = CommodityTypeTestHelper.newInstance(null, null, "", 0, false);
        CommodityType old = dao.load(commodityType.getCommodityTypePK());
        if (old != null)
            CommodityTypeTestHelper.delete(old);
        return commodityType;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param commodityType instance to insert
     * @throws Exception
     */
    private void doInsert(CommodityType commodityType) {
        CommodityTypeTestHelper.save(commodityType);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param commodityType inserted instance
     * @throws Exception
     */
    private void afterInsert(CommodityType commodityType) {
        CommodityType anotherCommodityType = dao.load(commodityType.getCommodityTypePK());
        assertEquals("Queried result does not equal to inserted instance",
                commodityType, anotherCommodityType);
        CommodityTypeTestHelper.delete(anotherCommodityType);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>CommodityType</Code> instance
     * @throws Exception
     * @see CommodityTypeTest#prepare()
     */
    private CommodityType preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param commodityType object to update
     * @throws Exception
     */
    private void doUpdate(CommodityType commodityType) throws Exception {
        CommodityTypeTestHelper.modifyObject(commodityType);
        dao.update(commodityType);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param commodityType object to update
     * @throws Exception
     */
    private void afterUpdate(CommodityType commodityType) throws Exception {
        CommodityType another = dao.load(commodityType.getCommodityTypePK());
        assertEquals("Queried result does not equal to updated instance", commodityType, another);
        CommodityTypeTestHelper.delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>CommodityType</Code> instance
     * @throws Exception
     * @see CommodityTypeTest#prepare()
     */
    private CommodityType preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param commodityType object to delete
     * @throws Exception
     */
    private void doDelete(CommodityType commodityType) throws Exception {
        CommodityTypeTestHelper.delete(commodityType);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param commodityType deleted object
     * @throws Exception
     */
    private void afterDelete(CommodityType commodityType) throws Exception {
        CommodityType another = dao.load(commodityType.getCommodityTypePK());
        assertNull("Inserted instance is not deleted", another);
    }

    /**
     * Do function <tt>getCommodityTypeList</tt> test preparation.  First delete any <Code>CommodityType</Code>
     * instance from persistent store if exists. Then create multiple <Code>CommodityType</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetCommodityTypeList() throws Exception {
        List commodityTypes = new ArrayList();
        dao.setAutoCommit(false);

        List oldCommodityTypes = dao.getCommodityTypeList();

        if (oldCommodityTypes != null) {
            Iterator it = oldCommodityTypes.iterator();
            while (it.hasNext())
                CommodityTypeTestHelper.delete((CommodityType) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            CommodityType commodityType = prepare();
            dao.update(commodityType);
            dao.commitTransaction();
            commodityTypes.add(i, commodityType);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return commodityTypes;
    }

    /**
     * Perform <tt>getCommodityTypeList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetCommodityTypeList() throws Exception {
        return dao.getCommodityTypeList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getCommodityTypeList</tt>.
     *
     * @param commodityTypes inserted instance list
     * @param resultFound    result instance list
     * @throws Exception
     */
    private void afterGetCommodityTypeList(List commodityTypes, List resultFound) {
        if (commodityTypes != null && commodityTypes.size() > 0) {
            assertNotNull("Result returned by get-commodityType-list is null.", resultFound);
            assertEquals("Result count returned by get-commodityType-list is incorrect.", commodityTypes.size(), resultFound.size());

            Iterator it = commodityTypes.iterator();
            while (it.hasNext()) {
                CommodityType commodityType = (CommodityType) it.next();
                CommodityType another = CommodityTypeTestHelper.getCommodityTypeByPk(resultFound, commodityType.getCommodityTypePK());
                assertEquals("Result returned by get-commodityType-list does not equal to inserted commodityType object.", commodityType, another);
                CommodityTypeTestHelper.delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>CommodityType</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>CommodityType</Code> instance
     * @throws Exception
     */
    private CommodityType prepare() {
        CommodityType commodityType = CommodityTypeTestHelper.newInstance(null, null, "", 0, false);
        return deleteBeforeSave(commodityType);
    }

    /**
     * For a new <Code>CommodityType</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param commodityType
     * @return newly created and saved <Code>CommodityType</Code> instance
     * @throws Exception
     */
    private CommodityType deleteBeforeSave(CommodityType commodityType) {
        // Delete instance from data store if already exists
        CommodityType old = dao.load(commodityType.getCommodityTypePK());
        if (old != null)
            CommodityTypeTestHelper.delete(old);
        CommodityTypeTestHelper.save(commodityType);
        return commodityType;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getCommodityTypeDao();
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
     * @return test suite containing test class <Code>CommodityTypeTest</Code>
     */
    public static Test suite() {
        return new TestSuite(CommodityTypeTest.class);
    }
}