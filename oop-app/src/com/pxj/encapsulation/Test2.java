package com.pxj.encapsulation;

// 目标：学习如何进行更好的封装
public class Test2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(300);
        System.out.println( s.getAge());
    }
}
