package com.itheima.random;

import java.util.Random;

public class RandomDemo01 {
    public static void main(String[] args) {
        // 目标：学会使用java提供的随机数类Random
        // 1.导包
        // 2.创建随机数
        Random r = new Random();
        // 3.调用nextInt功能，可以返回一个整型的随机数
        int data = r.nextInt(10); // 0 - 9 不含10的（包前不包后）
        System.out.println(data);

        System.out.println("------------");

        // 生成1-10之间的随机数
        // 1 - 10 ===> -1 ===>(0 - 9) + 1
        int num1 = r.nextInt(10) + 1;

        // 生成3-17之间的随机数
        // 3 - 17 ===> -3 ===>(0 - 14) + 1
        int num2 = r.nextInt(15) + 3;

        // 生成65-91之间的随机数
        // 65 - 91 ===> -65 ===>(0 - 26) + 1
        // 91-65 = 取0-26之间的数
        // + 65
        int num3 = r.nextInt(27) + 65;

        // 总结：取 min - max 之间的随机数
        // next((max-min)+1) + min
    }
}
