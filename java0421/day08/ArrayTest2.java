/*
命令行参数：
*/
class ArrayTest2 {
	public static void main(String[] args) {//String[] args = new String[0];
		for(int i = 0; i < args.length; i++){
			System.out.println("--" + args[i]);
		}

		//将字符串转换成 int
		/*int num = Integer.parseInt(args[0]);
		System.out.println(num);*/
	}
}
