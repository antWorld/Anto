package com.busi.threadGroup.test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/6/20 10:36
 */
public class MyThread extends Thread {
    private String dateStr;
    private SimpleDateFormat simpleDateFormat;

    public MyThread(SimpleDateFormat simpleDateFormat, String dateStr) {
        super();
        this.simpleDateFormat = simpleDateFormat;
        this.dateStr = dateStr;
    }

    /**
     *
     * 多个线程共享一个simpleDateFormat对象存在非线程安全问题，可能会导致转换结果不是预期结果的现象
     */
    public void run() {
        Date date = null;
        try {
            date = simpleDateFormat.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String resultDateStr = simpleDateFormat.format(date);
        if (!resultDateStr.equals(dateStr)) {
            System.out.println("线程:" + Thread.currentThread().getName() + "日期转换异常，预期：" + dateStr + "实际：" + resultDateStr);
        }
    }

    /**
     * 通过ThreadLocal对象为每个线程保存一个simpleDateFormat对象解决线程安全问题
     */
   /* public void run(){
        Date date = null;
        try {
            date = DateUtil.getFormat("yyyy-MM-dd").parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String resultDateStr = DateUtil.getFormat("yyyy-MM-dd").format(date);
        if (!resultDateStr.equals(dateStr)) {
            System.out.println("线程:" + Thread.currentThread().getName() + "日期转换异常，预期：" + dateStr + "实际：" + resultDateStr);
        }
    }*/
}
