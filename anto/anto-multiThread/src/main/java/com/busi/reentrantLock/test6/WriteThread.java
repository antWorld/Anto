package com.busi.reentrantLock.test6;


import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/7/20 11:04
 */
public class WriteThread extends Thread {
    private ReentrantReadWriteLock lock;

    public WriteThread(ReentrantReadWriteLock lock) {
        this.lock = lock;
    }

    public void run() {
        lock.writeLock().lock();
        System.out.println("开始要写啦");
        lock.readLock().lock();
        System.out.println("WriteThread 1 value is:" + ValueObject.value);
        ValueObject.value = "bb";
        System.out.println("开始要写啦");
        try {
            Thread.sleep(3000);
            System.out.println("WriteThread 2 value is:" + ValueObject.value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
            System.out.println("写入结束啦");
        }
    }
}
