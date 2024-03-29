package com.atguigu.exer;

public class MyRectangle extends GeometricObject{

    private double width;
    private double height;

    public MyRectangle() {
    }

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //计算矩形面积的方法
    public double findArea(){
        return height * width;
    }
}
