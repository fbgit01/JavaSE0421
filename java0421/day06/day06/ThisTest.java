/*
this �ؼ��֣�����ǰ���󣬿����ڵ��� ���ԡ�������**������
this.����
this.����


˭��ӵ�� this �ؼ��ֵķ��������ˣ�˭���ǵ�ǰ����
*/
class ThisTest {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("����");
		p.setAge(18);

		System.out.println(p.getName()  + "," + p.getAge());

		Person p2 = new Person();
		p2.setName("����");
		p2.setAge(20);

		System.out.println(p2.say());
	}
}

class Person{

	private String name;
	private int age;

	public void setName(String name){
		this.name = name;//���־ֲ������ͳ�Ա����ʹ�� this
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

	public String say(){
		return getName() + "," + getAge();
	}
}