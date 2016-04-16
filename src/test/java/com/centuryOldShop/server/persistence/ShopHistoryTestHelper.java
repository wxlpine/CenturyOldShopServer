/***********************************************************************
 * Module:  ShopHistoryTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class ShopHistory
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.ShopHistoryDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Test helper class for ShopHistory. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class ShopHistoryTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(ShopHistoryTestHelper.class);

    /**
     * Empty Constructor
     */
    public ShopHistoryTestHelper() {

    }

    /**
     * Create new ShopHistory instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static ShopHistory newInstance(ShopHistory persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new ShopHistory();

//        persistentObject.setShopHistoryId((long) random.nextInt());
        persistentObject.setTitle(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setSmallPhotoUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setShortDescription(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setPublishTime(new java.util.Date(random.nextInt(10000)));
        persistentObject.setVisitCount(random.nextInt());
        persistentObject.setDetailedIntroductionPageUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        if (precedingObject != null && associationId.equals("DD1553D4-C90B-4F1B-AE75-28AF72FCD46E")) {
            persistentObject.setShop((Shop) precedingObject);
        }
        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param shopHistoryObject saved persistent object
     */

    public static void modifyObject(ShopHistory persistentObject) {
        persistentObject.setTitle(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setSmallPhotoUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setShortDescription(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setPublishTime(new java.util.Date(random.nextInt(10000)));
        persistentObject.setVisitCount(random.nextInt());
        persistentObject.setDetailedIntroductionPageUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
    }

    /**
     * Save ShopHistory object. Foreign key constraints are taked cared here.
     *
     * @param shopHistoryObject persistent object to be saved
     * @throws Exception
     */
    public static void save(ShopHistory shopHistoryObject) {

        Shop shop = shopHistoryObject.getShop();
        if (shop == null) {
            shop = ShopTestHelper.newInstance(null, null, "DD1553D4-C90B-4F1B-AE75-28AF72FCD46E", 1, false);
        }
        shop.setShopHistory(null);
        DaoFactory.getDaoFactory().getShopDao().save(shop);
        shopHistoryObject.setShop(shop);
        ShopHistoryDao dao = DaoFactory.getDaoFactory().getShopHistoryDao();
        dao.saveOrUpdate(shopHistoryObject);
    }

    /**
     * Delete ShopHistory object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param shopHistoryObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(ShopHistory shopHistoryObject) {
        ShopHistoryDao dao = DaoFactory.getDaoFactory().getShopHistoryDao();
        dao.delete(shopHistoryObject);
    }

    /**
     * Get ShopHistory instance from collection by primary key.
     *
     * @param collection ShopHistory instance collection
     * @param pk         primary key
     * @return ShopHistory instance
     */
    public static ShopHistory getShopHistoryByPk(Collection collection, ShopHistoryPK pk) {
        ShopHistory shopHistoryObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            ShopHistory object = (ShopHistory) iterator.next();
            if (object.getShopHistoryPK().equals(pk)) {
                shopHistoryObject = object;
                break;
            }
        }
        return shopHistoryObject;
    }

    /**
     * Get ShopHistory instance from <Code>ShopHistory</Code> instance array by primary key.
     *
     * @param shopHistoryArray ShopHistory instance array
     * @param pk               primary key
     * @return ShopHistory instance
     */
    public static ShopHistory getShopHistoryByPk(ShopHistory[] shopHistoryArray, ShopHistoryPK pk) {
        return shopHistoryArray == null ? null : getShopHistoryByPk(Arrays.asList(shopHistoryArray), pk);
    }
}