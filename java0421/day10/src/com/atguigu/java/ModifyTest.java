package com.atguigu.java;

import com.atguigu.aaa.Customer;

/*
四种访问控制修饰符:

public : 公共的，可用于修饰属性、方法、类。 在任何地方都可以访问

protected ：受保护的，可用于修饰属性、方法。 在本类中，本包中，子类中

default：默认的（缺省的），可用于修饰属性、方法、类型。 在本类中、本包中。
        （注意：default 并不是访问控制修饰符的关键字，在什么都不加的情况下是 default）

private : 私有的，可用于修饰属性、方法。 只能在本类中访问
 */
public class ModifyTest {

    public static void main(String[] args) {
        Customer customer = new Customer();

    }

}

class CommonCustomer extends Customer{

    public void    show(){
        System.out.println(name);
    }

}