package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  OrderForm.java
 * Author:  cmicat
 * Purpose: Defines the Class OrderForm
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @pdOid 0698fce8-4586-41a2-840e-dadcff225b06
 */
public class OrderForm implements Serializable {
    /**
     * @pdOid a7deefd7-bb5a-41f2-aeb6-aa6ecc6affd2
     */
    private long orderFormId;
    /**
     * @pdOid ae7e2115-8c8e-4e76-827c-477cb4e4a437
     */
    private Date orderedTime;
    /**
     * @pdOid f190ac20-6c30-44c1-9fc2-7b9f915b5f88
     */
    private Date payedTime;
    /**
     * @pdOid 0786f681-5319-4344-8398-86ad0e1e30cd
     */
    private Date sendTime;
    /**
     * @pdOid 0f0350f6-92dc-4fef-ad73-49b61ade7a56
     */
    private Date receiptedTime;
    /**
     * @pdOid 50300fe9-dc08-40c0-a6f0-ea193f05d97c
     */
    private String expressNumber;

    private List<OrderFormCommodity> orderFormCommodity;
    /**
     * @pdRoleInfo migr=no name=UserEvaluation assc=userEvaluation coll=java.util.List impl=java.util.ArrayList mult=0..* type=Composition
     */
    private List<UserEvaluation> userEvaluation;
    /**
     * @pdRoleInfo migr=no name=AppUser assc=userOrderForm mult=1..1 side=A
     */
    private AppUser appUser;
    /**
     * @pdRoleInfo migr=no name=Shop assc=shopOrderForm mult=1..1 side=A
     */
    private Shop shop;
    /**
     * @pdRoleInfo migr=no name=DiscountInfo assc=orderFormDiscountInfo mult=0..1 side=A
     */
    private DiscountInfo discountInfo;
    /**
     * @pdRoleInfo migr=no name=OrderStatusType assc=orderFormOrderStatusType mult=1..1 side=A
     */
    private OrderStatusType orderStatusType;
    /**
     * @pdRoleInfo migr=no name=DisputeStatusType assc=disputeStatusTypeOrderForm mult=1..1 side=A
     */
    private DisputeStatusType disputeStatusType;

    public OrderForm() {
    }
}