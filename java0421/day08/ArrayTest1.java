/*
1.求数组元素的最大值、最小值、平均数、总和等

2.数组的复制、反转

3.*数组元素的排序
java.util.Arrays 用于操作数组的工具类
*/
import java.util.Arrays;
class ArrayTest1 {
	public static void main(String[] args) {
		int[] array = {55, 8, 13, 0, -99};

		//最大值
		int max = array[0];
		for(int i = 0; i < array.length; i++){
			if(array[i] > max){
				max = array[i];
			}
		}

		System.out.println("最大值：" + max);

		//最小值
		int min = array[0];
		for(int i = 0; i < array.length; i++){
			if(array[i] < min){
				min = array[i];
			}
		}

		System.out.println("最小值：" + min);

		//总和
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}
		System.out.println("总和：" + sum);

		//平均值
		System.out.println("平均值：" + (double)sum / array.length);

		//数组的复制
		int[] array2 = new int[array.length];

		for(int i = 0; i < array2.length; i++){
			array2[i] = array[i];
		}

		//改变 array2 中元素的数据
		for(int i = 0; i < array2.length; i++){
			if(i % 2 == 0){
				array2[i] = i;
			}
		}

		//数组的反转
		for(int a : array){
			System.out.print(a + "\t");
		}

		for(int i = 0; i < array.length / 2; i++){
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}

		//数组的排序:java.util.Arrays 用于操作数组的工具类
		Arrays.sort(array);

		//数组的遍历
		System.out.println();
		for(int a : array){
			System.out.print(a + "\t");
		}

		/*System.out.println();
		for(int a : array2){
			System.out.print(a + "\t");
		}*/
	}
}
