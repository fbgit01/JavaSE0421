package com.atguigu.java;

/*
一、枚举：jdk 1.5 后的特性，可以定义有限数量的可穷举数据集
         简而言之，当确定一个类有几个对象时，使用枚举

1、自定义枚举
    1) 私有化构造器
    2) 类的内部创建对象

2、使用 enum 关键字
    valueOf(String name) : 通过字符串类型的枚举类对象名称，获取对应的枚举类对象
    values() : 获取当前枚举类中所有的枚举类对象

3、枚举类实现接口
 */
public class EnumTest {
    public static void main(String[] args) {
        /*Season spring = Season.SPRING;
        System.out.println(spring);

        Season summer = Season.SUMMER;
        System.out.println(summer);*/

        /*Season1 spring = Season1.SPRING;
        System.out.println(spring);*/

        /*Season2 spring = Season2.SPRING;
        System.out.println(spring);*/

        //switch-case
        /*Season2 sea = Season2.SPRING;

        switch(sea){
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }*/

        //枚举类常用方法
        /*Season2 spring = Season2.valueOf("SPRING");
        System.out.println(spring);*/

        Season3[] seasons = Season3.values();

        for (Season3 season : seasons) {
            //System.out.println(season);
            season.show();
        }
    }
}

