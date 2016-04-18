/***********************************************************************
 * Module:  ShopTypeTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class ShopType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.ShopTypeDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Test helper class for ShopType. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class ShopTypeTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(ShopTypeTestHelper.class);

    /**
     * Empty Constructor
     */
    public ShopTypeTestHelper() {

    }

    /**
     * Create new ShopType instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static ShopType newInstance(ShopType persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new ShopType();

        persistentObject.setShopTypeName(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        if (precedingObject != null && associationId.equals("F5CFBA7E-1286-4274-AAD4-43B59F4BFD45")) {
            persistentObject.addShop((Shop) precedingObject);
        }
        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param shopTypeObject saved persistent object
     */

    public static void modifyObject(ShopType persistentObject) {
    }

    /**
     * Save ShopType object. Foreign key constraints are taked cared here.
     *
     * @param shopTypeObject persistent object to be saved
     * @throws Exception
     */
    public static void save(ShopType shopTypeObject) {
        ShopTypeDao dao = DaoFactory.getDaoFactory().getShopTypeDao();
        dao.saveOrUpdate(shopTypeObject);
    }

    /**
     * Delete ShopType object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param shopTypeObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(ShopType shopTypeObject) {
        java.util.List shops = shopTypeObject.getShop();
        if (shops != null) {
            Iterator it = shops.iterator();
            while (it.hasNext()) {
                Shop shop = (Shop) it.next();
                com.centuryOldShop.server.persistence.ShopTestHelper.delete(shop);
            }
        }
        ShopTypeDao dao = DaoFactory.getDaoFactory().getShopTypeDao();
        dao.delete(shopTypeObject);
    }

    /**
     * Get ShopType instance from collection by primary key.
     *
     * @param collection ShopType instance collection
     * @param pk         primary key
     * @return ShopType instance
     */
    public static ShopType getShopTypeByPk(Collection collection, ShopTypePK pk) {
        ShopType shopTypeObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            ShopType object = (ShopType) iterator.next();
            if (object.getShopTypePK().equals(pk)) {
                shopTypeObject = object;
                break;
            }
        }
        return shopTypeObject;
    }

    /**
     * Get ShopType instance from <Code>ShopType</Code> instance array by primary key.
     *
     * @param shopTypeArray ShopType instance array
     * @param pk            primary key
     * @return ShopType instance
     */
    public static ShopType getShopTypeByPk(ShopType[] shopTypeArray, ShopTypePK pk) {
        return shopTypeArray == null ? null : getShopTypeByPk(Arrays.asList(shopTypeArray), pk);
    }

    static boolean unitTestEquals(ShopType left, ShopType right) {
        if (left == right) return true;

        if (left == null || right == null) {
            return false;
        }

        return left.getShopTypeName() != null ?
                left.getShopTypeName().equals(right.getShopTypeName()) :
                right.getShopTypeName() == null;
    }

}