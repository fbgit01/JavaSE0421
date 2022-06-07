package com.atguigu.java;

/*
属性不具备多态性
 */
public class PolymorphismTest2 {

    public static void main(String[] args) {
        Father fa = new Son(); //多态
        //fa.show(); //虚拟方法调用（动态绑定）

        System.out.println(fa.num);

    }

}

class Father{

    int num = 10;

    public void show(){
        System.out.println("父类的方法");
    }
}

class Son extends Father{

    int num = 20;

    public void show(){
        System.out.println("子类的方法");
    }

}