package com.busi.synchronize.test5;


import com.busi.synchronize.test5.Service;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/4/24
 */
public class ThreadB extends Thread {


    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.doTask1();
    }
}

