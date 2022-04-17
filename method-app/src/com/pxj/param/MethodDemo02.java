package com.pxj.param;

// 目标：理解引用类型的参数传递机制：值传递（地址）
public class MethodDemo02 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println(arr);
        change(arr);
        System.out.println(arr[1]);
    }

    public static void change(int[] arr) {
        System.out.println(arr[1]);
        arr[1] = 200;
        System.out.println(arr[1]);
    }
}
