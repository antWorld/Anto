package com.busi.countDownLatch.test2;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author antoWorld
 * @description 模拟接力赛跑 三组队，每个队有两个参赛员
 * @create 2017/7/18 11:17
 */
public class Service {
    public static int PLAY_NUM = 2;
    public static int QUEUE_NUM = 3;
    public static void main(String[] args){
        /**
         * 模拟裁判号令  当begin为0（即裁判喊了开始后），5个线程开始运行
         */
        CountDownLatch begin = new CountDownLatch(1);
        /**
         * 模拟每一组对的最后一棒选手到达终点
         */
        CountDownLatch next1 = new CountDownLatch(1);
        CountDownLatch next2 = new CountDownLatch(1);
        CountDownLatch next3 = new CountDownLatch(1);

        CountDownLatch total = new CountDownLatch(QUEUE_NUM);
        ExecutorService executorService1 = Executors.newFixedThreadPool(PLAY_NUM);
        executorService1.submit(new Player1("第一组1号", begin, next1));
        executorService1.submit(new Player1("第二组1号", begin, next2));
        executorService1.submit(new Player1("第三组1号", begin, next3));

        ExecutorService executorService2 = Executors.newFixedThreadPool(PLAY_NUM);
        executorService2.submit(new Player2("第一组2号", total, next1));
        executorService2.submit(new Player2("第二组2号", total, next2));
        executorService2.submit(new Player2("第三组2号", total, next3));

        System.out.println("接力赛跑开始：");
        begin.countDown();
        try {
            total.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("接力赛跑结束");
        executorService1.shutdown();
        executorService2.shutdown();
    }
}
