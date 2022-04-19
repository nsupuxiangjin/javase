package com.pxj.string;

import java.util.Scanner;

public class StringEqualsDemo04 {
    public static void main(String[] args) {
        // 1、正确的登录名和密码
        String okName = "pxj";
        String okPassword = "123456";

        // 2、请您输入登录名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("登陆名称：");
        String name = sc.next();
        System.out.println("登陆密码：");
        String password = sc.next();

        // 3、判断用户输入的登录名和密码与正确内容是否正确 equals()
        if (name.equals(okName) && password.equals(okPassword)) {
            System.out.println("登陆成功！");
        } else {
            System.out.println("用户名或密码错误！");
        }
        // 4、忽略大小写比较内容的API:一般用于比较验证码 equalsIgnoreCase()

    }
}
