/***********************************************************************
 * Module:  Commodity.java
 * Author:  cmicat
 * Purpose: Defines the Class Commodity
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * @pdOid c995e142-478e-4f20-a0d6-3937cb393cd1
 */
public class Commodity implements java.io.Serializable {
    /**
     * @pdOid 4270790d-bb28-42b8-9085-303cff9b5447
     */
    private long commodityId;
    /**
     * @pdOid 7411227a-a645-4ef3-9b51-7c769752cab2
     */
    private java.lang.String commodityName;
    /**
     * @pdOid 5939b7d4-4f6c-4906-a82a-0dac489a78f6
     */
    private java.lang.String smallPhotoUrl;
    /**
     * @pdOid 97974dbd-17c0-440c-b9d5-2ffaf7c3387a
     */
    private java.lang.String shortDescription;
    /**
     * @pdOid 77573462-05d7-4fba-8590-0bfdfeef469d
     */
    private double price;
    /**
     * @pdOid b988f77a-72db-4840-80cd-57f8a4dc8afb
     */
    private int salesVolume;
    /**
     * @pdOid 1082b4a4-8ccd-45e1-aaf0-5f0fb133c2c1
     */
    private boolean exemptionFromPostage;
    /**
     * @pdOid c41ab30f-f0eb-46f4-a124-54d2bbaa1af2
     */
    private java.util.Date addedTime;
    /**
     * @pdOid c04a32c3-37ad-49f3-aa93-f85ca49294cd
     */
    private java.lang.String phoneTopBigPhotoUrl;
    /**
     * @pdOid 022d24d0-4725-47bc-8d19-f9fa7836cb37
     */
    private boolean offShelf;
    /**
     * @pdOid 91fd5327-7ee1-42d5-97d0-74fd4fc2592f
     */
    private int remainingQuantity;

    /**
     * @pdRoleInfo migr=no name=AppUser assc=favorite coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private java.util.List<AppUser> favoriteUser;
    /**
     * @pdRoleInfo migr=no name=UserEvaluation assc=userEvaluation coll=java.util.List impl=java.util.ArrayList mult=0..* type=Composition
     */
    private java.util.List<UserEvaluation> userEvaluation;
    /**
     * @pdRoleInfo migr=no name=OrderForm assc=orderFormCommodity coll=java.util.List impl=java.util.ArrayList mult=1..* side=A
     */
    private java.util.List<OrderForm> orderForm;
    /**
     * @pdRoleInfo migr=no name=AppUser assc=shoppingCart coll=java.util.List impl=java.util.ArrayList mult=0..* side=A
     */
    private java.util.List<AppUser> shoppingCartUser;
    /**
     * @pdRoleInfo migr=no name=DiscountInfo assc=commodityDiscountInfo coll=java.util.List mult=1..* side=A
     */
    private java.util.List<DiscountInfo> discountInfo;
    /**
     * @pdRoleInfo migr=no name=CommodityType assc=commodityCommodityType mult=1..1 side=A
     */
    private CommodityType commodityType;

    /**
     * Get value of commodityId
     *
     * @return commodityId
     */
    public long getCommodityId() {
        return commodityId;
    }

    /**
     * Set value of commodityId
     *
     * @param newCommodityId
     */
    public void setCommodityId(long newCommodityId) {
        this.commodityId = newCommodityId;
    }

    /**
     * Get value of commodityName
     *
     * @return commodityName
     */
    public java.lang.String getCommodityName() {
        return commodityName;
    }

    /**
     * Set value of commodityName
     *
     * @param newCommodityName
     */
    public void setCommodityName(java.lang.String newCommodityName) {
        this.commodityName = newCommodityName;
    }

    /**
     * Get value of smallPhotoUrl
     *
     * @return smallPhotoUrl
     */
    public java.lang.String getSmallPhotoUrl() {
        return smallPhotoUrl;
    }

    /**
     * Set value of smallPhotoUrl
     *
     * @param newSmallPhotoUrl
     */
    public void setSmallPhotoUrl(java.lang.String newSmallPhotoUrl) {
        this.smallPhotoUrl = newSmallPhotoUrl;
    }

    /**
     * Get value of shortDescription
     *
     * @return shortDescription
     */
    public java.lang.String getShortDescription() {
        return shortDescription;
    }

    /**
     * Set value of shortDescription
     *
     * @param newShortDescription
     */
    public void setShortDescription(java.lang.String newShortDescription) {
        this.shortDescription = newShortDescription;
    }

    /**
     * Get value of price
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set value of price
     *
     * @param newPrice
     */
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    /**
     * Get value of salesVolume
     *
     * @return salesVolume
     */
    public int getSalesVolume() {
        return salesVolume;
    }

