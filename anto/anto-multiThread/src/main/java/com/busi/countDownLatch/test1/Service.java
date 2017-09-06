package com.busi.countDownLatch.test1;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author antoWorld
 * @description 模拟五人参加赛跑，听到开始后，按照先后顺序依次抵达终点
 * @create 2017/7/18 10:27
 */
public class Service {
    public static int PLAY_NUM = 5;
    public static void main(String[] args){
        /**
         * 模拟裁判号令  当begin为0（即裁判喊了开始后），5个线程开始运行
         */
         CountDownLatch begin = new CountDownLatch(1);
        /**
         * 模拟当一个线程到达终点后，名次递减 ，5个名次递减完即表示比赛结束
         */
         CountDownLatch end = new CountDownLatch(PLAY_NUM);

        ExecutorService executorService = Executors.newFixedThreadPool(PLAY_NUM);
        for(int i=0;i<PLAY_NUM;i++){
            Player player = new Player(String.valueOf(i+1),begin,end);
            executorService.submit(player);
        }
        System.out.println("跑步开始：");
        begin.countDown();
        try {
            end.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("跑步结束");
        executorService.shutdown();
    }
}
