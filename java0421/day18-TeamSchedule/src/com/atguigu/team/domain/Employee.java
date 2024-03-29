package com.atguigu.team.domain;

/**
*员工类
*@author Hefei Li
*2020/5/18 11:08
*/
public class Employee {

    private Integer id;
    private String name;
    private Integer age;
    private Double salary;

    public Employee() {
    }

    public Employee(Integer id, String name, Integer age, Double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDetails(){
        return id + "\t" + name + "\t" + age + "\t\t" + salary;
    }

    @Override
    public String toString() {
        return getDetails();
    }
}
