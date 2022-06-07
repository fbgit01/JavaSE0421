package com.atguigu.exer;

public class CircleExer {

    public static void main(String[] args) {
        /*Circle c1 = new Circle("黑色", 2.2, 5.5);
        Circle c2 = new Circle("黑色", 2.2, 5.5);*/

        GeometricObject c1 = new Circle(2.2);
        GeometricObject c2 = new Circle(2.2);

        System.out.println(c1.equals(c2));

        System.out.println(c1);
        System.out.println(c2);
    }
}

class GeometricObject{
    protected String color;
    protected double weight;

    public GeometricObject() {
        this.color = "white";
        this.weight = 1.0;
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Circle extends GeometricObject{

    private double radius;

    public Circle() {
        this.color = "white";
        this.weight = 1.0;
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.color = "white";
        this.weight = 1.0;
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //计算圆面积的方法
    public double findArea(){
        return Math.PI * radius * radius;
    }

    /*
    public boolean equals(Object obj){
        return this == obj;
    }
     */

    //比较两个圆的半径是否相等
    public boolean equals(Circle c){//注意该方法不是重写
        return this.radius == c.radius;
    }

    //重写 Object 的 toString
    public String toString(){
        return "圆的半径为：" + radius;
    }
}