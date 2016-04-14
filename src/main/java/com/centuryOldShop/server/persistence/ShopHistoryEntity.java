package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  ShopHistoryEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopHistoryEntity
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;

/**
 * @pdOid b2259b3b-c98e-4318-8de0-bdca11d8c607
 */
public class ShopHistoryEntity implements Serializable {
    /**
     * @pdOid 66cc8df8-53ab-4b83-85f0-aeed394f39b2
     */
    private long shopHistoryId;
    /**
     * @pdOid 45baea69-f7b9-4958-a9f2-d088ef45bb8c
     */
    private String title;
    /**
     * @pdOid b62fe8ec-dc45-4627-bd93-221d2d33fe8d
     */
    private String smallPhotoUrl;
    /**
     * @pdOid 920552e5-4a62-4df9-9111-f826b4083e99
     */
    private String shortDescription;
    /**
     * @pdOid c41816ba-fa6e-4683-8425-939db205b739
     */
    private Date publishTime;
    /**
     * @pdOid 2261d9cf-d383-4735-9888-c7c607fdebd6
     */
    private int visitCount;
    /**
     * @pdOid 76e17c8a-0e1c-4017-ba58-a52f9a865a3f
     */
    private String detailedIntroductionPageUrl;

    /**
     * @pdRoleInfo migr=no name=Shop assc=shopShopHistory mult=1..1 side=A
     */
    private ShopEntity shop;


    //<editor-fold desc="constructor">

    public ShopHistoryEntity() {
    }

    //</editor-fold>


    //<editor-fold desc="accessor">

    public long getShopHistoryId() {
        return shopHistoryId;
    }

    public ShopHistoryEntity setShopHistoryId(long shopHistoryId) {
        this.shopHistoryId = shopHistoryId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ShopHistoryEntity setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getSmallPhotoUrl() {
        return smallPhotoUrl;
    }

    public ShopHistoryEntity setSmallPhotoUrl(String smallPhotoUrl) {
        this.smallPhotoUrl = smallPhotoUrl;
        return this;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public ShopHistoryEntity setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public ShopHistoryEntity setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public ShopHistoryEntity setVisitCount(int visitCount) {
        this.visitCount = visitCount;
        return this;
    }

    public String getDetailedIntroductionPageUrl() {
        return detailedIntroductionPageUrl;
    }

    public ShopHistoryEntity setDetailedIntroductionPageUrl(String detailedIntroductionPageUrl) {
        this.detailedIntroductionPageUrl = detailedIntroductionPageUrl;
        return this;
    }

    public ShopEntity getShop() {
        return shop;
    }

    public ShopHistoryEntity setShop(ShopEntity shop) {
        this.shop = shop;
        return this;
    }

    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopHistoryEntity that = (ShopHistoryEntity) o;

        return shopHistoryId == that.shopHistoryId;

    }

    @Override
    public int hashCode() {
        return (int) (shopHistoryId ^ (shopHistoryId >>> 32));
    }

    @Override
    public String toString() {
        return "ShopHistoryEntity{" +
                "shopHistoryId=" + shopHistoryId +
                ", title='" + title + '\'' +
                ", smallPhotoUrl='" + smallPhotoUrl + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", publishTime=" + publishTime +
                ", visitCount=" + visitCount +
                ", detailedIntroductionPageUrl='" + detailedIntroductionPageUrl + '\'' +
                ", shop=" + shop +
                '}';
    }

    //</editor-fold>
}