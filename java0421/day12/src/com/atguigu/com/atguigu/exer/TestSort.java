package com.atguigu.com.atguigu.exer;

public class TestSort {

    public static void main(String[] args) {
        Sortable[] a = new Sortable[5];

        a[0] = new Rectangle(10, 20);
        a[1] = new Student(99);
        a[2] = new Rectangle(20, 20);
        a[3] = new Student(60);
        a[4] = new Student(88);

        Sort.selectSort(a);

        for (Sortable s : a) {//多态
            System.out.println(s);//虚拟方法调用
        }
    }

}
