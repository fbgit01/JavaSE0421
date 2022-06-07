package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/*
一、IO 流的分类：
按传输情况不同：
1. 按流向不同：输入流、输出流（以程序为主体）
2. 按类型不同：字节流、字符流（字符流用于操作文本文件 .txt .java 字节流用于操作非文本文件 .avi .rmvb .mp3 .jpg）
3. 按角色不同：节点流、处理流

二、IO 体系结构
抽象基类            节点流                     缓冲流（处理流的一种）
InputStream         FileInputStream          BufferedInputStream
OutputStream        FileOutputStream         BufferedOutputStream(flush()-清空缓冲区)
Reader              FileReader               BufferedReader(readLine())
Writer              FileWriter               BufferedWriter(newLine())

 */
public class BufferedStreamTest {

    //文本文件的复制
    @Test
    public void test2(){
        String src = "C:\\Users\\LI\\Desktop\\1.txt";
        String dest = "./2.txt";
        copyTextFile(src, dest);
    }

    public void copyTextFile(String src, String dest){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            FileReader fr = new FileReader(src);
            FileWriter fw = new FileWriter(dest);

            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);

            String str = null;
            while((str = br.readLine()) != null){
//                bw.write(str + "\n");
                bw.write(str);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void test1(){
        long start = System.currentTimeMillis();

        String src = "C:\\Users\\LI\\Desktop\\1.avi";
        String dest = "C:\\Users\\LI\\Desktop\\4.avi";
        copyFile(src, dest);

        long end = System.currentTimeMillis();

        System.out.println("耗费时间为：" + (end - start));//2199  1132  1215

    }

    //非文本文件的复制
    public void copyFile(String src, String dest){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1. 创建 FileInputStream 的实例，同时打开指定文件
            FileInputStream fis = new FileInputStream(src);

            //2. 创建 FileOutputStream 的实例，同时打开指定文件
            FileOutputStream fos = new FileOutputStream(dest);

            //3. 创建对应的 BufferedInputStream 的实例，包装现有节点流，用于提高效率
            bis = new BufferedInputStream(fis);

            //4. 创建对应的 BufferedOutputStream 的实例，包装现有节点流，用于提高效率
            bos = new BufferedOutputStream(fos);

            //5. 读取指定文件内容
            byte[] b = new byte[1024];
            int len = 0;

            while((len = bis.read(b)) != -1){
                //6. 将读取的内容写到目标地点
                bos.write(b, 0, len);
            }

            //bos.flush(); //清空缓冲区
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //7. 关闭流
            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

//    public void copyFile(String src, String dest){
//        //1. 创建 FileInputStream 的实例，同时打开指定文件
//        FileInputStream fis = new FileInputStream(src);
//
//        //2. 创建 FileOutputStream 的实例，同时打开指定文件
//        FileOutputStream fos = new FileOutputStream(dest);
//
//        //3. 创建对应的 BufferedInputStream 的实例，包装现有节点流，用于提高效率
//        BufferedInputStream bis = new BufferedInputStream(fis);
//
//        //4. 创建对应的 BufferedOutputStream 的实例，包装现有节点流，用于提高效率
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//
//        //5. 读取指定文件内容
//        byte[] b = new byte[1024];
//        int len = 0;
//
//        while((len = bis.read(b)) != -1){
//            //6. 将读取的内容写到目标地点
//            bos.write(b, 0, len);
//        }
//
//        //7. 关闭流
//        bos.close();
//        bis.close();
//    }

}
