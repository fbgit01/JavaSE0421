package com.atguigu.java;

/*
一、throw : 制造异常 [可以替代return]

    throw 使用在方法体内，后面跟异常对象

【面试题】 throw 和  throws 的区别？

二、自定义异常：
1. 继承一个异常类
（若需要自定义异常为运行时异常，则继承 RuntimeException，若需要自定义异常为编译时异常则继承 Exception）
2. 声明有参构造器，目的为 getMessage() 方法设置值（设置异常的描述信息）
 */
public class ExceptionTest3 {

    public static void main(String[] args) {

        try {
            div(10, 0);
        } catch (ChuShuBuNengWeiLingException e) {
            String msg = e.getMessage();
            System.out.println(msg);
        }

    }












    public static int div(int a , int b) throws ChuShuBuNengWeiLingException{
        if(b == 0){
            //throw new ArithmeticException("除数不能为零！");
            throw new ChuShuBuNengWeiLingException("除数不能为零！");
            //throw new Exception("除数不能为零！");
        }

        return a / b;
    }

}
