/*
数组：用于批量存储一类数据，是引用数据类型之一

数组的注意：
	①无论静态初始化还是动态初始化，必须指明长度
	②数组中每个元素的位置都有一个索引值（下角标，下标），索引值从0开始，
	   到数组的长度 - 1
	③获取数组长度：length
*/
class ArrayTest1 {
	public static void main(String[] args) {
		//变量的格式：  数据类型  变量名 = 值;
		/*
			int a = 10;
			int b;
			b = 10;
		*/

		//1. 声明一个数组
		int[] scores;
		String[] names;

		//2. 为数据初始化
		//方式一：静态初始化，初始化操作和赋值操作同时进行
		scores = new int[]{1,2,3,4,5};

		//方式二：动态初始化，初始化操作和赋值操作分开进行
		names = new String[5];
		
		names[0] = "张三";
		names[1] = "王五";
		names[2] = "李四";
		names[3] = "赵六";
		names[4] = "田七";

		//3. 获取数组中的元素
		//String str = names[0];
		int n = scores[0];
		System.out.println(n);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);

		System.out.println("-------------------------------");
		
		//4. 利用循环遍历数组中的元素
		System.out.println("数组的长度：" + scores.length);
		for(int i = 0; i < scores.length; i++){
			System.out.println(scores[i]);
		}

		//5. 数组的注意：
		//int[] arr = new int[5]{1,2,3};
		//int[5] arr;

		//数组允许如下声明方式
		int[] arr;
		//int arr[];
	}
}
