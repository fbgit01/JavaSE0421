package com.atguigu.java;

/*
模仿牛人的自定义泛型类
 */
public class MyGeneric<T> {//T:Type E:Element K:key  V:value  R:Return

    private T t; //编译时不确定的属性类型

    public void add(T t){//不确定的数据类型
        //
    }

    public T get(){
        return null;
    }
}
