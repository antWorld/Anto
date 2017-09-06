package com.busi.correspond.test5;


/**
 * @author antoWorld
 * @description 描述
 * @create 2017/5/12
 */
public class ThreadA extends Thread {
    private ThreadB threadB;

    public ThreadA(ThreadB threadB){
        super();
        this.threadB = threadB;
    }

    @Override
    public void run(){
        synchronized (threadB){
            System.out.println("begin A threadName:"+Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end A threadName:"+Thread.currentThread().getName());
        }

    }
}
