package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  ShopAreaEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopAreaEntity
 ***********************************************************************/

import java.io.Serializable;
import java.util.List;

/**
 * @pdOid bcc6769a-149d-421c-8d75-c1edf781f305
 */
public class ShopAreaEntity implements Serializable {
    /**
     * @pdOid 372b6d82-6795-43ff-8d4e-582418602ce8
     */
    private long shopAreaId;
    /**
     * @pdOid 2a2d5bce-c663-4508-a502-277ae60f5d28
     */
    private String shopAreaName;

    /**
     * @pdRoleInfo migr=no name=Shop assc=shopShopArea coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<ShopEntity> shop;

    //<editor-fold desc="constructor">

    public ShopAreaEntity() {
    }

    //</editor-fold>


    //<editor-fold desc="accessor">

    public long getShopAreaId() {
        return shopAreaId;
    }

    public ShopAreaEntity setShopAreaId(long shopAreaId) {
        this.shopAreaId = shopAreaId;
        return this;
    }

    public String getShopAreaName() {
        return shopAreaName;
    }

    public ShopAreaEntity setShopAreaName(String shopAreaName) {
        this.shopAreaName = shopAreaName;
        return this;
    }

    public List<ShopEntity> getShop() {
        return shop;
    }

    public ShopAreaEntity setShop(List<ShopEntity> shop) {
        this.shop = shop;
        return this;
    }

    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopAreaEntity shopArea = (ShopAreaEntity) o;

        return shopAreaId == shopArea.shopAreaId;

    }

    @Override
    public int hashCode() {
        return (int) (shopAreaId ^ (shopAreaId >>> 32));
    }

    @Override
    public String toString() {
        return "ShopAreaEntity{" +
                "shopAreaId=" + shopAreaId +
                ", shopAreaName='" + shopAreaName + '\'' +
                '}';
    }

    //</editor-fold>
}