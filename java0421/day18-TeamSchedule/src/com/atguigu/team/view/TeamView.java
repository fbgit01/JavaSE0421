package com.atguigu.team.view;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamException;
import com.atguigu.team.service.TeamService;

/**
 * 用于与用于进行交互
 * @author Hefei Li
 * 2020/5/18 15:51
 */
public class TeamView {

    private NameListService listSvc = new NameListService();
    private TeamService teamSvc = new TeamService();

    public void enterMainMenu(){
        boolean loopFlag = true;

        char key = 0;
        do{
            if(key != '1') listAllEmployees();
            System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
            key = TSUtility.readMenuSelection();

            switch(key){
                case '1':
                    //团队列表
                    teamList();
                    break;
                case '2':
                    //添加团队成员
                    addMember();
                    break;
                case '3':
                    //删除团队成员
                    deleteMember();
                    break;
                case '4':
                    //退出
                    System.out.print("确认是否退出(Y/N):");
                    char yn = TSUtility.readConfirmSelection();
                    if(yn == 'Y')
                        loopFlag = false;
                    break;
            }

        }while(loopFlag);
    }

    /**
     * 获取当前公司有所有员工的列表
     */
    private void listAllEmployees(){
        System.out.println("\n-------------------------------开发团队调度软件--------------------------------\n");
        Employee[] employees = listSvc.getAllEmployees();

        if(employees.length == 0){
            System.out.println("公司没有员工！");
        }else{
            System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("-------------------------------------------------------------------------------");
    }

    /**
     * 开发团队成员列表
     */
    private void teamList(){
        System.out.println("\n--------------------团队成员列表---------------------\n");
        Programmer[] team = teamSvc.getTeam();

        if(team.length == 0){
            System.out.println("开发团队目前没有成员！");
        }else{
            System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
        }

        for (int i = 0; i < team.length; i++) {
            System.out.println(team[i].getInfoForTeam());
        }

        System.out.println("-----------------------------------------------------");
    }

    /**
     * 添加成员
     */
    private void addMember(){
        System.out.println("\n---------------------添加成员---------------------");
        System.out.print("请输入要添加的员工ID：");
        int id = TSUtility.readInt();

        try {
            Employee emp = listSvc.getEmployee(id);
            teamSvc.addMember(emp);
            System.out.println("添加成功！");
        } catch (TeamException e) {
            System.out.println("添加失败，原因：" + e.getMessage());
        }

        TSUtility.readReturn();
    }

    /**
     * 删除团队成员
     */
    private void deleteMember(){
        System.out.println("\n---------------------删除成员---------------------");
        System.out.print("请输入要删除员工的TID：");
        int tid = TSUtility.readInt();

        System.out.print("确认是否删除(Y/N):");
        char yn = TSUtility.readConfirmSelection();

        if(yn == 'N'){
            return;
        }

        try{
            teamSvc.removeMember(tid);
            System.out.println("删除成功！");
        }catch(TeamException e){
            System.out.println("删除失败，原因：" + e.getMessage());
        }

        TSUtility.readReturn();
    }

    /**
     * 程序入口
     * @param args
     */
    public static void main(String[] args) {
        TeamView tv = new TeamView();
        tv.enterMainMenu();
    }
}
