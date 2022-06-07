package com.atguigu.review;

/*
可透支账户
 */
public class CheckAccount extends Account{

    private double overdraft; //代表可透支额度

    public CheckAccount() {
    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft){
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    //重写父类的 withdraw 方法
    public void withdraw (double amount){
        //判断账户余额
        if(getBalance() >= amount){
            //设置余额为新余额
            setBalance(getBalance() - amount);
        }else{
            //若余额不够，需要使用可透支额度
            double needOverdraft = amount - getBalance(); //需要透支的额度

            if(needOverdraft <= overdraft){
                setBalance(0);
                overdraft -= needOverdraft;
            }else{
                System.out.println("超过可透支限额！");
            }
        }
    }
}
