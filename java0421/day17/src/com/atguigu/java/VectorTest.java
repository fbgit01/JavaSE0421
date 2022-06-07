package com.atguigu.java;

import java.util.Enumeration;
import java.util.Vector;

/*
Vector ： 是一个古老的实现，相较于 ArrayList 是线程安全的，因此效率低
 */
public class VectorTest {

    public static void main(String[] args) {
        Vector vec = new Vector();
        vec.addElement("AA");
        vec.addElement("BB");
        vec.addElement("CC");

        Enumeration elements = vec.elements();

        while(elements.hasMoreElements()){
            Object obj = elements.nextElement();
            System.out.println(obj);
        }
    }

}
