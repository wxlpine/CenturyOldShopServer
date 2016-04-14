package com.centuryOldShop.server.persistence;

/***********************************************************************
 * Module:  AppUserEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class AppUserEntity
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @pdOid d6608c5e-a7d5-4fd5-9f06-ad123e7d64f0
 */
public class AppUserEntity implements Serializable {
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
    private List<OrderFormEntity> orderForm;
    /**
     * @pdRoleInfo migr=no name=UserEvaluation assc=userEvaluation coll=java.util.List impl=java.util.ArrayList mult=0..* type=Composition
     */
    private List<UserEvaluationEntity> userEvaluation;
    /**
     * @pdRoleInfo migr=no name=Message assc=sendUser coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<MessageEntity> sendMessage;
    /**
     * @pdRoleInfo migr=no name=Message assc=receiveUser coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<MessageEntity> receiveMessage;
    private List<ShoppingCartEntity> shoppingCart;
    /**
     * @pdRoleInfo migr=no name=Shop assc=manage mult=0..1 side=A
     */
    private ShopEntity managedShop;
    private List<FavoriteEntity> favorite;

    //<editor-fold desc="constructor">

    public AppUserEntity() {
    }

    //</editor-fold>


    //<editor-fold desc="accessor">

    public long getUserId() {
        return userId;
    }

    public AppUserEntity setUserId(long userId) {
        this.userId = userId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public AppUserEntity setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public AppUserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public AppUserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public AppUserEntity setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public short getUserType() {
        return userType;
    }

    public AppUserEntity setUserType(short userType) {
        this.userType = userType;
        return this;
    }

    public String getHeadPortraitUrl() {
        return headPortraitUrl;
    }

    public AppUserEntity setHeadPortraitUrl(String headPortraitUrl) {
        this.headPortraitUrl = headPortraitUrl;
        return this;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public AppUserEntity setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
        return this;
    }

    public List<OrderFormEntity> getOrderForm() {
        return orderForm;
    }

    public AppUserEntity setOrderForm(List<OrderFormEntity> orderForm) {
        this.orderForm = orderForm;
        return this;
    }

    public List<UserEvaluationEntity> getUserEvaluation() {
        return userEvaluation;
    }

    public AppUserEntity setUserEvaluation(List<UserEvaluationEntity> userEvaluation) {
        this.userEvaluation = userEvaluation;
        return this;
    }

    public List<MessageEntity> getSendMessage() {
        return sendMessage;
    }

    public AppUserEntity setSendMessage(List<MessageEntity> sendMessage) {
        this.sendMessage = sendMessage;
        return this;
    }

    public List<MessageEntity> getReceiveMessage() {
        return receiveMessage;
    }

    public AppUserEntity setReceiveMessage(List<MessageEntity> receiveMessage) {
        this.receiveMessage = receiveMessage;
        return this;
    }

    public List<ShoppingCartEntity> getShoppingCart() {
        return shoppingCart;
    }

    public AppUserEntity setShoppingCart(List<ShoppingCartEntity> shoppingCart) {
        this.shoppingCart = shoppingCart;
        return this;
    }

    public ShopEntity getManagedShop() {
        return managedShop;
    }

    public AppUserEntity setManagedShop(ShopEntity managedShop) {
        this.managedShop = managedShop;
        return this;
    }

    public List<FavoriteEntity> getFavorite() {
        return favorite;
    }

    public AppUserEntity setFavorite(List<FavoriteEntity> favorite) {
        this.favorite = favorite;
        return this;
    }

    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppUserEntity appUser = (AppUserEntity) o;

        return userId == appUser.userId;

    }

    @Override
    public int hashCode() {
        return (int) (userId ^ (userId >>> 32));
    }

    @Override
    public String toString() {
        return "AppUserEntity{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userType=" + userType +
                ", headPortraitUrl='" + headPortraitUrl + '\'' +
                ", registerTime=" + registerTime +
                '}';
    }

    //</editor-fold>

}