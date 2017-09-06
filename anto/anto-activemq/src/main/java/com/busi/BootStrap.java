package com.busi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author antoWorld
 * @description 主程序入口
 * @create 2017/3/14
 */
public class BootStrap {

    private static final Logger logger = LoggerFactory.getLogger(BootStrap.class);
    public static void main(String[] args){
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring-applicationContext.xml");
        logger.info("--------------service init success------------------");

     /*   JmsTemplate jmsTemplate = (JmsTemplate)context.getBean("jmsTemplateDataQueue");
        jmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                TextMessage message = session.createTextMessage("我是一条消息啊");
                return message;
            }
        });*/

    }
}
