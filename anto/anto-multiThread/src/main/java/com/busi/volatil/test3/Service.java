package com.busi.volatil.test3;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/4/28
 */
public class Service {
    private static int number;
    private static boolean flag;

    private static class myThread extends Thread{
        @Override
        public void run(){
            while(!flag){
                Thread.currentThread().yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args){
        new myThread().start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        number = 42;
        flag =true;
    }

}
