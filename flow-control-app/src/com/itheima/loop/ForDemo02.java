package com.itheima.loop;

public class ForDemo02 {
    public static void main(String[] args) {
        // 案例
        // 需求：求1-5之间的数据和，并把结果在控制台输出
        int sum = 0;
        for (int i = 1;i<=5;i++) {
            sum +=i;
            System.out.println("第"+ i + "次的结果是："+sum);
        }
        System.out.println("1-5之间的和是：" + sum);
    }
}
