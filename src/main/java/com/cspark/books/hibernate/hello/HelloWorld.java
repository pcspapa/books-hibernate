package com.cspark.books.hibernate.hello;

import com.cspark.books.hibernate.persistence.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by cspark on 2016. 1. 4..
 */
public class HelloWorld {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Message message = new Message("Hello World");
        Long msgId = (Long) session.save(message);

        tx.commit();
        session.close();

        Session newSession = HibernateUtil.getSessionFactory().openSession();
        Transaction newTx = newSession.beginTransaction();

        List<Message> messages = newSession.createQuery("from Message m order by m.text asc").list();

        System.out.println(messages.size() + "message(s) found");

        for (Message loadedMsg : messages) {
            System.out.println(loadedMsg.getText());
        }

        newTx.commit();
        newSession.close();

        HibernateUtil.shutdown();
    }

}
