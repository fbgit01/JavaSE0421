/*
һ����������Ҳ�й��췽��������ĳ�Ա֮һ

����
����
������

1. �������ĸ�ʽ

	���ʿ������η� ����(�����б�){
		//�������
	}

2. ��������ע�⣺
�ٹ����������Ʊ�������������һ�£�
����һ������û����ʾ�������κι�����ʱ��ϵͳ���ṩһ��Ĭ�ϵ��޲εĹ�����
	public Person(){}
����һ��������ʾ���ṩ���κι�����ʱ��ϵͳĬ�ϵ��޲ι������������ṩ
�ܹ�����û�з���ֵ��Ҳ����Ҫ return
�ݹ�����֮����Թ�������

3. �����������ã�
�ٴ�������
��Ϊ������г�ʼ��

4. ������������
��ͬһ������
�ٹ�������������ͬ
�ڲ����б�ͬ�����������͡������ĸ�����

5. Ϊ���Ը���ʼֵ�ķ�ʽ
��Ĭ��ֵ��ȱʡֵ��
��ֱ����ʾ��ֵ
�۹�����

˳�򣺢٢ڢ�
*/
class ConstructorTest {
	public static void main(String[] args) {
		/*Person p = new Person();
		//p.cry();
		System.out.println(p.getName());
		System.out.println(p.getAge());

		Person p2 = new Person();
		//p2.cry();
		System.out.println(p2.getName());
		System.out.println(p2.getAge());

		Person p3 = new Person();
		//p3.cry();
		System.out.println(p3.getName());
		System.out.println(p3.getAge());*/

		Person p = new Person("����");
		System.out.println(p.getName());

		/*Person p1 = new Person("����", 20);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());*/
	}
}

class Person{

	private String name = "����";
	private int age;

	//����һ��������
	public Person(){
		System.out.println("Person �Ĺ�����");
		cry();

		this.name = "����";
		this.age = 18;
	}

	public Person(String name){
		this.name = name;
	}

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public void cry(){
		System.out.println("�ޡ���");
	}

}