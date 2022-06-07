package com.atguigu.review;

import java.util.List;

/**
 * @author Hefei Li
 * 2020/5/18 10:20
 */
public class DAOTest {

    public static void main(String[] args) {
        EmployeeDAO ed = new EmployeeDAO();
        ed.save("1", new Employee());
        Employee emp = ed.get("1");

        //
        UserDAO ud = new UserDAO();
        ud.save("101", new User());
        List<User> list = ud.list();
    }

}
