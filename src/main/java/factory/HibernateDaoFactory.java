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
    @Override
    public NewsDao getNewsDao() {
        return new NewsDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getShopStoryDao()
     */
    @Override
    public ShopStoryDao getShopStoryDao() {
        return new ShopStoryDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getShopDao()
     */
    @Override
    public ShopDao getShopDao() {
        return new ShopDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getShopTypeDao()
     */
    @Override
    public ShopTypeDao getShopTypeDao() {
        return new ShopTypeDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getShopAreaDao()
     */
    @Override
    public ShopAreaDao getShopAreaDao() {
        return new ShopAreaDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getShoppingCartDao()
     */
    @Override
    public ShoppingCartDao getShoppingCartDao() {
        return new ShoppingCartDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getDiscountInfoDao()
     */
    @Override
    public DiscountInfoDao getDiscountInfoDao() {
        return new DiscountInfoDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getDiscountTypeDao()
     */
    @Override
    public DiscountTypeDao getDiscountTypeDao() {
        return new DiscountTypeDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getCommodityDao()
     */
    @Override
    public CommodityDao getCommodityDao() {
        return new CommodityDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getCommodityTypeDao()
     */
    @Override
    public CommodityTypeDao getCommodityTypeDao() {
        return new CommodityTypeDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getOrderFormDao()
     */
    @Override
    public OrderFormDao getOrderFormDao() {
        return new OrderFormDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getUserEvaluationDao()
     */
    @Override
    public UserEvaluationDao getUserEvaluationDao() {
        return new UserEvaluationDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getShopHistoryDao()
     */
    @Override
    public ShopHistoryDao getShopHistoryDao() {
        return new ShopHistoryDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getOrderFormCommodityDao()
     */
    @Override
    public OrderFormCommodityDao getOrderFormCommodityDao() {
        return new OrderFormCommodityDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getFavoriteDao()
     */
    @Override
    public FavoriteDao getFavoriteDao() {
        return new FavoriteDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getMessageDao()
     */
    @Override
    public MessageDao getMessageDao() {
        return new MessageDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getSpecialCraftDao()
     */
    @Override
    public SpecialCraftDao getSpecialCraftDao() {
        return new SpecialCraftDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getVideoIntroductionDao()
     */
    @Override
    public VideoIntroductionDao getVideoIntroductionDao() {
        return new VideoIntroductionDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getRateKeywordDao()
     */
    @Override
    public RateKeywordDao getRateKeywordDao() {
        return new RateKeywordDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getShopStoryTypeDao()
     */
    @Override
    public ShopStoryTypeDao getShopStoryTypeDao() {
        return new ShopStoryTypeDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getOrderStatusTypeDao()
     */
    @Override
    public OrderStatusTypeDao getOrderStatusTypeDao() {
        return new OrderStatusTypeDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getDisputeStatusTypeDao()
     */
    @Override
    public DisputeStatusTypeDao getDisputeStatusTypeDao() {
        return new DisputeStatusTypeDaoImpl();
    }

    /* (non-Javadoc)
     * @see factory.DaoFactory#getAppUserDao()
     */
    @Override
    public AppUserDao getAppUserDao() {
        return new AppUserDaoImpl();
    }

}