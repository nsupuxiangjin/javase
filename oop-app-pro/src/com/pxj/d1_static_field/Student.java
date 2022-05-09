package com.pxj.d1_static_field;

public class Student {
    private String name;

    // 静态成员方法：有static修饰归属于类，可以被共享访问
    public static int getMat(int age1, int age2) {
        return age1 > age2 ? age1 : age2;
    }

    // 实例方法
    public void study() {
        System.out.println(name + "好好学习,天天向上");
    }

    public static void main(String[] args) {
        // 1、类名.静态成员方法
        System.out.println(Student.getMat(1, 2));

        // 2、对象.实例方法
        Student s = new Student();
        s.name = "小花";
        s.study();
    }
}
