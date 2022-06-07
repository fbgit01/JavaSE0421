package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
throws ： 处理异常的方式之一，只不过处理异常的方式是，将异常抛出，交给调用者做具体的处理

    使用在方法的声明处，后面跟上异常的类型

【补充】子类重写方法抛出异常类型的范围不能大于父类被重写方法的异常类型范围

 */
public class ExceptionTest2 {

    public static void main(String[] args) {
        /*Person p = new Student();
        try{
            p.eat();
        }catch(NullPointerException e){
            e.printStackTrace();
        }*/


        try {
            show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void show() throws FileNotFoundException, IOException{
        FileInputStream fis = new FileInputStream("");

        fis.read();

        fis.close();
    }

}

class Person{

    public void eat() throws NullPointerException{

    }

}

class Student extends Person{


    @Override
    public void eat(){

    }

}