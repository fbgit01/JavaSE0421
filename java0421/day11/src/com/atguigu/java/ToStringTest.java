package com.atguigu.java;

/*
public String toString() : 用于返回对象的字符串表现形式
①在 java.lang.Object 类中
②当直接输出对象的引用时，默认调用 toString() 方法
③Object 类中的 toString 方法返回值的格式如下：
    getClass().getName() + '@' + Integer.toHexString(hashCode())
④因此，Object 类中的 toString() 对于我们来说不适用，我们可以重写
 */

public class ToStringTest {

    public static void main(String[] args) {
        Person1 p = new Person1("张三", 18);

        /*String str = p.toString();
        System.out.println(str);*/

        System.out.println(p);
        System.out.println(p.toString());
    }

}

class Person1{
    private String name;
    private int age;

    public Person1() {
    }

    public Person1(String name, int age) {
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

    //重写 Object 类中的 toString()
    public String toString(){
        return name + "," + age;
    }
}
