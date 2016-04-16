package com.centuryOldShop.server.domain;
/***********************************************************************
 * Module:  ShopEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopEntity
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;

public class ShopTrans implements Serializable {

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
    public ShopTrans() {
    }
    //</editor-fold>

    //<editor-fold desc="accessor">

    public String getShopName() {
        return shopName;
    }

    public ShopTrans setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public ShopTrans setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    public Date getOpenABusinessTime() {
        return openABusinessTime;
    }

    public ShopTrans setOpenABusinessTime(Date openABusinessTime) {
        this.openABusinessTime = openABusinessTime;
        return this;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public ShopTrans setVisitCount(int visitCount) {
        this.visitCount = visitCount;
        return this;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public ShopTrans setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
        return this;
    }

    public String getTrademark() {
        return trademark;
    }

    public ShopTrans setTrademark(String trademark) {
        this.trademark = trademark;
        return this;
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public ShopTrans setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ShopTrans setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getFax() {
        return fax;
    }

    public ShopTrans setFax(String fax) {
        this.fax = fax;
        return this;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public ShopTrans setLongDescription(String longDescription) {
        this.longDescription = longDescription;
        return this;
    }

    public String getShopType() {
        return shopType;
    }

    public ShopTrans setShopType(String shopType) {
        this.shopType = shopType;
        return this;
    }

    public String getShopArea() {
        return shopArea;
    }

    public ShopTrans setShopArea(String shopArea) {
        this.shopArea = shopArea;
        return this;
    }


    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopTrans shopTrans = (ShopTrans) o;

        if (visitCount != shopTrans.visitCount) return false;
        if (shopName != null ? !shopName.equals(shopTrans.shopName) : shopTrans.shopName != null) return false;
        if (shortDescription != null ? !shortDescription.equals(shopTrans.shortDescription) : shopTrans.shortDescription != null)
            return false;
        if (openABusinessTime != null ? !openABusinessTime.equals(shopTrans.openABusinessTime) : shopTrans.openABusinessTime != null)
            return false;
        if (detailedAddress != null ? !detailedAddress.equals(shopTrans.detailedAddress) : shopTrans.detailedAddress != null)
            return false;
        if (trademark != null ? !trademark.equals(shopTrans.trademark) : shopTrans.trademark != null) return false;
        if (enterTime != null ? !enterTime.equals(shopTrans.enterTime) : shopTrans.enterTime != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(shopTrans.phoneNumber) : shopTrans.phoneNumber != null)
            return false;
        if (fax != null ? !fax.equals(shopTrans.fax) : shopTrans.fax != null) return false;
        if (longDescription != null ? !longDescription.equals(shopTrans.longDescription) : shopTrans.longDescription != null)
            return false;
        if (shopType != null ? !shopType.equals(shopTrans.shopType) : shopTrans.shopType != null) return false;
        return shopArea != null ? shopArea.equals(shopTrans.shopArea) : shopTrans.shopArea == null;

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
        return "ShopTrans{" +
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