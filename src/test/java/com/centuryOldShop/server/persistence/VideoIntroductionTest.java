/***********************************************************************
 * Module:  VideoIntroductionTest.java
 * Author:  cmicat
 * Purpose: Defines the test case class to test the class VideoIntroduction's persistence
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.VideoIntroductionDao;
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
 * Test case class to test VideoIntroduction's persistence
 */
@SuppressWarnings("ALL")
public class VideoIntroductionTest extends TestCase {

    Random random = new Random(1000);

    DaoFactory daoFactory = DaoFactory.getDaoFactory();

    VideoIntroductionDao dao;

    private Log logger = LogFactory.getLog(VideoIntroductionTest.class);

    /**
     * Constructor
     *
     * @param arg0 test name
     */
    public VideoIntroductionTest(String arg0) {
        super(arg0);
    }

    /**
     * Test object insert. First create a <Code>VideoIntroduction</Code> instance by
     * <tt>preInsert</tt>. Then delegate the save operation to method
     * <tt>doInsert</tt>. In the end do assert in <tt>afterInsert</tt> to
     * verify if insert succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testInsert() throws Exception {
        logger.debug("Test insert begins!");
        VideoIntroduction videoIntroduction = null;
        // Create new instance, delete instance if exists in database
        videoIntroduction = preInsert();
        // Perform insert
        doInsert(videoIntroduction);
        // Do assert
        afterInsert(videoIntroduction);
        logger.debug("Test insert ends!");
    }

    /**
     * Test object update. First create a <Code>VideoIntroduction</Code> instance and save
     * it by <tt>preUpdate</tt>. Then delegate the update operation to method
     * <tt>doUpdate</tt>. In the end do assert in <tt>afterUpdate</tt> to
     * verify if update succeeds. User can modify these methods to customize
     * the test procedure.
     *
     * @throws Exception
     */
    public void testUpdate() throws Exception {
        logger.debug("Test update begins!");
        VideoIntroduction videoIntroduction = null;
        // Create and insert new instance
        videoIntroduction = preUpdate();
        // Alter values of properties except its identifier attribut(s). Then
        // perform update
        doUpdate(videoIntroduction);
        // Do assert
        afterUpdate(videoIntroduction);
        logger.debug("Test update ends!");
    }

