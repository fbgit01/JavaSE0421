/*
һ���������ã�
�ٿ���������������
�ڿ����ڿ��Ʒ���Ȩ��
�ۿ����ڻ�����Ŀ�ṹ��Σ�������������໮�ֵ�ͬһ������

package:����ȷ����ǰ���λ��
	��д�ڵ�ǰ .java Դ�ļ��п�ִ�д��������
	�ڰ��������淶��������ĸ��Сд��ͨ��ʹ�ù�˾�����ĵ���
		www.atguigu.com   --->  com.atguigu.��Ŀ��.ģ����
	�۰����е�ÿ�� "." ����һ��Ŀ¼


import:����ȷ����Ҫ�������λ��
	��ʹ���� package �� class ֮��
	��import �������ж�����������г�����
	��import com.atguigu.aaa.* �� * ������ aaa �������е����ӿ�(��������)
	������һ������ʹ����������ͬ��������ͬ������������	
		ѡ��һ��ʹ�õ����ķ�ʽ��import java.sql.Date;
		ѡ������һ��ʹ��ȫ�޶���������ƣ�ȫ�������ķ�ʽ��
				java.util.Date d2 = new java.util.Date(134546);

	��import static ����ĳ���������еľ�̬��Ա������ʡ�� ����.
*/
package com.atguigu.java;

import com.atguigu.abc.Person;
/*import com.atguigu.aaa.Employee;
import com.atguigu.aaa.Customer;*/
import com.atguigu.aaa.*;
import com.atguigu.aaa.bbb.Manager;
import java.sql.Date;
//import com.atguigu.ccc.StaticClass;
import static com.atguigu.ccc.StaticClass.*;

class PackageTest {
	public static void main(String[] args) {
		Person p = new Person();

		Employee emp = new Employee();

		Customer cust = new Customer();

		Manager mgr = new Manager();

		//java.sql.Date;    java.util.Date;
		Date d1 = new Date(123125);
		java.util.Date d2 = new java.util.Date(134546);

		show();

		System.out.println(num);
	}
}
