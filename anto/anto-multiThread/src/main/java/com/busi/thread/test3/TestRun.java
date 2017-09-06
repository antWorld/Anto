package com.busi.thread.test3;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/3/30
 */
public class TestRun {
    public static void main(String[] args) {
        /*MyThread thread = new MyThread();
        thread.start();
        try{
            Thread.currentThread().sleep(1000);
        }catch (InterruptedException e){
            System.out.println("main抛出一个异常");
        }
        thread.interrupt();*/
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);
        Thread thread3 = new Thread(myThread);
        Thread thread4 = new Thread(myThread);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
