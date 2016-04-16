/***********************************************************************
 * Module:  DiscountTypeTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class DiscountType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.DiscountTypeDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Test helper class for DiscountType. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class DiscountTypeTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(DiscountTypeTestHelper.class);

    /**
     * Empty Constructor
     */
    public DiscountTypeTestHelper() {

    }

    /**
     * Create new DiscountType instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static DiscountType newInstance(DiscountType persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new DiscountType();

        persistentObject.setDiscountTypeId((long) random.nextInt());
        persistentObject.setDiscountTypeName(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        if (precedingObject != null && associationId.equals("B5712C03-1F87-4CFD-8EDD-0D2B3F21A63F")) {
            persistentObject.addDiscountInfo((DiscountInfo) precedingObject);
        }
        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param persistentObject saved persistent object
     */

    public static void modifyObject(DiscountType persistentObject) {
        persistentObject.setDiscountTypeName(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
    }

    /**
     * Save DiscountType object. Foreign key constraints are taked cared here.
     *
     * @param discountTypeObject persistent object to be saved
     * @throws Exception
     */
    public static void save(DiscountType discountTypeObject) {
        DiscountTypeDao dao = DaoFactory.getDaoFactory().getDiscountTypeDao();
        dao.saveOrUpdate(discountTypeObject);
    }

    /**
     * Delete DiscountType object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param discountTypeObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(DiscountType discountTypeObject) {
        java.util.List discountInfos = discountTypeObject.getDiscountInfo();
        if (discountInfos != null) {
            Iterator it = discountInfos.iterator();
            while (it.hasNext()) {
                DiscountInfo discountInfo = (DiscountInfo) it.next();
                com.centuryOldShop.server.persistence.DiscountInfoTestHelper.delete(discountInfo);
            }
        }
        DiscountTypeDao dao = DaoFactory.getDaoFactory().getDiscountTypeDao();
        dao.delete(discountTypeObject);
    }

    /**
     * Get DiscountType instance from collection by primary key.
     *
     * @param collection DiscountType instance collection
     * @param pk         primary key
     * @return DiscountType instance
     */
    public static DiscountType getDiscountTypeByPk(Collection collection, DiscountTypePK pk) {
        DiscountType discountTypeObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            DiscountType object = (DiscountType) iterator.next();
            if (object.getDiscountTypePK().equals(pk)) {
                discountTypeObject = object;
                break;
            }
        }
        return discountTypeObject;
    }

    /**
     * Get DiscountType instance from <Code>DiscountType</Code> instance array by primary key.
     *
     * @param discountTypeArray DiscountType instance array
     * @param pk                primary key
     * @return DiscountType instance
     */
    public static DiscountType getDiscountTypeByPk(DiscountType[] discountTypeArray, DiscountTypePK pk) {
        return discountTypeArray == null ? null : getDiscountTypeByPk(Arrays.asList(discountTypeArray), pk);
    }
}