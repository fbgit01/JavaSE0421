package com.atguigu.java;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

/*
一、Map系列映射集合：用于操作成对对象的集合。具有 key(键)-value(值)对映射的集合。一个key对应着一个value。key不允许重复。
        |--HashMap : 是 Map 接口的典型实现类。是线程不安全的，因此效率高
            |--LinkedHashMap :
        |-- Hashtable : 是一个古老的实现。相较于 HashMap，是线程安全的。因此效率低
            |--Properties : 用于操作属性文件
        |-- TreeMap : 根据 key 拥有指定的排序方式
            |--自然排序：Comparable
            |--定制排序：Comparator
 */
public class MapTest {

    @Test
    public void test3(){
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;

                    if(p1.getAge().equals(p2.getAge())){
                        return p1.getName().compareTo(p2.getName());
                    }else{
                        return p1.getAge().compareTo(p2.getAge());
                    }
                }
                return 0;
            }
        };

        TreeMap tm = new TreeMap(com);
        tm.put(new Person("张三", 18), 99);
        tm.put(new Person("李四", 28), 99);
        tm.put(new Person("王五", 18), 99);
        tm.put(new Person("赵六", 19), 99);
        tm.put(new Person("田七", 35), 99);


        tm.put(new Person("张三", 18), 666);

        System.out.println(tm);
    }

    //[重要，后面用的到]
    @Test
    public void test2() throws IOException {
        //1. 创建 Properties 对象
        Properties props = new Properties();

        //2. 通过 load() 方法加载属性文件
        props.load(new FileInputStream("hello.properties"));

        //3. 通过 getProperty() 根据 key 获取对应的value，Properties 的特点：key 和 value 都是 String
        String username = props.getProperty("username");
        String password = props.getProperty("password");

        System.out.println(username);
        System.out.println(password);
    }

    //Map 的遍历
    @Test
    public void test1(){
        Map map = new HashMap();
        map.put("AA",11);
        map.put("BB",55);
        map.put("CC",66);
        map.put("DD",44);
        map.put("EE",88);

        //方式一：获取 Map 中所有的 key 组成的 Set.
        //方法：keySet()
        Set keySet = map.keySet();

        for(Object key : keySet){
            Object value = map.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("-------------------------------------");

        //方式二：获取 Map 中所有的 value 组成的 Collection
        //方法： values()
        Collection coll = map.values();

        Iterator it = coll.iterator();
        while(it.hasNext()){
            Object value = it.next();
            System.out.println(value);
        }

        System.out.println("-------------------------------------");

        //方式三：获取 Map 中所有的 Entry（Entry是Map的内部类，一个Entry对应着一个key和一个value）组成的 Set。
        //方法：entrySet()
        Set entrySet = map.entrySet();

        for(Object o : entrySet){
            Entry entry = (Entry)o;

            Object key = entry.getKey();
            Object value = entry.getValue();

            String strKey = (String)key;
            Integer numValue = (Integer)value;

            System.out.println(strKey.toLowerCase() + "=" + value);
        }

        System.out.println("-------------------------------------");

        Iterator it2 = entrySet.iterator();

        while(it2.hasNext()){
            Entry entry = (Entry)it2.next();

            String key = (String)entry.getKey();
            Integer value = (Integer)entry.getValue();

            System.out.println(key.toLowerCase() + "=" + value);
        }
    }
}
