package com.busi.reentrantLock.test4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/5/15
 */
public class ValueObject {
    public static String value = new String("");

    public static void main(String[] args){
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        Service service = new Service(lock,condition);
        MyThread threadP = new MyThread(service);
        threadP.setName("product");
        MyThread threadC = new MyThread(service);
        threadC.setName("consumer");
        threadC.start();
        threadP.start();
    }



}
