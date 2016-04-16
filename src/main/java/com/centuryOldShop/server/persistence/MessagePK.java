/***********************************************************************
 * Module:  MessagePK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class Message
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * Generated primary key class for Message. It is used to simplify the query
 * by primary key operation, useful especially when primary key is composite.
 */
public class MessagePK implements java.io.Serializable {
    /**
     * @pdOid b6e52215-eccb-4f32-9739-82bfd1bf78c7
     */
    private long messageId;

    /**
     * Empty constructor
     */
    public MessagePK() {
    }

    /**
     * Constructor with parameters
     *
     * @param messageId parameter to set value of field messageId
     */
    public MessagePK(long messageId) {
        this.messageId = messageId;
    }

    /**
     * Get value of messageId
     *
     * @return messageId
     */
    public long getMessageId() {
        return messageId;
    }

    /**
     * Set value of messageId
     *
     * @param newMessageId
     */
    public void setMessageId(long newMessageId) {
        this.messageId = newMessageId;
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

        MessagePK cast = (MessagePK) other;

        if (this.messageId != cast.getMessageId())
            return false;

        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int _hashCode = 0;
        _hashCode = 29 * _hashCode + (new Long(messageId)).hashCode();
        return _hashCode;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.MessagePK: ");
        ret.append("messageId='" + messageId + "'");
        return ret.toString();
    }
}