/*
1. 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
成绩>=最高分-10    等级为’A’   
成绩>=最高分-20    等级为’B’
成绩>=最高分-30    等级为’C’   
其余                            等级为’D’

提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
*/
import java.util.Scanner;
class ArrayExer3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("请输入学生人数：");
		int num = scan.nextInt();

		//1. 根据人数，创建指定长度的数组
		int[] scores = new int[num];

		//2. 根据人数，从键盘接收对应人数的成绩
		System.out.println("请输入" + scores.length + "个学生成绩：");

		int max = 0;
		for(int i = 0; i < scores.length; i++){
			scores[i] = scan.nextInt();

			//3. 找出最高分
			if(scores[i] > max){
				max = scores[i];
			}
		}

		System.out.println("最高分为：" + max);

		//4. 打印学生成绩的等级

		char level = 0;
		for(int i = 0; i < scores.length; i++){
			if(scores[i] >= max - 10){
				level = 'A';
			}else if(scores[i] >= max - 20){
				level = 'B';
			}else if(scores[i] >= max - 30){
				level = 'C';
			}else{
				level = 'D';
			}

			System.out.println("student " + i + " score is " + scores[i] + " grade is " + level);
		}
	}
}
