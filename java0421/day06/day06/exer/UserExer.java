/*
1. ��дһ�� User �࣬���� ID,  userName, password ��
   ����һ�� getDetails() ��������������Ϣ

2. ��дһ������ģ���½��������½�ɹ����� User ����
   ���򷵻� null�������ø÷���
*/
class  UserExer{
	public static void main(String[] args) {
		
		UserExer ue = new UserExer();

		User user = ue.login(123456, 123456);

		if(user == null){
			System.out.println("��¼ʧ��");
		}else{
			System.out.println(user.getDetails());
		}

	}

	public User login(int username, int password){
		if(username == 123456 && password == 123456){
			User user = new User();
			//ģ���ѯ���������
			user.id = 9527;
			user.userName = "admin";
			user.password = "123456";

			return user;
		}else{
			return null;
		}
	} 

}

class User{
	
	int id;
	String userName;
	String password;

	public String getDetails(){
		return id + "," + userName  + "," + password;
	}

}