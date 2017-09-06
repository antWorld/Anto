package com.busi.volatil.test1;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/4/27
 */
public class TestRun {
    public static void main(String[] args){
        Service service = new Service();
         new Thread(service).start();
        System.out.println("我要停止它 stopThread:"+Thread.currentThread().getName());
        service.setContinue(false);
    }
}
