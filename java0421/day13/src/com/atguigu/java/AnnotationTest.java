package com.atguigu.java;

/*
一、注解：jdk1.5后的特性，是一个代码级别的说明。是一个元数据。
          在java 中以 "@注解名" 的方式呈现

        String name = "atguigu";

1. JDK 内置的常用注解
        @Override : 用于描述方法，说明该方法必须是重写方法
        @Deprecated : 用于注解属性、方法、类。 说明已经过时
        @SuppressWarnings : 用于抑制编译器警告

2. 自定义注解

    格式：
        public @interface MyAnnotation{}

3. 元注解
        @Retention : 描述注解的生命周期
        @Target: 描述注解可以修饰哪些程序元素
        @Documented ：描述注解可以随之生成说明文档
        @Inherited ：描述注解拥有继承性

 */
public class AnnotationTest {

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "张三";
        System.out.println(p.name);

        @SuppressWarnings("unused")
        int num = 0;
    }
}

@Deprecated
@MyAnnotation
class Person{

    @Deprecated
    String name;

    @Override
    public String toString() {
        return "Person{}";
    }

    @MyAnnotation("睡觉方法")
    public void sleep(){
        System.out.println("睡觉");
    }
}

class Student extends Person{

    @Override
    public void sleep(){
        System.out.println("学生上课偷偷睡觉");
    }

}