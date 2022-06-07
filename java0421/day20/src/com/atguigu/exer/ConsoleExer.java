package com.atguigu.exer;

import org.junit.Test;

import java.io.*;

/*
从键盘输入字符串，要求将读取到的整行字符串转成大写输出。然后继续进行输入操作，
直至当输入“e”或者“exit”时，退出程序。

编写程序，在main方法中读取键盘键入的10组数字，将这些数字保存在num.txt文件中；
查看num.txt文件的内容，验证复制是否正确。

 */
public class ConsoleExer {

    @Test
    public void test2(){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            InputStream in = System.in;
            InputStreamReader isr = new InputStreamReader(in);
            br = new BufferedReader(isr);

            //为了演示转换流，用字节流操作文本文件
            FileOutputStream fos = new FileOutputStream("./num.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);

            String str = null;

            while((str = br.readLine()) != null){
                bw.write(str);
                bw.flush();
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
        BufferedReader br = null;
        try {
            InputStream in = System.in;
            InputStreamReader isr = new InputStreamReader(in);
            br = new BufferedReader(isr);

            String str = null;

            while((str = br.readLine()) != null){
                if(str.equalsIgnoreCase("e") || str.equalsIgnoreCase("exit")){
                    break;
                }else{
                    System.out.println(str.toUpperCase());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
