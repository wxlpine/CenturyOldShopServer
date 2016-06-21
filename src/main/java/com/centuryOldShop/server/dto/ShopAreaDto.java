package com.centuryOldShop.server.dto;

import java.io.Serializable;

/**
 * Created by cmicat on 2016/6/21.
 */
public final class ShopAreaDto implements Serializable {
    private long shopAreaId;

    private String shopAreaName;

    public long getShopAreaId() {
        return shopAreaId;
    }

    public ShopAreaDto setShopAreaId(long shopAreaId) {
        this.shopAreaId = shopAreaId;
        return this;
    }

    public String getShopAreaName() {
        return shopAreaName;
    }

    public ShopAreaDto setShopAreaName(String shopAreaName) {
        this.shopAreaName = shopAreaName;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopAreaDto that = (ShopAreaDto) o;

        if (shopAreaId != that.shopAreaId) return false;
        return shopAreaName != null ? shopAreaName.equals(that.shopAreaName) : that.shopAreaName == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (shopAreaId ^ (shopAreaId >>> 32));
        result = 31 * result + (shopAreaName != null ? shopAreaName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ShopAreaDto{" +
                "shopAreaId=" + shopAreaId +
                ", shopAreaName='" + shopAreaName + '\'' +
                '}';
    }
}
