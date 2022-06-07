/*
变量的数据类型：

基本数据类型（8种）：
	整型：byte(8位)  short(16位)  int(32位)-默认的类型  long(64位)
	浮点型：float(32位)  double(64位)-默认类型
	字符型：char(2个字节-16位)
	布尔型：boolean   

引用数据类型：
	|-- 类（class） ------  String
	|--接口（interface）
	|--数组（[]）
*/
class VariableTest1 {
	public static void main(String[] args) {
		//1. 变量的格式：数据类型 变量名 = 值;

		//整型：byte(8位)  short(16位)  int(32位)-默认的类型  long(64位)
		byte b1 = 123;
		short s1 = 12345;
		int i1 = 1235467;

		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);

		//注意:声明 long 型变量时，值后必须加 L 或 l
		long l1 = 12423124356L;
		System.out.println(l1);

		//浮点型： float(32位)  double(64位)---默认类型
		//注意：声明 float 型变量时，值后必须加 F 或 f
		//注意：声明 double 型变量时，值后可以加 D 或 d
		float f1 = 15.6f;
		double d1 = 15.63d;
		System.out.println(f1);
		System.out.println(d1);

		//字符型：char(2个字节-16位) --- 以 Unicode 编码存储的（包含了 ASCII、中文、日文、特殊字符等）
		//char 型变量用于存储单个字符, char 变量的值必须使用单引号
		char c1 = 'a';
		char c2 = '中';
		char c3 = '$';
		char c4 = '1';
		char c5 = ' ';

		System.out.println((int)c1);
		System.out.println((int)c2);
		System.out.println((int)c3);
		System.out.println((int)c4);
		System.out.println((int)c5);

		//转义字符
		char c6 = '\n';
		char c7 = '\t';

		char c8 = '\u0006';

		System.out.println(c6);
		System.out.println(c7 + "===");
		System.out.println(c8);

		//boolean 布尔值，只存储两个值，true 和 false
		//true 代表真
		//false 代表假
		boolean boo1 = true;
		boolean boo2 = false;
		System.out.println(boo1);
		System.out.println(boo2);

		//String : 字符串
		//注意：声明 String 型变量时，值必须使用双引号
		String str = "我大尚硅谷威武！";
		System.out.println(str);

		System.out.println("HelloWorld!");
	}
}
