package com.atguigu.java;

/*
冒泡排序
 */
public class BubbleTest {
    public static void main(String[] args) {
        int[] array = {100, 11, 0, -99, 3};

        for(int i = 0; i < array.length - 1; i++){//外层循环控制比较多少轮
            for(int j = 0; j < array.length - 1 - i; j++){ //内层循环控制每轮比较多少次
                if(array[j] < array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        //遍历
        for (int i : array) {
            System.out.println(i);
        }
    }
}
