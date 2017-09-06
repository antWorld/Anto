package com.busi.synchronize.test3;

/**
 * @author antoWorld
 * @description 模拟线程访问抛出异常时，将自动释放锁
 * @create 2017/4/25
 */
public class Service {
    synchronized  public void testMethod(){
        System.out.println("Thread:"+Thread.currentThread().getName()+" run begin time:"+System.currentTimeMillis());
        if(Thread.currentThread().getName().equals("A")){
            while(true){
                if((""+Math.random()).substring(0,8).equals("0.123456")){
                    System.out.println("Thread:"+Thread.currentThread().getName()+" run end time:"+System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        }else{
            System.out.println("Thread: B run end time:"+System.currentTimeMillis());
        }
    }
}
