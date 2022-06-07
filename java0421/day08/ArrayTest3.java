/*
可变参数：
	如：
		public void add(String...param):  
		
			①... 表示调用方法时可以传递0个或多个 String 类型的参数
			②可变参数低层是数组，数组中数据如何获取，可变参数就如何获取
			③可变参数与相同类型数组参数之间不能构成重载
			④***可变参数只能使用在参数列表的末尾
*/
class ArrayTest3 {
	public static void main(String[] args) {
		ArrayTest3 at = new ArrayTest3();

		/*int[] arr = new int[]{1,2,3,4,5};
		int sum = at.add(arr);
		System.out.println(sum);*/

		/*int sum = at.add(1,2,3,4,5);
		System.out.println(sum);*/

		at.add("abc", 1,2,3,4,5,6);
	}

	//需求：计算两个整数的和
	/*public int add(int a, int b){
		return a + b;
	}

	//需求：计算三个整数的和
	public int add(int a, int b, int c){
		return a + b + c;
	}

	//需求：计算 N 个整数的和
	public int add(int[] arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}

		return sum;
	}*/

	public int add(int...args){//当调用方法时，可以传递0个或多个 int 类型的参数
		int sum = 0;
		for(int i = 0; i < args.length; i++){
			sum += args[i];
		}
		return sum;
	}

	public void add(String strs, int ... args){//
		System.out.println(strs);

		for(int a : args){
			System.out.println(a);
		}
	}

	public void add(Person...persons){//调用方式时可以传递0个或多个 Person 对象
	
	}
}
