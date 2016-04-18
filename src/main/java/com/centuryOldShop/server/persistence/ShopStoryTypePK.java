/***********************************************************************
 * Module:  ShopStoryTypePK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class ShopStoryType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.Objects;

/**
 * Generated primary key class for ShopStoryType. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class ShopStoryTypePK implements java.io.Serializable {
    /**
     * @pdOid c43686ae-5c3c-483f-b206-ec8e8416327b
     */
    private String storyTypeName;


    //<editor-fold name="constructor">

    /**
     * Empty constructor
     */
    public ShopStoryTypePK() {

    }

    /**
     * Constructor with parameters
     *
     * @param storyTypeName parameter to set value of field storyTypeName
     */
    public ShopStoryTypePK(String storyTypeName) {
        this.storyTypeName = storyTypeName;
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


    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopStoryTypePK that = (ShopStoryTypePK) o;
        return Objects.equals(storyTypeName, that.storyTypeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storyTypeName);
    }

    @Override
    public String toString() {
        return "ShopStoryTypePK{" +
                "storyTypeName='" + storyTypeName + '\'' +
                '}';
    }

    //</editor-fold>

}