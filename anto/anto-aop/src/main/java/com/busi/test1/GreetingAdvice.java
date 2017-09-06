package com.busi.test1;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;
import org.springframework.stereotype.Component;

/**
 * @author antoWorld
 * @description 对类的增强-引入增强 Introduction Advice
 * 代理了Greeting实现类，同时可以调用Apoly中的saySorry方法
 * @create 2017/6/7 17:25
 */
@Component
public class GreetingAdvice extends DelegatingIntroductionInterceptor implements Apoly {
    public void saySorry(String name) {
        System.out.println("say sorry"+name);
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        return super.invoke(mi);
    }
}
