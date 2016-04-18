/***********************************************************************
 * Module:  ShopStoryPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class ShopStory
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.Objects;

/**
 * Generated primary key class for ShopStory. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class ShopStoryPK implements java.io.Serializable {
    /**
     * @pdOid c893b6c5-a38f-4fe8-a595-82e7018b3623
     */
    private long storyId;

    //<editor-fold name="constructor">

    /**
     * Empty constructor
     */
    public ShopStoryPK() {

    }

    /**
     * Constructor with parameters
     *
     * @param storyId parameter to set value of field storyId
     */
    public ShopStoryPK(long storyId) {
        this.storyId = storyId;
    }

    //</editor-fold>


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


    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopStoryPK that = (ShopStoryPK) o;
        return storyId == that.storyId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(storyId);
    }

    @Override
    public String toString() {
        return "ShopStoryPK{" +
                "storyId=" + storyId +
                '}';
    }

    //</editor-fold>
}