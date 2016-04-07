package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  ShopType.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopType
 ***********************************************************************/

import java.io.Serializable;
import java.util.List;

/**
 * @pdOid a40387d8-5e53-4eb0-b53d-4197f5b3c0af
 */
public class ShopType implements Serializable {
    /**
     * @pdOid 5bf7966a-7b9c-427c-b9c2-845ab29313ff
     */
    private String shopTypeName;

    /**
     * @pdRoleInfo migr=no name=Shop assc=shopShopType coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<Shop> shop;

    //<editor-fold desc="constructor">

    public ShopType() {
    }

    //</editor-fold>

    //<editor-fold desc="accessor">

    public String getShopTypeName() {
        return shopTypeName;
    }

    public ShopType setShopTypeName(String shopTypeName) {
        this.shopTypeName = shopTypeName;
        return this;
    }

    public List<Shop> getShop() {
        return shop;
    }

    public ShopType setShop(List<Shop> shop) {
        this.shop = shop;
        return this;
    }

    //</editor-fold>

    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopType shopType = (ShopType) o;

        return shopTypeName != null ? shopTypeName.equals(shopType.shopTypeName) : shopType.shopTypeName == null;

    }

    @Override
    public int hashCode() {
        return shopTypeName != null ? shopTypeName.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ShopType{" +
                "shopTypeName='" + shopTypeName + '\'' +
                '}';
    }

    //</editor-fold>

}