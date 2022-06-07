package com.atguigu.team.domain;

/**
 * 设计师类
 * @author Hefei Li
 * 2020/5/18 11:23
 */
public class Designer extends Programmer {

    private double bonus;

    public Designer() {
    }

    public Designer(Integer id, String name, Integer age, Double salary, Equipment equpment, double bonus) {
        super(id, name, age, salary, equpment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getInfoForTeam(){
        return getInfo() + "\t设计师\t" + bonus;
    }

    @Override
    public String toString() {
        return getDetails() + "\t设计师\t" + getStatus() + "\t" + bonus + "\t\t\t" +  getEqupment();
    }
}
