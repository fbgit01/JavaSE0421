/*
1. �Ӽ��̶���ѧ���ɼ����ҳ���߷֣������ѧ���ɼ��ȼ���
�ɼ�>=��߷�-10    �ȼ�Ϊ��A��   
�ɼ�>=��߷�-20    �ȼ�Ϊ��B��
�ɼ�>=��߷�-30    �ȼ�Ϊ��C��   
����                            �ȼ�Ϊ��D��

��ʾ���ȶ���ѧ��������������������int���飬���ѧ���ɼ���
*/
import java.util.Scanner;
class ArrayExer3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("������ѧ��������");
		int num = scan.nextInt();

		//1. ��������������ָ�����ȵ�����
		int[] scores = new int[num];

		//2. �����������Ӽ��̽��ն�Ӧ�����ĳɼ�
		System.out.println("������" + scores.length + "��ѧ���ɼ���");

		int max = 0;
		for(int i = 0; i < scores.length; i++){
			scores[i] = scan.nextInt();

			//3. �ҳ���߷�
			if(scores[i] > max){
				max = scores[i];
			}
		}

		System.out.println("��߷�Ϊ��" + max);

		//4. ��ӡѧ���ɼ��ĵȼ�

		char level = 0;
		for(int i = 0; i < scores.length; i++){
			if(scores[i] >= max - 10){
				level = 'A';
			}else if(scores[i] >= max - 20){
				level = 'B';
			}else if(scores[i] >= max - 30){
				level = 'C';
			}else{
				level = 'D';
			}

			System.out.println("student " + i + " score is " + scores[i] + " grade is " + level);
		}
	}
}
