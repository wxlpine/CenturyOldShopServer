package com.centuryOldShop.server.dto;


import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * Created by cmicat on 2016/4/24.
 */
public final class NewsDto implements Serializable {

    private long newsId;
    private String title;
    private String contentUrl;
    private java.util.Date publishTime;
    private int readCount;
    private String spotScene;

    private ShopDto shop;

    //<editor-fold name="accessor">

    public long getNewsId() {
        return newsId;
    }

    public NewsDto setNewsId(long newsId) {
        this.newsId = newsId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public NewsDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public NewsDto setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
        return this;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public NewsDto setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    public int getReadCount() {
        return readCount;
    }

    public NewsDto setReadCount(int readCount) {
        this.readCount = readCount;
        return this;
    }

    public String getSpotScene() {
        return spotScene;
    }

    public NewsDto setSpotScene(String spotScene) {
        this.spotScene = spotScene;
        return this;
    }

    public ShopDto getShop() {
        return shop;
    }

    public NewsDto setShop(ShopDto shop) {
        this.shop = shop;
        return this;
    }

    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsDto newsDto = (NewsDto) o;
        return newsId == newsDto.newsId &&
                readCount == newsDto.readCount &&
                Objects.equals(title, newsDto.title) &&
                Objects.equals(contentUrl, newsDto.contentUrl) &&
                Objects.equals(publishTime, newsDto.publishTime) &&
                Objects.equals(spotScene, newsDto.spotScene) &&
                Objects.equals(shop, newsDto.shop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newsId, title, contentUrl, publishTime, spotScene, shop);
    }

    @Override
    public String toString() {
        return "NewsDto{" +
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
