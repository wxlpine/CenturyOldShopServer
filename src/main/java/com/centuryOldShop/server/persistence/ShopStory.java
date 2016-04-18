/***********************************************************************
 * Module:  ShopStory.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopStory
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * @pdOid b159eeea-11d5-4249-a639-24a1326a9ecb
 */
public class ShopStory implements java.io.Serializable {
    /**
     * @pdOid c893b6c5-a38f-4fe8-a595-82e7018b3623
     */
    private long storyId;
    /**
     * @pdOid a58afed5-57f0-4390-899a-80b6a7c77b88
     */
    private String storyName;
    /**
     * @pdOid 2bccc221-e36c-45c5-967a-bc4dcffc42ec
     */
    private String storyContentUrl;
    /**
     * @pdOid 9edf5a68-10da-449e-af94-001435b6a958
     */
    private java.util.Date addedTime;

    /**
     * @pdRoleInfo migr=no name=Shop assc=shopShopStory mult=1..1 side=A
     */
    private Shop shop;
    /**
     * @pdRoleInfo migr=no name=ShopStoryType assc=shopStoryShopStoryType mult=1..1 side=A
     */
    private ShopStoryType shopStoryType;


    /**
     * Empty constructor which is required by Hibernate
     */
    public ShopStory() {

    }

    //<editor-fold name="accessor">

    /**
     * Get value of storyId
     *
     * @return storyId
     */
    public long getStoryId() {
        return storyId;
    }

    /**
     * Set value of storyId
     *
     * @param newStoryId
     */
    public void setStoryId(long newStoryId) {
        this.storyId = newStoryId;
    }

    /**
     * Get value of storyName
     *
     * @return storyName
     */
    public String getStoryName() {
        return storyName;
    }

    /**
     * Set value of storyName
     *
     * @param newStoryName
     */
    public void setStoryName(String newStoryName) {
        this.storyName = newStoryName;
    }

    /**
     * Get value of storyContentUrl
     *
     * @return storyContentUrl
     */
    public String getStoryContentUrl() {
        return storyContentUrl;
    }

    /**
     * Set value of storyContentUrl
     *
     * @param newStoryContentUrl
     */
    public void setStoryContentUrl(String newStoryContentUrl) {
        this.storyContentUrl = newStoryContentUrl;
    }

    /**
     * Get value of addedTime
     *
     * @return addedTime
     */
    public java.util.Date getAddedTime() {
        return addedTime;
    }

    /**
     * Set value of addedTime
     *
     * @param newAddedTime
     */
    public void setAddedTime(java.util.Date newAddedTime) {
        this.addedTime = newAddedTime;
    }

    /**
     * Get value of shopStoryPK.
     *
     * @return shopStoryPK object
     */
    public ShopStoryPK getShopStoryPK() {
        return new ShopStoryPK(storyId);
    }

    /**
     * Set value of shopStoryPK.
     *
     * @param pk
     */
    public void setShopStoryPK(ShopStoryPK pk) {
        if (pk != null) {
            this.storyId = pk.getStoryId();
        }
    }

    /**
     * @pdGenerated default parent getter
     */
    public Shop getShop() {
        return shop;
    }

    /**
     * @param newShop
     * @pdGenerated default parent setter
     */
    public void setShop(Shop newShop) {
        if (this.shop == null || !this.shop.equals(newShop)) {
            if (this.shop != null) {
                Shop oldShop = this.shop;
                this.shop = null;
                //oldShop.removeShopStory(this);
            }
            if (newShop != null) {
                this.shop = newShop;
                //this.shop.addShopStory(this);
            }
        }
    }

    /**
     * @pdGenerated default parent getter
     */
    public ShopStoryType getShopStoryType() {
        return shopStoryType;
    }

    /**
     * @param newShopStoryType
     * @pdGenerated default parent setter
     */
    public void setShopStoryType(ShopStoryType newShopStoryType) {
        if (this.shopStoryType == null || !this.shopStoryType.equals(newShopStoryType)) {
            if (this.shopStoryType != null) {
                ShopStoryType oldShopStoryType = this.shopStoryType;
                this.shopStoryType = null;
                //oldShopStoryType.removeShopStory(this);
            }
            if (newShopStoryType != null) {
                this.shopStoryType = newShopStoryType;
                //this.shopStoryType.addShopStory(this);
            }
        }
    }


    //</editor-fold>


    //<editor-fold name="common methods">

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