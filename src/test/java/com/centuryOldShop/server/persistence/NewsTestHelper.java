/***********************************************************************
 * Module:  NewsTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class News
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.NewsDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/**
 * Test helper class for News. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class NewsTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(NewsTestHelper.class);

    /**
     * Empty Constructor
     */
    public NewsTestHelper() {

    }

    /**
     * Create new News instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static News newInstance(News persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new News();

//        persistentObject.setNewsId((long) random.nextInt());
        persistentObject.setTitle(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setContentUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setPublishTime(com.centuryOldShop.server.Util.getRandomDate());
        persistentObject.setReadCount(random.nextInt());
        persistentObject.setSpotScene(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        if (precedingObject != null && associationId.equals("C1F60A6B-07B2-48C6-A409-C5E308C44B5B")) {
            persistentObject.setShop((Shop) precedingObject);
        }
        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param newsObject saved persistent object
     */

    public static void modifyObject(News newsObject) {
        newsObject.setTitle(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        newsObject.setContentUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        newsObject.setPublishTime(com.centuryOldShop.server.Util.getRandomDate());
        newsObject.setReadCount(random.nextInt());
        newsObject.setSpotScene(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
    }

    /**
     * Save News object. Foreign key constraints are taked cared here.
     *
     * @param newsObject persistent object to be saved
     * @throws Exception
     */
    public static void save(News newsObject) {

        Shop shop = newsObject.getShop();
        if (shop == null) {
            shop = ShopTestHelper.newInstance(null, null, "C1F60A6B-07B2-48C6-A409-C5E308C44B5B", 1, true);
        }
        shop.setNews(null);
        DaoFactory.getDaoFactory().getShopDao().save(shop);
        newsObject.setShop(shop);
        NewsDao dao = DaoFactory.getDaoFactory().getNewsDao();
        dao.saveOrUpdate(newsObject);
    }

    /**
     * Delete News object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param newsObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(News newsObject) {
        NewsDao dao = DaoFactory.getDaoFactory().getNewsDao();
        dao.delete(newsObject);
    }

    /**
     * Get News instance from collection by primary key.
     *
     * @param collection News instance collection
     * @param pk         primary key
     * @return News instance
     */
    public static News getNewsByPk(Collection collection, NewsPK pk) {
        News newsObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            News object = (News) iterator.next();
            if (object.getNewsPK().equals(pk)) {
                newsObject = object;
                break;
            }
        }
        return newsObject;
    }

    /**
     * Get News instance from <Code>News</Code> instance array by primary key.
     *
     * @param newsArray News instance array
     * @param pk        primary key
     * @return News instance
     */
    public static News getNewsByPk(News[] newsArray, NewsPK pk) {
        return newsArray == null ? null : getNewsByPk(Arrays.asList(newsArray), pk);
    }

    static boolean unitTestEquals(News left, News right) {
        if (left == right) return true;

        if (left == null || right == null) {
            return false;
        }

        return left.getNewsId() == right.getNewsId() &&
                left.getReadCount() == right.getReadCount() &&
                Objects.equals(left.getTitle(), right.getTitle()) &&
                Objects.equals(left.getContentUrl(), right.getContentUrl()) &&
                Objects.equals(left.getPublishTime(), right.getPublishTime()) &&
                Objects.equals(left.getSpotScene(), right.getSpotScene()) &&
                ShopTestHelper.unitTestEquals(left.getShop(), right.getShop());
    }

}