package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  FavoriteEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class FavoriteEntity
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;

/**
 * @pdOid 280525cd-3eeb-4022-93f3-9155b0fed88d
 */
public class FavoriteEntity implements Serializable {
    /**
     * @pdOid 58cb0624-df23-4f54-9682-9bd70d8b14a9
     */
    private Date addTime;

    private CommodityEntity commodity;
    private AppUserEntity appUser;

    //<editor-fold desc="constructor">
    public FavoriteEntity() {
    }
    //</editor-fold>

    //<editor-fold desc="accessor">

    public Date getAddTime() {
        return addTime;
    }

    public FavoriteEntity setAddTime(Date addTime) {
        this.addTime = addTime;
        return this;
    }

    public CommodityEntity getCommodity() {
        return commodity;
    }

    public FavoriteEntity setCommodity(CommodityEntity commodity) {
        this.commodity = commodity;
        return this;
    }

    public AppUserEntity getAppUser() {
        return appUser;
    }

    public FavoriteEntity setAppUser(AppUserEntity appUser) {
        this.appUser = appUser;
        return this;
    }

    //</editor-fold>

    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FavoriteEntity favorite = (FavoriteEntity) o;

        return commodity != null ? commodity.equals(favorite.commodity) : favorite.commodity == null;

    }

    @Override
    public int hashCode() {
        return commodity != null ? commodity.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "FavoriteEntity{" +
                "addTime=" + addTime +
                ", commodity=" + commodity +
                ", appUser=" + appUser +
                '}';
    }

    //</editor-fold>

}