package com.busi;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.listener.SessionAwareMessageListener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * @author antoWorld
 * @description 事件监听
 * @create 2017/3/14
 */
public class ListennerService implements SessionAwareMessageListener {
    private final static Logger logger = LoggerFactory.getLogger(ListennerService.class);

    public void onMessage(Message message, Session session) throws JMSException {
        TextMessage textMessage = (TextMessage) message;
        //System.out.println("content is " + textMessage.getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("监听到消息<<====content {}", JSON.toJSONString(textMessage.getText()));
    }
}
