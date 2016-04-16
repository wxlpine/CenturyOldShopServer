/***********************************************************************
 * Module:  DiscountInfoTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class DiscountInfo
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.DiscountInfoDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Test helper class for DiscountInfo. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class DiscountInfoTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(DiscountInfoTestHelper.class);

    /**
     * Empty Constructor
     */
    public DiscountInfoTestHelper() {

    }

    /**
     * Create new DiscountInfo instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static DiscountInfo newInstance(DiscountInfo persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new DiscountInfo();

        persistentObject.setDiscountInfoId((long) random.nextInt());
        persistentObject.setTitle(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setDiscountStartTime(new java.util.Date(random.nextInt(10000)));
        persistentObject.setDiscountEndTime(new java.util.Date(random.nextInt(10000)));
        persistentObject.setPriceReduceMinPrice(random.nextDouble());
        persistentObject.setPriceReduceAmount(random.nextDouble());
        persistentObject.setDiscountMinPrice(random.nextDouble());
        persistentObject.setDiscountRatio(random.nextDouble());
        if (precedingObject != null && associationId.equals("B6E5A157-FAE4-4F78-983D-CEACC224518C")) {
            persistentObject.addCommodity((Commodity) precedingObject);
        }
        if (precedingObject != null && associationId.equals("DD8F1D00-C235-40F3-960D-8AE2F1462CA8")) {
            persistentObject.addOrderForm((OrderForm) precedingObject);
        }
        if (precedingObject != null && associationId.equals("0F9D1CF5-8FE8-45D8-89F8-9C1941B8561B")) {
            persistentObject.setShop((Shop) precedingObject);
        }

        if (precedingObject != null && associationId.equals("B5712C03-1F87-4CFD-8EDD-0D2B3F21A63F")) {
            persistentObject.setDiscountType((DiscountType) precedingObject);
        }
        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param persistentObject saved persistent object
     */

    public static void modifyObject(DiscountInfo persistentObject) {
        persistentObject.setTitle(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setDiscountStartTime(new java.util.Date(random.nextInt(10000)));
        persistentObject.setDiscountEndTime(new java.util.Date(random.nextInt(10000)));
        persistentObject.setPriceReduceMinPrice(random.nextDouble());
        persistentObject.setPriceReduceAmount(random.nextDouble());
        persistentObject.setDiscountMinPrice(random.nextDouble());
        persistentObject.setDiscountRatio(random.nextDouble());
    }

    /**
     * Save DiscountInfo object. Foreign key constraints are taked cared here.
     *
     * @param discountInfoObject persistent object to be saved
     * @throws Exception
     */
    public static void save(DiscountInfo discountInfoObject) {

        Shop shop = discountInfoObject.getShop();
        if (shop == null) {
            shop = com.centuryOldShop.server.persistence.ShopTestHelper.newInstance(null, null, "0F9D1CF5-8FE8-45D8-89F8-9C1941B8561B", 1, false);
        }
        shop.setDiscountInfo(null);
        DaoFactory.getDaoFactory().getShopDao().save(shop);
        discountInfoObject.setShop(shop);
        DiscountType discountType = discountInfoObject.getDiscountType();
        if (discountType == null) {
            discountType = com.centuryOldShop.server.persistence.DiscountTypeTestHelper.newInstance(null, null, "B5712C03-1F87-4CFD-8EDD-0D2B3F21A63F", 1, false);
        }
        discountType.setDiscountInfo(null);
        DaoFactory.getDaoFactory().getDiscountTypeDao().save(discountType);
        discountInfoObject.setDiscountType(discountType);
        DiscountInfoDao dao = DaoFactory.getDaoFactory().getDiscountInfoDao();
        dao.saveOrUpdate(discountInfoObject);
    }

    /**
     * Delete DiscountInfo object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param discountInfoObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(DiscountInfo discountInfoObject) {
        java.util.List commoditys = discountInfoObject.getCommodity();
        if (commoditys != null) {
            Iterator it = commoditys.iterator();
            while (it.hasNext()) {
                Commodity commodity = (Commodity) it.next();
                commodity.setDiscountInfo(null);
            }
        }
        java.util.List orderForms = discountInfoObject.getOrderForm();
        if (orderForms != null) {
            Iterator it = orderForms.iterator();
            while (it.hasNext()) {
                OrderForm orderForm = (OrderForm) it.next();
                orderForm.setDiscountInfo(null);
            }
        }
        DiscountInfoDao dao = DaoFactory.getDaoFactory().getDiscountInfoDao();
        dao.delete(discountInfoObject);
    }

    /**
     * Get DiscountInfo instance from collection by primary key.
     *
     * @param collection DiscountInfo instance collection
     * @param pk         primary key
     * @return DiscountInfo instance
     */
    public static DiscountInfo getDiscountInfoByPk(Collection collection, DiscountInfoPK pk) {
        DiscountInfo discountInfoObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            DiscountInfo object = (DiscountInfo) iterator.next();
            if (object.getDiscountInfoPK().equals(pk)) {
                discountInfoObject = object;
                break;
            }
        }
        return discountInfoObject;
    }

    /**
     * Get DiscountInfo instance from <Code>DiscountInfo</Code> instance array by primary key.
     *
     * @param discountInfoArray DiscountInfo instance array
     * @param pk                primary key
     * @return DiscountInfo instance
     */
    public static DiscountInfo getDiscountInfoByPk(DiscountInfo[] discountInfoArray, DiscountInfoPK pk) {
        return discountInfoArray == null ? null : getDiscountInfoByPk(Arrays.asList(discountInfoArray), pk);
    }
}