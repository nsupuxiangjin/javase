package com.pxj.param;

// 需求：设计一个方法可以接受整型数组，和要查询的元素值;
// 最终返回元素在该数组中的索引，如果数组中不存在该元素就返回-1
public class Test4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 11, 15, 14, 5};
        int arrayIndex = findArrayIndex(arr, 6);
        System.out.println(arrayIndex);
    }

    public static int findArrayIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }
}
