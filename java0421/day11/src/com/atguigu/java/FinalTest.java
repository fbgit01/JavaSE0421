package com.atguigu.java;

/*
一、final 修饰符：代表最终的，可用于修饰 变量、方法、类。

1. final 修饰的类不能被继承
2. final 修饰的方法不能被重写
3. final 修饰的变量叫常量，一旦被赋值，值不能改变。
        ①常量的命名规范：所有字母都大写，每个单词以“_” 隔开。 如： XXX_YYY_ZZZ
        ②常量没有默认值。因此，在使用前必须赋值。(直接显示赋值、构造器、代码块)
            若选择使用构造器为常量赋值，必须保证“所有”构造器都为该常量赋初始值

 */
public class FinalTest {

    public static void main(String[] args) {
        /*Person3 p = new Person3();

        Person3 p2 = new Person3(200);*/

        //p.NUM = 200;

        //add(100);
    }

    /*public static int add(final int NUM){
        return NUM;
    }*/

    public static int add(final Number1 NUM){//
        //NUM = null;
        return NUM.n++;
    }

}

class Number1{
    int n = 10;
}

class Person3{

    public final int NUM;

    public Person3(){
        this.NUM = 100;
    }

    public Person3(int num){
        this.NUM = num;
    }

    public void eat(){

    }

}

class Student extends Person3{

    public void eat(){
    }

}