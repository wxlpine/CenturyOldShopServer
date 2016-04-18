/***********************************************************************
 * Module:  AppUserTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class AppUser's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.AppUserDao;
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

import static com.centuryOldShop.server.persistence.AppUserTestHelper.*;

/**
 * Test case class to test AppUser's persistence
 */
@SuppressWarnings("ALL")
public class AppUserTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    AppUserDao dao;

    private Log logger = LogFactory.getLog(AppUserTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public AppUserTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>AppUser</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        AppUser appUser = null;
        // Create new instance, delete instance if exists in database
        appUser = preInsert();
        // Perform insert
        doInsert(appUser);
        // Do assert
        afterInsert(appUser);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>AppUser</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        AppUser appUser = null;
        // Create and insert new instance
        appUser = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(appUser);
        // Do assert
        afterUpdate(appUser);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>AppUser</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        AppUser appUser = null;
        // Insert new AppUser instance
        appUser = preDelete();
        // Perform delete
        doDelete(appUser);
        // Do assert
        afterDelete(appUser);
        logger.debug("Test delete ends!");
    }


    /**
     * Test query function </tt>findByUserName</tt>. First create multiple
     * <Code>AppUser</Code> instances and save them by <tt>preFindByUserName</tt>.
     * Then delegate the query operation to method <tt>doFindByUserName</tt>.
     * In the end do some asserts in <tt>afterFindByUserName</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByUserName() throws Exception {

        logger.debug("Test find-by-userName begins!");
        java.lang.String userName = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List appUsers = new ArrayList();
        // Create and insert userName instances
        appUsers = preFindByUserName(userName);
        // Perform query
        List result = doFindByUserName(userName);
        // Do asserts
        afterFindByUserName(appUsers, result);
        logger.debug("Test find-by-userName ends!");

    }


    /**
     * Test query function </tt>findByEmail</tt>. First create multiple
     * <Code>AppUser</Code> instances and save them by <tt>preFindByEmail</tt>.
     * Then delegate the query operation to method <tt>doFindByEmail</tt>.
     * In the end do some asserts in <tt>afterFindByEmail</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByEmail() throws Exception {

        logger.debug("Test find-by-email begins!");
        java.lang.String email = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List appUsers = new ArrayList();
        // Create and insert email instances
        appUsers = preFindByEmail(email);
        // Perform query
        List result = doFindByEmail(email);
        // Do asserts
        afterFindByEmail(appUsers, result);
        logger.debug("Test find-by-email ends!");

    }

    /**
     * Test query function </tt>findByPhoneNumber</tt>. First create multiple
     * <Code>AppUser</Code> instances and save them by <tt>preFindByPhoneNumber</tt>.
     * Then delegate the query operation to method <tt>doFindByPhoneNumber</tt>.
     * In the end do some asserts in <tt>afterFindByPhoneNumber</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByPhoneNumber() throws Exception {

        logger.debug("Test find-by-phoneNumber begins!");
        java.lang.String phoneNumber = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List appUsers = new ArrayList();
        // Create and insert phoneNumber instances
        appUsers = preFindByPhoneNumber(phoneNumber);
        // Perform query
        List result = doFindByPhoneNumber(phoneNumber);
        // Do asserts
        afterFindByPhoneNumber(appUsers, result);
        logger.debug("Test find-by-phoneNumber ends!");

    }

    /**
     * Test query function </tt>findByUserType</tt>. First create multiple
     * <Code>AppUser</Code> instances and save them by <tt>preFindByUserType</tt>.
     * Then delegate the query operation to method <tt>doFindByUserType</tt>.
     * In the end do some asserts in <tt>afterFindByUserType</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByUserType() throws Exception {

        logger.debug("Test find-by-userType begins!");
        short userType = getRandomUserType();
        List appUsers = new ArrayList();
        // Create and insert userType instances
        appUsers = preFindByUserType(userType);
        // Perform query
        List result = doFindByUserType(userType);
        // Do asserts
        afterFindByUserType(appUsers, result);
        logger.debug("Test find-by-userType ends!");

    }

    /**
     * Test query function </tt>findByHeadPortraitUrl</tt>. First create multiple
     * <Code>AppUser</Code> instances and save them by <tt>preFindByHeadPortraitUrl</tt>.
     * Then delegate the query operation to method <tt>doFindByHeadPortraitUrl</tt>.
     * In the end do some asserts in <tt>afterFindByHeadPortraitUrl</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByHeadPortraitUrl() throws Exception {

        logger.debug("Test find-by-headPortraitUrl begins!");
        java.lang.String headPortraitUrl = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List appUsers = new ArrayList();
        // Create and insert headPortraitUrl instances
        appUsers = preFindByHeadPortraitUrl(headPortraitUrl);
        // Perform query
        List result = doFindByHeadPortraitUrl(headPortraitUrl);
        // Do asserts
        afterFindByHeadPortraitUrl(appUsers, result);
        logger.debug("Test find-by-headPortraitUrl ends!");

    }

    /**
     * Test query function </tt>findByRegisterTime</tt>. First create multiple
     * <Code>AppUser</Code> instances and save them by <tt>preFindByRegisterTime</tt>.
     * Then delegate the query operation to method <tt>doFindByRegisterTime</tt>.
     * In the end do some asserts in <tt>afterFindByRegisterTime</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByRegisterTime() throws Exception {

        logger.debug("Test find-by-registerTime begins!");
        java.util.Date registerTime = com.centuryOldShop.server.Util.getRandomDate();
        List appUsers = new ArrayList();
        // Create and insert registerTime instances
        appUsers = preFindByRegisterTime(registerTime);
        // Perform query
        List result = doFindByRegisterTime(registerTime);
        // Do asserts
        afterFindByRegisterTime(appUsers, result);
        logger.debug("Test find-by-registerTime ends!");

    }

    /**
     * Test function getAppUserList. First create multiple <Code>AppUser</Code>
     * instances and save them by <tt>preGetAppUserList</tt>. Then delegate the
     * find all operation to method <tt>doGetAppUserList</tt>. In the end do asserts
     * in <tt>afterGetAppUserList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetAppUserList() throws Exception {
        logger.debug("Test get-appUser-list begins!");

        List appUsers = new ArrayList();
        // Insert AppUser instance
        appUsers = preGetAppUserList();
        // Perform query
        List result = doGetAppUserList();
        // Make assertion
        afterGetAppUserList(appUsers, result);
        logger.debug("Test get-appUser-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>AppUser</Code> instance
     * @throws Exception
     */
    private AppUser preInsert() throws Exception {
        AppUser appUser = newInstance(null, null, "", 0, false);
        AppUser old = dao.load(appUser.getAppUserPK());
        if (old != null)
            delete(old);
        return appUser;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param appUser instance to insert
     * @throws Exception
     */
    private void doInsert(AppUser appUser) {
        save(appUser);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param appUser inserted instance
     * @throws Exception
     */
    private void afterInsert(AppUser appUser) {
        AppUser anotherAppUser = dao.load(appUser.getAppUserPK());
        assertTrue(
                String.format("Queried result does not equal to inserted instance" +
                                "\nExpected: %s\n" +
                                "Actual: %s",
                        appUser, anotherAppUser),
                unitTestEquals(appUser, anotherAppUser)
        );
        delete(anotherAppUser);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>AppUser</Code> instance
     * @throws Exception
     * @see AppUserTest#prepare()
     */
    private AppUser preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param appUser object to update
     * @throws Exception
     */
    private void doUpdate(AppUser appUser) throws Exception {
        modifyObject(appUser);
        dao.update(appUser);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param appUser object to update
     * @throws Exception
     */
    private void afterUpdate(AppUser appUser) throws Exception {
        AppUser another = dao.load(appUser.getAppUserPK());
        assertTrue(
                String.format("Queried result does not equal to updated instance" +
                                "\nExpected: %s\n" +
                                "Actual: %s",
                        appUser, another),
                unitTestEquals(appUser, another)
        );
        delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>AppUser</Code> instance
     * @throws Exception
     * @see AppUserTest#prepare()
     */
    private AppUser preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param appUser object to delete
     * @throws Exception
     */
    private void doDelete(AppUser appUser) throws Exception {
        delete(appUser);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param appUser deleted object
     * @throws Exception
     */
    private void afterDelete(AppUser appUser) throws Exception {
        AppUser another = dao.load(appUser.getAppUserPK());
        assertNull("Inserted instance is not deleted", another);
    }


    /**
     * Do function <tt>FindByUserName</tt> test preparation. Delete <Code>AppUser</Code>
     * instances whose property userName's value is userName from persistent store. Then Create
     * multiple <Code>AppUser</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByUserName(java.lang.String userName) throws Exception {
        List appUsers = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldAppUsers = dao.findByUserName(userName);

        if (oldAppUsers != null) {
            Iterator it = oldAppUsers.iterator();
            while (it.hasNext())
                delete((AppUser) it.next());
        }

        // Create instances of random count, set their userName value to userName
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            AppUser appUser = newInstance(null, null, "", 0, false);
            appUser.setUserName(userName);
            deleteBeforeSave(appUser);
            dao.commitTransaction();
            appUsers.add(i, appUser);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return appUsers;
    }

    /**
     * Perform <tt>FindByUserName</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByUserName(java.lang.String userName) {
        return dao.findByUserName(userName);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByUserNamet</tt>.
     *
     * @param appUsers    inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByUserName(List appUsers, List resultFound) {
        if (appUsers != null && appUsers.size() > 0) {
            assertNotNull("Result returned by find-by-userName is null.", resultFound);
            assertEquals("Result count returned by find-by-userName is incorrect.", appUsers.size(), resultFound.size());

            Iterator it = appUsers.iterator();
            while (it.hasNext()) {
                AppUser appUser = (AppUser) it.next();
                AppUser another = getAppUserByPk(resultFound, appUser.getAppUserPK());
                assertTrue(
                        String.format("Result returned by find-by-userName does not equal to inserted appUser object." +
                                        "\nExpected: %s\n" +
                                        "Actual: %s",
                                appUser, another),
                        unitTestEquals(appUser, another)
                );
                delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByEmail</tt> test preparation. Delete <Code>AppUser</Code>
     * instances whose property email's value is email from persistent store. Then Create
     * multiple <Code>AppUser</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByEmail(java.lang.String email) throws Exception {
        List appUsers = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldAppUsers = dao.findByEmail(email);

        if (oldAppUsers != null) {
            Iterator it = oldAppUsers.iterator();
            while (it.hasNext())
                delete((AppUser) it.next());
        }

        // Create instances of random count, set their email value to email
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            AppUser appUser = newInstance(null, null, "", 0, false);
            appUser.setEmail(email);
            deleteBeforeSave(appUser);
            dao.commitTransaction();
            appUsers.add(i, appUser);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return appUsers;
    }

    /**
     * Perform <tt>FindByEmail</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByEmail(java.lang.String email) {
        return dao.findByEmail(email);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByEmailt</tt>.
     *
     * @param appUsers    inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByEmail(List appUsers, List resultFound) {
        if (appUsers != null && appUsers.size() > 0) {
            assertNotNull("Result returned by find-by-email is null.", resultFound);
            assertEquals("Result count returned by find-by-email is incorrect.", appUsers.size(), resultFound.size());

            Iterator it = appUsers.iterator();
            while (it.hasNext()) {
                AppUser appUser = (AppUser) it.next();
                AppUser another = getAppUserByPk(resultFound, appUser.getAppUserPK());
                assertTrue(
                        String.format("Result returned by find-by-email does not equal to inserted appUser object." +
                                        "\nExpected: %s\n" +
                                        "Actual: %s",
                                appUser, another),
                        unitTestEquals(appUser, another)
                );
                delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByPhoneNumber</tt> test preparation. Delete <Code>AppUser</Code>
     * instances whose property phoneNumber's value is phoneNumber from persistent store. Then Create
     * multiple <Code>AppUser</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByPhoneNumber(java.lang.String phoneNumber) throws Exception {
        List appUsers = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldAppUsers = dao.findByPhoneNumber(phoneNumber);

        if (oldAppUsers != null) {
            Iterator it = oldAppUsers.iterator();
            while (it.hasNext())
                delete((AppUser) it.next());
        }

        // Create instances of random count, set their phoneNumber value to phoneNumber
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            AppUser appUser = newInstance(null, null, "", 0, false);
            appUser.setPhoneNumber(phoneNumber);
            deleteBeforeSave(appUser);
            dao.commitTransaction();
            appUsers.add(i, appUser);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return appUsers;
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
     * @param appUsers    inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByPhoneNumber(List appUsers, List resultFound) {
        if (appUsers != null && appUsers.size() > 0) {
            assertNotNull("Result returned by find-by-phoneNumber is null.", resultFound);
            assertEquals("Result count returned by find-by-phoneNumber is incorrect.", appUsers.size(), resultFound.size());

            Iterator it = appUsers.iterator();
            while (it.hasNext()) {
                AppUser appUser = (AppUser) it.next();
                AppUser another = getAppUserByPk(resultFound, appUser.getAppUserPK());
                assertTrue(
                        String.format("Result returned by find-by-phoneNumber does not equal to inserted appUser object." +
                                        "\nExpected: %s\n" +
                                        "Actual: %s",
                                appUser, another),
                        unitTestEquals(appUser, another)
                );
                delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByUserType</tt> test preparation. Delete <Code>AppUser</Code>
     * instances whose property userType's value is userType from persistent store. Then Create
     * multiple <Code>AppUser</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByUserType(short userType) throws Exception {
        List appUsers = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldAppUsers = dao.findByUserType(userType);

        if (oldAppUsers != null) {
            Iterator it = oldAppUsers.iterator();
            while (it.hasNext())
                delete((AppUser) it.next());
        }

        // Create instances of random count, set their userType value to userType
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            AppUser appUser = newInstance(null, null, "", 0, false);
            appUser.setUserType(userType);
            deleteBeforeSave(appUser);
            dao.commitTransaction();
            appUsers.add(i, appUser);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return appUsers;
    }

    /**
     * Perform <tt>FindByUserType</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByUserType(short userType) {
        return dao.findByUserType(userType);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByUserTypet</tt>.
     *
     * @param appUsers    inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByUserType(List appUsers, List resultFound) {
        if (appUsers != null && appUsers.size() > 0) {
            assertNotNull("Result returned by find-by-userType is null.", resultFound);
            assertEquals("Result count returned by find-by-userType is incorrect.", appUsers.size(), resultFound.size());

            Iterator it = appUsers.iterator();
            while (it.hasNext()) {
                AppUser appUser = (AppUser) it.next();
                AppUser another = getAppUserByPk(resultFound, appUser.getAppUserPK());
                assertTrue(
                        String.format("Result returned by find-by-userType does not equal to inserted appUser object." +
                                        "\nExpected: %s\n" +
                                        "Actual: %s",
                                appUser, another),
                        unitTestEquals(appUser, another)
                );
                delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByHeadPortraitUrl</tt> test preparation. Delete <Code>AppUser</Code>
     * instances whose property headPortraitUrl's value is headPortraitUrl from persistent store. Then Create
     * multiple <Code>AppUser</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByHeadPortraitUrl(java.lang.String headPortraitUrl) throws Exception {
        List appUsers = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldAppUsers = dao.findByHeadPortraitUrl(headPortraitUrl);

        if (oldAppUsers != null) {
            Iterator it = oldAppUsers.iterator();
            while (it.hasNext())
                delete((AppUser) it.next());
        }

        // Create instances of random count, set their headPortraitUrl value to headPortraitUrl
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            AppUser appUser = newInstance(null, null, "", 0, false);
            appUser.setHeadPortraitUrl(headPortraitUrl);
            deleteBeforeSave(appUser);
            dao.commitTransaction();
            appUsers.add(i, appUser);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return appUsers;
    }

    /**
     * Perform <tt>FindByHeadPortraitUrl</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByHeadPortraitUrl(java.lang.String headPortraitUrl) {
        return dao.findByHeadPortraitUrl(headPortraitUrl);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByHeadPortraitUrlt</tt>.
     *
     * @param appUsers    inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByHeadPortraitUrl(List appUsers, List resultFound) {
        if (appUsers != null && appUsers.size() > 0) {
            assertNotNull("Result returned by find-by-headPortraitUrl is null.", resultFound);
            assertEquals("Result count returned by find-by-headPortraitUrl is incorrect.", appUsers.size(), resultFound.size());

            Iterator it = appUsers.iterator();
            while (it.hasNext()) {
                AppUser appUser = (AppUser) it.next();
                AppUser another = getAppUserByPk(resultFound, appUser.getAppUserPK());
                assertTrue(
                        String.format("Result returned by find-by-headPortraitUrl does not equal to inserted appUser object." +
                                        "\nExpected: %s\n" +
                                        "Actual: %s",
                                appUser, another),
                        unitTestEquals(appUser, another)
                );
                delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByRegisterTime</tt> test preparation. Delete <Code>AppUser</Code>
     * instances whose property registerTime's value is registerTime from persistent store. Then Create
     * multiple <Code>AppUser</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByRegisterTime(java.util.Date registerTime) throws Exception {
        List appUsers = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldAppUsers = dao.findByRegisterTime(registerTime);

        if (oldAppUsers != null) {
            Iterator it = oldAppUsers.iterator();
            while (it.hasNext())
                delete((AppUser) it.next());
        }

        // Create instances of random count, set their registerTime value to registerTime
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            AppUser appUser = newInstance(null, null, "", 0, false);
            appUser.setRegisterTime(registerTime);
            deleteBeforeSave(appUser);
            dao.commitTransaction();
            appUsers.add(i, appUser);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return appUsers;
    }

    /**
     * Perform <tt>FindByRegisterTime</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByRegisterTime(java.util.Date registerTime) {
        return dao.findByRegisterTime(registerTime);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByRegisterTimet</tt>.
     *
     * @param appUsers    inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByRegisterTime(List appUsers, List resultFound) {
        if (appUsers != null && appUsers.size() > 0) {
            assertNotNull("Result returned by find-by-registerTime is null.", resultFound);
            assertEquals("Result count returned by find-by-registerTime is incorrect.", appUsers.size(), resultFound.size());

            Iterator it = appUsers.iterator();
            while (it.hasNext()) {
                AppUser appUser = (AppUser) it.next();
                AppUser another = getAppUserByPk(resultFound, appUser.getAppUserPK());
                assertTrue(
                        String.format("Result returned by find-by-registerTime does not equal to inserted appUser object." +
                                        "\nExpected: %s\n" +
                                        "Actual: %s",
                                appUser, another),
                        unitTestEquals(appUser, another)
                );
                delete(another);
            }
        }

    }

    /**
     * Do function <tt>getAppUserList</tt> test preparation.  First delete any <Code>AppUser</Code>
     * instance from persistent store if exists. Then create multiple <Code>AppUser</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetAppUserList() throws Exception {
        List appUsers = new ArrayList();
        dao.setAutoCommit(false);

        List oldAppUsers = dao.getAppUserList();

        if (oldAppUsers != null) {
            Iterator it = oldAppUsers.iterator();
            while (it.hasNext())
                delete((AppUser) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            AppUser appUser = prepare();
            dao.update(appUser);
            dao.commitTransaction();
            appUsers.add(i, appUser);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return appUsers;
    }

    /**
     * Perform <tt>getAppUserList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetAppUserList() throws Exception {
        return dao.getAppUserList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getAppUserList</tt>.
     *
     * @param appUsers    inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterGetAppUserList(List appUsers, List resultFound) {
        if (appUsers != null && appUsers.size() > 0) {
            assertNotNull("Result returned by get-appUser-list is null.", resultFound);
            assertEquals("Result count returned by get-appUser-list is incorrect.", appUsers.size(), resultFound.size());

            Iterator it = appUsers.iterator();
            while (it.hasNext()) {
                AppUser appUser = (AppUser) it.next();
                AppUser another = getAppUserByPk(resultFound, appUser.getAppUserPK());
                assertTrue(
                        String.format("Result returned by get-appUser-list does not equal to inserted appUser object." +
                                        "\nExpected: %s\n" +
                                        "Actual: %s",
                                appUser, another),
                        unitTestEquals(appUser, another)
                );
                delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>AppUser</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>AppUser</Code> instance
     * @throws Exception
     */
    private AppUser prepare() {
        AppUser appUser = newInstance(null, null, "", 0, false);
        return deleteBeforeSave(appUser);
    }

    /**
     * For a new <Code>AppUser</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param appUser
     * @return newly created and saved <Code>AppUser</Code> instance
     * @throws Exception
     */
    private AppUser deleteBeforeSave(AppUser appUser) {
        // Delete instance from data store if already exists
        AppUser old = dao.load(appUser.getAppUserPK());
        if (old != null)
            delete(old);
        save(appUser);
        return appUser;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getAppUserDao();
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
     * @return test suite containing test class <Code>AppUserTest</Code>
     */
    public static Test suite() {
        return new TestSuite(AppUserTest.class);
    }
}