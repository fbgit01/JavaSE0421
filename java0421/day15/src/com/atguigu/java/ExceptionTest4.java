package com.atguigu.java;

public class ExceptionTest4 {

    public static void main(String[] args) {


        try {
            login("admin", "156");
        } catch (UsernamePassowordErrorException e) {
            e.printStackTrace();
            e.getMessage();
        }


    }

    //模拟用户登录
    public static void login(String username, String password) throws UsernamePassowordErrorException{
        if("admin".equals(username) && "123456".equals(password)){
            System.out.println("登录成功！");
            return;
        }

        throw new UsernamePassowordErrorException("用户名或密码错误！");
    }

}
