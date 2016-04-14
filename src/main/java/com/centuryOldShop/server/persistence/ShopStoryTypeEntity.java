package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  ShopStoryTypeEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopStoryTypeEntity
 ***********************************************************************/

import java.io.Serializable;
import java.util.List;

/**
 * @pdOid bfa242ee-a3ea-4742-a0f2-e54cc95c059c
 */
public class ShopStoryTypeEntity implements Serializable {
    /**
     * @pdOid fffbae71-21e1-4cd3-ba81-1b63e7270826
     */
    private String storyTypeName;

    /**
     * @pdRoleInfo migr=no name=ShopStory assc=shopStoryShopStoryType coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<ShopStoryEntity> shopStory;


    //<editor-fold desc="constructor">

    public ShopStoryTypeEntity() {
    }

    //</editor-fold>


    //<editor-fold desc="accessor">

    public String getStoryTypeName() {
        return storyTypeName;
    }

    public ShopStoryTypeEntity setStoryTypeName(String storyTypeName) {
        this.storyTypeName = storyTypeName;
        return this;
    }

    public List<ShopStoryEntity> getShopStory() {
        return shopStory;
    }

    public ShopStoryTypeEntity setShopStory(List<ShopStoryEntity> shopStory) {
        this.shopStory = shopStory;
        return this;
    }

    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopStoryTypeEntity that = (ShopStoryTypeEntity) o;

        return storyTypeName != null ? storyTypeName.equals(that.storyTypeName) : that.storyTypeName == null;

    }

    @Override
    public int hashCode() {
        return storyTypeName != null ? storyTypeName.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ShopStoryTypeEntity{" +
                "storyTypeName='" + storyTypeName + '\'' +
                '}';
    }

    //</editor-fold>

}