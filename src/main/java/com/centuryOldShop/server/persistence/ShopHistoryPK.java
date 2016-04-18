/***********************************************************************
 * Module:  ShopHistoryPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class ShopHistory
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.Objects;

/**
 * Generated primary key class for ShopHistory. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class ShopHistoryPK implements java.io.Serializable {
    /**
     * @pdOid c054dd98-6629-4f2d-a8a6-94ecfca57ec9
     */
    private long shopHistoryId;

    //<editor-fold name="constructor">

    /**
     * Empty constructor
     */
    public ShopHistoryPK() {

    }

    /**
     * Constructor with parameters
     *
     * @param shopHistoryId parameter to set value of field shopHistoryId
     */
    public ShopHistoryPK(long shopHistoryId) {
        this.shopHistoryId = shopHistoryId;
    }

    //</editor-fold>


    //<editor-fold name="accessor">

    /**
     * Get value of shopHistoryId
     *
     * @return shopHistoryId
     */
    public long getShopHistoryId() {
        return shopHistoryId;
    }

    /**
     * Set value of shopHistoryId
     *
     * @param newShopHistoryId
     */
    public void setShopHistoryId(long newShopHistoryId) {
        this.shopHistoryId = newShopHistoryId;
    }


    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopHistoryPK that = (ShopHistoryPK) o;
        return shopHistoryId == that.shopHistoryId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopHistoryId);
    }

    @Override
    public String toString() {
        return "ShopHistoryPK{" +
                "shopHistoryId=" + shopHistoryId +
                '}';
    }

    //</editor-fold>
}