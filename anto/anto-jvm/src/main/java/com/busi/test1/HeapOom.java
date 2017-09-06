package com.busi.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author antoWorld
 * @description Java堆内存溢出异常测试
 * -verbose:gc -Xms20M -Xmx20M -XX:+HeapDumpOnOutOfMemoryError
 * @create 2017/8/22 10:47
 */
public class HeapOom {
    static class OomObject{

    }
    public static void main(String[] args){
        List<OomObject> list = new ArrayList<>();
        while (true)
            list.add(new OomObject());
    }
}
