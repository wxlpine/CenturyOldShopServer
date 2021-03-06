/***********************************************************************
 * Module:  Commodity.java
 * Author:  cmicat
 * Purpose: Defines the Class Commodity
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.List;

/**
 * @pdOid c995e142-478e-4f20-a0d6-3937cb393cd1
 */
public class Commodity implements java.io.Serializable {

    private long commodityId;
    private String commodityName;
    private String smallPhotoUrl;
    private String shortDescription;
    private double price;
    private int salesVolume;
    private boolean exemptionFromPostage;
    private java.util.Date addedTime;
    private String phoneTopBigPhotoUrl;
    private boolean offShelf;
    private int remainingQuantity;
    private String detailedIntroUrl;

    private Shop shop;

    /**
     * @pdRoleInfo migr=no name=AppUser assc=favorite coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<AppUser> favoriteUser;
    /**
     * @pdRoleInfo migr=no name=UserEvaluation assc=userEvaluation coll=java.util.List impl=java.util.ArrayList mult=0..* type=Composition
     */
    private List<UserEvaluation> userEvaluation;
    /**
     * @pdRoleInfo migr=no name=OrderForm assc=orderFormCommodity coll=java.util.List impl=java.util.ArrayList mult=1..* side=A
     */
    private List<OrderForm> orderForm;
    /**
     * @pdRoleInfo migr=no name=AppUser assc=shoppingCart coll=java.util.List impl=java.util.ArrayList mult=0..* side=A
     */
    private List<AppUser> shoppingCartUser;
    /**
     * @pdRoleInfo migr=no name=DiscountInfo assc=commodityDiscountInfo coll=java.util.List mult=1..* side=A
     */
    private List<DiscountInfo> discountInfo;
    /**
     * @pdRoleInfo migr=no name=CommodityType assc=commodityCommodityType mult=1..1 side=A
     */
    private CommodityType commodityType;


    /**
     * Empty constructor which is required by Hibernate
     */
    public Commodity() {
    }

