package com.busi.synchronize.test3;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/4/25
 */
public class TestRun {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA threadA = new ThreadA(service);
            threadA.setName("A");
            threadA.start();
            Thread.sleep(5000);

            ThreadB threadB = new ThreadB(service);
            threadB.setName("B");
            threadB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
