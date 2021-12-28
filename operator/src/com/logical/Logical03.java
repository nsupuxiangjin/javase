package com.logical;
/*
 * 演示逻辑运算符使用 ! ^
 * */
public class Logical03 {
    public static void main(String[] args) {
        // 逻辑非 取反
        System.out.println(60>20); // ture
        System.out.println(!(60>20)); // false

        // 逻辑异或，当a和b不同时，则结果为ture,否则则为false
        boolean b = (10>1)^(3<5);
        System.out.println(b); // false
    }
}
