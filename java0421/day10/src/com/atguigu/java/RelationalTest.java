package com.atguigu.java;

/*
对象的关联：简单的说，一个对象中使用了另一个对象
 */
public class RelationalTest {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("张三", 18, new Computer1("i8", 4, "500G", 5555));

        System.out.println(teacher.getDetails());
    }

}

class Computer1{

    private String cpu;
    private int ram;
    private String hdd;
    private double price;

    public Computer1() {
    }

    public Computer1(String cpu, int ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    public Computer1(String cpu, int ram, String hdd, double price) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getDetails() {
        return "CPU:" + cpu + " RAM:" + ram + " HDD:" + hdd + " 价格：" + price;
    }
}

class Teacher{

    private String name;
    private int age;

    private Computer1 computer;

    public Teacher() {
    }

    public Teacher(String name, int age, Computer1 computer) {
        this.name = name;
        this.age = age;
        this.computer = computer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer1 getComputer() {
        return computer;
    }

    public void setComputer(Computer1 computer) {
        this.computer = computer;
    }

    public String getDetails(){
        return name + "," + age + "," + computer.getDetails();
    }
}