    /**
     * Set value of salesVolume
     *
     * @param newSalesVolume
     */
    public void setSalesVolume(int newSalesVolume) {
        this.salesVolume = newSalesVolume;
    }

    /**
     * Get value of exemptionFromPostage
     *
     * @return exemptionFromPostage
     */
    public boolean getExemptionFromPostage() {
        return exemptionFromPostage;
    }

    /**
     * Set value of exemptionFromPostage
     *
     * @param newExemptionFromPostage
     */
    public void setExemptionFromPostage(boolean newExemptionFromPostage) {
        this.exemptionFromPostage = newExemptionFromPostage;
    }

    /**
     * Get value of addedTime
     *
     * @return addedTime
     */
    public java.util.Date getAddedTime() {
        return addedTime;
    }

    /**
     * Set value of addedTime
     *
     * @param newAddedTime
     */
    public void setAddedTime(java.util.Date newAddedTime) {
        this.addedTime = newAddedTime;
    }

    /**
     * Get value of phoneTopBigPhotoUrl
     *
     * @return phoneTopBigPhotoUrl
     */
    public java.lang.String getPhoneTopBigPhotoUrl() {
        return phoneTopBigPhotoUrl;
    }

    /**
     * Set value of phoneTopBigPhotoUrl
     *
     * @param newPhoneTopBigPhotoUrl
     */
    public void setPhoneTopBigPhotoUrl(java.lang.String newPhoneTopBigPhotoUrl) {
        this.phoneTopBigPhotoUrl = newPhoneTopBigPhotoUrl;
    }

    /**
     * Get value of offShelf
     *
     * @return offShelf
     */
    public boolean getOffShelf() {
        return offShelf;
    }

    /**
     * Set value of offShelf
     *
     * @param newOffShelf
     */
    public void setOffShelf(boolean newOffShelf) {
        this.offShelf = newOffShelf;
    }

    /**
     * Get value of remainingQuantity
     *
     * @return remainingQuantity
     */
    public int getRemainingQuantity() {
        return remainingQuantity;
    }

    /**
     * Set value of remainingQuantity
     *
     * @param newRemainingQuantity
     */
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
     *
     * @param pk
     */
    public void setCommodityPK(CommodityPK pk) {
        if (pk != null) {
            this.commodityId = pk.getCommodityId();
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

        if (!(other instanceof Commodity))
            return false;

        Commodity cast = (Commodity) other;

        if (this.commodityId != cast.getCommodityId())
            return false;

        if (this.commodityName == null ? cast.getCommodityName() != this.commodityName : !this.commodityName.equals(cast.getCommodityName()))
            return false;

        if (this.smallPhotoUrl == null ? cast.getSmallPhotoUrl() != this.smallPhotoUrl : !this.smallPhotoUrl.equals(cast.getSmallPhotoUrl()))
            return false;

        if (this.shortDescription == null ? cast.getShortDescription() != this.shortDescription : !this.shortDescription.equals(cast.getShortDescription()))
            return false;

        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(cast.getPrice()))
            return false;

        if (this.salesVolume != cast.getSalesVolume())
            return false;

        if (this.exemptionFromPostage != cast.getExemptionFromPostage())
            return false;

        if (this.addedTime == null ? cast.getAddedTime() != this.addedTime : !(com.sybase.orm.util.Util.compareDate(this.addedTime, cast.getAddedTime(), java.util.Calendar.SECOND) == 0))
            return false;

        if (this.phoneTopBigPhotoUrl == null ? cast.getPhoneTopBigPhotoUrl() != this.phoneTopBigPhotoUrl : !this.phoneTopBigPhotoUrl.equals(cast.getPhoneTopBigPhotoUrl()))
            return false;

        if (this.offShelf != cast.getOffShelf())
            return false;

        if (this.remainingQuantity != cast.getRemainingQuantity())
            return false;

        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int hashCode = 0;
        hashCode = 29 * hashCode + (new Long(commodityId)).hashCode();
        if (this.commodityName != null)
            hashCode = 29 * hashCode + commodityName.hashCode();
        if (this.smallPhotoUrl != null)
            hashCode = 29 * hashCode + smallPhotoUrl.hashCode();
        if (this.shortDescription != null)
            hashCode = 29 * hashCode + shortDescription.hashCode();
        hashCode = 29 * hashCode + (new Double(price)).hashCode();
        hashCode = 29 * hashCode + (new Integer(salesVolume)).hashCode();
        hashCode = 29 * hashCode + (new Boolean(exemptionFromPostage)).hashCode();
        if (this.addedTime != null)
            hashCode = 29 * hashCode + addedTime.hashCode();
        if (this.phoneTopBigPhotoUrl != null)
            hashCode = 29 * hashCode + phoneTopBigPhotoUrl.hashCode();
        hashCode = 29 * hashCode + (new Boolean(offShelf)).hashCode();
        hashCode = 29 * hashCode + (new Integer(remainingQuantity)).hashCode();
        return hashCode;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.Commodity: ");
        ret.append("commodityId='" + commodityId + "'");
        ret.append("commodityName='" + commodityName + "'");
        ret.append("smallPhotoUrl='" + smallPhotoUrl + "'");
        ret.append("shortDescription='" + shortDescription + "'");
        ret.append("price='" + price + "'");
        ret.append("salesVolume='" + salesVolume + "'");
        ret.append("exemptionFromPostage='" + exemptionFromPostage + "'");
        ret.append("addedTime='" + addedTime + "'");
        ret.append("phoneTopBigPhotoUrl='" + phoneTopBigPhotoUrl + "'");
        ret.append("offShelf='" + offShelf + "'");
        ret.append("remainingQuantity='" + remainingQuantity + "'");
        return ret.toString();
    }


