package com.atguigu.exer;

/*
编写Computer类，包含CPU、内存、硬盘等属性，getDetails方法用于返回Computer的详细信息
编写PC子类，继承Computer类，添加特有属性和方法
编写NotePad子类，继承Computer类，添加特有属性和方法
编写Test类，在main方法中创建PC和NotePad对象，分别访问对象中特有的属性、方法，
以及从Computer类继承的属性和方法并打印输出。

改写Computer类，将所有属性声明为private，getDetails方法用于返回Computer的详细信息
在PC子类中直接访问继承的私有属性，结果如何？
在Computer类中对私有属性添加公有的get/set方法，在PC子类中通过这些公有的get/set
方法访问私有属性，结果如何？

在PC类中，覆盖getDetails方法，方法返回PC机的详细信息。
在Test类中调用getDetails方法，确认输出结果。

在Computer类中添加新的重载构造器，并调用原构造器
在PC类中添加新的重载构造器，并调用原构造器
使用PC类中新的重载构造器创建PC实例，调用getDetails方法获取输出结果，确认属性值
 */
public class ComputerExer {

    public static void main(String[] args) {
        /*PC pc = new PC();
        pc.cpu = "I7";
        pc.ram = 4;
        pc.hdd = "500G";

        pc.box = true;

        System.out.println(pc.getDetails());
        pc.hasBox();

        NotePad np = new NotePad();
        np.cpu = "i5";
        np.ram = 8;
        np.hdd = "1T";

        np.fold = true;

        System.out.println(np.getDetails());
        np.isFold();*/

        /*PC pc = new PC();
        pc.setCpu("i7");
        pc.setRam(8);
        pc.setHdd("2T");

        System.out.println(pc.getDetails());*/

        PC pc = new PC("i7", 8, "1T", true);
        System.out.println(pc.getDetails());
    }

}

class Computer{
    private String cpu;
    private int ram;
    private String hdd;

    public Computer(){
    }

    public Computer(String cpu, int ram, String hdd){
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
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

    public String getDetails(){
        return "CPU:" + cpu + " RAM:" + ram + " HDD:" + hdd;
    }
}

class PC extends Computer{

    boolean box;

    public PC(){
        //super();
    }

    public PC(String cpu, int ram, String hdd){
        super(cpu, ram, hdd);
    }

    public PC(String cpu, int ram, String hdd, boolean box){
        //super(cpu, ram, hdd);
        this(cpu, ram, hdd);
        this.box = box;
    }

    public void hasBox(){
        System.out.println("是否有主机箱：" + box);
    }

    public String getDetails(){
        //return "CPU: " + getCpu() + " RAM:" + getRam() + " HDD：" + getHdd() + " 是否有主机箱：" + box;
        return super.getDetails() + " 是否有主机箱：" + box;
    }
}

class NotePad extends Computer{

    boolean fold;

    public void isFold(){
        System.out.println("是否可以折叠：" + fold);
    }

}