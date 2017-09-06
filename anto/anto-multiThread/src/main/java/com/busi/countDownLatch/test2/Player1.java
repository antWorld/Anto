package com.busi.countDownLatch.test2;
import java.util.concurrent.CountDownLatch;

/**
 * @author antoWorld
 * @description 接力赛跑第一棒选手线程
 * @create 2017/7/18 11:16
 */
public class Player1 extends Thread{
    private String name;
    private CountDownLatch begin;
    //
    private CountDownLatch next;

    public Player1(String name, CountDownLatch begin, CountDownLatch next){
        super();
        this.name = name;
        this.begin = begin;
        this.next = next;
    }
    public void run(){
        try {
            begin.await();
            //随机事件用来模拟比赛的耗时
            Thread.sleep((long)(Math.random()*1000)+10000);
            System.out.println("time: "+String.format("%tF  %<tT", System.currentTimeMillis())+"  "+this.name+"到达,第二棒开始");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            next.countDown();
        }

    }
}
