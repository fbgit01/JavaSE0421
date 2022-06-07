/*
一、方法：也叫函数，是一个功能的定义，是一个类中最基本的功能单元

1. 方法的格式：

	修饰符 返回值类型 方法名(参数列表){
		//需要定义功能的语句

		return 返回值;
	}

	修饰符：public static
	返回值类型：说明该方法运行后有结果，那个结果的数据类型
	参数列表：就是局部变量，可以有0个或多个，每个变量之间以 "," 隔开
	**return ：用于结束当前方法
	返回值：方法运行结束后，具体结果的值

2. 方法的注意：
①通过方法名+参数列表调用方法，方法名与参数列表(参数的个数、参数类型)必须保持一致！
②“返回值类型”与“返回值”结果的数据类型需要保持一致！
③若声明了“返回值类型”，说明该方法运行后有结果，若需要用到该结果，可以声明一个
变量接收方法运行的结果
④若方法运行后没有结果返回给调用者，则“返回值类型”处，声明为 void
	void：无返回值
⑤方法中只能调用其他方法，不能声明方法

3. 声明方法前的两点明确：
①是否需要返回结果给调用者
	确定的是是否需要返回值，返回值类型是什么
②是否有未知的数据参与运算
	确定的是是否需要参数列表，需要几个
*/
class MethodTest {

	public static void main(String[] args) {
		//需求：计算一个数 * 2 + 1 的结果
		/*int num = 5;
		int res = num * 2 + 1;

		num = 7;
		res = num * 2 + 1;*/

		/*int r = result(8); //实际参数
		System.out.println("调用方法后，方法运行的结果为：" + r);

		System.out.println(result(9));*/

		//调用方法
		/*print99();

		print99();*/

		boolean b = compare(10, 20);

		System.out.println(b);
	}

	//声明方法
	public static int result(int n){//形式参数：用于接收调用者传递的实际参数值
		System.out.println("这是一个方法");
		int res = n * 2 + 1;

		return res;
	}

	//需求：打印99乘法表
	public static void print99(){
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}

			System.out.println();
		}
	}

	//需求：判断两个数是否相等
	public static boolean compare(int a, int b){
		System.out.println("哈哈哈");
		return a == b;
	}
}
