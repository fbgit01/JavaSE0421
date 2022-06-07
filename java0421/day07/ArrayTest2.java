/*
数组的默认值

基本数据类型：
	byte short int  ----> 0
	long ---> 0L
	float ---> 0.0F
	double ---> 0.0D
	char ---> '\u0000'
	boolean ---> false

引用数据类型： ---> null
	|-- 类(class)
	|-- 接口(interface)
	|-- 数组([])
*/
class ArrayTest2 {
	public static void main(String[] args) {
		byte[] bs = new byte[5];

		for(int i = 0; i < bs.length; i++){
			System.out.println(bs[i]);
		}

		System.out.println("-------------------------------");

		float[] fs = new float[5];

		for(int i = 0; i < fs.length; i++){
			System.out.println(fs[i]);
		}

		System.out.println("--------------------------------");

		char[] chs = new char[5];

		for(int i = 0; i < chs.length; i++){
			System.out.println(chs[i]);
		}
		
		System.out.println("--------------------------------");

		boolean[] bbs = new boolean[5];

		bbs[2] = true;

		for(int i = 0; i < bbs.length; i++){
			System.out.println(bbs[i]);
		}

		System.out.println("--------------------------------");

		String[] strs = new String[5];

		for(int i = 0; i < strs.length; i++){
			System.out.println(strs[i]);
		}
		
		System.out.println("--------------------------------");
		
		Person[] persons = new Person[3];//{new Person(), null, new Person("张三", 18)}
		
		
		persons[0] = new Person();
		//persons[1] = new Person();
		persons[2] = new Person("张三", 18);

		/*Person p = persons[2];
		System.out.println(p.say());*/

		for(int i = 0; i < persons.length; i++){
			/*Person p = persons[i];
			System.out.println(p.say());*/

			System.out.println(persons[i].say());//null.say();
		}

		//数组常见的异常
		//java.lang.ArrayIndexOutOfBoundsException : 数组下标越界异常
		//Person p2 = persons[6];

		//java.lang.NullPointerException : 空指针异常

	}
}

class Person{

	private String name;
	private int age;

	public Person(){}

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String say(){
		return name + "," + age;
	}

}