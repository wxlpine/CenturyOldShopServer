/***********************************************************************
 * Module:  DiscountTypePK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class DiscountType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * Generated primary key class for DiscountType. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class DiscountTypePK implements java.io.Serializable {
    /**
     * @pdOid 166e175c-fe65-45eb-9e79-e3b98b98da6b
     */
    private long discountTypeId;

    /**
     * Empty constructor
     */
    public DiscountTypePK() {
    }

    /**
     * Constructor with parameters
     *
     * @param discountTypeId parameter to set value of field discountTypeId
     */
    public DiscountTypePK(long discountTypeId) {
        this.discountTypeId = discountTypeId;
    }

    /**
     * Get value of discountTypeId
     *
     * @return discountTypeId
     */
    public long getDiscountTypeId() {
        return discountTypeId;
    }

    /**
     * Set value of discountTypeId
     *
     * @param newDiscountTypeId
     */
    public void setDiscountTypeId(long newDiscountTypeId) {
        this.discountTypeId = newDiscountTypeId;
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

        DiscountTypePK cast = (DiscountTypePK) other;

        if (this.discountTypeId != cast.getDiscountTypeId())
            return false;

        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int _hashCode = 0;
        _hashCode = 29 * _hashCode + (new Long(discountTypeId)).hashCode();
        return _hashCode;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.DiscountTypePK: ");
        ret.append("discountTypeId='" + discountTypeId + "'");
        return ret.toString();
    }
}