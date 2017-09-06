package com.busi.reentrantLock.test4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author antoWorld
 * @description ReentrantLock模拟单一生产者-单一消费者-操作值
 * @create 2017/5/15
 */
public class Service {

    private Lock lock;
    private Condition condition;

    public Service(Lock lock, Condition condition) {
        this.lock = lock;
        this.condition = condition;
    }

    public void consumer() throws Exception {
        try{
            lock.lock();
            if (ValueObject.value.equals("")) {
                condition.await();
            }
            System.out.println(Thread.currentThread().getName()+"消费值："+ValueObject.value);
            //将生产的值赋值
            ValueObject.value = "";
            condition.signal();
        }finally {
            lock.unlock();
        }

    }
    public void product()throws Exception {
        try{
            lock.lock();
            //生产的操作值未被消费时进行 阻塞生产者线程
            if(!ValueObject.value.equals("")){
                condition.await();
            }
            String value = System.currentTimeMillis()+"_"+(int)(Math.random()*100);
            System.out.println(Thread.currentThread().getName()+"生产值："+value);
            //将生产的值赋值
            ValueObject.value = value;
            condition.signal();
        }finally {
            lock.unlock();
        }

    }
}
