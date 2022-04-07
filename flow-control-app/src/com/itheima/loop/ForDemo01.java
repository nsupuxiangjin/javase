package com.itheima.loop;

public class ForDemo01 {
    public static void main(String[] args) {
        // 目标学会for循环，并理解它的执行流程(啊啊啊)
        // 需求：输出3次HelloWorld
        for (int i = 0;i<3;i++) {
            System.out.println("HelloWorld");
        }
        System.out.println("--------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("HelloWorld");
        }
        System.out.println("--------------------------------");
        for (int i = 1; i < 5; i++) {
            System.out.println("HelloWorld");
        }
        System.out.println("--------------------------------");
        for (int i = 1; i <= 5; i++) {
            System.out.println("HelloWorld");
        }
        System.out.println("--------------------------------");
        for (int i = 1; i <= 5; i+=2) {
            System.out.println("HelloWorld");
        }
    }
}
