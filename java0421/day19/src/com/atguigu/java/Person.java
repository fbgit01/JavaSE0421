package com.atguigu.java;

import java.io.Serializable;

/**
 * @author Hefei Li
 * 2020/5/19 16:26
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 14353653456L;

    private String name;
    private int age;

    private Computer computer;

    private static String nation = "强大的中国";

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Computer computer) {
        this.name = name;
        this.age = age;
        this.computer = computer;
    }

    public Person(String name, int age, Computer computer, String nation) {
        this.name = name;
        this.age = age;
        this.computer = computer;
        this.nation = nation;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", computer=" + computer +
                ", nation='" + nation + '\'' +
                '}';
    }
}
