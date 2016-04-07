package com.centuryOldShop.server.persistence;
/***********************************************************************
 * Module:  CommodityType.java
 * Author:  cmicat
 * Purpose: Defines the Class CommodityType
 ***********************************************************************/

import java.util.List;

/**
 * @pdOid 21155406-14eb-422a-9588-b971854d9418
 */
public class CommodityType {
    /**
     * @pdOid c9f763bc-c6b9-4c2d-afaf-3078b4972d36
     */
    private String commodityType;

    /**
     * @pdRoleInfo migr=no name=Commodity assc=commodityCommodityType coll=java.util.List impl=java.util.ArrayList mult=0..*
     */
    private List<Commodity> commodity;


}