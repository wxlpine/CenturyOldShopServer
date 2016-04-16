/***********************************************************************
 * Module:  AppUserTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class AppUser
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.AppUserDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Test helper class for AppUser. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class AppUserTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(AppUserTestHelper.class);

    /**
     * Empty Constructor
     */
    public AppUserTestHelper() {

    }

    /**
     * Create new AppUser instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static AppUser newInstance(AppUser persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new AppUser();

        persistentObject.setUserId((long) random.nextInt());
        persistentObject.setUserName(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setPassword(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setEmail(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setPhoneNumber(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setUserType((short) random.nextInt(65535));
        persistentObject.setHeadPortraitUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setRegisterTime(new java.util.Date(random.nextInt(10000)));
        if (precedingObject != null && associationId.equals("808054D0-E089-4DEE-98D2-B9E936672141")) {
            persistentObject.addCommodity((Commodity) precedingObject);
        }
        if (precedingObject != null && associationId.equals("7172C04B-60A6-4F4E-8B09-E8423ED7614A")) {
            persistentObject.addOrderForm((OrderForm) precedingObject);
        }
        if (precedingObject != null && associationId.equals("F65FB421-7546-45B4-B69C-3902DECB6B59")) {
            persistentObject.addSendMessage((Message) precedingObject);
        }
        if (precedingObject != null && associationId.equals("93D61792-C9D6-4F71-B280-1051DDE83EF5")) {
            persistentObject.addReceiveMessage((Message) precedingObject);
        }
        if (precedingObject != null && associationId.equals("FA86E9CC-9786-4EA4-8E04-251C1EB2B194")) {
            persistentObject.addFavoriteCommodity((Commodity) precedingObject);
        }

        if (precedingObject != null && associationId.equals("1AE37866-3C1B-45F5-83D7-47AF1B7752D0")) {
            persistentObject.setManagedShop((Shop) precedingObject);
        }
        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param appUserObject saved persistent object
     */

    public static void modifyObject(AppUser persistentObject) {
        persistentObject.setUserName(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setPassword(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setEmail(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setPhoneNumber(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setUserType((short) random.nextInt(65535));
        persistentObject.setHeadPortraitUrl(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        persistentObject.setRegisterTime(new java.util.Date(random.nextInt(10000)));
    }

    /**
     * Save AppUser object. Foreign key constraints are taked cared here.
     *
     * @param appUserObject persistent object to be saved
     * @throws Exception
     */
    public static void save(AppUser appUserObject) {
        AppUserDao dao = DaoFactory.getDaoFactory().getAppUserDao();
        dao.saveOrUpdate(appUserObject);
    }

    /**
     * Delete AppUser object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param appUserObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(AppUser appUserObject) {
        java.util.List commoditys = appUserObject.getCommodity();
        if (commoditys != null) {
            Iterator it = commoditys.iterator();
            while (it.hasNext()) {
                Commodity commodity = (Commodity) it.next();
                commodity.setShoppingCartUser(null);
            }
        }
        java.util.List orderForms = appUserObject.getOrderForm();
        if (orderForms != null) {
            Iterator it = orderForms.iterator();
            while (it.hasNext()) {
                OrderForm orderForm = (OrderForm) it.next();
                com.centuryOldShop.server.persistence.OrderFormTestHelper.delete(orderForm);
            }
        }
        java.util.List sendMessages = appUserObject.getSendMessage();
        if (sendMessages != null) {
            Iterator it = sendMessages.iterator();
            while (it.hasNext()) {
                Message sendMessage = (Message) it.next();
                com.centuryOldShop.server.persistence.MessageTestHelper.delete(sendMessage);
            }
        }
        java.util.List receiveMessages = appUserObject.getReceiveMessage();
        if (receiveMessages != null) {
            Iterator it = receiveMessages.iterator();
            while (it.hasNext()) {
                Message receiveMessage = (Message) it.next();
                com.centuryOldShop.server.persistence.MessageTestHelper.delete(receiveMessage);
            }
        }
        java.util.List favoriteCommoditys = appUserObject.getFavoriteCommodity();
        if (favoriteCommoditys != null) {
            Iterator it = favoriteCommoditys.iterator();
            while (it.hasNext()) {
                Commodity favoriteCommodity = (Commodity) it.next();
                favoriteCommodity.setFavoriteUser(null);
            }
        }
        Shop managedShop = appUserObject.getManagedShop();
        if (managedShop != null) {
            managedShop.setShopManager(null);
        }
        AppUserDao dao = DaoFactory.getDaoFactory().getAppUserDao();
        dao.delete(appUserObject);
    }

    /**
     * Get AppUser instance from collection by primary key.
     *
     * @param collection AppUser instance collection
     * @param pk         primary key
     * @return AppUser instance
     */
    public static AppUser getAppUserByPk(Collection collection, AppUserPK pk) {
        AppUser appUserObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            AppUser object = (AppUser) iterator.next();
            if (object.getAppUserPK().equals(pk)) {
                appUserObject = object;
                break;
            }
        }
        return appUserObject;
    }

    /**
     * Get AppUser instance from <Code>AppUser</Code> instance array by primary key.
     *
     * @param appUserArray AppUser instance array
     * @param pk           primary key
     * @return AppUser instance
     */
    public static AppUser getAppUserByPk(AppUser[] appUserArray, AppUserPK pk) {
        return appUserArray == null ? null : getAppUserByPk(Arrays.asList(appUserArray), pk);
    }
}