/*
��Ԫ���������Ŀ�������:
	��ʽ��
		�������ʽ ? ���ʽ1 : ���ʽ2;

	ע�⣺
	�ٱ��ʽ1 �� ���ʽ2 ������������ͱ��뱣��һ�£�
	���������ʽ���Ϊ true ʱ��ִ�б��ʽ1������ִ�б��ʽ2
*/
class VariableTest5 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		/*int res = a > b ? a - b : a + b;
		System.out.println(res);*/

		//System.out.println(a > b ? a-b : "������");

		//��ȡ�������Ľϴ�ֵ
		int max = a > b ? a : b;
		System.out.println(max);
	}
}
