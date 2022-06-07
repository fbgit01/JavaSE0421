package com.atguigu.java;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
一、集合框架
java.util.Collection : 集合层次的根接口
​	|--java.util.List : 有序的，允许重复的。（List 系列集合都具有索引值）
​		|--java.util.ArrayList : 采用数组结构。当查询操作多时选择
​		|--java.util.LinkedList: 采用双向链表结构。当增删操作多时选择
​	    |--java.util.Vector :
​	|--java.util.Set : 无序的，不允许重复的。
        |--java.util.HashSet: 是 Set 接口的典型实现类。
                    哈希算法。 先比较两个对象的 hashCode 值是否相同，对应的位置有对象存在，再通过 equals() 方法比较两个对象的内容
                               若 hashCode 值不同，则对象直接存储。
                               因此，在重写 hashCode() 方法与 equals() 方法时，二者必须保持一致！
                               (若两个对象的内容相同，生成的 hashCode 值相同，同时equals() 方法返回true)
            |--java.util.LinkedHashSet:相较于 HashSet 多了链表维护元素的顺序，增删效率低，遍历效率高
        |--java.util.TreeSet:
 */
public class HashSetTest {

    @Test
    public void test2(){
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("BB");
        lhs.add("CC");
        lhs.add("AA");

        System.out.println(lhs);
    }

    @Test
    public void test1(){
        HashSet set = new HashSet();
        set.add("DD");
        set.add("CC");
        set.add("AA");
        set.add("EE");

        String str1 = new String("BB");
        String str2 = new String("BB");
        set.add(str1);
        set.add(str2);

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        Person p1 = new Person("张三", 18);
        Person p2 = new Person("张三", 18);
        set.add(p1);
        set.add(p2);//HashSet 判断元素是否存在的依据并不是 equals() 方法那么简单

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(set);
    }

}
