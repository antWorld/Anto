package com.busi.test5;

import org.springframework.stereotype.Component;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/6/9 14:15
 */
@Component
public class GreetingImpl implements Greeting {
    public void doEat(String name) {
        System.out.println("do Eat: "+name);
    }
}
