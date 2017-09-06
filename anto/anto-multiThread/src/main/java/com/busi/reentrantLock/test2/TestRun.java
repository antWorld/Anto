package com.busi.reentrantLock.test2;


/**
 * @author antoWorld
 * @description 描述
 * @create 2017/5/15
 */
public class TestRun {
    public static void main(String[] args) {
        Service service = new Service();
        MyThread myThread1 = new MyThread(service);
        MyThread myThread2 = new MyThread(service);
        myThread1.setName("A");
        myThread2.setName("B");
        myThread1.start();
        myThread2.start();
    }
}
