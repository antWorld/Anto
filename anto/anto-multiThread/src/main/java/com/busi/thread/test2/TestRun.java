package com.busi.thread.test2;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/3/29
 */
public class TestRun {
    public static void main(String args[]){

        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            //System.out.println("是否停止1？="+myThread.isInterrupted());
            myThread.interrupt();
            System.out.println("是否停止2？="+myThread.isInterrupted());
            System.out.println("是否停止3？="+myThread.isInterrupted());
        } catch (Exception e) {
           System.out.println( e.getMessage());
        }

        System.out.println("end");
    }



}
