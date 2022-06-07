package com.atguigu.team.domain;

/**
 * 架构师类
 * @author Hefei Li
 * 2020/5/18 11:24
 */
public class Architect extends Designer{

    private int stock;

    public Architect() {
    }

    public Architect(Integer id, String name, Integer age, Double salary, Equipment equpment, double bonus, int stock) {
        super(id, name, age, salary, equpment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getInfoForTeam(){
        return getInfo() + "\t架构师\t" + getBonus() + "\t" + stock;
    }

    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" + stock + "\t" + getEqupment();
    }
}
