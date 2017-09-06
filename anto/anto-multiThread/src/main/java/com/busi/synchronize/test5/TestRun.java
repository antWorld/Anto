package com.busi.synchronize.test5;


/**
 * @author antoWorld
 * @description 描述
 * @create 2017/4/26
 */
public class TestRun {
    public static void main(String[] args){
        Service service2 = new Service();
        ThreadA threadA = new ThreadA(service2);
        ThreadB threadB = new ThreadB(service2);
        threadA.setName("A");
        threadA.start();
        threadB.setName("B");
        threadB.start();
    }
}
