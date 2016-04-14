package com.centuryOldShop.server.domain;
/***********************************************************************
 * Module:  ShopEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopEntity
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;

public class Shop implements Serializable {

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

    private String shopType;
    private String shopArea;

    //<editor-fold desc="constructor">
    public Shop() {
    }
    //</editor-fold>

    //<editor-fold desc="accessor">

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

    public String getShopType() {
        return shopType;
    }

    public Shop setShopType(String shopType) {
        this.shopType = shopType;
        return this;
    }

    public String getShopArea() {
        return shopArea;
    }

    public Shop setShopArea(String shopArea) {
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

        if (visitCount != shop.visitCount) return false;
        if (shopName != null ? !shopName.equals(shop.shopName) : shop.shopName != null) return false;
        if (shortDescription != null ? !shortDescription.equals(shop.shortDescription) : shop.shortDescription != null)
            return false;
        if (openABusinessTime != null ? !openABusinessTime.equals(shop.openABusinessTime) : shop.openABusinessTime != null)
            return false;
        if (detailedAddress != null ? !detailedAddress.equals(shop.detailedAddress) : shop.detailedAddress != null)
            return false;
        if (trademark != null ? !trademark.equals(shop.trademark) : shop.trademark != null) return false;
        if (enterTime != null ? !enterTime.equals(shop.enterTime) : shop.enterTime != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(shop.phoneNumber) : shop.phoneNumber != null) return false;
        if (fax != null ? !fax.equals(shop.fax) : shop.fax != null) return false;
        if (longDescription != null ? !longDescription.equals(shop.longDescription) : shop.longDescription != null)
            return false;
        if (shopType != null ? !shopType.equals(shop.shopType) : shop.shopType != null) return false;
        return shopArea != null ? shopArea.equals(shop.shopArea) : shop.shopArea == null;

    }

    @Override
    public int hashCode() {
        int result = shopName != null ? shopName.hashCode() : 0;
        result = 31 * result + (shortDescription != null ? shortDescription.hashCode() : 0);
        result = 31 * result + (openABusinessTime != null ? openABusinessTime.hashCode() : 0);
        result = 31 * result + visitCount;
        result = 31 * result + (detailedAddress != null ? detailedAddress.hashCode() : 0);
        result = 31 * result + (trademark != null ? trademark.hashCode() : 0);
        result = 31 * result + (enterTime != null ? enterTime.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (longDescription != null ? longDescription.hashCode() : 0);
        result = 31 * result + (shopType != null ? shopType.hashCode() : 0);
        result = 31 * result + (shopArea != null ? shopArea.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", openABusinessTime=" + openABusinessTime +
                ", visitCount=" + visitCount +
                ", detailedAddress='" + detailedAddress + '\'' +
                ", trademark='" + trademark + '\'' +
                ", enterTime=" + enterTime +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", fax='" + fax + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", shopType='" + shopType + '\'' +
                ", shopArea='" + shopArea + '\'' +
                '}';
    }

    //</editor-fold>
}