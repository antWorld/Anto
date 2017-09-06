package com.busi.thread.test2;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/3/29
 */
public class MyThread extends  Thread {
    @Override
    public void run() {
        super.run();
        for(int i=0;i<50000;i++){

            System.out.println("i="+(i+1));
        }
    }
}
