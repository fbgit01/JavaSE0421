package com.atguigu.com.atguigu.exer;

public class HourlyEmployee extends Employee{

    private double wage;
    private double hour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, double hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double earnings(){
        return wage * hour;
    }

    public String toString(){
        return  super.toString() + " 工资为：" + earnings();
    }
}
