package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  ShopStory.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopStory
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;

/**
 * @pdOid 5095ee84-fa98-470d-8301-54a7f1706147
 */
public class ShopStory implements Serializable {
    /**
     * @pdOid 59ec9e40-37d1-4ea3-8aa0-ae635490e5ce
     */
    private long storyId;
    /**
     * @pdOid 9ac06f26-39c4-458f-a180-ce809dfe83d8
     */
    private String storyName;
    /**
     * @pdOid 5dea57ea-d755-4e87-ac17-d4e4fada77ab
     */
    private String storyContentUrl;
    /**
     * @pdOid f8077b25-0412-479c-a4ce-91529cca670c
     */
    private Date addedTime;

    /**
     * @pdRoleInfo migr=no name=Shop assc=shopShopStory mult=1..1 side=A
     */
    private Shop shop;
    /**
     * @pdRoleInfo migr=no name=ShopStoryType assc=shopStoryShopStoryType mult=1..1 side=A
     */
    private ShopStoryType shopStory;

    public ShopStory() {
    }
}