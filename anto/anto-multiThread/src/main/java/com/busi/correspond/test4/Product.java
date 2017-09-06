package com.busi.correspond.test4;

/**
 * @author antoWorld
 * @description 多个生产者-多个消费者模型
 * @create 2017/5/11
 */
public class Product {
    private Object lock;

    public Product(Object lock){
        super();
        this.lock = lock;
    }

    public void product() throws InterruptedException{
        synchronized (lock){
            //生产的操作值未被消费时进行 阻塞生产者线程
            if(!ValueObject.value.equals("")){
                System.out.println("生产者： "+Thread.currentThread().getName()+" waiting");
                lock.wait();
            }
            String value = System.currentTimeMillis()+"_"+(int)(Math.random()*100);
            System.out.println("生产者： "+Thread.currentThread().getName()+" 生产值："+value);
            //将生产的值赋值
            ValueObject.value = value;
            lock.notify();

        }
    }
}
