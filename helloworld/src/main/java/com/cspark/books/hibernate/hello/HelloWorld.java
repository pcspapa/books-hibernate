package com.cspark.books.hibernate.hello;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by cspark on 2016. 1. 4..
 */
public class HelloWorld {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("helloworld");

        // 첫 번째 작업 단위
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Message message = new Message("Hello World");
        em.persist(message);

        tx.commit();
        em.close();

        // 두 번째 작업 단위
        EntityManager newEm = emf.createEntityManager();
        EntityTransaction newTx = newEm.getTransaction();
        newTx.begin();

        List<Message> messages = newEm.createQuery("select m from Message m order by m.text asc").getResultList();

        System.out.println(messages.size() + "message(s) found");

        for (Message loadedMsg : messages) {
            System.out.println(loadedMsg.getText());
        }

        newTx.commit();
        newEm.close();

        // 애플리케이션 종료
        emf.close();

    }

}
