package com.pxj.demo;

import java.util.Scanner;

/*
 * 需求：
 * 机票的价格按照淡季旺季、头等舱和经济舱收费、输入机票的原价、月份和头等舱或经济舱。
 * 机票最终优惠价格的计算方案如下：
 * 旺季（5、6、7、8、9、10）头等舱9折，经济舱8.5折，淡季（11、12、1、2、3、4）头等仓7折，经济舱6.5折
 * */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入机票原价：");
        double oPrice = sc.nextDouble();
        System.out.print("请输入购买月份(1-12)：");
        int month = sc.nextInt();
        System.out.print("请输入机票类型(1:头等舱，2:经济舱)：");
        int type = sc.nextInt();
        double nPrice = sumPrice(oPrice, month, type);
        System.out.println("优惠后的机票价格是：" + nPrice);

    }

    // 计算机票优惠
    public static double sumPrice(double oPrice, int month, int type) {
        if (month <= 10 && month >= 5) {
            switch (type) {
                case 1:
                    oPrice *= 0.9;
                    break;
                case 2:
                    oPrice *= 0.85;
                    break;
                default:
                    System.out.println("输入的月份有误");
            }
        } else if ((month >= 1 && month <= 4) || (month == 12) || (month == 11)) {
            switch (type) {
                case 1:
                    oPrice *= 0.7;
                    break;
                case 2:
                    oPrice *= 0.65;
                    break;
                default:
                    System.out.println("输入的仓位有问题");
                    oPrice = -1;
            }
        } else {
            System.out.println("月份输入有误");
            oPrice = -1;
        }
        return oPrice;
    }
}
