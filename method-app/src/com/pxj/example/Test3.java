package com.pxj.example;

// 需求：数组求最大值用方法实现
public class Test3 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8};
        int max = getArrayMaxData(arr);
        System.out.println("最大值" + max);
    }

    public static int getArrayMaxData(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
