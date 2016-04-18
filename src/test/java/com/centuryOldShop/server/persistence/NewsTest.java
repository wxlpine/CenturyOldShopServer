/***********************************************************************
 * Module:  NewsTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class News's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.NewsDao;
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

import static com.centuryOldShop.server.persistence.NewsTestHelper.unitTestEquals;

/**
 * Test case class to test News's persistence
 */
@SuppressWarnings("ALL")
public class NewsTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    NewsDao dao;

    private Log logger = LogFactory.getLog(NewsTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public NewsTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>News</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        News news = null;
        // Create new instance, delete instance if exists in database
        news = preInsert();
        // Perform insert
        doInsert(news);
        // Do assert
        afterInsert(news);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>News</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        News news = null;
        // Create and insert new instance
        news = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(news);
        // Do assert
        afterUpdate(news);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>News</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        News news = null;
        // Insert new News instance
        news = preDelete();
        // Perform delete
        doDelete(news);
        // Do assert
        afterDelete(news);
        logger.debug("Test delete ends!");
    }


    /**
     * Test query function </tt>findByTitle</tt>. First create multiple
     * <Code>News</Code> instances and save them by <tt>preFindByTitle</tt>.
     * Then delegate the query operation to method <tt>doFindByTitle</tt>.
     * In the end do some asserts in <tt>afterFindByTitle</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByTitle() throws Exception {

        logger.debug("Test find-by-title begins!");
        java.lang.String title = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List newss = new ArrayList();
        // Create and insert title instances
        newss = preFindByTitle(title);
        // Perform query
        List result = doFindByTitle(title);
        // Do asserts
        afterFindByTitle(newss, result);
        logger.debug("Test find-by-title ends!");

    }

    /**
     * Test query function </tt>findByContentUrl</tt>. First create multiple
     * <Code>News</Code> instances and save them by <tt>preFindByContentUrl</tt>.
     * Then delegate the query operation to method <tt>doFindByContentUrl</tt>.
     * In the end do some asserts in <tt>afterFindByContentUrl</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByContentUrl() throws Exception {

        logger.debug("Test find-by-contentUrl begins!");
        java.lang.String contentUrl = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List newss = new ArrayList();
        // Create and insert contentUrl instances
        newss = preFindByContentUrl(contentUrl);
        // Perform query
        List result = doFindByContentUrl(contentUrl);
        // Do asserts
        afterFindByContentUrl(newss, result);
        logger.debug("Test find-by-contentUrl ends!");

    }

    /**
     * Test query function </tt>findByPublishTime</tt>. First create multiple
     * <Code>News</Code> instances and save them by <tt>preFindByPublishTime</tt>.
     * Then delegate the query operation to method <tt>doFindByPublishTime</tt>.
     * In the end do some asserts in <tt>afterFindByPublishTime</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByPublishTime() throws Exception {

        logger.debug("Test find-by-publishTime begins!");
        java.util.Date publishTime = com.centuryOldShop.server.Util.getRandomDate();
        List newss = new ArrayList();
        // Create and insert publishTime instances
        newss = preFindByPublishTime(publishTime);
        // Perform query
        List result = doFindByPublishTime(publishTime);
        // Do asserts
        afterFindByPublishTime(newss, result);
        logger.debug("Test find-by-publishTime ends!");

    }

    /**
     * Test query function </tt>findByReadCount</tt>. First create multiple
     * <Code>News</Code> instances and save them by <tt>preFindByReadCount</tt>.
     * Then delegate the query operation to method <tt>doFindByReadCount</tt>.
     * In the end do some asserts in <tt>afterFindByReadCount</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByReadCount() throws Exception {

        logger.debug("Test find-by-readCount begins!");
        int readCount = random.nextInt();
        List newss = new ArrayList();
        // Create and insert readCount instances
        newss = preFindByReadCount(readCount);
        // Perform query
        List result = doFindByReadCount(readCount);
        // Do asserts
        afterFindByReadCount(newss, result);
        logger.debug("Test find-by-readCount ends!");

    }

    /**
     * Test query function </tt>findBySpotScene</tt>. First create multiple
     * <Code>News</Code> instances and save them by <tt>preFindBySpotScene</tt>.
     * Then delegate the query operation to method <tt>doFindBySpotScene</tt>.
     * In the end do some asserts in <tt>afterFindBySpotScene</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindBySpotScene() throws Exception {

        logger.debug("Test find-by-spotScene begins!");
        java.lang.String spotScene = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List newss = new ArrayList();
        // Create and insert spotScene instances
        newss = preFindBySpotScene(spotScene);
        // Perform query
        List result = doFindBySpotScene(spotScene);
        // Do asserts
        afterFindBySpotScene(newss, result);
        logger.debug("Test find-by-spotScene ends!");

    }

    /**
     * Test function getNewsList. First create multiple <Code>News</Code>
     * instances and save them by <tt>preGetNewsList</tt>. Then delegate the
     * find all operation to method <tt>doGetNewsList</tt>. In the end do asserts
     * in <tt>afterGetNewsList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetNewsList() throws Exception {
        logger.debug("Test get-news-list begins!");

        List newss = new ArrayList();
        // Insert News instance
        newss = preGetNewsList();
        // Perform query
        List result = doGetNewsList();
        // Make assertion
        afterGetNewsList(newss, result);
        logger.debug("Test get-news-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>News</Code> instance
     * @throws Exception
     */
    private News preInsert() throws Exception {
        News news = NewsTestHelper.newInstance(null, null, "", 0, false);
        News old = dao.load(news.getNewsPK());
        if (old != null)
            NewsTestHelper.delete(old);
        return news;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param news instance to insert
     * @throws Exception
     */
    private void doInsert(News news) {
        NewsTestHelper.save(news);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param news inserted instance
     * @throws Exception
     */
    private void afterInsert(News news) {
        News anotherNews = dao.load(news.getNewsPK());
        assertTrue(
                String.format("Queried result does not equal to inserted instance" +
                                "\nExpected: %s\n" +
                                "Actual: %s",
                        news, anotherNews),
                unitTestEquals(news, anotherNews)
        );
        NewsTestHelper.delete(anotherNews);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>News</Code> instance
     * @throws Exception
     * @see NewsTest#prepare()
     */
    private News preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param news object to update
     * @throws Exception
     */
    private void doUpdate(News news) throws Exception {
        NewsTestHelper.modifyObject(news);
        dao.update(news);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param news object to update
     * @throws Exception
     */
    private void afterUpdate(News news) throws Exception {
        News another = dao.load(news.getNewsPK());
        assertTrue(
                String.format("Queried result does not equal to updated instance" +
                                "\nExpected: %s\n" +
                                "Actual: %s",
                        news, another),
                unitTestEquals(news, another)
        );
        NewsTestHelper.delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>News</Code> instance
     * @throws Exception
     * @see NewsTest#prepare()
     */
    private News preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param news object to delete
     * @throws Exception
     */
    private void doDelete(News news) throws Exception {
        NewsTestHelper.delete(news);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param news deleted object
     * @throws Exception
     */
    private void afterDelete(News news) throws Exception {
        News another = dao.load(news.getNewsPK());
        assertNull("Inserted instance is not deleted", another);
    }


    /**
     * Do function <tt>FindByTitle</tt> test preparation. Delete <Code>News</Code>
     * instances whose property title's value is title from persistent store. Then Create
     * multiple <Code>News</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByTitle(java.lang.String title) throws Exception {
        List newss = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldNewss = dao.findByTitle(title);

        if (oldNewss != null) {
            Iterator it = oldNewss.iterator();
            while (it.hasNext())
                NewsTestHelper.delete((News) it.next());
        }

        // Create instances of random count, set their title value to title
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            News news = NewsTestHelper.newInstance(null, null, "", 0, false);
            news.setTitle(title);
            deleteBeforeSave(news);
            dao.commitTransaction();
            newss.add(i, news);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return newss;
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
     * @param newss       inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByTitle(List newss, List resultFound) {
        if (newss != null && newss.size() > 0) {
            assertNotNull("Result returned by find-by-title is null.", resultFound);
            assertEquals("Result count returned by find-by-title is incorrect.", newss.size(), resultFound.size());

            Iterator it = newss.iterator();
            while (it.hasNext()) {
                News news = (News) it.next();
                News another = NewsTestHelper.getNewsByPk(resultFound, news.getNewsPK());
                assertTrue(
                        String.format("Result returned by find-by-title does not equal to inserted news object." +
                                        "\nExpected: %s\n" +
                                        "Actual: %s",
                                news, another),
                        unitTestEquals(news, another)
                );
                NewsTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByContentUrl</tt> test preparation. Delete <Code>News</Code>
     * instances whose property contentUrl's value is contentUrl from persistent store. Then Create
     * multiple <Code>News</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByContentUrl(java.lang.String contentUrl) throws Exception {
        List newss = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldNewss = dao.findByContentUrl(contentUrl);

        if (oldNewss != null) {
            Iterator it = oldNewss.iterator();
            while (it.hasNext())
                NewsTestHelper.delete((News) it.next());
        }

        // Create instances of random count, set their contentUrl value to contentUrl
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            News news = NewsTestHelper.newInstance(null, null, "", 0, false);
            news.setContentUrl(contentUrl);
            deleteBeforeSave(news);
            dao.commitTransaction();
            newss.add(i, news);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return newss;
    }

    /**
     * Perform <tt>FindByContentUrl</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByContentUrl(java.lang.String contentUrl) {
        return dao.findByContentUrl(contentUrl);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByContentUrlt</tt>.
     *
     * @param newss       inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByContentUrl(List newss, List resultFound) {
        if (newss != null && newss.size() > 0) {
            assertNotNull("Result returned by find-by-contentUrl is null.", resultFound);
            assertEquals("Result count returned by find-by-contentUrl is incorrect.", newss.size(), resultFound.size());

            Iterator it = newss.iterator();
            while (it.hasNext()) {
                News news = (News) it.next();
                News another = NewsTestHelper.getNewsByPk(resultFound, news.getNewsPK());
                assertTrue(
                        String.format("Result returned by find-by-contentUrl does not equal to inserted news object." +
                                        "\nExpected: %s\n" +
                                        "Actual: %s",
                                news, another),
                        unitTestEquals(news, another)
                );
                NewsTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByPublishTime</tt> test preparation. Delete <Code>News</Code>
     * instances whose property publishTime's value is publishTime from persistent store. Then Create
     * multiple <Code>News</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByPublishTime(java.util.Date publishTime) throws Exception {
        List newss = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldNewss = dao.findByPublishTime(publishTime);

        if (oldNewss != null) {
            Iterator it = oldNewss.iterator();
            while (it.hasNext())
                NewsTestHelper.delete((News) it.next());
        }

        // Create instances of random count, set their publishTime value to publishTime
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            News news = NewsTestHelper.newInstance(null, null, "", 0, false);
            news.setPublishTime(publishTime);
            deleteBeforeSave(news);
            dao.commitTransaction();
            newss.add(i, news);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return newss;
    }

    /**
     * Perform <tt>FindByPublishTime</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByPublishTime(java.util.Date publishTime) {
        return dao.findByPublishTime(publishTime);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByPublishTimet</tt>.
     *
     * @param newss       inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByPublishTime(List newss, List resultFound) {
        if (newss != null && newss.size() > 0) {
            assertNotNull("Result returned by find-by-publishTime is null.", resultFound);
            assertEquals("Result count returned by find-by-publishTime is incorrect.", newss.size(), resultFound.size());

            Iterator it = newss.iterator();
            while (it.hasNext()) {
                News news = (News) it.next();
                News another = NewsTestHelper.getNewsByPk(resultFound, news.getNewsPK());
                assertTrue(
                        String.format("Result returned by find-by-publishTime does not equal to inserted news object." +
                                        "\nExpected: %s\n" +
                                        "Actual: %s",
                                news, another),
                        unitTestEquals(news, another)
                );
                NewsTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByReadCount</tt> test preparation. Delete <Code>News</Code>
     * instances whose property readCount's value is readCount from persistent store. Then Create
     * multiple <Code>News</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByReadCount(int readCount) throws Exception {
        List newss = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldNewss = dao.findByReadCount(readCount);

        if (oldNewss != null) {
            Iterator it = oldNewss.iterator();
            while (it.hasNext())
                NewsTestHelper.delete((News) it.next());
        }

        // Create instances of random count, set their readCount value to readCount
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            News news = NewsTestHelper.newInstance(null, null, "", 0, false);
            news.setReadCount(readCount);
            deleteBeforeSave(news);
            dao.commitTransaction();
            newss.add(i, news);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return newss;
    }

    /**
     * Perform <tt>FindByReadCount</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByReadCount(int readCount) {
        return dao.findByReadCount(readCount);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByReadCountt</tt>.
     *
     * @param newss       inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindByReadCount(List newss, List resultFound) {
        if (newss != null && newss.size() > 0) {
            assertNotNull("Result returned by find-by-readCount is null.", resultFound);
            assertEquals("Result count returned by find-by-readCount is incorrect.", newss.size(), resultFound.size());

            Iterator it = newss.iterator();
            while (it.hasNext()) {
                News news = (News) it.next();
                News another = NewsTestHelper.getNewsByPk(resultFound, news.getNewsPK());
                assertTrue(
                        String.format("Result returned by find-by-readCount does not equal to inserted news object." +
                                        "\nExpected: %s\n" +
                                        "Actual: %s",
                                news, another),
                        unitTestEquals(news, another)
                );
                NewsTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindBySpotScene</tt> test preparation. Delete <Code>News</Code>
     * instances whose property spotScene's value is spotScene from persistent store. Then Create
     * multiple <Code>News</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindBySpotScene(java.lang.String spotScene) throws Exception {
        List newss = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldNewss = dao.findBySpotScene(spotScene);

        if (oldNewss != null) {
            Iterator it = oldNewss.iterator();
            while (it.hasNext())
                NewsTestHelper.delete((News) it.next());
        }

        // Create instances of random count, set their spotScene value to spotScene
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            News news = NewsTestHelper.newInstance(null, null, "", 0, false);
            news.setSpotScene(spotScene);
            deleteBeforeSave(news);
            dao.commitTransaction();
            newss.add(i, news);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return newss;
    }

    /**
     * Perform <tt>FindBySpotScene</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindBySpotScene(java.lang.String spotScene) {
        return dao.findBySpotScene(spotScene);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findBySpotScenet</tt>.
     *
     * @param newss       inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterFindBySpotScene(List newss, List resultFound) {
        if (newss != null && newss.size() > 0) {
            assertNotNull("Result returned by find-by-spotScene is null.", resultFound);
            assertEquals("Result count returned by find-by-spotScene is incorrect.", newss.size(), resultFound.size());

            Iterator it = newss.iterator();
            while (it.hasNext()) {
                News news = (News) it.next();
                News another = NewsTestHelper.getNewsByPk(resultFound, news.getNewsPK());
                assertTrue(
                        String.format("Result returned by find-by-spotScene does not equal to inserted news object." +
                                        "\nExpected: %s\n" +
                                        "Actual: %s",
                                news, another),
                        unitTestEquals(news, another)
                );
                NewsTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>getNewsList</tt> test preparation.  First delete any <Code>News</Code>
     * instance from persistent store if exists. Then create multiple <Code>News</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetNewsList() throws Exception {
        List newss = new ArrayList();
        dao.setAutoCommit(false);

        List oldNewss = dao.getNewsList();

        if (oldNewss != null) {
            Iterator it = oldNewss.iterator();
            while (it.hasNext())
                NewsTestHelper.delete((News) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            News news = prepare();
            dao.update(news);
            dao.commitTransaction();
            newss.add(i, news);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return newss;
    }

    /**
     * Perform <tt>getNewsList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetNewsList() throws Exception {
        return dao.getNewsList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getNewsList</tt>.
     *
     * @param newss       inserted instance list
     * @param resultFound result instance list
     * @throws Exception
     */
    private void afterGetNewsList(List newss, List resultFound) {
        if (newss != null && newss.size() > 0) {
            assertNotNull("Result returned by get-news-list is null.", resultFound);
            assertEquals("Result count returned by get-news-list is incorrect.", newss.size(), resultFound.size());

            Iterator it = newss.iterator();
            while (it.hasNext()) {
                News news = (News) it.next();
                News another = NewsTestHelper.getNewsByPk(resultFound, news.getNewsPK());
                assertTrue(
                        String.format("Result returned by get-news-list does not equal to inserted news object." +
                                        "\nExpected: %s\n" +
                                        "Actual: %s",
                                news, another),
                        unitTestEquals(news, another)
                );
                NewsTestHelper.delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>News</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>News</Code> instance
     * @throws Exception
     */
    private News prepare() {
        News news = NewsTestHelper.newInstance(null, null, "", 0, false);
        return deleteBeforeSave(news);
    }

    /**
     * For a new <Code>News</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param news
     * @return newly created and saved <Code>News</Code> instance
     * @throws Exception
     */
    private News deleteBeforeSave(News news) {
        // Delete instance from data store if already exists
        News old = dao.load(news.getNewsPK());
        if (old != null)
            NewsTestHelper.delete(old);
        NewsTestHelper.save(news);
        return news;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getNewsDao();
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
     * @return test suite containing test class <Code>NewsTest</Code>
     */
    public static Test suite() {
        return new TestSuite(NewsTest.class);
    }
}