package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  ShopStory.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopStory
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;

/**
 * @pdOid 5095ee84-fa98-470d-8301-54a7f1706147
 */
public class ShopStory implements Serializable {
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
    private Shop shop;
    /**
     * @pdRoleInfo migr=no name=ShopStoryType assc=shopStoryShopStoryType mult=1..1 side=A
     */
    private ShopStoryType shopStoryType;

    //<editor-fold desc="constructor">

    public ShopStory() {
    }

    //</editor-fold>


    //<editor-fold desc="accessor">

    public long getStoryId() {
        return storyId;
    }

    public ShopStory setStoryId(long storyId) {
        this.storyId = storyId;
        return this;
    }

    public String getStoryName() {
        return storyName;
    }

    public ShopStory setStoryName(String storyName) {
        this.storyName = storyName;
        return this;
    }

    public String getStoryContentUrl() {
        return storyContentUrl;
    }

    public ShopStory setStoryContentUrl(String storyContentUrl) {
        this.storyContentUrl = storyContentUrl;
        return this;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public ShopStory setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
        return this;
    }

    public Shop getShop() {
        return shop;
    }

    public ShopStory setShop(Shop shop) {
        this.shop = shop;
        return this;
    }

    public ShopStoryType getShopStoryType() {
        return shopStoryType;
    }

    public ShopStory setShopStoryType(ShopStoryType shopStoryType) {
        this.shopStoryType = shopStoryType;
        return this;
    }


    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopStory shopStory = (ShopStory) o;

        return storyId == shopStory.storyId;

    }

    @Override
    public int hashCode() {
        return (int) (storyId ^ (storyId >>> 32));
    }

    @Override
    public String toString() {
        return "ShopStory{" +
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