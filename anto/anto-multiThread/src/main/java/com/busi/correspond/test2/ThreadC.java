package com.busi.correspond.test2;


/**
 * @author antoWorld
 * @description 描述
 * @create 2017/5/10
 */
public class ThreadC extends  Thread {
    private Service service;

    public ThreadC(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.testMethod();
    }
}
