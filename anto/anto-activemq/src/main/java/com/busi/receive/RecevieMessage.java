package com.busi.receive;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @author antoWorld
 * @description 同步方式接收消息
 * @create 2017/6/30 10:47
 */
public class RecevieMessage {
    public static void recevieMessage() {
        try {
            ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER, ActiveMQConnection.DEFAULT_PASSWORD, "tcp://10.8.9.109:61616");
            Connection connection = connectionFactory.createConnection();
            connection.start();

            Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
            MessageConsumer consumer = session.createConsumer(session.createQueue("anto.runData.queue"));
            System.out.println("mainThread start time：" + System.currentTimeMillis());
            //没有指定timeout，将持续阻塞直到消息到达或者consumer关闭
            Message message = consumer.receive();
            if (null != message) {
                System.out.println("mainThread "+((TextMessage) message).getText());
                Thread.sleep(1000);
            }
            System.out.println("mainThread end time：" + System.currentTimeMillis());
            consumer.close();
            session.close();
            connection.close();
        } catch (JMSException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        RecevieMessage.recevieMessage();
    }
}
