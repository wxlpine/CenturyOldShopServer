/***********************************************************************
 * Module:  ShopStoryType.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopStoryType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.List;

/**
 * @pdOid 97b441c9-09cb-4861-a563-7b107a5cd271
 */
public class ShopStoryType implements java.io.Serializable {
    /**
     * @pdOid c43686ae-5c3c-483f-b206-ec8e8416327b
     */
    private String storyTypeName;

    /**
     * @pdRoleInfo migr=no name=ShopStory assc=shopStoryShopStoryType coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<ShopStory> shopStory;


    //<editor-fold name="constructor">

    /**
     * Empty constructor which is required by Hibernate
     */
    public ShopStoryType() {

    }

    //</editor-fold>

    //<editor-fold name="accessor">

    /**
     * Get value of storyTypeName
     *
     * @return storyTypeName
     */
    public String getStoryTypeName() {
        return storyTypeName;
    }

    /**
     * Set value of storyTypeName
     *
     * @param newStoryTypeName
     */
    public void setStoryTypeName(String newStoryTypeName) {
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

    /**
     * @pdGenerated default getter
     */
    public List<ShopStory> getShopStory() {
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
    public void setShopStory(List<ShopStory> newShopStory) {
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

    //</editor-fold>


    //<editor-fold name="common methods">

    @Override
    public String toString() {
        return "ShopStoryType{" +
                "storyTypeName='" + storyTypeName + '\'' +
                '}';
    }


    //</editor-fold>

}