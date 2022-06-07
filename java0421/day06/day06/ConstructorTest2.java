/*
this 关键字：代表当前对象，可用于调用属性、方法、构造器
this.属性
this.方法
this(……) ：使用 this 调用本类构造器

this 调用本类构造器的注意：
	①this 调用本类构造器必须使用在当前构造器中可执行代码的首行
	②避免递归构造器调用（至少有一个构造器中不使用 this 调用本类构造器）
*/
class ConstructorTest2 {
	public static void main(String[] args) {
		Person p = new Person("张三", 18, '男', 250.66);

		System.out.println(p.say());

	}
}

class Person{

	private String name;
	private int age;
	private char gender;
	private double weight;

	public Person(){}

	public Person(String name){
		this.name = name;
	}

	public Person(String name, int age){
		this(name);
		this.age = age;
	}

	public Person(String name, int age, char gender){
		this(name, age);
		this.gender = gender;
	}

	public Person(String name, int age, char gender, double weight){
		this(name, age, gender);
		this.weight = weight;
	}

	public String say(){
		return this.name + "," + this.age + "," + this.gender  + "," + this.weight;
	}
}