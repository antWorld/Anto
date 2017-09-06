package com.busi.volatil.test1;


/**
 * @author antoWorld
 * @description 描述
 * @create 2017/4/27
 */
public class Service implements Runnable{
    private boolean isContinue = true;

    public boolean isContinue() {
        return isContinue;
    }

    public void setContinue(boolean aContinue) {
        isContinue = aContinue;
    }

    public void print(){
        try{
            while(isContinue){
                System.out.println("run print method threadName is:"+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public  void run(){
        print();
    }
}
