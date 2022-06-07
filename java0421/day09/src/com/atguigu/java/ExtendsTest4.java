package com.atguigu.java;

/*
一、当子类继承父类后，类中各成员的特点

    属性
    方法
    构造器

 1、构造器的特点：
      ①当子类继承父类后，子类中所有的构造器的默认第一行第一句有一个隐式的 ：super()
            super() 作用：调用父类无参构造器
            super() 目的：当子类继承父类后，继承了父类中所有的属性和方法，因此子类需要知道父类是
                          如何为对象进行初始化
      ②若父类中没有提供无参构造器，子类"所有"构造器中“必须”显示调用父类中的有参构造器
      ③this() 只能写在当前构造器中可执行代码的首行
       super() 只能写在当前构造器中可执行代码的首行

       this() 和 super() 二者不能同时出现
 */
public class ExtendsTest4 {

    public static void main(String[] args) {
        Student2 stu = new Student2();

        System.out.println(stu.getName());

        Student2 stu2 = new Student2("张三", 18, 9527);

        System.out.println(stu2.getName() + "," + stu2.getAge() + ","+ stu2.getStuId());
    }

}

class Person2{

    private String name;
    private int age;

    //声明 Person 的构造器
    public Person2(String name){
        this.name = "张三";
        System.out.println("Person's Constructor……");
    }

    public Person2(String name, int age){
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
}

class Student2 extends Person2{
    private int stuId;

    //声明 Student 的构造器
    public Student2(){
        super("");
        System.out.println("Student's Constructor……");
    }

    public Student2(String name, int age){
        super(name, age);
    }

    public Student2(String name, int age, int stuId){
        this(name, age);
        this.stuId = stuId;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }
}