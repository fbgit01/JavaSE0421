/*
main������ʹ��double��������var1��var2������Ȼ����var2����var1��var2֮�̡�
 �����ַ�������str����str���ӵ���ʽ��ʾ�������㲢��ӡ��������
*/
class VariableExer1 {
	public static void main(String[] args) {
		/*double var1 = 15.6;
		double var2 = 22.22;*/

		double var1 = 15.6, var2 = 22.22;

		var2 = var1 / var2;

		String str = "var1 / var2 = " + var2;

		System.out.println(str);
	}
}
