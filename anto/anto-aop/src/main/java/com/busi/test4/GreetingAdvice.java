package com.busi.test4;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/**
 * @author antoWorld
 * @description 增强实现
 * MethodInterceptor 环绕增强接口
 * MethodBeforeAdvice 前置增强接口
 * AfterReturningAdvice 后置增强接口
 * ThrowsAdvice  抛出增强接口
 * DelegatingIntroductionInterceptor  引入增强接口
 * @create 2017/6/7 19:53
 */
@Component
public class GreetingAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕增强--method:"+methodInvocation.getMethod().getName()+"----begin--------------");
        Object result = methodInvocation.proceed();
        System.out.println("环绕增强--method:"+methodInvocation.getMethod().getName()+"----end--------------");
        return result;
    }
}
