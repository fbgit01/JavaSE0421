package com.atguigu.java;

/**
 * CustomerList 用于 Customer 对象的管理模块
 * @author LI
 *
 */
public class CustomerList {
	
	private Customer[] customers; //用于批量保存 Customer 对象  {new Customer(), null, null, null, null}
	private int total = 0; //用于记录数组中有效元素的个数
	
	/**
	 * 利用构造器初始化数组
	 * @param totalCustomer
	 */
	public CustomerList(int totalCustomer){
		customers = new Customer[totalCustomer];
	}

	/**
	 * 添加 Customer 对象到数组中
	 * @param customer
	 * @return
	 */
	public boolean addCustomer(Customer customer){
		if(total >= customers.length){//说明数组已满，无法添加
			return false;
		}
		
		customers[total++] = customer;
		return true;
	}
	
	/**
	 * 将数组中 index 位置的元素替换为 cust
	 * @param index : 索引值
	 * @param cust
	 * @return
	 */
	public boolean replaceCustomer(int index, Customer cust){
		if(index < 0 || index >= total){
			return false;
		}
		
		customers[index] = cust;
		return true;
	}
	
	/**
	 * 删除指定索引位置的 Customer 对象
	 * @param index ：索引值
	 * @return
	 */
	public boolean deleteCustomer(int index){
		if(index < 0 || index >= total){
			return false;
		}
		
		for(int i = index; i < total - 1; i++){//覆盖元素，若删除数组中最后一个元素，则不需要覆盖的方式
			customers[i] = customers[i+1];
		}
		
		customers[--total] = null;//最后一个有效元素赋值为null
		return true;
	}

	/**
	 * 获取所有有效元素的数组
	 * @return
	 */
	public Customer[] getAllCustomers(){
		Customer[] custs = new Customer[total];
		
		for(int i = 0; i < total; i++){
			custs[i] = customers[i];
		}
		
		return custs;
	}
	
	/**
	 * 获取 index 索引位置的 Customer 对象
	 * @param index ：索引值
	 * @return
	 */
	public Customer getCustomer(int index){
		if(index < 0 || index >= total){
			return null;
		}
		
		return customers[index];
	}

	/**
	 * 单元测试
	 * @param args
	 */
	public static void main(String[] args) {
		CustomerList cl = new CustomerList(10);
		
		//添加客户信息
		Customer customer = new Customer("张三", '男', 18, "010-123467", "zhangs@abc.com");
		boolean flag = cl.addCustomer(customer);
		if(flag){
			System.out.println("添加成功");
		}else{
			System.out.println("数组已满，无法添加");
		}
		
		Customer[] customers = cl.getAllCustomers();
		
		for (Customer cust : customers) {
			System.out.println(cust.getName() + "," + cust.getAge());
		}
	}
}
