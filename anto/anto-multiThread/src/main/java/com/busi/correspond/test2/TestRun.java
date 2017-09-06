package com.busi.correspond.test2;


/**
 * @author antoWorld
 * @description 描述
 * @create 2017/5/10
 */
public class TestRun {
    public static void main(String[] args){
        /**
         * 如果四个线程调用的不是同一个service对象
         * 则wait等待不是同一个Monitor监视器，则都将持续阻塞而不会被唤醒
         */
        Service service = new Service();
        ThreadC threadC = new ThreadC(service);
        threadC.start();
        ThreadB threadB = new ThreadB(service);
        threadB.start();
        ThreadA threadA = new ThreadA(service);
        threadA.start();

        NotifyThread notifyThread = new NotifyThread(service);
        notifyThread.start();
    }
}
