/***********************************************************************
 * Module:  OrderFormTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class OrderForm
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.OrderFormDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Test helper class for OrderForm. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class OrderFormTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(OrderFormTestHelper.class);

    /**
     * Empty Constructor
     */
    public OrderFormTestHelper() {

    }

    /**
     * Create new OrderForm instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static OrderForm newInstance(OrderForm persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new OrderForm();

        persistentObject.setOrderFormId((long) random.nextInt());
        persistentObject.setOrderedTime(new java.util.Date(random.nextInt(10000)));
        persistentObject.setPayedTime(new java.util.Date(random.nextInt(10000)));
        persistentObject.setSendTime(new java.util.Date(random.nextInt(10000)));
        persistentObject.setReceiptedTime(new java.util.Date(random.nextInt(10000)));
        persistentObject.setExpressNumber(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        if (precedingObject != null && associationId.equals("9E9548A2-5886-4037-95A7-DB8C763BB115")) {
            persistentObject.addCommodity((Commodity) precedingObject);
        }
        if (precedingObject != null && associationId.equals("7172C04B-60A6-4F4E-8B09-E8423ED7614A")) {
            persistentObject.setAppUser((AppUser) precedingObject);
        }

        if (precedingObject != null && associationId.equals("C95F23C3-C062-43F0-80C9-B18BF56A4C58")) {
            persistentObject.setShop((Shop) precedingObject);
        }

        if (precedingObject != null && associationId.equals("DD8F1D00-C235-40F3-960D-8AE2F1462CA8")) {
            persistentObject.setDiscountInfo((DiscountInfo) precedingObject);
        }

        if (precedingObject != null && associationId.equals("04EC9816-006E-4BD9-B093-473F9442DD3B")) {
            persistentObject.setOrderStatusType((OrderStatusType) precedingObject);
        }

        if (precedingObject != null && associationId.equals("A664EEEB-8B32-4E0D-83F2-50E4B99E51B2")) {
            persistentObject.setDisputeStatusType((DisputeStatusType) precedingObject);
        }
        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param orderFormObject saved persistent object
     */

    public static void modifyObject(OrderForm persistentObject) {
        persistentObject.setOrderedTime(new java.util.Date(random.nextInt(10000)));
        persistentObject.setPayedTime(new java.util.Date(random.nextInt(10000)));
        persistentObject.setSendTime(new java.util.Date(random.nextInt(10000)));
        persistentObject.setReceiptedTime(new java.util.Date(random.nextInt(10000)));
        persistentObject.setExpressNumber(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
    }

    /**
     * Save OrderForm object. Foreign key constraints are taked cared here.
     *
     * @param orderFormObject persistent object to be saved
     * @throws Exception
     */
    public static void save(OrderForm orderFormObject) {

        AppUser appUser = orderFormObject.getAppUser();
        if (appUser == null) {
            appUser = com.centuryOldShop.server.persistence.AppUserTestHelper.newInstance(null, null, "7172C04B-60A6-4F4E-8B09-E8423ED7614A", 1, false);
        }
        appUser.setOrderForm(null);
        DaoFactory.getDaoFactory().getAppUserDao().save(appUser);
        orderFormObject.setAppUser(appUser);
        Shop shop = orderFormObject.getShop();
        if (shop == null) {
            shop = com.centuryOldShop.server.persistence.ShopTestHelper.newInstance(null, null, "C95F23C3-C062-43F0-80C9-B18BF56A4C58", 1, false);
        }
        shop.setOrderForm(null);
        DaoFactory.getDaoFactory().getShopDao().save(shop);
        orderFormObject.setShop(shop);
        OrderStatusType orderStatusType = orderFormObject.getOrderStatusType();
        if (orderStatusType == null) {
            orderStatusType = com.centuryOldShop.server.persistence.OrderStatusTypeTestHelper.newInstance(null, null, "04EC9816-006E-4BD9-B093-473F9442DD3B", 1, false);
        }
        orderStatusType.setOrderForm(null);
        DaoFactory.getDaoFactory().getOrderStatusTypeDao().save(orderStatusType);
        orderFormObject.setOrderStatusType(orderStatusType);
        DisputeStatusType disputeStatusType = orderFormObject.getDisputeStatusType();
        if (disputeStatusType == null) {
            disputeStatusType = com.centuryOldShop.server.persistence.DisputeStatusTypeTestHelper.newInstance(null, null, "A664EEEB-8B32-4E0D-83F2-50E4B99E51B2", 1, false);
        }
        disputeStatusType.setOrderForm(null);
        DaoFactory.getDaoFactory().getDisputeStatusTypeDao().save(disputeStatusType);
        orderFormObject.setDisputeStatusType(disputeStatusType);
        OrderFormDao dao = DaoFactory.getDaoFactory().getOrderFormDao();
        dao.saveOrUpdate(orderFormObject);
    }

    /**
     * Delete OrderForm object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param orderFormObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(OrderForm orderFormObject) {
        java.util.List commoditys = orderFormObject.getCommodity();
        if (commoditys != null) {
            Iterator it = commoditys.iterator();
            while (it.hasNext()) {
                Commodity commodity = (Commodity) it.next();
                commodity.setOrderForm(null);
            }
        }
        DiscountInfo discountInfo = orderFormObject.getDiscountInfo();
        if (discountInfo != null) {
            discountInfo.setOrderForm(null);
        }
        OrderFormDao dao = DaoFactory.getDaoFactory().getOrderFormDao();
        dao.delete(orderFormObject);
    }

    /**
     * Get OrderForm instance from collection by primary key.
     *
     * @param collection OrderForm instance collection
     * @param pk         primary key
     * @return OrderForm instance
     */
    public static OrderForm getOrderFormByPk(Collection collection, OrderFormPK pk) {
        OrderForm orderFormObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            OrderForm object = (OrderForm) iterator.next();
            if (object.getOrderFormPK().equals(pk)) {
                orderFormObject = object;
                break;
            }
        }
        return orderFormObject;
    }

    /**
     * Get OrderForm instance from <Code>OrderForm</Code> instance array by primary key.
     *
     * @param orderFormArray OrderForm instance array
     * @param pk             primary key
     * @return OrderForm instance
     */
    public static OrderForm getOrderFormByPk(OrderForm[] orderFormArray, OrderFormPK pk) {
        return orderFormArray == null ? null : getOrderFormByPk(Arrays.asList(orderFormArray), pk);
    }
}