package com.busi.synchronize.test1;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/4/24
 */
public class TestRun {
    public static void main(String[] args){
        /**
         * 1.A线程持有Object对象的Lock锁，B线程可以以异步的方式访问Object对象中非synchronized类型的方法
         * 2.A线程持有object对象的Lock锁，B线程如果这时候调用object对象的synchronized类型的方法则需要等待，也就是同步
         */
        MyObject myObject = new MyObject();
        ThreadA threadA = new ThreadA(myObject);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(myObject);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
