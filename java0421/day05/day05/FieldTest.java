/*
����С����

�ֲ�����  &  ��Ա����

1�����ԣ�Ҳ�г�Ա������Ҳ��ʵ������

2���ֲ��������Ա����������
���ڴ��е�λ�ò�ͬ
��������ͬ
�۳�Ա����ӵ��Ĭ��ֵ�����ֲ�����û��Ĭ��ֵ����˾ֲ�����ʹ��ǰ���븳ֵ��

3�����Ե�Ĭ��ֵ
������������
byte short int  --- > 0
long ---> 0L
float ---> 0.0F
double ---> 0.0D
char ---> '\u0000'
boolean ---> false

������������  ---->  null
	|--��(class)
	|--�ӿ�(interface)
	|--����([])

4��Ϊ���Ը�ֵ�ķ�ʽ
��Ĭ��ֵ��ȱʡֵ��
��ֱ����ʾ��ֵ
*/
class FieldTest {
	public static void main(String[] args) {
		/*Car c1 = new Car();
		c1.name = "����";
		c1.color = "��ɫ";
		c1.tyre = 4;

		Car c2 = new Car();
		c2.name = "����";
		c2.color = "��ɫ";
		c2.tyre = 4;
			
		c1.color = "��ɫ";
		
		System.out.println("���ƣ�" + c1.name + " ��ɫ��" + c1.color + " ��̥����" + c1.tyre);
	
		System.out.println("���ƣ�" + c2.name + " ��ɫ��" + c2.color + " ��̥����" + c2.tyre);
		*/

		Car c3 = new Car();

		c3.color = "��ɫ";

		System.out.println("���ƣ�" + c3.name + " ��ɫ��" + c3.color + " ��̥����" + c3.tyre);
		
		Car c4 = new Car();

		c4.name = "���";

	}
}

class Car{

	String name = "����";
	String color;
	int tyre; //������̥����

	public void start(){
		int a = 10;
		System.out.println("����");
	}

}