/*
������е�ˮ�ɻ�������νˮ�ɻ�����ָһ��3
   λ���������λ�����������͵����䱾����
    ���磺 153 = 1*1*1 + 3*3*3 + 5*5*5
*/
class ForExer {
	public static void main(String[] args) {
		for(int i = 100; i < 1000; i++){//345
			int j1 = i / 100; //��λ
			int j2 = (i - j1 * 100) / 10; //ʮλ
			int j3 = i % 10; //��λ

			if(j1 * j1 * j1 + j2 * j2 * j2 + j3 * j3 * j3 == i){
				System.out.println();
			}
		}
	}
}