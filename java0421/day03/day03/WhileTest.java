/*
ѭ���ṹ��

�ٳ�ʼ��ֵ
��ѭ������
�۵�������
��ѭ����

	��
	while(��){
		��

		��
	}

-------------------------------------------------------

	��
	do{

		��

		��
	
	}while(��);


while ��  do-while ������
while �� ���ж�ѭ����������ִ��ѭ����
do-while : ��ִ��ѭ���壬���ж�ѭ��������������ִ��һ�Σ�
*/
class WhileTest {
	public static void main(String[] args) {
		//���󣺴�ӡ 100 ���ڵ�ż��, ����100����ż���ĺ�, ����100����ż���ĸ���
		/*int sum = 0; //������
		int count = 0;
		int i = 0;
		while(i <= 100){
			if(i % 2 == 0){
				System.out.println(i);

				sum += i;
				count++;
			}

			i++;
		}

		System.out.println("ż���ĺ�Ϊ��" + sum);
		System.out.println("ż���ĸ���Ϊ��" + count);*/
		
		/*int sum = 0;
		int count = 0;
		int i = 0;
		do{

			if(i % 2 == 0){
				System.out.println(i);

				sum += i;
				count++;
			}

			i++;
		
		}while(i <= 100);

		System.out.println("ż���ĺ�Ϊ��" + sum);
		System.out.println("ż���ĸ���Ϊ��" + count);*/


		int i = 10;

		/*while(i < 10){
			System.out.println(i++);
		}*/

		do{
			System.out.println(i++);
		}while(i < 10);
	}
}
