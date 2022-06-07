package com.atguigu.java1;

import org.junit.Test;

/*
一、包装类（包裹类 Wrapper）：

Java 为八种基本数据类型提供了对应的包装类，意味着可以创建对应的对象，使用起来方便

基本数据类型        包装类
byte                Byte
short               Short
int                 Integer
long                Long
float               Float
double              Double
char                Character
boolean             Boolean

1. 基本数据类型与包装类之间的转换
装箱：将基本数据类型转换成对应的包装类
①使用对应包装类的构造器
②通过对应包装类的静态方法 valueOf()

拆箱：将包装类转换成对应的基本数据类型
①通过对应包装类的 xxxValue() 方法。   xxx:代表基本数据类型

2. 自动装箱与自动拆箱（jdk1.5后）

3. 基本数据类型、包装类 与 String 之间的转换
1) 基本数据类型、包装类 转换成 String
①对应包装类的静态方法 toString()
② String str4 = i2 + "";
③使用 String 类的静态方法 valueOf()

2) String 转换成 基本数据类型、包装类
①使用对应包装类的构造器
②使用对应包装类的静态方法 parseXxx() 。  Xxx：代表基本数据类型，注意：没有 parseChar()
③使用对应包装类的静态方法 valueOf()
 */
public class WrapperTest {

    //String 转换成 基本数据类型、包装类
    @Test
    public void test7(){
        String str = "123";
        Integer num = new Integer(str);
        System.out.println(num);

        String str2 = "15.6f";
        Float f = new Float(str2);
        System.out.println(f);

        String str3 = "trueadsfsda";
        Boolean b = new Boolean(str3); //注意:该字符串除了 true 其他都为 false
        System.out.println(b);

        System.out.println("--------------------------------");

        Integer num2 = Integer.parseInt(str);
        System.out.println(num2);

        Float f2 = Float.parseFloat(str2);
        System.out.println(f2);

        System.out.println("--------------------------------");

        Integer num3 = Integer.valueOf(str);
        System.out.println(num3);

        Float f3 = Float.valueOf(str2);
        System.out.println(f3);

    }

    //基本数据类型、包装类 转换成 String
    @Test
    public void test6(){
        int i = 10;
        String str = Integer.toString(i);
        System.out.println(str);

        float f = 15.6f;
        String str2 = Float.toString(f);
        System.out.println(str2);

        boolean b = true;
        String str3 = Boolean.toString(b);
        System.out.println(str3);

        System.out.println("---------------------------------");

        int i2 = 10;
        String str4 = i2 + "";
        System.out.println(str4);

        System.out.println("---------------------------------");

        String str5 = String.valueOf(i2);
        System.out.println(str5);
    }

    //【面试题】
    @Test
    public void test5(){
        //注意：Integer 低层提供了一个小的缓存，该缓存取值范围在（-128~127之间）
        //若需要装箱值，在该取值范围内，则直接从缓存中取一个实例
        //若超出该取值范围，则重新 new Integer() 的实例
        Integer num1 = 100;
        Integer num2 = 100;

        System.out.println(num1 == num2);//true

        Integer num3 = 130;
        Integer num4 = 130;

        System.out.println(num3 == num4);//false
    }

    //自动装箱与自动拆箱
    @Test
    public void test4(){
        Integer num1 = 123; //自动装箱
        int num2 = num1; //自动拆箱
    }
    
    //拆箱
    @Test
    public void test3(){
        Integer num = new Integer(123);//装箱
        int i = num.intValue();//拆箱
        System.out.println(i);

        Character ch = new Character('A');
        char c = ch.charValue();
        System.out.println(c);

        Double d1 = new Double(15.6);
        double d2 = d1.doubleValue();
    }

    //装箱
    @Test
    public void test2(){
        int i = 10;
        Integer num = Integer.valueOf(i);
        System.out.println(num);

        double d1 = 15.6;
        Double d2 = Double.valueOf(d1);
        System.out.println(d2);
    }

    //装箱
    @Test
    public void test1(){
        int num = 10;
        Integer newNum = new Integer(num);//装箱

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.toBinaryString(345));
        System.out.println(Integer.toHexString(345));

        float f = 15.6f;
        Float f1 = new Float(f);//装箱
        System.out.println(f1);

        boolean b = true;
        Boolean b2 = new Boolean(b);
        System.out.println(b2);
    }

}
