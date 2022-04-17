package com.itheima.loop;

import java.util.Scanner;

/*
* 死循环
* */
public class DeadForDemo08 {
    public static void main(String[] args) {
        // 目标：学会定义死循环
//        for (; ; ) {
//            System.out.println("我是一个死循环");
//        }
//
//        while(true){
//            System.out.println("我是一个死循环");
//        }

//        do{
//            System.out.println("我是一个死循环");
//        }while (true);

        // 密码验证
        // 需求：系统密码是520，请用户不断输入密码验证，验证不对密码错误，验证成功输出欢迎进入系统，并停止程序
        // 1.定义个正确的密码
        int sysPwd = 520;
        // 2.定义死循环让用户不断输入密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入登陆密码");
        while(true) {
            int inputPwd = sc.nextInt();
            if (inputPwd == sysPwd) {
                System.out.println("欢迎进入系统");
                break; // 立即结束当前所在循环执行
            } else {
                System.out.println("密码错误，请再次输入");
            }
        }
    }
}
