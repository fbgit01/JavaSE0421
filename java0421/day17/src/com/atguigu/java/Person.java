package com.atguigu.java;

public class Person /*implements Comparable*/ {
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    //若两个对象的内容一样，生成的 hashCode 值也一样
    public int hashCode(){
        return name.hashCode() + age.hashCode() * 31;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                age.equals(person.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat(){
        System.out.println("吃饭");
    }

    /*@Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person p = (Person)o;

            if(this.age.equals(p.age)){
                return this.name.compareTo(p.name);
            }else{
                return -this.age.compareTo(p.age);
            }
        }

        return 0;
    }*/
}

