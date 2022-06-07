package com.atguigu.java1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
一、异常：不可预知的非正常情况

Java 中的异常都是以对象形式存在的，一旦某句代码发生异常，
会在该代码处生成一个异常对象，然后以堆栈式抛出
若不对该异常对象进行处理，最终导致程序终止运行

二、异常的体系结构：
java.lang.Throwable : 是所有错误和异常的父类
        |--java.lang.Error:错误，一些严重的错误。 如：内存溢出、系统错误等。我们不在代码中进行处理
        |--java.lang.Exception:异常，我们要尽可能的预知并处理的异常。 如：用户输入不匹配，网路连接中断等
                |--编译时异常（受检异常 checked）：编译时对其进行检查，若不对该异常进行处理，编译不能通过.
                |--运行时异常（非受检异常 unchecked）：可以保证程序的正常运行，但是一旦发生该异常，会在该代码处
                                                      生成一个异常对象，然后抛出，若不对该异常进行处理，程序终止运行

三、异常的处理：Java 中异常的出来采用的抓抛模型
“抛”：一旦某句代码发生异常，会在该代码处生成一个异常对象，然后堆栈式抛出
“抓”：将上述抛出的异常对象进行捕获

try{
    //可能发生异常的语句
}catch(异常类型 变量名){
    //异常的处理语句
}catch(Exception1 e1){
    //异常的处理语句
}catch(Exception2 e2){
    //异常的处理语句
}
……
finally{
    //一定被执行的语句
}

注意：
①catch 块可以有多个，若 catch 块中的异常类型具有子父类关系，必须子上父下
②catch 块可以有多个，一旦某个catch中的异常类型匹配成功，其他 catch 块将不再执行
③try-catch 可以嵌套

四、异常处理的常用方法
    printStackTrace() ： 打印异常的详细（堆栈）信息
    getMessage() : 获取异常的描述信息

 */
public class ExceptionTest {

    public static void main(String[] args) {
        //----------------Error-----------------
        //java.lang.StackOverflowError
        //main(args);

        //java.lang.OutOfMemoryError
        //byte[] bs = new byte[1024 * 1000 * 1000 * 1000];

        //------------------Exception--------------------
        //------------------编译时异常（受检异常 checked）--------------------
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("adsfasd");

            int len = 0;
            while ((len = fis.read()) != -1) {
                //
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }catch (NullPointerException e){
                e.printStackTrace();
            }
        }

        //------------------运行时异常（非受检异常 unchecked）--------------------
        //java.lang.ClassCastException : 类型转换异常
        /*Object obj = new String();

        try{
            Customer cust = (Customer)obj;
        }catch(ClassCastException e){
            String msg = e.getMessage();
            System.out.println(msg);
        }*/

        //java.lang.ArithmeticException:算数异常
        /*try{
            int res = div(10, 0);
            System.out.println(res);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch(NullPointerException e){
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("其他异常");
        }*/


        //java.lang.ArrayIndexOutOfBoundsException:数组下标越界异常
        /*int[] arr = new int[5];

        try{
            arr[5] = 10;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界异常");
        }*/

        //java.lang.NullPointerException:空指针异常
        /*Customer[] customers = new Customer[5];//{new Customer("张三", 18),new Customer("李四", 20), null}
        customers[0] = new Customer("张三", 18);
        customers[1] = new Customer("李四", 20);

        try {
            for (int i = 0; i < customers.length; i++) {
                System.out.println(customers[i].getName());
            }
        }catch(NullPointerException e){
            System.out.println("空指针异常");
        }*/

        /*Customer cust = null;

        try {
            System.out.println(cust.getName());
        }catch(NullPointerException e){
            System.out.println("空指针异常");
        }*/

        //java.util.InputMismatchException : 输入不匹配异常
        /*Scanner scan = new Scanner(System.in);

        System.out.print("请输入一个整数:");

        try {
            int num = scan.nextInt();
            System.out.println(num);
        }catch(InputMismatchException e){
            System.out.println("您的输入不匹配");
        }*/


        System.out.println("其他庞大功能");
    }

    public static int div(int a, int b) {
        return a / b;
    }

}
