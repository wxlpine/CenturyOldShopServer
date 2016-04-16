/***********************************************************************
 * Module:  OrderStatusTypePK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class OrderStatusType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * Generated primary key class for OrderStatusType. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class OrderStatusTypePK implements java.io.Serializable {
    /**
     * @pdOid 5a6ad6b3-e960-4853-aad8-c86ca1d73dc2
     */
    private java.lang.String orderStatusType;

    /**
     * Empty constructor
     */
    public OrderStatusTypePK() {
    }

    /**
     * Constructor with parameters
     *
     * @param orderStatusType parameter to set value of field orderStatusType
     */
    public OrderStatusTypePK(java.lang.String orderStatusType) {
        this.orderStatusType = orderStatusType;
    }

    /**
     * Get value of orderStatusType
     *
     * @return orderStatusType
     */
    public java.lang.String getOrderStatusType() {
        return orderStatusType;
    }

    /**
     * Set value of orderStatusType
     *
     * @param newOrderStatusType
     */
    public void setOrderStatusType(java.lang.String newOrderStatusType) {
        this.orderStatusType = newOrderStatusType;
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

        OrderStatusTypePK cast = (OrderStatusTypePK) other;

        if (this.orderStatusType == null ? cast.getOrderStatusType() != this.orderStatusType : !this.orderStatusType.equals(cast.getOrderStatusType()))
            return false;

        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int _hashCode = 0;
        if (this.orderStatusType != null)
            _hashCode = 29 * _hashCode + orderStatusType.hashCode();
        return _hashCode;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.OrderStatusTypePK: ");
        ret.append("orderStatusType='" + orderStatusType + "'");
        return ret.toString();
    }
}