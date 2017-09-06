package com.busi.correspond.test1;


/**
 * @author antoWorld
 * @description 线程间通过wait和notify进行通信
 * @create 2017/5/10
 */
public class Service {
    public static void main(String[] args){
        Service lock = new Service();
        ThreadA threadA = new ThreadA(lock);
        threadA.start();
        ThreadB threadB = new ThreadB(lock);
        threadB.start();
    }
}
