/***********************************************************************
 * Module:  Favorite.java
 * Author:  cmicat
 * Purpose: Defines the Class Favorite
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.Date;

/**
 * @pdOid fd7231df-0466-4d8b-b0c7-c500e6dc55a9
 */
public class Favorite implements java.io.Serializable {

    private FavoritePK favoritePK;

    /**
     * @pdOid 98df48f9-793e-454b-bd8c-e62c8a0e4eb4
     */
    private java.util.Date addTime;

    private Commodity favoriteCommodity;
    private AppUser favoriteUser;

    //<editor-fold name="constructor and factory creator">

    /**
     * Empty constructor which is required by Hibernate
     */
    public Favorite() {
    }

    public static Favorite createFavoriteWithUserIdAndCommodityId(long userId, long commodityId) {
        Favorite favorite = new Favorite();
        favorite.setFavoritePK(new FavoritePK(userId, commodityId));
        favorite.addTime = new Date();

        return favorite;
    }

    //</editor-fold>

    //<editor-fold name="accessor">

    public FavoritePK getFavoritePK() {
        return favoritePK;
    }

    public Favorite setFavoritePK(FavoritePK id) {
        this.favoritePK = id;
        return this;
    }

    public Commodity getFavoriteCommodity() {
        return favoriteCommodity;
    }

    public Favorite setFavoriteCommodity(Commodity favoriteCommodity) {
        this.favoriteCommodity = favoriteCommodity;
        return this;
    }

    public AppUser getFavoriteUser() {
        return favoriteUser;
    }

    public Favorite setFavoriteUser(AppUser favoriteUser) {
        this.favoriteUser = favoriteUser;
        return this;
    }

    public java.util.Date getAddTime() {
        return addTime;
    }

    public void setAddTime(java.util.Date newAddTime) {
        this.addTime = newAddTime;
    }

    //</editor-fold>


    //<editor-fold name="common methods">

    @Override
    public String toString() {
        return "Favorite{" +
                "favoritePK=" + favoritePK +
                ", addTime=" + addTime +
                ", favoriteCommodity=" + favoriteCommodity +
                ", favoriteUser=" + favoriteUser +
                '}';
    }

    //</editor-fold>


}