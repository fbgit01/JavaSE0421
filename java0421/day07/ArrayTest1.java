/*
���飺���������洢һ�����ݣ���������������֮һ

�����ע�⣺
	�����۾�̬��ʼ�����Ƕ�̬��ʼ��������ָ������
	��������ÿ��Ԫ�ص�λ�ö���һ������ֵ���½Ǳ꣬�±꣩������ֵ��0��ʼ��
	   ������ĳ��� - 1
	�ۻ�ȡ���鳤�ȣ�length
*/
class ArrayTest1 {
	public static void main(String[] args) {
		//�����ĸ�ʽ��  ��������  ������ = ֵ;
		/*
			int a = 10;
			int b;
			b = 10;
		*/

		//1. ����һ������
		int[] scores;
		String[] names;

		//2. Ϊ���ݳ�ʼ��
		//��ʽһ����̬��ʼ������ʼ�������͸�ֵ����ͬʱ����
		scores = new int[]{1,2,3,4,5};

		//��ʽ������̬��ʼ������ʼ�������͸�ֵ�����ֿ�����
		names = new String[5];
		
		names[0] = "����";
		names[1] = "����";
		names[2] = "����";
		names[3] = "����";
		names[4] = "����";

		//3. ��ȡ�����е�Ԫ��
		//String str = names[0];
		int n = scores[0];
		System.out.println(n);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);

		System.out.println("-------------------------------");
		
		//4. ����ѭ�����������е�Ԫ��
		System.out.println("����ĳ��ȣ�" + scores.length);
		for(int i = 0; i < scores.length; i++){
			System.out.println(scores[i]);
		}

		//5. �����ע�⣺
		//int[] arr = new int[5]{1,2,3};
		//int[5] arr;

		//������������������ʽ
		int[] arr;
		//int arr[];
	}
}
