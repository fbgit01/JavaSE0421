package com.atguigu.java;

public class AccountTest {
	
	public static void main(String[] args) {
		Customer cust = new Customer("Smith ", "Jane");
		
		Account account = new Account(1000, 2000, 1.23);
		
		//对象的关联（使 cust 与 account 进行关联）
		cust.setAccount(account);
		
		//对 Jane Smith 进行操作
		Account jsAcc = cust.getAccount();
		
		jsAcc.deposit(100);
		jsAcc.withdraw(960);
		jsAcc.withdraw(2000);
		
		//cust.getAccount().deposit(100);
		
		System.out.println("Customer ["+ cust.getFirstName() +", "+ cust.getLastName() +"] has a account: id is "+ jsAcc.getId() +", "
				+ "annualInterestRate is "+ jsAcc.getAnnualInterestRate() +"％, balance is " + jsAcc.getBalance());
	}
	
	
	
	//操作某用户的账户
	public void show(Customer cust){
	}

}
