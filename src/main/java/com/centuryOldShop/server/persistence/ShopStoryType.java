package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  ShopStoryType.java
 * Author:  cmicat
 * Purpose: Defines the Class ShopStoryType
 ***********************************************************************/

import java.io.Serializable;
import java.util.List;

/**
 * @pdOid bfa242ee-a3ea-4742-a0f2-e54cc95c059c
 */
public class ShopStoryType implements Serializable {
    /**
     * @pdOid fffbae71-21e1-4cd3-ba81-1b63e7270826
     */
    private String storyTypeName;

    /**
     * @pdRoleInfo migr=no name=ShopStory assc=shopStoryShopStoryType coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<ShopStory> shopStoryType;

    public ShopStoryType() {
    }
}