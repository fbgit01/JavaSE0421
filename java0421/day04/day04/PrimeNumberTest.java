/*
1��100֮�����������: ���� 1 ���䱾�����⣬���ܱ�����������������
*/
class PrimeNumberTest {
	public static void main(String[] args) {
		//boolean flag = true;//���
		
		long start = System.currentTimeMillis();
		
		for(int i = 2; i <= 100000; i++){
			boolean flag = true;
			for(int j = 2; j < i; j++){
				
				//�ж��ǲ�������
				if(i % j == 0){
					//����һ����������
					flag = false;
					break;
				}

			}

			//ȷ����ӡ���ǲ���ӡ
			if(flag){
				System.out.println(i);
			}

			//���ñ�ǣ�ʹ���ٴ���Ч
			//flag = true;
		}

		long end = System.currentTimeMillis();

		System.out.println("�ķ�ʱ��Ϊ��" + (end - start)); //27132    2657
	}
}
