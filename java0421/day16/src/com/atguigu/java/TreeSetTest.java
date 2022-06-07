package com.atguigu.java;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;

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
        |--java.util.TreeSet:拥有指定的排序方式
             |--自然排序：
                    ①需要添加到 TreeSet 集合中对象的类，实现 Comparable 接口
                    ②实现接口中的 compareTo(Object o);
             |--定制排序：
                    ①声明一个类实现 Comparator 接口
                    ②实现接口中的 compare(Object o1, Object o2)
                    ③将实现 Comparator 接口实现类的实例作为参数，传递给 TreeSet 的构造器

 */
public class TreeSetTest {

    @Test
    public void test5(){
        TreeSet ts = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;

                    if(p1.getAge().equals(p2.getAge())){
                        return p1.getName().compareTo(p2.getName());
                    }else{
                        return -p1.getAge().compareTo(p2.getAge());
                    }
                }

                return 0;
            }
        });

        ts.add(new Person("张三", 18));
        ts.add(new Person("李四", 20));
        ts.add(new Person("王五", 35));
        ts.add(new Person("赵六", 9));
        ts.add(new Person("田七", 22));

        System.out.println(ts);
    }

    @Test
    public void test4(){
        Comparator com = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;

                    if(p1.getAge().equals(p2.getAge())){
                        return p1.getName().compareTo(p2.getName());
                    }else{
                        return -p1.getAge().compareTo(p2.getAge());
                    }
                }

                return 0;
            }
        };

        TreeSet ts = new TreeSet(com);
        ts.add(new Person("张三", 18));
        ts.add(new Person("李四", 20));
        ts.add(new Person("王五", 35));
        ts.add(new Person("赵六", 9));
        ts.add(new Person("田七", 22));

        System.out.println(ts);
    }

    @Test
    public void test3(){
        class MyComparator1 implements Comparator{

            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;

                    if(p1.getAge().equals(p2.getAge())){
                        return p1.getName().compareTo(p2.getName());
                    }else{
                        return -p1.getAge().compareTo(p2.getAge());
                    }
                }

                return 0;
            }
        }


        TreeSet ts = new TreeSet(new MyComparator1());
        ts.add(new Person("张三", 18));
        ts.add(new Person("李四", 20));
        ts.add(new Person("王五", 35));
        ts.add(new Person("赵六", 9));
        ts.add(new Person("田七", 22));

        System.out.println(ts);
    }

    @Test
    public void test2(){
        TreeSet ts = new TreeSet(new MyComparator());
        ts.add(new Person("张三", 18));
        ts.add(new Person("李四", 20));
        ts.add(new Person("王五", 35));
        ts.add(new Person("赵六", 9));
        ts.add(new Person("田七", 22));

        System.out.println(ts);
    }

    @Test
    public void test1(){
        TreeSet ts = new TreeSet();
        ts.add(new Person("张三", 18));
        ts.add(new Person("李四", 20));
        ts.add(new Person("王五", 35));
        ts.add(new Person("赵六", 9));
        ts.add(new Person("田七", 22));

        ts.add(new Person("张三", 18));

        System.out.println(ts);
    }

}
