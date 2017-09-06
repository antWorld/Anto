package com.busi.threadLocal;

/**
 * @author antoWorld
 * @description 多个线程共同使用改变static变量值
 * @create 2017/5/13
 */
public class Service implements Runnable {
    private static String variable = "aa";
    public void run() {
        synchronized (this){
            System.out.println("threadName:"+Thread.currentThread().getName()+" 之前的值是:"+variable);
            variable = Thread.currentThread().getName()+String.valueOf((int)(Math.random()*100));
            System.out.println("threadName:"+Thread.currentThread().getName()+" 之后的值是:"+variable);
        }
    }

    public static void main(String[] args){
        Service service = new Service();
        Thread thread1 = new Thread(service);
        Thread thread2 = new Thread(service);
        thread1.start();
        thread2.start();
    }
}
