package com.centuryOldShop.server.domain;
/***********************************************************************
 * Module:  ShopEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopEntity
 ***********************************************************************/

import com.centuryOldShop.server.persistence.ShopAreaEntity;
import com.centuryOldShop.server.persistence.ShopTypeEntity;

import java.io.Serializable;
import java.util.Date;

public class Shop implements Serializable {

    private long shopId;
    private String shopName;
    private String shortDescription;
    private Date openABusinessTime;
    private int visitCount;
    private String detailedAddress;
    private String trademark;
    private Date enterTime;
    private String phoneNumber;
    private String fax;
    private String longDescription;
    private ShopTypeEntity shopType;
    private ShopAreaEntity shopArea;

    //<editor-fold desc="constructor">
    public Shop() {
    }
    //</editor-fold>


    //<editor-fold desc="accessor">

    public long getShopId() {
        return shopId;
    }

    public Shop setShopId(long shopId) {
        this.shopId = shopId;
        return this;
    }

    public String getShopName() {
        return shopName;
    }

    public Shop setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public Shop setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    public Date getOpenABusinessTime() {
        return openABusinessTime;
    }

    public Shop setOpenABusinessTime(Date openABusinessTime) {
        this.openABusinessTime = openABusinessTime;
        return this;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public Shop setVisitCount(int visitCount) {
        this.visitCount = visitCount;
        return this;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public Shop setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
        return this;
    }

    public String getTrademark() {
        return trademark;
    }

    public Shop setTrademark(String trademark) {
        this.trademark = trademark;
        return this;
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public Shop setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Shop setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getFax() {
        return fax;
    }

    public Shop setFax(String fax) {
        this.fax = fax;
        return this;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public Shop setLongDescription(String longDescription) {
        this.longDescription = longDescription;
        return this;
    }

    public ShopTypeEntity getShopType() {
        return shopType;
    }

    public Shop setShopType(ShopTypeEntity shopType) {
        this.shopType = shopType;
        return this;
    }

    public ShopAreaEntity getShopArea() {
        return shopArea;
    }

    public Shop setShopArea(ShopAreaEntity shopArea) {
        this.shopArea = shopArea;
        return this;
    }


    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shop shop = (Shop) o;

        return shopId == shop.shopId;

    }

    @Override
    public int hashCode() {
        return (int) (shopId ^ (shopId >>> 32));
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", openABusinessTime=" + openABusinessTime +
                ", visitCount=" + visitCount +
                ", detailedAddress='" + detailedAddress + '\'' +
                ", trademark='" + trademark + '\'' +
                ", enterTime=" + enterTime +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", fax='" + fax + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", shopType=" + shopType +
                ", shopArea=" + shopArea +
                '}';
    }
//</editor-fold>
}