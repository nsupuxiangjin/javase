package com.itheima.loop;

public class ForTest04 {
    public static void main(String[] args) {
        // 案例 水仙花数
        // 需求：在控制台输出所有的“水仙花数”，水仙花数满足以下2个条件：
        // 1.水仙花数是一个三位数
        // 2.水仙花数的个位数、十位数、百位数的数字立方和等于原数
        // 分析：
        // 1.定义一个for循环从100-999
        // 2.每次访问到数据后，提取该数据的各位、十位、百位数字
        // System.out.println(num%10); // 个位
        // System.out.println(num/10%10); // 十位
        // System.out.println(num/100);  // 百位
        // 3.计算
        for (int i = 100; i <= 999; i++) {
            int oneLocation = i % 10;
            int tenLocation = i / 10 % 10;
            int hundredLocation = i / 100;
            if (oneLocation * oneLocation * oneLocation + tenLocation * tenLocation * tenLocation + hundredLocation * hundredLocation * hundredLocation == i) {
                System.out.println(i);
            }
        }

    }
}
