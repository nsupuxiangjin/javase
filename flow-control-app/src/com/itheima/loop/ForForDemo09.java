package com.itheima.loop;

public class ForForDemo09 {
    public static void main(String[] args) {
        // 需求：一周七天，每天要给老婆说3次 "我爱你~~~"
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("今天周" + i + "这是第" + j + "说：我爱你");
            }
            System.out.println("----------------");
        }
        /*
         * 控制台打印如下4行5列*
         * *****
         * *****
         * *****
         * *****
         * */
        for (int m = 1; m <= 4; m++) {
            for (int n = 1; n <= 5; n++) {
                System.out.print("*");
            }
            System.out.println(); // 打印一次换行
        }
        /*
         * 控制台打印如下
         * *
         * **
         * ***
         * */
        for (int x = 1; x <= 3; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
