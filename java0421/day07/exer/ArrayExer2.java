/*
����һ��intArray�����������Ϊ�������顣��main�����д���20��Ԫ�ص����飬
�����䴫�ݸ�intArray������
intArray�����н������д��2��ʼ��20��ż����Ȼ��ʹ����ǿ��forѭ��
��������Ԫ�ز���ӡ������
*/
class ArrayExer2 {
	public static void main(String[] args) {
		ArrayExer2 ae = new ArrayExer2();

		int[] arr = new int[20];

		ae.intArray(arr);

		for(int a : arr){
			System.out.println(a);
		}

		ae.intArray(arr);
	}

	public void intArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			arr[i] = 2 * i + 2;
		}

	}
}
