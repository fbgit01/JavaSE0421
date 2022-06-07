/*
循环结构：重复的执行某语句

①初始化值
②循环条件
③迭代条件
④循环体

	for(① ; ② ; ③){
		④
	}

①②④③②④③……④③②
*/
class ForTest {
	public static void main(String[] args) {
		/*System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");*/

		/*for(int i = 0; i < 5; i++){
			System.out.println("HelloWorld!");
		}*/

		/*int i = 0;
		for(i =0, System.out.print('a'); i < 5; i++, System.out.print('b')){
			System.out.print('c');
		}*///acbcbcbcbcb

		//需求：打印 100 以内的偶数, 计算100以内偶数的和, 计算100以内偶数的个数
		int sum = 0; //计数器
		int count = 0;
		for(int i = 0; i <= 100; i++){
			if(i % 2 == 0){
				System.out.println(i);

				sum += i;
				count++;
			}
		}

		System.out.println("偶数的和为：" + sum);
		System.out.println("偶数的个数为：" + count);
	}
}
