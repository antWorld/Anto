package com.busi.test1;

import org.springframework.stereotype.Component;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/6/7 17:24
 */
@Component
public class GreetingImpl implements Greeting {
    public void say(String name) {
        System.out.println("hello"+name);
    }
}
