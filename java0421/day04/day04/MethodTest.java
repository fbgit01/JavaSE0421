/*
һ��������Ҳ�к�������һ�����ܵĶ��壬��һ������������Ĺ��ܵ�Ԫ

1. �����ĸ�ʽ��

	���η� ����ֵ���� ������(�����б�){
		//��Ҫ���幦�ܵ����

		return ����ֵ;
	}

	���η���public static
	����ֵ���ͣ�˵���÷������к��н�����Ǹ��������������
	�����б������Ǿֲ�������������0��������ÿ������֮���� "," ����
	**return �����ڽ�����ǰ����
	����ֵ���������н����󣬾�������ֵ

2. ������ע�⣺
��ͨ��������+�����б����÷�����������������б�(�����ĸ�������������)���뱣��һ�£�
�ڡ�����ֵ���͡��롰����ֵ�����������������Ҫ����һ�£�
���������ˡ�����ֵ���͡���˵���÷������к��н��������Ҫ�õ��ý������������һ��
�������շ������еĽ��
�����������к�û�н�����ظ������ߣ��򡰷���ֵ���͡���������Ϊ void
	void���޷���ֵ
�ݷ�����ֻ�ܵ�������������������������

3. ��������ǰ��������ȷ��
���Ƿ���Ҫ���ؽ����������
	ȷ�������Ƿ���Ҫ����ֵ������ֵ������ʲô
���Ƿ���δ֪�����ݲ�������
	ȷ�������Ƿ���Ҫ�����б�����Ҫ����
*/
class MethodTest {

	public static void main(String[] args) {
		//���󣺼���һ���� * 2 + 1 �Ľ��
		/*int num = 5;
		int res = num * 2 + 1;

		num = 7;
		res = num * 2 + 1;*/

		/*int r = result(8); //ʵ�ʲ���
		System.out.println("���÷����󣬷������еĽ��Ϊ��" + r);

		System.out.println(result(9));*/

		//���÷���
		/*print99();

		print99();*/

		boolean b = compare(10, 20);

		System.out.println(b);
	}

	//��������
	public static int result(int n){//��ʽ���������ڽ��յ����ߴ��ݵ�ʵ�ʲ���ֵ
		System.out.println("����һ������");
		int res = n * 2 + 1;

		return res;
	}

	//���󣺴�ӡ99�˷���
	public static void print99(){
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}

			System.out.println();
		}
	}

	//�����ж��������Ƿ����
	public static boolean compare(int a, int b){
		System.out.println("������");
		return a == b;
	}
}