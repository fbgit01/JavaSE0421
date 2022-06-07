package com.atguigu.java;

/*
一、类的成员之一：代码块（属性、方法、构造器）

1、非静态代码块（初始化块）
①格式：类中的一对 {}
②每次创建对象时执行
③非静态代码块的执行优先于构造器
④非静态代码块用于为对象进行初始化(通常为共性内容进行初始化)
⑤非静态代码块可以有多个，依次向下的顺序执行

2、为属性赋初始值的方式
①默认值（缺省值）
②直接显示赋值
③构造器赋值
④代码块

顺序：①   ②④   ③
注意： ②④ 顺序执行

3、静态代码块
①格式： static{}
②静态代码块随着类的加载而加载，并且只加载一次
③静态代码块的执行优先于 非静态代码块
④静态代码块中不能使用非静态成员，也不能使用 this 和super
⑤静态代码块可以有多个，依次向下的顺序执行
 */
public class StaticCodeBlockTest {

    public static void main(String[] args) {
        Person2 p1 = new Person2();
        Person2 p2 = new Person2();
        Person2 p3 = new Person2();
        //p1.cry();

        //System.out.println(p1.getName());

        //Person2 p2 = new Person2("");
        //p2.cry();
    }

}

class Person2{

    {
        //cry();
        this.name = "张三";
        System.out.println("非静态代码块1……");
    }

    private String name = "李四";
    private int age;

    public Person2() {
        //cry();
        System.out.println("Person's Constructor……");
    }

    public Person2(String name){
       // cry();
    }

    public Person2(String name, int age){
        //cry();
    }


    {
        System.out.println("非静态代码块3……");
    }

    {
        System.out.println("非静态代码块2……");
    }

    static{
        System.out.println("静态代码块1……");
    }


    static{
        System.out.println("静态代码块3……");
    }

    static{
        System.out.println("静态代码块2……");
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

    //
    public void cry(){
        System.out.println("哭");
    }
}