/***********************************************************************
 * Module:  DaoFactory.java
 * Author:  cmicat
 * Purpose: Defines Dao factory class
 ***********************************************************************/

package factory;

import com.centuryOldShop.server.persistence.dao.*;

/**
 * Abstract factory class that defines Dao creation interface.
 */
public abstract class DaoFactory {

    /**
     * Static function to get concrete Dao factory implementation
     *
     * @return Dao factory implementation
     */
    public static DaoFactory getDaoFactory() {
        // Get Dao factory type
        String type = System.getProperty("DAOFactoryType", "Hibernate");
        if (type.equalsIgnoreCase("Hibernate")) {
            return new HibernateDaoFactory();
        }
        // Default
        return new HibernateDaoFactory();
    }

    /**
     * Empty constructor
     */
    public DaoFactory() {
        super();
    }


    /**
     * Get concrete <Code>NewsDao</Code> implementation
     *
     * @return concrete <Code>NewsDao</Code> implementation
     */
    public abstract NewsDao getNewsDao();

    /**
     * Get concrete <Code>ShopStoryDao</Code> implementation
     *
     * @return concrete <Code>ShopStoryDao</Code> implementation
     */
    public abstract ShopStoryDao getShopStoryDao();

    /**
     * Get concrete <Code>ShopDao</Code> implementation
     *
     * @return concrete <Code>ShopDao</Code> implementation
     */
    public abstract ShopDao getShopDao();

    /**
     * Get concrete <Code>ShopTypeDao</Code> implementation
     *
     * @return concrete <Code>ShopTypeDao</Code> implementation
     */
    public abstract ShopTypeDao getShopTypeDao();

    /**
     * Get concrete <Code>ShopAreaDao</Code> implementation
     *
     * @return concrete <Code>ShopAreaDao</Code> implementation
     */
    public abstract ShopAreaDao getShopAreaDao();

    /**
     * Get concrete <Code>ShoppingCartDao</Code> implementation
     *
     * @return concrete <Code>ShoppingCartDao</Code> implementation
     */
    public abstract ShoppingCartDao getShoppingCartDao();

    /**
     * Get concrete <Code>DiscountInfoDao</Code> implementation
     *
     * @return concrete <Code>DiscountInfoDao</Code> implementation
     */
    public abstract DiscountInfoDao getDiscountInfoDao();

    /**
     * Get concrete <Code>DiscountTypeDao</Code> implementation
     *
     * @return concrete <Code>DiscountTypeDao</Code> implementation
     */
    public abstract DiscountTypeDao getDiscountTypeDao();

    /**
     * Get concrete <Code>CommodityDao</Code> implementation
     *
     * @return concrete <Code>CommodityDao</Code> implementation
     */
    public abstract CommodityDao getCommodityDao();

    /**
     * Get concrete <Code>CommodityTypeDao</Code> implementation
     *
     * @return concrete <Code>CommodityTypeDao</Code> implementation
     */
    public abstract CommodityTypeDao getCommodityTypeDao();

    /**
     * Get concrete <Code>OrderFormDao</Code> implementation
     *
     * @return concrete <Code>OrderFormDao</Code> implementation
     */
    public abstract OrderFormDao getOrderFormDao();

    /**
     * Get concrete <Code>UserEvaluationDao</Code> implementation
     *
     * @return concrete <Code>UserEvaluationDao</Code> implementation
     */
    public abstract UserEvaluationDao getUserEvaluationDao();

    /**
     * Get concrete <Code>ShopHistoryDao</Code> implementation
     *
     * @return concrete <Code>ShopHistoryDao</Code> implementation
     */
    public abstract ShopHistoryDao getShopHistoryDao();

    /**
     * Get concrete <Code>OrderFormCommodityDao</Code> implementation
     *
     * @return concrete <Code>OrderFormCommodityDao</Code> implementation
     */
    public abstract OrderFormCommodityDao getOrderFormCommodityDao();

    /**
     * Get concrete <Code>FavoriteDao</Code> implementation
     *
     * @return concrete <Code>FavoriteDao</Code> implementation
     */
    public abstract FavoriteDao getFavoriteDao();

    /**
     * Get concrete <Code>MessageDao</Code> implementation
     *
     * @return concrete <Code>MessageDao</Code> implementation
     */
    public abstract MessageDao getMessageDao();

    /**
     * Get concrete <Code>SpecialCraftDao</Code> implementation
     *
     * @return concrete <Code>SpecialCraftDao</Code> implementation
     */
    public abstract SpecialCraftDao getSpecialCraftDao();

    /**
     * Get concrete <Code>VideoIntroductionDao</Code> implementation
     *
     * @return concrete <Code>VideoIntroductionDao</Code> implementation
     */
    public abstract VideoIntroductionDao getVideoIntroductionDao();

    /**
     * Get concrete <Code>RateKeywordDao</Code> implementation
     *
     * @return concrete <Code>RateKeywordDao</Code> implementation
     */
    public abstract RateKeywordDao getRateKeywordDao();

    /**
     * Get concrete <Code>ShopStoryTypeDao</Code> implementation
     *
     * @return concrete <Code>ShopStoryTypeDao</Code> implementation
     */
    public abstract ShopStoryTypeDao getShopStoryTypeDao();

    /**
     * Get concrete <Code>OrderStatusTypeDao</Code> implementation
     *
     * @return concrete <Code>OrderStatusTypeDao</Code> implementation
     */
    public abstract OrderStatusTypeDao getOrderStatusTypeDao();

    /**
     * Get concrete <Code>DisputeStatusTypeDao</Code> implementation
     *
     * @return concrete <Code>DisputeStatusTypeDao</Code> implementation
     */
    public abstract DisputeStatusTypeDao getDisputeStatusTypeDao();

    /**
     * Get concrete <Code>AppUserDao</Code> implementation
     *
     * @return concrete <Code>AppUserDao</Code> implementation
     */
    public abstract AppUserDao getAppUserDao();

}