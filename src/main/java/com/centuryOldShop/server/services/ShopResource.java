package com.centuryOldShop.server.services;

import com.centuryOldShop.server.domain.Shop;
import com.centuryOldShop.server.persistence.PersistenceManager;
import com.centuryOldShop.server.persistence.ShopTypeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by cmicat on 2016/4/11.
 */
@Path("/shop")
public class ShopResource {

    public ShopResource() {
    }

    @GET
    @Produces("application/json")
    public Shop getShop() {
        Shop shop = new Shop();
        shop.setDetailedAddress("test");

        EntityManager manager = null;
        EntityTransaction transaction = null;
        try {
            manager = PersistenceManager.getEntityManagerFactory().createEntityManager();
            transaction = manager.getTransaction();
            transaction.begin();

            CriteriaBuilder builder = manager.getCriteriaBuilder();

            CriteriaQuery<ShopTypeEntity> q1 = builder.createQuery(ShopTypeEntity.class);
            Root<ShopTypeEntity> root = q1.from(ShopTypeEntity.class);
            List<ShopTypeEntity> res = manager.createQuery(
                    q1.select(root)
            ).getResultList();

            System.out.println(res);


            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive())
                transaction.rollback();
            throw e;
        } finally {
            if (manager != null && manager.isOpen())
                manager.close();
        }

        return shop;
    }
}
