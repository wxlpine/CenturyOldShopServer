/***********************************************************************
 * Module:  CommodityTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class Commodity
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.Util;
import com.centuryOldShop.server.persistence.dao.CommodityDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/**
 * Test helper class for Commodity. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class CommodityTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(CommodityTestHelper.class);

    /**
     * Empty Constructor
     */
    public CommodityTestHelper() {

    }

    /**
     * Create new Commodity instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static Commodity newInstance(Commodity persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new Commodity();

//        persistentObject.setCommodityId((long) random.nextInt());
        persistentObject.setCommodityName(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setSmallPhotoUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setShortDescription(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setPrice(getRandomPrice());
        persistentObject.setSalesVolume(random.nextInt());
        persistentObject.setExemptionFromPostage(random.nextBoolean());
        persistentObject.setAddedTime(com.centuryOldShop.server.Util.getRandomDate());
        persistentObject.setPhoneTopBigPhotoUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setOffShelf(random.nextBoolean());
        persistentObject.setRemainingQuantity(random.nextInt());

        if (precedingObject != null && associationId.equals("FA86E9CC-9786-4EA4-8E04-251C1EB2B194")) {
            persistentObject.addFavoriteUser((AppUser) precedingObject);
        }
        if (precedingObject != null && associationId.equals("9E9548A2-5886-4037-95A7-DB8C763BB115")) {
            persistentObject.addOrderForm((OrderForm) precedingObject);
        }

        if (precedingObject != null && associationId.equals("808054D0-E089-4DEE-98D2-B9E936672141")) {
            persistentObject.addShoppingCartUser((AppUser) precedingObject);
        }

        if (precedingObject != null && associationId.equals("B6E5A157-FAE4-4F78-983D-CEACC224518C")) {
            persistentObject.addDiscountInfo((DiscountInfo) precedingObject);
        }

        if (precedingObject != null && associationId.equals("4B9C53CD-21E8-4307-AA63-FF411B6B8339")) {
            persistentObject.setCommodityType((CommodityType) precedingObject);
        }
        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param persistentObject saved persistent object
     */

    public static void modifyObject(Commodity persistentObject) {
        persistentObject.setCommodityName(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setSmallPhotoUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setShortDescription(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setPrice(getRandomPrice());
        persistentObject.setSalesVolume(random.nextInt());
        persistentObject.setExemptionFromPostage(random.nextBoolean());
        persistentObject.setAddedTime(com.centuryOldShop.server.Util.getRandomDate());
        persistentObject.setPhoneTopBigPhotoUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setOffShelf(random.nextBoolean());
        persistentObject.setRemainingQuantity(random.nextInt());
    }

    /**
     * Save Commodity object. Foreign key constraints are taked cared here.
     *
     * @param commodityObject persistent object to be saved
     * @throws Exception
     */
    public static void save(Commodity commodityObject) {

        CommodityType commodityType = commodityObject.getCommodityType();
        if (commodityType == null) {
            commodityType = CommodityTypeTestHelper.newInstance(null, null, "4B9C53CD-21E8-4307-AA63-FF411B6B8339", 1, false);
        }
        commodityType.setCommodity(null);
        DaoFactory.getDaoFactory().getCommodityTypeDao().save(commodityType);
        commodityObject.setCommodityType(commodityType);
        CommodityDao dao = DaoFactory.getDaoFactory().getCommodityDao();
        dao.saveOrUpdate(commodityObject);
    }

    /**
     * Delete Commodity object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param commodityObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(Commodity commodityObject) {
        java.util.List favoriteUsers = commodityObject.getFavoriteUser();
        if (favoriteUsers != null) {
            Iterator it = favoriteUsers.iterator();
            while (it.hasNext()) {
                AppUser favoriteUser = (AppUser) it.next();
                favoriteUser.setFavoriteCommodity(null);
            }
        }
        java.util.List orderForms = commodityObject.getOrderForm();
        if (orderForms != null) {
            Iterator it = orderForms.iterator();
            while (it.hasNext()) {
                OrderForm orderForm = (OrderForm) it.next();
                orderForm.setCommodity(null);
            }
        }
        java.util.List shoppingCartUsers = commodityObject.getShoppingCartUser();
        if (shoppingCartUsers != null) {
            Iterator it = shoppingCartUsers.iterator();
            while (it.hasNext()) {
                AppUser shoppingCartUser = (AppUser) it.next();
                shoppingCartUser.setCommodity(null);
            }
        }
        java.util.List discountInfos = commodityObject.getDiscountInfo();
        if (discountInfos != null) {
            Iterator it = discountInfos.iterator();
            while (it.hasNext()) {
                DiscountInfo discountInfo = (DiscountInfo) it.next();
                discountInfo.setCommodity(null);
            }
        }
        CommodityDao dao = DaoFactory.getDaoFactory().getCommodityDao();
        dao.delete(commodityObject);
    }

    /**
     * Get Commodity instance from collection by primary key.
     *
     * @param collection Commodity instance collection
     * @param pk         primary key
     * @return Commodity instance
     */
    public static Commodity getCommodityByPk(Collection collection, CommodityPK pk) {
        Commodity commodityObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Commodity object = (Commodity) iterator.next();
            if (object.getCommodityPK().equals(pk)) {
                commodityObject = object;
                break;
            }
        }
        return commodityObject;
    }

    /**
     * Get Commodity instance from <Code>Commodity</Code> instance array by primary key.
     *
     * @param commodityArray Commodity instance array
     * @param pk             primary key
     * @return Commodity instance
     */
    public static Commodity getCommodityByPk(Commodity[] commodityArray, CommodityPK pk) {
        return commodityArray == null ? null : getCommodityByPk(Arrays.asList(commodityArray), pk);
    }

    static double getRandomPrice() {
        return Util.getRandomDecimal(4);
    }

    static boolean unitTestEquals(Commodity left, Commodity right) {
        if (left == right) return true;

        if (left == null || right == null) {
            return false;
        }

        return left.getCommodityId() == right.getCommodityId() &&
                Double.compare(right.getPrice(), left.getPrice()) == 0 &&
                left.getSalesVolume() == right.getSalesVolume() &&
                left.getExemptionFromPostage() == right.getExemptionFromPostage() &&
                left.getOffShelf() == right.getOffShelf() &&
                left.getRemainingQuantity() == right.getRemainingQuantity() &&
                Objects.equals(left.getCommodityName(), right.getCommodityName()) &&
                Objects.equals(left.getSmallPhotoUrl(), right.getSmallPhotoUrl()) &&
                Objects.equals(left.getShortDescription(), right.getShortDescription()) &&
                Objects.equals(left.getAddedTime(), right.getAddedTime()) &&
                Objects.equals(left.getPhoneTopBigPhotoUrl(), right.getPhoneTopBigPhotoUrl()) &&
                CommodityTypeTestHelper.unitTestEquals(left.getCommodityType(), right.getCommodityType());
    }
}