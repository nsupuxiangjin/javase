package com.pxj.example;

// 需求判断奇数偶数
public class Test2 {
    public static void main(String[] args) {
        fn(3);
    }

    public static void fn(int num) {
        if (num % 2 == 0) {
            System.out.println("该整数是偶数");
        } else {
            System.out.println("该整数是奇数");
        }
    }
}
