package com.atguigu.java;

import org.junit.Test;

/*
一、StringBuffer 和 StringBuilder ： 可变的字符序列。二者具有兼容的 API

StringBuffer ：是线程安全的，因此效率低
StringBuilder ： 是线程不安全的，因此效率高

 * StringBuffer 和 StringBuilder 的常用方法：
 * 	① StringBuffer append(String str) : 添加
 * 	 StringBuffer insert(int offset, String str) ： 插入
 * 	 StringBuffer replace(int start, int end, String str)：替换
 *
 *  ② int indexOf(String str) ：返回子串的位置索引
 * 	 int lastIndexOf()
 *
 *  ③ String substring(int start, int end)：取子字符串序列
 *  ④ StringBuffer delete(int start, int end)：删除一段字符串
 *      StringBuffer deleteCharAt(int index):删除指定位置字符
 *  ⑤ String toString()：转换为String对象
 */
public class StringBufferTest {

    @Test
    public void test2(){
        StringBuilder sb = new StringBuilder("abcdef");
        String str = sb.substring(2, 5);
        System.out.println(str);

        sb.delete(2, 5);

        sb.deleteCharAt(1);

        System.out.println(sb);

        String newStr = sb.toString();
        System.out.println(newStr);

        System.out.println(sb.length());
    }

    @Test
    public void test1(){
        String str = "abc";
        StringBuffer sb = new StringBuffer(str);
        sb.append("def").append(123).append(15.6f).append(true);

        sb.insert(3, "OOO");

        sb.replace(3, 6, "TTT");

        sb.append("TTT");

        int index = sb.indexOf("TTT");
        int lastIndex = sb.lastIndexOf("TTT");

        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(sb);

    }

}
