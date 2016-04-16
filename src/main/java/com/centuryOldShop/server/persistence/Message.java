/***********************************************************************
 * Module:  Message.java
 * Author:  cmicat
 * Purpose: Defines the Class Message
 ***********************************************************************/

package com.centuryOldShop.server.persistence;

/**
 * @pdOid 0e971f1b-bb0c-4e19-9e52-0d541ea6d39d
 */
public class Message implements java.io.Serializable {
    /**
     * @pdOid b6e52215-eccb-4f32-9739-82bfd1bf78c7
     */
    private long messageId;
    /**
     * @pdOid 0306f5ea-4d08-4158-8d63-d3e74f24ddfc
     */
    private java.util.Date sendTime;
    /**
     * @pdOid 4d441c90-1ed5-40d7-8c63-d71b6cdff09a
     */
    private java.lang.String content;

    /**
     * @pdRoleInfo migr=no name=AppUser assc=sendUser mult=1..1 side=A
     */
    private AppUser sendUser;
    /**
     * @pdRoleInfo migr=no name=AppUser assc=receiveUser mult=1..1 side=A
     */
    private AppUser receiveUser;

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

    /**
     * Get value of sendTime
     *
     * @return sendTime
     */
    public java.util.Date getSendTime() {
        return sendTime;
    }

    /**
     * Set value of sendTime
     *
     * @param newSendTime
     */
    public void setSendTime(java.util.Date newSendTime) {
        this.sendTime = newSendTime;
    }

    /**
     * Get value of content
     *
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }

    /**
     * Set value of content
     *
     * @param newContent
     */
    public void setContent(java.lang.String newContent) {
        this.content = newContent;
    }

    /**
     * Get value of messagePK.
     *
     * @return messagePK object
     */
    public MessagePK getMessagePK() {
        return new MessagePK(messageId);
    }

    /**
     * Set value of messagePK.
     *
     * @param pk
     */
    public void setMessagePK(MessagePK pk) {
        if (pk != null) {
            this.messageId = pk.getMessageId();
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

        if (!(other instanceof Message))
            return false;

        Message cast = (Message) other;

        if (this.messageId != cast.getMessageId())
            return false;

        if (this.sendTime == null ? cast.getSendTime() != this.sendTime : !(com.sybase.orm.util.Util.compareDate(this.sendTime, cast.getSendTime(), java.util.Calendar.SECOND) == 0))
            return false;

        if (this.content == null ? cast.getContent() != this.content : !this.content.equals(cast.getContent()))
            return false;

        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        int hashCode = 0;
        hashCode = 29 * hashCode + (new Long(messageId)).hashCode();
        if (this.sendTime != null)
            hashCode = 29 * hashCode + sendTime.hashCode();
        if (this.content != null)
            hashCode = 29 * hashCode + content.hashCode();
        return hashCode;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("com.centuryOldShop.server.persistence.Message: ");
        ret.append("messageId='" + messageId + "'");
        ret.append("sendTime='" + sendTime + "'");
        ret.append("content='" + content + "'");
        return ret.toString();
    }


    /**
     * @pdGenerated default parent getter
     */
    public AppUser getSendUser() {
        return sendUser;
    }

    /**
     * @param newAppUser
     * @pdGenerated default parent setter
     */
    public void setSendUser(AppUser newAppUser) {
        if (this.sendUser == null || !this.sendUser.equals(newAppUser)) {
            if (this.sendUser != null) {
                AppUser oldAppUser = this.sendUser;
                this.sendUser = null;
                //oldAppUser.removeSendMessage(this);
            }
            if (newAppUser != null) {
                this.sendUser = newAppUser;
                //this.sendUser.addSendMessage(this);
            }
        }
    }

    /**
     * @pdGenerated default parent getter
     */
    public AppUser getReceiveUser() {
        return receiveUser;
    }

    /**
     * @param newAppUser
     * @pdGenerated default parent setter
     */
    public void setReceiveUser(AppUser newAppUser) {
        if (this.receiveUser == null || !this.receiveUser.equals(newAppUser)) {
            if (this.receiveUser != null) {
                AppUser oldAppUser = this.receiveUser;
                this.receiveUser = null;
                //oldAppUser.removeReceiveMessage(this);
            }
            if (newAppUser != null) {
                this.receiveUser = newAppUser;
                //this.receiveUser.addReceiveMessage(this);
            }
        }
    }

    /**
     * Empty constructor which is required by Hibernate
     */
    public Message() {
    }

}