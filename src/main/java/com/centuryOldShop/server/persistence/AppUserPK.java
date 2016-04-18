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


    //<editor-fold name="constructor">

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

    //</editor-fold>

    //<editor-fold name="accessor">

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
     */
    public void setUserId(long newUserId) {
        this.userId = newUserId;
    }

    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppUserPK appUserPK = (AppUserPK) o;

        return userId == appUserPK.userId;

    }

    @Override
    public int hashCode() {
        return (int) (userId ^ (userId >>> 32));
    }

    @Override
    public String toString() {
        return "AppUserPK{" +
                "userId=" + userId +
                '}';
    }

    //</editor-fold>
}