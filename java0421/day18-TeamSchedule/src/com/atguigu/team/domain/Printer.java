package com.atguigu.team.domain;

/**
 * @author Hefei Li
 * 2020/5/18 11:18
 */
public class Printer implements Equipment{

    private String type;
    private String name;

    public Printer() {
    }

    public Printer(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return type + name;
    }

    @Override
    public String toString() {
        return name + "(" + type + ")";
    }
}
