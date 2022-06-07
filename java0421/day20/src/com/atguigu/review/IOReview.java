package com.atguigu.review;

import org.junit.Test;

import java.io.*;

/**
 * @author Hefei Li
 * 2020/5/20 9:20
 */
public class IOReview {

    //非文本文件的复制
    @Test
    public void test1() {
        String src = "C:\\Users\\LI\\Desktop\\1.jpg";
        String dest = "C:\\Users\\LI\\Desktop\\2.jpg";
        copyFile(src, dest);
    }

    public void copyFile(String src, String dest) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1. 创建 FileInputStream 的实例，同时打开指定文件
            FileInputStream fis = new FileInputStream(src);

            //2. 创建 FileOutputStream 的实例，同时打开指定文件
            FileOutputStream fos = new FileOutputStream(dest);

            //3. 创建 BufferedInputStream 的实例，包装节点流，用于提高效率
            bis = new BufferedInputStream(fis);

            //4. 创建 BufferedOutputStream 的实例，包装节点流，用于提高效率
            bos = new BufferedOutputStream(fos);

            //5. 读取指定文件的内容
            byte[] b = new byte[1024];
            int len = 0;

            while ((len = bis.read(b)) != -1) {
                //6. 将读取的内容写到目标地点
                bos.write(b, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //7. 关闭流
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
