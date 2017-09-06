package com.busi.correspond.test4;


/**
 * @author antoWorld
 * @description 描述
 * @create 2017/5/11
 */
public class TestRun {

    public static void main(String[] args) {
        try {
            Object object = new Object();
            Product product = new Product(object);
            Consumer consumer = new Consumer(object);
            ThreadP[] threadP = new ThreadP[2];
            ThreadC[] threadC = new ThreadC[2];
            for (int i = 0; i < 2; i++) {
                threadP[i] = new ThreadP(product);
                threadP[i].setName("生产者" + (i+1));
                threadC[i] = new ThreadC(consumer);
                threadC[i].setName("消费者" + (i+1));
                threadP[i].start();
                threadC[i].start();
            }

            Thread.sleep(5000);
            Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
            Thread.currentThread().getThreadGroup().enumerate(threadArray);
            for (int i = 0; i < threadArray.length; i++) {
                System.out.println(threadArray[i].getName() + " " + threadArray[i].getState());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
