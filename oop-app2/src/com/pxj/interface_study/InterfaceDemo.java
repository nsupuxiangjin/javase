package com.pxj.interface_study;

// 声明抽象接口:t体现一种规范，规范一定是公开的。
public interface InterfaceDemo {
    // 目标：接口中成分特点：jdk8之前接口中只能有抽象方法和常量。

    // 常量
    // 由于接口体现规范思想，规范默认是公开的，所以代码层面，public static final 可以省略不写。
    // public static final String PHONE_NAME = "小米";
    String PHONE_NAME = "小米";

    // 抽象方法
    // 由于接口体现规范思想，规范默认是公开的，所以代码层面，public abstract 可以省略不写。
    // public abstract void run();
    void run();
}
