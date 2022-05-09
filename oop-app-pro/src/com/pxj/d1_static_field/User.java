package com.pxj.d1_static_field;

public class User {
    // 在线人数，静态成员变量
    public static int onlineNumber = 161;

    // 实例成员变量：必须使用 对象名.访问
    private String name;
    private int age;

    public static void main(String[] args) {
        // 目标：理解static修饰成员变量的作用和访问特点

        // 静态成员变量访问
        System.out.println(User.onlineNumber);

        // 实例成员变量访问
        User u1 = new User();
        u1.name = "张三";
        u1.age = 21;
    }
}
