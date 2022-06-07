package com.atguigu.team.domain;

import com.atguigu.team.service.Status;

/**
 * 程序员类
 * @author Hefei Li
 * 2020/5/18 11:10
 */
public class Programmer extends Employee{

    private int memberId; //团队id
    private Status status = Status.FREE; //默认状态为：FREE
    private Equipment equpment;

    public Programmer() {
    }

    public Programmer(Integer id, String name, Integer age, Double salary, Equipment equpment) {
        super(id, name, age, salary);
        this.equpment = equpment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEqupment() {
        return equpment;
    }

    public void setEqupment(Equipment equpment) {
        this.equpment = equpment;
    }

    public String getInfo(){
        return memberId + "/" + getDetails();
    }

    public String getInfoForTeam(){
        return getInfo() + "\t程序员\t";
    }

    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" + status + "\t\t\t\t\t" + equpment;
    }
}
