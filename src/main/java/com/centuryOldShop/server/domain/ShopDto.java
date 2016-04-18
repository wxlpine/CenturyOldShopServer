package com.centuryOldShop.server.domain;
/***********************************************************************
 * Module:  ShopEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopEntity
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;

public class ShopDto implements Serializable {

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
    public ShopDto() {
    }
    //</editor-fold>

    //<editor-fold desc="accessor">

    public String getShopName() {
        return shopName;
    }

    public ShopDto setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public ShopDto setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    public Date getOpenABusinessTime() {
        return openABusinessTime;
    }

    public ShopDto setOpenABusinessTime(Date openABusinessTime) {
        this.openABusinessTime = openABusinessTime;
        return this;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public ShopDto setVisitCount(int visitCount) {
        this.visitCount = visitCount;
        return this;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public ShopDto setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
        return this;
    }

    public String getTrademark() {
        return trademark;
    }

    public ShopDto setTrademark(String trademark) {
        this.trademark = trademark;
        return this;
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public ShopDto setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ShopDto setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getFax() {
        return fax;
    }

    public ShopDto setFax(String fax) {
        this.fax = fax;
        return this;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public ShopDto setLongDescription(String longDescription) {
        this.longDescription = longDescription;
        return this;
    }

    public String getShopType() {
        return shopType;
    }

    public ShopDto setShopType(String shopType) {
        this.shopType = shopType;
        return this;
    }

    public String getShopArea() {
        return shopArea;
    }

    public ShopDto setShopArea(String shopArea) {
        this.shopArea = shopArea;
        return this;
    }


    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopDto shopDto = (ShopDto) o;

        if (visitCount != shopDto.visitCount) return false;
        if (shopName != null ? !shopName.equals(shopDto.shopName) : shopDto.shopName != null) return false;
        if (shortDescription != null ? !shortDescription.equals(shopDto.shortDescription) : shopDto.shortDescription != null)
            return false;
        if (openABusinessTime != null ? !openABusinessTime.equals(shopDto.openABusinessTime) : shopDto.openABusinessTime != null)
            return false;
        if (detailedAddress != null ? !detailedAddress.equals(shopDto.detailedAddress) : shopDto.detailedAddress != null)
            return false;
        if (trademark != null ? !trademark.equals(shopDto.trademark) : shopDto.trademark != null) return false;
        if (enterTime != null ? !enterTime.equals(shopDto.enterTime) : shopDto.enterTime != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(shopDto.phoneNumber) : shopDto.phoneNumber != null)
            return false;
        if (fax != null ? !fax.equals(shopDto.fax) : shopDto.fax != null) return false;
        if (longDescription != null ? !longDescription.equals(shopDto.longDescription) : shopDto.longDescription != null)
            return false;
        if (shopType != null ? !shopType.equals(shopDto.shopType) : shopDto.shopType != null) return false;
        return shopArea != null ? shopArea.equals(shopDto.shopArea) : shopDto.shopArea == null;

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
        return "ShopDto{" +
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