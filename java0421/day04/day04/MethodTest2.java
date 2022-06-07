/*
跨类调用方法：（本例使用 static 修饰的方法为例）

通过  类名.方法(参数列表) 的方式调用
*/
class MethodTest2 {
	public static void main(String[] args) {

		//Another.method();

		int res = StaticMethodClass.method(10, 20);

		System.out.println(res);
	}
}

class Another{

	public static void method(){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 8; j++){
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
