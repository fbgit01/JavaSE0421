/*
1.������Ԫ�ص����ֵ����Сֵ��ƽ�������ܺ͵�

2.����ĸ��ơ���ת

3.*����Ԫ�ص�����
java.util.Arrays ���ڲ�������Ĺ�����
*/
import java.util.Arrays;
class ArrayTest1 {
	public static void main(String[] args) {
		int[] array = {55, 8, 13, 0, -99};

		//���ֵ
		int max = array[0];
		for(int i = 0; i < array.length; i++){
			if(array[i] > max){
				max = array[i];
			}
		}

		System.out.println("���ֵ��" + max);

		//��Сֵ
		int min = array[0];
		for(int i = 0; i < array.length; i++){
			if(array[i] < min){
				min = array[i];
			}
		}

		System.out.println("��Сֵ��" + min);

		//�ܺ�
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}
		System.out.println("�ܺͣ�" + sum);

		//ƽ��ֵ
		System.out.println("ƽ��ֵ��" + (double)sum / array.length);

		//����ĸ���
		int[] array2 = new int[array.length];

		for(int i = 0; i < array2.length; i++){
			array2[i] = array[i];
		}

		//�ı� array2 ��Ԫ�ص�����
		for(int i = 0; i < array2.length; i++){
			if(i % 2 == 0){
				array2[i] = i;
			}
		}

		//����ķ�ת
		for(int a : array){
			System.out.print(a + "\t");
		}

		for(int i = 0; i < array.length / 2; i++){
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}

		//���������:java.util.Arrays ���ڲ�������Ĺ�����
		Arrays.sort(array);

		//����ı���
		System.out.println();
		for(int a : array){
			System.out.print(a + "\t");
		}

		/*System.out.println();
		for(int a : array2){
			System.out.print(a + "\t");
		}*/
	}
}
