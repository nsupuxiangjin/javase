package com.ternary;

/*
 * 实现三个数的最大值
 * */
public class Exercise01 {
    public static void main(String[] args) {
        int n1 = 55;
        int n2 = 33;
        int n3 = 155;
        // 思路
        // 先得到n1和n2中的最大数，保存到max1
        // 然后求出max1 和 n3的最大数，保存到max2
        int max1 = n1 > n2 ? n1 : n2;
        int max2 = max1 > n3 ? max1 : n3;

        System.out.println("最大值是" + max2);
    }
}
