package com.busi.correspond.test3;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/5/11
 */
public class ThreadP extends Thread {
    private Object lock;

    public ThreadP(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Product product = new Product(lock);
        try {
            while (true) {
                product.product();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
