/*
��ֵ�������=   +=   -=   *=   /=   %=

�Ƚ����������ϵ���������==  !=  >  <   >=   <=

�߼��������&&-��·��    ||-��·��   !-�߼���    &-�߼���   |-�߼���  ^-�߼����

�������⡿&& ��  & ������   ||   ��  |  ������
&& : ��Ϊ��·�룬����߱��ʽ���Ϊ false ʱ���ұ߱��ʽ�����ټ���
&����λ��������������߼�����ʱ��������߱��ʽ���Ϊ true ����false ���ұ߱��ʽ������
*/
class VariableTest4 {
	public static void main(String[] args) {
		/*int a = 10;

		a += 5; //�൱��  a = a + 5;
		System.out.println(a);//15

		a %= 3; //�൱�� a = a % 3;
		System.out.println(a);*/

		//�������⡿
		/*short s = 5;
		//s = s + 1; //����?NO   ����?
		s += 1; //s = (short)(s+1);���룿YES
		System.out.println(s);*/

		//�Ƚ����������ϵ�����������������Ϊ boolean ֵ
		/*int a = 20;
		int b = 20;

		boolean boo = a == b;
		System.out.println(boo);

		System.out.println(a != b);*/

		//�߼������: ��������Ϊ boolean ֵ
		//�����ж�һ�����ǲ��Ǵ���10 С�� 20
		int a = 9;

		//�����д��
		//boolean boo = 10 < a < 20;

		/*boolean boo = a > 10 && a < 20;
		System.out.println(boo);*/

		/*boolean b1 = true && true;
		boolean b2 = true && false;
		boolean b3 = false && true;
		boolean b4 = false && false;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);*/

		/*boolean b1 = true || true;
		boolean b2 = true || false;
		boolean b3 = false || true;
		boolean b4 = false || false;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);*/

		/*boolean b = !true;
		System.out.println(b);*/
		
		/*boolean b = a > 10 & a++ < 20;
		System.out.println(b);
		System.out.println(a);*/

		boolean b1 = true ^ true;
		boolean b2 = true ^ false;
		boolean b3 = false ^ true;
		boolean b4 = false ^ false;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}
}

/*
���������
+  -  + -  *  /  %  ++ --  +(���ӷ�)

��ֵ�����
=  +=  -=  *=  /=  %=

�Ƚ����������ϵ�������
==  !=  >  <  >=  <=

�߼������
&&   ||    !    &  |   ^

λ�����


��Ԫ�����

*/