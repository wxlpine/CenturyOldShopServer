/***********************************************************************
 * Module:  Shop.java
 * Author:  cmicat
 * Purpose: Defines the Class Shop
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.List;

/**
 * @pdOid 2fe8d93d-8619-4e37-81d6-d3866f60f343
 */
public class Shop implements java.io.Serializable {
    /**
     * @pdOid d7d4744a-2b76-4a9c-88e9-2600741a34d4
     */
    private long shopId;
    /**
     * @pdOid 46021f37-5027-45ec-9d6e-cb039f683294
     */
    private String shopName;
    /**
     * @pdOid 2c58e478-b314-4dbe-a1e7-a7fe7de879fe
     */
    private String shortDescription;
    /**
     * @pdOid f5cc50f7-ec5d-404e-8d3a-85f0c5f04262
     */
    private java.util.Date openABusinessTime;
    /**
     * @pdOid 1399a7f7-3373-475d-9be1-f6e669629815
     */
    private int visitCount;
    /**
     * @pdOid 17569ca3-4b27-40e8-99ae-c4944e9b5b41
     */
    private String detailedAddress;
    /**
     * @pdOid 09c6d3ff-0679-4c9f-90ed-bf651f93f393
     */
    private String trademark;
    /**
     * 入驻时间
     *
     * @pdOid 09b70fc6-563b-4385-9599-072ef6831ef6
     */
    private java.util.Date enterTime;
    /**
     * @pdOid 08bf0740-6305-48b1-83d6-b07b276e196b
     */
    private String phoneNumber;
    /**
     * @pdOid 44e72b83-21ad-4fc3-a246-2e61b10d3a52
     */
    private String fax;
    /**
     * @pdOid a0b0d1e2-7e2f-45f7-a5b7-6d227b4d0d1f
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
    private List<AppUser> shopManager;
    /**
     * @pdRoleInfo migr=no name=ShopType assc=shopShopType mult=1..1 side=A
     */
    private ShopType shopType;
    /**
     * @pdRoleInfo migr=no name=ShopArea assc=shopShopArea mult=1..1 side=A
     */
    private ShopArea shopArea;

    /**
     * Get value of shopId
     *
     * @return shopId
     */
    public long getShopId() {
        return shopId;
    }

    /**
     * Set value of shopId
     *
     * @param newShopId
     */
    public void setShopId(long newShopId) {
        this.shopId = newShopId;
    }

    /**
     * Get value of shopName
     *
     * @return shopName
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * Set value of shopName
     *
     * @param newShopName
     */
    public void setShopName(String newShopName) {
        this.shopName = newShopName;
    }

    /**
     * Get value of shortDescription
     *
     * @return shortDescription
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Set value of shortDescription
     *
     * @param newShortDescription
     */
    public void setShortDescription(String newShortDescription) {
        this.shortDescription = newShortDescription;
    }

    /**
     * Get value of openABusinessTime
     *
     * @return openABusinessTime
     */
    public java.util.Date getOpenABusinessTime() {
        return openABusinessTime;
    }

    /**
     * Set value of openABusinessTime
     *
     * @param newOpenABusinessTime
     */
    public void setOpenABusinessTime(java.util.Date newOpenABusinessTime) {
        this.openABusinessTime = newOpenABusinessTime;
    }

    /**
     * Get value of visitCount
     *
     * @return visitCount
     */
    public int getVisitCount() {
        return visitCount;
    }

    /**
     * Set value of visitCount
     *
     * @param newVisitCount
     */
    public void setVisitCount(int newVisitCount) {
        this.visitCount = newVisitCount;
    }

    /**
     * Get value of detailedAddress
     *
     * @return detailedAddress
     */
    public String getDetailedAddress() {
        return detailedAddress;
    }

    /**
     * Set value of detailedAddress
     *
     * @param newDetailedAddress
     */
    public void setDetailedAddress(String newDetailedAddress) {
        this.detailedAddress = newDetailedAddress;
    }

    /**
     * Get value of trademark
     *
     * @return trademark
     */
    public String getTrademark() {
        return trademark;
    }

    /**
     * Set value of trademark
     *
     * @param newTrademark
     */
    public void setTrademark(String newTrademark) {
        this.trademark = newTrademark;
    }

    /**
     * Get value of enterTime
     *
     * @return enterTime
     */
    public java.util.Date getEnterTime() {
        return enterTime;
    }

