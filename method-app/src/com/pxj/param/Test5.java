package com.pxj.param;

public class Test5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 34};
        int[] arr2 = {1, 2, 31};
        System.out.println(equal(arr1, arr2));
    }

    public static boolean equal(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
