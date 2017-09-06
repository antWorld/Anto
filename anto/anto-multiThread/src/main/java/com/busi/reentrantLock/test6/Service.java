package com.busi.reentrantLock.test6;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author antoWorld
 * @description 验证当获取读入锁  当前线程持有写入锁可以成功获取读入锁 ，反之则失败
 * @create 2017/7/20 11:00
 */
public class Service {
    public static void main(String[] args){
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        new ReadThread(lock).start();
        new WriteThread(lock).start();
    }
}
