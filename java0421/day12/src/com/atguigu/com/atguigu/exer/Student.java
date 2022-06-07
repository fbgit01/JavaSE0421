package com.atguigu.com.atguigu.exer;

public class Student implements Sortable{

    private double score;

    public Student() {
    }

    public Student(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String toString(){
        return "学生成绩为：" + score;
    }

    //用于比较两个学生成绩的高低
    public int compare(Sortable s) {
        if(s instanceof Student){
            Student stu = (Student)s;

            if(this.score > stu.score){
                return 1;
            }else if(this.score < stu.score){
                return -1;
            }else{
                return 0;
            }
        }

        return -2; //搞点注释
    }
}
