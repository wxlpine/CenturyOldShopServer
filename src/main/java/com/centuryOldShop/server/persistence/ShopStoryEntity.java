package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  ShopStoryEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopStoryEntity
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;

/**
 * @pdOid 5095ee84-fa98-470d-8301-54a7f1706147
 */
public class ShopStoryEntity implements Serializable {
    /**
     * @pdOid 59ec9e40-37d1-4ea3-8aa0-ae635490e5ce
     */
    private long storyId;
    /**
     * @pdOid 9ac06f26-39c4-458f-a180-ce809dfe83d8
     */
    private String storyName;
    /**
     * @pdOid 5dea57ea-d755-4e87-ac17-d4e4fada77ab
     */
    private String storyContentUrl;
    /**
     * @pdOid f8077b25-0412-479c-a4ce-91529cca670c
     */
    private Date addedTime;

    /**
     * @pdRoleInfo migr=no name=Shop assc=shopShopStory mult=1..1 side=A
     */
    private ShopEntity shop;
    /**
     * @pdRoleInfo migr=no name=ShopStoryType assc=shopStoryShopStoryType mult=1..1 side=A
     */
    private ShopStoryTypeEntity shopStoryType;

    //<editor-fold desc="constructor">

    public ShopStoryEntity() {
    }

    //</editor-fold>


    //<editor-fold desc="accessor">

    public long getStoryId() {
        return storyId;
    }

    public ShopStoryEntity setStoryId(long storyId) {
        this.storyId = storyId;
        return this;
    }

    public String getStoryName() {
        return storyName;
    }

    public ShopStoryEntity setStoryName(String storyName) {
        this.storyName = storyName;
        return this;
    }

    public String getStoryContentUrl() {
        return storyContentUrl;
    }

    public ShopStoryEntity setStoryContentUrl(String storyContentUrl) {
        this.storyContentUrl = storyContentUrl;
        return this;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public ShopStoryEntity setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
        return this;
    }

    public ShopEntity getShop() {
        return shop;
    }

    public ShopStoryEntity setShop(ShopEntity shop) {
        this.shop = shop;
        return this;
    }

    public ShopStoryTypeEntity getShopStoryType() {
        return shopStoryType;
    }

    public ShopStoryEntity setShopStoryType(ShopStoryTypeEntity shopStoryType) {
        this.shopStoryType = shopStoryType;
        return this;
    }


    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopStoryEntity shopStory = (ShopStoryEntity) o;

        return storyId == shopStory.storyId;

    }

    @Override
    public int hashCode() {
        return (int) (storyId ^ (storyId >>> 32));
    }

    @Override
    public String toString() {
        return "ShopStoryEntity{" +
                "storyId=" + storyId +
                ", storyName='" + storyName + '\'' +
                ", storyContentUrl='" + storyContentUrl + '\'' +
                ", addedTime=" + addedTime +
                ", shop=" + shop +
                ", shopStoryType=" + shopStoryType +
                '}';
    }

    //</editor-fold>

}