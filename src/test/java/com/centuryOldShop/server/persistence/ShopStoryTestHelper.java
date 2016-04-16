/***********************************************************************
 * Module:  ShopStoryTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class ShopStory
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.ShopStoryDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Test helper class for ShopStory. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class ShopStoryTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(ShopStoryTestHelper.class);

    /**
     * Empty Constructor
     */
    public ShopStoryTestHelper() {

    }

    /**
     * Create new ShopStory instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static ShopStory newInstance(ShopStory persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new ShopStory();

        persistentObject.setStoryId((long) random.nextInt());
        persistentObject.setStoryName(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setStoryContentUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setAddedTime(new java.util.Date(random.nextInt(10000)));
        if (precedingObject != null && associationId.equals("E042F58F-0AA6-4E67-A95A-5C2CBFA9A71E")) {
            persistentObject.setShop((Shop) precedingObject);
        }

        if (precedingObject != null && associationId.equals("78891524-0D75-4042-9DC2-DB3572C6CC5B")) {
            persistentObject.setShopStoryType((ShopStoryType) precedingObject);
        }
        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param shopStoryObject saved persistent object
     */

    public static void modifyObject(ShopStory persistentObject) {
        persistentObject.setStoryName(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setStoryContentUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setAddedTime(new java.util.Date(random.nextInt(10000)));
    }

    /**
     * Save ShopStory object. Foreign key constraints are taked cared here.
     *
     * @param shopStoryObject persistent object to be saved
     * @throws Exception
     */
    public static void save(ShopStory shopStoryObject) {

        Shop shop = shopStoryObject.getShop();
        if (shop == null) {
            shop = com.centuryOldShop.server.persistence.ShopTestHelper.newInstance(null, null, "E042F58F-0AA6-4E67-A95A-5C2CBFA9A71E", 1, false);
        }
        shop.setShopStory(null);
        DaoFactory.getDaoFactory().getShopDao().save(shop);
        shopStoryObject.setShop(shop);
        ShopStoryType shopStoryType = shopStoryObject.getShopStoryType();
        if (shopStoryType == null) {
            shopStoryType = com.centuryOldShop.server.persistence.ShopStoryTypeTestHelper.newInstance(null, null, "78891524-0D75-4042-9DC2-DB3572C6CC5B", 1, false);
        }
        shopStoryType.setShopStory(null);
        DaoFactory.getDaoFactory().getShopStoryTypeDao().save(shopStoryType);
        shopStoryObject.setShopStoryType(shopStoryType);
        ShopStoryDao dao = DaoFactory.getDaoFactory().getShopStoryDao();
        dao.saveOrUpdate(shopStoryObject);
    }

    /**
     * Delete ShopStory object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param shopStoryObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(ShopStory shopStoryObject) {
        ShopStoryDao dao = DaoFactory.getDaoFactory().getShopStoryDao();
        dao.delete(shopStoryObject);
    }

    /**
     * Get ShopStory instance from collection by primary key.
     *
     * @param collection ShopStory instance collection
     * @param pk         primary key
     * @return ShopStory instance
     */
    public static ShopStory getShopStoryByPk(Collection collection, ShopStoryPK pk) {
        ShopStory shopStoryObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            ShopStory object = (ShopStory) iterator.next();
            if (object.getShopStoryPK().equals(pk)) {
                shopStoryObject = object;
                break;
            }
        }
        return shopStoryObject;
    }

    /**
     * Get ShopStory instance from <Code>ShopStory</Code> instance array by primary key.
     *
     * @param shopStoryArray ShopStory instance array
     * @param pk             primary key
     * @return ShopStory instance
     */
    public static ShopStory getShopStoryByPk(ShopStory[] shopStoryArray, ShopStoryPK pk) {
        return shopStoryArray == null ? null : getShopStoryByPk(Arrays.asList(shopStoryArray), pk);
    }
}