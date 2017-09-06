package com.busi.correspond.test1;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/5/10
 */
public class ThreadA extends Thread {
    private Service lock;
    public ThreadA(Service lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run(){
        synchronized (lock){
            System.out.println("start wait:"+System.currentTimeMillis());
            try {
                lock.wait();
                //当Thread.sleep（）方法时，当前线程拥有lock对象锁，那么并不会释放该锁，
                // 而是直接使当前线程进入休眠状态，到期后重新进入可运行状态
               // Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end wait:"+System.currentTimeMillis());
        }
    }
}
