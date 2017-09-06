package com.busi.reentrantLock.test1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author antoWorld
 * @description lock锁机制保证线程的同步性
 * @create 2017/5/15
 */
public class Service {
    private Lock lock = new ReentrantLock();

    public void testMethod() {
        try {
            lock.lock();
            for (int i = 0; i < 5; i++) {
                System.out.println("ThreadName is" + Thread.currentThread().getName() + " number:" + (i + 1));
            }
        } finally {
            lock.unlock();
        }

    }
}
