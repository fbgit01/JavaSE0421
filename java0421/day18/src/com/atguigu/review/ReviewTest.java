package com.atguigu.review;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.Map.*;

/**
 * @author Hefei Li
 * 2020/5/18 9:04
 */
public class ReviewTest {
    @Test
    public void test4(){
        Map<String, Integer> map = new HashMap<>();
        map.put("AA", 11);
        map.put("BB", 22);

        //遍历Map的方式三：获取 Map 中所有的 Entry（一个 Entry 对应着一个 key 和一个 value） 组成的 Set
        Set<Entry<String, Integer>> entrySet = map.entrySet();

        Iterator<Entry<String, Integer>> it = entrySet.iterator();

        while(it.hasNext()){
            Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + "=" + value);
        }
    }

    @Test
    public void test3(){
        List<String> list = new ArrayList<String>();
        list.add("AA");
        list.add("BB");

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            String str = it.next();
            System.out.println(str.toLowerCase());
        }
    }

    @Test
    public void test2(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add(11);

        Iterator it = list.iterator();

        while(it.hasNext()){
            Object obj = it.next();
            //若调用 Object 子类的特有方法时
            String str = (String) obj;
            System.out.println(str.toLowerCase());
        }
    }

    //利用 Properties 操作属性文件
    @Test
    public void test1() throws IOException {
        //1. 创建 Properties 的对象
        Properties props = new Properties();

        //2. 通过 load() 方法加载属性文件
        props.load(new FileInputStream("jdbc.properties"));

        //3. 通过 getProperty() 根据 key 获取对应的 value
        String username = props.getProperty("username");
        String password = props.getProperty("password");

        System.out.println(username);
        System.out.println(password);
    }

}
