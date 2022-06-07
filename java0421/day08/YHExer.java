/*
使用二维数组打印一个 10 行杨辉三角.
1
1 1
1 2 1
1 3 3  1
1 4 6  4  1
1 5 10 10 5 1
 ....
  
【提示】
 1. 第一行有 1 个元素, 第 n 行有 n 个元素
 2. 每一行的第一个元素和最后一个元素都是 1
 3. 从第三行开始, 对于非第一个元素和最后一个元素的元素. 
     yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];

*/
class YHExer{
	public static void main(String[] args) {
		//1. 声明二维数组
		int[][] yh = new int[10][];//{{0}, {0, 0}, {0,0,0}, {0,0,0,0}, {0,0,0,0,0}}
		
		//2. 为二维数组动态初始化
		for(int i = 0; i < yh.length; i++){
			yh[i] = new int[i+1];
		}

		//3. 为二维数组中的一维数组赋值
		for(int i = 0; i < yh.length; i++){
			yh[i][0] = 1; //每行的第一个元素
			yh[i][i] = 1;//每行的最后一个元素

			for(int j = 0; j < yh[i].length; j++){
				if(i > 1 && j > 0 && j < i){
					yh[i][j] = yh[i-1][j] + yh[i-1][j-1];
				}
			}
		}

		//数组的遍历
		for(int[] as : yh){
			for(int a : as){
				System.out.print(a + "\t");
			}

			System.out.println();
		}
	}
}
