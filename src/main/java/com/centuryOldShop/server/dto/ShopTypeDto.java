package com.centuryOldShop.server.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by cmicat on 2016/6/19.
 */
public final class ShopTypeDto implements Serializable {
    private String shopTypeName;

    //<editor-fold name="accessor">

    public String getShopTypeName() {
        return shopTypeName;
    }

    public ShopTypeDto setShopTypeName(String shopTypeName) {
        this.shopTypeName = shopTypeName;
        return this;
    }

    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopTypeDto that = (ShopTypeDto) o;
        return Objects.equals(shopTypeName, that.shopTypeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopTypeName);
    }

    @Override
    public String toString() {
        return "ShopTypeDto{" +
                "shopTypeName='" + shopTypeName + '\'' +
                '}';
    }

    //</editor-fold>

}
