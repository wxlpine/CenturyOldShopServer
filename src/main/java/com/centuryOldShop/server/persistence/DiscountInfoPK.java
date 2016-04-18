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

    public DiscountInfoPK() {
    }

    //<editor-fold name="accessor">

    public DiscountInfoPK(long discountInfoId) {
        this.discountInfoId = discountInfoId;
    }

    public long getDiscountInfoId() {
        return discountInfoId;
    }

    public void setDiscountInfoId(long newDiscountInfoId) {
        this.discountInfoId = newDiscountInfoId;
    }

    //</editor-fold>

    //<editor-fold name="common methods">


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DiscountInfoPK that = (DiscountInfoPK) o;

        return discountInfoId == that.discountInfoId;

    }

    @Override
    public int hashCode() {
        return (int) (discountInfoId ^ (discountInfoId >>> 32));
    }

    @Override
    public String toString() {
        return "DiscountInfoPK{" +
                "discountInfoId=" + discountInfoId +
                '}';
    }

    //</editor-fold>
}