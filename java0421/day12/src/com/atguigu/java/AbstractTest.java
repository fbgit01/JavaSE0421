package com.atguigu.java;

/*
一、为什么使用抽象类：
    类用于描述现实生活中的一类事物，类中有属性、有方法，方法都有方法体
    某种情况下，父类只能做到子类应该具备一个怎样的方法，但是不能明确知道子类是如何实现该方法的。
    例如：几何图形（多态练习），所有几何图形都应该具备一个计算面积的方法，但是不同几何图形计算面积的方式不同

java 为上述问题提供了相应的解决办法：
Java 允许父类中只是提供一个方法的声明，不提供具体的实现
具体的实现交给子类来完成，该方法称为“抽象方法”
拥有一个或多个抽象方法的类，称为“抽象类”

二、如何使用抽象：abstract

1、abstract 修饰的类称为“抽象类”
①格式：public abstract class 类名{}
②拥有一个或多个抽象方法的类必须是抽象类
③抽象类中可以有非抽象方法
④抽象类中可以没有抽象方法
⑤****抽象类不能创建实例
⑥抽象类可以声明构造器。
    目的：当子类继承父类后，继承了父类中所有的属性和方法，因此子类需要知道父类是如何为对象进行初始化的

2、abstract 修饰的方法称为“抽象方法”
①格式：访问控制修饰符 abstract 返回值类型 方法名(参数列表);
②子类继承父类后，继承了父类中所有的方法，若重写了父类中所有的抽象方法，该类是具体类，可以创建实例
③子类继承父类后，继承了父类中所有的方法，若没有重写父类中所有的抽象方法，该类必须是抽象类，不能创建实例

3、
① abstract 和 final 不能同时使用
② abstract 和 static 不能同时使用
③ abstract 和 private 不能同时使用

4、谈谈你对具体类和抽象类的理解？
 */
public class AbstractTest {

    public static void main(String[] args) {
        /*Person p = new Person();
        p.speak();*/

        Chinese c1 = new Chinese();//本态
        c1.speak();

        Person p = new Chinese();//多态
        p.speak();//虚拟方法调用（动态绑定）

        Person p2 = new Chinese("张三",18);
        System.out.println(p2.getName());

    }

}

abstract class Person{
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

    //人都具备一个说话的功能
    public abstract void speak();

    public abstract void show();
}

class Chinese extends Person{

    public Chinese(){

    }

    public Chinese(String name, int age){
        super(name, age);
    }

    public void speak(){
        System.out.println("中国人汉语");
    }

    public void show(){
        System.out.println();
    }
}

abstract class American extends Person{
    public void speak(){
        System.out.println("美国人说英语");
    }

    //public abstract void show();
}