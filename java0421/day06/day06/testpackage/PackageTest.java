/*
一、包的作用：
①可用于区分重命名
②可用于控制访问权限
③可用于划分项目结构层次，将功能相近的类划分到同一个包中

package:用于确定当前类的位置
	①写在当前 .java 源文件中可执行代码的首行
	②包的命名规范：所有字母都小写，通常使用公司域名的倒置
		www.atguigu.com   --->  com.atguigu.项目名.模块名
	③包名中的每个 "." 代表一层目录


import:用于确定需要引入类的位置
	①使用在 package 和 class 之间
	②import 语句可以有多个条，并排列出即可
	③import com.atguigu.aaa.* ： * 代表导入 aaa 包中所有的类或接口(不包括包)
	④如在一个类中使用了两个相同类名，不同包名的两个类	
		选择一个使用导包的方式：import java.sql.Date;
		选择另外一个使用全限定类名（简称：全类名）的方式：
				java.util.Date d2 = new java.util.Date(134546);

	⑤import static 导入某个类中所有的静态成员。可以省略 类名.
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
