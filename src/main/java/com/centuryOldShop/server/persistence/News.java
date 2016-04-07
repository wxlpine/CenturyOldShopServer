package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  News.java
 * Author:  cmicat
 * Purpose: Defines the Class News
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;

/**
 * @pdOid eb9bbe91-3175-42d7-be1a-c8223415eb2b
 */
public class News implements Serializable {
    /**
     * @pdOid fa01b9e9-e7e8-4d9e-95be-0af55b94886a
     */
    private long newsId;
    /**
     * @pdOid cae9630c-b40c-402c-9502-a31be53f0381
     */
    private String title;
    /**
     * @pdOid 574224d0-fa56-43b5-aa4d-c56a8889d812
     */
    private String contentUrl;
    /**
     * @pdOid e8ce7593-5d29-4b42-a86a-010eb0113151
     */
    private Date publishTime;
    /**
     * @pdOid bb20be45-351e-47bc-ae0d-51cb75a36a01
     */
    private int readCount;
    /**
     * @pdOid d5228d67-ffd2-478b-9197-2075566f24d9
     */
    private String spotScene;

    /**
     * @pdRoleInfo migr=no name=Shop assc=shopNews mult=1..1 side=A
     */
    private Shop shop;

    //<editor-fold desc="constructor">
    public News() {
    }
    //</editor-fold>

    //<editor-fold desc="accessor">

    public long getNewsId() {
        return newsId;
    }

    public News setNewsId(long newsId) {
        this.newsId = newsId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public News setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public News setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
        return this;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public News setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    public int getReadCount() {
        return readCount;
    }

    public News setReadCount(int readCount) {
        this.readCount = readCount;
        return this;
    }

    public String getSpotScene() {
        return spotScene;
    }

    public News setSpotScene(String spotScene) {
        this.spotScene = spotScene;
        return this;
    }

    public Shop getShop() {
        return shop;
    }

    public News setShop(Shop shop) {
        this.shop = shop;
        return this;
    }

    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        News news = (News) o;

        return newsId == news.newsId;

    }

    @Override
    public int hashCode() {
        return (int) (newsId ^ (newsId >>> 32));
    }

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