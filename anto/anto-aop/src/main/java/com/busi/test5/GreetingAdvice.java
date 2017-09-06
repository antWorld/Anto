package com.busi.test5;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
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
@Aspect
public class GreetingAdvice  {

    @Around("execution(* com.busi.test5.GreetingImpl.*(..))")
    public Object invoke(ProceedingJoinPoint methodInvocation) throws Throwable {
        System.out.println("环绕增强--method:"+methodInvocation.getSignature().getName()+"----begin--------------");
        Object result = methodInvocation.proceed();
        System.out.println("环绕增强--method:"+methodInvocation.getSignature().getName()+"----end--------------");
        return result;
    }
}
