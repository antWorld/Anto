package com.busi.synchronize.test4;

/**
 * @author antoWorld
 * @description 验证synchronized锁住的是同步块中的代码
 * 其他未被锁住的代码是异步执行的
 * @create 2017/4/26
 */
public class Service {
    private static Object object = new Object();
    public void doTask(){
        for(int i= 0;i<100;i++){
            try {
                Thread.sleep(100);
                System.out.println("noSynchronized threadName:"+Thread.currentThread().getName()+"  i="+(i+1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //synchronized (Service.class)
       // synchronized (this)
        synchronized(object){
            for(int i= 0;i<100;i++){
                System.out.println("Synchronized threadName:"+Thread.currentThread().getName()+" i="+(i+1));
            }
        }
    }
}
