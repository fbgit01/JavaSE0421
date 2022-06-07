/*
一、面向对象的特性之一：封装性

1. 封装的理解：将该隐藏的隐藏起来，该暴露的暴露出来

2. 访问控制修饰符：
public：公共的，可用于修饰属性、方法、类。在任何地方都可以访问
private ：私有的，可用于修饰属性、方法。只能在本类中访问。

3. 封装的步骤
①属性私有化（private）
②提供公共的（public）get/set 方法
*/
class EncapsulationTest {
	public static void main(String[] args) {
		Animal ani = new Animal();

		//ani.name = "大象";
		//ani.legs = -7;

		//通过 set 方法为属性赋值
		ani.setName("大象");
		ani.setLegs(4);

		//通过 get 方法获取属性值
		System.out.println("名称：" + ani.getName() + " 腿的个数：" + ani.getLegs());
	}
}

class Animal{

	private String name;
	private int legs; //描述腿的个数

	public void setName(String n){
		name = n;
	}

	public String getName(){
		return name;
	}

	//设置属性值
	public void setLegs(int l){
		if(l > 0 && l % 2 == 0){
			legs = l;
		}
	}

	//获取属性值
	public int getLegs(){
		return legs;
	}

}