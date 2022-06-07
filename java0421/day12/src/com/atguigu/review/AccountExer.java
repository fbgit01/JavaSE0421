package com.atguigu.review;

/*
编写一个类实现银行账户的概念，包含的属性有“帐号”、“密码”、
“存款余额”、“利率”、“最小余额”，定义封装这些属性的方法。
账号要自动生成。
编写主类，使用银行账户类，输入、输出3个储户的上述信息。
考虑：哪些属性可以设计成static属性。
 */
public class AccountExer {
    public static void main(String[] args) {
        Account acc = new Account("123456",10000);
        System.out.println(acc);
        Account acc2 = new Account("1234568",10000);
        System.out.println(acc2);
    }
}

class Account{

    private static int currentId = 10001;
    private int id;
    private String password;
    private double balance;
    private static double interestRate = 4.5;
    private static double minBalance = 5000;

    public Account() {
    }

    public Account(String password, double balance){
        this.id = getNextNum();
        this.password = password;
        this.balance = balance;
    }

    //用于生成 id
    public static int getNextNum(){
        return currentId++;
    }

    public String toString(){
        return id + "," + balance + "," + password + "," + interestRate +"," + minBalance;
     }
}