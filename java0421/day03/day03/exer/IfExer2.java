/*
编写程序：由键盘输入三个整数分别存入变量num1、num2、num3，
对它们进行排序(使用 if-else if-else),并且从小到大输出。
*/
//1. 导包
import java.util.Scanner;
class IfExer2 {
	public static void main(String[] args) {
		//2. 创建 Scanner 的对象
		Scanner scan = new Scanner(System.in);

		//3. 接收键盘三个数
		/*System.out.println("请输入三个整数：");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();*/

		//4. 排序
		//若 if-else 语句块中只有一条语句时，那对 {} 可以省略不写
		/*if(num1 < num2){
			if(num3 < num1){
				System.out.println(num3 + "," + num1 + "," + num2);
			}else if(num3 > num2){
				System.out.println(num1 + "," + num2 + "," + num3);
			}else{
				System.out.println(num1 + "," + num3 + "," + num3);
			}
		}else{
			 if(num3 < num2){
				System.out.println(num3 + "," + num2 + "," + num1);
			 }else if(num3 > num1){
				System.out.println(num2 + "," + num1 + "," + num3);
			 }else{
				System.out.println(num2 + "," + num3 + "," + num1);
			 }
		}*/

		/*if(num1 < num2)

			if(num3 < num1)
				System.out.println(num3 + "," + num1 + "," + num2);
			else if(num3 > num2)
				System.out.println(num1 + "," + num2 + "," + num3);
			else
				System.out.println(num1 + "," + num3 + "," + num3);
			
		else
			 if(num3 < num2)
				System.out.println(num3 + "," + num2 + "," + num1);
			 else if(num3 > num1)
				System.out.println(num2 + "," + num1 + "," + num3);
			 else
				System.out.println(num2 + "," + num3 + "," + num1);*/

		if(false){
			System.out.println("Hello");
		}
		System.out.println("World!");
		
	}
}
