/*
this �ؼ��֣�����ǰ���󣬿����ڵ������ԡ�������������
this.����
this.����
this(����) ��ʹ�� this ���ñ��๹����

this ���ñ��๹������ע�⣺
	��this ���ñ��๹��������ʹ���ڵ�ǰ�������п�ִ�д��������
	�ڱ���ݹ鹹�������ã�������һ���������в�ʹ�� this ���ñ��๹������
*/
class ConstructorTest2 {
	public static void main(String[] args) {
		Person p = new Person("����", 18, '��', 250.66);

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