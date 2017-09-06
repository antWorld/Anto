package com.busi.synchronize.test1;

/**
 * @author antoWorld
 * @description 线程锁住的是对象,而非方法
 * @create 2017/4/24
 */
public class MyObject {
    synchronized  public void methodA(){
        try{
            System.out.println("begin methodA threadNmme="+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    /**
     * 调用B方法时，如果B方法没有synchronized修饰，则当A线程访问A方法时，B线程可以访问B方法
     */
    synchronized public void methodB(){
        try{
            System.out.println("begin methodB threadNmme="+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
