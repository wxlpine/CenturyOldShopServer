/***********************************************************************
 * Module:  HibernateDaoFactory.java
 * Author:  cmicat
 * Purpose: Defines Hibernate implmentation of Dao factory
 ***********************************************************************/

package factory;

import com.centuryOldShop.server.persistence.dao.*;
import com.centuryOldShop.server.persistence.daoimpl.hibernate.*;

/**
 * Dao factory to provide data access by Hibernate.
 */
public class HibernateDaoFactory extends DaoFactory {

    /**
     * Empty constructor
     */
    public HibernateDaoFactory() {
        super();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getNewsDao()
     */
    public NewsDao getNewsDao() {
        return new NewsDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getShopStoryDao()
     */
    public ShopStoryDao getShopStoryDao() {
        return new ShopStoryDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getShopDao()
     */
    public ShopDao getShopDao() {
        return new ShopDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getShopTypeDao()
     */
    public ShopTypeDao getShopTypeDao() {
        return new ShopTypeDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getShopAreaDao()
     */
    public ShopAreaDao getShopAreaDao() {
        return new ShopAreaDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getShoppingCartDao()
     */
    public ShoppingCartDao getShoppingCartDao() {
        return new ShoppingCartDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getDiscountInfoDao()
     */
    public DiscountInfoDao getDiscountInfoDao() {
        return new DiscountInfoDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getDiscountTypeDao()
     */
    public DiscountTypeDao getDiscountTypeDao() {
        return new DiscountTypeDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getCommodityDao()
     */
    public CommodityDao getCommodityDao() {
        return new CommodityDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getCommodityTypeDao()
     */
    public CommodityTypeDao getCommodityTypeDao() {
        return new CommodityTypeDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getOrderFormDao()
     */
    public OrderFormDao getOrderFormDao() {
        return new OrderFormDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getUserEvaluationDao()
     */
    public UserEvaluationDao getUserEvaluationDao() {
        return new UserEvaluationDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getShopHistoryDao()
     */
    public ShopHistoryDao getShopHistoryDao() {
        return new ShopHistoryDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getOrderFormCommodityDao()
     */
    public OrderFormCommodityDao getOrderFormCommodityDao() {
        return new OrderFormCommodityDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getFavoriteDao()
     */
    public FavoriteDao getFavoriteDao() {
        return new FavoriteDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getMessageDao()
     */
    public MessageDao getMessageDao() {
        return new MessageDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getSpecialCraftDao()
     */
    public SpecialCraftDao getSpecialCraftDao() {
        return new SpecialCraftDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getVideoIntroductionDao()
     */
    public VideoIntroductionDao getVideoIntroductionDao() {
        return new VideoIntroductionDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getRateKeywordDao()
     */
    public RateKeywordDao getRateKeywordDao() {
        return new RateKeywordDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getShopStoryTypeDao()
     */
    public ShopStoryTypeDao getShopStoryTypeDao() {
        return new ShopStoryTypeDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getOrderStatusTypeDao()
     */
    public OrderStatusTypeDao getOrderStatusTypeDao() {
        return new OrderStatusTypeDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getDisputeStatusTypeDao()
     */
    public DisputeStatusTypeDao getDisputeStatusTypeDao() {
        return new DisputeStatusTypeDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getAppUserDao()
     */
    public AppUserDao getAppUserDao() {
        return new AppUserDaoImpl();
    }

}