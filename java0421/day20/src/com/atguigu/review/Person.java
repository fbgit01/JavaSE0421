package com.atguigu.review;

import java.io.Serializable;

/**
 * @author Hefei Li
 * 2020/5/20 9:44
 */
public class Person implements Serializable {


    private static final long serialVersionUID = 3930269474933451944L;

    private String name;
    private Integer age;
    private Double weight;

    public Person() {
    }

    public Person(String name, Integer age, Double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
