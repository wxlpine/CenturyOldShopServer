package com.centuryOldShop.server.services;

import com.centuryOldShop.server.domain.ShopTrans;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by cmicat on 2016/4/11.
 */
@Path("/shop")
public class ShopResource {

    public ShopResource() {
    }

    @GET
    @Produces("application/json")
    public ShopTrans getShop() {
        ShopTrans shopTrans = new ShopTrans();
        shopTrans.setDetailedAddress("test");

//        EntityManager manager = null;
//        EntityTransaction transaction = null;
//        try {
//            manager = PersistenceManager.getEntityManagerFactory().createEntityManager();
//            transaction = manager.getTransaction();
//            transaction.begin();
//
//            CriteriaBuilder builder = manager.getCriteriaBuilder();
//
//            CriteriaQuery<ShopTypeEntity> q1 = builder.createQuery(ShopTypeEntity.class);
//            Root<ShopTypeEntity> root = q1.from(ShopTypeEntity.class);
//            List<ShopTypeEntity> res = manager.createQuery(
//                    q1.select(root)
//            ).getResultList();
//
//            System.out.println(res);
//
//
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null && transaction.isActive())
//                transaction.rollback();
//            throw e;
//        } finally {
//            if (manager != null && manager.isOpen())
//                manager.close();
//        }

        return shopTrans;
    }
}
