/*
��ϰһ
����һ��char���͵�26��Ԫ�ص����飬�ֱ� ����'A'-'Z����
ʹ��forѭ����������Ԫ�ز���ӡ������
��ʾ��char������������ 'A'+1 -> 'B'��'0'+1 -> '1��
��ϰ��
����һ��char���͵�36��Ԫ�ص����飬ǰ26��Ԫ�ط���'A'-'Z�� ��10��Ԫ�ط���'0'-'9����
ʹ��forѭ����������Ԫ�ز���ӡ������
*/
class ArrayExer1 {
	public static void main(String[] args) {

		char[] array = new char[36];

		/*array[0] = (char)('A' + 0);
		array[1] = (char)('A' + 1);
		array[2] = (char)('A' + 2);*/
		
		//Ϊ���鸳ֵ
		for(int i = 0; i < array.length; i++){
			if(i < 26){
				array[i] = (char)('A' + i);
			}else{
				array[i] = (char)('0' + i - 26);
			}
		}


		//��������
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
}
