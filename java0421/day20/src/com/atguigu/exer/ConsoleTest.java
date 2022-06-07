package com.atguigu.exer;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Mrs.An Xueying
 * 2020/5/20 11:17
 */
public class ConsoleTest {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            System.out.print("请输入：");
            in = System.in;
            byte[] b = new byte[1024];
            int len = 0;
            String inStr = null;
            while ((len = in.read(b)) != -1) {
                inStr = new String(b, 0, len);
                System.out.print("inStr = " + inStr);
                //inStr.charAt(0)=='e'
                //"e".equalsIgnoreCase(inStr
                if ("exit".equalsIgnoreCase(inStr.trim())) {
                    return;
                } else {
                    System.out.println(inStr.toUpperCase());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
