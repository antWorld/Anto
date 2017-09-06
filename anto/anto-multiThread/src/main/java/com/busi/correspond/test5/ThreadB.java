package com.busi.correspond.test5;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/5/12
 */
public class ThreadB extends Thread {
    @Override
    synchronized  public void run(){
        System.out.println("begin B threadName:"+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end B threadName:"+Thread.currentThread().getName());
    }
}
