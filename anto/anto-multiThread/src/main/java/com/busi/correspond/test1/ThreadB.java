package com.busi.correspond.test1;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/5/10
 */
public class ThreadB extends Thread {
    private Service lock;
    public ThreadB(Service lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run(){
        synchronized (lock){
            System.out.println("start notify:" + System.currentTimeMillis());
            lock.notify();
            System.out.println("end notify:" + System.currentTimeMillis());
        }
    }
}
