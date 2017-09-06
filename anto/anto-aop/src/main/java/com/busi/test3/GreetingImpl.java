package com.busi.test3;

import org.springframework.stereotype.Component;

/**
 * @author antoWorld
 * @description 引入切面
 * 切面封装了增强和切点
 * @create 2017/6/7 19:57
 */
@Component
public class GreetingImpl implements Greeting {
    public void doSleep(String name) {
        System.out.println("doSleep :"+name);
    }

    public void doWork(String name) {
        System.out.println("doWork :"+name);
    }

    public void sayHello(String name){
        System.out.println("sayHello :"+name);
    }
}
