package com.itheima.loop;

public class ForTest03 {
    public static void main(String[] args) {
        // 案例
        // 需求：求1-10之间的奇数的和，并把结果在控制台输出
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("1-10之间的奇数是" + i);
                sum += i;
            }
        }
        System.out.println("1-10之间的奇数和是：" + sum);

        System.out.println("--------------------");

        int sum1 = 0;
        for (int i = 1; i <= 10; i += 2) {
            sum1 += i;
        }
        System.out.println("1-10之间奇数和是：" + sum1);
    }
}
