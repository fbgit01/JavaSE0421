/*
�������̿�����䣺
break : ���ڽ�������ǰ��ѭ���������� switch-case ��䣬���ڽ�����ǰ switch-case
continue : ���ڽ��������Ρ�ѭ��
*/
class BreakContinueTest {
	public static void main(String[] args) {
		/*for(int i = 0; i <= 10; i++){
			if(i == 3){
				System.out.println("---" + i);
				continue;
			}

			System.out.println(i);
		}*/
		
		//break �� continue ֧�ֽ�����ǩָ�����ǲ�ѭ��
		/*abc:for(int i = 0; i <= 10; i++){
			for(int j = 0; j <= 10; j++){
				if(j == 3){
					System.out.println("---" + j);

					continue abc;
				}

				System.out.println(j);

			}
		}*/

		/*label:{

			for(int i = 0; i <= 10; i++){
				for(int j = 0; j <= 10; j++){
					if(j == 3){
						System.out.println("---" + j);

						continue label; //break ���Խ��������ķ�ʽ��continue ��֧�ֽ��������ķ�ʽ
					}

					System.out.println(j);

				}
			}

			System.out.println("HelloBreak");

		}*/

		//����ѭ��
		/*for(;;){
			System.out.println("HelloWorld!");
		}*/

		while(true){
			System.out.println("HelloWorld!");
		}

	}
}
