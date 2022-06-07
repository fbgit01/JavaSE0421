package com.atguigu.com.atguigu.exer;

import java.util.Scanner;

public class PayrollSystem {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];//多态数组
        employees[0] = new SalariedEmployee("张三", 101, new MyDate(2011, 10, 10), 5000);
        employees[1] = new HourlyEmployee("李四", 102,new MyDate(2020, 5, 5), 500, 8);
        employees[2] = new SalariedEmployee("王五", 103, new MyDate(2019, 8,8), 10000);
        employees[3] = new HourlyEmployee("赵柳", 104,new MyDate(2010, 6, 6), 800, 8);
        employees[4] = new SalariedEmployee("田七", 105, new MyDate(2022, 10,11), 10000);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("请输入月份：");
        int month = scan.nextInt();

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);

            if(employees[i].getBirthday().getMonth() == month){
                System.out.println("生日奖励 100：" + " 总工资：" + (employees[i].earnings() + 100));
            }
        }
    }

}
