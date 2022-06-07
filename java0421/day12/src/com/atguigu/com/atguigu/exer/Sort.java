package com.atguigu.com.atguigu.exer;

public class Sort {

    public static void selectSort(Sortable[] a){//{new Rectangle(), new Student(), new Rectangle()}

        for(int i = 0; i < a.length - 1; i++){//外层循环控制比较多少轮
            for(int j = i+1; j < a.length; j++){
                if(a[i].compare(a[j]) == -1){//虚拟方法调用a[i] 是什么对象，调用谁的 compare() ,判断 a[i] > a[j]
                    Sortable sortable = a[i];
                    a[i] = a[j];
                    a[j] = sortable;
                }
            }
        }

    }

}
