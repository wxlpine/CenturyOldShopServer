package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  ShopHistory.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopHistory
 ***********************************************************************/

import java.util.Date;

/**
 * @pdOid b2259b3b-c98e-4318-8de0-bdca11d8c607
 */
public class ShopHistory {
    /**
     * @pdOid 66cc8df8-53ab-4b83-85f0-aeed394f39b2
     */
    private long shopHistoryId;
    /**
     * @pdOid 45baea69-f7b9-4958-a9f2-d088ef45bb8c
     */
    private String title;
    /**
     * @pdOid b62fe8ec-dc45-4627-bd93-221d2d33fe8d
     */
    private String smallPhotoUrl;
    /**
     * @pdOid 920552e5-4a62-4df9-9111-f826b4083e99
     */
    private String shortDescription;
    /**
     * @pdOid c41816ba-fa6e-4683-8425-939db205b739
     */
    private Date publishTime;
    /**
     * @pdOid 2261d9cf-d383-4735-9888-c7c607fdebd6
     */
    private int visitCount;
    /**
     * @pdOid 76e17c8a-0e1c-4017-ba58-a52f9a865a3f
     */
    private String detailedIntroductionPageUrl;

    /**
     * @pdRoleInfo migr=no name=Shop assc=shopShopHistory mult=1..1 side=A
     */
    private Shop shop;


}