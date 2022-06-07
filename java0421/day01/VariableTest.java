/*
变量：保存数据

“局部变量”  &  成员变量

1. 变量的格式：数据类型 变量名 = 值;

2. 变量的概念：
	①在内存中开辟一块内存空间
	②该空间有类型（数据类型）有名称（变量名）
	③在指定的范围内不断的变化

3. 变量的注意：
	①同一个作用域内变量名不能重复
	②作用域：变量作用在所属的那对 {} 内
	③先声明，后使用
	④局部变量在使用前必须赋值
*/
class VariableTest {
	public static void main(String[] args) {
		//1. 声明一个变量
		int var1;

		//2. 为变量赋值
		var1 = 123;

		//3. 声明一个变量并赋值
		int var2 = 20;

		var2 = 30;

		System.out.println(var1);

		int var3 = 10;

		if(true){
			System.out.println(var3);
		}

		int var4 = 20;
		
		System.out.println(var4);

		int var5 = 20;

		System.out.println(var5);

		var5 = 100;

		System.out.println(var5);

	}

	public static void show(){
		int var2 = 30;
	}
}
