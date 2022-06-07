package com.atguigu.exer;

import org.junit.Test;

import java.util.*;

/*
1.请从键盘随机输入10个整数保存到List中，并按倒序、从大到小的顺序显示出来

2.请把学生名与考试分数录入到Map中，并按分数显示前三名成绩学员的名字。

 */
public class MapExer {

    private static final Object PRESENT = new Object();

    @Test
    public void test2(){
        Comparator com = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Student && o2 instanceof Student){
                    Student stu1 = (Student) o1;
                    Student stu2 = (Student) o2;

                    if(stu1.getScore() == stu2.getScore()){
                        return stu1.getName().compareTo(stu2.getName());
                    }else{
                        return -(int)(stu1.getScore() - stu2.getScore());//存在点隐患，大家扩展
                    }
                }

                return 0;
            }
        };

        Map map = new TreeMap(com);

        map.put(new Student("张三", 99), PRESENT);
        map.put(new Student("李四", 77), PRESENT);
        map.put(new Student("王五", 66), PRESENT);
        map.put(new Student("赵六", 88), PRESENT);
        map.put(new Student("田七", 100), PRESENT);

        //获取成绩为前三名学员的姓名
        Set keySet = map.keySet();

        Object[] objs = keySet.toArray();

        for (int i = 0; i < 3; i++) {
            System.out.println(objs[i]);
            System.out.println(((Student)objs[i]).getName());
        }
    }

    @Test
    public void test1(){
        List list = new ArrayList();

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入10个整数：");

        for (int i = 0; i < 10; i++) {
            int num = scan.nextInt();
            list.add(num);
        }

        //排序
        Collections.sort(list);

        //反转
        Collections.reverse(list);

        //遍历
        Iterator it = list.iterator();

        while(it.hasNext()){
            Object obj = it.next();
            System.out.println("--" + obj);
        }
    }

}
