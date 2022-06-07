package com.atguigu.java;

/*
一、当子类继承父类后，类中各成员的特点

    属性
    方法
    构造器

 1、方法的重写（方法的覆盖 Override）:当父类中的方法对于子类来说不适用时，可以对父类中的方法进行重写
        当子类继承父类后，若子类出现了与父类方法签名一模一样的方式时
        创建子类对象，调用该方法，实际运行的是子类的方法，如同将父类中
        的方法覆盖了一样。
                ————————方法的重写（方法的覆盖）

 2、方法重写的规则：
 前提：子类继承父类后
 ①方法名与参数列表必须相同
 ②子类重写方法的访问控制修饰符不能小于父类被重写方法的访问控制修饰符，在这种情况下，访问控制修饰符可以不同
 ③子类方法返回值类型必须是父类被重写方法返回值类型的子类，在这种情况下，返回值类型可以不同
    (通常应用时，使方法签名一模一样)

【面试题】 Overload 和 Override 的区别？
Overload ：方法的重载
前提：使用在同一个类中
①方法名相同
②参数列表不同（参数的个数、参数的类型）
注意：与返回值类型无关
 */
public class ExtendsTest3 {

    public static void main(String[] args) {
        Student1 stu = new Student1();
        stu.eat();
    }

}

class Person1{
    private String name;
    private int age;

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

    //吃饭的功能
    public Person1 eat(){
        System.out.println("吃饭");
        return null;
    }
}

class Student1 extends Person1{

    public Student1 eat(){
        super.eat();
        System.out.println("学生吃食堂");
        return null;
    }

}