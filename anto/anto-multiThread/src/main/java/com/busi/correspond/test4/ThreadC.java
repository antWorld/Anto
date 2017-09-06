package com.busi.correspond.test4;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/5/11
 */
public class ThreadC extends Thread {
    private Consumer consumer;

    public ThreadC(Consumer consumer) {
        super();
        this.consumer = consumer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                consumer.consumer();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
