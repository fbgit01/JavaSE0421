package com.atguigu.java;

/*
一、static 关键字：代表静态的，可用于修饰 属性、方法、**代码块、**内部类

1. static 修饰的属性（静态变量或类变量）
①**随着类的加载而加载，随着类的消失而消失（生命周期最长）
②**static 修饰的属性被该类所有对象所共享
③一旦某个对象修改该属性值，其他对象的该属性值也会随之改变
④静态变量的存在是优先于对象的
⑤**可以通过 “类名.类变量”的方式调用

2. 类变量与实例变量的区别？
①内存中的位置不同
②生命周期不同

2. static 修饰的方法（静态方法或类方法）
①随着类的加载而加载
②静态方法的存在优先于对象
③可以通过“类名.类方法”的方式调用
④静态方法中不能使用非静态成员, 非静态方法中可以使用静态成员
⑤静态方法中不能使用 this 和super
 */
public class StaticTest1 {

    public static void main(String[] args) {
        /*Chinese c1 = new Chinese("张三", 18, "中国");
        Chinese c2 = new Chinese("李四", 20, "中国");

        c1.nation = "外国";

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(Chinese.nation);*/

        //Chinese.show();

        /*StaticTest1 st = new StaticTest1();
        st.add();*/
    }

    /*public void add(){

    }*/

}

class Chinese{

    private String name;
    private int age;

    static String nation;

    public Chinese() {
    }

    public Chinese(String name, int age, String nation) {
        this.name = name;
        this.age = age;
        this.nation = nation;
    }

    @Override
    public String toString() {
        return name + "," + age + "," + nation;
    }

    public static void show(){
        System.out.println("这是一个静态方法");
    }
}