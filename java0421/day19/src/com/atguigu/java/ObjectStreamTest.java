package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/*
一、对象流：ObjectInputStream  &  ObjectOutputStream

1.对象的序列化：将内存中的对象永久的以二进制形式保存到磁盘中
①创建 FileOutputStream 实例
②(可选)创建缓冲流,包装节点流，用于提高效率
③创建对象流包装缓冲流，用于完成对象的序列化
④调用 writeXxx() 方法完成对象序列化
⑤关闭流
⑥需要序列化对象的类必须实现 java.io.Serializable 接口
⑦提供序列号 private static final long serialVersionUID = 1243235346L;

注意：transient 和 static 修饰的属性不会被序列化

2.反序列化：将磁盘中的对象进行读取

 */
public class ObjectStreamTest {

    //对象的反序列化
    @Test
    public void test4(){
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream("./person.dat");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ois = new ObjectInputStream(bis);

            Person p1 = (Person)ois.readObject();
            Person p2 = (Person)ois.readObject();
            Person p3 = (Person)ois.readObject();

            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
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

    //对象的序列化
    @Test
    public void test3(){
        Person p1 = new Person("张三", 18, new Computer(), "中国");
        Person p2 = new Person("李四", 22, new Computer(), "中国");
        Person p3 = new Person("王五", 35, new Computer(), "中国");

        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream("./person.dat");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            oos = new ObjectOutputStream(bos);

            oos.writeObject(p1);
            oos.writeObject(p2);
            oos.writeObject(p3);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //反序列化
    @Test
    public void test2(){
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream("./data.dat");
            ois = new ObjectInputStream(fis);

            int num = ois.readInt();
            boolean flag = ois.readBoolean();
            String str = ois.readUTF();

            System.out.println(num);
            System.out.println(flag);
            System.out.println(str);
        } catch (IOException e) {
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

    //序列化
    @Test
    public void test1(){
        int num = 10;
        boolean flag = true;
        String str = "abcde";
        ObjectOutputStream oos = null;

        try {
            //1. 创建 FileOutputStream 的实例，同时打开指定文件
            FileOutputStream fos = new FileOutputStream("./data.dat");

            //2. （可选）创建 BufferedOutputStream 缓冲流，包装节点流，用于提高效率
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            //3. 创建 ObjectOutputStream 的实例，包装对应的缓冲流，用于完成序列化
            oos = new ObjectOutputStream(bos);

            //4. 将指定内容写到目标地点
            oos.writeInt(num);
            oos.writeBoolean(flag);
            oos.writeUTF(str);
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
