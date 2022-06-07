package com.atguigu.java;

/*
单例设计模式：
 */
public class SingletonTest {
    public static void main(String[] args) {
        //Singleton instance = new Singleton();

        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();

        System.out.println(s1 == s2);
    }
}

//单例设计模式-饿汉试
class Singleton{
    //2. 类的内部创建对象
    private static final Singleton instance = new Singleton();

    //1. 构造器私有化
    private Singleton(){

    }

    //3. 提供公共的 get 方法
    public static Singleton getInstance(){
        return instance;
    }
}

//懒汉式 - 存在多线程安全问题
class Singleton2{

    //2. 类的内部创建对象
    private static Singleton2 instance = null;

    //1. 构造器私有化
    private Singleton2(){

    }

    //3. 提供公共 get 方法
    public static Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }

        return instance;
    }
}