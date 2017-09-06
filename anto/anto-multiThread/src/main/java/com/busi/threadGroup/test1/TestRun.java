package com.busi.threadGroup.test1;

/**
 * @author antoWorld
 * @description 通过线程组管理组内线程使其停止
 * @create 2017/6/19 9:43
 */
public class TestRun {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("线程组");
        for (int i = 0; i < 5; i++) {
            new MyThread(group, "线程" + i).start();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        group.interrupt();
        System.out.println("调用了interrupt方法");
    }
}
