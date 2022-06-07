/*
1—100之间的所有质数: 除了 1 和其本身以外，不能被其他数整除的数。
*/
class PrimeNumberTest {
	public static void main(String[] args) {
		//boolean flag = true;//标记
		
		long start = System.currentTimeMillis();
		
		for(int i = 2; i <= 100000; i++){
			boolean flag = true;
			for(int j = 2; j < i; j++){
				
				//判断是不是质数
				if(i % j == 0){
					//该数一定不是质数
					flag = false;
					break;
				}

			}

			//确定打印还是不打印
			if(flag){
				System.out.println(i);
			}

			//重置标记，使其再次生效
			//flag = true;
		}

		long end = System.currentTimeMillis();

		System.out.println("耗费时间为：" + (end - start)); //27132    2657
	}
}
