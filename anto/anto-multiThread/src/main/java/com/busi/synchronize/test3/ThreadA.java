package com.busi.synchronize.test3;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/4/25
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service){
        super();
        this.service = service;
    }
    @Override
    public void run() {
        super.run();
        service.testMethod();
    }
}
