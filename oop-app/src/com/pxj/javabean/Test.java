package com.pxj.javabean;

// 目标： 记住JavaBean的书写要求
public class Test {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setName("小明");
        u1.setHeight(180.0);
        u1.setSalary(2000);
        System.out.println(u1.getName());
        System.out.println(u1.getHeight());
        System.out.println(u1.getSalary());
    }
}
