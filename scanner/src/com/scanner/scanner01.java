package com.scanner;

// 导包
import java.util.Scanner;

public class scanner01 {
    public static void main(String[] args) {
        // 创建Scanner 对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        // 接受用户输入，使用相关方法
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("请输入工资");
        double sal = sc.nextDouble();
        System.out.println("名字"+ name+ "年龄"+ age+ "工资"+ sal);
    }
}
