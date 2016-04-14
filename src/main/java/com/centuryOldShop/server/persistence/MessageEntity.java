package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  MessageEntity.java
 * Author:  cmicat
 * Purpose: Defines the Class MessageEntity
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;

/**
 * @pdOid 6edd8efd-82b8-4499-927c-e37fdc09ecd2
 */
public class MessageEntity implements Serializable {
    /**
     * @pdOid 759a28f1-f797-4fad-a6ce-6656e5faf663
     */
    private long messageId;
    /**
     * @pdOid a38ed56f-0d29-40a1-afad-c068492547bb
     */
    private Date sendTime;
    /**
     * @pdOid 31213858-a775-4949-843c-3c7f237d94f3
     */
    private String content;

    /**
     * @pdRoleInfo migr=no name=AppUser assc=sendUser mult=1..1 side=A
     */
    private AppUserEntity sendUser;
    /**
     * @pdRoleInfo migr=no name=AppUser assc=receiveUser mult=1..1 side=A
     */
    private AppUserEntity receiveUser;

    //<editor-fold desc="constructor">
    public MessageEntity() {
    }
    //</editor-fold>

    //<editor-fold desc="accessor">

    public long getMessageId() {
        return messageId;
    }

    public MessageEntity setMessageId(long messageId) {
        this.messageId = messageId;
        return this;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public MessageEntity setSendTime(Date sendTime) {
        this.sendTime = sendTime;
        return this;
    }

    public String getContent() {
        return content;
    }

    public MessageEntity setContent(String content) {
        this.content = content;
        return this;
    }

    public AppUserEntity getSendUser() {
        return sendUser;
    }

    public MessageEntity setSendUser(AppUserEntity sendUser) {
        this.sendUser = sendUser;
        return this;
    }

    public AppUserEntity getReceiveUser() {
        return receiveUser;
    }

    public MessageEntity setReceiveUser(AppUserEntity receiveUser) {
        this.receiveUser = receiveUser;
        return this;
    }

    //</editor-fold>


    //<editor-fold desc="common methods">

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessageEntity message = (MessageEntity) o;

        return messageId == message.messageId;

    }

    @Override
    public int hashCode() {
        return (int) (messageId ^ (messageId >>> 32));
    }

    @Override
    public String toString() {
        return "MessageEntity{" +
                "messageId=" + messageId +
                ", sendTime=" + sendTime +
                ", content='" + content + '\'' +
                ", sendUser=" + sendUser +
                ", receiveUser=" + receiveUser +
                '}';
    }

    //</editor-fold>
}