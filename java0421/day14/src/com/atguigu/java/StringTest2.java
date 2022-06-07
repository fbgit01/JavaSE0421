package com.atguigu.java;

public class StringTest2 {

    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "b";
        String str3 = "a" + "b";
        String str4 = (str1 + str2).intern();

        System.out.println(str3 == str4);
    }

}
