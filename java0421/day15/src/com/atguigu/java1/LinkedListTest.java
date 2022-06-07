package com.atguigu.java1;

import org.junit.Test;

import java.util.LinkedList;

/*
一、集合：集合就像是一种容器，用于存储、获取和操作对象的容器

1、数组的弊端
①数组的长度不可变  ②数组中没有提供可以查看有效元素个数的方法

2、集合的特点
①集合的长度是可变的
②集合中可以存储任意类型的对象
③集合只能存储对象

3、集合框架
java.util.Collection :接口，是集合层次的根接口
        |--java.util.List : 有序的，允许重复的。（List体系集合有具有索引值）
                |--ArrayList: 采用的数组结构。查询操作多时选择
                |--LinkedList: 采用的链表结构。增删操作多时选择
                |--Vector:
        |--java.util.Set : 无序的，不允许重复的。

 4、LinkedList 的常用方法
 addFirst()
 addLast()

 getFirst()
 getLast()

 removeFirst()
 removeLast()
 */
public class LinkedListTest {

    @Test
    public void test2(){
        MyQueue mq = new MyQueue();
        mq.add("AA");
        mq.add("BB");
        mq.add("CC");
        mq.add("DD");
        mq.add("EE");

        while(!mq.isNull()){
            Object obj = mq.get();
            System.out.println(obj);
        }
    }

    @Test
    public void test1(){
        LinkedList ll = new LinkedList();
        ll.addFirst("AA");
        ll.addFirst("BB");
        ll.addFirst("CC");
        ll.addFirst("DD");
        ll.addFirst("EE");

        ll.addLast("FF");
        System.out.println(ll);

        Object obj = ll.getFirst();
        Object obj1 = ll.getLast();
        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(ll);

        Object obj2 = ll.removeFirst();
        Object obj3 = ll.removeLast();
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(ll);

    }

}
