package com.atguigu.java;

/*
多态的应用之一：多态数组
 */
public class PolymorphismTest3 {

    public static void main(String[] args) {
        Person[] persons = new Person[5];//多态数组
        persons[0] = new Person(); //本态
        persons[1] = new Man(); //多态-向上转型
        persons[2] = new Woman();

        Man man = new Man();//本态
        persons[3] = man; //多态

        Woman woman = new Woman();
        persons[4] = woman;

        for (int i = 0; i < persons.length; i++) {
            //Person p = persons[i];
            persons[i].eat();//虚拟方法调用
            persons[i].sleep();
        }
    }

}
