package com.pxj.create;

// 目标：学习方法的完整定义格式，并理解其调用和执行流程
public class MethodDemo02 {
    public static void main(String[] args) {
        // ② 调用
        int rs = add(1, 2);
        System.out.println("和是：" + rs);
    }

    // ① 定义
    public static int add(int a, int b) {
        return a + b;
    }
}
