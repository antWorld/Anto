package com.busi.send;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/3/14
 */
public class Send {
    public static void main(String[] args) {
        ConnectionFactory connectionFactory;
        Connection connection = null;
        Session session;
        Destination destination;
        MessageProducer producer;

        connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER, ActiveMQConnection.DEFAULT_PASSWORD, "tcp://10.8.9.109:61616");
        try {
            connection = connectionFactory.createConnection();
            connection.start();
            session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
            destination = session.createQueue("anto.runData.queue");
            producer = session.createProducer(destination);
            producer.setDeliveryMode(DeliveryMode.PERSISTENT);
            //sendMessage(session, producer);
            MyThread thread = new MyThread(session,producer);
            thread.start();
            thread.join();
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }

    public static void sendMessage(Session session, MessageProducer producer) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"msgId\":\"1111111111\",");
        sb.append("\"userId\":\"1492\",");
        sb.append("\"inputs\":[{");
        sb.append("\"iType\":\"DEVICE_DATA\",");
        sb.append("\"identifyName\":\"deviceId\",");
        sb.append("\"identifyValue\":\"333333333\",");
        sb.append("\"fields\":[{");
        sb.append("\"iKey\":\"sleepStatus\",");
        sb.append("\"iValue\":\"7\"");
        sb.append("}] }],");
        sb.append("\"outputs\":[{");
        sb.append("\"oType\":\"DEVICE_DATA\",");
        sb.append("\"identifyName\":\"deviceSubTypeId\",");
        sb.append("\"identifyValue\":\"36001\",");
        sb.append("\"fields\":[{");
        sb.append("\"oKey\":\"configMode\",");
        sb.append("\"oValue\":\"3\"");
        sb.append("},{");
        sb.append("\"oKey\":\"runTime\",");
        sb.append("\"oValue\":\"31\"");
        sb.append("},{");
        sb.append("\"oKey\":\"stepId\",");
        sb.append("\"oValue\":\"59\"");
        sb.append("}] }]");
        sb.append("}");
        TextMessage message = session.createTextMessage("我是一条消息");
        System.out.println("发送消息" + "" + sb.toString());
        producer.send(message);
    }

}
