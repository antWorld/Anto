package com.busi.volatil.test2;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/4/27
 */
public class MyThread extends Thread{

    volatile  private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run(){
        System.out.println("进入run方法了");
        while (isRunning){

        }
        System.out.println("线程被停止了");
    }
}
