/*
ѭ���ṹ���ظ���ִ��ĳ���

�ٳ�ʼ��ֵ
��ѭ������
�۵�������
��ѭ����

	for(�� ; �� ; ��){
		��
	}

�٢ڢܢۢڢܢۡ����ܢۢ�
*/
class ForTest {
	public static void main(String[] args) {
		/*System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");*/

		/*for(int i = 0; i < 5; i++){
			System.out.println("HelloWorld!");
		}*/

		/*int i = 0;
		for(i =0, System.out.print('a'); i < 5; i++, System.out.print('b')){
			System.out.print('c');
		}*///acbcbcbcbcb

		//���󣺴�ӡ 100 ���ڵ�ż��, ����100����ż���ĺ�, ����100����ż���ĸ���
		int sum = 0; //������
		int count = 0;
		for(int i = 0; i <= 100; i++){
			if(i % 2 == 0){
				System.out.println(i);

				sum += i;
				count++;
			}
		}

		System.out.println("ż���ĺ�Ϊ��" + sum);
		System.out.println("ż���ĸ���Ϊ��" + count);
	}
}