    /**
     * Test object delete. First create a <Code>VideoIntroduction</Code> instance and save
     * it by <tt>preDelete</tt>. Then delegate the delete operation to method
     * <tt>doDelete</tt>. In the end do assert in <tt>afterDelete</tt> to verify
     * if delete succeeds. User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testDelete() throws Exception {
        logger.debug("Test delete begins!");
        VideoIntroduction videoIntroduction = null;
        // Insert new VideoIntroduction instance
        videoIntroduction = preDelete();
        // Perform delete
        doDelete(videoIntroduction);
        // Do assert
        afterDelete(videoIntroduction);
        logger.debug("Test delete ends!");
    }


    /**
     * Test query function </tt>findByVideoUrl</tt>. First create multiple
     * <Code>VideoIntroduction</Code> instances and save them by <tt>preFindByVideoUrl</tt>.
     * Then delegate the query operation to method <tt>doFindByVideoUrl</tt>.
     * In the end do some asserts in <tt>afterFindByVideoUrl</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByVideoUrl() throws Exception {

        logger.debug("Test find-by-videoUrl begins!");
        java.lang.String videoUrl = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List videoIntroductions = new ArrayList();
        // Create and insert videoUrl instances
        videoIntroductions = preFindByVideoUrl(videoUrl);
        // Perform query
        List result = doFindByVideoUrl(videoUrl);
        // Do asserts
        afterFindByVideoUrl(videoIntroductions, result);
        logger.debug("Test find-by-videoUrl ends!");

    }

    /**
     * Test query function </tt>findByDuration</tt>. First create multiple
     * <Code>VideoIntroduction</Code> instances and save them by <tt>preFindByDuration</tt>.
     * Then delegate the query operation to method <tt>doFindByDuration</tt>.
     * In the end do some asserts in <tt>afterFindByDuration</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByDuration() throws Exception {

        logger.debug("Test find-by-duration begins!");
        int duration = random.nextInt();
        List videoIntroductions = new ArrayList();
        // Create and insert duration instances
        videoIntroductions = preFindByDuration(duration);
        // Perform query
        List result = doFindByDuration(duration);
        // Do asserts
        afterFindByDuration(videoIntroductions, result);
        logger.debug("Test find-by-duration ends!");

    }

    /**
     * Test query function </tt>findByScreenshotUrl</tt>. First create multiple
     * <Code>VideoIntroduction</Code> instances and save them by <tt>preFindByScreenshotUrl</tt>.
     * Then delegate the query operation to method <tt>doFindByScreenshotUrl</tt>.
     * In the end do some asserts in <tt>afterFindByScreenshotUrl</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByScreenshotUrl() throws Exception {

        logger.debug("Test find-by-screenshotUrl begins!");
        java.lang.String screenshotUrl = String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8))));
        List videoIntroductions = new ArrayList();
        // Create and insert screenshotUrl instances
        videoIntroductions = preFindByScreenshotUrl(screenshotUrl);
        // Perform query
        List result = doFindByScreenshotUrl(screenshotUrl);
        // Do asserts
        afterFindByScreenshotUrl(videoIntroductions, result);
        logger.debug("Test find-by-screenshotUrl ends!");

    }

    /**
     * Test query function </tt>findByPlayedTimes</tt>. First create multiple
     * <Code>VideoIntroduction</Code> instances and save them by <tt>preFindByPlayedTimes</tt>.
     * Then delegate the query operation to method <tt>doFindByPlayedTimes</tt>.
     * In the end do some asserts in <tt>afterFindByPlayedTimes</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByPlayedTimes() throws Exception {

        logger.debug("Test find-by-playedTimes begins!");
        int playedTimes = random.nextInt();
        List videoIntroductions = new ArrayList();
        // Create and insert playedTimes instances
        videoIntroductions = preFindByPlayedTimes(playedTimes);
        // Perform query
        List result = doFindByPlayedTimes(playedTimes);
        // Do asserts
        afterFindByPlayedTimes(videoIntroductions, result);
        logger.debug("Test find-by-playedTimes ends!");

    }

    /**
     * Test query function </tt>findByRate</tt>. First create multiple
     * <Code>VideoIntroduction</Code> instances and save them by <tt>preFindByRate</tt>.
     * Then delegate the query operation to method <tt>doFindByRate</tt>.
     * In the end do some asserts in <tt>afterFindByRate</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByRate() throws Exception {

        logger.debug("Test find-by-rate begins!");
        double rate = random.nextDouble();
        List videoIntroductions = new ArrayList();
        // Create and insert rate instances
        videoIntroductions = preFindByRate(rate);
        // Perform query
        List result = doFindByRate(rate);
        // Do asserts
        afterFindByRate(videoIntroductions, result);
        logger.debug("Test find-by-rate ends!");

    }

    /**
     * Test query function </tt>findByAddedTime</tt>. First create multiple
     * <Code>VideoIntroduction</Code> instances and save them by <tt>preFindByAddedTime</tt>.
     * Then delegate the query operation to method <tt>doFindByAddedTime</tt>.
     * In the end do some asserts in <tt>afterFindByAddedTime</tt> method.
     * User can modify these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testFindByAddedTime() throws Exception {

        logger.debug("Test find-by-addedTime begins!");
        java.util.Date addedTime = com.centuryOldShop.server.Util.getRandomDate();
        List videoIntroductions = new ArrayList();
        // Create and insert addedTime instances
        videoIntroductions = preFindByAddedTime(addedTime);
        // Perform query
        List result = doFindByAddedTime(addedTime);
        // Do asserts
        afterFindByAddedTime(videoIntroductions, result);
        logger.debug("Test find-by-addedTime ends!");

    }

    /**
     * Test function getVideoIntroductionList. First create multiple <Code>VideoIntroduction</Code>
     * instances and save them by <tt>preGetVideoIntroductionList</tt>. Then delegate the
     * find all operation to method <tt>doGetVideoIntroductionList</tt>. In the end do asserts
     * in <tt>afterGetVideoIntroductionList</tt> to verify if find all succeeds. User can modify
     * these methods to customize the test procedure.
     *
     * @throws Exception
     */
    public void testGetVideoIntroductionList() throws Exception {
        logger.debug("Test get-videoIntroduction-list begins!");

        List videoIntroductions = new ArrayList();
        // Insert VideoIntroduction instance
        videoIntroductions = preGetVideoIntroductionList();
        // Perform query
        List result = doGetVideoIntroductionList();
        // Make assertion
        afterGetVideoIntroductionList(videoIntroductions, result);
        logger.debug("Test get-videoIntroduction-list ends!");
    }

