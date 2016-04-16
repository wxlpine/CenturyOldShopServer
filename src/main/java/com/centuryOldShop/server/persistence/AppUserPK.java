/***********************************************************************
 * Module:  AppUserPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class AppUser
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * Generated primary key class for AppUser. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class AppUserPK implements java.io.Serializable {
    /**
     * @pdOid 54d52940-df5a-4ec4-b197-d07276e4bcb1
     */
    private long userId;

    /**
     * Empty constructor
     */
    public AppUserPK() {
    }

    /**
     * Constructor with parameters
     *
     * @param userId parameter to set value of field userId
     */
    public AppUserPK(long userId) {
        this.userId = userId;
    }

    /**
     * Get value of userId
     *
     * @return userId
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Set value of userId
     *
     * @param newUserId
     */
    public void setUserId(long newUserId) {
        this.userId = newUserId;
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

        AppUserPK cast = (AppUserPK) other;

        if (this.userId != cast.getUserId())
            return false;

        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int _hashCode = 0;
        _hashCode = 29 * _hashCode + (new Long(userId)).hashCode();
        return _hashCode;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.AppUserPK: ");
        ret.append("userId='" + userId + "'");
        return ret.toString();
    }
}