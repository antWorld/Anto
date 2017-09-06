package com.busi.correspond.test2;


/**
 * @author antoWorld
 * @description 描述
 * @create 2017/5/10
 */
public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service lock){
        super();
        this.service = lock;
    }

    @Override
    public void run(){
        service.testMethod();
    }
}
