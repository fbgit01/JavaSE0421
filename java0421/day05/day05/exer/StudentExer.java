/*
��ϰ1��
��дһ��Student�࣬����name��gender��age��id��score���ԣ�
�ֱ�ΪString��String��int��int��double���͡�
��������һ��say����������String���ͣ�����������Ϣ�а�����������ֵ��
����һ��TestStudent���е�main�����У�����Student����
������say�������������ԣ��������ý����ӡ�����
*/
class StudentExer {
	public static void main(String[] args) {
		//�����ĸ�ʽ���������� ������ = ֵ;
		//int a = 10;
		Student stu = new Student();
		stu.name = "������";
		stu.gender = "����";
		stu.age = 21;
		stu.id = 9527;
		stu.score = 99.99;

		String str = stu.say();
		System.out.println(str);
	}
}

class Student{

	String name;
	String gender;
	int age;
	int id;
	double score;

	public String say(){
		return name + "," + gender + "," + age + ", " + id + "," + score;
	}

}