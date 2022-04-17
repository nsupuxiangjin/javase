package com.pxj.example;

// 需求：定义一个方法，方法中计算1-n的和并返回。
public class Test1 {
    public static void main(String[] args) {
        int rs = sum(100);
        System.out.println(rs);
    }

    // 计算1-n的和并返回
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
