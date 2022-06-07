package com.atguigu.exer;

/*
1.编写Order类，有int型的orderId，String型的orderName，相应的getter()和setter()方法，
两个参数的构造器，重写父类的equals()方法：public boolean equals(Object obj)，
并判断测试类中创建的两个对象是否相等。

 */
public class OrderExer {

    public static void main(String[] args) {
        Order o1 = new Order(101, "订单1");
        Order o2 = new Order(101, "订单1");

        boolean bo = o1.equals(o2);
        System.out.println(bo);
    }

}

class Order{

    private int orderId;
    private String orderName;

    public Order() {
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj instanceof Order){
            Order o = (Order)obj;

            if(this.orderId == o.orderId && this.orderName.equals(o.orderName)){
                return true;
            }
        }

        return false;
    }
}