package com.atguigu.java;

/*
一、当子类继承父类后，类中各成员的特点

    属性
    方法
    构造器

 1、属性的特点：
        ①当子类继承父类后，若子类出现了与父类同名的属性时，创建子类对象调用该属性
        实际调用的是子类的属性。若需要调用父类的同名属性时，需要使用关键字：super
        ②当子类继承父类后，继承了父类中“所有”的属性，包括私有的
        只不过因为 private 修饰符的作用，子类不能直接访问
        若需要访问，通过公共的 (public) get/set 方法

 2、this 和 super 使用方式一模一样
 super.属性
 super.方法
 super() : 调用父类构造器

 this ： 使用在本类中，代表当前对象的引用
 super ： 使用在子类中，代表父类对象的引用
 */
public class ExtendsTest2 {

    public static void main(String[] args) {
        Son son = new Son();
        son.setNum(100);
        System.out.println("son.getNum() = " + son.getNum());
        //System.out.println(son.num);

        /*son.getSuperNum();*/
    }

}

class Father{

    private int num = 10;

    public void setNum(int num){
        this.num = num;
    }

    public int getNum(){
        return num;
    }

}

class Son extends Father{

    /*int num = 20;

    public void getSuperNum(){
        System.out.println(super.num);
    }*/

    /*public void setNum(int num){
        this.num = num;
    }

    public int getNum(){
        return num;
    }*/
}