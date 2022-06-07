/*
重载方法（Overload）：
在同一个类中
①方法名相同
②参数列表不同（参数的类型、参数的个数）
注意：与返回值类型无关
*/
class OverloadTest {
	public static void main(String[] args) {

		add(10, 20);

		//double sum = add(15.6, 22.22);
		//System.out.println(sum);

		add('a', "哈哈哈哈");
	}

	//需求：计算两个整数的和
	public static int add(int a, int b){
		System.out.println("计算两个整数的和");
		return a + b;
	}

	//需求：计算两个小数的和
	public static double add(double d1, double d2){
		System.out.println("计算两个小数的和");
		return d1 + d2;
	}

	//需求：计算三个整数的和
	public static int add(int a, int b, int c){
		return a + b + c;
	}

	public static void add(char ch, String str){
		System.out.println(ch);
		System.out.println(str);
	}

	public static void add(String str, char ch){
		
	}
}
