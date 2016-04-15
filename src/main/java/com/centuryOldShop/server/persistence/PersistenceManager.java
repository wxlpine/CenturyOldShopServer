package com.centuryOldShop.server.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Date;

/**
 * Created by cmicat on 2016/4/15.
 */
public final class PersistenceManager implements ServletContextListener {
    private static final boolean DEBUG = true;

    private static volatile EntityManagerFactory emf = null;

    public static EntityManagerFactory getEntityManagerFactory() {

        if (emf == null)
            synchronized (PersistenceManager.class) {
                if (emf == null) {
                    emf = Persistence.createEntityManagerFactory("EntityMappings");

                    if (DEBUG) {
                        System.out.printf("EntityManagerFactory created at %s%n", new Date());
                    }
                }
            }
        return emf;
    }


    private static void closeEntityManagerFactory() {
        if (emf != null) {
            synchronized (PersistenceManager.class) {
                if (emf != null) {
                    emf.close();
                    emf = null;

                    if (DEBUG) {
                        System.out.printf("EntityManagerFactory closed at %s%n", new Date());
                    }
                }
            }
        }
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        closeEntityManagerFactory();
    }
}
