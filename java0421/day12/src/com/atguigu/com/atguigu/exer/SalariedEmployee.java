package com.atguigu.com.atguigu.exer;

public class SalariedEmployee extends Employee{

    private double monthlySalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double earnings(){
        return monthlySalary;
    }

    public String toString(){
        return super.toString() + " 月工资为：" + monthlySalary;
    }
}
