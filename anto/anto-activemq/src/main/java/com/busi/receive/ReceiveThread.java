package com.busi.receive;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.TextMessage;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/7/1 10:56
 */
public class ReceiveThread extends Thread {
    private MessageConsumer consumer;

    public ReceiveThread(MessageConsumer consumer) {
        this.consumer = consumer;
    }

    public void run() {
        System.out.println("start time：" + System.currentTimeMillis());
        Message message ;
        try {
            message = consumer.receive();
            if (null != message) {
                System.out.println(((TextMessage) message).getText());
            }
        } catch (JMSException e) {
            e.printStackTrace();
        }
        System.out.println("end time：" + System.currentTimeMillis());

    }
}
