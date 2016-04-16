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
    private java.lang.String title;
    /**
     * @pdOid 6cae4611-da88-4966-9173-af5dd102ef3b
     */
    private java.lang.String contentUrl;
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
    private java.lang.String spotScene;

    /**
     * @pdRoleInfo migr=no name=Shop assc=shopNews mult=1..1 side=A
     */
    private Shop shop;

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
    public java.lang.String getTitle() {
        return title;
    }

    /**
     * Set value of title
     *
     * @param newTitle
     */
    public void setTitle(java.lang.String newTitle) {
        this.title = newTitle;
    }

    /**
     * Get value of contentUrl
     *
     * @return contentUrl
     */
    public java.lang.String getContentUrl() {
        return contentUrl;
    }

    /**
     * Set value of contentUrl
     *
     * @param newContentUrl
     */
    public void setContentUrl(java.lang.String newContentUrl) {
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
    public java.lang.String getSpotScene() {
        return spotScene;
    }

    /**
     * Set value of spotScene
     *
     * @param newSpotScene
     */
    public void setSpotScene(java.lang.String newSpotScene) {
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

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {

        if (other == null)
            return false;

        if (other == this)
            return true;

        if (!(other instanceof News))
            return false;

        News cast = (News) other;

        if (this.newsId != cast.getNewsId())
            return false;

        if (this.title == null ? cast.getTitle() != this.title : !this.title.equals(cast.getTitle()))
            return false;

        if (this.contentUrl == null ? cast.getContentUrl() != this.contentUrl : !this.contentUrl.equals(cast.getContentUrl()))
            return false;

        if (this.publishTime == null ? cast.getPublishTime() != this.publishTime : !(com.sybase.orm.util.Util.compareDate(this.publishTime, cast.getPublishTime(), java.util.Calendar.SECOND) == 0))
            return false;

        if (this.readCount != cast.getReadCount())
            return false;

        if (this.spotScene == null ? cast.getSpotScene() != this.spotScene : !this.spotScene.equals(cast.getSpotScene()))
            return false;

        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int hashCode = 0;
        hashCode = 29 * hashCode + (new Long(newsId)).hashCode();
        if (this.title != null)
            hashCode = 29 * hashCode + title.hashCode();
        if (this.contentUrl != null)
            hashCode = 29 * hashCode + contentUrl.hashCode();
        if (this.publishTime != null)
            hashCode = 29 * hashCode + publishTime.hashCode();
        hashCode = 29 * hashCode + (new Integer(readCount)).hashCode();
        if (this.spotScene != null)
            hashCode = 29 * hashCode + spotScene.hashCode();
        return hashCode;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.News: ");
        ret.append("newsId='" + newsId + "'");
        ret.append("title='" + title + "'");
        ret.append("contentUrl='" + contentUrl + "'");
        ret.append("publishTime='" + publishTime + "'");
        ret.append("readCount='" + readCount + "'");
        ret.append("spotScene='" + spotScene + "'");
        return ret.toString();
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

    /**
     * Empty constructor which is required by Hibernate
     */
    public News() {
    }

}