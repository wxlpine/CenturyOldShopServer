/***********************************************************************
 * Module:  OrderFormPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class OrderForm
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * Generated primary key class for OrderForm. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class OrderFormPK implements java.io.Serializable {
    /**
     * @pdOid a2d57ee1-17f0-4bcb-9abc-bafe6623b523
     */
    private long orderFormId;

    /**
     * Empty constructor
     */
    public OrderFormPK() {
    }

    /**
     * Constructor with parameters
     *
     * @param orderFormId parameter to set value of field orderFormId
     */
    public OrderFormPK(long orderFormId) {
        this.orderFormId = orderFormId;
    }

    /**
     * Get value of orderFormId
     *
     * @return orderFormId
     */
    public long getOrderFormId() {
        return orderFormId;
    }

    /**
     * Set value of orderFormId
     *
     * @param newOrderFormId
     */
    public void setOrderFormId(long newOrderFormId) {
        this.orderFormId = newOrderFormId;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {

        if (other == null) {
            return false;
        }

        if (other == this) {
            return true;
        }

        if (!(other.getClass() == getClass()))
            return false;

        OrderFormPK cast = (OrderFormPK) other;

        if (this.orderFormId != cast.getOrderFormId())
            return false;

        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int _hashCode = 0;
        _hashCode = 29 * _hashCode + (new Long(orderFormId)).hashCode();
        return _hashCode;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.OrderFormPK: ");
        ret.append("orderFormId='" + orderFormId + "'");
        return ret.toString();
    }
}