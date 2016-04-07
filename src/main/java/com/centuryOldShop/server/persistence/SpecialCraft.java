package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  SpecialCraft.java
 * Author:  cmicat
 * Purpose: Defines the Class SpecialCraft
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;

/**
 * @pdOid 219a3ee8-f77a-4798-b702-3b3c24114fae
 */
public class SpecialCraft implements Serializable {
    /**
     * @pdOid 2d9ac220-7ce8-4374-b747-b7555ff5b6b8
     */
    private long specialCraftId;
    /**
     * @pdOid 44698309-72b0-4a13-bd64-9b8e3e878217
     */
    private String title;
    /**
     * @pdOid 53bc5d2b-3d98-4be8-9217-863e95c4f9e9
     */
    private String smallPhotoUrl;
    /**
     * @pdOid fe5b048e-ce1e-40db-95c2-6726d74fb55e
     */
    private String introductionUrl;
    /**
     * @pdOid 71862d6f-e663-419b-8be7-9c4891b8ef21
     */
    private Date addedTime;

    /**
     * @pdRoleInfo migr=no name=Shop assc=specialCraftShop mult=1..1 side=A
     */
    private Shop shop;

    public SpecialCraft() {
    }
}