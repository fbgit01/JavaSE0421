/*
一、内存管理
分配：由 JVM 自动为其分配内存空间
释放：由 JVM 通过垃圾回收机制自动释放内存空间

1、垃圾回收机制（Garbage Collection GC）：将内存中的垃圾对象从内存中释放

2、垃圾对象：不再被任何引用指向的对象

	System.gc() : 用于通知 垃圾回收机制 可以释放内存了，但是垃圾回收机制并
			       不会立即执行。可以加快垃圾回收机制的运行

*/
class GCTest {

	public static void main(String[] args){
		Person p = new Person();

		Person p1 = p;

		p = null;

		p1 = null;
	}


}

class Person{

	String name;
	int age;

}