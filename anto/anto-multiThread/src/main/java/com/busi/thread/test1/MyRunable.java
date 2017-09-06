package com.busi.thread.test1;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/3/28
 */
public class MyRunable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName()+": implement runable interface");
    }

}
