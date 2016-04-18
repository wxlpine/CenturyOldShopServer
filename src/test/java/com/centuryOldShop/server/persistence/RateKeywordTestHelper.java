/***********************************************************************
 * Module:  RateKeywordTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class RateKeyword
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.RateKeywordDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.*;

/**
 * Test helper class for RateKeyword. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class RateKeywordTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(RateKeywordTestHelper.class);

    /**
     * Empty Constructor
     */
    public RateKeywordTestHelper() {

    }

    /**
     * Create new RateKeyword instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static RateKeyword newInstance(RateKeyword persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new RateKeyword();

        persistentObject.setRateKeyword(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));

        if (precedingObject != null && associationId.equals("6036329C-64BF-410A-A06D-B499ADA7670B")) {
            persistentObject.addVideoIntroduction((VideoIntroduction) precedingObject);
        }

        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param persistentObject saved persistent object
     */

    public static void modifyObject(RateKeyword persistentObject) {
    }

    /**
     * Save RateKeyword object. Foreign key constraints are taked cared here.
     *
     * @param rateKeywordObject persistent object to be saved
     * @throws Exception
     */
    public static void save(RateKeyword rateKeywordObject) {
        RateKeywordDao dao = DaoFactory.getDaoFactory().getRateKeywordDao();
        dao.saveOrUpdate(rateKeywordObject);
    }

    /**
     * Delete RateKeyword object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param rateKeywordObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(RateKeyword rateKeywordObject) {
        java.util.List videoIntroductions = rateKeywordObject.getVideoIntroduction();
        if (videoIntroductions != null) {
            Iterator it = videoIntroductions.iterator();
            while (it.hasNext()) {
                VideoIntroduction videoIntroduction = (VideoIntroduction) it.next();
                videoIntroduction.setRateKeyword(null);
            }
        }
        RateKeywordDao dao = DaoFactory.getDaoFactory().getRateKeywordDao();
        dao.delete(rateKeywordObject);
    }

    /**
     * Get RateKeyword instance from collection by primary key.
     *
     * @param collection RateKeyword instance collection
     * @param pk         primary key
     * @return RateKeyword instance
     */
    public static RateKeyword getRateKeywordByPk(Collection collection, RateKeywordPK pk) {
        RateKeyword rateKeywordObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            RateKeyword object = (RateKeyword) iterator.next();
            if (object.getRateKeywordPK().equals(pk)) {
                rateKeywordObject = object;
                break;
            }
        }
        return rateKeywordObject;
    }

    /**
     * Get RateKeyword instance from <Code>RateKeyword</Code> instance array by primary key.
     *
     * @param rateKeywordArray RateKeyword instance array
     * @param pk               primary key
     * @return RateKeyword instance
     */
    public static RateKeyword getRateKeywordByPk(RateKeyword[] rateKeywordArray, RateKeywordPK pk) {
        return rateKeywordArray == null ? null : getRateKeywordByPk(Arrays.asList(rateKeywordArray), pk);
    }

    static boolean unitTestEquals(RateKeyword left, RateKeyword right) {
        if (left == right) return true;

        if (left == null || right == null) {
            return false;
        }

        return Objects.equals(left.getRateKeyword(), right.getRateKeyword());
    }

    static <T extends RateKeyword, U extends RateKeyword>
    boolean unitTestEquals(List<T> left, List<U> right) {
        if (left == right) return true;

        if (left == null || right == null) {
            return false;
        }

        ListIterator<T> e1 = left.listIterator();
        ListIterator<U> e2 = right.listIterator();
        while (e1.hasNext() && e2.hasNext()) {
            T o1 = e1.next();
            U o2 = e2.next();
            if (!unitTestEquals(o1, o2))
                return false;
        }
        return !(e1.hasNext() || e2.hasNext());
    }

}