package com.cspark.books.hibernate.persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by cspark on 2016. 1. 4..
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure()
                    .buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    /*
    static {
        sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addResource("com/cspark/books/hibernate/hello/Message.hbm.xml")
                .buildSessionFactory();
    }
    */


    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }
}
