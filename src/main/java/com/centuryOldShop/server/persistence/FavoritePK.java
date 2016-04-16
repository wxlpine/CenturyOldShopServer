/***********************************************************************
 * Module:  FavoritePK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class Favorite
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * Generated primary key class for Favorite. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class FavoritePK implements java.io.Serializable {

    /**
     * Empty constructor
     */
    public FavoritePK() {
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

        FavoritePK cast = (FavoritePK) other;

        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int _hashCode = 0;
        return _hashCode;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.FavoritePK: ");
        return ret.toString();
    }
}