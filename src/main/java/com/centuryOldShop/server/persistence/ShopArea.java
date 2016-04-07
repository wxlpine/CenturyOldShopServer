package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  ShopArea.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopArea
 ***********************************************************************/

import java.util.List;

/**
 * @pdOid bcc6769a-149d-421c-8d75-c1edf781f305
 */
public class ShopArea {
    /**
     * @pdOid 372b6d82-6795-43ff-8d4e-582418602ce8
     */
    private long shopAreaId;
    /**
     * @pdOid 2a2d5bce-c663-4508-a502-277ae60f5d28
     */
    private String shopAreaName;

    /**
     * @pdRoleInfo migr=no name=Shop assc=shopShopArea coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<Shop> shop;


}