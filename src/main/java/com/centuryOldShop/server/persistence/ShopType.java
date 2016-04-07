package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  ShopType.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopType
 ***********************************************************************/

import java.util.List;

/**
 * @pdOid a40387d8-5e53-4eb0-b53d-4197f5b3c0af
 */
public class ShopType {
    /**
     * @pdOid 5bf7966a-7b9c-427c-b9c2-845ab29313ff
     */
    private String shopTypeName;

    /**
     * @pdRoleInfo migr=no name=Shop assc=shopShopType coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<Shop> shop;


}