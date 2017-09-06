package com.busi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/3/23
 */
public class BootStrap {
    private static final Logger logger = LoggerFactory.getLogger(BootStrap.class);
    public static void main(String[] args){
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring-applicationContext.xml");
        logger.info("--------------service init success------------------");
        SendMessageService sendMessageService = (SendMessageService)context.getBean("sendMessageService");
        for(int i = 0;i<10000;i++){
            sendMessageService.send("message:"+i);
            logger.info("send success message{}","message"+i);
        }
    }
}
