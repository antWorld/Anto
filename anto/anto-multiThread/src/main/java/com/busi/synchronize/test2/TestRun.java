package com.busi.synchronize.test2;

/**
 * @author antoWorld
 * @description 同一个对象中的值被多个线程改变
 * @create 2017/4/24
 */
public class TestRun {
    public static void main(String[] args){
        MyObject object = new MyObject();
        MyThread myThread =new MyThread(object);
        myThread.start();
        try {
            /**
             * 如果main线程睡眠时间足够大，则调用object的getValue方法时，userName和password值为myThread线程更改后的值
             * 比价小时，则有可能出现先调用getValue或者myThread的setValue方法设置了一个值，getValue方法就被调用
             * 从而出现不可预估的结果
             */
            Thread.sleep(10);
            object.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
