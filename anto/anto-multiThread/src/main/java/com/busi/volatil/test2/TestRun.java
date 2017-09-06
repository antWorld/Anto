package com.busi.volatil.test2;


/**
 * @author antoWorld
 * @description 描述
 * @create 2017/4/27
 */
public class TestRun {
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            myThread.sleep(1000);
            myThread.setRunning(false);
            System.out.println("已经赋值为false");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
