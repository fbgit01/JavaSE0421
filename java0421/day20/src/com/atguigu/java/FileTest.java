package com.atguigu.java;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
一、java.io.File 类：用于描述文件、目录。 可用于对文件或目录的 删除、新建、重命名等基本操作
                    若需要操作文件的内容，File 类的对象将无能为力，需要使用 IO 流。
                    通常 File 类的实例与 IO 流配合使用。可以将 File 类的对象作为参数传递给 IO 流的构造器
 */
public class FileTest {

    /*
    目录操作相关
    mkDir() : 新建目录
    mkDirs() ： 新建完整路径对应的目录
    list() : 获取指定目录下所有文件名称列表
    listFiles() ： 获取指定目录下所有文件或目录的 File 对象
     */
    @Test
    public void test6(){
        //File file = new File("d:/io/abc");
        /*boolean b = file.mkdir();
        System.out.println(b);*/
        /*boolean b = file.mkdirs();
        System.out.println(b);*/

        File file = new File("d:/");
        /*String[] strs = file.list();
        for (String str : strs) {
            System.out.println(str);
        }*/

        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName() + "===" + file1.getPath());
        }
    }

    /*
    文件操作相关
    createNewFile() ： 新建文件
    delete() : 删除文件或目录。注意：删除目录时需要保证目录中没有内容
     */
    @Test
    public void test5() throws IOException {
        /*File file = new File("d:/io/world.txt");

        if(!file.exists()){
            file.createNewFile();
        }

        boolean b = file.delete();
        System.out.println(b);*/

        File file = new File("d:/io");
        boolean b = file.delete();
        System.out.println(b);

    }

    /*
    获取常规文件信息
    lastModified() : 获取最后修改时间
    length() ： 获取文件的大小。注意：目录没有大小
     */
    @Test
    public void test4(){
        File file1 = new File("d:/io/hello.txt");
        long millis = file1.lastModified();
        Date date = new Date(millis);
        System.out.println(date);

        System.out.println(file1.length());

        System.out.println("------------------------------------------");

        File file2 = new File("d:/io");
        Date date2 = new Date(file2.lastModified());
        System.out.println(date2);
        System.out.println(file2.length());
    }

    /*
    文件检测
    exists() : 判断是否存在
    canWrite() ： 判断是否可写
    canRead() ： 判断是否可读
    isFile() ： 判断是不是一个文件
    isDirectory() ： 判断是不是一个目录
     */
    @Test
    public void test3(){
        File file1 = new File("d:/io/hello555.txt");
        System.out.println(file1.exists());
        System.out.println(file1.canWrite());
        System.out.println(file1.canRead());
        System.out.println(file1.isFile());
        System.out.println(file1.isDirectory());

        System.out.println("--------------------------");

        File file2 = new File("d:/io");
        System.out.println(file2.exists());
        System.out.println(file2.canWrite());
        System.out.println(file2.canRead());
        System.out.println(file2.isFile());
        System.out.println(file2.isDirectory());
    }

    /*
    访问文件名：
    getName() : 获取文件或目录名
    getPath() ： 获取相对路径
    getAbsoluteFile() ： 获取绝对路径对应的 File 对象
    getAbsolutePath() ： 获取绝对路径
    getParent() ： 获取父路径
    renameTo(File newName) : 重命名
        file1.renameTo(file2) ： file1必须存在，file2必须不存在
     */
    @Test
    public void test2(){
        File file1 = new File("d:/io/hello.txt");
        File file2 = new File("d:/io/abc/hello2.txt");

        boolean b = file1.renameTo(file2);
        System.out.println(b);
    }

    @Test
    public void test1(){
        File file1 = new File("./hello.txt");
        System.out.println(file1.getName());
        System.out.println(file1.getPath());
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getParent());

        System.out.println("---------------------------------");

        File file2 = new File("d:/io");
        System.out.println(file2.getName());
        System.out.println(file2.getPath());
        System.out.println(file2.getAbsoluteFile());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getParent());
    }

}
