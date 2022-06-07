package com.atguigu.team.test;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamException;
import org.junit.Test;

/**
 * @author Hefei Li
 * 2020/5/18 14:27
 */
public class NameListServiceTest {

    public NameListService nls = new NameListService();

    @Test
    public void testGetAllEmployees(){
        Employee[] employees = nls.getAllEmployees();

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Test
    public void testGetEmployee(){
        try {
            Employee emp = nls.getEmployee(100);
            System.out.println(emp);
        } catch (TeamException e) {
            e.printStackTrace();
        }
    }
}
