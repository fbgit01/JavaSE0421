/*
�ɱ������
	�磺
		public void add(String...param):  
		
			��... ��ʾ���÷���ʱ���Դ���0������ String ���͵Ĳ���
			�ڿɱ�����Ͳ������飬������������λ�ȡ���ɱ��������λ�ȡ
			�ۿɱ��������ͬ�����������֮�䲻�ܹ�������
			��***�ɱ����ֻ��ʹ���ڲ����б��ĩβ
*/
class ArrayTest3 {
	public static void main(String[] args) {
		ArrayTest3 at = new ArrayTest3();

		/*int[] arr = new int[]{1,2,3,4,5};
		int sum = at.add(arr);
		System.out.println(sum);*/

		/*int sum = at.add(1,2,3,4,5);
		System.out.println(sum);*/

		at.add("abc", 1,2,3,4,5,6);
	}

	//���󣺼������������ĺ�
	/*public int add(int a, int b){
		return a + b;
	}

	//���󣺼������������ĺ�
	public int add(int a, int b, int c){
		return a + b + c;
	}

	//���󣺼��� N �������ĺ�
	public int add(int[] arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}

		return sum;
	}*/

	public int add(int...args){//�����÷���ʱ�����Դ���0������ int ���͵Ĳ���
		int sum = 0;
		for(int i = 0; i < args.length; i++){
			sum += args[i];
		}
		return sum;
	}

	public void add(String strs, int ... args){//
		System.out.println(strs);

		for(int a : args){
			System.out.println(a);
		}
	}

	public void add(Person...persons){//���÷�ʽʱ���Դ���0������ Person ����
	
	}
}
