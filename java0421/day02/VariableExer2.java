/*
1. ʹ����Ԫ���������ȡ�������еĽϴ���
2. ʹ����Ԫ���������ȡ�������еĽϴ��� 
*/
class VariableExer2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		/*int max = a > b ? a : b;
		System.out.println(max);

		max = max > c ? max : c;
		System.out.println(max);*/

		int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

		System.out.println(max);
	}
}
