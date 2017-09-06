package com.busi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/3/23
 */
public class SendMessageService {
    @Autowired
    private JmsTemplate jmsTemplateDataQueue;

    public void send(String message){
        final String data = message;
        try{
            jmsTemplateDataQueue.send(new MessageCreator() {
                public Message createMessage(Session session) throws JMSException {
                    TextMessage textMessage = session.createTextMessage();
                    textMessage.setText(data);
                    return textMessage;
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
