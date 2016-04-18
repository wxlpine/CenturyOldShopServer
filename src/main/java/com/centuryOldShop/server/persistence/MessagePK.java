/***********************************************************************
 * Module:  MessagePK.java
 * Author:  cmicat
 * Purpose: Defines the priamry key class for class Message
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

import java.util.Objects;

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

    //<editor-fold name="accessor">

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

    //</editor-fold>

    //<editor-fold name="common methods">


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessagePK messagePK = (MessagePK) o;
        return messageId == messagePK.messageId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId);
    }

    @Override
    public String toString() {
        return "MessagePK{" +
                "messageId=" + messageId +
                '}';
    }

    //</editor-fold>
}