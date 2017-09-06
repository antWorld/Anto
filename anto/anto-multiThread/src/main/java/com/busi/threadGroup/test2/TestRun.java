package com.busi.threadGroup.test2;

import java.text.SimpleDateFormat;

/**
 * @author antoWorld
 * @description simpleDateFormat在多线程环境下可能存在非线程安全
 * @create 2017/6/20 10:42
 */
public class TestRun {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String[] dateArr = new String[]{"2000-10-01", "2000-10-02", "2000-10-03", "2000-10-04", "2000-10-05"};
        for (int i = 0; i < dateArr.length; i++) {
            new MyThread(simpleDateFormat, dateArr[i]).start();
        }
    }
}
