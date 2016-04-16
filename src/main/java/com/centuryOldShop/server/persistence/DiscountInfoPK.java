/***********************************************************************
 * Module:  DiscountInfoPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class DiscountInfo
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * Generated primary key class for DiscountInfo. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class DiscountInfoPK implements java.io.Serializable {
    /**
     * @pdOid e755ddf8-0c39-42c8-b177-eaeecae45b58
     */
    private long discountInfoId;

    /**
     * Empty constructor
     */
    public DiscountInfoPK() {
    }

    /**
     * Constructor with parameters
     *
     * @param discountInfoId parameter to set value of field discountInfoId
     */
    public DiscountInfoPK(long discountInfoId) {
        this.discountInfoId = discountInfoId;
    }

    /**
     * Get value of discountInfoId
     *
     * @return discountInfoId
     */
    public long getDiscountInfoId() {
        return discountInfoId;
    }

    /**
     * Set value of discountInfoId
     *
     * @param newDiscountInfoId
     */
    public void setDiscountInfoId(long newDiscountInfoId) {
        this.discountInfoId = newDiscountInfoId;
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

        DiscountInfoPK cast = (DiscountInfoPK) other;

        if (this.discountInfoId != cast.getDiscountInfoId())
            return false;

        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int _hashCode = 0;
        _hashCode = 29 * _hashCode + (new Long(discountInfoId)).hashCode();
        return _hashCode;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.DiscountInfoPK: ");
        ret.append("discountInfoId='" + discountInfoId + "'");
        return ret.toString();
    }
}