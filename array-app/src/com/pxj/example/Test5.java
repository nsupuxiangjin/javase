package com.pxj.example;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 4, 7, 8, 6, 5};
        for (int i = 0; i < arr.length - 1; i++) {
            // 内部循环每轮比较的次数，站位
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
