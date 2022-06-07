package com.atguigu.exer;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
编写程序，在main方法中，在当前目录下创建一个新目录newDir；
获取当前目录中所有文件列表信息，把这些信息写到目录newDir中的info.txt文件中。

 */
public class FileExer2 {

    @Test
    public void test1(){
        File file3 = new File("./newDir/info.txt");
        System.out.println(file3.getAbsolutePath());
    }

    public static void main(String[] args) {
        BufferedWriter bw = null;
        try {
            File file = new File("./newDir");
            if(!file.exists()){
                file.mkdir();
            }

            File file2 = new File("./");
            String[] strs = file2.list();

            File file3 = new File("./newDir/info.txt");
            System.out.println(file3.getAbsolutePath());
            FileWriter fw = new FileWriter(file3);
            bw = new BufferedWriter(fw);

            for (int i = 0; i < strs.length; i++) {
                bw.write(strs[i]);
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
        }

    }

}
