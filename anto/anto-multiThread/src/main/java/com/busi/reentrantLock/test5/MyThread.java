package com.busi.reentrantLock.test5;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/5/19
 */
public class MyThread extends Thread {
    private Service service;

    public MyThread(Service service,String threadName) {
        this.setName(threadName);
        this.service = service;
    }

    @Override
    public void run() {
        if(Thread.currentThread().getName().startsWith("A")){
            service.read();
        }else {
            service.write();
        }
    }
}
