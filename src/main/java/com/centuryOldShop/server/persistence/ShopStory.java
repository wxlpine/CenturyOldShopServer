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
    private java.lang.String storyName;
    /**
     * @pdOid 2bccc221-e36c-45c5-967a-bc4dcffc42ec
     */
    private java.lang.String storyContentUrl;
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
    public java.lang.String getStoryName() {
        return storyName;
    }

    /**
     * Set value of storyName
     *
     * @param newStoryName
     */
    public void setStoryName(java.lang.String newStoryName) {
        this.storyName = newStoryName;
    }

    /**
     * Get value of storyContentUrl
     *
     * @return storyContentUrl
     */
    public java.lang.String getStoryContentUrl() {
        return storyContentUrl;
    }

    /**
     * Set value of storyContentUrl
     *
     * @param newStoryContentUrl
     */
    public void setStoryContentUrl(java.lang.String newStoryContentUrl) {
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

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {

        if (other == null)
            return false;

        if (other == this)
            return true;

        if (!(other instanceof ShopStory))
            return false;

        ShopStory cast = (ShopStory) other;

        if (this.storyId != cast.getStoryId())
            return false;

        if (this.storyName == null ? cast.getStoryName() != this.storyName : !this.storyName.equals(cast.getStoryName()))
            return false;

        if (this.storyContentUrl == null ? cast.getStoryContentUrl() != this.storyContentUrl : !this.storyContentUrl.equals(cast.getStoryContentUrl()))
            return false;

        if (this.addedTime == null ? cast.getAddedTime() != this.addedTime : !(com.sybase.orm.util.Util.compareDate(this.addedTime, cast.getAddedTime(), java.util.Calendar.SECOND) == 0))
            return false;

        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int hashCode = 0;
        hashCode = 29 * hashCode + (new Long(storyId)).hashCode();
        if (this.storyName != null)
            hashCode = 29 * hashCode + storyName.hashCode();
        if (this.storyContentUrl != null)
            hashCode = 29 * hashCode + storyContentUrl.hashCode();
        if (this.addedTime != null)
            hashCode = 29 * hashCode + addedTime.hashCode();
        return hashCode;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.ShopStory: ");
        ret.append("storyId='" + storyId + "'");
        ret.append("storyName='" + storyName + "'");
        ret.append("storyContentUrl='" + storyContentUrl + "'");
        ret.append("addedTime='" + addedTime + "'");
        return ret.toString();
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

    /**
     * Empty constructor which is required by Hibernate
     */
    public ShopStory() {

    }

}