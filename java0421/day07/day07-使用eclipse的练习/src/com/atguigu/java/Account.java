package com.atguigu.java;

//模拟账户
public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;

	public Account() {
	}

	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	//取款方法
	public void withdraw(double amount){
		if(balance < amount){
			System.out.println("余额不足，取款失败");
		}else{//balance >= amount
			balance -= amount;
			System.out.println("成功取出：" + amount);
		}
	}
	
	//存款方法
	public void deposit(double amount){
		balance += amount;
		System.out.println("成功存入：" + amount);
	}

}
