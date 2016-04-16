/***********************************************************************
 * Module:  AppUser.java
 * Author:  cmicat
 * Purpose: Defines the Class AppUser
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.List;

/**
 * @pdOid f972a45e-66c0-41bd-a306-9707607caa9d
 */
public class AppUser implements java.io.Serializable {
    /**
     * @pdOid 54d52940-df5a-4ec4-b197-d07276e4bcb1
     */
    private long userId;
    /**
     * @pdOid 8c0da4df-5ff0-4096-8e9f-41e9d7e93349
     */
    private String userName;
    /**
     * @pdOid 68945393-eb5c-4a7d-9602-b2339cb37efa
     */
    private String password;
    /**
     * @pdOid f7fc3600-750c-4f1c-b863-08feb53c1a42
     */
    private String email;
    /**
     * @pdOid 4276e4c2-48fe-41de-a03d-b8a43bc1c8bc
     */
    private String phoneNumber;
    /**
     * @pdOid c1728289-ca16-4729-aed7-8ca5cbb4a2d7
     */
    private short userType;
    /**
     * @pdOid 6b52f529-f80c-49b3-87dd-b0cd438cbe48
     */
    private String headPortraitUrl;
    /**
     * @pdOid f461e830-c3a7-4259-9c6c-a55ff1fbe95c
     */
    private java.util.Date registerTime;

    /**
     * @pdRoleInfo migr=no name=Commodity assc=shoppingCart coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<Commodity> commodity;
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
    /**
     * @pdRoleInfo migr=no name=Commodity assc=favorite coll=java.util.List impl=java.util.ArrayList mult=0..* side=A
     */
    private List<Commodity> favoriteCommodity;
    /**
     * @pdRoleInfo migr=no name=Shop assc=manage mult=0..1 side=A
     */
    private Shop managedShop;

    /**
     * Get value of userId
     *
     * @return userId
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Set value of userId
     */
    public void setUserId(long newUserId) {
        this.userId = newUserId;
    }

    /**
     * Get value of userName
     *
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Set value of userName
     */
    public void setUserName(String newUserName) {
        this.userName = newUserName;
    }