    /**
     * Do insert test preparation.
     *
     * @return new <Code>VideoIntroduction</Code> instance
     * @throws Exception
     */
    private VideoIntroduction preInsert() throws Exception {
        VideoIntroduction videoIntroduction = VideoIntroductionTestHelper.newInstance(null, null, "", 0, false);
        VideoIntroduction old = dao.load(videoIntroduction.getVideoIntroductionPK());
        if (old != null)
            VideoIntroductionTestHelper.delete(old);
        return videoIntroduction;
    }

    /**
     * Perform insert operation. User can modify it to do cutomized insert. For example
     * he can insert some associated objects first.
     *
     * @param videoIntroduction instance to insert
     * @throws Exception
     */
    private void doInsert(VideoIntroduction videoIntroduction) {
        VideoIntroductionTestHelper.save(videoIntroduction);
        dao.clearSession();
    }

    /**
     * Do assert to testify the correctness of insert.
     *
     * @param videoIntroduction inserted instance
     * @throws Exception
     */
    private void afterInsert(VideoIntroduction videoIntroduction) {
        VideoIntroduction anotherVideoIntroduction = dao.load(videoIntroduction.getVideoIntroductionPK());
        assertEquals("Queried result does not equal to inserted instance",
                videoIntroduction, anotherVideoIntroduction);
        VideoIntroductionTestHelper.delete(anotherVideoIntroduction);
    }

    /**
     * Do update test preparation.
     *
     * @return new <Code>VideoIntroduction</Code> instance
     * @throws Exception
     * @see VideoIntroductionTest#prepare()
     */
    private VideoIntroduction preUpdate() throws Exception {
        return prepare();
    }

    /**
     * Modify the object and perform update operation.
     *
     * @param videoIntroduction object to update
     * @throws Exception
     */
    private void doUpdate(VideoIntroduction videoIntroduction) throws Exception {
        VideoIntroductionTestHelper.modifyObject(videoIntroduction);
        dao.update(videoIntroduction);
        dao.clearSession();
    }

    /**
     * Do update assert to verify if update succeeds.
     *
     * @param videoIntroduction object to update
     * @throws Exception
     */
    private void afterUpdate(VideoIntroduction videoIntroduction) throws Exception {
        VideoIntroduction another = dao.load(videoIntroduction.getVideoIntroductionPK());
        assertEquals("Queried result does not equal to updated instance", videoIntroduction, another);
        VideoIntroductionTestHelper.delete(another);
    }

    /**
     * Do delete test preparation.
     *
     * @return new <Code>VideoIntroduction</Code> instance
     * @throws Exception
     * @see VideoIntroductionTest#prepare()
     */
    private VideoIntroduction preDelete() throws Exception {
        return prepare();
    }

    /**
     * Perform delete.
     *
     * @param videoIntroduction object to delete
     * @throws Exception
     */
    private void doDelete(VideoIntroduction videoIntroduction) throws Exception {
        VideoIntroductionTestHelper.delete(videoIntroduction);
    }

    /**
     * Do assert after delete. Verify correctness of delete operation.
     *
     * @param videoIntroduction deleted object
     * @throws Exception
     */
    private void afterDelete(VideoIntroduction videoIntroduction) throws Exception {
        VideoIntroduction another = dao.load(videoIntroduction.getVideoIntroductionPK());
        assertNull("Inserted instance is not deleted", another);
    }


