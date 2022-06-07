/*
特殊流程控制语句：
break : 用于结束“当前”循环，可用于 switch-case 语句，用于结束当前 switch-case
continue : 用于结束“当次”循环
*/
class BreakContinueTest {
	public static void main(String[] args) {
		/*for(int i = 0; i <= 10; i++){
			if(i == 3){
				System.out.println("---" + i);
				continue;
			}

			System.out.println(i);
		}*/
		
		//break 和 continue 支持结束标签指定的那层循环
		/*abc:for(int i = 0; i <= 10; i++){
			for(int j = 0; j <= 10; j++){
				if(j == 3){
					System.out.println("---" + j);

					continue abc;
				}

				System.out.println(j);

			}
		}*/

		/*label:{

			for(int i = 0; i <= 10; i++){
				for(int j = 0; j <= 10; j++){
					if(j == 3){
						System.out.println("---" + j);

						continue label; //break 可以结束代码块的方式，continue 不支持结束代码块的方式
					}

					System.out.println(j);

				}
			}

			System.out.println("HelloBreak");

		}*/

		//无限循环
		/*for(;;){
			System.out.println("HelloWorld!");
		}*/

		while(true){
			System.out.println("HelloWorld!");
		}

	}
}
