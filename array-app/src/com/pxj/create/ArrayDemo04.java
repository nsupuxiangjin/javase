package com.pxj.create;

public class ArrayDemo04 {
    public static void main(String[] args) {
        // 目标：学会动态初始化数组的定义和使用
        double[] scores = new double[3]; // [0.0, 0.0, 0.0]
        // 赋值
        scores[0] = 99.5;
        System.out.println(scores[0]);

        System.out.println(scores[2]);
    }
}
