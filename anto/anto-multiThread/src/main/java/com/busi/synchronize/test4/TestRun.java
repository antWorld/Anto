package com.busi.synchronize.test4;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/4/26
 */
public class TestRun {
    public static void main(String[] args){
        Service service1 = new Service();
        Service service2 = new Service();

        ThreadA threadA = new ThreadA(service1);
        ThreadB threadB = new ThreadB(service2);
        threadA.setName("A");
        threadA.start();
        threadB.setName("B");
        threadB.start();
    }
}
