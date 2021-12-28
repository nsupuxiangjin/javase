package com.logical;
/*
* 演示逻辑运算符使用 &&  &
* */
public class Logical01 {
    public static void main(String[] args) {
        // &&  和  &
        // 短路与
        int age = 50;
        if (age>20 && age<90) {
            System.out.println("ok100");
        }
        // 逻辑与
        if (age>20 & age<90) {
            System.out.println("ok100");
        }
        // 区别
        int a = 5;
        int b = 6;
        if (a>1 && b++>5) {
            System.out.println("ok");
        }
        System.out.println(b);  // 6

        if (a>1 & b++>5) {
            System.out.println("ok");
        }
        System.out.println(b); // 7
    }
}
