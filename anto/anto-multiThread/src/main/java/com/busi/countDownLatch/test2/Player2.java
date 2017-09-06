package com.busi.countDownLatch.test2;
import java.util.concurrent.CountDownLatch;

/**
 * @author antoWorld
 * @description 接力赛跑的第二棒选手线程
 * @create 2017/7/18 11:16
 */
public class Player2 extends Thread{
    private String name;
    private CountDownLatch next;
    private CountDownLatch total;

    public Player2(String name, CountDownLatch total, CountDownLatch next){
        super();
        this.name = name;
        this.total = total;
        this.next = next;
    }
    public void run(){
        try {
            next.await();
            System.out.println("time: "+String.format("%tF  %<tT", System.currentTimeMillis())+"  "+this.name+"开始");
            //随机事件用来模拟比赛的耗时
            Thread.sleep((long)(Math.random()*1000)+10000);
            System.out.println("time: "+String.format("%tF  %<tT", System.currentTimeMillis())+"  NO."+(Service.QUEUE_NUM-total.getCount()+1)+": "+this.name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            total.countDown();
        }

    }
}
