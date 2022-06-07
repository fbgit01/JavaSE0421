/*
this 关键字：代表当前对象，可用于调用 属性、方法、**构造器
this.属性
this.方法


谁让拥有 this 关键字的方法运行了，谁就是当前对象
*/
class ThisTest {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("张三");
		p.setAge(18);

		System.out.println(p.getName()  + "," + p.getAge());

		Person p2 = new Person();
		p2.setName("李四");
		p2.setAge(20);

		System.out.println(p2.say());
	}
}

class Person{

	private String name;
	private int age;

	public void setName(String name){
		this.name = name;//区分局部变量和成员变量使用 this
	}

	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public String say(){
		return getName() + "," + getAge();
	}
}