class MarryExer {
	public static void main(String[] args) {
		Boy boy = new Boy();
		boy.setName("BJ陈勇");
		boy.setAge(18);

		Girl girl = new Girl();
		girl.setName("范冰冰");

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
		System.out.println(this.name + " 说：想要娶 " + girl.getName());
	}

	public void shout(Girl girl){
		System.out.println(this.name + " 呼喊：太好了，我也要娶 " + girl.getName());
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
		System.out.println(this.name + " 说：我想嫁给 " + boy.getName());
		
		//Girl girl = new Girl();
		boy.shout(this);
	}

}