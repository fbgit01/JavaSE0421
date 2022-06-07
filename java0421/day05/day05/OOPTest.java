/*
一、面向对象编程（Object Oriented Programming）

1. 面向对象与面向过程？
面向过程：强调的是功能行为
面向对象：将功能行为封装进对象，调用具备了功能行为的对象

【例子】把大象装冰箱一共分几步？
①打开冰箱  ②把大象装进去（存储大象）  ③关闭冰箱

如何运用面向对象思想思考上述问题？

人 开 门

人{

	拉（门）{
		门.打开（）
	}

}

门{
	打开（）
}

-------------------------------------------------

人{

	拉（冰箱）{
		冰箱.打开（）
	}

	指挥（动物）{
		动物.进入（）
	}


	推（冰箱）{
		冰箱.关闭（）
	}

}

冰箱{
	
	打开（）{}

	存储（）{}
	
	关闭（）{}

}

大象{

	进入（）{}

}

猴子{
	进入（）{}
}

大老虎{

	进入（）{}

}

2. 面向对象更加注重前期的设计
①就是对类的设计
②设计类就是设计类的成员：属性和方法

3. 面向对象：将现实生活中一类事物的共性内容，进行提取，抽象成相应的 Java 类
			 使用 Java 中的类对其进行描述
   现实生活中的事物：张三 李四  王五
   共性内容：姓名  性别  年龄  吃饭的功能   睡觉的功能

类本身是抽象，因为描述的是现实生活中的一类事物
若需要具体到某一个事物，需要通过关键  new 创建对象

4. 类和对象
类：抽象的，描述的是现实生活中的一类事物
对象：是一个实实在在的个体
*/
class OOPTest {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "张三";
		p.gender = '男';
		p.age = 18;

		p.eat();
		p.sleep();

		System.out.println("姓名：" + p.name + " 性别：" + p.gender + " 年龄：" + p.age);

		Person p2 = new Person();
		p2.name = "王黎明";
		p2.gender = '男';
		p2.age = 38;

		p2.eat();
		p2.sleep();

		char g = p2.gender;
		System.out.println("姓名：" + p2.name + " 性别：" + g + " 年龄：" + p2.age);
	}
}

//抽象的
class Person{

	//变量-属性
	String name;
	char gender;
	int age;

	//方法-功能行为
	public void eat(){
		System.out.println(name + "用嘴吃");
	}

	public void sleep(){
		System.out.println("睡觉");
	}
}