package com.busi.synchronize.test4;


/**
 * @author antoWorld
 * @description 描述
 * @create 2017/4/24
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.doTask();
    }
}
