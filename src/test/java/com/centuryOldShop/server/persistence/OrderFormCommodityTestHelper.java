/***********************************************************************
 * Module:  OrderFormCommodityTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class OrderFormCommodity
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.OrderFormCommodityDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Test helper class for OrderFormCommodity. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class OrderFormCommodityTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(OrderFormCommodityTestHelper.class);

    /**
     * Empty Constructor
     */
    public OrderFormCommodityTestHelper() {

    }

    /**
     * Create new OrderFormCommodity instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static OrderFormCommodity newInstance(OrderFormCommodity persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new OrderFormCommodity();

        persistentObject.setBuyPrice(random.nextDouble());
        persistentObject.setBuyAmount(random.nextInt());
        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param orderFormCommodityObject saved persistent object
     */

    public static void modifyObject(OrderFormCommodity persistentObject) {
        persistentObject.setBuyPrice(random.nextDouble());
        persistentObject.setBuyAmount(random.nextInt());
    }

    /**
     * Save OrderFormCommodity object. Foreign key constraints are taked cared here.
     *
     * @param orderFormCommodityObject persistent object to be saved
     * @throws Exception
     */
    public static void save(OrderFormCommodity orderFormCommodityObject) {
        OrderFormCommodityDao dao = DaoFactory.getDaoFactory().getOrderFormCommodityDao();
        dao.saveOrUpdate(orderFormCommodityObject);
    }

    /**
     * Delete OrderFormCommodity object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param orderFormCommodityObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(OrderFormCommodity orderFormCommodityObject) {
        OrderFormCommodityDao dao = DaoFactory.getDaoFactory().getOrderFormCommodityDao();
        dao.delete(orderFormCommodityObject);
    }

    /**
     * Get OrderFormCommodity instance from collection by primary key.
     *
     * @param collection OrderFormCommodity instance collection
     * @param pk         primary key
     * @return OrderFormCommodity instance
     */
    public static OrderFormCommodity getOrderFormCommodityByPk(Collection collection, OrderFormCommodityPK pk) {
        OrderFormCommodity orderFormCommodityObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            OrderFormCommodity object = (OrderFormCommodity) iterator.next();
            if (object.getOrderFormCommodityPK().equals(pk)) {
                orderFormCommodityObject = object;
                break;
            }
        }
        return orderFormCommodityObject;
    }

    /**
     * Get OrderFormCommodity instance from <Code>OrderFormCommodity</Code> instance array by primary key.
     *
     * @param orderFormCommodityArray OrderFormCommodity instance array
     * @param pk                      primary key
     * @return OrderFormCommodity instance
     */
    public static OrderFormCommodity getOrderFormCommodityByPk(OrderFormCommodity[] orderFormCommodityArray, OrderFormCommodityPK pk) {
        return orderFormCommodityArray == null ? null : getOrderFormCommodityByPk(Arrays.asList(orderFormCommodityArray), pk);
    }
}