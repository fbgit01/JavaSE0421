class MarryExer {
	public static void main(String[] args) {
		Boy boy = new Boy();
		boy.setName("BJ����");
		boy.setAge(18);

		Girl girl = new Girl();
		girl.setName("������");

		//boy.marry(girl);

		girl.marry(boy);
	}
}

class Boy{

	private String name;
	private int age;

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

	public void marry(Girl girl){
		System.out.println(this.name + " ˵����ҪȢ " + girl.getName());
	}

	public void shout(Girl girl){
		System.out.println(this.name + " ������̫���ˣ���ҲҪȢ " + girl.getName());
	}
}

class Girl{

	private String name;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void marry(Boy boy){
		System.out.println(this.name + " ˵������޸� " + boy.getName());
		
		//Girl girl = new Girl();
		boy.shout(this);
	}

}