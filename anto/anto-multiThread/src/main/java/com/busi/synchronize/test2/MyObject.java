package com.busi.synchronize.test2;

/**
 * @author antoWorld
 * @description 同一个对象中的值被多个线程改变
 * @create 2017/4/24
 */
public class MyObject {
    public String userName = "A";
    public String password = "AA";


    synchronized public void setValue(String userName,String password){
        try {
            this.userName = userName;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("method:setValue ThreadName: "+Thread.currentThread().getName()+" userName:"+this.userName+" password:"+this.password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    synchronized  public void getValue(){
        System.out.println("method:getValue ThreadName: "+Thread.currentThread().getName()+" userName:"+this.userName+" password:"+this.password);
    }
}
