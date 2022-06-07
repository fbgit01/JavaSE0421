package com.atguigu.com.atguigu.exer;

/*
将Frock类声明为抽象类，在类中声明抽象方法calcArea方法，用来计算衣服的布料面积。
通过编写代码来验证抽象类中是否可包含属性、具体方法和构造器。
编写Shirt类继承Frock类，实现 calcArea方法，用来计算衬衣所需的布料面积（尺寸*1.3）。
在TestShirt类的main方法中：
试着创建Frock对象，确认是否允许？
使用本态引用创建Shirt对象，并调用calcArea方法，打印计算结果。
使用Frock 多态引用创建Shirt对象，并调用calcArea方法，打印计算结果。

声明Clothing接口 ，在接口中声明 calcArea方法、getColor方法和getDetails方法。
改写Shirt类实现Clothing接口，然后实现接口中的所有方法。
在TestShirt类的main方法中：
试着创建 Clothing对象，确认是否允许？
使用本态引用创建Shirt对象，并调用calcArea方法，打印计算结果。
使用Clothing多态引用创建Shirt对象，并调用calcArea方法，打印计算结果。

 */
public class FrockExer {

    public static void main(String[] args) {
        //Frock f = new Frock();

        /*Shirt s = new Shirt("白色", 5.5); //本态
        double d = s.calcArea();
        System.out.println(d);

        Frock f = new Shirt("黑色", 6.6);//多态
        double area = f.calcArea();//虚拟方法调用（动态绑定）
        System.out.println(area);*/

        //Clothing c = new Clothing();

        /*Shirt s = new Shirt("黑色", 6.6);
        System.out.println(s.getDetails());*/

        Clothing c = new Shirt("黑色", 6.6);//多态
        System.out.println(c.getDetails());
    }

}

//声明一个接口
interface Clothing{

    public double calcArea();

    public String getColor();

    public String getDetails();

}

abstract class Frock{

    private String color;

    public Frock() {
    }

    public Frock(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calcArea();
}

class Shirt extends Frock implements Clothing{
    private double size;

    public Shirt() {
    }

    public Shirt(double size) {
        this.size = size;
    }

    public Shirt(String color, double size) {
        super(color);
        this.size = size;
    }

    /*
    public String getColor() {
        return color;
    }
     */

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double calcArea(){
        return size * 1.3;
    }

    public String getDetails() {
        return getColor() + "," + calcArea();
    }
}