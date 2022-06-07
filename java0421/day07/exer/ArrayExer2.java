/*
声明一个intArray方法，其参数为整型数组。在main方法中创建20个元素的数组，
并将其传递给intArray方法。
intArray方法中将数组中存放2开始的20个偶数。然后使用增强型for循环
访问所有元素并打印出来。
*/
class ArrayExer2 {
	public static void main(String[] args) {
		ArrayExer2 ae = new ArrayExer2();

		int[] arr = new int[20];

		ae.intArray(arr);

		for(int a : arr){
			System.out.println(a);
		}

		ae.intArray(arr);
	}

	public void intArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			arr[i] = 2 * i + 2;
		}

	}
}
