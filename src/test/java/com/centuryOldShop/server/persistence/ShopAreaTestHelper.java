/***********************************************************************
 * Module:  ShopAreaTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class ShopArea
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.ShopAreaDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/**
 * Test helper class for ShopArea. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class ShopAreaTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(ShopAreaTestHelper.class);

    /**
     * Empty Constructor
     */
    public ShopAreaTestHelper() {

    }

    /**
     * Create new ShopArea instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static ShopArea newInstance(ShopArea persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new ShopArea();

        // don't set identity explicitly
//        persistentObject.setShopAreaId((long) random.nextInt());
        persistentObject.setShopAreaName(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        if (precedingObject != null && associationId.equals("9909044A-4853-4C2D-981B-724F9C29695C")) {
            persistentObject.addShop((Shop) precedingObject);
        }
        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param persistentObject saved persistent object
     */

    public static void modifyObject(ShopArea persistentObject) {
        persistentObject.setShopAreaName(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
    }

    /**
     * Save ShopArea object. Foreign key constraints are taked cared here.
     *
     * @param shopAreaObject persistent object to be saved
     * @throws Exception
     */
    public static void save(ShopArea shopAreaObject) {
        ShopAreaDao dao = DaoFactory.getDaoFactory().getShopAreaDao();
        dao.saveOrUpdate(shopAreaObject);
    }

    /**
     * Delete ShopArea object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param shopAreaObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(ShopArea shopAreaObject) {
        java.util.List shops = shopAreaObject.getShop();
        if (shops != null) {
            Iterator it = shops.iterator();
            while (it.hasNext()) {
                Shop shop = (Shop) it.next();
                com.centuryOldShop.server.persistence.ShopTestHelper.delete(shop);
            }
        }
        ShopAreaDao dao = DaoFactory.getDaoFactory().getShopAreaDao();
        dao.delete(shopAreaObject);
    }

    /**
     * Get ShopArea instance from collection by primary key.
     *
     * @param collection ShopArea instance collection
     * @param pk         primary key
     * @return ShopArea instance
     */
    public static ShopArea getShopAreaByPk(Collection collection, ShopAreaPK pk) {
        ShopArea shopAreaObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            ShopArea object = (ShopArea) iterator.next();
            if (object.getShopAreaPK().equals(pk)) {
                shopAreaObject = object;
                break;
            }
        }
        return shopAreaObject;
    }

    /**
     * Get ShopArea instance from <Code>ShopArea</Code> instance array by primary key.
     *
     * @param shopAreaArray ShopArea instance array
     * @param pk            primary key
     * @return ShopArea instance
     */
    public static ShopArea getShopAreaByPk(ShopArea[] shopAreaArray, ShopAreaPK pk) {
        return shopAreaArray == null ? null : getShopAreaByPk(Arrays.asList(shopAreaArray), pk);
    }

    static boolean unitTestEquals(ShopArea left, ShopArea right) {
        if (left == right) return true;

        if (left == null || right == null) {
            return false;
        }

        return left.getShopAreaId() == right.getShopAreaId() &&
                Objects.equals(left.getShopAreaName(), right.getShopAreaName());
    }

}