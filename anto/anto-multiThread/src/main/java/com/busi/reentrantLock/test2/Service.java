package com.busi.reentrantLock.test2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author antoWorld
 * @description lock锁机制保证线程的同步性
 * @create 2017/5/15
 */
public class Service {
    private Lock lock = new ReentrantLock();

    public void testMethodA() {
        try {
            lock.lock();
                System.out.println("ThreadName is: " + Thread.currentThread().getName() + "  methodA begin");
            Thread.sleep(3000);
            System.out.println("ThreadName is: " + Thread.currentThread().getName() + "  methodA end");
        } catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }

    /**
     * 获取的都是同一个service对象的锁，如果 testMethodA方法正在访问，则其他需要获取锁操作的方法将同步阻塞
     * 反之，非同步方法可异步调用，与synchronized是一致的
     */
    public void testMethodB() {
        try {
            //lock.lock();
            System.out.println("ThreadName is: " + Thread.currentThread().getName() + "  methodB begin");
            Thread.sleep(3000);
            System.out.println("ThreadName is: " + Thread.currentThread().getName() + "  methodB end");
        } catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            //lock.unlock();
        }

    }
}
