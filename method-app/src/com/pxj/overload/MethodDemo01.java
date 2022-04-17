package com.pxj.overload;

// 目标:识别方法重载的形式。并理解器调用流程，最后需要知道使用方法重载的好处。
public class MethodDemo01 {
    public static void main(String[] args) {
        fire();
        fire("美国");
        fire("美国", 20);
    }

    // 默认就是发射一枚导弹
    public static void fire() {
        System.out.println("发射一枚导弹");
    }

    // 给指定地区发射一枚导弹
    public static void fire(String location) {
        System.out.println("发射一枚武器给" + location);
    }

    // 给指定地区发射多枚导弹
    public static void fire(String location, int number) {
        System.out.println("发射" + number + "枚武器给" + location);
    }
}
