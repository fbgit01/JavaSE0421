package com.atguigu.java;

/*
一、java.lang.Object : 是所有的类的父类。若一个类没有显示的继承任何类时，默认 extends java.lang.Object
 java.lang : 默认包
 ①既然 Object 类是所有类的父类，因此 Object 类中的内容是最具共性的
 ②既然 Object 类是所有类的父类，因此子类可以继承 Object 类中所有的方法
 ③既然 Object 类是所有类的父类，若 Object 类中的方法对于子类来说不适用，子类可以重写 Object 类中的方法


 二、 “==” 运算符
 比较基本数据类型：比较两个基本数据类型的值是否相等
 比较引用数据类型：比较两个引用数据类型的“地址值”是否相等

 public boolean equals(Object obj):用于比较两个对象是否相等
①equals() 只能比较两个引用数据类型
②equals() 方法在 java.lang.Object 类中
③Object 类中的 equals() 比较的是两个对象的地址值是否相等。（通过查看源码发现实际上使用的“==”完成的）
④若 Object 类中的 equals() 方法对于我们来说不适用，我们可以重写 Object 类中的 equals() 方法

 【面试题】 "=="  与  equals 的区别？

 */
public class ObjectTest {

    public static void main(String[] args) {
        /*int a = 65;
        char ch = 'A';
        double d = 65.0;

        System.out.println(a == ch);
        System.out.println(ch == d);
        System.out.println(a == d);*/

        Person p1 = new Person("张三", 18);
        Person p2 = new Person("张三", 18);

        /*Person p3 = p1;

        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
        System.out.println(p2 == p3);*/

        //若两个Person的name、age一样，视为同一个人
        boolean bo = p1.equals(p2);//比较 p1 和 p2 是否相等
        System.out.println(bo); //false  重写 equals 后，比较两个对象的内容，结果为 true

        String str1 = new String("AA");
        String str2 = new String("AA");

        boolean b1 = str1.equals(str2);
        System.out.println(b1);//true
    }

}

class Person /*extends java.lang.Object*/{

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写 Object 类中的 equals() 方法
    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person p = (Person)obj;

            if(this.age == p.age && this.name.equals(p.name)){
                return true;
            }
        }

        return false;
    }
}