package com.atguigu.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

    HelloWorld hw = new HelloWorld();

    @Before
    public void before(){
        System.out.println("测试方法执行前……");
    }

    @Test
    public void testEat(){
        hw.eat();
    }

    @Test
    public void test01(){
        System.out.println("HelloWorld!");
    }

    @After
    public void after(){
        System.out.println("测试方法执行后……");
    }


}
