package com.atguigu.java;

public class PassObject {
	
	public static void main(String[] args) {
		PassObject po = new PassObject();
		
		Circle c = new Circle();
		int times = 5;
		//po.printAreas(new Circle(), 5);
		po.printAreas(c, times);
		
	}
	
	
	public void printAreas(Circle c, int times){//Circle c = new Circle();
		System.out.println("Radius\t\tArea");
		
		int i = 1;
		for (; i <= times ; i++) {
			c.setRadius(i);
			
			System.out.println(c.getRadius() + "\t\t" + c.findArea());
		}
		
		c.setRadius(i);
		
		System.out.println(" now radius is:" + c.getRadius());
		
	}

}
