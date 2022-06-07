package com.atguigu.review;

public class AccountExer {

    public static void main(String[] args) {
        /*Account account = new Account(1122, 20000, 0.045);

        account.withdraw(30000);
        System.out.println("您的账户余额为：" + account.getBalance());

        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("您的账户余额为：" + account.getBalance());
        System.out.println("月利率为：" + account.getMonthlyInterest());*/

        CheckAccount ca = new CheckAccount(1122, 20000, 0.045, 5000);

        ca.withdraw(5000);
        System.out.println("您的账户余额为：" + ca.getBalance());
        System.out.println("您的可透支额为：" + ca.getOverdraft());
        System.out.println();

        ca.withdraw(18000);
        System.out.println("您的账户余额为：" + ca.getBalance());
        System.out.println("您的可透支额为：" + ca.getOverdraft());
        System.out.println();

        ca.withdraw(3000);
        System.out.println("您的账户余额为：" + ca.getBalance());
        System.out.println("您的可透支额为：" + ca.getOverdraft());
        System.out.println();
    }
}
