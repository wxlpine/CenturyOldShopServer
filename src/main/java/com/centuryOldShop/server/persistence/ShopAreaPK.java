/***********************************************************************
 * Module:  ShopAreaPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class ShopArea
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.Objects;

/**
 * Generated primary key class for ShopArea. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class ShopAreaPK implements java.io.Serializable {
    /**
     * @pdOid e1b625ba-97a1-4473-a7e6-d692abfa826d
     */
    private long shopAreaId;

    //<editor-fold name="constructor">

    /**
     * Empty constructor
     */
    public ShopAreaPK() {

    }

    /**
     * Constructor with parameters
     *
     * @param shopAreaId parameter to set value of field shopAreaId
     */
    public ShopAreaPK(long shopAreaId) {
        this.shopAreaId = shopAreaId;
    }

    //</editor-fold>

    //<editor-fold name="accessor">

    /**
     * Get value of shopAreaId
     *
     * @return shopAreaId
     */
    public long getShopAreaId() {
        return shopAreaId;
    }

    /**
     * Set value of shopAreaId
     *
     * @param newShopAreaId
     */
    public void setShopAreaId(long newShopAreaId) {
        this.shopAreaId = newShopAreaId;
    }


    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopAreaPK that = (ShopAreaPK) o;
        return shopAreaId == that.shopAreaId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopAreaId);
    }

    @Override
    public String toString() {
        return "ShopAreaPK{" +
                "shopAreaId=" + shopAreaId +
                '}';
    }

    //</editor-fold>

}