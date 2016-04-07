package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  Favorite.java
 * Author:  cmicat
 * Purpose: Defines the Class Favorite
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;

/**
 * @pdOid 280525cd-3eeb-4022-93f3-9155b0fed88d
 */
public class Favorite implements Serializable {
    /**
     * @pdOid 58cb0624-df23-4f54-9682-9bd70d8b14a9
     */
    private Date addTime;

    private Commodity commodity;
    private AppUser appUser;

    //<editor-fold desc="constructor">
    public Favorite() {
    }
    //</editor-fold>

    //<editor-fold desc="accessor">

    public Date getAddTime() {
        return addTime;
    }

    public Favorite setAddTime(Date addTime) {
        this.addTime = addTime;
        return this;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public Favorite setCommodity(Commodity commodity) {
        this.commodity = commodity;
        return this;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public Favorite setAppUser(AppUser appUser) {
        this.appUser = appUser;
        return this;
    }

    //</editor-fold>

    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Favorite favorite = (Favorite) o;

        return commodity != null ? commodity.equals(favorite.commodity) : favorite.commodity == null;

    }

    @Override
    public int hashCode() {
        return commodity != null ? commodity.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Favorite{" +
                "addTime=" + addTime +
                ", commodity=" + commodity +
                ", appUser=" + appUser +
                '}';
    }

    //</editor-fold>

}