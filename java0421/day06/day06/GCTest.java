/*
һ���ڴ����
���䣺�� JVM �Զ�Ϊ������ڴ�ռ�
�ͷţ��� JVM ͨ���������ջ����Զ��ͷ��ڴ�ռ�

1���������ջ��ƣ�Garbage Collection GC�������ڴ��е�����������ڴ����ͷ�

2���������󣺲��ٱ��κ�����ָ��Ķ���

	System.gc() : ����֪ͨ �������ջ��� �����ͷ��ڴ��ˣ������������ջ��Ʋ�
			       ��������ִ�С����Լӿ��������ջ��Ƶ�����

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