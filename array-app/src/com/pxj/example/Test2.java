package com.pxj.example;

public class Test2 {
    public static void main(String[] args) {
        // 目标：数组求最值
        int[] arr = {10,20,34,24,18,50,65,70};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("数组的最大值是："+ max);
    }
}
