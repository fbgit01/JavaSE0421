/*
һ���������������ͣ�

�����������ͣ�8�֣���
	���ͣ�byte(8λ)  short(16λ)  int(32λ)-Ĭ�ϵ�����  long(64λ)
	�����ͣ�float(32λ)  double(64λ)-Ĭ������
	�ַ��ͣ�char(2���ֽ�-16λ)
	�����ͣ�boolean   

�����������ͣ�
	|-- �ࣨclass�� ------  String
	|--�ӿڣ�interface��
	|--���飨[]��

������������֮���ת��
�Զ�����ת�����Զ���������С����ת��������ϵͳ�Զ����
	��byte short char ---> int  --->  long ---> float  ---> double
	��byte short char ����֮�䲻���м��㣬�����㶼���Զ�����Ϊ int ��������
	��boolean ����������

	��String ���κλ�����������ʹ�� + ���ӷ��������Զ����ӳ� String
ǿ������ת����������תС��������Ҫʹ��ǿת��"(��Ҫת��������)"
			     ������ʧ���ȡ�

*/
class VariableTest2 {
	public static void main(String[] args) {
		//�Զ�����ת�����Զ�������
		/*byte b = 123;
		short s = b; //�Զ�����
		System.out.println(s);

		int i1 = 100;

		int res = i1 + b; //�Զ�����ת��
		System.out.println(res);

		//ע�⣺
		long l1 = 123L;
		float f1 = 15.6E2F;

		float f2 = l1 + f1;
		System.out.println(f2);

		char c1 = 'a';
		short s2 = 10;

		int i2 = c1 + s2;
		System.out.println(i2);

		char c2 = 'A';
		char c3 = 'B';
		int i3 = c2 + c3;
		System.out.println(i3);*/

		//ǿ������ת��
		/*int i1 = 266;
		byte b1 = (byte)i1;

		System.out.println(b1);*/

		int a = 10;
		boolean b = false;
		double d = 15.6;
		float f = .22f;

		String str = "������";

		String newStr = str + a + b + d * f;
		System.out.println(newStr);

		String str2 = a + d + str + b + f;
		System.out.println(str2);

		String str3 = "";
	}
}
