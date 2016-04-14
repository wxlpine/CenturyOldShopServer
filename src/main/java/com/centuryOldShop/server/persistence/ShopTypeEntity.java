package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  ShopTypeEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopTypeEntity
 ***********************************************************************/

import java.io.Serializable;
import java.util.List;

/**
 * @pdOid a40387d8-5e53-4eb0-b53d-4197f5b3c0af
 */
public class ShopTypeEntity implements Serializable {
    /**
     * @pdOid 5bf7966a-7b9c-427c-b9c2-845ab29313ff
     */
    private String shopTypeName;

    /**
     * @pdRoleInfo migr=no name=Shop assc=shopShopType coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<ShopEntity> shop;

    //<editor-fold desc="constructor">

    public ShopTypeEntity() {
    }

    //</editor-fold>

    //<editor-fold desc="accessor">

    public String getShopTypeName() {
        return shopTypeName;
    }

    public ShopTypeEntity setShopTypeName(String shopTypeName) {
        this.shopTypeName = shopTypeName;
        return this;
    }

    public List<ShopEntity> getShop() {
        return shop;
    }

    public ShopTypeEntity setShop(List<ShopEntity> shop) {
        this.shop = shop;
        return this;
    }

    //</editor-fold>

    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopTypeEntity shopType = (ShopTypeEntity) o;

        return shopTypeName != null ? shopTypeName.equals(shopType.shopTypeName) : shopType.shopTypeName == null;

    }

    @Override
    public int hashCode() {
        return shopTypeName != null ? shopTypeName.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ShopTypeEntity{" +
                "shopTypeName='" + shopTypeName + '\'' +
                '}';
    }

    //</editor-fold>

}