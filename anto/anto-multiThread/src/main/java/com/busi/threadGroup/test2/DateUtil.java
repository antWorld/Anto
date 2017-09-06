package com.busi.threadGroup.test2;

import java.text.SimpleDateFormat;

/**
 * @author antoWorld
 * @description simpleDateFormat工具类 为每个线程单独保存一个simpleDateFormat对象
 * @create 2017/6/20 10:56
 */
public class DateUtil {
    private static ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal<SimpleDateFormat>();

    static SimpleDateFormat getFormat(String pattern) {
        SimpleDateFormat dateFormat;
        dateFormat = threadLocal.get();
        if (dateFormat == null) {
            dateFormat = new SimpleDateFormat(pattern);
            threadLocal.set(dateFormat);
        }
        return dateFormat;
    }
}
