package com.atguigu.exer;

public class CylinderExer {

    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.setRadius(3);
        cy.setLength(10);

        System.out.println("圆柱的体积为： " + cy.findVolume());
    }

}

class Circle{

    private double radius;

    public Circle() {
        this.radius = 1;
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
}

class Cylinder extends Circle{

    private double length;

    public Cylinder() {
        this.length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //计算圆柱体积的方法
    public double findVolume(){
        return findArea() * length;
    }
}