    /**
     * Do function <tt>FindByVideoUrl</tt> test preparation. Delete <Code>VideoIntroduction</Code>
     * instances whose property videoUrl's value is videoUrl from persistent store. Then Create
     * multiple <Code>VideoIntroduction</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByVideoUrl(java.lang.String videoUrl) throws Exception {
        List videoIntroductions = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldVideoIntroductions = dao.findByVideoUrl(videoUrl);

        if (oldVideoIntroductions != null) {
            Iterator it = oldVideoIntroductions.iterator();
            while (it.hasNext())
                VideoIntroductionTestHelper.delete((VideoIntroduction) it.next());
        }

        // Create instances of random count, set their videoUrl value to videoUrl
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            VideoIntroduction videoIntroduction = VideoIntroductionTestHelper.newInstance(null, null, "", 0, false);
            videoIntroduction.setVideoUrl(videoUrl);
            deleteBeforeSave(videoIntroduction);
            dao.commitTransaction();
            videoIntroductions.add(i, videoIntroduction);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return videoIntroductions;
    }

    /**
     * Perform <tt>FindByVideoUrl</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByVideoUrl(java.lang.String videoUrl) {
        return dao.findByVideoUrl(videoUrl);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByVideoUrlt</tt>.
     *
     * @param videoIntroductions inserted instance list
     * @param resultFound        result instance list
     * @throws Exception
     */
    private void afterFindByVideoUrl(List videoIntroductions, List resultFound) {
        if (videoIntroductions != null && videoIntroductions.size() > 0) {
            assertNotNull("Result returned by find-by-videoUrl is null.", resultFound);
            assertEquals("Result count returned by find-by-videoUrl is incorrect.", videoIntroductions.size(), resultFound.size());

            Iterator it = videoIntroductions.iterator();
            while (it.hasNext()) {
                VideoIntroduction videoIntroduction = (VideoIntroduction) it.next();
                VideoIntroduction another = VideoIntroductionTestHelper.getVideoIntroductionByPk(resultFound, videoIntroduction.getVideoIntroductionPK());
                assertEquals("Result returned by find-by-videoUrl does not equal to inserted videoIntroduction object.", videoIntroduction, another);
                VideoIntroductionTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByDuration</tt> test preparation. Delete <Code>VideoIntroduction</Code>
     * instances whose property duration's value is duration from persistent store. Then Create
     * multiple <Code>VideoIntroduction</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByDuration(int duration) throws Exception {
        List videoIntroductions = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldVideoIntroductions = dao.findByDuration(duration);

        if (oldVideoIntroductions != null) {
            Iterator it = oldVideoIntroductions.iterator();
            while (it.hasNext())
                VideoIntroductionTestHelper.delete((VideoIntroduction) it.next());
        }

        // Create instances of random count, set their duration value to duration
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            VideoIntroduction videoIntroduction = VideoIntroductionTestHelper.newInstance(null, null, "", 0, false);
            videoIntroduction.setDuration(duration);
            deleteBeforeSave(videoIntroduction);
            dao.commitTransaction();
            videoIntroductions.add(i, videoIntroduction);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return videoIntroductions;
    }

    /**
     * Perform <tt>FindByDuration</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByDuration(int duration) {
        return dao.findByDuration(duration);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByDurationt</tt>.
     *
     * @param videoIntroductions inserted instance list
     * @param resultFound        result instance list
     * @throws Exception
     */
    private void afterFindByDuration(List videoIntroductions, List resultFound) {
        if (videoIntroductions != null && videoIntroductions.size() > 0) {
            assertNotNull("Result returned by find-by-duration is null.", resultFound);
            assertEquals("Result count returned by find-by-duration is incorrect.", videoIntroductions.size(), resultFound.size());

            Iterator it = videoIntroductions.iterator();
            while (it.hasNext()) {
                VideoIntroduction videoIntroduction = (VideoIntroduction) it.next();
                VideoIntroduction another = VideoIntroductionTestHelper.getVideoIntroductionByPk(resultFound, videoIntroduction.getVideoIntroductionPK());
                assertEquals("Result returned by find-by-duration does not equal to inserted videoIntroduction object.", videoIntroduction, another);
                VideoIntroductionTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByScreenshotUrl</tt> test preparation. Delete <Code>VideoIntroduction</Code>
     * instances whose property screenshotUrl's value is screenshotUrl from persistent store. Then Create
     * multiple <Code>VideoIntroduction</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByScreenshotUrl(java.lang.String screenshotUrl) throws Exception {
        List videoIntroductions = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldVideoIntroductions = dao.findByScreenshotUrl(screenshotUrl);

        if (oldVideoIntroductions != null) {
            Iterator it = oldVideoIntroductions.iterator();
            while (it.hasNext())
                VideoIntroductionTestHelper.delete((VideoIntroduction) it.next());
        }

        // Create instances of random count, set their screenshotUrl value to screenshotUrl
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            VideoIntroduction videoIntroduction = VideoIntroductionTestHelper.newInstance(null, null, "", 0, false);
            videoIntroduction.setScreenshotUrl(screenshotUrl);
            deleteBeforeSave(videoIntroduction);
            dao.commitTransaction();
            videoIntroductions.add(i, videoIntroduction);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return videoIntroductions;
    }

    /**
     * Perform <tt>FindByScreenshotUrl</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByScreenshotUrl(java.lang.String screenshotUrl) {
        return dao.findByScreenshotUrl(screenshotUrl);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByScreenshotUrlt</tt>.
     *
     * @param videoIntroductions inserted instance list
     * @param resultFound        result instance list
     * @throws Exception
     */
    private void afterFindByScreenshotUrl(List videoIntroductions, List resultFound) {
        if (videoIntroductions != null && videoIntroductions.size() > 0) {
            assertNotNull("Result returned by find-by-screenshotUrl is null.", resultFound);
            assertEquals("Result count returned by find-by-screenshotUrl is incorrect.", videoIntroductions.size(), resultFound.size());

            Iterator it = videoIntroductions.iterator();
            while (it.hasNext()) {
                VideoIntroduction videoIntroduction = (VideoIntroduction) it.next();
                VideoIntroduction another = VideoIntroductionTestHelper.getVideoIntroductionByPk(resultFound, videoIntroduction.getVideoIntroductionPK());
                assertEquals("Result returned by find-by-screenshotUrl does not equal to inserted videoIntroduction object.", videoIntroduction, another);
                VideoIntroductionTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByPlayedTimes</tt> test preparation. Delete <Code>VideoIntroduction</Code>
     * instances whose property playedTimes's value is playedTimes from persistent store. Then Create
     * multiple <Code>VideoIntroduction</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByPlayedTimes(int playedTimes) throws Exception {
        List videoIntroductions = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldVideoIntroductions = dao.findByPlayedTimes(playedTimes);

        if (oldVideoIntroductions != null) {
            Iterator it = oldVideoIntroductions.iterator();
            while (it.hasNext())
                VideoIntroductionTestHelper.delete((VideoIntroduction) it.next());
        }

        // Create instances of random count, set their playedTimes value to playedTimes
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            VideoIntroduction videoIntroduction = VideoIntroductionTestHelper.newInstance(null, null, "", 0, false);
            videoIntroduction.setPlayedTimes(playedTimes);
            deleteBeforeSave(videoIntroduction);
            dao.commitTransaction();
            videoIntroductions.add(i, videoIntroduction);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return videoIntroductions;
    }

    /**
     * Perform <tt>FindByPlayedTimes</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByPlayedTimes(int playedTimes) {
        return dao.findByPlayedTimes(playedTimes);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByPlayedTimest</tt>.
     *
     * @param videoIntroductions inserted instance list
     * @param resultFound        result instance list
     * @throws Exception
     */
    private void afterFindByPlayedTimes(List videoIntroductions, List resultFound) {
        if (videoIntroductions != null && videoIntroductions.size() > 0) {
            assertNotNull("Result returned by find-by-playedTimes is null.", resultFound);
            assertEquals("Result count returned by find-by-playedTimes is incorrect.", videoIntroductions.size(), resultFound.size());

            Iterator it = videoIntroductions.iterator();
            while (it.hasNext()) {
                VideoIntroduction videoIntroduction = (VideoIntroduction) it.next();
                VideoIntroduction another = VideoIntroductionTestHelper.getVideoIntroductionByPk(resultFound, videoIntroduction.getVideoIntroductionPK());
                assertEquals("Result returned by find-by-playedTimes does not equal to inserted videoIntroduction object.", videoIntroduction, another);
                VideoIntroductionTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByRate</tt> test preparation. Delete <Code>VideoIntroduction</Code>
     * instances whose property rate's value is rate from persistent store. Then Create
     * multiple <Code>VideoIntroduction</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByRate(double rate) throws Exception {
        List videoIntroductions = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldVideoIntroductions = dao.findByRate(rate);

        if (oldVideoIntroductions != null) {
            Iterator it = oldVideoIntroductions.iterator();
            while (it.hasNext())
                VideoIntroductionTestHelper.delete((VideoIntroduction) it.next());
        }

        // Create instances of random count, set their rate value to rate
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            VideoIntroduction videoIntroduction = VideoIntroductionTestHelper.newInstance(null, null, "", 0, false);
            videoIntroduction.setRate(rate);
            deleteBeforeSave(videoIntroduction);
            dao.commitTransaction();
            videoIntroductions.add(i, videoIntroduction);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return videoIntroductions;
    }

    /**
     * Perform <tt>FindByRate</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doFindByRate(double rate) {
        return dao.findByRate(rate);
    }

    /**
     * Do some assert to testify the correctness of function <tt>findByRatet</tt>.
     *
     * @param videoIntroductions inserted instance list
     * @param resultFound        result instance list
     * @throws Exception
     */
    private void afterFindByRate(List videoIntroductions, List resultFound) {
        if (videoIntroductions != null && videoIntroductions.size() > 0) {
            assertNotNull("Result returned by find-by-rate is null.", resultFound);
            assertEquals("Result count returned by find-by-rate is incorrect.", videoIntroductions.size(), resultFound.size());

            Iterator it = videoIntroductions.iterator();
            while (it.hasNext()) {
                VideoIntroduction videoIntroduction = (VideoIntroduction) it.next();
                VideoIntroduction another = VideoIntroductionTestHelper.getVideoIntroductionByPk(resultFound, videoIntroduction.getVideoIntroductionPK());
                assertEquals("Result returned by find-by-rate does not equal to inserted videoIntroduction object.", videoIntroduction, another);
                VideoIntroductionTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>FindByAddedTime</tt> test preparation. Delete <Code>VideoIntroduction</Code>
     * instances whose property addedTime's value is addedTime from persistent store. Then Create
     * multiple <Code>VideoIntroduction</Code> instances and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preFindByAddedTime(java.util.Date addedTime) throws Exception {
        List videoIntroductions = new ArrayList();
        dao.setAutoCommit(false);

        // Delete old objects if already exist
        List oldVideoIntroductions = dao.findByAddedTime(addedTime);

        if (oldVideoIntroductions != null) {
            Iterator it = oldVideoIntroductions.iterator();
            while (it.hasNext())
                VideoIntroductionTestHelper.delete((VideoIntroduction) it.next());
        }

        // Create instances of random count, set their addedTime value to addedTime
        // and save them
        int randomsize = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < randomsize; i++) {
            VideoIntroduction videoIntroduction = VideoIntroductionTestHelper.newInstance(null, null, "", 0, false);
            videoIntroduction.setAddedTime(addedTime);
            deleteBeforeSave(videoIntroduction);
            dao.commitTransaction();
            videoIntroductions.add(i, videoIntroduction);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return videoIntroductions;
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
     * @param videoIntroductions inserted instance list
     * @param resultFound        result instance list
     * @throws Exception
     */
    private void afterFindByAddedTime(List videoIntroductions, List resultFound) {
        if (videoIntroductions != null && videoIntroductions.size() > 0) {
            assertNotNull("Result returned by find-by-addedTime is null.", resultFound);
            assertEquals("Result count returned by find-by-addedTime is incorrect.", videoIntroductions.size(), resultFound.size());

            Iterator it = videoIntroductions.iterator();
            while (it.hasNext()) {
                VideoIntroduction videoIntroduction = (VideoIntroduction) it.next();
                VideoIntroduction another = VideoIntroductionTestHelper.getVideoIntroductionByPk(resultFound, videoIntroduction.getVideoIntroductionPK());
                assertEquals("Result returned by find-by-addedTime does not equal to inserted videoIntroduction object.", videoIntroduction, another);
                VideoIntroductionTestHelper.delete(another);
            }
        }

    }

    /**
     * Do function <tt>getVideoIntroductionList</tt> test preparation.  First delete any <Code>VideoIntroduction</Code>
     * instance from persistent store if exists. Then create multiple <Code>VideoIntroduction</Code>instances
     * and save them into persistence store.
     *
     * @return newly created object list
     * @throws Exception
     */
    private List preGetVideoIntroductionList() throws Exception {
        List videoIntroductions = new ArrayList();
        dao.setAutoCommit(false);

        List oldVideoIntroductions = dao.getVideoIntroductionList();

        if (oldVideoIntroductions != null) {
            Iterator it = oldVideoIntroductions.iterator();
            while (it.hasNext())
                VideoIntroductionTestHelper.delete((VideoIntroduction) it.next());
        }

        int size = 5 + Math.abs((random).nextInt(7));
        for (int i = 0; i < size; i++) {
            VideoIntroduction videoIntroduction = prepare();
            dao.update(videoIntroduction);
            dao.commitTransaction();
            videoIntroductions.add(i, videoIntroduction);
        }
        dao.setAutoCommit(true);
        dao.clearSession();
        return videoIntroductions;
    }

    /**
     * Perform <tt>getVideoIntroductionList</tt> operation.
     *
     * @return result object list
     * @throws Exception
     */
    private List doGetVideoIntroductionList() throws Exception {
        return dao.getVideoIntroductionList();
    }

    /**
     * Do some asserts to testify the correctness of function <tt>getVideoIntroductionList</tt>.
     *
     * @param videoIntroductions inserted instance list
     * @param resultFound        result instance list
     * @throws Exception
     */
    private void afterGetVideoIntroductionList(List videoIntroductions, List resultFound) {
        if (videoIntroductions != null && videoIntroductions.size() > 0) {
            assertNotNull("Result returned by get-videoIntroduction-list is null.", resultFound);
            assertEquals("Result count returned by get-videoIntroduction-list is incorrect.", videoIntroductions.size(), resultFound.size());

            Iterator it = videoIntroductions.iterator();
            while (it.hasNext()) {
                VideoIntroduction videoIntroduction = (VideoIntroduction) it.next();
                VideoIntroduction another = VideoIntroductionTestHelper.getVideoIntroductionByPk(resultFound, videoIntroduction.getVideoIntroductionPK());
                assertEquals("Result returned by get-videoIntroduction-list does not equal to inserted videoIntroduction object.", videoIntroduction, another);
                VideoIntroductionTestHelper.delete(another);
            }
        }
    }

    /**
     * Make some test preparation that is common to test methods. Create a new
     * <Code>VideoIntroduction</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @return newly created and saved <Code>VideoIntroduction</Code> instance
     * @throws Exception
     */
    private VideoIntroduction prepare() {
        VideoIntroduction videoIntroduction = VideoIntroductionTestHelper.newInstance(null, null, "", 0, false);
        return deleteBeforeSave(videoIntroduction);
    }

    /**
     * For a new <Code>VideoIntroduction</Code> instance. Delete it if it does exist in persistence store.
     * Save it in the end.
     *
     * @param videoIntroduction
     * @return newly created and saved <Code>VideoIntroduction</Code> instance
     * @throws Exception
     */
    private VideoIntroduction deleteBeforeSave(VideoIntroduction videoIntroduction) {
        // Delete instance from data store if already exists
        VideoIntroduction old = dao.load(videoIntroduction.getVideoIntroductionPK());
        if (old != null)
            VideoIntroductionTestHelper.delete(old);
        VideoIntroductionTestHelper.save(videoIntroduction);
        return videoIntroduction;
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        this.dao = daoFactory.getVideoIntroductionDao();
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
     * @return test suite containing test class <Code>VideoIntroductionTest</Code>
     */
    public static Test suite() {
        return new TestSuite(VideoIntroductionTest.class);
    }
}