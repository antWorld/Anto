package com.busi.thread.test3;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/3/30
 */
public class MyThread extends Thread {
    private int i =5;
    @Override
    public void run(){
       /* try{
            System.out.println("run方法进入睡眠状态");
            Thread.currentThread().sleep(1000);
            System.out.println("run方法结束睡眠状态");
        }catch (InterruptedException e){
            System.out.println("run方法抛出一个interrupt异常");
        }
        System.out.println("run方法运行结束"+Thread.currentThread().isInterrupted());*/
        synchronized (this){
            System.out.println("i="+(i--)+"threadName="+Thread.currentThread().getName());
        }

    }
}



