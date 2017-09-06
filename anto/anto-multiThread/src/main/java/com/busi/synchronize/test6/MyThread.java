package com.busi.synchronize.test6;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/7/3 9:35
 */
public class MyThread extends Thread {
    private Service service;
    public MyThread(String name,Service service){
        super(name);
        this.service = service;

    }
    public void run(){
        if(Thread.currentThread().getName().equals("A")){
            service.methodA();
        }else{
            service.methodB();
        }
        //service.methodA();
    }
}