    /**
     * @pdGenerated default getter
     */
    public java.util.List<AppUser> getFavoriteUser() {
        if (favoriteUser == null)
            favoriteUser = new java.util.ArrayList<AppUser>();
        return favoriteUser;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorFavoriteUser() {
        if (favoriteUser == null)
            favoriteUser = new java.util.ArrayList<AppUser>();
        return favoriteUser.iterator();
    }

    /**
     * @param newFavoriteUser
     * @pdGenerated default setter
     */
    public void setFavoriteUser(java.util.List<AppUser> newFavoriteUser) {
        //removeAllFavoriteUser();
        this.favoriteUser = newFavoriteUser;
    }

    /**
     * @param newAppUser
     * @pdGenerated default add
     */
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

    /**
     * @param oldAppUser
     * @pdGenerated default remove
     */
    public void removeFavoriteUser(AppUser oldAppUser) {
        if (oldAppUser == null)
            return;
        if (this.favoriteUser != null)
            if (this.favoriteUser.contains(oldAppUser)) {
                this.favoriteUser.remove(oldAppUser);
                oldAppUser.removeFavoriteCommodity(this);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
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

    /**
     * @pdGenerated default getter
     */
    public java.util.List<UserEvaluation> getUserEvaluation() {
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
    public void setUserEvaluation(java.util.List<UserEvaluation> newUserEvaluation) {
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
            newUserEvaluation.setCommodity(this);
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
                oldUserEvaluation.setCommodity((Commodity) null);
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
                oldUserEvaluation.setCommodity((Commodity) null);
            }
        }
    }

    /**
     * @pdGenerated default getter
     */
    public java.util.List<OrderForm> getOrderForm() {
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
    public void setOrderForm(java.util.List<OrderForm> newOrderForm) {
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
            newOrderForm.addCommodity(this);
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
                oldOrderForm.removeCommodity(this);
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
                oldOrderForm.removeCommodity(this);
            }
        }
    }

    /**
     * @pdGenerated default getter
     */
    public java.util.List<AppUser> getShoppingCartUser() {
        if (shoppingCartUser == null)
            shoppingCartUser = new java.util.ArrayList<AppUser>();
        return shoppingCartUser;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorShoppingCartUser() {
        if (shoppingCartUser == null)
            shoppingCartUser = new java.util.ArrayList<AppUser>();
        return shoppingCartUser.iterator();
    }

    /**
     * @param newShoppingCartUser
     * @pdGenerated default setter
     */
    public void setShoppingCartUser(java.util.List<AppUser> newShoppingCartUser) {
        //removeAllShoppingCartUser();
        this.shoppingCartUser = newShoppingCartUser;
    }

    /**
     * @param newAppUser
     * @pdGenerated default add
     */
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

    /**
     * @param oldAppUser
     * @pdGenerated default remove
     */
    public void removeShoppingCartUser(AppUser oldAppUser) {
        if (oldAppUser == null)
            return;
        if (this.shoppingCartUser != null)
            if (this.shoppingCartUser.contains(oldAppUser)) {
                this.shoppingCartUser.remove(oldAppUser);
                oldAppUser.removeCommodity(this);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
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
    public java.util.List<DiscountInfo> getDiscountInfo() {
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
     * @param newDiscountInfo
     * @pdGenerated default setter
     */
    public void setDiscountInfo(java.util.List<DiscountInfo> newDiscountInfo) {
        //removeAllDiscountInfo();
        this.discountInfo = newDiscountInfo;
    }

    /**
     * @param newDiscountInfo
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
     * @param oldDiscountInfo
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
     * @param newCommodityType
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
                //this.commodityType.addCommodity(this);
            }
        }
    }

    /**
     * Empty constructor which is required by Hibernate
     */
    public Commodity() {
    }

}