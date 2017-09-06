package com.busi.correspond.test4;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/5/11
 */
public class ThreadP extends Thread {
    private Product product;

    public ThreadP(Product product) {
        super();
        this.product = product;
    }

    @Override
    public void run() {
        try {
            while (true) {
                product.product();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
