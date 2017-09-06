package com.busi.thread.test1;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/3/28
 */
public class MyThread extends Thread {
    public MyThread(){
        System.out.println("-------construct begin-------");
        System.out.println(Thread.currentThread().getName());
        System.out.println(this.getName());
        System.out.println("-------construct begin-------");
    }
    @Override
     public void run() {
        System.out.println("-------run begin-------");
        System.out.println(Thread.currentThread().getName());
        System.out.println(this.getName());
        System.out.println("-------run end-------");
    }

    public static void main(String[] args) {

        MyThread myThread = new MyThread();//MyThread 集成了Thread类
       Thread a = new Thread(myThread,"A");
        a.start();
    }
}
