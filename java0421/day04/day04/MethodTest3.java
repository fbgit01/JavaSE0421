/*
参数的值传递：

基本数据类型：当将基本数据类型作为参数，传递给方法，方法运行结束后，原值不会发生改变

引用数据类型：


注意：
当方法被调用运行后，参数列表一定有值。
*/
class MethodTest3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("main方法调用add方法前 a="+a + ", b=" +b);//a=10, b=20

		add(a, b);

		System.out.println("main方法调用add方法后 a="+ a+ ", b=" + b);//a=10,b=20
	}

	//需求：改变两个数的值
	public static void add(int a, int b){
		System.out.println("add 方法运行前 a=" + a + ",  b=" + b);//a=10, b=20

		a += 1;
		b += 2;
		
		System.out.println("add 方法运行后 a=" + a + ",  b=" + b);//a=11, b=22
	}
}
