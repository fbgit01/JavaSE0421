/*
三元运算符（三目运算符）:
	格式：
		条件表达式 ? 表达式1 : 表达式2;

	注意：
	①表达式1 和 表达式2 结果的数据类型必须保持一致！
	②条件表达式结果为 true 时，执行表达式1，否则执行表达式2
*/
class VariableTest5 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		/*int res = a > b ? a - b : a + b;
		System.out.println(res);*/

		//System.out.println(a > b ? a-b : "哈哈哈");

		//获取两个数的较大值
		int max = a > b ? a : b;
		System.out.println(max);
	}
}
