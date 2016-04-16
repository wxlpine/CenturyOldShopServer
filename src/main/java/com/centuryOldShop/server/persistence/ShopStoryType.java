/***********************************************************************
 * Module:  ShopStoryType.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopStoryType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * @pdOid 97b441c9-09cb-4861-a563-7b107a5cd271
 */
public class ShopStoryType implements java.io.Serializable {
    /**
     * @pdOid c43686ae-5c3c-483f-b206-ec8e8416327b
     */
    private java.lang.String storyTypeName;

    /**
     * @pdRoleInfo migr=no name=ShopStory assc=shopStoryShopStoryType coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private java.util.List<ShopStory> shopStory;

    /**
     * Get value of storyTypeName
     *
     * @return storyTypeName
     */
    public java.lang.String getStoryTypeName() {
        return storyTypeName;
    }

    /**
     * Set value of storyTypeName
     *
     * @param newStoryTypeName
     */
    public void setStoryTypeName(java.lang.String newStoryTypeName) {
        this.storyTypeName = newStoryTypeName;
    }

    /**
     * Get value of shopStoryTypePK.
     *
     * @return shopStoryTypePK object
     */
    public ShopStoryTypePK getShopStoryTypePK() {
        return new ShopStoryTypePK(storyTypeName);
    }

    /**
     * Set value of shopStoryTypePK.
     *
     * @param pk
     */
    public void setShopStoryTypePK(ShopStoryTypePK pk) {
        if (pk != null) {
            this.storyTypeName = pk.getStoryTypeName();
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

        if (!(other instanceof ShopStoryType))
            return false;

        ShopStoryType cast = (ShopStoryType) other;

        if (this.storyTypeName == null ? cast.getStoryTypeName() != this.storyTypeName : !this.storyTypeName.equals(cast.getStoryTypeName()))
            return false;

        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int hashCode = 0;
        if (this.storyTypeName != null)
            hashCode = 29 * hashCode + storyTypeName.hashCode();
        return hashCode;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.ShopStoryType: ");
        ret.append("storyTypeName='" + storyTypeName + "'");
        return ret.toString();
    }


    /**
     * @pdGenerated default getter
     */
    public java.util.List<ShopStory> getShopStory() {
        if (shopStory == null)
            shopStory = new java.util.ArrayList<ShopStory>();
        return shopStory;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorShopStory() {
        if (shopStory == null)
            shopStory = new java.util.ArrayList<ShopStory>();
        return shopStory.iterator();
    }

    /**
     * @param newShopStory
     * @pdGenerated default setter
     */
    public void setShopStory(java.util.List<ShopStory> newShopStory) {
        //removeAllShopStory();
        this.shopStory = newShopStory;
    }

    /**
     * @param newShopStory
     * @pdGenerated default add
     */
    public void addShopStory(ShopStory newShopStory) {
        if (newShopStory == null)
            return;
        if (this.shopStory == null)
            this.shopStory = new java.util.ArrayList<ShopStory>();
        if (!this.shopStory.contains(newShopStory)) {
            this.shopStory.add(newShopStory);
            newShopStory.setShopStoryType(this);
        }
    }

    /**
     * @param oldShopStory
     * @pdGenerated default remove
     */
    public void removeShopStory(ShopStory oldShopStory) {
        if (oldShopStory == null)
            return;
        if (this.shopStory != null)
            if (this.shopStory.contains(oldShopStory)) {
                this.shopStory.remove(oldShopStory);
                oldShopStory.setShopStoryType((ShopStoryType) null);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllShopStory() {
        if (shopStory != null) {
            ShopStory oldShopStory;
            for (java.util.Iterator iter = getIteratorShopStory(); iter.hasNext(); ) {
                oldShopStory = (ShopStory) iter.next();
                iter.remove();
                oldShopStory.setShopStoryType((ShopStoryType) null);
            }
        }
    }

    /**
     * Empty constructor which is required by Hibernate
     */
    public ShopStoryType() {

    }

}