/*
数组的遍历

普通 for 循环：

增强 for 循环：

	for(数组中元素的数据类型 变量名 : 需要遍历的数组){
	
	}

	注意：增强 for 循环不能改变数组中元素的值
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

		//改变数组中元素的值
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

		Person[] persons = new Person[]{new Person("张三", 18), new Person("李四", 20)};
	
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