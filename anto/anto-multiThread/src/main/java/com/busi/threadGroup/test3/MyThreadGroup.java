package com.busi.threadGroup.test3;

/**
 * @author antoWorld
 * @description
 * @create 2017/6/20 13:49
 */
public class MyThreadGroup extends ThreadGroup {
    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        System.out.println("线程组的异常处理");
        e.printStackTrace();
    }
}
