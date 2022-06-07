package com.atguigu.java;

public class ExceptionTest1 {

    static int num = 0;

    public static void main(String[] args) {
        int num = div(10, 0);
        System.out.println(num);
    }

    public static int div(int a, int b){

        try{
            num = a / b;
        }catch (ArithmeticException e){
            System.out.println("算数异常");

            return num;
        }catch(Exception e){
            System.out.println("其他异常");
        }finally {

            num++;
            System.out.println("一定执行的语句" + num);
        }

        return 100;
    }
}
