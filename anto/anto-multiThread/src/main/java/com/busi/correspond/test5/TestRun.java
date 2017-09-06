package com.busi.correspond.test5;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/5/12
 */
public class TestRun {
    public static void main(String[] args){
        ThreadB threadB = new ThreadB();
        ThreadA threadA  = new ThreadA(threadB);
        threadA.start();
        threadB.start();
        try {
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main end "+System.currentTimeMillis());
    }
}
