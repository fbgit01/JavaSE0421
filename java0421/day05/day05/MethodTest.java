/*
������ֵ���ݣ�
�����������ͣ�����������������Ϊ���������ݸ��������������н�����ԭֵ���ᷢ���ı�
�����������ͣ�������������������Ϊ���������ݸ��������������н�����
ԭ��������ֵ�ᷢ���ı�


Number1 num = new Number1();
mt.add(num);

����ֵ���ݻ������ô��ݣ�

*/
class MethodTest {
	public static void main(String[] args) {

		//�����ĸ�ʽ���������� ������ = ֵ;     int a = 10;
		Number1 num = new Number1();

		num.a = 10;
		num.b = 20;

		MethodTest mt = new MethodTest();

		System.out.println("main�������� add ����ǰ��num.a=" + num.a + ", num.b=" + num.b);

		mt.add(num);

		System.out.println("main�������� add ������num.a=" + num.a + ", num.b="+ num.b);
		//num.a=?  num.b=?
		
	}

	public void add(Number1 n){//Number1 n = num;
		System.out.println("add ��������ǰ��n.a=" + n.a + " , n.b=" + n.b);//n.a=10 n.b=20

		n.a += 1;
		n.b += 2;

		System.out.println("add �������к�n.a=" + n.a  + ", n.b=" + n.b);//n.a=11 n.b=22
	}
}

class Number1{

	int a;
	int b;

}