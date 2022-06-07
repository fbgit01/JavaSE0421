/*
练习1：
编写一个Student类，包含name、gender、age、id、score属性，
分别为String、String、int、int、double类型。
类中声明一个say方法，返回String类型，方法返回信息中包含所有属性值。
在另一个TestStudent类中的main方法中，创建Student对象，
并访问say方法和所有属性，并将调用结果打印输出。
*/
class StudentExer {
	public static void main(String[] args) {
		//变量的格式：数据类型 变量名 = 值;
		//int a = 10;
		Student stu = new Student();
		stu.name = "王黎明";
		stu.gender = "不详";
		stu.age = 21;
		stu.id = 9527;
		stu.score = 99.99;

		String str = stu.say();
		System.out.println(str);
	}
}

class Student{

	String name;
	String gender;
	int age;
	int id;
	double score;

	public String say(){
		return name + "," + gender + "," + age + ", " + id + "," + score;
	}

}