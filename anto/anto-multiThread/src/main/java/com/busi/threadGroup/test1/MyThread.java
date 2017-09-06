package com.busi.threadGroup.test1;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/6/19 9:39
 */
public class MyThread extends Thread {
    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    public void run() {
        System.out.println("线程："+Thread.currentThread().getName()+"开始要死循环了");
        while (!Thread.currentThread().isInterrupted()) {

        }
        System.out.println("线程："+Thread.currentThread().getName()+"结束了");
    }
}
