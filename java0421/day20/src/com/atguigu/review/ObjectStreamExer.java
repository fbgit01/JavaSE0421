package com.atguigu.review;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
编写Person类，包含姓名、年龄、体重等属性，提供对应的访问方法；
编写测试类1，在main方法中创建三个不同的Person对象，将这三个对象序列化到文件中；
编写测试类2，在main方法中从文件中反序列化三个Person对象，打印输出。验证序列化的正确；
在测试类1中，将三个Person对象放到数组中，序列化该数组到一个独立的文件中。再将三个Person对象放到List集合中，序列化该集合到另一个独立的文件中；
在测试类2中，将三个Person对象从数组文件中反序列化，并打印；
将三个Person对象从List集合文件中反序列，并打印。验证数组对象和集合对象的序列化。
 */
public class ObjectStreamExer {

    @Test
    public void test2(){
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream("person.dat");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ois = new ObjectInputStream(bis);

            /*Person[] persons = (Person[])ois.readObject();

            for (Person person : persons) {
                System.out.println(person);
            }*/

            List<Person> list = (List<Person>)ois.readObject();

            Iterator<Person> it = list.iterator();

            while(it.hasNext()){
                System.out.println(it.next());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    @Test
    public void test1(){
        Person p1 = new Person("张三", 18, 100.88);
        Person p2 = new Person("张三", 22, 100.88);
        Person p3 = new Person("张三", 33, 100.88);

//        Person[] persons = new Person[]{p1, p2, p3};
        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        ObjectOutputStream oos = null;

        try {
            //1. 创建节点流对象，同时打开指定文件
            FileOutputStream fos = new FileOutputStream("./person.dat");

            //2. 创建缓冲流，包装节点流，用于提高效率
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            //3. 创建对象流，包装缓冲流，用于序列化
            oos = new ObjectOutputStream(bos);

            //4. 完成序列化操作
            /*oos.writeObject(p1);
            oos.writeObject(p2);
            oos.writeObject(p3);*/

//            oos.writeObject(persons);

            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5. 关闭流
            if(oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    
}
