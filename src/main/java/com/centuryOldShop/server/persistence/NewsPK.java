/***********************************************************************
 * Module:  NewsPK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class News
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

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

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {

        if (other == null) {
            return false;
        }

        if (other == this) {
            return true;
        }

        if (!(other.getClass() == getClass()))
            return false;

        NewsPK cast = (NewsPK) other;

        if (this.newsId != cast.getNewsId())
            return false;

        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int _hashCode = 0;
        _hashCode = 29 * _hashCode + (new Long(newsId)).hashCode();
        return _hashCode;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.NewsPK: ");
        ret.append("newsId='" + newsId + "'");
        return ret.toString();
    }
}