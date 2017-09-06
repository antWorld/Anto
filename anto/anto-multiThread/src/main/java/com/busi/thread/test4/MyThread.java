package com.busi.thread.test4;

/**
 * @author antoWorld
 * @description 通过捕获异常的方式来终止线程
 * @create 2017/4/24
 */
public class MyThread extends  Thread {
    @Override
    public void run() {
        super.run();
        try{
            /**
             * 设置时间时，如果过小，则run方法能快速运行完
             * 此时main方法中 myThread.interrupt方法未执行则看不到如期效果
             */
            for(int i= 0;i<5000000;i++){
                if(this.interrupted()){
                    System.out.println("已经是停止状态了，我要退出了");
                    throw new InterruptedException();
                }
                System.out.println("i="+(i+1));
            }
            System.out.println("我还是会打印的");
        }catch (InterruptedException e){
            System.out.println("已经捕获到InterruptedException异常啦");
            e.printStackTrace();
        }
    }


}
