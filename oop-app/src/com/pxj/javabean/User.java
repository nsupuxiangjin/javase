package com.pxj.javabean;

public class User {
    // 1、成员变量建议使用private私有
    private String name;
    private double height;
    private double salary;

    // 3、有参无参构造器
    public User() {
    }

    public User(String name, double height, double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }
    // 2、提供成员变量的getter、setter方法
    // 快捷方式 alt+insert 右键->Generate->Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
