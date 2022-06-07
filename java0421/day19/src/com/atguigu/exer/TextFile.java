package com.atguigu.exer;

import java.io.FileReader;
import java.io.IOException;

/*
编写程序TextFile.java，在main方法中，读取TextFile.java文本文件，并将文件内容输出到屏幕上

选做：改进该程序，读取文件内容后，在每行开始加上行号，再连同内容一并输出到屏幕上。
	提示：可将读出的char数组转换为StringBuilder，然后在字符串中搜索“\n”，并在其之后插入行号即可。

 */
public class TextFile {

    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("D:\\200421JavaSE\\day19\\src\\com\\atguigu\\exer\\TextFile.java");

            char[] cbuf = new char[100];
            int len = 0;
            int index = 0;
            int row = 1;
            int fromIndex = 0;

            StringBuilder sb = new StringBuilder();
            sb.append(row++ + ".");

            while((len = fr.read(cbuf)) != -1){
                sb.append(cbuf, 0, len);

                while((index = sb.indexOf("\n", fromIndex)) != -1){
                    sb.insert(index+1, row++ + ".");
                    fromIndex = index + 1;
                }
            }

            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
