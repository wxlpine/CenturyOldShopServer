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
    private String content;

    /**
     * @pdRoleInfo migr=no name=AppUser assc=sendUser mult=1..1 side=A
     */
    private AppUser sendUser;
    /**
     * @pdRoleInfo migr=no name=AppUser assc=receiveUser mult=1..1 side=A
     */
    private AppUser receiveUser;


    /**
     * Empty constructor which is required by Hibernate
     */
    public Message() {
    }

    //<editor-fold name="accessor">

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
    public String getContent() {
        return content;
    }

    /**
     * Set value of content
     *
     * @param newContent
     */
    public void setContent(String newContent) {
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

    //</editor-fold>

    //<editor-fold name="common methods">

    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", sendTime=" + sendTime +
                ", content='" + content + '\'' +
                ", sendUser=" + sendUser +
                ", receiveUser=" + receiveUser +
                '}';
    }


    //</editor-fold>


}