package com.busi.reentrantLock.test1;

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
        service.testMethod();
    }
}
