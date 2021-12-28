package com.logical;
/*
 * 演示逻辑运算符使用 ||  |
 * */
public class Logical02 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        // ||
        if (a>6 || b>5) {
            System.out.println("短路或ok");
        }
        // |
        if (a>6 | b>5) {
            System.out.println("逻辑或ok");
        }
        // 区别
        if (a>4 || b++ < 10) {
            System.out.println("ok");
        }
        System.out.println(b); // 6

        if (a>4 | b++ < 10) {
            System.out.println("ok");
        }
        System.out.println(b); // 7

    }
}
