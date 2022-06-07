package com.atguigu.java1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

4、List 的常用方法
void add(int index, Object ele) : 在指定的索引位置添加元素
boolean addAll(int index, Collection eles)
Object get(int index) : 获取指定索引位置的元素
int indexOf(Object obj) : 获取指定对象的索引位置，若找不到则返回 -1
int lastIndexOf(Object obj)
Object remove(int index) : 删除指定索引位置的元素
Object set(int index, Object ele) : 将指定索引位置的元素修改为 ele
List subList(int fromIndex, int toIndex) : 获取子集合，包含头不包含尾
 */
public class ListTest {

    @Test
    public void test3(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        list.add("EE");

        Object obj = list.remove(1);
        System.out.println(obj);
        System.out.println(list);

        list.set(3, "bbbbbbbb");
        System.out.println(list);

        List newList = list.subList(1, 3);
        System.out.println(newList);
    }

    @Test
    public void test2(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        list.add("EE");

        Object obj = list.get(1);
        System.out.println(obj);

        System.out.println(list.indexOf("BBBBB"));
    }

    @Test
    public void test1(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        list.add("EE");

        list.add(1, "bbb");

        List list2 = Arrays.asList(1,2,3,4,5);
        list.addAll(1, list2);

        System.out.println(list);

    }

}
