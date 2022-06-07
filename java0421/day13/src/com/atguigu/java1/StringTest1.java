package com.atguigu.java1;

import org.junit.Test;

/*
一、String ： 不可变的字符序列

        String str1 = "abc";
        String str2 = new String("abc");
        二者的区别：
              str1 : 代表一个对象，至少在内存中开辟一块内存空间
                        （至少的意思是，"abc"存常量池，存储的方式是现在常量池中找，是否有 "abc",
                         如果有，直接获取地址值，如果没有则重新开辟内存空间）。
              str2 : 代表两个对象，至少在内存中开辟两块内存空间。

二、String类的常用方法
 * 1. 获取字符串的方法：
 * 		①String concat(String str)：串接字符串
 * 		②String substring(int beginIndex)：获取取字符串的子串
 * 		  String substring(int beginIndex, endIndex) : 包含头不包含尾
 * 		③String toLowerCase()和String toUpperCase()：转换为小写/大写
 * 		④String trim()：删除首尾空格或制表符
 * 2. 搜索方法：
 * 		①int indexOf(int ch) : 获取指定字符在字符串中的位置,若没有指定的字符，返回 -1
 * 		 int indexOf(int ch, int fromIndex) : 从指定位置开始搜索
 * 		 int indexOf(String str)
 * 		 int indexOf(String str, int fromIndex)
 * 		 int lastIndexOf(int ch) : 反向获取指定字符位置
 * 3. 判断方法：
 *  	① boolean equals(Object obj)：判断是否相等
 *  	   boolean equalsIgnoreCase(String str)：判断是否相等,不考虑大小写
 *  	② boolean contains(String str) :判断是否包含某字符串
 *	   	③ boolean startsWith(String str)和 boolean endsWith(String str)：判断是否以指定字符串开始/结尾
 *	   	④ boolean isEmpty():判断字符串是否为空
  * 4. 其它方法：
 * 		①length()：返回字符串长度
 * 		②char charAt(int index):返回索引处的字符
 * 		③将字符数组转换为字符串
 * 			构造器：
 * 				  String(char[] ch)
 * 				  String(char[] ch, offset, count) : 将数组中一部分转换为字符串, count 代表转几个
 * 			静态方法：
 * 				  static String copyValueOf(char[] ch)
 * 				  static String copyValueOf(char[] ch, offset, count)
 * 				  static String valueOf(char[])
 * 		 将字符串转换字符数组: char[] toCharArray()
 * 		④String replace(char oldCahr, char newCahr) ： 替换字符串中字符
 * 		  String replace(String oldStr, String oldStr)：替换字符串中字符串
 *		⑤String[] split(String r):根据指定符号切割
 * 
 */
public class StringTest1 {

    @Test
    public void test8(){
        String str = "abc,defb,cbcb,cbc";
        System.out.println(str.replace('c', 'O'));
        System.out.println(str.replace("bc", "OOOO"));

        String[] strs = str.split(",");
        for (String s : strs) {
            System.out.println(s);
        }
    }
    
    //将字符数组转换为字符串
    //作业：查看api，查找字节数组与字符串之间的转换
    @Test
    public void test7(){
        //将字符数组转换为字符串
        char[] chs = {'a', 'b', 'c', 'd', 'e'};
        String str = new String(chs);
        System.out.println(str);

        String str2 = new String(chs, 1, 2);
        System.out.println(str2);

        String str3 = String.valueOf(chs, 0, 3);
        System.out.println(str3);

        String str4 = String.copyValueOf(chs, 0, 3);
        System.out.println(str4);

        System.out.println("--------------------------------");

        //将字符串转换成字符数组
        String str5 = "abcdef";
        char[] chars = str5.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

    //4. 其它方法
    @Test
    public void test6(){
        String str = "abcdef";
        System.out.println(str.length());

        char ch = str.charAt(0);
        System.out.println(ch);
    }

    //3. 判断方法
    @Test
    public void test5(){
        String str1 = "abc";
        String str2 = new String("aBc");

        boolean b = str1.equals(str2);
        System.out.println(b);

        System.out.println(str1.equalsIgnoreCase(str2));

        String str3 = "abcdef";
        System.out.println(str3.contains("abc"));

        System.out.println(str3.startsWith("abc"));
        System.out.println(str3.endsWith("def"));

        String str4 = "";
        System.out.println(str4.isEmpty());
    }

    //2. 搜索方法
    @Test
    public void test4(){
        String str = "abcdefbcbcbc";
        int i = str.indexOf('t');
        System.out.println(i);

        i = str.indexOf('c', 3);
        System.out.println(i);

        i = str.indexOf("bcddfdfd");
        System.out.println(i);

        i = str.lastIndexOf('c');
        System.out.println(i);
    }

    //1. 获取字符串的方法：
    @Test
    public void test3(){
        String str1 = "aBc";
        String str2 = "def";

        String str3 = str1.concat(str2);
        System.out.println(str3);//abcdef

        String str4 = str3.substring(2);
        System.out.println(str4);

        String str5 = str3.substring(2, 4);
        System.out.println(str5);

        String str6 = str3.toLowerCase();
        System.out.println(str6);

        System.out.println(str3.toUpperCase());

        String str7 = "   abcdef\t\t";
        System.out.println(str7);
        String str8 = str7.trim();
        System.out.println(str8);
    }

    @Test
    public void test2(){
        String str = "abc";
        String str1 = "def";
        String str2 = "ddd";
        String str3 = "fff";

        String str5 = str + str1 + str2 + str3;//
    }

    @Test
    public void test1(){
        String str1 = "abc";
        String str2 = new String("abc");
        String str4 = new String("abc");


        String str3 = "abc";

        System.out.println(str1 == str2);//false
        System.out.println(str1 == str3);//true
        System.out.println(str2 == str4);//false
    }

}
