package com.busi.correspond.test2;

/**
 * @author antoWorld
 * @description 验证notify唤醒的只有等待该锁的阻塞线程
 * @create 2017/5/10
 */
public class Service {

    public void testMethod(){
        synchronized (this){
            try {
                System.out.println("start thread is"+Thread.currentThread().getName());
                //执行wait后，线程将释放锁进入同步阻塞队列，等待唤醒
                this.wait();
                System.out.println("被唤醒的线程是:"+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
