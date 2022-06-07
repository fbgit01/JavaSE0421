package com.atguigu.exer;

public class Test {

    public static void main(String[] args) {
        Circle c1 = new Circle("白色", 2.2, 5.5);
        Circle c2 = new Circle("黑色", 3.3, 5.5);

        MyRectangle mr = new MyRectangle("绿色", 2.2, 3.3, 4.4);
        MyRectangle mr2 = new MyRectangle("红色", 2.2, 3.3, 4.4);

        boolean bo = equalsArea(mr, mr2);
        System.out.println(bo);

        displayGeometricObject(c1);
    }

    public static boolean equalsArea(GeometricObject g1, GeometricObject g2){
        return g1.findArea() == g2.findArea();
    }

    public static void displayGeometricObject(GeometricObject g1){

        if(g1 instanceof  Circle){
            Circle c = (Circle) g1;
            System.out.println("圆的半径为：" + c.getRadius());
            System.out.println("圆的面积为：" + g1.findArea());
        }

        if(g1 instanceof MyRectangle){
            MyRectangle mr = (MyRectangle) g1;
            System.out.println("矩形的宽为：" + mr.getWidth() + " 高为：" + mr.getHeight());
            System.out.println("矩形的面积为：" + g1.findArea());
        }

    }

}
