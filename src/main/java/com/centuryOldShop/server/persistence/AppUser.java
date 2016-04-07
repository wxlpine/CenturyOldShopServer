package com.centuryOldShop.server.persistence;

/***********************************************************************
 * Module:  AppUser.java
 * Author:  cmicat
 * Purpose: Defines the Class AppUser
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @pdOid d6608c5e-a7d5-4fd5-9f06-ad123e7d64f0
 */
public class AppUser implements Serializable {
    /**
     * @pdOid 87d24e90-68de-4eeb-9741-b4fea56854cc
     */
    private long userId;
    /**
     * @pdOid 92b2f7c2-1a61-4c15-849b-38e92c842dd1
     */
    private String userName;
    /**
     * @pdOid 54192453-bb86-4db8-830d-d8bfd8bf7023
     */
    private String password;
    /**
     * @pdOid 9b62e12d-d516-4e4c-b8b3-f67f7e173983
     */
    private String email;
    /**
     * @pdOid 938b1290-b4c2-412d-bc1b-9cd5ae06f1c6
     */
    private String phoneNumber;
    /**
     * @pdOid 4531aed3-e6ce-4b89-a2ca-dd36eb42742f
     */
    private short userType;
    /**
     * @pdOid 791daaa0-c0ca-4c71-a194-36fe5e5284f8
     */
    private String headPortraitUrl;
    /**
     * @pdOid 76dc4d92-b658-498d-b025-c8d33cca6bf9
     */
    private Date registerTime;

    /**
     * @pdRoleInfo migr=no name=OrderForm assc=userOrderForm coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<OrderForm> orderForm;
    /**
     * @pdRoleInfo migr=no name=UserEvaluation assc=userEvaluation coll=java.util.List impl=java.util.ArrayList mult=0..* type=Composition
     */
    private List<UserEvaluation> userEvaluation;
    /**
     * @pdRoleInfo migr=no name=Message assc=sendUser coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<Message> sendMessage;
    /**
     * @pdRoleInfo migr=no name=Message assc=receiveUser coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<Message> receiveMessage;
    private List<ShoppingCart> shoppingCart;
    /**
     * @pdRoleInfo migr=no name=Shop assc=manage mult=0..1 side=A
     */
    private Shop managedShop;
    private List<Favorite> favorite;

    public AppUser() {
    }
}