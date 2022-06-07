package com.atguigu.review;

public class InnerClass {

    //局部内部类使用的注意
    public void show(){

        //局部变量
        int num = 10;//jdk1.7前必须显示加 final，jdk1.8后，默认为final

        //局部内部类
        class Inner{

            public void test(){
                System.out.println(num);
            }

        }

        Inner n = new Inner();

    }

}
