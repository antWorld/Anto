package com.busi.reentrantLock.test6;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/7/20 11:04
 */
public class ReadThread extends Thread {
    private ReentrantReadWriteLock lock;
    public ReadThread(ReentrantReadWriteLock lock){
        this.lock = lock;
    }
    public void run(){
        lock.readLock().lock();
        System.out.println("开始要读啦");
        try {
            Thread.sleep(3000);
            System.out.println("ReadThread value is:"+ValueObject.value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.readLock().unlock();
            System.out.println("读取结束啦");
        }
    }
}
