package com.busi.synchronize.test2;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/4/24
 */
public class MyThread extends Thread {
    private MyObject object;

    public MyThread(MyObject object){
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.setValue("B","BB");
    }
}
