/***********************************************************************
 * Module:  VideoIntroductionTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class VideoIntroduction
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.VideoIntroductionDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Test helper class for VideoIntroduction. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class VideoIntroductionTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(VideoIntroductionTestHelper.class);

    /**
     * Empty Constructor
     */
    public VideoIntroductionTestHelper() {

    }

    /**
     * Create new VideoIntroduction instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static VideoIntroduction newInstance(VideoIntroduction persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new VideoIntroduction();

        persistentObject.setVideoIntroductionId((long) random.nextInt());
        persistentObject.setVideoUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setDuration(random.nextInt());
        persistentObject.setScreenshotUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setPlayedTimes(random.nextInt());
        persistentObject.setRate(random.nextDouble());
        persistentObject.setAddedTime(new java.util.Date(random.nextInt(10000)));
        if (precedingObject != null && associationId.equals("6036329C-64BF-410A-A06D-B499ADA7670B")) {
            persistentObject.addRateKeyword((RateKeyword) precedingObject);
        }
        if (precedingObject != null && associationId.equals("598D0883-33B3-4CA0-AB56-33CDC1E3B094")) {
            persistentObject.setShop((Shop) precedingObject);
        }
        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param videoIntroductionObject saved persistent object
     */

    public static void modifyObject(VideoIntroduction persistentObject) {
        persistentObject.setVideoUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setDuration(random.nextInt());
        persistentObject.setScreenshotUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setPlayedTimes(random.nextInt());
        persistentObject.setRate(random.nextDouble());
        persistentObject.setAddedTime(new java.util.Date(random.nextInt(10000)));
    }

    /**
     * Save VideoIntroduction object. Foreign key constraints are taked cared here.
     *
     * @param videoIntroductionObject persistent object to be saved
     * @throws Exception
     */
    public static void save(VideoIntroduction videoIntroductionObject) {

        Shop shop = videoIntroductionObject.getShop();
        if (shop == null) {
            shop = com.centuryOldShop.server.persistence.ShopTestHelper.newInstance(null, null, "598D0883-33B3-4CA0-AB56-33CDC1E3B094", 1, false);
        }
        shop.setVideoIntroduction(null);
        DaoFactory.getDaoFactory().getShopDao().save(shop);
        videoIntroductionObject.setShop(shop);
        VideoIntroductionDao dao = DaoFactory.getDaoFactory().getVideoIntroductionDao();
        dao.saveOrUpdate(videoIntroductionObject);
    }

    /**
     * Delete VideoIntroduction object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param videoIntroductionObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(VideoIntroduction videoIntroductionObject) {
        java.util.List rateKeywords = videoIntroductionObject.getRateKeyword();
        if (rateKeywords != null) {
            Iterator it = rateKeywords.iterator();
            while (it.hasNext()) {
                RateKeyword rateKeyword = (RateKeyword) it.next();
                rateKeyword.setVideoIntroduction(null);
            }
        }
        VideoIntroductionDao dao = DaoFactory.getDaoFactory().getVideoIntroductionDao();
        dao.delete(videoIntroductionObject);
    }

    /**
     * Get VideoIntroduction instance from collection by primary key.
     *
     * @param collection VideoIntroduction instance collection
     * @param pk         primary key
     * @return VideoIntroduction instance
     */
    public static VideoIntroduction getVideoIntroductionByPk(Collection collection, VideoIntroductionPK pk) {
        VideoIntroduction videoIntroductionObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            VideoIntroduction object = (VideoIntroduction) iterator.next();
            if (object.getVideoIntroductionPK().equals(pk)) {
                videoIntroductionObject = object;
                break;
            }
        }
        return videoIntroductionObject;
    }

    /**
     * Get VideoIntroduction instance from <Code>VideoIntroduction</Code> instance array by primary key.
     *
     * @param videoIntroductionArray VideoIntroduction instance array
     * @param pk                     primary key
     * @return VideoIntroduction instance
     */
    public static VideoIntroduction getVideoIntroductionByPk(VideoIntroduction[] videoIntroductionArray, VideoIntroductionPK pk) {
        return videoIntroductionArray == null ? null : getVideoIntroductionByPk(Arrays.asList(videoIntroductionArray), pk);
    }
}