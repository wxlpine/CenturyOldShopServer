/***********************************************************************
 * Module:  CommodityPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class Commodity
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * Generated primary key class for Commodity. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class CommodityPK implements java.io.Serializable {
    /**
     * @pdOid 4270790d-bb28-42b8-9085-303cff9b5447
     */
    private long commodityId;

    //<editor-fold name="constructor">

    /**
     * Empty constructor
     */
    public CommodityPK() {
    }

    /**
     * Constructor with parameters
     *
     * @param commodityId parameter to set value of field commodityId
     */
    public CommodityPK(long commodityId) {
        this.commodityId = commodityId;
    }

    //</editor-fold>

    //<editor-fold name="accessor">

    /**
     * Get value of commodityId
     *
     * @return commodityId
     */
    public long getCommodityId() {
        return commodityId;
    }

    /**
     * Set value of commodityId
     *
     */
    public void setCommodityId(long newCommodityId) {
        this.commodityId = newCommodityId;
    }

    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommodityPK that = (CommodityPK) o;

        return commodityId == that.commodityId;

    }

    @Override
    public int hashCode() {
        return (int) (commodityId ^ (commodityId >>> 32));
    }

    @Override
    public String toString() {
        return "CommodityPK{" +
                "commodityId=" + commodityId +
                '}';
    }

    //</editor-fold>
}