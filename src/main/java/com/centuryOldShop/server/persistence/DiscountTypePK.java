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

    public DiscountTypePK(long discountTypeId) {
        this.discountTypeId = discountTypeId;
    }


    //<editor-fold name="accessor">

    public long getDiscountTypeId() {
        return discountTypeId;
    }

    public void setDiscountTypeId(long newDiscountTypeId) {
        this.discountTypeId = newDiscountTypeId;
    }

    //</editor-fold>

    //<editor-fold name="common methods">


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DiscountTypePK that = (DiscountTypePK) o;

        return discountTypeId == that.discountTypeId;

    }

    @Override
    public int hashCode() {
        return (int) (discountTypeId ^ (discountTypeId >>> 32));
    }

    @Override
    public String toString() {
        return "DiscountTypePK{" +
                "discountTypeId=" + discountTypeId +
                '}';
    }

    //</editor-fold>
}