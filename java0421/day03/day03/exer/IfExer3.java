class IfExer3 {
	public static void main(String[] args) {
		/*int x = 4;
		int y = 1;
		if (x > 2) {
		       if (y > 2) 
				System.out.println(x + y);
				System.out.println("atguigu");
		} else
		       System.out.println("x is " + x);
		 */

		boolean b = true;
		//int a = 10;
                if(b = false)  //如果写成if(b=false)能编译通过吗？如果能，结果是？
			System.out.println("a");
               else if(b)
			System.out.println("b");
               else if(!b)
			System.out.println("c");
               else
			System.out.println("d");

	}
}
