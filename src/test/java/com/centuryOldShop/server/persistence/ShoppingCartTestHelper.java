/***********************************************************************
 * Module:  ShoppingCartTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class ShoppingCart
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.ShoppingCartDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Test helper class for ShoppingCart. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class ShoppingCartTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(ShoppingCartTestHelper.class);

    /**
     * Empty Constructor
     */
    public ShoppingCartTestHelper() {

    }

    /**
     * Create new ShoppingCart instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static ShoppingCart newInstance(ShoppingCart persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new ShoppingCart();

        persistentObject.setAmount(random.nextInt());
        persistentObject.setAddedTime(com.centuryOldShop.server.Util.getRandomDate());
        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param shoppingCartObject saved persistent object
     */

    public static void modifyObject(ShoppingCart persistentObject) {
        persistentObject.setAmount(random.nextInt());
        persistentObject.setAddedTime(com.centuryOldShop.server.Util.getRandomDate());
    }

    /**
     * Save ShoppingCart object. Foreign key constraints are taked cared here.
     *
     * @param shoppingCartObject persistent object to be saved
     * @throws Exception
     */
    public static void save(ShoppingCart shoppingCartObject) {
        ShoppingCartDao dao = DaoFactory.getDaoFactory().getShoppingCartDao();
        dao.saveOrUpdate(shoppingCartObject);
    }

    /**
     * Delete ShoppingCart object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param shoppingCartObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(ShoppingCart shoppingCartObject) {
        ShoppingCartDao dao = DaoFactory.getDaoFactory().getShoppingCartDao();
        dao.delete(shoppingCartObject);
    }

    /**
     * Get ShoppingCart instance from collection by primary key.
     *
     * @param collection ShoppingCart instance collection
     * @param pk         primary key
     * @return ShoppingCart instance
     */
    public static ShoppingCart getShoppingCartByPk(Collection collection, ShoppingCartPK pk) {
        ShoppingCart shoppingCartObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            ShoppingCart object = (ShoppingCart) iterator.next();
            if (object.getShoppingCartPK().equals(pk)) {
                shoppingCartObject = object;
                break;
            }
        }
        return shoppingCartObject;
    }

    /**
     * Get ShoppingCart instance from <Code>ShoppingCart</Code> instance array by primary key.
     *
     * @param shoppingCartArray ShoppingCart instance array
     * @param pk                primary key
     * @return ShoppingCart instance
     */
    public static ShoppingCart getShoppingCartByPk(ShoppingCart[] shoppingCartArray, ShoppingCartPK pk) {
        return shoppingCartArray == null ? null : getShoppingCartByPk(Arrays.asList(shoppingCartArray), pk);
    }
}