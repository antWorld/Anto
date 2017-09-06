package com.busi.synchronize.test5;

/**
 * @author antoWorld
 * @description 验证synchronized锁住的是同步块中的代码
 * 其他未被锁住的代码是异步执行的
 * @create 2017/4/26
 */
public class Service {
    private static Object object = new Object();
    public void doTask(){
        synchronized(object){
            for(int i= 0;i<100;i++){
                System.out.println("Synchronized threadName:"+Thread.currentThread().getName()+" i="+(i+1));
            }
        }
    }

    synchronized public void doTask1(){
            for(int i= 0;i<100;i++){
                System.out.println("Synchronized threadName:"+Thread.currentThread().getName()+" i="+(i+1));
        }
    }
}
