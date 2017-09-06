package com.busi.synchronize.test6;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/7/3 9:32
 */
public class Service {
    synchronized public static void methodA() {
        System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end methodA");
    }


    synchronized public void methodB() {
        System.out.println("begin methodB threadName=" + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end methodB");
    }
}
