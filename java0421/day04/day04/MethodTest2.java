/*
������÷�����������ʹ�� static ���εķ���Ϊ����

ͨ��  ����.����(�����б�) �ķ�ʽ����
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
