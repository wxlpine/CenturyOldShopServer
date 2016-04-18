/***********************************************************************
 * Module:  ShopStoryTypeTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class ShopStoryType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.ShopStoryTypeDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/**
 * Test helper class for ShopStoryType. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class ShopStoryTypeTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(ShopStoryTypeTestHelper.class);

    /**
     * Empty Constructor
     */
    public ShopStoryTypeTestHelper() {

    }

    /**
     * Create new ShopStoryType instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static ShopStoryType newInstance(ShopStoryType persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new ShopStoryType();

        persistentObject.setStoryTypeName(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        if (precedingObject != null && associationId.equals("78891524-0D75-4042-9DC2-DB3572C6CC5B")) {
            persistentObject.addShopStory((ShopStory) precedingObject);
        }
        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param persistentObject saved persistent object
     */

    public static void modifyObject(ShopStoryType persistentObject) {
    }

    /**
     * Save ShopStoryType object. Foreign key constraints are taked cared here.
     *
     * @param shopStoryTypeObject persistent object to be saved
     * @throws Exception
     */
    public static void save(ShopStoryType shopStoryTypeObject) {
        ShopStoryTypeDao dao = DaoFactory.getDaoFactory().getShopStoryTypeDao();
        dao.saveOrUpdate(shopStoryTypeObject);
    }

    /**
     * Delete ShopStoryType object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param shopStoryTypeObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(ShopStoryType shopStoryTypeObject) {
        java.util.List shopStorys = shopStoryTypeObject.getShopStory();
        if (shopStorys != null) {
            Iterator it = shopStorys.iterator();
            while (it.hasNext()) {
                ShopStory shopStory = (ShopStory) it.next();
                com.centuryOldShop.server.persistence.ShopStoryTestHelper.delete(shopStory);
            }
        }
        ShopStoryTypeDao dao = DaoFactory.getDaoFactory().getShopStoryTypeDao();
        dao.delete(shopStoryTypeObject);
    }

    /**
     * Get ShopStoryType instance from collection by primary key.
     *
     * @param collection ShopStoryType instance collection
     * @param pk         primary key
     * @return ShopStoryType instance
     */
    public static ShopStoryType getShopStoryTypeByPk(Collection collection, ShopStoryTypePK pk) {
        ShopStoryType shopStoryTypeObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            ShopStoryType object = (ShopStoryType) iterator.next();
            if (object.getShopStoryTypePK().equals(pk)) {
                shopStoryTypeObject = object;
                break;
            }
        }
        return shopStoryTypeObject;
    }

    /**
     * Get ShopStoryType instance from <Code>ShopStoryType</Code> instance array by primary key.
     *
     * @param shopStoryTypeArray ShopStoryType instance array
     * @param pk                 primary key
     * @return ShopStoryType instance
     */
    public static ShopStoryType getShopStoryTypeByPk(ShopStoryType[] shopStoryTypeArray, ShopStoryTypePK pk) {
        return shopStoryTypeArray == null ? null : getShopStoryTypeByPk(Arrays.asList(shopStoryTypeArray), pk);
    }

    static boolean unitTestEquals(ShopStoryType left, ShopStoryType right) {
        if (left == right) return true;

        if (left == null || right == null) {
            return false;
        }

        return Objects.equals(left.getStoryTypeName(), right.getStoryTypeName());
    }
}