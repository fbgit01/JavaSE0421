/*
һ��������������֮һ����װ��

1. ��װ����⣺�������ص������������ñ�¶�ı�¶����

2. ���ʿ������η���
public�������ģ��������������ԡ��������ࡣ���κεط������Է���
private ��˽�еģ��������������ԡ�������ֻ���ڱ����з��ʡ�

3. ��װ�Ĳ���
������˽�л���private��
���ṩ�����ģ�public��get/set ����
*/
class EncapsulationTest {
	public static void main(String[] args) {
		Animal ani = new Animal();

		//ani.name = "����";
		//ani.legs = -7;

		//ͨ�� set ����Ϊ���Ը�ֵ
		ani.setName("����");
		ani.setLegs(4);

		//ͨ�� get ������ȡ����ֵ
		System.out.println("���ƣ�" + ani.getName() + " �ȵĸ�����" + ani.getLegs());
	}
}

class Animal{

	private String name;
	private int legs; //�����ȵĸ���

	public void setName(String n){
		name = n;
	}

	public String getName(){
		return name;
	}

	//��������ֵ
	public void setLegs(int l){
		if(l > 0 && l % 2 == 0){
			legs = l;
		}
	}

	//��ȡ����ֵ
	public int getLegs(){
		return legs;
	}

}