    /**
     * Get value of password
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set value of password
     *
     * @param newPassword
     */
    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    /**
     * Get value of email
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set value of email
     *
     * @param newEmail
     */
    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    /**
     * Get value of phoneNumber
     *
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Set value of phoneNumber
     *
     * @param newPhoneNumber
     */
    public void setPhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }

    /**
     * Get value of userType
     *
     * @return userType
     */
    public short getUserType() {
        return userType;
    }

    /**
     * Set value of userType
     *
     * @param newUserType
     */
    public void setUserType(short newUserType) {
        this.userType = newUserType;
    }

    /**
     * Get value of headPortraitUrl
     *
     * @return headPortraitUrl
     */
    public String getHeadPortraitUrl() {
        return headPortraitUrl;
    }

    /**
     * Set value of headPortraitUrl
     *
     * @param newHeadPortraitUrl
     */
    public void setHeadPortraitUrl(String newHeadPortraitUrl) {
        this.headPortraitUrl = newHeadPortraitUrl;
    }

    /**
     * Get value of registerTime
     *
     * @return registerTime
     */
    public java.util.Date getRegisterTime() {
        return registerTime;
    }

    /**
     * Set value of registerTime
     *
     * @param newRegisterTime
     */
    public void setRegisterTime(java.util.Date newRegisterTime) {
        this.registerTime = newRegisterTime;
    }

    /**
     * Get value of appUserPK.
     *
     * @return appUserPK object
     */
    public AppUserPK getAppUserPK() {
        return new AppUserPK(userId);
    }

    /**
     * Set value of appUserPK.
     *
     * @param pk
     */
    public void setAppUserPK(AppUserPK pk) {
        if (pk != null) {
            this.userId = pk.getUserId();
        }
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {

        if (other == null)
            return false;

        if (other == this)
            return true;

        if (!(other instanceof AppUser))
            return false;

        AppUser cast = (AppUser) other;

        if (this.userId != cast.getUserId())
            return false;

        if (this.userName == null ? cast.getUserName() != this.userName : !this.userName.equals(cast.getUserName()))
            return false;

        if (this.password == null ? cast.getPassword() != this.password : !this.password.equals(cast.getPassword()))
            return false;

        if (this.email == null ? cast.getEmail() != this.email : !this.email.equals(cast.getEmail()))
            return false;

        if (this.phoneNumber == null ? cast.getPhoneNumber() != this.phoneNumber : !this.phoneNumber.equals(cast.getPhoneNumber()))
            return false;

        if (this.userType != cast.getUserType())
            return false;

        if (this.headPortraitUrl == null ? cast.getHeadPortraitUrl() != this.headPortraitUrl : !this.headPortraitUrl.equals(cast.getHeadPortraitUrl()))
            return false;

        if (this.registerTime == null ? cast.getRegisterTime() != this.registerTime : !(com.sybase.orm.util.Util.compareDate(this.registerTime, cast.getRegisterTime(), java.util.Calendar.SECOND) == 0))
            return false;

        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int hashCode = 0;
        hashCode = 29 * hashCode + (new Long(userId)).hashCode();
        if (this.userName != null)
            hashCode = 29 * hashCode + userName.hashCode();
        if (this.password != null)
            hashCode = 29 * hashCode + password.hashCode();
        if (this.email != null)
            hashCode = 29 * hashCode + email.hashCode();
        if (this.phoneNumber != null)
            hashCode = 29 * hashCode + phoneNumber.hashCode();
        hashCode = 29 * hashCode + (new Short(userType)).hashCode();
        if (this.headPortraitUrl != null)
            hashCode = 29 * hashCode + headPortraitUrl.hashCode();
        if (this.registerTime != null)
            hashCode = 29 * hashCode + registerTime.hashCode();
        return hashCode;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.AppUser: ");
        ret.append("userId='" + userId + "'");
        ret.append("userName='" + userName + "'");
        ret.append("password='" + password + "'");
        ret.append("email='" + email + "'");
        ret.append("phoneNumber='" + phoneNumber + "'");
        ret.append("userType='" + userType + "'");
        ret.append("headPortraitUrl='" + headPortraitUrl + "'");
        ret.append("registerTime='" + registerTime + "'");
        return ret.toString();
    }


    /**
     * @pdGenerated default getter
     */
    public List<Commodity> getCommodity() {
        if (commodity == null)
            commodity = new java.util.ArrayList<Commodity>();
        return commodity;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorCommodity() {
        if (commodity == null)
            commodity = new java.util.ArrayList<Commodity>();
        return commodity.iterator();
    }

    /**
     * @param newCommodity
     * @pdGenerated default setter
     */
    public void setCommodity(List<Commodity> newCommodity) {
        //removeAllCommodity();
        this.commodity = newCommodity;
    }

    /**
     * @param newCommodity
     * @pdGenerated default add
     */
    public void addCommodity(Commodity newCommodity) {
        if (newCommodity == null)
            return;
        if (this.commodity == null)
            this.commodity = new java.util.ArrayList<Commodity>();
        if (!this.commodity.contains(newCommodity)) {
            this.commodity.add(newCommodity);
            newCommodity.addShoppingCartUser(this);
        }
    }

    /**
     * @param oldCommodity
     * @pdGenerated default remove
     */
    public void removeCommodity(Commodity oldCommodity) {
        if (oldCommodity == null)
            return;
        if (this.commodity != null)
            if (this.commodity.contains(oldCommodity)) {
                this.commodity.remove(oldCommodity);
                oldCommodity.removeShoppingCartUser(this);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllCommodity() {
        if (commodity != null) {
            Commodity oldCommodity;
            for (java.util.Iterator iter = getIteratorCommodity(); iter.hasNext(); ) {
                oldCommodity = (Commodity) iter.next();
                iter.remove();
                oldCommodity.removeShoppingCartUser(this);
            }
        }
    }

    /**
     * @pdGenerated default getter
     */
    public List<OrderForm> getOrderForm() {
        if (orderForm == null)
            orderForm = new java.util.ArrayList<OrderForm>();
        return orderForm;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorOrderForm() {
        if (orderForm == null)
            orderForm = new java.util.ArrayList<OrderForm>();
        return orderForm.iterator();
    }

    /**
     * @param newOrderForm
     * @pdGenerated default setter
     */
    public void setOrderForm(List<OrderForm> newOrderForm) {
        //removeAllOrderForm();
        this.orderForm = newOrderForm;
    }

    /**
     * @param newOrderForm
     * @pdGenerated default add
     */
    public void addOrderForm(OrderForm newOrderForm) {
        if (newOrderForm == null)
            return;
        if (this.orderForm == null)
            this.orderForm = new java.util.ArrayList<OrderForm>();
        if (!this.orderForm.contains(newOrderForm)) {
            this.orderForm.add(newOrderForm);
            newOrderForm.setAppUser(this);
        }
    }

    /**
     * @param oldOrderForm
     * @pdGenerated default remove
     */
    public void removeOrderForm(OrderForm oldOrderForm) {
        if (oldOrderForm == null)
            return;
        if (this.orderForm != null)
            if (this.orderForm.contains(oldOrderForm)) {
                this.orderForm.remove(oldOrderForm);
                oldOrderForm.setAppUser((AppUser) null);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllOrderForm() {
        if (orderForm != null) {
            OrderForm oldOrderForm;
            for (java.util.Iterator iter = getIteratorOrderForm(); iter.hasNext(); ) {
                oldOrderForm = (OrderForm) iter.next();
                iter.remove();
                oldOrderForm.setAppUser((AppUser) null);
            }
        }
    }

    /**
     * @pdGenerated default getter
     */
    public List<UserEvaluation> getUserEvaluation() {
        if (userEvaluation == null)
            userEvaluation = new java.util.ArrayList<UserEvaluation>();
        return userEvaluation;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorUserEvaluation() {
        if (userEvaluation == null)
            userEvaluation = new java.util.ArrayList<UserEvaluation>();
        return userEvaluation.iterator();
    }

    /**
     * @param newUserEvaluation
     * @pdGenerated default setter
     */
    public void setUserEvaluation(List<UserEvaluation> newUserEvaluation) {
        //removeAllUserEvaluation();
        this.userEvaluation = newUserEvaluation;
    }

    /**
     * @param newUserEvaluation
     * @pdGenerated default add
     */
    public void addUserEvaluation(UserEvaluation newUserEvaluation) {
        if (newUserEvaluation == null)
            return;
        if (this.userEvaluation == null)
            this.userEvaluation = new java.util.ArrayList<UserEvaluation>();
        if (!this.userEvaluation.contains(newUserEvaluation)) {
            this.userEvaluation.add(newUserEvaluation);
            newUserEvaluation.setAppUser(this);
        }
    }

    /**
     * @param oldUserEvaluation
     * @pdGenerated default remove
     */
    public void removeUserEvaluation(UserEvaluation oldUserEvaluation) {
        if (oldUserEvaluation == null)
            return;
        if (this.userEvaluation != null)
            if (this.userEvaluation.contains(oldUserEvaluation)) {
                this.userEvaluation.remove(oldUserEvaluation);
                oldUserEvaluation.setAppUser((AppUser) null);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllUserEvaluation() {
        if (userEvaluation != null) {
            UserEvaluation oldUserEvaluation;
            for (java.util.Iterator iter = getIteratorUserEvaluation(); iter.hasNext(); ) {
                oldUserEvaluation = (UserEvaluation) iter.next();
                iter.remove();
                oldUserEvaluation.setAppUser((AppUser) null);
            }
        }
    }

    /**
     * @pdGenerated default getter
     */
    public List<Message> getSendMessage() {
        if (sendMessage == null)
            sendMessage = new java.util.ArrayList<Message>();
        return sendMessage;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorSendMessage() {
        if (sendMessage == null)
            sendMessage = new java.util.ArrayList<Message>();
        return sendMessage.iterator();
    }

    /**
     * @param newSendMessage
     * @pdGenerated default setter
     */
    public void setSendMessage(List<Message> newSendMessage) {
        //removeAllSendMessage();
        this.sendMessage = newSendMessage;
    }

    /**
     * @param newMessage
     * @pdGenerated default add
     */
    public void addSendMessage(Message newMessage) {
        if (newMessage == null)
            return;
        if (this.sendMessage == null)
            this.sendMessage = new java.util.ArrayList<Message>();
        if (!this.sendMessage.contains(newMessage)) {
            this.sendMessage.add(newMessage);
            newMessage.setSendUser(this);
        }
    }

    /**
     * @param oldMessage
     * @pdGenerated default remove
     */
    public void removeSendMessage(Message oldMessage) {
        if (oldMessage == null)
            return;
        if (this.sendMessage != null)
            if (this.sendMessage.contains(oldMessage)) {
                this.sendMessage.remove(oldMessage);
                oldMessage.setSendUser((AppUser) null);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllSendMessage() {
        if (sendMessage != null) {
            Message oldMessage;
            for (java.util.Iterator iter = getIteratorSendMessage(); iter.hasNext(); ) {
                oldMessage = (Message) iter.next();
                iter.remove();
                oldMessage.setSendUser((AppUser) null);
            }
        }
    }

    /**
     * @pdGenerated default getter
     */
    public List<Message> getReceiveMessage() {
        if (receiveMessage == null)
            receiveMessage = new java.util.ArrayList<Message>();
        return receiveMessage;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorReceiveMessage() {
        if (receiveMessage == null)
            receiveMessage = new java.util.ArrayList<Message>();
        return receiveMessage.iterator();
    }

    /**
     * @param newReceiveMessage
     * @pdGenerated default setter
     */
    public void setReceiveMessage(List<Message> newReceiveMessage) {
        //removeAllReceiveMessage();
        this.receiveMessage = newReceiveMessage;
    }

    /**
     * @param newMessage
     * @pdGenerated default add
     */
    public void addReceiveMessage(Message newMessage) {
        if (newMessage == null)
            return;
        if (this.receiveMessage == null)
            this.receiveMessage = new java.util.ArrayList<Message>();
        if (!this.receiveMessage.contains(newMessage)) {
            this.receiveMessage.add(newMessage);
            newMessage.setReceiveUser(this);
        }
    }

    /**
     * @param oldMessage
     * @pdGenerated default remove
     */
    public void removeReceiveMessage(Message oldMessage) {
        if (oldMessage == null)
            return;
        if (this.receiveMessage != null)
            if (this.receiveMessage.contains(oldMessage)) {
                this.receiveMessage.remove(oldMessage);
                oldMessage.setReceiveUser((AppUser) null);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllReceiveMessage() {
        if (receiveMessage != null) {
            Message oldMessage;
            for (java.util.Iterator iter = getIteratorReceiveMessage(); iter.hasNext(); ) {
                oldMessage = (Message) iter.next();
                iter.remove();
                oldMessage.setReceiveUser((AppUser) null);
            }
        }
    }

    /**
     * @pdGenerated default getter
     */
    public List<Commodity> getFavoriteCommodity() {
        if (favoriteCommodity == null)
            favoriteCommodity = new java.util.ArrayList<Commodity>();
        return favoriteCommodity;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorFavoriteCommodity() {
        if (favoriteCommodity == null)
            favoriteCommodity = new java.util.ArrayList<Commodity>();
        return favoriteCommodity.iterator();
    }

    /**
     * @param newFavoriteCommodity
     * @pdGenerated default setter
     */
    public void setFavoriteCommodity(List<Commodity> newFavoriteCommodity) {
        //removeAllFavoriteCommodity();
        this.favoriteCommodity = newFavoriteCommodity;
    }

    /**
     * @param newCommodity
     * @pdGenerated default add
     */
    public void addFavoriteCommodity(Commodity newCommodity) {
        if (newCommodity == null)
            return;
        if (this.favoriteCommodity == null)
            this.favoriteCommodity = new java.util.ArrayList<Commodity>();
        if (!this.favoriteCommodity.contains(newCommodity)) {
            this.favoriteCommodity.add(newCommodity);
            newCommodity.addFavoriteUser(this);
        }
    }

    /**
     * @param oldCommodity
     * @pdGenerated default remove
     */
    public void removeFavoriteCommodity(Commodity oldCommodity) {
        if (oldCommodity == null)
            return;
        if (this.favoriteCommodity != null)
            if (this.favoriteCommodity.contains(oldCommodity)) {
                this.favoriteCommodity.remove(oldCommodity);
                oldCommodity.removeFavoriteUser(this);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllFavoriteCommodity() {
        if (favoriteCommodity != null) {
            Commodity oldCommodity;
            for (java.util.Iterator iter = getIteratorFavoriteCommodity(); iter.hasNext(); ) {
                oldCommodity = (Commodity) iter.next();
                iter.remove();
                oldCommodity.removeFavoriteUser(this);
            }
        }
    }

    /**
     * @pdGenerated default parent getter
     */
    public Shop getManagedShop() {
        return managedShop;
    }

    /**
     * @param newShop
     * @pdGenerated default parent setter
     */
    public void setManagedShop(Shop newShop) {
        if (this.managedShop == null || !this.managedShop.equals(newShop)) {
            if (this.managedShop != null) {
                Shop oldShop = this.managedShop;
                this.managedShop = null;
                //oldShop.removeShopManager(this);
            }
            if (newShop != null) {
                this.managedShop = newShop;
                //this.managedShop.addShopManager(this);
            }
        }
    }

    /**
     * Empty constructor which is required by Hibernate
     */
    public AppUser() {
    }

}