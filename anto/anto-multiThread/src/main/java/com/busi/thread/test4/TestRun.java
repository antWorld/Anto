package com.busi.thread.test4;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/4/24
 */
public class TestRun {
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(2000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end ");
    }
}
