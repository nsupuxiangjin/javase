package com.pxj.param;

// 需求：打印任意整型数组的内容
public class Test3 {
    public static void main(String[] args) {
        int[] arr = {12, 17, 23, 45};
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    System.out.print(arr[i]);
                    break;
                }
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
    }
}
