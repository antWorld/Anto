package com.busi.reentrantLock.test5;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author antoWorld
 * @description ReentrantReadWriteLock 读写锁
 * @create 2017/5/19
 */
public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read(){
        try{
            lock.readLock().lock();
            System.out.println("Thread 获取读锁："+Thread.currentThread().getName()+" 时间："+System.currentTimeMillis());
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.readLock().unlock();
        }
    }
    public void write(){
        try{
            lock.writeLock().lock();
            System.out.println("Thread 获取写锁："+Thread.currentThread().getName()+" 时间："+System.currentTimeMillis());
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.writeLock().unlock();
        }
    }
    public static void main(String[] args){
        Service service = new Service();
        MyThread myThread1 = new MyThread(service,"A1");
        MyThread myThread3 = new MyThread(service,"A2");
        //MyThread myThread2 = new MyThread(service,"B");
        myThread1.start();
        //myThread2.start();
        myThread3.start();
    }
}
