package com.pxj.create;
/*
* 目标：能够说出方法的优点：
*   1.可以提高代码的复用性
*   2.让程序的逻辑更加清晰。
* */

public class MethodDemo01 {
    public static void main(String[] args) {
        // 张工
        System.out.println(sum(1,2));
        // 徐工
        System.out.println(sum(1,5));
    }

    public static int sum(int a, int b) {
        return  a+b;
    }
}
