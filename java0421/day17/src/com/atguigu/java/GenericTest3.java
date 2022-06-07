package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/*
一、泛型：在 Java 中以“<>”的形式呈现，“<>” 中写引用数据类型，用于限制数据类型

1、集合中使用泛型：若集合中不使用泛型，意味着集合中可以添加任意类型的对象，
                  若需要具体到某一个类型，则需要强制类型转换，有可能引发 ClassCastException

2、自定义泛型类、接口、方法:当在编译时不确定数据类型时，可以声明自定义泛型

3、虽然 Customer 是 Person 的子类，但是 List<Customer> 就不是 List<Person> 的子类
通配符: ?
List<?> : 可以接收任意类型泛型的集合
List<? extends Person> : 可以接收 Person本类类型的泛型集合，及 Person 子类类型的泛型集合
List<? super Person> : 可以接收 Person本类类型的泛型集合，及 Person 父类类型的泛型集合
 */
public class GenericTest3 {

    @Test
    public void test1(){
        /*Customer cust = new Customer();
        Person p = cust;//多态

        Customer[] customers = new Customer[5];
        Person[] persons = customers;*/

        /*List<Customer> custList = new ArrayList<>();
        List<Person> list = custList;*/
        List<Person> custList = new ArrayList<>();
        custList.add(new Customer());
        custList.add(new Man());

        show(custList);

        List<Man> manList = new ArrayList<>();
        manList.add(new Man());
        manList.add(new Man());

        show(manList);
    }

    //展示一堆Customer吃饭的功能
    public void show(List<? extends Person> list){
        for (Person person : list) {//多态
            person.eat();//虚拟方法调用（动态绑定）
        }
    }

    //展示一堆男人吃饭的功能
    /*public void show1(List<Man> list){
        for (Man man : list) {
            man.eat();
        }
    }*/
}
