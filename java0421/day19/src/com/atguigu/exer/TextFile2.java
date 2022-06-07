package com.atguigu.exer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
1. 改写程序TextFile.java，使用Buffered包装形式读取TextFile.java文本文件，为每行加上行号，
再连同内容一并输出到屏幕上。
 */
public class TextFile2 {

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            FileReader fr = new FileReader("D:\\200421JavaSE\\day19\\src\\com\\atguigu\\exer\\TextFile2.java");
            br = new BufferedReader(fr);

            String str = null;
            int row = 1;

            while((str = br.readLine()) != null){
                System.out.println(row++ + "." + str);
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
