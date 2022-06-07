package com.atguigu.team.domain;

/**
 * @author Hefei Li
 * 2020/5/18 11:14
 */
public class PC implements Equipment{

    private String model;
    private String display;

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + display;
    }

    @Override
    public String toString() {
        return model + "(" + display + ")";
    }
}
