/*
��ά���飺
*/
class ArrayTest4 {
	public static void main(String[] args) {
		//1. ����һ����ά����
		int[][] arr;

		//2. Ϊ��ά������г�ʼ��
		//��̬��ʼ��:��ʼ�������͸�ֵ����ͬʱ����
		arr = new int[][]{  {1,2,3}, {4,5,6}, {7,8}  };

		//��̬��ʼ��:��ʼ�������͸�ֵ�����ֿ�����
		//��ʽһ��
		arr = new int[5][6];//{ {0,0,5,0,0,0}, {0,0,0,11,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0} }
		
		arr[0][2] = 5;
		arr[1][3] = 11;

		//��ʽ��:
		/*arr = new int[5][];//{null, {0,11,0}, null, null, null}

		arr[1] = new int[3];
		arr[1][1] = 11;*/

		//3. ʹ��ѭ��������ά����
		/*for(int i = 0; i < arr.length; i++){
			int[] as = arr[i];

			for(int j = 0; j < as.length; j++){
				System.out.print(as[j] + "\t");
			}

			System.out.println();
		}*/

		/*for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + "\t");
			}

			System.out.println();
		}*/

		for(int[] as : arr){
			for(int a: as){
				System.out.print(a + "\t");
			}

			System.out.println();
		}


		//int[][][] arr;

		/*int a, b;
		int a;
		int b;

		int[] arr;
		int arr[];

		int[] a, b[];
		int[] a;

		int[] b[];*/
	}
}
