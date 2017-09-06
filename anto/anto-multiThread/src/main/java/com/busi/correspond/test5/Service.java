package com.busi.correspond.test5;

/**
 * @author antoWorld
 * @description join方法初探
 * @create 2017/5/12
 */
public class Service {
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            /**
             * join带上时间参数和不带上时间参数是不一样的
             * 带上时间参数：则在指定时间内阻塞，之后直接唤醒
             * 0后者不带时间参数，则是一直阻塞直到子线程执行完毕，进行notifyAll唤醒（JVM中）
             */
            //myThread.join(1000);
            myThread.join(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end main Thread");
    }


}
 class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("start Thread:"+Thread.currentThread().getName());
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end Thread:"+Thread.currentThread().getName());
    }
}