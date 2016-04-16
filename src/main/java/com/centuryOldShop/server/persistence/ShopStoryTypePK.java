/***********************************************************************
 * Module:  ShopStoryTypePK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class ShopStoryType
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * Generated primary key class for ShopStoryType. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class ShopStoryTypePK implements java.io.Serializable {
    /**
     * @pdOid c43686ae-5c3c-483f-b206-ec8e8416327b
     */
    private java.lang.String storyTypeName;

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
    public ShopStoryTypePK(java.lang.String storyTypeName) {
        this.storyTypeName = storyTypeName;
    }

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

        ShopStoryTypePK cast = (ShopStoryTypePK) other;

        if (this.storyTypeName == null ? cast.getStoryTypeName() != this.storyTypeName : !this.storyTypeName.equals(cast.getStoryTypeName()))
            return false;

        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int _hashCode = 0;
        if (this.storyTypeName != null)
            _hashCode = 29 * _hashCode + storyTypeName.hashCode();
        return _hashCode;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.ShopStoryTypePK: ");
        ret.append("storyTypeName='" + storyTypeName + "'");
        return ret.toString();
    }
}