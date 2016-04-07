package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  DiscountType.java
 * Author:  cmicat
 * Purpose: Defines the Class DiscountType
 ***********************************************************************/

import java.util.List;

/**
 * @pdOid e05f0e50-7c25-4589-8c85-84b079b0ec3f
 */
public class DiscountType {
    /**
     * @pdOid ddc4f80e-5fca-4c58-8331-424d5d947921
     */
    private long discountTypeId;
    /**
     * @pdOid 885361b8-d3a9-4811-b4f9-c866608a66b5
     */
    private String discountTypeName;

    /**
     * @pdRoleInfo migr=no name=DiscountInfo assc=discountInfoDiscountType coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<DiscountInfo> discountInfo;


}