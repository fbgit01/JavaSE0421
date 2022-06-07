package com.atguigu.java;

import org.junit.Test;

import java.util.*;

/*
一、集合的遍历

1、增强 for 循环

    for(被遍历集合中元素的数据类型 变量名 : 被遍历的集合){
    }


2、Iterator 迭代器

3、(了解)ListIterator 迭代器，是 List 系列集合特有的迭代器

 */
public class IteratorTest {

    @Test
    public void test6(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        list.add("EE");

        //判断集合元素，如果是“BB”,则添加一个 "bbbbb"
        /*Iterator it = list.iterator();

        while(it.hasNext()){
            Object obj = it.next();

                 if(obj.equals("BB")){
                    list.add("bbbbb");
                }
        }*/

        ListIterator li = list.listIterator();

        while(li.hasNext()){
            Object obj = li.next();

            if(obj.equals("BB")){
                li.set("bbbbb");
            }
        }

        System.out.println(list);

    }

    @Test
    public void test5(){
        Set set = new HashSet();
        set.add("AA");
        set.add("BB");
        set.add("CC");

        Iterator it = set.iterator();

        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }

    @Test
    public void test4(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        list.add("EE");

        //1. 获取当前结合的迭代器
        Iterator it = list.iterator();

        //错误的做法
        /*while(it.next() != null){
            System.out.println(it.next());
        }*/

        //错误的做法
        /*while(it.hasNext()){
            Object obj = it.next();
            System.out.println(it.next());
        }*/
    }

    @Test
    public void test3(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        list.add("EE");

        //1. 获取当前集合的迭代器
        Iterator it = list.iterator();

        //2. 通过 hasNext() 与 next() 配合取出集合中的对象
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }

    @Test
    public void test2(){
        Set set = new HashSet();
        set.add("AA");
        set.add("BB");
        set.add("CC");

        for(Object o : set){
            System.out.println(o);
        }
    }

    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        list.add("EE");

        for(Object obj : list){
            System.out.println(obj);
        }
    }

}
