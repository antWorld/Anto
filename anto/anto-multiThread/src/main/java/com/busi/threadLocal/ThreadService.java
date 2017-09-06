package com.busi.threadLocal;

/**
 * @author antoWorld
 * @description 多个线程共同使用各自线程的threadLocal变量域
 * @create 2017/5/13
 */
public class ThreadService implements Runnable {
    private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
        //通过覆写其初始化方法，使其初始化值对所有线程起效
        @Override
        protected Integer initialValue() {
            return 100;
        }
    };

    public void run() {
        synchronized (this){
            System.out.println("threadName:"+Thread.currentThread().getName()+"之前的值是:"+threadLocal.get());
            threadLocal.set((int)(Math.random()*100));
            System.out.println("threadName:"+Thread.currentThread().getName()+threadLocal.get());
        }
    }

    public static void main(String[] args){
        ThreadService service = new ThreadService();
        Thread thread1 = new Thread(service);
        Thread thread2 = new Thread(service);
        thread1.start();
        thread2.start();
    }
}
