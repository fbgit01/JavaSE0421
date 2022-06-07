package com.atguigu.exer;

/*
使用多态引用分别创建Computer、PC和NotePad实例，并将实例放在一个Computer类型的数组中。
遍历数组元素，分别调用getDetails方法获取输出结果。
在Computer类中增加price属性表示价格。
将数组元素按价格进行排序，并遍历打印输出。

在Test类中提供一个静态方法listPrice,以Computer引用变量为参数，打印输出电脑价格。
在main方法中，分别以Computer、PC、NotePad对象为参数，调用listPrice方法。

在方法listPrice中，判断Computer参数的真实对象，并调用不同对象上的特有方法

 */
public class ComputerExer {

    public static void main(String[] args) {
        /*Computer[] computers = new Computer[5];

        computers[0] = new Computer("i7", 8, "1T", 9999);//本态
        computers[1] = new PC("i5", 12, "500G", 6666, true); //多态
        computers[2] = new Notepad("i7", 8, "2T", 7777, true);//多态
        PC pc = new PC("i7", 16, "500G", 5555, true);
        computers[3] = pc;
        Computer com = new Notepad("i5", 16, "1T",8888, true);
        computers[4] = com;

        for (Computer computer : computers) {
            System.out.println(computer.getDetails());//虚拟方法调用
        }

        System.out.println("--------------------------------------------");

        //对数组元素按价格排序
        for (int i = 0; i < computers.length - 1; i++){
            for(int j = 0; j < computers.length - 1 - i; j++){
                if(computers[j].getPrice() < computers[j+1].getPrice()){
                    Computer temp = computers[j];
                    computers[j] = computers[j+1];
                    computers[j+1] = temp;
                }
            }
        }

        //遍历数组
        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i].getDetails());
        }*/
        PC pc = new PC("i7", 16, "500G", 5555, true);
        //Computer com = new Notepad("i5", 16, "1T",8888, true);
        listPrice(pc);
    }

    public static void listPrice(Computer computer){
        System.out.println(computer.getDetails());

        if(computer instanceof Notepad){
            //向下转型
            Notepad np = (Notepad) computer;
            np.isFold1();
        }

        if(computer instanceof PC){
            PC pc = (PC) computer;
            pc.hasBox();
        }
    }

}

class Computer{

    private String cpu;
    private int ram;
    private String hdd;
    private double price;

    public Computer() {
    }

    public Computer(String cpu, int ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    public Computer(String cpu, int ram, String hdd, double price) {
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

class PC extends Computer{

    private boolean box;

    public PC() {
    }

    public PC(String cpu, int ram, String hdd, boolean box) {
        super(cpu, ram, hdd);
        this.box = box;
    }

    public PC(String cpu, int ram, String hdd, double price, boolean box) {
        super(cpu, ram, hdd, price);
        this.box = box;
    }

    public boolean isBox() {
        return box;
    }

    public void setBox(boolean box) {
        this.box = box;
    }

    public void hasBox(){
        System.out.println("有主机箱");
    }

    public String getDetails(){
        return super.getDetails() + " 是否有主机箱：" + box;
    }
}

class Notepad extends Computer{

    private boolean fold;

    public Notepad() {
    }

    public Notepad(String cpu, int ram, String hdd, boolean fold) {
        super(cpu, ram, hdd);
        this.fold = fold;
    }

    public Notepad(String cpu, int ram, String hdd, double price, boolean fold) {
        super(cpu, ram, hdd, price);
        this.fold = fold;
    }

    public boolean isFold() {
        return fold;
    }

    public void setFold(boolean fold) {
        this.fold = fold;
    }

    public void isFold1(){
        System.out.println("可以折叠");
    }

    public String getDetails(){
        return super.getDetails() + " 是否可以折叠：" + fold;
    }
}