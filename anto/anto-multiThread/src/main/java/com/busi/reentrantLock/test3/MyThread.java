package com.busi.reentrantLock.test3;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/5/15
 */
public class MyThread extends Thread {
    private Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("A")){
            service.testMethodA();
        }else{
            service.testMethodB();
        }

    }
}
