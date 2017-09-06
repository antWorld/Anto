package com.busi.correspond.test2;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/5/10
 */
public class NotifyThread extends Thread {
    private   Service service;
    public NotifyThread(Service service){
        super();
        this.service = service;
    }
    @Override
    public void run(){
        synchronized (service){
            System.out.println("获取到了锁,执行notify方法将释放锁并唤醒一个线程");
            //notify()方法只可唤醒一个线程，其他未被唤醒依旧是等待notify
            service.notify();
            /**
             * notifyAll则可一次性唤醒全部的线程进入就绪状态
             * 同一时刻只有一个线程可以获得Monitor监视器
             */
            //service.notifyAll();
            System.out.println("要先执行我才能释放锁");
        }
    }
}
