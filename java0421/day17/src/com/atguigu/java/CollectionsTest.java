package com.atguigu.java;

import org.junit.Test;

import java.util.*;

public class CollectionsTest {

    /*
    查找、替换、比较
    Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
    Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
    Object min(Collection)
    Object min(Collection，Comparator)
    int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
    void copy(List dest,List src)：将src中的内容复制到dest中
    boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所有旧值
     */
    @Test
    public void test4(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        list.add("EE");

        Collections.replaceAll(list, "BB", "bbbbb");

        System.out.println(list);
    }

    @Test
    public void test3(){
        List src = new ArrayList();
        src.add("AA");
        src.add("BB");
        src.add("CC");

        /*List dest = new ArrayList(3);
        dest.add(11);
        dest.add(11);
        dest.add(11);*/

        Object[] objs = new Object[3];
        List dest = Arrays.asList(objs);

        Collections.copy(dest, src);

        System.out.println(dest);
    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(11);
        coll.add(22);
        coll.add(33);
        coll.add(44);
        coll.add(55);
        coll.add(11);
        coll.add(11);

        Object max = Collections.max(coll);
        System.out.println(max);
        Object min = Collections.min(coll);
        System.out.println(min);

        int count = Collections.frequency(coll, 11);
        System.out.println(count);
    }

    /*
    排序操作：（均为static方法）
    reverse(List)：反转 List 中元素的顺序
    shuffle(List)：对 List 集合元素进行随机排序
    sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
    sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
    swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换
     */
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        list.add("EE");

        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.swap(list, 1, 3);
        System.out.println(list);
    }

}
