/***********************************************************************
 * Module:  NewsPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class News
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.Objects;

/**
 * Generated primary key class for News. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class NewsPK implements java.io.Serializable {
    /**
     * @pdOid 84768051-78ac-4c2c-8249-7a98c6e3ae94
     */
    private long newsId;

    /**
     * Empty constructor
     */
    public NewsPK() {
    }

    /**
     * Constructor with parameters
     *
     * @param newsId parameter to set value of field newsId
     */
    public NewsPK(long newsId) {
        this.newsId = newsId;
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

    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsPK newsPK = (NewsPK) o;
        return newsId == newsPK.newsId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(newsId);
    }

    @Override
    public String toString() {
        return "NewsPK{" +
                "newsId=" + newsId +
                '}';
    }

    //</editor-fold>

}