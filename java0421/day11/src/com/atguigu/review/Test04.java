package com.atguigu.review;
/*
方法名和参数列表必须相同

编译：看左边，  运行：看右边
 */
public class Test04 {
    public static void main(String[] args) {
        A a1 = new A();//本态
        A a2 = new B();//多态
        B b = new B();
        C c = new C();
        D d = new D();
        System.out.println("(1)" + a1.show(b));//A and A
        System.out.println("(2)" + a2.show(d));//B and A
        System.out.println("(3)" + b.show(c));//A and D
        System.out.println("(4)" + b.show(d));//B and B
    }
}

class A {
    public String show(C obj) {
        return ("A and D");
    }

    public String show(A obj) {
        return "A and A";
    }
}

class B extends A {

	/*
	public String show(C obj) {
		return ("A and D");
	}
	 */

    public String show(B obj) {
        return "B and B";
    }

    public String show(A obj) {
        return "B and A";
    }
}

class C extends B {

	/*
	public String show(C obj) {
        return ("A and D");
    }
	 */

	/*public String show(B obj) {
		return "B and B";
	}

	public String show(A obj) {
		return "B and A";
	}*/

}

class D extends B {

}