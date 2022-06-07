/*
2.定义三个重载方法max()，第一个方法求两个int值中的最大值，
第二个方法求两个double值中的最大值，
第三个方法求三个double值中的最大值，并分别调用三个方法。
*/
class MethodExer3 {
	public static void main(String[] args) {
		/*int m = max(10, 20);
		System.out.println(m);*/

		double m = max(15.6, 22.22, 55.55);
		System.out.println(m);
	}

	public static int max(int a, int b){
		System.out.println("两个int值中的最大值");
		return a > b ? a : b;
	}

	public static double max(double d1, double d2){
		return d1 > d2 ? d1 : d2;
	}

	public static double max(double d1, double d2, double d3){
		/*double m = d1 > d2 ? d1 : d2;
		m = m > d3 ? m : d3;*/

		double m = max(d1, d2);
		m = max(m, d3);

		return m;
	}
}
