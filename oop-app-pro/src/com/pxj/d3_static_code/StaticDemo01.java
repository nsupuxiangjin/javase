package com.pxj.d3_static_code;

public class StaticDemo01 {
    // 静态代码块
    static {
        System.out.println("------静态代码块触发------");
    }

    public static void main(String[] args) {
        System.out.println("------------main方法执行------------");
    }
}
