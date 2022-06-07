/*
描述小汽车

局部变量  &  成员变量

1、属性：也叫成员变量，也叫实例变量

2、局部变量与成员变量的区别？
①内存中的位置不同
②作用域不同
③成员变量拥有默认值，而局部变量没有默认值（因此局部变量使用前必须赋值）

3、属性的默认值
基本数据类型
byte short int  --- > 0
long ---> 0L
float ---> 0.0F
double ---> 0.0D
char ---> '\u0000'
boolean ---> false

引用数据类型  ---->  null
	|--类(class)
	|--接口(interface)
	|--数组([])

4、为属性赋值的方式
①默认值（缺省值）
②直接显示赋值
*/
class FieldTest {
	public static void main(String[] args) {
		/*Car c1 = new Car();
		c1.name = "奔驰";
		c1.color = "白色";
		c1.tyre = 4;

		Car c2 = new Car();
		c2.name = "宝马";
		c2.color = "黑色";
		c2.tyre = 4;
			
		c1.color = "红色";
		
		System.out.println("名称：" + c1.name + " 颜色：" + c1.color + " 轮胎数：" + c1.tyre);
	
		System.out.println("名称：" + c2.name + " 颜色：" + c2.color + " 轮胎数：" + c2.tyre);
		*/

		Car c3 = new Car();

		c3.color = "红色";

		System.out.println("名称：" + c3.name + " 颜色：" + c3.color + " 轮胎数：" + c3.tyre);
		
		Car c4 = new Car();

		c4.name = "别克";

	}
}

class Car{

	String name = "福特";
	String color;
	int tyre; //描述轮胎个数

	public void start(){
		int a = 10;
		System.out.println("启动");
	}

}