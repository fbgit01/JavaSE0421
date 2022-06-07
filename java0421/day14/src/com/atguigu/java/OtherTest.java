package com.atguigu.java;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
java.util.Date : 日期类

java.text.DateFormat : 是一个抽象类
       |--java.text.SimpleDateFormat : 时间/日期的格式化

java.util.Calendar(日历)类

java.lang.Math类 :

	double ceil(double d) : 返回不小于d的最小整数
 	double floor(double d): 返回不大于d的最大整数
 	int round(float f) : 返回最接近f的int型（四舍五入）
 	long round(double d):返回最接近d的long型
 	double abs(double d):
 	double max(double d1, double d2) : 返回较大值
 	int min(int i1, int i2) :　返回较小值

 	double random() : 返回一个大于等于0.0并且小于1.0的随机数

java.math.BigInteger : 支持任意精度的整数
java.math.BigDecimal : 支持任意精度的浮点数
 */
public class OtherTest {

    @Test
    public void testBigInteger(){
        BigInteger bi = new BigInteger("12433241123");
        BigDecimal bd = new BigDecimal("12435.351");
        BigDecimal bd2 = new BigDecimal("11");
        System.out.println(bi);

        System.out.println(bd.divide(bd2,BigDecimal.ROUND_HALF_UP));
        System.out.println(bd.divide(bd2,15,BigDecimal.ROUND_HALF_UP));
    }


    @Test
    public void test4(){
        double d = 15.6;
        System.out.println(Math.ceil(d));
        System.out.println(Math.floor(d));
        System.out.println(Math.round(d));
        System.out.println(Math.abs(-d));
        System.out.println(Math.max(15.6, 22.22));
        System.out.println(Math.min(15.6, 22.22));


        double d1 = Math.random();
        System.out.println(d1);

        //生成一个 0-100 之前的随机整数
        int num = (int)(Math.random() * 32 + 1);
        System.out.println(num);
    }

    @Test
    public void test3() {
        Calendar calendar = Calendar.getInstance();
        // 从一个 Calendar 对象中获取 Date 对象
        Date date = calendar.getTime();
        //使用给定的 Date 设置此 Calendar 的时间
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, 8);
        System.out.println("当前时间日设置为8后,时间是:" +
                calendar.getTime());
        calendar.add(Calendar.HOUR, 2);
        System.out.println("当前时间加2小时后,时间是:" +
                calendar.getTime());
        calendar.add(Calendar.MONTH, -2);
        System.out.println("当前日期减2个月后,时间是:" +
                calendar.getTime());

    }

    @Test
    public void test2() throws ParseException {
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");

        String strDate = sdf.format(date);
        System.out.println(strDate);

        Date newDate = sdf.parse(strDate);
        System.out.println(newDate);

    }

    @Test
    public void test1() {
        Date date = new Date();
        System.out.println(date);

        long millis = date.getTime();
        System.out.println(millis);

        Date date1 = new Date(millis);
        System.out.println(date1);
    }

}
