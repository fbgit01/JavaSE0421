/*
输出所有的水仙花数，所谓水仙花数是指一个3
   位数，其各个位上数字立方和等于其本身。
    例如： 153 = 1*1*1 + 3*3*3 + 5*5*5
*/
class ForExer {
	public static void main(String[] args) {
		for(int i = 100; i < 1000; i++){//345
			int j1 = i / 100; //百位
			int j2 = (i - j1 * 100) / 10; //十位
			int j3 = i % 10; //个位

			if(j1 * j1 * j1 + j2 * j2 * j2 + j3 * j3 * j3 == i){
				System.out.println();
			}
		}
	}
}
