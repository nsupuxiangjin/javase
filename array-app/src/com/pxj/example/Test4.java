package com.pxj.example;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        // 需求：随机排名
        // 公司有5名人员进行汇报，现在采取随机排名方式进行汇报
        // 先一次录入5名员工工号，然后展示出一组随机排名顺序
        // 1、动态初始化一个数组，存储5个工号
        int[] codes = new int[5];
        Scanner sc = new Scanner(System.in);
        // 2、录入员工工号
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个员工工号");
            codes[i] = sc.nextInt();
        }
        // 3、遍历交换值,使用随机索引打乱
        Random r = new Random();
        for (int i = 0; i < codes.length; i++) {
            int index = r.nextInt(codes.length);
            // 顶一个临时变量存储index位置处的值
            int temp = codes[index];
            codes[index] = codes[i];
            codes[i] = temp;
        }
        // 4、遍历数组元素
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + "\t");
        }
    }
}
