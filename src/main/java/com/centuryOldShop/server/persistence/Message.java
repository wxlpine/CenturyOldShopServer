package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  Message.java
 * Author:  cmicat
 * Purpose: Defines the Class Message
 ***********************************************************************/

import java.io.Serializable;
import java.util.Date;

/**
 * @pdOid 6edd8efd-82b8-4499-927c-e37fdc09ecd2
 */
public class Message implements Serializable {
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
    private AppUser sendUser;
    /**
     * @pdRoleInfo migr=no name=AppUser assc=receiveUser mult=1..1 side=A
     */
    private AppUser receiveUser;

    public Message() {
    }
}