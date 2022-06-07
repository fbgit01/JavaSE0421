package com.atguigu.java;

import org.junit.Test;

/*
一、泛型：在 Java 中以“<>”的形式呈现，“<>” 中写引用数据类型，用于限制数据类型

1、集合中使用泛型：若集合中不使用泛型，意味着集合中可以添加任意类型的对象，
                  若需要具体到某一个类型，则需要强制类型转换，有可能引发 ClassCastException

2、自定义泛型类、接口、方法:当在编译时不确定数据类型时，可以声明自定义泛型

3、通配符
 */
public class GenericTest2 {
    //自定义泛型方法
    public <E> E get(E e){//方法被调用时，通过参数列表，指定具体的数据类型
        return null;
    }

    //大家后面可能用这样的,看看能看懂不？
    public <T> T get(Class<T> clazz, Object ... args){
        return null;
    }

    @Test
    public void test1(){
        /*MyGeneric<String> mg = new MyGeneric<>();
        mg.add("AA");
        String str = mg.get();*/

        MyGeneric<Person> mg = new MyGeneric<>();
        mg.add(new Person());
        Person p = mg.get();

        MyGeneric<Customer> mg2 = new MyGeneric<>();
        mg2.add(new Customer());
        Customer cust = mg2.get();

        //自定义泛型方法
        String str = get("AAA");
    }
}
