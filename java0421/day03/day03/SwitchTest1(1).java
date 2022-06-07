/*
流程控制：
顺序结构
分支结构
	条件判断：
	选择结构：
		
		switch(表达式){
			case 值1:
				//需要执行的语句
				break;
			case 值2:
				//需要执行的语句
				break;
			case 值3:
				//需要执行的语句
				break;
			……
			default:
				//需要执行的语句
				break;
		}

		注意：
			①表达式结果的数据类型必须是 byte short char  int  String(jdk1.7后) 枚举
			②default 是可选的
			③表达式运行结果的类型，必须与case 后值的类型保持一致！
			④break 也是可选的，一旦表达式结果与 case 后的值匹配成功，依次向下执行
			  直到遇到 break 为止！
			⑤case 后只能写常量值，不能写表达式
循环结构
*/
class SwitchTest1 {
	public static void main(String[] args) {
		/*int a = 5;

		switch(a){
			case 1:
				System.out.println("一");
				break;
			case 2:
				System.out.println("二");
				break;
			case 3:
				System.out.println("三");
				break;
			default:
				System.out.println("其他数字");
				break;
		}*/

		/*char ch = '1';

		switch(ch){
			case '1':
				System.out.println("一");
				break;
			case '2':
				System.out.println("二");
				break;
			case '3':
				System.out.println("三");
				break;
			default:
				System.out.println("其他数字");
				break;
		}*/

		//需求：若一个数大于等于2小于5，则打印 “2-5”

		int a = 8;

		switch(a){
			case 1:
				System.out.println("一");
				break;
			case 2:
			case 3:
			case 4:
				System.out.println("2-5");
				break;
			default:
				System.out.println("其他数字");
				break;
		}

		System.out.println("测试 switch-case");
	}
}
