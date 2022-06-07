package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;

/**
 * 开发团队管理类
 * @author Hefei Li
 * 2020/5/18 14:32
 */
public class TeamService {

    private static int counter = 1; //用于生成团队 id ，即 memberId
    private final int MAX_MEMBER = 5; //开发团队最大人员数
    private Programmer[] team = new Programmer[MAX_MEMBER]; //用于存放开发团队人员
    private int total = 0; //用于记录当前数组中有效元素的个数

    /**
     * 获取有效元素的开发团队成员数组
     * @return
     */
    public Programmer[] getTeam(){
        Programmer[] pros = new Programmer[total];

        for (int i = 0; i < total; i++) {
            pros[i] = team[i];
        }

        return pros;
    }

    /**
     * 添加成员到开发团队
     * @param e
     * @throws TeamException
     */
    public void addMember(Employee e) throws TeamException {
//      成员已满，无法添加
        if(total >= MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }

//      该成员不是开发人员，无法添加
        if(!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }

//      该员已是团队成员
//      该员正在休假，无法添加
        Programmer p = (Programmer)e;

        switch(p.getStatus()){
            case BUSY:
                throw new TeamException("该员已是团队成员");
            case VACATION:
                throw new TeamException("该员正在休假，无法添加");
        }

//      该员工已是团队成员
        for (int i = 0; i < total; i++) {
            if(team[i].getId() == p.getId()){
                throw new TeamException("该员工已是团队成员");
            }
        }

//      团队中只能有一名架构师
//      团队中只能有两名设计师
//      团队中只能有三名程序员
        int arcNum = 0, desNum = 0, proNum = 0;
        for (int i = 0; i < total; i++) {
            if(team[i] instanceof Architect){
                arcNum++;
            }else if(team[i] instanceof Designer){
                desNum++;
            }else if(team[i] instanceof Programmer){
                proNum++;
            }
        }

        if(p instanceof Architect){
            if(arcNum >= 1){
                throw new TeamException("团队中只能有一名架构师");
            }
        }else if(p instanceof Designer){
            if(desNum >= 2){
                throw new TeamException("团队中只能有两名设计师");
            }
        }else if(p instanceof Programmer){
            if(proNum >= 3) {
                throw new TeamException("团队中只能有三名程序员");
            }
        }

        //添加成员第一步
        p.setMemberId(counter++);

        //添加成员第二步
        p.setStatus(Status.BUSY);

        //添加成员第三步
        team[total++] = p;
    }

    /**
     * 根据团队id删除开发成员
     * @param memberId
     */
    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if(team[i].getMemberId() == memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        if(i == total){
            throw new TeamException("无法找到指定人员！");
        }

        //
        for (int j = i; j < total - 1; j++) {
            team[j] = team[j+1];
    }

        team[--total] = null;
    }
}
