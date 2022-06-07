package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/*
一、IO 流的分类：
按传输情况不同：
1. 按流向不同：输入流、输出流（以程序为主体）
2. 按类型不同：字节流、字符流（字符流用于操作文本文件 .txt .java 字节流用于操作非文本文件 .avi .rmvb .mp3 .jpg）
3. 按角色不同：字节流、处理流

二、IO 体系结构
抽象基类            节点流
InputStream         FileInputStream
OutputStream        FileOutputStream
Reader              FileReader
Writer              FileWriter

 */
public class IOTest {

    //文本文件的复制
    @Test
    public void test6(){
        String src = "C:\\Users\\LI\\Desktop\\1.txt";
        String dest = "./1.txt";
        copyTextFile(src, dest);
    }

    public void copyTextFile(String src, String dest){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1. 创建 FileReader 的实例，同时打开指定文件
            fr = new FileReader(src);

            //2. 创建 FileWriter 的实例，同时打开指定文件
            fw = new FileWriter(dest);

            //3. 读取指定文件的内容
            char[] cbuf = new char[100];
            int len = 0;

            while((len = fr.read(cbuf)) != -1){
                //4. 将读取的内容写到目标地点
                fw.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5. 关闭俩流
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //非文本文件的复制
    @Test
    public void test5(){
        long start = System.currentTimeMillis();

        String src = "C:\\Users\\LI\\Desktop\\1.avi";
        String dest = "C:\\Users\\LI\\Desktop\\6.avi";
        copyFile(src, dest);

        long end = System.currentTimeMillis();

        System.out.println("耗费时间为：" + (end - start)); //3922 3118  3747
    }

    //
    public void copyFile(String src, String dest){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1. 创建 FileInputStream 的实例，同时打开指定文件
            fis = new FileInputStream(src);

            //2. 创建 FileOutputStream 的实例，同时打开指定文件
            fos = new FileOutputStream(dest);

            //3. 读取指定文件的内容
            byte[] b = new byte[1024];
            int len = 0;

            while((len = fis.read(b)) != -1){
                //4. 将读取的内容，写到目标地点去
                fos.write(b, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5. 关闭俩流
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //将数据写到目标地点
    @Test
    public void test4(){
        String str = "abcde我大尚硅谷威武！";

        FileOutputStream fos = null;
        try {
            //1. 创建 FileOutputStream 的实例，同时打开指定文件
            fos = new FileOutputStream("./hello2.txt");

            //2. 将数据写到目标地点
            fos.write(str.getBytes());//getBytes() 将字符串转换成字节数组
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            //3. 关闭流
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //[完善的写法]
    @Test
    public void test3(){
        FileInputStream fis = null;
        try {
            //1. 创建 FileInputStream 的实例，同时打开指定文件
            fis = new FileInputStream("D:/200421JavaSE/day19\\hello.txt");

            //2. 读取指定文件的内容
            byte[] b = new byte[3];
            int len = 0;

            while ((len = fis.read(b)) != -1) {
                System.out.println(new String(b, 0, len));
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            //3. 关闭流
            if(fis != null){
                try{
                    fis.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void test2() throws IOException {
        //1. 创建 FileInputStream 的实例，同时打开指定文件
        FileInputStream fis = new FileInputStream("D:/200421JavaSE/day19\\hello.txt");

        //2. 读取指定文件的内容
        byte[] b = new byte[3];//{d, e, c}
        int len = fis.read(b);//len=3

        while(len != -1){
            System.out.print(new String(b, 0, len));//abcdec

            len = fis.read(b);//len=2
        }

        //3. 关闭流
        fis.close();
    }

    //小心：虽然字节可以操作文本文件，但是有可能会产生乱码的问题，操作文本文件效率略低于字符流
    @Test
    public void test1() throws IOException {
        //1. 创建 FileInputStream 的实例，同时打开指定文件
        FileInputStream fis = new FileInputStream("D:/200421JavaSE/day19\\hello.txt");

        //2. 通过 read() 方法读取指定文件的内容
        int l = fis.read();

        while(l != -1){
            System.out.println((char)l);

            l = fis.read();
        }

        //3. 关闭流
        fis.close();
    }

}
