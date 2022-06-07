package com.atguigu.review;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Hefei Li
 * 2020/5/18 9:50
 */
public class EmployeeExer {

    public static void main(String[] args) {
        Employee emp1 = new Employee("张三", 18, new MyDate(1999, 1, 1));
        Employee emp2 = new Employee("李四", 22, new MyDate(1988, 2, 2));
        Employee emp3 = new Employee("王五", 8, new MyDate(2002, 5, 8));
        Employee emp4 = new Employee("赵六", 35, new MyDate(2004, 10, 10));
        Employee emp5 = new Employee("田七", 19, new MyDate(1999, 5, 5));

        Comparator<Employee> com = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getBirthday().getYear().equals(o2.getBirthday().getYear())){
                    if(o1.getBirthday().getMonth().equals(o2.getBirthday().getMonth())){
                        return o1.getBirthday().getDay().compareTo(o2.getBirthday().getDay());
                    }else{
                        return o1.getBirthday().getMonth().compareTo(o2.getBirthday().getMonth());
                    }
                }else{
                    return o1.getBirthday().getYear().compareTo(o2.getBirthday().getYear());
                }
            }
        };

        TreeSet<Employee> ts = new TreeSet<>(com);
        ts.add(emp1);
        ts.add(emp2);
        ts.add(emp3);
        ts.add(emp4);
        ts.add(emp5);

        Iterator<Employee> it = ts.iterator();

        while(it.hasNext()){
            Employee emp = it.next();
            System.out.println(emp);
        }
    }

}
