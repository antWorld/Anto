package com.busi.reentrantLock.test4;

/**
 * @author antoWorld
 * @description ReentrantLock模拟单一生产者-单一消费者-操作值
 * @create 2017/5/15
 */
public class MyThread extends Thread {
    private Service service;

    public MyThread(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        try{
            while(true){
                if(Thread.currentThread().getName().equals("product")){
                    service.product();
                }else{
                    service.consumer();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
