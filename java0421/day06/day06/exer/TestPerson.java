/*
1.��������,�����ж��������ࣺPerson��TestPerson�ࡣ�������£�
    ��setAge()�����˵ĺϷ�����(0~130)����getAge()�����˵����䡣
    ��TestPerson����ʵ����Person��Ķ���b������setAge()��getAge()���������Java�ķ�װ�ԡ�

2. ��ǰ�涨���Person������ӹ�������
���ù��������������˵�age���Գ�ʼֵ��Ϊ18��

3. �޸���������͹�����������name����,ʹ��ÿ�δ���Person
�����ͬʱ��ʼ�������age����ֵ��name����ֵ
*/
class  TestPerson{
	public static void main(String[] args) {
		/*Person p = new Person();
		//p.age = -100;
		p.setAge(-10);

		System.out.println(p.getAge());*/

		/*Person p = new Person();
		System.out.println(p.getAge());*/

		Person p = new Person("����", 18);
		p.setName("����");
		
		System.out.println(p.getName() + "," + p.getAge());
	}
}

class Person{

	//1. ����˽�л�
	private int age;
	private String name;

	public Person(){
		this.age = 18;
	}

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	//2. �ṩ������ get/set ����
	public void setAge(int a){
		if(a > 0 && a < 130){
			age = a;
		}
	}

	public int getAge(){
		return age;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}