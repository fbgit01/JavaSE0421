/*
1. 编写一个 User 类，包含 ID,  userName, password ，
   包含一个 getDetails() 方法返回属性信息

2. 编写一个方法模拟登陆操作，登陆成功返回 User 对象，
   否则返回 null，并调用该方法
*/
class  UserExer{
	public static void main(String[] args) {
		
		UserExer ue = new UserExer();

		User user = ue.login(123456, 123456);

		if(user == null){
			System.out.println("登录失败");
		}else{
			System.out.println(user.getDetails());
		}

	}

	public User login(int username, int password){
		if(username == 123456 && password == 123456){
			User user = new User();
			//模拟查询后测试数据
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