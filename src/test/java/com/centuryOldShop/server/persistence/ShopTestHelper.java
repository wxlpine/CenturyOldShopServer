/***********************************************************************
 * Module:  ShopTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class Shop
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.ShopDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.*;

/**
 * Test helper class for Shop. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class ShopTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(ShopTestHelper.class);

    /**
     * Empty Constructor
     */
    public ShopTestHelper() {

    }

    /**
     * Create new Shop instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static Shop newInstance(Shop persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new Shop();

//        persistentObject.setShopId((long) random.nextInt());
        persistentObject.setShopName(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setShortDescription(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setOpenABusinessTime(com.centuryOldShop.server.Util.getRandomDate());
        persistentObject.setVisitCount(random.nextInt());
        persistentObject.setDetailedAddress(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setTrademark(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setEnterTime(com.centuryOldShop.server.Util.getRandomDate());
        persistentObject.setPhoneNumber(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setFax(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setLongDescription(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));

        if (associationInitialized) {
            ShopType shopType = ShopTypeTestHelper.newInstance(null, null, "", 0, false);
            persistentObject.setShopType(shopType);
            DaoFactory.getDaoFactory().getShopTypeDao().save(shopType);

            ShopArea shopArea = ShopAreaTestHelper.newInstance(null, null, "", 0, true);
            persistentObject.setShopArea(shopArea);
            DaoFactory.getDaoFactory().getShopAreaDao().save(shopArea);
        }

        if (precedingObject != null && associationId.equals("C1F60A6B-07B2-48C6-A409-C5E308C44B5B")) {
            persistentObject.addNews((News) precedingObject);
        }
        if (precedingObject != null && associationId.equals("E042F58F-0AA6-4E67-A95A-5C2CBFA9A71E")) {
            persistentObject.addShopStory((ShopStory) precedingObject);
        }
        if (precedingObject != null && associationId.equals("0F9D1CF5-8FE8-45D8-89F8-9C1941B8561B")) {
            persistentObject.addDiscountInfo((DiscountInfo) precedingObject);
        }
        if (precedingObject != null && associationId.equals("C95F23C3-C062-43F0-80C9-B18BF56A4C58")) {
            persistentObject.addOrderForm((OrderForm) precedingObject);
        }
        if (precedingObject != null && associationId.equals("DD1553D4-C90B-4F1B-AE75-28AF72FCD46E")) {
            persistentObject.addShopHistory((ShopHistory) precedingObject);
        }
        if (precedingObject != null && associationId.equals("36845EDD-5004-47D9-ADC6-9C1787C42BF4")) {
            persistentObject.addSpecialCraft((SpecialCraft) precedingObject);
        }
        if (precedingObject != null && associationId.equals("598D0883-33B3-4CA0-AB56-33CDC1E3B094")) {
            persistentObject.addVideoIntroduction((VideoIntroduction) precedingObject);
        }
        if (precedingObject != null && associationId.equals("1AE37866-3C1B-45F5-83D7-47AF1B7752D0")) {
            persistentObject.addShopManager((AppUser) precedingObject);
        }
        if (precedingObject != null && associationId.equals("F5CFBA7E-1286-4274-AAD4-43B59F4BFD45")) {
            persistentObject.setShopType((ShopType) precedingObject);
        }

        if (precedingObject != null && associationId.equals("9909044A-4853-4C2D-981B-724F9C29695C")) {
            persistentObject.setShopArea((ShopArea) precedingObject);
        }
        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param shopObject saved persistent object
     */

    public static void modifyObject(Shop shopObject) {
        shopObject.setShopName(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        shopObject.setShortDescription(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        shopObject.setOpenABusinessTime(com.centuryOldShop.server.Util.getRandomDate());
        shopObject.setVisitCount(random.nextInt());
        shopObject.setDetailedAddress(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        shopObject.setTrademark(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        shopObject.setEnterTime(com.centuryOldShop.server.Util.getRandomDate());
        shopObject.setPhoneNumber(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        shopObject.setFax(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        shopObject.setLongDescription(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
    }

    /**
     * Save Shop object. Foreign key constraints are taked cared here.
     *
     * @param shopObject persistent object to be saved
     * @throws Exception
     */
    public static void save(Shop shopObject) {

        ShopType shopType = shopObject.getShopType();
        if (shopType == null) {
            shopType = com.centuryOldShop.server.persistence.ShopTypeTestHelper.newInstance(null, null, "F5CFBA7E-1286-4274-AAD4-43B59F4BFD45", 1, false);
        }
        shopType.setShop(null);
        DaoFactory.getDaoFactory().getShopTypeDao().save(shopType);
        shopObject.setShopType(shopType);
        ShopArea shopArea = shopObject.getShopArea();
        if (shopArea == null) {
            shopArea = ShopAreaTestHelper.newInstance(null, null, "9909044A-4853-4C2D-981B-724F9C29695C", 1, true);
        }
        shopArea.setShop(null);
        DaoFactory.getDaoFactory().getShopAreaDao().save(shopArea);
        shopObject.setShopArea(shopArea);
        ShopDao dao = DaoFactory.getDaoFactory().getShopDao();
        dao.saveOrUpdate(shopObject);
    }

    /**
     * Delete Shop object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param shopObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(Shop shopObject) {

        List<News> newss = shopObject.getNews();
        if (newss != null) {
            newss.forEach(NewsTestHelper::delete);
        }

        List shopStorys = shopObject.getShopStory();
        if (shopStorys != null) {
            Iterator it = shopStorys.iterator();
            while (it.hasNext()) {
                ShopStory shopStory = (ShopStory) it.next();
                com.centuryOldShop.server.persistence.ShopStoryTestHelper.delete(shopStory);
            }
        }

        List discountInfos = shopObject.getDiscountInfo();
        if (discountInfos != null) {
            Iterator it = discountInfos.iterator();
            while (it.hasNext()) {
                DiscountInfo discountInfo = (DiscountInfo) it.next();
                com.centuryOldShop.server.persistence.DiscountInfoTestHelper.delete(discountInfo);
            }
        }

        List orderForms = shopObject.getOrderForm();
        if (orderForms != null) {
            Iterator it = orderForms.iterator();
            while (it.hasNext()) {
                OrderForm orderForm = (OrderForm) it.next();
                com.centuryOldShop.server.persistence.OrderFormTestHelper.delete(orderForm);
            }
        }

        List shopHistorys = shopObject.getShopHistory();
        if (shopHistorys != null) {
            Iterator it = shopHistorys.iterator();
            while (it.hasNext()) {
                ShopHistory shopHistory = (ShopHistory) it.next();
                com.centuryOldShop.server.persistence.ShopHistoryTestHelper.delete(shopHistory);
            }
        }

        List specialCrafts = shopObject.getSpecialCraft();
        if (specialCrafts != null) {
            Iterator it = specialCrafts.iterator();
            while (it.hasNext()) {
                SpecialCraft specialCraft = (SpecialCraft) it.next();
                com.centuryOldShop.server.persistence.SpecialCraftTestHelper.delete(specialCraft);
            }
        }

        List videoIntroductions = shopObject.getVideoIntroduction();
        if (videoIntroductions != null) {
            Iterator it = videoIntroductions.iterator();
            while (it.hasNext()) {
                VideoIntroduction videoIntroduction = (VideoIntroduction) it.next();
                com.centuryOldShop.server.persistence.VideoIntroductionTestHelper.delete(videoIntroduction);
            }
        }

        List shopManagers = shopObject.getShopManager();
        if (shopManagers != null) {
            Iterator it = shopManagers.iterator();
            while (it.hasNext()) {
                AppUser shopManager = (AppUser) it.next();
                shopManager.setManagedShop(null);
            }
        }

        Set<Commodity> commodity = shopObject.getCommodity();
        if (commodity != null) {
            commodity.forEach(CommodityTestHelper::delete);
        }

        ShopDao dao = DaoFactory.getDaoFactory().getShopDao();
        dao.delete(shopObject);
    }

    /**
     * Get Shop instance from collection by primary key.
     *
     * @param collection Shop instance collection
     * @param pk         primary key
     * @return Shop instance
     */
    public static Shop getShopByPk(Collection collection, ShopPK pk) {
        Shop shopObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Shop object = (Shop) iterator.next();
            if (object.getShopPK().equals(pk)) {
                shopObject = object;
                break;
            }
        }
        return shopObject;
    }

    /**
     * Get Shop instance from <Code>Shop</Code> instance array by primary key.
     *
     * @param shopArray Shop instance array
     * @param pk        primary key
     * @return Shop instance
     */
    public static Shop getShopByPk(Shop[] shopArray, ShopPK pk) {
        return shopArray == null ? null : getShopByPk(Arrays.asList(shopArray), pk);
    }

    static boolean unitTestEquals(Shop left, Shop right) {
        if (left == right) return true;

        if (left == null || right == null) {
            return false;
        }

        return left.getShopId() == right.getShopId() &&
                left.getVisitCount() == right.getVisitCount() &&
                Objects.equals(left.getShopName(), right.getShopName()) &&
                Objects.equals(left.getShortDescription(), right.getShortDescription()) &&
                Objects.equals(left.getOpenABusinessTime(), right.getOpenABusinessTime()) &&
                Objects.equals(left.getDetailedAddress(), right.getDetailedAddress()) &&
                Objects.equals(left.getTrademark(), right.getTrademark()) &&
                Objects.equals(left.getEnterTime(), right.getEnterTime()) &&
                Objects.equals(left.getPhoneNumber(), right.getPhoneNumber()) &&
                Objects.equals(left.getFax(), right.getFax()) &&
                Objects.equals(left.getLongDescription(), right.getLongDescription()) &&
                ShopTypeTestHelper.unitTestEquals(left.getShopType(), right.getShopType()) &&
                ShopAreaTestHelper.unitTestEquals(left.getShopArea(), right.getShopArea());
    }

}