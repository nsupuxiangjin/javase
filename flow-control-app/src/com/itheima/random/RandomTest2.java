package com.itheima.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {
    public static void main(String[] args) {
        // 1.随机一个1-100的幸运号码，提示用户猜大了还是猜小了
        // 0-99
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num = r.nextInt(100) + 1;
        System.out.println("请输入猜测的数字：");
        while (true) {
            int inputNum = sc.nextInt();
            if (num == inputNum) {
                System.out.println("恭喜你猜对了~！");
                break;
            } else if (inputNum > num) {
                System.out.println("猜大了，请继续猜");
            } else if (inputNum < num) {
                System.out.println("猜小了，请继续猜");
            } else {
                System.out.println("输入的数据有误");
            }
        }
    }
}
