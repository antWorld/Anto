package com.busi.synchronize.test6;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/7/3 9:34
 */
public class TestRun {
    public static void main(String[] args){
        Service service = new Service();
        MyThread thread1= new MyThread("A",service);
        MyThread thread2= new MyThread("B",service);
        thread1.start();
        thread2.start();
    }
}
