/*
���̿��ƣ�
˳��ṹ
��֧�ṹ
	�����жϣ�
	ѡ��ṹ��
		
		switch(���ʽ){
			case ֵ1:
				//��Ҫִ�е����
				break;
			case ֵ2:
				//��Ҫִ�е����
				break;
			case ֵ3:
				//��Ҫִ�е����
				break;
			����
			default:
				//��Ҫִ�е����
				break;
		}

		ע�⣺
			�ٱ��ʽ������������ͱ����� byte short char  int  String(jdk1.7��) ö��
			��default �ǿ�ѡ��
			�۱��ʽ���н�������ͣ�������case ��ֵ�����ͱ���һ�£�
			��break Ҳ�ǿ�ѡ�ģ�һ�����ʽ����� case ���ֵƥ��ɹ�����������ִ��
			  ֱ������ break Ϊֹ��
			��case ��ֻ��д����ֵ������д���ʽ
ѭ���ṹ
*/
class SwitchTest1 {
	public static void main(String[] args) {
		/*int a = 5;

		switch(a){
			case 1:
				System.out.println("һ");
				break;
			case 2:
				System.out.println("��");
				break;
			case 3:
				System.out.println("��");
				break;
			default:
				System.out.println("��������");
				break;
		}*/

		/*char ch = '1';

		switch(ch){
			case '1':
				System.out.println("һ");
				break;
			case '2':
				System.out.println("��");
				break;
			case '3':
				System.out.println("��");
				break;
			default:
				System.out.println("��������");
				break;
		}*/

		//������һ�������ڵ���2С��5�����ӡ ��2-5��

		int a = 8;

		switch(a){
			case 1:
				System.out.println("һ");
				break;
			case 2:
			case 3:
			case 4:
				System.out.println("2-5");
				break;
			default:
				System.out.println("��������");
				break;
		}

		System.out.println("���� switch-case");
	}
}
