package com.atguigu.java;

/*
一、类的成员之一：内部类（属性、方法、构造器、代码块）

    1. 成员内部类：在类中声明另一个类，里面的类称为“内部类”，外面的类称为“外部类”
        ①是类的成员之一
        ②内部类可以使用四种访问控制修饰符（public protected default private）
        ③static 和 final 修饰
        ④与类的特征一致


    2. 局部内部类

 */
public class InnerClassTest {

    public static void main(String[] args) {
        //创建静态内部类的对象
        Person1.Mobile pm = new Person1.Mobile();
        pm.show();

        //创建非静态内部类对象
        Person1 p = new Person1();
        Person1.Computer pc = p.new Computer();
        pc.setName("电脑");
        //System.out.println(pc.getName());
    }

}

class Person1{

    private String name = "张三";
    private int age;

    public Person1() {
    }

    public Person1(String name, int age) {
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

    //成员内部类:当该类仅适用于当前类时，或者需要对某个类进行 private 隐藏时，可以选择使用
    public class Computer{

        private String name = "联想";

        public Computer() {
        }

        public Computer(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            //System.out.println(age);
            System.out.println("局部变量参数的："+name);
            System.out.println("当前对象的name : " + this.name);
            System.out.println("调用 Person 对象的 name : " + Person1.this.name);
            this.name = name;
        }
    }

    private class Head{

    }

    //静态内部类
    static class Mobile{

        public void show(){
            System.out.println("这是静态内部类中的方法");
        }

    }
}