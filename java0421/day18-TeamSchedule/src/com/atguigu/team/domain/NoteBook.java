package com.atguigu.team.domain;

/**
 * @author Hefei Li
 * 2020/5/18 11:16
 */
public class NoteBook implements Equipment{

    private String model;
    private Double price;

    public NoteBook() {
    }

    public NoteBook(String model, Double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + price;
    }

    @Override
    public String toString() {
        return model + "(" + price + ")";
    }
}
