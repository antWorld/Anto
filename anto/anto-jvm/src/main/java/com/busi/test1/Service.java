package com.busi.test1;

/**
 * @author antoWorld
 * @description 被动引用示例
 * 通过子类引用父类的静态成员变量，不会导致子类初始化
 * @create 2017/7/14 14:43
 */
public class Service {
    public static void main(String[] args){
        System.out.println(SubClass.value);
    }
}

 class SuperClass{
    static {
        System.out.println("super class initial");
    }
     //如果加上final 则不会调用superClass的 静态块了
     /**
      * 加上final  属于被动使用类的字段 ，常量在编译阶段会存入调用类的常量池中，本质上没有直接引用定义常量的类，因此不会触发类的初始化
      */
     public static final int value = 10;
}

class SubClass extends SuperClass{
    static {
        System.out.println("subClass class initial");
    }
}
