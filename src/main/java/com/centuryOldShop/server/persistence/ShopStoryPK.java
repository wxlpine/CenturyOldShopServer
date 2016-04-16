/***********************************************************************
 * Module:  ShopStoryPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class ShopStory
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * Generated primary key class for ShopStory. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class ShopStoryPK implements java.io.Serializable {
    /**
     * @pdOid c893b6c5-a38f-4fe8-a595-82e7018b3623
     */
    private long storyId;

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

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {

        if (other == null) {
            return false;
        }

        if (other == this) {
            return true;
        }

        if (!(other.getClass() == getClass()))
            return false;

        ShopStoryPK cast = (ShopStoryPK) other;

        if (this.storyId != cast.getStoryId())
            return false;

        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int _hashCode = 0;
        _hashCode = 29 * _hashCode + (new Long(storyId)).hashCode();
        return _hashCode;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.ShopStoryPK: ");
        ret.append("storyId='" + storyId + "'");
        return ret.toString();
    }
}