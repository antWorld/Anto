package com.busi.countDownLatch.test1;

import java.util.concurrent.CountDownLatch;

/**
 * @author antoWorld
 * @description 模拟五人参加赛跑，听到开始后，按照先后顺序依次抵达终点
 * @create 2017/7/18 10:42
 */
public class Player extends Thread{
    private String name;
    private CountDownLatch begin;
    private CountDownLatch end;

    public Player(String name, CountDownLatch begin,CountDownLatch end){
        super();
        this.name = name;
        this.begin = begin;
        this.end = end;
    }
    public void run(){
        try {
            begin.await();
            //随机事件用来模拟比赛的耗时
            Thread.sleep((long)(Math.random()*1000));
            System.out.println("NO."+(Service.PLAY_NUM-end.getCount()+1)+": 线程"+this.name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
             end.countDown();
        }

    }
}
