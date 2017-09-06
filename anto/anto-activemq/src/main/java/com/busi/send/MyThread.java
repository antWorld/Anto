package com.busi.send;

import javax.jms.*;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/6/27 13:45
 */
public class MyThread extends Thread {
    private Session session;
    private MessageProducer producer;

    public MyThread(Session session, MessageProducer producer) {
        this.session = session;
        this.producer = producer;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            TextMessage message;
            try {
                message = session.createTextMessage("message" + i);
                producer.send(message);
            } catch (JMSException e) {
                e.printStackTrace();
            }

        }
    }
}
