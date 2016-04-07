package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  Shop.java
 * Author:  cmicat
 * Purpose: Defines the Class Shop
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @pdOid 5d8df738-d9e6-4e47-a310-86e2e6813989
 */
public class Shop implements Serializable {
    /**
     * @pdOid c0eb1155-b2b4-43b6-815b-7a86a8979721
     */
    private long shopId;
    /**
     * @pdOid e3b48ce5-4a0b-4e24-ab00-d15f03ab1814
     */
    private String shopName;
    /**
     * @pdOid 954f2242-8d39-4b1f-9274-84e5dfd6dd11
     */
    private String shortDescription;
    /**
     * @pdOid b3838131-644c-4e70-a7e7-e202f9ad68d8
     */
    private Date openABusinessTime;
    /**
     * @pdOid 1f4ff7b0-730c-40f4-9e5b-cad52dab859f
     */
    private int visitCount;
    /**
     * @pdOid b7298898-a042-4d76-8983-bcbba7ea2374
     */
    private String detailedAddress;
    /**
     * @pdOid 1b5416ce-6fa0-40e5-a50a-03fcd01c81d1
     */
    private String trademark;
    /**
     * 入驻时间
     *
     * @pdOid 52e6cf71-27a4-41dc-afd6-82d1272d54fd
     */
    private Date enterTime;
    /**
     * @pdOid 88df9aaf-942e-40f7-888b-6bb425f8f862
     */
    private String phoneNumber;
    /**
     * @pdOid 56dfd9e4-fb89-4016-a8c1-c70acb580e00
     */
    private String fax;
    /**
     * @pdOid 7ecf225c-f9d2-4ded-a087-707c0e33b7a0
     */
    private String longDescription;

    /**
     * @pdRoleInfo migr=no name=News assc=shopNews coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<News> news;
    /**
     * @pdRoleInfo migr=no name=ShopStory assc=shopShopStory coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<ShopStory> shopStory;
    /**
     * @pdRoleInfo migr=no name=DiscountInfo assc=shopDiscountInfo coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<DiscountInfo> discountInfo;
    /**
     * @pdRoleInfo migr=no name=OrderForm assc=shopOrderForm coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<OrderForm> orderForm;
    /**
     * @pdRoleInfo migr=no name=ShopHistory assc=shopShopHistory coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<ShopHistory> shopHistory;
    /**
     * @pdRoleInfo migr=no name=SpecialCraft assc=specialCraftShop coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<SpecialCraft> specialCraft;
    /**
     * @pdRoleInfo migr=no name=VideoIntroduction assc=shopVideoIntroduction coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<VideoIntroduction> videoIntroduction;
    /**
     * @pdRoleInfo migr=no name=AppUser assc=manage coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<AppUser> appUser;
    /**
     * @pdRoleInfo migr=no name=ShopType assc=shopShopType mult=1..1 side=A
     */
    private ShopType shopType;
    /**
     * @pdRoleInfo migr=no name=ShopArea assc=shopShopArea mult=1..1 side=A
     */
    private ShopArea shopArea;

    public Shop() {
    }
}