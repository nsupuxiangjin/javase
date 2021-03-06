package com.pxj.arraylist;

public class Student {
    private int number;
    private String name;
    private int age;
    private String stuClass;

    public Student(int number, String name, int age, String stuClass) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.stuClass = stuClass;
    }

    public Student() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }
}
