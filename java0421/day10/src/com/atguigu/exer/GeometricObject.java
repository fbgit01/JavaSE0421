package com.atguigu.exer;

/*
代表几何图形
 */
public class GeometricObject {

    private String color;
    private double weight;

    public GeometricObject() {
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

    //计算面积的方法(大家记住这个位置)
    public double findArea(){//为了虚拟方法调用
        return 0.0;
    }
}
