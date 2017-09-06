package com.busi.threadGroup.test3;

/**
 * @author antoWorld
 * @description 通过线程组来对线程内的异常进行处理
 * @create 2017/6/20 13:35
 */
public class TestRun {
    public static void main(String[] args){
        MyThreadGroup group = new MyThreadGroup("线程组");
        MyThread myThread = new MyThread("A",group);
        myThread.start();
    }
}
