/*
����ı���

��ͨ for ѭ����

��ǿ for ѭ����

	for(������Ԫ�ص��������� ������ : ��Ҫ����������){
	
	}

	ע�⣺��ǿ for ѭ�����ܸı�������Ԫ�ص�ֵ
*/
class ArrayTest3 {
	public static void main(String[] args) {
		int[] array = new int[]{1,2,3,4,5,2,2,2};

		/*for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}*/

		/*for(int b : array){
			System.out.println(b);
		}*/

		//�ı�������Ԫ�ص�ֵ
		/*for(int i = 0; i < array.length; i++){
			if(array[i] == 2){
				array[i] = 22;
			}
		}*/
		
		/*for(int a : array){
			if(a == 2){
				a = 22;
			}
		}*/


		/*for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}*/

		System.out.println("--------------------------------------------");

		Person[] persons = new Person[]{new Person("����", 18), new Person("����", 20)};
	
		for(Person p : persons){
			if(p.age == 18){
				p.age = 88;
			}
		}
		
		//
		for(Person p : persons){
			System.out.println(p.say());
		}
	}
}

class Person{

	String name;
	int age;

	public Person(){}

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String say(){
		return name + "," + age;
	}

}