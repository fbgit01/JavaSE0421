/*
练习一
创建一个char类型的26个元素的数组，分别 放置'A'-'Z‘。
使用for循环访问所有元素并打印出来。
提示：char类型数据运算 'A'+1 -> 'B'，'0'+1 -> '1‘
练习二
创建一个char类型的36个元素的数组，前26个元素放置'A'-'Z‘ 后10个元素放置'0'-'9‘。
使用for循环访问所有元素并打印出来。
*/
class ArrayExer1 {
	public static void main(String[] args) {

		char[] array = new char[36];

		/*array[0] = (char)('A' + 0);
		array[1] = (char)('A' + 1);
		array[2] = (char)('A' + 2);*/
		
		//为数组赋值
		for(int i = 0; i < array.length; i++){
			if(i < 26){
				array[i] = (char)('A' + i);
			}else{
				array[i] = (char)('0' + i - 26);
			}
		}


		//遍历数组
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
}
