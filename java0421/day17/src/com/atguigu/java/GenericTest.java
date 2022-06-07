package com.atguigu.java;

import org.junit.Test;

import java.util.*;
import java.util.Map.*;

/*
一、泛型：在 Java 中以“<>”的形式呈现，“<>” 中写引用数据类型，用于限制数据类型

1、集合中使用泛型：若集合中不使用泛型，意味着集合中可以添加任意类型的对象，
                  若需要具体到某一个类型，则需要强制类型转换，有可能引发 ClassCastException

2、自定义泛型类、接口、方法

3、通配符

 */
public class GenericTest {

    @Test
    public void test4(){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("张三", 99);
        map.put("李四", 88);

        //方式一：
        Set<String> keySet = map.keySet();

        for (String s : keySet) {
            Integer num = map.get(s);
            System.out.println(s);
            System.out.println(num);
        }

        System.out.println("-----------------------------------------");

        //方式二：
        Collection<Integer> coll = map.values();

        Iterator<Integer> it = coll.iterator();

        while(it.hasNext()){
            Integer num = it.next();
            System.out.println(num);
        }

        //方式三：获取 Map 中所有的 Entry 组成的 Set
        Set<Entry<String, Integer>> entrySet = map.entrySet();

        for(Entry<String, Integer> entry : entrySet){
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + "=" + value);
        }

        System.out.println("------------------------------------------");

        Iterator<Entry<String, Integer>> it2 = entrySet.iterator();

        while(it2.hasNext()){
            Entry<String, Integer> entry = it2.next();

            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }

    @Test
    public void test3(){
        Set<Person> set = new HashSet<>();
        set.add(new Person("张三", 18));
        set.add(new Person("李四", 20));

        Iterator<Person> it = set.iterator();

        while(it.hasNext()){
            Person p = it.next();
            System.out.println(p.getName());
        }
    }

    @Test
    public void test2(){
        //带泛型的集合，String ，用于限制集合中存放元素的类型
        List<String> list = new ArrayList<String>();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        list.add("EE");

        for(String str : list){
            System.out.println(str.toLowerCase());
        }
    }

    //集合中不使用泛型的弊端
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add(11);

        Iterator it = list.iterator();

        while(it.hasNext()){
            Object obj = it.next();
            //调用 String 特有方法
            String str = (String) obj;
            System.out.println(str.toLowerCase());
        }

    }
    
}
