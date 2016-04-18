/***********************************************************************
 * Module:  CommodityTypeTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class CommodityType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.CommodityTypeDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/**
 * Test helper class for CommodityType. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class CommodityTypeTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(CommodityTypeTestHelper.class);

    /**
     * Empty Constructor
     */
    public CommodityTypeTestHelper() {

    }

    /**
     * Create new CommodityType instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static CommodityType newInstance(CommodityType persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new CommodityType();

        persistentObject.setCommodityType(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        if (precedingObject != null && associationId.equals("4B9C53CD-21E8-4307-AA63-FF411B6B8339")) {
            persistentObject.addCommodity((Commodity) precedingObject);
        }
        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param persistentObject saved persistent object
     */

    public static void modifyObject(CommodityType persistentObject) {
    }

    /**
     * Save CommodityType object. Foreign key constraints are taked cared here.
     *
     * @param commodityTypeObject persistent object to be saved
     * @throws Exception
     */
    public static void save(CommodityType commodityTypeObject) {
        CommodityTypeDao dao = DaoFactory.getDaoFactory().getCommodityTypeDao();
        dao.saveOrUpdate(commodityTypeObject);
    }

    /**
     * Delete CommodityType object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param commodityTypeObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(CommodityType commodityTypeObject) {
        java.util.List commoditys = commodityTypeObject.getCommodity();
        if (commoditys != null) {
            Iterator it = commoditys.iterator();
            while (it.hasNext()) {
                Commodity commodity = (Commodity) it.next();
                com.centuryOldShop.server.persistence.CommodityTestHelper.delete(commodity);
            }
        }
        CommodityTypeDao dao = DaoFactory.getDaoFactory().getCommodityTypeDao();
        dao.delete(commodityTypeObject);
    }

    /**
     * Get CommodityType instance from collection by primary key.
     *
     * @param collection CommodityType instance collection
     * @param pk         primary key
     * @return CommodityType instance
     */
    public static CommodityType getCommodityTypeByPk(Collection collection, CommodityTypePK pk) {
        CommodityType commodityTypeObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            CommodityType object = (CommodityType) iterator.next();
            if (object.getCommodityTypePK().equals(pk)) {
                commodityTypeObject = object;
                break;
            }
        }
        return commodityTypeObject;
    }

    /**
     * Get CommodityType instance from <Code>CommodityType</Code> instance array by primary key.
     *
     * @param commodityTypeArray CommodityType instance array
     * @param pk                 primary key
     * @return CommodityType instance
     */
    public static CommodityType getCommodityTypeByPk(CommodityType[] commodityTypeArray, CommodityTypePK pk) {
        return commodityTypeArray == null ? null : getCommodityTypeByPk(Arrays.asList(commodityTypeArray), pk);
    }

    static boolean unitTestEquals(CommodityType left, CommodityType right) {
        if (left == right) return true;

        if (left == null || right == null) {
            return false;
        }

        return Objects.equals(left.getCommodityType(), right.getCommodityType());
    }

}