package com.busi.correspond.test3;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/5/11
 */
public class ThreadC extends Thread {
    private Object lock;

    public ThreadC(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Consumer consumer = new Consumer(lock);
        try {
            while (true) {
                consumer.consumer();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
