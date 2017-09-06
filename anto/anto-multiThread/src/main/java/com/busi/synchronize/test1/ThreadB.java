package com.busi.synchronize.test1;

import com.busi.synchronize.test1.MyObject;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/4/24
 */
public class ThreadB extends Thread {
    private MyObject object;

    public ThreadB(MyObject object){
        super();
        this.object = object;
    }
    @Override
    public void run() {
        super.run();
        object.methodB();
    }
}
