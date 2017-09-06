package com.busi.test1;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/7/28 9:51
 */
public class TestRun {
    public static void main(String[] args){
        int i7 = 2;
        Integer i1 = 2;
        Integer i2 = 2;
        Integer i3 = new Integer(2);
        Integer i4 = new Integer(2);
        Integer i5 = 200;
        Integer i6 = 200;
        int i8 = 200;
        Integer i9 = new Integer(200);
        System.out.println(i1==i7);
        System.out.println(i1==i3);
        System.out.println(i1==i2);
        System.out.println(i1==i3);
        System.out.println(i3==i7);
        System.out.println(i4==i3);
        System.out.println("--------------------");
        System.out.println(i5==i6);
        System.out.println(i5==i8);
        System.out.println(i9==i8);
    }
}
