/*
�������������ͣ�

�����������ͣ�8�֣���
	���ͣ�byte(8λ)  short(16λ)  int(32λ)-Ĭ�ϵ�����  long(64λ)
	�����ͣ�float(32λ)  double(64λ)-Ĭ������
	�ַ��ͣ�char(2���ֽ�-16λ)
	�����ͣ�boolean   

�����������ͣ�
	|-- �ࣨclass�� ------  String
	|--�ӿڣ�interface��
	|--���飨[]��
*/
class VariableTest1 {
	public static void main(String[] args) {
		//1. �����ĸ�ʽ���������� ������ = ֵ;

		//���ͣ�byte(8λ)  short(16λ)  int(32λ)-Ĭ�ϵ�����  long(64λ)
		byte b1 = 123;
		short s1 = 12345;
		int i1 = 1235467;

		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);

		//ע��:���� long �ͱ���ʱ��ֵ������ L �� l
		long l1 = 12423124356L;
		System.out.println(l1);

		//�����ͣ� float(32λ)  double(64λ)---Ĭ������
		//ע�⣺���� float �ͱ���ʱ��ֵ������ F �� f
		//ע�⣺���� double �ͱ���ʱ��ֵ����Լ� D �� d
		float f1 = 15.6f;
		double d1 = 15.63d;
		System.out.println(f1);
		System.out.println(d1);

		//�ַ��ͣ�char(2���ֽ�-16λ) --- �� Unicode ����洢�ģ������� ASCII�����ġ����ġ������ַ��ȣ�
		//char �ͱ������ڴ洢�����ַ�, char ������ֵ����ʹ�õ�����
		char c1 = 'a';
		char c2 = '��';
		char c3 = '$';
		char c4 = '1';
		char c5 = ' ';

		System.out.println((int)c1);
		System.out.println((int)c2);
		System.out.println((int)c3);
		System.out.println((int)c4);
		System.out.println((int)c5);

		//ת���ַ�
		char c6 = '\n';
		char c7 = '\t';

		char c8 = '\u0006';

		System.out.println(c6);
		System.out.println(c7 + "===");
		System.out.println(c8);

		//boolean ����ֵ��ֻ�洢����ֵ��true �� false
		//true ������
		//false �����
		boolean boo1 = true;
		boolean boo2 = false;
		System.out.println(boo1);
		System.out.println(boo2);

		//String : �ַ���
		//ע�⣺���� String �ͱ���ʱ��ֵ����ʹ��˫����
		String str = "�Ҵ��й�����䣡";
		System.out.println(str);

		System.out.println("HelloWorld!");
	}
}
