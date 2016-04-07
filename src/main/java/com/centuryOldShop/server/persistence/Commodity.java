package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  Commodity.java
 * Author:  cmicat
 * Purpose: Defines the Class Commodity
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @pdOid 471ca747-75ab-4384-994e-a56f8972497f
 */
public class Commodity implements Serializable {
    /**
     * @pdOid dc077716-c898-47eb-a3a4-6ea5ecec5394
     */
    private long commodityId;
    /**
     * @pdOid 685ee61f-f151-4986-bd09-e6e444dd8d81
     */
    private String commodityName;
    /**
     * @pdOid 413d3cc9-8b92-4891-840a-30550c1923b2
     */
    private String smallPhotoUrl;
    /**
     * @pdOid a9d71cd8-f9b8-4bd8-b2ea-6efc47f57f7e
     */
    private String shortDescription;
    /**
     * @pdOid 99650fb8-0949-4984-8647-0edf3c3920da
     */
    private double price;
    /**
     * @pdOid 8229e151-c0ac-4a90-b304-fa11251503ed
     */
    private int salesVolume;
    /**
     * @pdOid 7144f598-1b74-4372-a019-499cb4c22494
     */
    private boolean exemptionFromPostage;
    /**
     * @pdOid c4e05792-4494-455a-bbe6-88bb5ac817e7
     */
    private Date addedTime;
    /**
     * @pdOid 4c2e9fd7-ff03-4079-b1c8-e4af7beedc69
     */
    private String phoneTopBigPhotoUrl;
    /**
     * @pdOid 122170ce-eaa9-4a11-9e4d-2823e1a969ae
     */
    private boolean offShelf;
    /**
     * @pdOid 81e00445-b4d1-46ad-b96f-19e0c6fe853a
     */
    private int remainingQuantity;

    /**
     * @pdRoleInfo migr=no name=DiscountInfo assc=commodityDiscountInfo coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<DiscountInfo> discountInfo;
    /**
     * @pdRoleInfo migr=no name=UserEvaluation assc=userEvaluation coll=java.util.List impl=java.util.ArrayList mult=0..* type=Composition
     */
    private List<UserEvaluation> userEvaluation;
    private List<Favorite> favorite;
    private List<OrderFormCommodity> orderFormCommodity;
    /**
     * @pdRoleInfo migr=no name=CommodityType assc=commodityCommodityType mult=1..1 side=A
     */
    private CommodityType commodityType;
    private List<ShoppingCart> shoppingCart;

    public Commodity() {
    }
}