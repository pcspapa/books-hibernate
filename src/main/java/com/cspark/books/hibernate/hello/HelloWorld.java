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

        // 첫 번째 작업 단위
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Message message = new Message("Hello World");
        Long msgId = (Long) session.save(message);

        tx.commit();
        session.close();

        // 두 번째 작업 단위
        Session newSession = HibernateUtil.getSessionFactory().openSession();
        Transaction newTx = newSession.beginTransaction();

        List<Message> messages = newSession.createQuery("from Message m order by m.text asc").list();

        System.out.println(messages.size() + "message(s) found");

        for (Message loadedMsg : messages) {
            System.out.println(loadedMsg.getText());
        }

        // 세 번째 작업 단위 : 변경 감지(dirty checking), 연쇄 작용(cascading)
        Session thirdSession = HibernateUtil.getSessionFactory().openSession();
        Transaction thirdTx = thirdSession.beginTransaction();

        message = thirdSession.get(Message.class, msgId);

        message.setText("Greetings Earthling");
        message.setNextMessage(new Message("Take me to your leader (please)"));

        thirdTx.commit();
        thirdSession.close();


        newTx.commit();
        newSession.close();

        HibernateUtil.shutdown();
    }

}