    //<editor-fold name="accessor">

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop newShop) {
        if (this.shop == null || !this.shop.equals(newShop)) {
            if (this.shop != null) {
                Shop oldShop = this.shop;
                this.shop = null;
//                oldCommodityType.removeCommodity(this);
            }
            if (newShop != null) {
                this.shop = newShop;
//                this.commodityType.addCommodity(this);
            }
        }
    }

    public long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(long newCommodityId) {
        this.commodityId = newCommodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String newCommodityName) {
        this.commodityName = newCommodityName;
    }

    public String getSmallPhotoUrl() {
        return smallPhotoUrl;
    }

    public void setSmallPhotoUrl(String newSmallPhotoUrl) {
        this.smallPhotoUrl = newSmallPhotoUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String newShortDescription) {
        this.shortDescription = newShortDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public int getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(int newSalesVolume) {
        this.salesVolume = newSalesVolume;
    }

    public java.util.Date getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(java.util.Date newAddedTime) {
        this.addedTime = newAddedTime;
    }

    public String getPhoneTopBigPhotoUrl() {
        return phoneTopBigPhotoUrl;
    }

    public void setPhoneTopBigPhotoUrl(String newPhoneTopBigPhotoUrl) {
        this.phoneTopBigPhotoUrl = newPhoneTopBigPhotoUrl;
    }

    public int getRemainingQuantity() {
        return remainingQuantity;
    }

    public void setRemainingQuantity(int newRemainingQuantity) {
        this.remainingQuantity = newRemainingQuantity;
    }

    /**
     * Get value of commodityPK.
     *
     * @return commodityPK object
     */
    public CommodityPK getCommodityPK() {
        return new CommodityPK(commodityId);
    }

    /**
     * Set value of commodityPK.
     */
    public void setCommodityPK(CommodityPK pk) {
        if (pk != null) {
            this.commodityId = pk.getCommodityId();
        }
    }

    public List<AppUser> getFavoriteUser() {
        if (favoriteUser == null)
            favoriteUser = new java.util.ArrayList<AppUser>();
        return favoriteUser;
    }

    public java.util.Iterator getIteratorFavoriteUser() {
        if (favoriteUser == null)
            favoriteUser = new java.util.ArrayList<AppUser>();
        return favoriteUser.iterator();
    }

    public void setFavoriteUser(List<AppUser> newFavoriteUser) {
        //removeAllFavoriteUser();
        this.favoriteUser = newFavoriteUser;
    }

    public void addFavoriteUser(AppUser newAppUser) {
        if (newAppUser == null)
            return;
        if (this.favoriteUser == null)
            this.favoriteUser = new java.util.ArrayList<AppUser>();
        if (!this.favoriteUser.contains(newAppUser)) {
            this.favoriteUser.add(newAppUser);
            newAppUser.addFavoriteCommodity(this);
        }
    }

    public void removeFavoriteUser(AppUser oldAppUser) {
        if (oldAppUser == null)
            return;
        if (this.favoriteUser != null)
            if (this.favoriteUser.contains(oldAppUser)) {
                this.favoriteUser.remove(oldAppUser);
                oldAppUser.removeFavoriteCommodity(this);
            }
    }

    public void removeAllFavoriteUser() {
        if (favoriteUser != null) {
            AppUser oldAppUser;
            for (java.util.Iterator iter = getIteratorFavoriteUser(); iter.hasNext(); ) {
                oldAppUser = (AppUser) iter.next();
                iter.remove();
                oldAppUser.removeFavoriteCommodity(this);
            }
        }
    }

    public List<UserEvaluation> getUserEvaluation() {
        if (userEvaluation == null)
            userEvaluation = new java.util.ArrayList<UserEvaluation>();
        return userEvaluation;
    }

    public java.util.Iterator getIteratorUserEvaluation() {
        if (userEvaluation == null)
            userEvaluation = new java.util.ArrayList<UserEvaluation>();
        return userEvaluation.iterator();
    }

    public void setUserEvaluation(List<UserEvaluation> newUserEvaluation) {
        //removeAllUserEvaluation();
        this.userEvaluation = newUserEvaluation;
    }

    public void addUserEvaluation(UserEvaluation newUserEvaluation) {
        if (newUserEvaluation == null)
            return;
        if (this.userEvaluation == null)
            this.userEvaluation = new java.util.ArrayList<UserEvaluation>();
        if (!this.userEvaluation.contains(newUserEvaluation)) {
            this.userEvaluation.add(newUserEvaluation);
            newUserEvaluation.setCommodity(this);
        }
    }

    public void removeUserEvaluation(UserEvaluation oldUserEvaluation) {
        if (oldUserEvaluation == null)
            return;
        if (this.userEvaluation != null)
            if (this.userEvaluation.contains(oldUserEvaluation)) {
                this.userEvaluation.remove(oldUserEvaluation);
                oldUserEvaluation.setCommodity((Commodity) null);
            }
    }

    public void removeAllUserEvaluation() {
        if (userEvaluation != null) {
            UserEvaluation oldUserEvaluation;
            for (java.util.Iterator iter = getIteratorUserEvaluation(); iter.hasNext(); ) {
                oldUserEvaluation = (UserEvaluation) iter.next();
                iter.remove();
                oldUserEvaluation.setCommodity((Commodity) null);
            }
        }
    }

    public List<OrderForm> getOrderForm() {
        if (orderForm == null)
            orderForm = new java.util.ArrayList<OrderForm>();
        return orderForm;
    }

    public java.util.Iterator getIteratorOrderForm() {
        if (orderForm == null)
            orderForm = new java.util.ArrayList<OrderForm>();
        return orderForm.iterator();
    }

    public void setOrderForm(List<OrderForm> newOrderForm) {
        //removeAllOrderForm();
        this.orderForm = newOrderForm;
    }

    public void addOrderForm(OrderForm newOrderForm) {
        if (newOrderForm == null)
            return;
        if (this.orderForm == null)
            this.orderForm = new java.util.ArrayList<OrderForm>();
        if (!this.orderForm.contains(newOrderForm)) {
            this.orderForm.add(newOrderForm);
            newOrderForm.addCommodity(this);
        }
    }

    public void removeOrderForm(OrderForm oldOrderForm) {
        if (oldOrderForm == null)
            return;
        if (this.orderForm != null)
            if (this.orderForm.contains(oldOrderForm)) {
                this.orderForm.remove(oldOrderForm);
                oldOrderForm.removeCommodity(this);
            }
    }

    public void removeAllOrderForm() {
        if (orderForm != null) {
            OrderForm oldOrderForm;
            for (java.util.Iterator iter = getIteratorOrderForm(); iter.hasNext(); ) {
                oldOrderForm = (OrderForm) iter.next();
                iter.remove();
                oldOrderForm.removeCommodity(this);
            }
        }
    }

    public List<AppUser> getShoppingCartUser() {
        if (shoppingCartUser == null)
            shoppingCartUser = new java.util.ArrayList<AppUser>();
        return shoppingCartUser;
    }

    public java.util.Iterator getIteratorShoppingCartUser() {
        if (shoppingCartUser == null)
            shoppingCartUser = new java.util.ArrayList<AppUser>();
        return shoppingCartUser.iterator();
    }

    public void setShoppingCartUser(List<AppUser> newShoppingCartUser) {
        //removeAllShoppingCartUser();
        this.shoppingCartUser = newShoppingCartUser;
    }

    public void addShoppingCartUser(AppUser newAppUser) {
        if (newAppUser == null)
            return;
        if (this.shoppingCartUser == null)
            this.shoppingCartUser = new java.util.ArrayList<AppUser>();
        if (!this.shoppingCartUser.contains(newAppUser)) {
            this.shoppingCartUser.add(newAppUser);
            newAppUser.addCommodity(this);
        }
    }

    public void removeShoppingCartUser(AppUser oldAppUser) {
        if (oldAppUser == null)
            return;
        if (this.shoppingCartUser != null)
            if (this.shoppingCartUser.contains(oldAppUser)) {
                this.shoppingCartUser.remove(oldAppUser);
                oldAppUser.removeCommodity(this);
            }
    }

    public void removeAllShoppingCartUser() {
        if (shoppingCartUser != null) {
            AppUser oldAppUser;
            for (java.util.Iterator iter = getIteratorShoppingCartUser(); iter.hasNext(); ) {
                oldAppUser = (AppUser) iter.next();
                iter.remove();
                oldAppUser.removeCommodity(this);
            }
        }
    }

    /**
     * @pdGenerated default getter
     */
    public List<DiscountInfo> getDiscountInfo() {
        if (discountInfo == null)
            discountInfo = new java.util.Vector<DiscountInfo>();
        return discountInfo;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorDiscountInfo() {
        if (discountInfo == null)
            discountInfo = new java.util.Vector<DiscountInfo>();
        return discountInfo.iterator();
    }

    /**

     * @pdGenerated default setter
     */
    public void setDiscountInfo(List<DiscountInfo> newDiscountInfo) {
        //removeAllDiscountInfo();
        this.discountInfo = newDiscountInfo;
    }

    /**

     * @pdGenerated default add
     */
    public void addDiscountInfo(DiscountInfo newDiscountInfo) {
        if (newDiscountInfo == null)
            return;
        if (this.discountInfo == null)
            this.discountInfo = new java.util.Vector<DiscountInfo>();
        if (!this.discountInfo.contains(newDiscountInfo)) {
            this.discountInfo.add(newDiscountInfo);
            newDiscountInfo.addCommodity(this);
        }
    }

    /**

     * @pdGenerated default remove
     */
    public void removeDiscountInfo(DiscountInfo oldDiscountInfo) {
        if (oldDiscountInfo == null)
            return;
        if (this.discountInfo != null)
            if (this.discountInfo.contains(oldDiscountInfo)) {
                this.discountInfo.remove(oldDiscountInfo);
                oldDiscountInfo.removeCommodity(this);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllDiscountInfo() {
        if (discountInfo != null) {
            DiscountInfo oldDiscountInfo;
            for (java.util.Iterator iter = getIteratorDiscountInfo(); iter.hasNext(); ) {
                oldDiscountInfo = (DiscountInfo) iter.next();
                iter.remove();
                oldDiscountInfo.removeCommodity(this);
            }
        }
    }

    /**
     * @pdGenerated default parent getter
     */
    public CommodityType getCommodityType() {
        return commodityType;
    }

    /**

     * @pdGenerated default parent setter
     */
    public void setCommodityType(CommodityType newCommodityType) {
        if (this.commodityType == null || !this.commodityType.equals(newCommodityType)) {
            if (this.commodityType != null) {
                CommodityType oldCommodityType = this.commodityType;
                this.commodityType = null;
                //oldCommodityType.removeCommodity(this);
            }
            if (newCommodityType != null) {
                this.commodityType = newCommodityType;
//                this.commodityType.addCommodity(this);
            }
        }
    }

    public boolean isExemptionFromPostage() {
        return exemptionFromPostage;
    }

    public Commodity setExemptionFromPostage(boolean exemptionFromPostage) {
        this.exemptionFromPostage = exemptionFromPostage;
        return this;
    }

    public boolean isOffShelf() {
        return offShelf;
    }

    public Commodity setOffShelf(boolean offShelf) {
        this.offShelf = offShelf;
        return this;
    }

    public String getDetailedIntroUrl() {
        return detailedIntroUrl;
    }

    public Commodity setDetailedIntroUrl(String detailedIntroUrl) {
        this.detailedIntroUrl = detailedIntroUrl;
        return this;
    }

    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public String toString() {
        return "Commodity{" +
                "commodityId=" + commodityId +
                ", commodityName='" + commodityName + '\'' +
                ", smallPhotoUrl='" + smallPhotoUrl + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", price=" + price +
                ", salesVolume=" + salesVolume +
                ", exemptionFromPostage=" + exemptionFromPostage +
                ", addedTime=" + addedTime +
                ", phoneTopBigPhotoUrl='" + phoneTopBigPhotoUrl + '\'' +
                ", offShelf=" + offShelf +
                ", remainingQuantity=" + remainingQuantity +
                ", commodityType=" + commodityType +
                ", shop=" + shop +
                '}';
    }

    //</editor-fold>


}