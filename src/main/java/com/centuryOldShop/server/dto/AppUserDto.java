package com.centuryOldShop.server.dto;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

/**
 * Created by cmicat on 2016/4/22.
 */
public class AppUserDto {

    private long userId;
    private String userName;
    private byte[] password;
    private String email;
    private String phoneNumber;
    private String userType;
    private String headPortraitUrl;
    private java.util.Date registerTime;

    private long managedShopId;

    //<editor-fold name="accessor">

    public long getUserId() {
        return userId;
    }

    public AppUserDto setUserId(long userId) {
        this.userId = userId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public AppUserDto setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public byte[] getPassword() {
        return password;
    }

    public AppUserDto setPassword(byte[] password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public AppUserDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public AppUserDto setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getUserType() {
        return userType;
    }

    public AppUserDto setUserType(String userType) {
        this.userType = userType;
        return this;
    }

    public String getHeadPortraitUrl() {
        return headPortraitUrl;
    }

    public AppUserDto setHeadPortraitUrl(String headPortraitUrl) {
        this.headPortraitUrl = headPortraitUrl;
        return this;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public AppUserDto setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
        return this;
    }

    public long getManagedShopId() {
        return managedShopId;
    }

    public AppUserDto setManagedShopId(long managedShopId) {
        this.managedShopId = managedShopId;
        return this;
    }

    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUserDto that = (AppUserDto) o;
        return userId == that.userId &&
                managedShopId == that.managedShopId &&
                Objects.equals(userName, that.userName) &&
                Arrays.equals(password, that.password) &&
                Objects.equals(email, that.email) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(userType, that.userType) &&
                Objects.equals(headPortraitUrl, that.headPortraitUrl) &&
                Objects.equals(registerTime, that.registerTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, password, email, phoneNumber, userType, headPortraitUrl,
                registerTime, managedShopId);
    }

    @Override
    public String toString() {
        return "AppUserDto{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password=" + Arrays.toString(password) +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userType='" + userType + '\'' +
                ", headPortraitUrl='" + headPortraitUrl + '\'' +
                ", registerTime=" + registerTime +
                ", managedShopId=" + managedShopId +
                '}';
    }

    //</editor-fold>

}
