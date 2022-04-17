package com.pxj.param;

// 目标：理解Java的基本类型传递：值传递
public class MethodDemo01 {
    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println(a); // 10
    }

    public static void change(int a) {
        System.out.println(a); // 10
        a = 20;
        System.out.println(a); // 20
    }
}
