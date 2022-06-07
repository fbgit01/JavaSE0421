/*
二维数组：
*/
class ArrayTest4 {
	public static void main(String[] args) {
		//1. 声明一个二维数组
		int[][] arr;

		//2. 为二维数组进行初始化
		//静态初始化:初始化操作和赋值操作同时进行
		arr = new int[][]{  {1,2,3}, {4,5,6}, {7,8}  };

		//动态初始化:初始化操作和赋值操作分开进行
		//方式一：
		arr = new int[5][6];//{ {0,0,5,0,0,0}, {0,0,0,11,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0}, {0,0,0,0,0,0} }
		
		arr[0][2] = 5;
		arr[1][3] = 11;

		//方式二:
		/*arr = new int[5][];//{null, {0,11,0}, null, null, null}

		arr[1] = new int[3];
		arr[1][1] = 11;*/

		//3. 使用循环遍历二维数组
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
