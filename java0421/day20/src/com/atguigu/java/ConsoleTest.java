package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/*
一、
[了解]
控制台IO
System.in : “标准”的输入流
System.out : “标准”的输出流
System.err : “标准”的错误输出流

打印流：PrintStream & PrintWriter

二、
【重要】
转换流：InputStreamReader & OutputStreamWriter
编码：字符串 -> 字节数组
解码：字节数组  -> 字符串
 */
public class ConsoleTest {

    //解码
    @Test
    public void test6() throws IOException {
        FileInputStream fis = new FileInputStream("./hello.txt");
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String str = null;
        while((str = br.readLine()) != null){
            System.out.println(str);
        }

        br.close();
    }

    //编码
    @Test
    public void test5() throws IOException {
        String str = "helloworldhahahahah我大尚硅谷威武！";

        //本例测试转换流，因此用字节流操作文本文件
        FileOutputStream fos = new FileOutputStream("./hello.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write(str);

        bw.close();
    }

    //解码
    @Test
    public void test4() throws IOException {
        InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);

        String str = null;
        while((str = br.readLine()) != null){
            System.out.println("--" + str);
        }

        br.close();
    }

    @Test
    public void test3() throws IOException { //本例暂时 throws 但是你们需要 try-catch
        InputStream in = System.in;

        byte[] b = new byte[1024];
        int len = 0;

        while((len = in.read(b)) != -1){
            System.out.println(new String(b, 0, len));
        }

        in.close();
    }

    //打印流
    @Test
    public void test2() throws IOException {

        try{
            int res = 10 / 0;
        }catch(ArithmeticException e){
            e.printStackTrace(new PrintWriter(new FileWriter("./log.txt"), true));
        }

    }

    //标准的输出流
    @Test
    public void test1() throws FileNotFoundException {

        System.setOut(new PrintStream(new FileOutputStream("./hello.txt")));

        System.out.println("标准的输出流");

        /*PrintStream ps = System.out;
        ps.println("标准的输出流");*/

        //System.err.println("标准的错误输出流");
    }

}
