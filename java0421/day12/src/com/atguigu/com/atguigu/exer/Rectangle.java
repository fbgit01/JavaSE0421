package com.atguigu.com.atguigu.exer;

public class Rectangle implements Sortable{

    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    //计算矩形面积的方法
    public int area(){
        return length * width;
    }

    @Override
    public String toString() {
        return "矩形的面积为：" + area();
    }

    @Override
    public int compare(Sortable s) {
        if(s instanceof Rectangle){

            Rectangle r = (Rectangle) s;

            if(this.area() > r.area()){
                return 1;
            }else if(this.area() < r.area()){
                return -1;
            }else{
                return 0;
            }
        }

        return -23;
    }
}
