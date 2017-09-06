package com.busi.thread.test5;

/**
 * @author antoWorld
 * @description sleep状态下停止线程
 * @create 2017/4/24
 */
public class MyThread extends  Thread {
    @Override
    public void run() {
        super.run();
        try{
            for(int i = 0;i<500000;i++){
                System.out.println("i="+(i+1));
            }
            System.out.println("run begin");
            Thread.currentThread().sleep(200000);
            System.out.println("run end");
        }catch (InterruptedException e){
            System.out.println("先interrupt,再sleep，中断状态为:"+this.isInterrupted());
            e.printStackTrace();
        }
    }
    /*public void run() {
        super.run();
        try{
            System.out.println("run begin");
            Thread.currentThread().sleep(200000);
            System.out.println("run end");
        }catch (InterruptedException e){
            System.out.println("沉睡中被interrupt,中断状态为:"+this.isInterrupted());
            e.printStackTrace();
        }
    }*/

}
