package com.atguigu.java1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

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
        |--java.util.List : 接口
        |--java.util.Set : 接口
 */
public class CollectionTest {

    @Test
    public void test3(){
        //使用 Collection 接口实现类 ArrayList， 创建 Collection 实例
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add(new String("BB"));
        coll.add(new Person("张三", 18));
        coll.add(123);//自动装箱

        //8.remove(Object obj) : 删除集合中的指定元素,内部使用 equals() 判断对象是否存在
        /*coll.remove("AA");
        coll.remove(new Person("张三", 18));

        System.out.println(coll);*/

        //9. removeAll(Collection coll1) : 删除 coll1 中所有的元素
        System.out.println(coll);
        Collection coll1 = new ArrayList();
        coll1.add("AA");
        coll1.add(new Person("张三", 18));
        coll1.add("FFFFFFF");

        /*coll.removeAll(coll1);

        System.out.println(coll);*/

        //10. retainAll(Collection coll1):取交集
        coll.retainAll(coll1);

        System.out.println(coll);

        //11. toArray():将集合转换为数组
        Object[] objs = coll.toArray();

        for (Object obj : objs) {
            System.out.println(obj);
        }
    }

    @Test
    public void test2(){
        //使用 Collection 接口实现类 ArrayList， 创建 Collection 实例
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add(new String("BB"));
        coll.add(new Person("张三", 18));
        coll.add(123);//自动装箱

        //5. addAll(Collection coll1) : 将 coll1 集合中所有的元素，添加到当前集合
        Collection coll1 = Arrays.asList(1,2,3,4,5);//将数组转换成集合

        coll.addAll(coll1);
        System.out.println(coll);

        /*coll.add(coll1);
        System.out.println(coll);*/

        //6. contains(Object obj) : 判断集合中是否包含某元素,低层调用的对象的 equals() 方法
        /*boolean b = coll.contains("AA");
        System.out.println(b);*/

        String str1 = new String("CC");
        coll.add(str1);
        boolean b = coll.contains(new String("CC"));
        System.out.println(b);//true

        Person p = new Person("李四", 20);
        coll.add(p);
        b = coll.contains(new Person("李四", 20));
        System.out.println(b);//false

        //7. constainsAll(Collection coll1) : 判断当前集合中是否包含 coll1 中所有的元素
        Collection coll2 = new ArrayList();
        coll2.add("BBBBBBB");
        coll2.add(new Person("张三", 18));

        System.out.println(coll.containsAll(coll2));
    }

    @Test
    public void test1(){
        //使用 Collection 接口的实现类，创建 Collection 的实例
        Collection coll = new ArrayList();

        //1. add(Object obj) : 添加元素到集合中
        coll.add("AA");
        coll.add(new String("BB"));
        coll.add(new Person("张三", 18));
        coll.add(123);//自动装箱

        System.out.println(coll);

        //2. size() : 查看集合中有效元素个数
        int size = coll.size();
        System.out.println(size);

        //3. clear() : 清空集合中所有的元素
        coll.clear();
        System.out.println(coll);

        //4. isEmpty() : 判断集合是否为空
        boolean b = coll.isEmpty();
        System.out.println(b);
    }

}
