/***********************************************************************
 * Module:  Shop.java
 * Author:  cmicat
 * Purpose: Defines the Class Shop
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @pdOid 2fe8d93d-8619-4e37-81d6-d3866f60f343
 */
public class Shop implements java.io.Serializable {

    private long shopId;
    private String shopName;
    private String shortDescription;
    private java.util.Date openABusinessTime;
    private int visitCount;
    private String detailedAddress;
    private String trademark;
    /**
     * 入驻时间
     */
    private java.util.Date enterTime;
    private String phoneNumber;
    private String fax;
    private String longDescription;

    private Set<Commodity> commodity;

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


    //<editor-fold name="constructor">

    /**
     * Empty constructor which is required by Hibernate
     */
    public Shop() {
    }

    //</editor-fold>

    //<editor-fold name="accessor">


    public long getShopId() {
        return shopId;
    }

    public void setShopId(long newShopId) {
        this.shopId = newShopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String newShopName) {
        this.shopName = newShopName;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String newShortDescription) {
        this.shortDescription = newShortDescription;
    }

    public java.util.Date getOpenABusinessTime() {
        return openABusinessTime;
    }

    public void setOpenABusinessTime(java.util.Date newOpenABusinessTime) {
        this.openABusinessTime = newOpenABusinessTime;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int newVisitCount) {
        this.visitCount = newVisitCount;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String newDetailedAddress) {
        this.detailedAddress = newDetailedAddress;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String newTrademark) {
        this.trademark = newTrademark;
    }

    public java.util.Date getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(java.util.Date newEnterTime) {
        this.enterTime = newEnterTime;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String newFax) {
        this.fax = newFax;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String newLongDescription) {
        this.longDescription = newLongDescription;
    }

    public Set<Commodity> getCommodity() {
        if (commodity == null) {
            commodity = new HashSet<>();
        }
        return commodity;
    }

    public Iterator<Commodity> getIteratorCommodity() {
        if (commodity == null) {
            commodity = new HashSet<>();
        }
        return commodity.iterator();
    }

    public Shop setCommodity(Set<Commodity> commodity) {
//        removeAllCommodity();
        this.commodity = commodity;

        return this;
    }

    public void addCommodity(Commodity newCommodity) {
        if (newCommodity == null) {
            return;
        }
        if (this.commodity == null) {
            this.commodity = new HashSet<>();
        }
        if (!this.commodity.contains(newCommodity)) {
            this.commodity.add(newCommodity);
            newCommodity.setShop(this);
        }
    }

    public void removeCommodity(Commodity oldCommodity) {
        if (oldCommodity == null) {
            return;
        }
        if (this.commodity != null && this.commodity.contains(oldCommodity)) {
            this.commodity.remove(oldCommodity);
            oldCommodity.setShop(null);
        }
    }

    public void removeAllCommodity() {
        if (commodity != null) {
            for (Iterator<Commodity> iter = getIteratorCommodity(); iter.hasNext(); ) {
                Commodity oldCommodity = iter.next();
                iter.remove();
                oldCommodity.setShop(null);
            }
        }
    }

    public ShopPK getShopPK() {
        return new ShopPK(shopId);
    }

    public void setShopPK(ShopPK pk) {
        if (pk != null) {
            this.shopId = pk.getShopId();
        }
    }

    public List<News> getNews() {
        if (news == null)
            news = new java.util.ArrayList<News>();
        return news;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public Iterator getIteratorNews() {
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
            for (Iterator iter = getIteratorNews(); iter.hasNext(); ) {
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
    public Iterator getIteratorShopStory() {
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
            for (Iterator iter = getIteratorShopStory(); iter.hasNext(); ) {
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
    public Iterator getIteratorDiscountInfo() {
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
            for (Iterator iter = getIteratorDiscountInfo(); iter.hasNext(); ) {
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
    public Iterator getIteratorOrderForm() {
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
            for (Iterator iter = getIteratorOrderForm(); iter.hasNext(); ) {
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
    public Iterator getIteratorShopHistory() {
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
            for (Iterator iter = getIteratorShopHistory(); iter.hasNext(); ) {
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
    public Iterator getIteratorSpecialCraft() {
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
            for (Iterator iter = getIteratorSpecialCraft(); iter.hasNext(); ) {
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
    public Iterator getIteratorVideoIntroduction() {
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
            for (Iterator iter = getIteratorVideoIntroduction(); iter.hasNext(); ) {
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
    public Iterator getIteratorShopManager() {
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
            for (Iterator iter = getIteratorShopManager(); iter.hasNext(); ) {
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

    //</editor-fold>


    //<editor-fold name="common methods">

    @Override
    public String toString() {
        return "Shop{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", openABusinessTime=" + openABusinessTime +
                ", visitCount=" + visitCount +
                ", detailedAddress='" + detailedAddress + '\'' +
                ", trademark='" + trademark + '\'' +
                ", enterTime=" + enterTime +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", fax='" + fax + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", shopType=" + shopType +
                ", shopArea=" + shopArea +
                '}';
    }

    //</editor-fold>


}