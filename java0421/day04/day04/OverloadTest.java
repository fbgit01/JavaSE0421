/*
���ط�����Overload����
��ͬһ������
�ٷ�������ͬ
�ڲ����б�ͬ�����������͡������ĸ�����
ע�⣺�뷵��ֵ�����޹�
*/
class OverloadTest {
	public static void main(String[] args) {

		add(10, 20);

		//double sum = add(15.6, 22.22);
		//System.out.println(sum);

		add('a', "��������");
	}

	//���󣺼������������ĺ�
	public static int add(int a, int b){
		System.out.println("�������������ĺ�");
		return a + b;
	}

	//���󣺼�������С���ĺ�
	public static double add(double d1, double d2){
		System.out.println("��������С���ĺ�");
		return d1 + d2;
	}

	//���󣺼������������ĺ�
	public static int add(int a, int b, int c){
		return a + b + c;
	}

	public static void add(char ch, String str){
		System.out.println(ch);
		System.out.println(str);
	}

	public static void add(String str, char ch){
		
	}
}
