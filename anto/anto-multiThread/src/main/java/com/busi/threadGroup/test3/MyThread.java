package com.busi.threadGroup.test3;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/6/20 13:35
 */
public class MyThread extends Thread {
    private String number;

    public MyThread(String number,ThreadGroup group) {
        super(group,number);
        this.number = number;
    }

    public void run() {
        Integer result = Integer.parseInt(number);
        System.out.println("The result is:" + (result + 1));
    }
}
