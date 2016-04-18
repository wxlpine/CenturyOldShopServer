/***********************************************************************
 * Module:  ShopPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class Shop
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.Objects;

/**
 * Generated primary key class for Shop. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class ShopPK implements java.io.Serializable {
    /**
     * @pdOid d7d4744a-2b76-4a9c-88e9-2600741a34d4
     */
    private long shopId;

    //<editor-fold name="constructor">

    /**
     * Empty constructor
     */
    public ShopPK() {

    }

    /**
     * Constructor with parameters
     *
     * @param shopId parameter to set value of field shopId
     */
    public ShopPK(long shopId) {
        this.shopId = shopId;
    }

    //</editor-fold>


    //<editor-fold name="accessor">

    /**
     * Get value of shopId
     *
     * @return shopId
     */
    public long getShopId() {
        return shopId;
    }

    /**
     * Set value of shopId
     *
     * @param newShopId
     */
    public void setShopId(long newShopId) {
        this.shopId = newShopId;
    }


    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopPK shopPK = (ShopPK) o;
        return shopId == shopPK.shopId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopId);
    }

    @Override
    public String toString() {
        return "ShopPK{" +
                "shopId=" + shopId +
                '}';
    }

    //</editor-fold>
}