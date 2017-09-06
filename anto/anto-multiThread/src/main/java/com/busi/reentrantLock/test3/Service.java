package com.busi.reentrantLock.test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author antoWorld
 * @description Lock 与 Condition
 * Lock与 wait、notify
 * @create 2017/5/15
 */
public class Service {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void testMethodA(){
        lock.lock();
        System.out.println("begin methodA,the ThreadName:"+Thread.currentThread().getName());
        try {
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
        System.out.println("end methodA,the ThreadName:"+Thread.currentThread().getName());
    }

    public void testMethodB(){
        lock.lock();
        System.out.println("begin methodB,the ThreadName:"+Thread.currentThread().getName());
        try {
            condition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
        System.out.println("end methodB,the ThreadName:"+Thread.currentThread().getName());
    }

    public static void main(String[] args){
        Service service = new Service();
        MyThread myThread1 = new MyThread(service);
        MyThread myThread2 = new MyThread(service);
        myThread1.setName("A");
        myThread2.setName("B");
        myThread1.start();
        myThread2.start();
    }
}