    /**
     * Set value of enterTime
     *
     * @param newEnterTime
     */
    public void setEnterTime(java.util.Date newEnterTime) {
        this.enterTime = newEnterTime;
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
     * Get value of fax
     *
     * @return fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * Set value of fax
     *
     * @param newFax
     */
    public void setFax(String newFax) {
        this.fax = newFax;
    }

    /**
     * Get value of longDescription
     *
     * @return longDescription
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Set value of longDescription
     *
     * @param newLongDescription
     */
    public void setLongDescription(String newLongDescription) {
        this.longDescription = newLongDescription;
    }

    /**
     * Get value of shopPK.
     *
     * @return shopPK object
     */
    public ShopPK getShopPK() {
        return new ShopPK(shopId);
    }

    /**
     * Set value of shopPK.
     *
     * @param pk
     */
    public void setShopPK(ShopPK pk) {
        if (pk != null) {
            this.shopId = pk.getShopId();
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

        if (!(other instanceof Shop))
            return false;

        Shop cast = (Shop) other;

        if (this.shopId != cast.getShopId())
            return false;

        if (this.shopName == null ? cast.getShopName() != this.shopName : !this.shopName.equals(cast.getShopName()))
            return false;

        if (this.shortDescription == null ? cast.getShortDescription() != this.shortDescription : !this.shortDescription.equals(cast.getShortDescription()))
            return false;

        if (this.openABusinessTime == null ? cast.getOpenABusinessTime() != this.openABusinessTime : !(com.sybase.orm.util.Util.compareDate(this.openABusinessTime, cast.getOpenABusinessTime(), java.util.Calendar.SECOND) == 0))
            return false;

        if (this.visitCount != cast.getVisitCount())
            return false;

        if (this.detailedAddress == null ? cast.getDetailedAddress() != this.detailedAddress : !this.detailedAddress.equals(cast.getDetailedAddress()))
            return false;

        if (this.trademark == null ? cast.getTrademark() != this.trademark : !this.trademark.equals(cast.getTrademark()))
            return false;

        if (this.enterTime == null ? cast.getEnterTime() != this.enterTime : !(com.sybase.orm.util.Util.compareDate(this.enterTime, cast.getEnterTime(), java.util.Calendar.SECOND) == 0))
            return false;

        if (this.phoneNumber == null ? cast.getPhoneNumber() != this.phoneNumber : !this.phoneNumber.equals(cast.getPhoneNumber()))
            return false;

        if (this.fax == null ? cast.getFax() != this.fax : !this.fax.equals(cast.getFax()))
            return false;

        if (this.longDescription == null ? cast.getLongDescription() != this.longDescription : !this.longDescription.equals(cast.getLongDescription()))
            return false;

        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int hashCode = 0;
        hashCode = 29 * hashCode + (new Long(shopId)).hashCode();
        if (this.shopName != null)
            hashCode = 29 * hashCode + shopName.hashCode();
        if (this.shortDescription != null)
            hashCode = 29 * hashCode + shortDescription.hashCode();
        if (this.openABusinessTime != null)
            hashCode = 29 * hashCode + openABusinessTime.hashCode();
        hashCode = 29 * hashCode + (new Integer(visitCount)).hashCode();
        if (this.detailedAddress != null)
            hashCode = 29 * hashCode + detailedAddress.hashCode();
        if (this.trademark != null)
            hashCode = 29 * hashCode + trademark.hashCode();
        if (this.enterTime != null)
            hashCode = 29 * hashCode + enterTime.hashCode();
        if (this.phoneNumber != null)
            hashCode = 29 * hashCode + phoneNumber.hashCode();
        if (this.fax != null)
            hashCode = 29 * hashCode + fax.hashCode();
        if (this.longDescription != null)
            hashCode = 29 * hashCode + longDescription.hashCode();
        return hashCode;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.Shop: ");
        ret.append("shopId='" + shopId + "'");
        ret.append("shopName='" + shopName + "'");
        ret.append("shortDescription='" + shortDescription + "'");
        ret.append("openABusinessTime='" + openABusinessTime + "'");
        ret.append("visitCount='" + visitCount + "'");
        ret.append("detailedAddress='" + detailedAddress + "'");
        ret.append("trademark='" + trademark + "'");
        ret.append("enterTime='" + enterTime + "'");
        ret.append("phoneNumber='" + phoneNumber + "'");
        ret.append("fax='" + fax + "'");
        ret.append("longDescription='" + longDescription + "'");
        return ret.toString();
    }


    /**
     * @pdGenerated default getter
     */
    public List<News> getNews() {
        if (news == null)
            news = new java.util.ArrayList<News>();
        return news;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorNews() {
        if (news == null)
            news = new java.util.ArrayList<News>();
        return news.iterator();
    }

    /**
     * @param newNews
     * @pdGenerated default setter
     */
    public void setNews(List<News> newNews) {
        //removeAllNews();
        this.news = newNews;
    }

    /**
     * @param newNews
     * @pdGenerated default add
     */
    public void addNews(News newNews) {
        if (newNews == null)
            return;
        if (this.news == null)
            this.news = new java.util.ArrayList<News>();
        if (!this.news.contains(newNews)) {
            this.news.add(newNews);
            newNews.setShop(this);
        }
    }

    /**
     * @param oldNews
     * @pdGenerated default remove
     */
    public void removeNews(News oldNews) {
        if (oldNews == null)
            return;
        if (this.news != null)
            if (this.news.contains(oldNews)) {
                this.news.remove(oldNews);
                oldNews.setShop((Shop) null);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllNews() {
        if (news != null) {
            News oldNews;
            for (java.util.Iterator iter = getIteratorNews(); iter.hasNext(); ) {
                oldNews = (News) iter.next();
                iter.remove();
                oldNews.setShop((Shop) null);
            }
        }
    }

    /**
     * @pdGenerated default getter
     */
    public List<ShopStory> getShopStory() {
        if (shopStory == null)
            shopStory = new java.util.ArrayList<ShopStory>();
        return shopStory;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorShopStory() {
        if (shopStory == null)
            shopStory = new java.util.ArrayList<ShopStory>();
        return shopStory.iterator();
    }

    /**
     * @param newShopStory
     * @pdGenerated default setter
     */
    public void setShopStory(List<ShopStory> newShopStory) {
        //removeAllShopStory();
        this.shopStory = newShopStory;
    }

    /**
     * @param newShopStory
     * @pdGenerated default add
     */
    public void addShopStory(ShopStory newShopStory) {
        if (newShopStory == null)
            return;
        if (this.shopStory == null)
            this.shopStory = new java.util.ArrayList<ShopStory>();
        if (!this.shopStory.contains(newShopStory)) {
            this.shopStory.add(newShopStory);
            newShopStory.setShop(this);
        }
    }

    /**
     * @param oldShopStory
     * @pdGenerated default remove
     */
    public void removeShopStory(ShopStory oldShopStory) {
        if (oldShopStory == null)
            return;
        if (this.shopStory != null)
            if (this.shopStory.contains(oldShopStory)) {
                this.shopStory.remove(oldShopStory);
                oldShopStory.setShop((Shop) null);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllShopStory() {
        if (shopStory != null) {
            ShopStory oldShopStory;
            for (java.util.Iterator iter = getIteratorShopStory(); iter.hasNext(); ) {
                oldShopStory = (ShopStory) iter.next();
                iter.remove();
                oldShopStory.setShop((Shop) null);
            }
        }
    }

    /**
     * @pdGenerated default getter
     */
    public List<DiscountInfo> getDiscountInfo() {
        if (discountInfo == null)
            discountInfo = new java.util.ArrayList<DiscountInfo>();
        return discountInfo;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorDiscountInfo() {
        if (discountInfo == null)
            discountInfo = new java.util.ArrayList<DiscountInfo>();
        return discountInfo.iterator();
    }

    /**
     * @param newDiscountInfo
     * @pdGenerated default setter
     */
    public void setDiscountInfo(List<DiscountInfo> newDiscountInfo) {
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
            this.discountInfo = new java.util.ArrayList<DiscountInfo>();
        if (!this.discountInfo.contains(newDiscountInfo)) {
            this.discountInfo.add(newDiscountInfo);
            newDiscountInfo.setShop(this);
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
                oldDiscountInfo.setShop((Shop) null);
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
                oldDiscountInfo.setShop((Shop) null);
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
            newOrderForm.setShop(this);
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
                oldOrderForm.setShop((Shop) null);
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
                oldOrderForm.setShop((Shop) null);
            }
        }
    }

    /**
     * @pdGenerated default getter
     */
    public List<ShopHistory> getShopHistory() {
        if (shopHistory == null)
            shopHistory = new java.util.ArrayList<ShopHistory>();
        return shopHistory;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorShopHistory() {
        if (shopHistory == null)
            shopHistory = new java.util.ArrayList<ShopHistory>();
        return shopHistory.iterator();
    }

    /**
     * @param newShopHistory
     * @pdGenerated default setter
     */
    public void setShopHistory(List<ShopHistory> newShopHistory) {
        //removeAllShopHistory();
        this.shopHistory = newShopHistory;
    }

    /**
     * @param newShopHistory
     * @pdGenerated default add
     */
    public void addShopHistory(ShopHistory newShopHistory) {
        if (newShopHistory == null)
            return;
        if (this.shopHistory == null)
            this.shopHistory = new java.util.ArrayList<ShopHistory>();
        if (!this.shopHistory.contains(newShopHistory)) {
            this.shopHistory.add(newShopHistory);
            newShopHistory.setShop(this);
        }
    }

    /**
     * @param oldShopHistory
     * @pdGenerated default remove
     */
    public void removeShopHistory(ShopHistory oldShopHistory) {
        if (oldShopHistory == null)
            return;
        if (this.shopHistory != null)
            if (this.shopHistory.contains(oldShopHistory)) {
                this.shopHistory.remove(oldShopHistory);
                oldShopHistory.setShop((Shop) null);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllShopHistory() {
        if (shopHistory != null) {
            ShopHistory oldShopHistory;
            for (java.util.Iterator iter = getIteratorShopHistory(); iter.hasNext(); ) {
                oldShopHistory = (ShopHistory) iter.next();
                iter.remove();
                oldShopHistory.setShop((Shop) null);
            }
        }
    }

    /**
     * @pdGenerated default getter
     */
    public List<SpecialCraft> getSpecialCraft() {
        if (specialCraft == null)
            specialCraft = new java.util.ArrayList<SpecialCraft>();
        return specialCraft;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorSpecialCraft() {
        if (specialCraft == null)
            specialCraft = new java.util.ArrayList<SpecialCraft>();
        return specialCraft.iterator();
    }

    /**
     * @param newSpecialCraft
     * @pdGenerated default setter
     */
    public void setSpecialCraft(List<SpecialCraft> newSpecialCraft) {
        //removeAllSpecialCraft();
        this.specialCraft = newSpecialCraft;
    }

    /**
     * @param newSpecialCraft
     * @pdGenerated default add
     */
    public void addSpecialCraft(SpecialCraft newSpecialCraft) {
        if (newSpecialCraft == null)
            return;
        if (this.specialCraft == null)
            this.specialCraft = new java.util.ArrayList<SpecialCraft>();
        if (!this.specialCraft.contains(newSpecialCraft)) {
            this.specialCraft.add(newSpecialCraft);
            newSpecialCraft.setShop(this);
        }
    }

    /**
     * @param oldSpecialCraft
     * @pdGenerated default remove
     */
    public void removeSpecialCraft(SpecialCraft oldSpecialCraft) {
        if (oldSpecialCraft == null)
            return;
        if (this.specialCraft != null)
            if (this.specialCraft.contains(oldSpecialCraft)) {
                this.specialCraft.remove(oldSpecialCraft);
                oldSpecialCraft.setShop((Shop) null);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllSpecialCraft() {
        if (specialCraft != null) {
            SpecialCraft oldSpecialCraft;
            for (java.util.Iterator iter = getIteratorSpecialCraft(); iter.hasNext(); ) {
                oldSpecialCraft = (SpecialCraft) iter.next();
                iter.remove();
                oldSpecialCraft.setShop((Shop) null);
            }
        }
    }

    /**
     * @pdGenerated default getter
     */
    public List<VideoIntroduction> getVideoIntroduction() {
        if (videoIntroduction == null)
            videoIntroduction = new java.util.ArrayList<VideoIntroduction>();
        return videoIntroduction;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorVideoIntroduction() {
        if (videoIntroduction == null)
            videoIntroduction = new java.util.ArrayList<VideoIntroduction>();
        return videoIntroduction.iterator();
    }

    /**
     * @param newVideoIntroduction
     * @pdGenerated default setter
     */
    public void setVideoIntroduction(List<VideoIntroduction> newVideoIntroduction) {
        //removeAllVideoIntroduction();
        this.videoIntroduction = newVideoIntroduction;
    }

    /**
     * @param newVideoIntroduction
     * @pdGenerated default add
     */
    public void addVideoIntroduction(VideoIntroduction newVideoIntroduction) {
        if (newVideoIntroduction == null)
            return;
        if (this.videoIntroduction == null)
            this.videoIntroduction = new java.util.ArrayList<VideoIntroduction>();
        if (!this.videoIntroduction.contains(newVideoIntroduction)) {
            this.videoIntroduction.add(newVideoIntroduction);
            newVideoIntroduction.setShop(this);
        }
    }

    /**
     * @param oldVideoIntroduction
     * @pdGenerated default remove
     */
    public void removeVideoIntroduction(VideoIntroduction oldVideoIntroduction) {
        if (oldVideoIntroduction == null)
            return;
        if (this.videoIntroduction != null)
            if (this.videoIntroduction.contains(oldVideoIntroduction)) {
                this.videoIntroduction.remove(oldVideoIntroduction);
                oldVideoIntroduction.setShop((Shop) null);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllVideoIntroduction() {
        if (videoIntroduction != null) {
            VideoIntroduction oldVideoIntroduction;
            for (java.util.Iterator iter = getIteratorVideoIntroduction(); iter.hasNext(); ) {
                oldVideoIntroduction = (VideoIntroduction) iter.next();
                iter.remove();
                oldVideoIntroduction.setShop((Shop) null);
            }
        }
    }

    /**
     * @pdGenerated default getter
     */
    public List<AppUser> getShopManager() {
        if (shopManager == null)
            shopManager = new java.util.ArrayList<AppUser>();
        return shopManager;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorShopManager() {
        if (shopManager == null)
            shopManager = new java.util.ArrayList<AppUser>();
        return shopManager.iterator();
    }

    /**
     * @param newShopManager
     * @pdGenerated default setter
     */
    public void setShopManager(List<AppUser> newShopManager) {
        //removeAllShopManager();
        this.shopManager = newShopManager;
    }

    /**
     * @param newAppUser
     * @pdGenerated default add
     */
    public void addShopManager(AppUser newAppUser) {
        if (newAppUser == null)
            return;
        if (this.shopManager == null)
            this.shopManager = new java.util.ArrayList<AppUser>();
        if (!this.shopManager.contains(newAppUser)) {
            this.shopManager.add(newAppUser);
            newAppUser.setManagedShop(this);
        }
    }

    /**
     * @param oldAppUser
     * @pdGenerated default remove
     */
    public void removeShopManager(AppUser oldAppUser) {
        if (oldAppUser == null)
            return;
        if (this.shopManager != null)
            if (this.shopManager.contains(oldAppUser)) {
                this.shopManager.remove(oldAppUser);
                oldAppUser.setManagedShop((Shop) null);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllShopManager() {
        if (shopManager != null) {
            AppUser oldAppUser;
            for (java.util.Iterator iter = getIteratorShopManager(); iter.hasNext(); ) {
                oldAppUser = (AppUser) iter.next();
                iter.remove();
                oldAppUser.setManagedShop((Shop) null);
            }
        }
    }

    /**
     * @pdGenerated default parent getter
     */
    public ShopType getShopType() {
        return shopType;
    }

    /**
     * @param newShopType
     * @pdGenerated default parent setter
     */
    public void setShopType(ShopType newShopType) {
        if (this.shopType == null || !this.shopType.equals(newShopType)) {
            if (this.shopType != null) {
                ShopType oldShopType = this.shopType;
                this.shopType = null;
                //oldShopType.removeShop(this);
            }
            if (newShopType != null) {
                this.shopType = newShopType;
                //this.shopType.addShop(this);
            }
        }
    }

    /**
     * @pdGenerated default parent getter
     */
    public ShopArea getShopArea() {
        return shopArea;
    }

    /**
     * @param newShopArea
     * @pdGenerated default parent setter
     */
    public void setShopArea(ShopArea newShopArea) {
        if (this.shopArea == null || !this.shopArea.equals(newShopArea)) {
            if (this.shopArea != null) {
                ShopArea oldShopArea = this.shopArea;
                this.shopArea = null;
                //oldShopArea.removeShop(this);
            }
            if (newShopArea != null) {
                this.shopArea = newShopArea;
                //this.shopArea.addShop(this);
            }
        }
    }

    /**
     * Empty constructor which is required by Hibernate
     */
    public Shop() {
    }

}