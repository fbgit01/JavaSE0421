package com.atguigu.exer;

import java.io.File;

/*
利用File构造器，new 一个目录file
1）在其中创建多个文件和目录
2）编写方法，实现删除file中文件的操作

 */
public class FileExer1 {

    public static void main(String[] args) {
        boolean b = deleteFile(new File("d:/io"));
        System.out.println(b);
    }

    public static boolean deleteFile(File file){
        //1. 判断是否存在
        if(!file.exists()){
            return true;
        }

        if(file.isDirectory()){
            //
            File[] files = file.listFiles();

            for (File f : files) {
                deleteFile(f);//递归方法调用
            }

            return file.delete();

        }else{
            return file.delete();
        }
    }

}
