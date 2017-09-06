package com.busi.correspond.test3;

/**
 * @author antoWorld
 * @description 一个生产者-一个消费者模型
 * @create 2017/5/11
 */
public class Consumer {
    private Object lock;

    public Consumer(Object lock){
        super();
        this.lock = lock;
    }

    public void consumer() throws InterruptedException{
        synchronized (lock){
            //没有可消费的操作值时，阻塞消费者线程
            if(ValueObject.value.equals("")){
                lock.wait();
            }
            System.out.println(Thread.currentThread().getName()+"消费值："+ValueObject.value);
            //消费完将操作值置空
            ValueObject.value = "";
            lock.notify();
        }
    }
}
