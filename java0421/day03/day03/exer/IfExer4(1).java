/*
��Ҷ�֪�����д󵱻飬Ů�󵱼ޡ���ôŮ���ҳ�Ҫ��Ů����
��ȻҪ���һ�����������ߣ�180cm���ϣ������Ƹ�1ǧ�����ϣ�˧���ǡ�
�������������ͬʱ���㣬�򣺡���һ��Ҫ�޸���!!!��
�������������Ϊ���������򣺡��ްɣ����ϲ��㣬�������ࡣ��
������������������㣬�򣺡����ޣ���
*/
import java.util.Scanner;
class IfExer4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("���������(cm):");
		int height = scan.nextInt();

		System.out.print("������Ƹ�(��):");
		double money = scan.nextDouble();

		System.out.print("��������ֵ:");
		//boolean face = scan.nextBoolean();//false
		String face = scan.next();

		if(height > 180 && money >= 1000 && face.equals("˧")){
			System.out.println("��һ��Ҫ�޸���!!!");
		}else if(height >180 || money >= 1000 || face.equals("˧")){
			System.out.println("�ްɣ����ϲ��㣬�������ࡣ");
		}else{
			System.out.println("���ޣ�");
		}
	}
}
