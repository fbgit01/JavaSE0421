/*
一、变量的数据类型：

基本数据类型（8种）：
	整型：byte(8位)  short(16位)  int(32位)-默认的类型  long(64位)
	浮点型：float(32位)  double(64位)-默认类型
	字符型：char(2个字节-16位)
	布尔型：boolean   

引用数据类型：
	|-- 类（class） ------  String
	|--接口（interface）
	|--数组（[]）

二、数据类型之间的转换
自动类型转换（自动升级）：小容量转大容量。系统自动完成
	①byte short char ---> int  --->  long ---> float  ---> double
	②byte short char 三者之间不进行计算，若计算都将自动升级为 int 再做运算
	③boolean 不参与运算

	④String 与任何基本数据类型使用 + 连接符，都将自动串接成 String
强制类型转换：大容量转小容量。需要使用强转符"(需要转换的类型)"
			     可能损失精度。

*/
class VariableTest2 {
	public static void main(String[] args) {
		//自动类型转换（自动升级）
		/*byte b = 123;
		short s = b; //自动升级
		System.out.println(s);

		int i1 = 100;

		int res = i1 + b; //自动类型转换
		System.out.println(res);

		//注意：
		long l1 = 123L;
		float f1 = 15.6E2F;

		float f2 = l1 + f1;
		System.out.println(f2);

		char c1 = 'a';
		short s2 = 10;

		int i2 = c1 + s2;
		System.out.println(i2);

		char c2 = 'A';
		char c3 = 'B';
		int i3 = c2 + c3;
		System.out.println(i3);*/

		//强制类型转换
		/*int i1 = 266;
		byte b1 = (byte)i1;

		System.out.println(b1);*/

		int a = 10;
		boolean b = false;
		double d = 15.6;
		float f = .22f;

		String str = "哈哈哈";

		String newStr = str + a + b + d * f;
		System.out.println(newStr);

		String str2 = a + d + str + b + f;
		System.out.println(str2);

		String str3 = "";
	}
}
