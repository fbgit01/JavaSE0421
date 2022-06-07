package com.atguigu.java;

/*
一、接口（暂时以 jdk1.7为例）：可以定义多个不相关事物的相同功能

1、如何使用接口
①接口与类是平级的
        使用关键字： interface
        如：
            public interface Flyer{}
②可以把接口理解为特殊的抽象类，因为接口中只能有“全局静态常量”和“抽象方法”。
③接口中不能有变量、一般方法、构造器、代码块
④**接口不能创建实例
⑤接口就是用来被实现的

        使用关键字： implements
        如：
            class Bird implements Flyer{}
⑥实现接口的类，称为“实现类”，实现类的功能和“继承”一样的，实现类可以继承接口中所有的内容
⑦实现类若实现了接口中所有的抽象方法，该类为具体类，可以创建实例
 实现类若没有实现接口中所有的抽象方法，该类必须是抽象类，不可以创建实例
⑧接口可以多实现。 ------ 解决了 Java 中单继承的局限性
⑨接口不能继承任何类，接口可以继承接口并且可以多继承接口
⑩一个类可以继承另一个类同时实现多个接口
    如：
        class Bird extends Animal implements Flyer, Runner{}
        注意：先继承，后实现



class A{
    void test1(){
        ///11111111111111
    }
}

class B{
    void test1();
}

class C extends A, B{}

C c = new C();
c.test1();
 */
public class InterfaceTest {

    public static void main(String[] args) {
        //System.out.println(Flyer.NUM);

        Bird bird = new Bird();//本态
        bird.fly();
        System.out.println(AA.NUM);
        System.out.println(BB.NUM);

        /*Flyer f = new Bird();//接口支持多态
        f.fly();//虚拟方法调用（动态绑定）

        Runner r = new Bird();//多态
        r.run();*/
    }

}

interface AA{

    public static final int NUM = 11;

    void show();
}

interface BB{

    int NUM = 22;

    void show();
}

interface Flyer extends AA, BB{

    //int NUM = 100;//public static final

    public void fly();//public abstract

    //void show();
}

interface Runner{

    public void run();

}

class Animal{
    public void eat(){

    }
}

class Bird extends Animal implements Flyer, Runner{

    public void fly(){
        System.out.println("鸟儿煽动翅膀飞翔");
    }

    public void run(){
        System.out.println("鸟儿蹦蹦哒哒的跑");
    }

    public void show(){

    }
}

abstract class Plane implements Flyer{
    //public abstract void fly();
}