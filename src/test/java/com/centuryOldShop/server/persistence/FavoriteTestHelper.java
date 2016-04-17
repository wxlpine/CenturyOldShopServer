/***********************************************************************
 * Module:  FavoriteTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class Favorite
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.FavoriteDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Test helper class for Favorite. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class FavoriteTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(FavoriteTestHelper.class);

    /**
     * Empty Constructor
     */
    public FavoriteTestHelper() {

    }

    /**
     * Create new Favorite instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static Favorite newInstance(Favorite persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new Favorite();

        if (associationInitialized) {
            AppUser appUser = AppUserTestHelper.newInstance(null, null, "", 0, false);
            AppUserTestHelper.save(appUser);

            Commodity commodity = CommodityTestHelper.newInstance(null, null, "", 0, false);
            CommodityTestHelper.save(commodity);

            FavoritePK pk = new FavoritePK(appUser.getUserId(), commodity.getCommodityId());
            persistentObject.setFavoritePK(pk);
        }

        persistentObject.setAddTime(com.centuryOldShop.server.Util.getRandomDate());
        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param persistentObject saved persistent object
     */

    public static void modifyObject(Favorite persistentObject) {
        persistentObject.setAddTime(com.centuryOldShop.server.Util.getRandomDate());
    }

    /**
     * Save Favorite object. Foreign key constraints are taked cared here.
     *
     * @param favoriteObject persistent object to be saved
     * @throws Exception
     */
    public static void save(Favorite favoriteObject) {
        FavoriteDao dao = DaoFactory.getDaoFactory().getFavoriteDao();
        dao.saveOrUpdate(favoriteObject);
    }

    /**
     * Delete Favorite object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param favoriteObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(Favorite favoriteObject) {
        FavoriteDao dao = DaoFactory.getDaoFactory().getFavoriteDao();
        dao.delete(favoriteObject);
    }

    /**
     * Get Favorite instance from collection by primary key.
     *
     * @param collection Favorite instance collection
     * @param pk         primary key
     * @return Favorite instance
     */
    public static Favorite getFavoriteByPk(Collection collection, FavoritePK pk) {
        Favorite favoriteObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Favorite object = (Favorite) iterator.next();
            if (object.getFavoritePK().equals(pk)) {
                favoriteObject = object;
                break;
            }
        }
        return favoriteObject;
    }

    /**
     * Get Favorite instance from <Code>Favorite</Code> instance array by primary key.
     *
     * @param favoriteArray Favorite instance array
     * @param pk            primary key
     * @return Favorite instance
     */
    public static Favorite getFavoriteByPk(Favorite[] favoriteArray, FavoritePK pk) {
        return favoriteArray == null ? null : getFavoriteByPk(Arrays.asList(favoriteArray), pk);
    }
}