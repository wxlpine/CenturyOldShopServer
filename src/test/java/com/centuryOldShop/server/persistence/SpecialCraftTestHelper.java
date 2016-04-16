/***********************************************************************
 * Module:  SpecialCraftTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class SpecialCraft
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.SpecialCraftDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Test helper class for SpecialCraft. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class SpecialCraftTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(SpecialCraftTestHelper.class);

    /**
     * Empty Constructor
     */
    public SpecialCraftTestHelper() {

    }

    /**
     * Create new SpecialCraft instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static SpecialCraft newInstance(SpecialCraft persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new SpecialCraft();

//        persistentObject.setSpecialCraftId((long) random.nextInt());
        persistentObject.setTitle(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setSmallPhotoUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setIntroductionUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setAddedTime(new java.util.Date(random.nextInt(10000)));
        persistentObject.setShortIntro(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        if (precedingObject != null && associationId.equals("36845EDD-5004-47D9-ADC6-9C1787C42BF4")) {
            persistentObject.setShop((Shop) precedingObject);
        }
        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param specialCraftObject saved persistent object
     */

    public static void modifyObject(SpecialCraft persistentObject) {
        persistentObject.setTitle(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setSmallPhotoUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setIntroductionUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setAddedTime(new java.util.Date(random.nextInt(10000)));
        persistentObject.setShortIntro(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
    }

    /**
     * Save SpecialCraft object. Foreign key constraints are taked cared here.
     *
     * @param specialCraftObject persistent object to be saved
     * @throws Exception
     */
    public static void save(SpecialCraft specialCraftObject) {

        Shop shop = specialCraftObject.getShop();
        if (shop == null) {
            shop = ShopTestHelper.newInstance(null, null, "36845EDD-5004-47D9-ADC6-9C1787C42BF4", 1, false);
        }
        shop.setSpecialCraft(null);
        DaoFactory.getDaoFactory().getShopDao().save(shop);
        specialCraftObject.setShop(shop);
        SpecialCraftDao dao = DaoFactory.getDaoFactory().getSpecialCraftDao();
        dao.saveOrUpdate(specialCraftObject);
    }

    /**
     * Delete SpecialCraft object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param specialCraftObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(SpecialCraft specialCraftObject) {
        SpecialCraftDao dao = DaoFactory.getDaoFactory().getSpecialCraftDao();
        dao.delete(specialCraftObject);
    }

    /**
     * Get SpecialCraft instance from collection by primary key.
     *
     * @param collection SpecialCraft instance collection
     * @param pk         primary key
     * @return SpecialCraft instance
     */
    public static SpecialCraft getSpecialCraftByPk(Collection collection, SpecialCraftPK pk) {
        SpecialCraft specialCraftObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            SpecialCraft object = (SpecialCraft) iterator.next();
            if (object.getSpecialCraftPK().equals(pk)) {
                specialCraftObject = object;
                break;
            }
        }
        return specialCraftObject;
    }

    /**
     * Get SpecialCraft instance from <Code>SpecialCraft</Code> instance array by primary key.
     *
     * @param specialCraftArray SpecialCraft instance array
     * @param pk                primary key
     * @return SpecialCraft instance
     */
    public static SpecialCraft getSpecialCraftByPk(SpecialCraft[] specialCraftArray, SpecialCraftPK pk) {
        return specialCraftArray == null ? null : getSpecialCraftByPk(Arrays.asList(specialCraftArray), pk);
    }
}