/***********************************************************************
 * Module:  OrderStatusTypeTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class OrderStatusType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.OrderStatusTypeDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Test helper class for OrderStatusType. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class OrderStatusTypeTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(OrderStatusTypeTestHelper.class);

    /**
     * Empty Constructor
     */
    public OrderStatusTypeTestHelper() {

    }

    /**
     * Create new OrderStatusType instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static OrderStatusType newInstance(OrderStatusType persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new OrderStatusType();

        persistentObject.setOrderStatusType(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        if (precedingObject != null && associationId.equals("04EC9816-006E-4BD9-B093-473F9442DD3B")) {
            persistentObject.addOrderForm((OrderForm) precedingObject);
        }
        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param persistentObject saved persistent object
     */

    public static void modifyObject(OrderStatusType persistentObject) {
    }

    /**
     * Save OrderStatusType object. Foreign key constraints are taked cared here.
     *
     * @param orderStatusTypeObject persistent object to be saved
     * @throws Exception
     */
    public static void save(OrderStatusType orderStatusTypeObject) {
        OrderStatusTypeDao dao = DaoFactory.getDaoFactory().getOrderStatusTypeDao();
        dao.saveOrUpdate(orderStatusTypeObject);
    }

    /**
     * Delete OrderStatusType object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param orderStatusTypeObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(OrderStatusType orderStatusTypeObject) {
        java.util.List orderForms = orderStatusTypeObject.getOrderForm();
        if (orderForms != null) {
            Iterator it = orderForms.iterator();
            while (it.hasNext()) {
                OrderForm orderForm = (OrderForm) it.next();
                com.centuryOldShop.server.persistence.OrderFormTestHelper.delete(orderForm);
            }
        }
        OrderStatusTypeDao dao = DaoFactory.getDaoFactory().getOrderStatusTypeDao();
        dao.delete(orderStatusTypeObject);
    }

    /**
     * Get OrderStatusType instance from collection by primary key.
     *
     * @param collection OrderStatusType instance collection
     * @param pk         primary key
     * @return OrderStatusType instance
     */
    public static OrderStatusType getOrderStatusTypeByPk(Collection collection, OrderStatusTypePK pk) {
        OrderStatusType orderStatusTypeObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            OrderStatusType object = (OrderStatusType) iterator.next();
            if (object.getOrderStatusTypePK().equals(pk)) {
                orderStatusTypeObject = object;
                break;
            }
        }
        return orderStatusTypeObject;
    }

    /**
     * Get OrderStatusType instance from <Code>OrderStatusType</Code> instance array by primary key.
     *
     * @param orderStatusTypeArray OrderStatusType instance array
     * @param pk                   primary key
     * @return OrderStatusType instance
     */
    public static OrderStatusType getOrderStatusTypeByPk(OrderStatusType[] orderStatusTypeArray, OrderStatusTypePK pk) {
        return orderStatusTypeArray == null ? null : getOrderStatusTypeByPk(Arrays.asList(orderStatusTypeArray), pk);
    }
}