/***********************************************************************
 * Module:  News.java
 * Author:  cmicat
 * Purpose: Defines the Class News
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * @pdOid 37ebf293-96cc-4ede-874b-60fa505e2fd6
 */
public class News implements java.io.Serializable {
    /**
     * @pdOid 84768051-78ac-4c2c-8249-7a98c6e3ae94
     */
    private long newsId;
    /**
     * @pdOid 69cb408b-0e82-4956-9c6e-a423e97ffd89
     */
    private String title;
    /**
     * @pdOid 6cae4611-da88-4966-9173-af5dd102ef3b
     */
    private String contentUrl;
    /**
     * @pdOid 259e840d-1e5c-4d7e-85e0-b89c65ea363f
     */
    private java.util.Date publishTime;
    /**
     * @pdOid cd146925-8374-496e-b601-8293298be237
     */
    private int readCount;
    /**
     * @pdOid dfd3d068-8df4-4603-a065-b6dce1e2dab0
     */
    private String spotScene;

    /**
     * @pdRoleInfo migr=no name=Shop assc=shopNews mult=1..1 side=A
     */
    private Shop shop;

    /**
     * Empty constructor which is required by Hibernate
     */
    public News() {
    }

    //<editor-fold name="accessor">

    /**
     * Get value of newsId
     *
     * @return newsId
     */
    public long getNewsId() {
        return newsId;
    }

    /**
     * Set value of newsId
     *
     * @param newNewsId
     */
    public void setNewsId(long newNewsId) {
        this.newsId = newNewsId;
    }

    /**
     * Get value of title
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set value of title
     *
     * @param newTitle
     */
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    /**
     * Get value of contentUrl
     *
     * @return contentUrl
     */
    public String getContentUrl() {
        return contentUrl;
    }

    /**
     * Set value of contentUrl
     *
     * @param newContentUrl
     */
    public void setContentUrl(String newContentUrl) {
        this.contentUrl = newContentUrl;
    }

    /**
     * Get value of publishTime
     *
     * @return publishTime
     */
    public java.util.Date getPublishTime() {
        return publishTime;
    }

    /**
     * Set value of publishTime
     *
     * @param newPublishTime
     */
    public void setPublishTime(java.util.Date newPublishTime) {
        this.publishTime = newPublishTime;
    }

    /**
     * Get value of readCount
     *
     * @return readCount
     */
    public int getReadCount() {
        return readCount;
    }

    /**
     * Set value of readCount
     *
     * @param newReadCount
     */
    public void setReadCount(int newReadCount) {
        this.readCount = newReadCount;
    }

    /**
     * Get value of spotScene
     *
     * @return spotScene
     */
    public String getSpotScene() {
        return spotScene;
    }

    /**
     * Set value of spotScene
     *
     * @param newSpotScene
     */
    public void setSpotScene(String newSpotScene) {
        this.spotScene = newSpotScene;
    }

    /**
     * Get value of newsPK.
     *
     * @return newsPK object
     */
    public NewsPK getNewsPK() {
        return new NewsPK(newsId);
    }

    /**
     * Set value of newsPK.
     *
     * @param pk
     */
    public void setNewsPK(NewsPK pk) {
        if (pk != null) {
            this.newsId = pk.getNewsId();
        }
    }


    /**
     * @pdGenerated default parent getter
     */
    public Shop getShop() {
        return shop;
    }

    /**
     * @param newShop
     * @pdGenerated default parent setter
     */
    public void setShop(Shop newShop) {
        if (this.shop == null || !this.shop.equals(newShop)) {
            if (this.shop != null) {
                Shop oldShop = this.shop;
                this.shop = null;
                //oldShop.removeNews(this);
            }
            if (newShop != null) {
                this.shop = newShop;
                //this.shop.addNews(this);
            }
        }
    }

    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", title='" + title + '\'' +
                ", contentUrl='" + contentUrl + '\'' +
                ", publishTime=" + publishTime +
                ", readCount=" + readCount +
                ", spotScene='" + spotScene + '\'' +
                ", shop=" + shop +
                '}';
    }

    //</editor-fold>


}