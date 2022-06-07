/*
参数的值传递：
基本数据类型：将基本数据类型作为参数，传递给方法，方法运行结束后，原值不会发生改变
引用数据类型：当将引用数据类型作为参数，传递给方法，方法运行结束后，
原对象属性值会发生改变


Number1 num = new Number1();
mt.add(num);

问是值传递还是引用传递？

*/
class MethodTest {
	public static void main(String[] args) {

		//变量的格式：数据类型 变量名 = 值;     int a = 10;
		Number1 num = new Number1();

		num.a = 10;
		num.b = 20;

		MethodTest mt = new MethodTest();

		System.out.println("main方法调用 add 方法前：num.a=" + num.a + ", num.b=" + num.b);

		mt.add(num);

		System.out.println("main方法调用 add 方法后：num.a=" + num.a + ", num.b="+ num.b);
		//num.a=?  num.b=?
		
	}

	public void add(Number1 n){//Number1 n = num;
		System.out.println("add 方法运行前：n.a=" + n.a + " , n.b=" + n.b);//n.a=10 n.b=20

		n.a += 1;
		n.b += 2;

		System.out.println("add 方法运行后：n.a=" + n.a  + ", n.b=" + n.b);//n.a=11 n.b=22
	}
}

class Number1{

	int a;
	int b;

}