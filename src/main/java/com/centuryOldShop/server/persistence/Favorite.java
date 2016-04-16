/***********************************************************************
 * Module:  Favorite.java
 * Author:  cmicat
 * Purpose: Defines the Class Favorite
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * @pdOid fd7231df-0466-4d8b-b0c7-c500e6dc55a9
 */
public class Favorite implements java.io.Serializable {
    /**
     * @pdOid 98df48f9-793e-454b-bd8c-e62c8a0e4eb4
     */
    private java.util.Date addTime;

    private Commodity favoriteCommodity;
    private AppUser favoriteUser;

    /**
     * Get value of addTime
     *
     * @return addTime
     */
    public java.util.Date getAddTime() {
        return addTime;
    }

    /**
     * Set value of addTime
     *
     * @param newAddTime
     */
    public void setAddTime(java.util.Date newAddTime) {
        this.addTime = newAddTime;
    }

    /**
     * Get value of favoritePK.
     *
     * @return favoritePK object
     */
    public FavoritePK getFavoritePK() {
        return new FavoritePK();
    }

    /**
     * Set value of favoritePK.
     *
     * @param pk
     */
    public void setFavoritePK(FavoritePK pk) {
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {

        if (other == null)
            return false;

        if (other == this)
            return true;

        if (!(other instanceof Favorite))
            return false;

        Favorite cast = (Favorite) other;

        if (this.addTime == null ? cast.getAddTime() != this.addTime : !(com.sybase.orm.util.Util.compareDate(this.addTime, cast.getAddTime(), java.util.Calendar.SECOND) == 0))
            return false;

        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int hashCode = 0;
        if (this.addTime != null)
            hashCode = 29 * hashCode + addTime.hashCode();
        return hashCode;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.Favorite: ");
        ret.append("addTime='" + addTime + "'");
        return ret.toString();
    }

    /**
     * Empty constructor which is required by Hibernate
     */
    public Favorite() {
    }

}