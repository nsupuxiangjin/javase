package com.pxj.example;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        // 需求：5个1-20之间的随机数，让用户猜测，猜中提示猜中，
        // 还有输出该数据在数组中第一次出现的索引并打印数组的内容出来
        // 没有猜中继续

        // 1、定义一个动态初始化的数组存放5个随机的1-20之间的数据
        int [] arr = new int[5];
        Random r = new Random();
        // 2、动态生成5个1-20之间的随机数并存入数组中
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(20)+1;
        }
        // 3、使用死循环让用户进行猜测
        Scanner sc = new Scanner(System.in);
        OUT:
        while (true) {
            System.out.print("请输入1-20数字:");
            int input = sc.nextInt();
            // 4、遍历数组中的每个数据,看是否有数据与猜测的数据相同，并提示
            for (int i = 0; i < arr.length; i++) {
                if(input==arr[i]){
                    System.out.println("恭喜猜中！出现的索引是："+ i);
                    break OUT;
                }
            }
            System.out.println("猜错了，请继续猜！");
        }
        // 5、输出全部数据
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "\t");
        }
    }
}
