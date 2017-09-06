package com.busi.correspond.test3;


/**
 * @author antoWorld
 * @description 描述
 * @create 2017/5/11
 */
public class TestRun {

    public static void main(String[] args) {
        Object object = new Object();
        ThreadP threadP = new ThreadP(object);
        ThreadC threadC = new ThreadC(object);
        threadP.start();
        threadC.start();
    }
}
