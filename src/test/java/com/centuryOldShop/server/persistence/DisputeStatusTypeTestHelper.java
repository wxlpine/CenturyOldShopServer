/***********************************************************************
 * Module:  DisputeStatusTypeTestHelper.java
 * Author:  cmicat
 * Purpose: Defines the test helper class for class DisputeStatusType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import com.centuryOldShop.server.persistence.dao.DisputeStatusTypeDao;
import factory.DaoFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Test helper class for DisputeStatusType. It provides some utility methods, such as methods to
 * create new instance, modify instance and save object ect.
 */
public class DisputeStatusTypeTestHelper {

    public static java.util.Random random = com.sybase.orm.util.Util.getRandom();

    private Log log = LogFactory.getLog(DisputeStatusTypeTestHelper.class);

    /**
     * Empty Constructor
     */
    public DisputeStatusTypeTestHelper() {

    }

    /**
     * Create new DisputeStatusType instance.
     *
     * @param precedingObject        object that is created before this object on the traversal path
     * @param associationId          object id of association that navigates to this class
     * @param layer                  creation iteraction layer
     * @param associationInitialized if association should be initantiated
     * @return a new instance of persistent class
     */
    public static DisputeStatusType newInstance(DisputeStatusType persistentObject, Object precedingObject, String associationId, int layer, boolean associationInitialized) {
        if (persistentObject == null)
            persistentObject = new DisputeStatusType();

        persistentObject.setDisputeStatusType(String.valueOf(random.nextInt((int) Math.round(Math.pow(10, 8)))));
        if (precedingObject != null && associationId.equals("A664EEEB-8B32-4E0D-83F2-50E4B99E51B2")) {
            persistentObject.addOrderForm((OrderForm) precedingObject);
        }
        return persistentObject;
    }

    /**
     * Modify persistent object.
     *
     * @param disputeStatusTypeObject saved persistent object
     */

    public static void modifyObject(DisputeStatusType persistentObject) {
    }

    /**
     * Save DisputeStatusType object. Foreign key constraints are taked cared here.
     *
     * @param disputeStatusTypeObject persistent object to be saved
     * @throws Exception
     */
    public static void save(DisputeStatusType disputeStatusTypeObject) {
        DisputeStatusTypeDao dao = DaoFactory.getDaoFactory().getDisputeStatusTypeDao();
        dao.saveOrUpdate(disputeStatusTypeObject);
    }

    /**
     * Delete DisputeStatusType object. Remove associated objects due to some constraints
     * in Hibernate if needed.
     *
     * @param disputeStatusTypeObject persistent object to be deleted
     * @throws Exception
     */
    public static void delete(DisputeStatusType disputeStatusTypeObject) {
        java.util.List orderForms = disputeStatusTypeObject.getOrderForm();
        if (orderForms != null) {
            Iterator it = orderForms.iterator();
            while (it.hasNext()) {
                OrderForm orderForm = (OrderForm) it.next();
                com.centuryOldShop.server.persistence.OrderFormTestHelper.delete(orderForm);
            }
        }
        DisputeStatusTypeDao dao = DaoFactory.getDaoFactory().getDisputeStatusTypeDao();
        dao.delete(disputeStatusTypeObject);
    }

    /**
     * Get DisputeStatusType instance from collection by primary key.
     *
     * @param collection DisputeStatusType instance collection
     * @param pk         primary key
     * @return DisputeStatusType instance
     */
    public static DisputeStatusType getDisputeStatusTypeByPk(Collection collection, DisputeStatusTypePK pk) {
        DisputeStatusType disputeStatusTypeObject = null;
        if (collection == null) return null;

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            DisputeStatusType object = (DisputeStatusType) iterator.next();
            if (object.getDisputeStatusTypePK().equals(pk)) {
                disputeStatusTypeObject = object;
                break;
            }
        }
        return disputeStatusTypeObject;
    }

    /**
     * Get DisputeStatusType instance from <Code>DisputeStatusType</Code> instance array by primary key.
     *
     * @param disputeStatusTypeArray DisputeStatusType instance array
     * @param pk                     primary key
     * @return DisputeStatusType instance
     */
    public static DisputeStatusType getDisputeStatusTypeByPk(DisputeStatusType[] disputeStatusTypeArray, DisputeStatusTypePK pk) {
        return disputeStatusTypeArray == null ? null : getDisputeStatusTypeByPk(Arrays.asList(disputeStatusTypeArray), pk);
    }
}