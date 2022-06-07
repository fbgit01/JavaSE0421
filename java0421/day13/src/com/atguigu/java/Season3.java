package com.atguigu.java;

//枚举类实现接口
public enum Season3 implements MyInterface{

    SPRING{
        public void show(){
            System.out.println("春天");
        }
    },
    SUMMER{
        public void show(){
            System.out.println("夏天");
        }
    },
    AUTUMN{
        public void show(){
            System.out.println("秋天");
        }
    },
    WINTER{
        public void show(){
            System.out.println("冬天");
        }
    };

    /*public void show(){
        System.out.println("季节");
    }*/

}
