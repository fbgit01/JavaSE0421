package com.atguigu.java;

public class InnerClassTest2 {

    //局部内部类:若某个类仅适用于当前方法时，可以使用
    //如下方式使用较少
    public void show(){

        class Inner{

        }

        class Bird2{

        }
    }

    //方式一：
    public static Flyer1 getComparator(){
        return new Bird1();
    }

    //方式二：局部内部类
    public static Flyer1 getComparator1(){
        class Bird2 implements Flyer1{

            @Override
            public void fly() {

            }
        }

        return new Bird2();
    }

    //方式三：匿名内部类
    public static Flyer1 getComparator2(){

        Flyer1 f = new Flyer1(){//匿名内部类实现接口，创建匿名内部类的实例

            @Override
            public void fly() {

            }
        };

        return f;
    }

    //方式四：
    public static Flyer1 getComparator3(){
        return new Flyer1(){

            @Override
            public void fly() {

            }
        };
    }


    public static void main(String[] args) {
        Flyer1 f =  getComparator3();//多态
        f.fly();//虚拟方法调用
    }

}

interface Flyer1{

    public void fly();

}

class Bird1 implements Flyer1{

    @Override
    public void fly() {

    }
}
