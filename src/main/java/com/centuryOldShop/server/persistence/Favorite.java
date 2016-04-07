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

    private Commodity favoriteCommodity;
    private AppUser appUser;

    public Favorite() {
    }
}