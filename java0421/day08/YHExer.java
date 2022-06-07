/*
ʹ�ö�ά�����ӡһ�� 10 ���������.
1
1 1
1 2 1
1 3 3  1
1 4 6  4  1
1 5 10 10 5 1
 ....
  
����ʾ��
 1. ��һ���� 1 ��Ԫ��, �� n ���� n ��Ԫ��
 2. ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض��� 1
 3. �ӵ����п�ʼ, ���ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�Ԫ��. 
     yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];

*/
class YHExer{
	public static void main(String[] args) {
		//1. ������ά����
		int[][] yh = new int[10][];//{{0}, {0, 0}, {0,0,0}, {0,0,0,0}, {0,0,0,0,0}}
		
		//2. Ϊ��ά���鶯̬��ʼ��
		for(int i = 0; i < yh.length; i++){
			yh[i] = new int[i+1];
		}

		//3. Ϊ��ά�����е�һά���鸳ֵ
		for(int i = 0; i < yh.length; i++){
			yh[i][0] = 1; //ÿ�еĵ�һ��Ԫ��
			yh[i][i] = 1;//ÿ�е����һ��Ԫ��

			for(int j = 0; j < yh[i].length; j++){
				if(i > 1 && j > 0 && j < i){
					yh[i][j] = yh[i-1][j] + yh[i-1][j-1];
				}
			}
		}

		//����ı���
		for(int[] as : yh){
			for(int a : as){
				System.out.print(a + "\t");
			}

			System.out.println();
		}
	}
}
