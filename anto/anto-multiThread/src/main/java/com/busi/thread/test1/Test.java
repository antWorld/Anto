package com.busi.thread.test1;

import com.busi.thread.test1.MyRunable;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/3/28
 */
public class Test {
    public static void main(String[] args){
        Runnable runnable = new MyRunable();//MyRunable实现了Runable接口
        Thread thread = new Thread(runnable,"a");
        thread.start();
    }

}
