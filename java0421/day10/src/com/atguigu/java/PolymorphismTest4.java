package com.atguigu.java;

/*
多态的应用之二：多态参数

instanceof 运算符：
    对象的引用  instanceof 引用数据类型

    例如：
        p instanceof Man : 判断 p 引用指向的对象是不是 Man 的本类类型及子类类型，如果是则返回 true
 */
public class PolymorphismTest4 {

    public static void main(String[] args) {
        /*show(new Person());

        show(new Man());*/

        /*Woman woman = new Woman();
        show(woman);*/

        show(new Man());
    }


   /* //需求：展示一个男人吃饭和睡觉的功能
    public static void show(Man man){
        man.eat();
        man.sleep();
    }

    //需求：展示一个女人吃饭和睡觉的功能
    public static void show(Woman woman){
        woman.eat();
        woman.sleep();
    }

    public static void show(Student stu){
        stu.eat();
        stu.sleep();
    }*/

    public static void show(Person p){//多态参数：可以接收本类类型的对象及子类类型的对象
        p.eat(); //虚拟方法调用
        p.sleep();

        if(p instanceof Woman){
            //向下转型
            Woman woman = (Woman)p;
            woman.shopping();
        }

        if(p instanceof Man){
            Man man = (Man) p;
            man.smoking();
        }
    }
}

class Student extends Person{

    public void eat(){
        System.out.println("学生吃食堂");
    }

    public void sleep(){
        System.out.println("学生上课睡觉");
    }
}