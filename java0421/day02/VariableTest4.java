/*
赋值运算符：=   +=   -=   *=   /=   %=

比较运算符（关系运算符）：==  !=  >  <   >=   <=

逻辑运算符：&&-短路与    ||-短路或   !-逻辑非    &-逻辑与   |-逻辑或  ^-逻辑异或

【面试题】&& 与  & 的区别？   ||   与  |  的区别？
&& : 称为短路与，当左边表达式结果为 false 时，右边表达式将不再计算
&：是位运算符，当用于逻辑运算时，无论左边表达式结果为 true 还是false ，右边表达式都计算
*/
class VariableTest4 {
	public static void main(String[] args) {
		/*int a = 10;

		a += 5; //相当于  a = a + 5;
		System.out.println(a);//15

		a %= 3; //相当于 a = a % 3;
		System.out.println(a);*/

		//【面试题】
		/*short s = 5;
		//s = s + 1; //编译?NO   运行?
		s += 1; //s = (short)(s+1);编译？YES
		System.out.println(s);*/

		//比较运算符（关系运算符）：运算结果都为 boolean 值
		/*int a = 20;
		int b = 20;

		boolean boo = a == b;
		System.out.println(boo);

		System.out.println(a != b);*/

		//逻辑运算符: 运算结果都为 boolean 值
		//需求：判断一个数是不是大于10 小于 20
		int a = 9;

		//错误的写法
		//boolean boo = 10 < a < 20;

		/*boolean boo = a > 10 && a < 20;
		System.out.println(boo);*/

		/*boolean b1 = true && true;
		boolean b2 = true && false;
		boolean b3 = false && true;
		boolean b4 = false && false;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);*/

		/*boolean b1 = true || true;
		boolean b2 = true || false;
		boolean b3 = false || true;
		boolean b4 = false || false;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);*/

		/*boolean b = !true;
		System.out.println(b);*/
		
		/*boolean b = a > 10 & a++ < 20;
		System.out.println(b);
		System.out.println(a);*/

		boolean b1 = true ^ true;
		boolean b2 = true ^ false;
		boolean b3 = false ^ true;
		boolean b4 = false ^ false;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}
}

/*
算数运算符
+  -  + -  *  /  %  ++ --  +(连接符)

赋值运算符
=  +=  -=  *=  /=  %=

比较运算符（关系运算符）
==  !=  >  <  >=  <=

逻辑运算符
&&   ||    !    &  |   ^

位运算符


三元运算符

*/